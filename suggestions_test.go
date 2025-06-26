package sqlite_test

import (
	"fmt"
	gen "selectDb/backend/parser/sqlite/gen"
	dbclient "selectDb/backend/src/dbclient"
	"strings"
	"testing"

	"github.com/antlr4-go/antlr/v4"
)

type ErrorListener struct {
	*antlr.DefaultErrorListener
	Errors []string
}

func (l *ErrorListener) SyntaxError(recognizer antlr.Recognizer, offendingSymbol interface{},
	line, column int, msg string, e antlr.RecognitionException) {
	l.Errors = append(l.Errors, fmt.Sprintf("line %d:%d %s", line, column, msg))
}

func runSuggestionListener(sql string, schema map[string][]string) *dbclient.SuggestionListener {
	cursor := 0
	cursor = strings.Index(sql, "<c>")
	if cursor != -1 {
		sql = strings.Replace(sql, "<c>", "", 1)
	}

	input := antlr.NewInputStream(sql)
	lexer := gen.NewSQLiteLexer(input)
	stream := antlr.NewCommonTokenStream(lexer, antlr.TokenDefaultChannel)
	parser := gen.NewSQLiteParser(stream)

	errorListener := &ErrorListener{}
	parser.RemoveErrorListeners() 
	parser.AddErrorListener(errorListener)
	
	tree := parser.Parse()

	fmt.Println("Parse tree:")
	fmt.Println(tree.ToStringTree(parser.RuleNames, parser))
	
	listener := dbclient.NewSuggestionListener(schema, stream.GetAllTokens(), cursor)
	
	antlr.ParseTreeWalkerDefault.Walk(listener, tree)
	
	return listener
}

type suggestionKey struct {
	Label      string
	InsertText string
}

func AssertSuggestionsMatch(t *testing.T, expected, actual []dbclient.Suggestion) {
	t.Helper()

	key := func(s dbclient.Suggestion) suggestionKey {
		return suggestionKey{s.Label, s.InsertText}
	}

	expectedSet := map[suggestionKey]bool{}
	actualSet := map[suggestionKey]bool{}

	for _, e := range expected {
		expectedSet[key(e)] = true
	}
	for _, a := range actual {
		actualSet[key(a)] = true
	}

	for k := range expectedSet {
		if !actualSet[k] {
			t.Errorf("Missing expected suggestion: %+v", k)
		}
	}
	for k := range actualSet {
		if !expectedSet[k] {
			t.Errorf("Unexpected suggestion: %+v", k)
		}
	}
}

func TestSuggestionListener(t *testing.T) {
	for _, tt := range suggestionListenerTests {
		t.Run(tt.name, func(t *testing.T) {
			listener := runSuggestionListener(tt.sql, tt.schema)
			suggestions := listener.GetSuggestions()
			AssertSuggestionsMatch(t, tt.expected, suggestions)
		})
	}
}

var suggestionListenerTests = []struct {
	name     string
	sql      string
	schema   map[string][]string
	expected []dbclient.Suggestion
}{
	// {
	// 	name: "FromTable",
	// 	sql: `SELECT * FROM <c>`,
	// 	schema: map[string][]string{
	// 		"users":     {"id", "name", "email"},
	// 		"documents": {"id", "name", "content"},
	// 	},
	// 	expected: []dbclient.Suggestion{
	// 		{Label: "users", Kind: 10, Detail: "users (schema)", InsertText: "users"},
	// 		{Label: "documents", Kind: 10, Detail: "documents (schema)", InsertText: "documents"},
	// 	},
	// },
	// {
	// 	name: "WhereColumn",
	// 	sql: `SELECT * FROM users WHERE <c>`,
	// 	schema: map[string][]string{
	// 		"users":     {"id", "name", "email"},
	// 		"documents": {"id", "name", "content"},
	// 	},
	// 	expected: []dbclient.Suggestion{
	// 		{Label: "users", Kind: 10, Detail: "users (schema)", InsertText: "users"},
	// 		{Label: "id", Kind: 10, Detail: "users.id (table)", InsertText: "id"},
	// 		{Label: "name", Kind: 10, Detail: "users.name (table)", InsertText: "name"},
	// 		{Label: "email", Kind: 10, Detail: "users.email (table)", InsertText: "email"},
	// 	},
	// },
	{
		name: "WhereAliasColumn",
		sql: `SELECT * FROM users AS u WHERE <c>`,
		schema: map[string][]string{
			"users":     {"id", "name", "email"},
			"documents": {"id", "name", "content"},
		},
		expected: []dbclient.Suggestion{
			{Label: "users", Kind: 10, Detail: "users (schema)", InsertText: "users"},
		},
	},
}
