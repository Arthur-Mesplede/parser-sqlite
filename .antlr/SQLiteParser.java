// Generated from /Users/arthur/Desktop/lab/selectDb/backend/parser/sqlite/SQLiteParser.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class SQLiteParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		SCOL=1, DOT=2, OPEN_PAR=3, CLOSE_PAR=4, COMMA=5, ASSIGN=6, STAR=7, PLUS=8, 
		MINUS=9, TILDE=10, PIPE2=11, DIV=12, MOD=13, LT2=14, GT2=15, AMP=16, PIPE=17, 
		LT=18, LT_EQ=19, GT=20, GT_EQ=21, EQ=22, NOT_EQ1=23, NOT_EQ2=24, ABORT_=25, 
		ACTION_=26, ADD_=27, AFTER_=28, ALL_=29, ALTER_=30, ANALYZE_=31, AND_=32, 
		AS_=33, ASC_=34, ATTACH_=35, AUTOINCREMENT_=36, BEFORE_=37, BEGIN_=38, 
		BETWEEN_=39, BY_=40, CASCADE_=41, CASE_=42, CAST_=43, CHECK_=44, COLLATE_=45, 
		COLUMN_=46, COMMIT_=47, CONFLICT_=48, CONSTRAINT_=49, CREATE_=50, CROSS_=51, 
		CURRENT_DATE_=52, CURRENT_TIME_=53, CURRENT_TIMESTAMP_=54, DATABASE_=55, 
		DEFAULT_=56, DEFERRABLE_=57, DEFERRED_=58, DELETE_=59, DESC_=60, DETACH_=61, 
		DISTINCT_=62, DROP_=63, EACH_=64, ELSE_=65, END_=66, ESCAPE_=67, EXCEPT_=68, 
		EXCLUSIVE_=69, EXISTS_=70, EXPLAIN_=71, FAIL_=72, FOR_=73, FOREIGN_=74, 
		FROM_=75, FULL_=76, GLOB_=77, GROUP_=78, HAVING_=79, IF_=80, IGNORE_=81, 
		IMMEDIATE_=82, IN_=83, INDEX_=84, INDEXED_=85, INITIALLY_=86, INNER_=87, 
		INSERT_=88, INSTEAD_=89, INTERSECT_=90, INTO_=91, IS_=92, ISNULL_=93, 
		JOIN_=94, KEY_=95, LEFT_=96, LIKE_=97, LIMIT_=98, MATCH_=99, NATURAL_=100, 
		NO_=101, NOT_=102, NOTNULL_=103, NULL_=104, OF_=105, OFFSET_=106, ON_=107, 
		OR_=108, ORDER_=109, OUTER_=110, PLAN_=111, PRAGMA_=112, PRIMARY_=113, 
		QUERY_=114, RAISE_=115, RECURSIVE_=116, REFERENCES_=117, REGEXP_=118, 
		REINDEX_=119, RELEASE_=120, RENAME_=121, REPLACE_=122, RESTRICT_=123, 
		RETURNING_=124, RIGHT_=125, ROLLBACK_=126, ROW_=127, ROWS_=128, SAVEPOINT_=129, 
		SELECT_=130, SET_=131, TABLE_=132, TEMP_=133, TEMPORARY_=134, THEN_=135, 
		TO_=136, TRANSACTION_=137, TRIGGER_=138, UNION_=139, UNIQUE_=140, UPDATE_=141, 
		USING_=142, VACUUM_=143, VALUES_=144, VIEW_=145, VIRTUAL_=146, WHEN_=147, 
		WHERE_=148, WITH_=149, WITHOUT_=150, FIRST_VALUE_=151, OVER_=152, PARTITION_=153, 
		RANGE_=154, PRECEDING_=155, UNBOUNDED_=156, CURRENT_=157, FOLLOWING_=158, 
		CUME_DIST_=159, DENSE_RANK_=160, LAG_=161, LAST_VALUE_=162, LEAD_=163, 
		NTH_VALUE_=164, NTILE_=165, PERCENT_RANK_=166, RANK_=167, ROW_NUMBER_=168, 
		GENERATED_=169, ALWAYS_=170, STORED_=171, TRUE_=172, FALSE_=173, WINDOW_=174, 
		NULLS_=175, FIRST_=176, LAST_=177, FILTER_=178, GROUPS_=179, EXCLUDE_=180, 
		TIES_=181, OTHERS_=182, DO_=183, NOTHING_=184, IDENTIFIER=185, NUMERIC_LITERAL=186, 
		BIND_PARAMETER=187, STRING_LITERAL=188, BLOB_LITERAL=189, SINGLE_LINE_COMMENT=190, 
		MULTILINE_COMMENT=191, SPACES=192, UNEXPECTED_CHAR=193;
	public static final int
		RULE_parse = 0, RULE_sql_stmt_list = 1, RULE_sql_stmt = 2, RULE_alter_table_stmt = 3, 
		RULE_analyze_stmt = 4, RULE_attach_stmt = 5, RULE_begin_stmt = 6, RULE_commit_stmt = 7, 
		RULE_rollback_stmt = 8, RULE_savepoint_stmt = 9, RULE_release_stmt = 10, 
		RULE_create_index_stmt = 11, RULE_indexed_column = 12, RULE_create_table_stmt = 13, 
		RULE_column_def = 14, RULE_type_name = 15, RULE_column_constraint = 16, 
		RULE_signed_number = 17, RULE_table_constraint = 18, RULE_foreign_key_clause = 19, 
		RULE_conflict_clause = 20, RULE_create_trigger_stmt = 21, RULE_create_view_stmt = 22, 
		RULE_create_virtual_table_stmt = 23, RULE_with_clause = 24, RULE_cte_table_name = 25, 
		RULE_recursive_cte = 26, RULE_common_table_expression = 27, RULE_delete_stmt = 28, 
		RULE_delete_stmt_limited = 29, RULE_detach_stmt = 30, RULE_drop_stmt = 31, 
		RULE_expr = 32, RULE_raise_function = 33, RULE_literal_value = 34, RULE_value_row = 35, 
		RULE_values_clause = 36, RULE_insert_stmt = 37, RULE_returning_clause = 38, 
		RULE_upsert_clause = 39, RULE_pragma_stmt = 40, RULE_pragma_value = 41, 
		RULE_reindex_stmt = 42, RULE_select_stmt = 43, RULE_join_clause = 44, 
		RULE_select_core = 45, RULE_factored_select_stmt = 46, RULE_simple_select_stmt = 47, 
		RULE_compound_select_stmt = 48, RULE_table_or_subquery = 49, RULE_result_column = 50, 
		RULE_join_operator = 51, RULE_join_constraint = 52, RULE_compound_operator = 53, 
		RULE_update_stmt = 54, RULE_column_name_list = 55, RULE_update_stmt_limited = 56, 
		RULE_qualified_table_name = 57, RULE_vacuum_stmt = 58, RULE_filter_clause = 59, 
		RULE_window_defn = 60, RULE_over_clause = 61, RULE_frame_spec = 62, RULE_frame_clause = 63, 
		RULE_simple_function_invocation = 64, RULE_aggregate_function_invocation = 65, 
		RULE_window_function_invocation = 66, RULE_common_table_stmt = 67, RULE_order_by_stmt = 68, 
		RULE_limit_stmt = 69, RULE_ordering_term = 70, RULE_asc_desc = 71, RULE_frame_left = 72, 
		RULE_frame_right = 73, RULE_frame_single = 74, RULE_window_function = 75, 
		RULE_offset = 76, RULE_default_value = 77, RULE_partition_by = 78, RULE_order_by_expr = 79, 
		RULE_order_by_expr_asc_desc = 80, RULE_expr_asc_desc = 81, RULE_initial_select = 82, 
		RULE_recursive_select = 83, RULE_unary_operator = 84, RULE_error_message = 85, 
		RULE_module_argument = 86, RULE_column_alias = 87, RULE_keyword = 88, 
		RULE_name = 89, RULE_function_name = 90, RULE_schema_name = 91, RULE_table_name = 92, 
		RULE_table_or_index_name = 93, RULE_column_name = 94, RULE_collation_name = 95, 
		RULE_foreign_table = 96, RULE_index_name = 97, RULE_trigger_name = 98, 
		RULE_view_name = 99, RULE_module_name = 100, RULE_pragma_name = 101, RULE_savepoint_name = 102, 
		RULE_transaction_name = 103, RULE_window_name = 104, RULE_alias = 105, 
		RULE_filename = 106, RULE_table_alias = 107, RULE_base_window_name = 108, 
		RULE_simple_func = 109, RULE_aggregate_func = 110, RULE_table_function_name = 111, 
		RULE_any_name = 112;
	private static String[] makeRuleNames() {
		return new String[] {
			"parse", "sql_stmt_list", "sql_stmt", "alter_table_stmt", "analyze_stmt", 
			"attach_stmt", "begin_stmt", "commit_stmt", "rollback_stmt", "savepoint_stmt", 
			"release_stmt", "create_index_stmt", "indexed_column", "create_table_stmt", 
			"column_def", "type_name", "column_constraint", "signed_number", "table_constraint", 
			"foreign_key_clause", "conflict_clause", "create_trigger_stmt", "create_view_stmt", 
			"create_virtual_table_stmt", "with_clause", "cte_table_name", "recursive_cte", 
			"common_table_expression", "delete_stmt", "delete_stmt_limited", "detach_stmt", 
			"drop_stmt", "expr", "raise_function", "literal_value", "value_row", 
			"values_clause", "insert_stmt", "returning_clause", "upsert_clause", 
			"pragma_stmt", "pragma_value", "reindex_stmt", "select_stmt", "join_clause", 
			"select_core", "factored_select_stmt", "simple_select_stmt", "compound_select_stmt", 
			"table_or_subquery", "result_column", "join_operator", "join_constraint", 
			"compound_operator", "update_stmt", "column_name_list", "update_stmt_limited", 
			"qualified_table_name", "vacuum_stmt", "filter_clause", "window_defn", 
			"over_clause", "frame_spec", "frame_clause", "simple_function_invocation", 
			"aggregate_function_invocation", "window_function_invocation", "common_table_stmt", 
			"order_by_stmt", "limit_stmt", "ordering_term", "asc_desc", "frame_left", 
			"frame_right", "frame_single", "window_function", "offset", "default_value", 
			"partition_by", "order_by_expr", "order_by_expr_asc_desc", "expr_asc_desc", 
			"initial_select", "recursive_select", "unary_operator", "error_message", 
			"module_argument", "column_alias", "keyword", "name", "function_name", 
			"schema_name", "table_name", "table_or_index_name", "column_name", "collation_name", 
			"foreign_table", "index_name", "trigger_name", "view_name", "module_name", 
			"pragma_name", "savepoint_name", "transaction_name", "window_name", "alias", 
			"filename", "table_alias", "base_window_name", "simple_func", "aggregate_func", 
			"table_function_name", "any_name"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'.'", "'('", "')'", "','", "'='", "'*'", "'+'", "'-'", 
			"'~'", "'||'", "'/'", "'%'", "'<<'", "'>>'", "'&'", "'|'", "'<'", "'<='", 
			"'>'", "'>='", "'=='", "'!='", "'<>'", "'ABORT'", "'ACTION'", "'ADD'", 
			"'AFTER'", "'ALL'", "'ALTER'", "'ANALYZE'", "'AND'", "'AS'", "'ASC'", 
			"'ATTACH'", "'AUTOINCREMENT'", "'BEFORE'", "'BEGIN'", "'BETWEEN'", "'BY'", 
			"'CASCADE'", "'CASE'", "'CAST'", "'CHECK'", "'COLLATE'", "'COLUMN'", 
			"'COMMIT'", "'CONFLICT'", "'CONSTRAINT'", "'CREATE'", "'CROSS'", "'CURRENT_DATE'", 
			"'CURRENT_TIME'", "'CURRENT_TIMESTAMP'", "'DATABASE'", "'DEFAULT'", "'DEFERRABLE'", 
			"'DEFERRED'", "'DELETE'", "'DESC'", "'DETACH'", "'DISTINCT'", "'DROP'", 
			"'EACH'", "'ELSE'", "'END'", "'ESCAPE'", "'EXCEPT'", "'EXCLUSIVE'", "'EXISTS'", 
			"'EXPLAIN'", "'FAIL'", "'FOR'", "'FOREIGN'", "'FROM'", "'FULL'", "'GLOB'", 
			"'GROUP'", "'HAVING'", "'IF'", "'IGNORE'", "'IMMEDIATE'", "'IN'", "'INDEX'", 
			"'INDEXED'", "'INITIALLY'", "'INNER'", "'INSERT'", "'INSTEAD'", "'INTERSECT'", 
			"'INTO'", "'IS'", "'ISNULL'", "'JOIN'", "'KEY'", "'LEFT'", "'LIKE'", 
			"'LIMIT'", "'MATCH'", "'NATURAL'", "'NO'", "'NOT'", "'NOTNULL'", "'NULL'", 
			"'OF'", "'OFFSET'", "'ON'", "'OR'", "'ORDER'", "'OUTER'", "'PLAN'", "'PRAGMA'", 
			"'PRIMARY'", "'QUERY'", "'RAISE'", "'RECURSIVE'", "'REFERENCES'", "'REGEXP'", 
			"'REINDEX'", "'RELEASE'", "'RENAME'", "'REPLACE'", "'RESTRICT'", "'RETURNING'", 
			"'RIGHT'", "'ROLLBACK'", "'ROW'", "'ROWS'", "'SAVEPOINT'", "'SELECT'", 
			"'SET'", "'TABLE'", "'TEMP'", "'TEMPORARY'", "'THEN'", "'TO'", "'TRANSACTION'", 
			"'TRIGGER'", "'UNION'", "'UNIQUE'", "'UPDATE'", "'USING'", "'VACUUM'", 
			"'VALUES'", "'VIEW'", "'VIRTUAL'", "'WHEN'", "'WHERE'", "'WITH'", "'WITHOUT'", 
			"'FIRST_VALUE'", "'OVER'", "'PARTITION'", "'RANGE'", "'PRECEDING'", "'UNBOUNDED'", 
			"'CURRENT'", "'FOLLOWING'", "'CUME_DIST'", "'DENSE_RANK'", "'LAG'", "'LAST_VALUE'", 
			"'LEAD'", "'NTH_VALUE'", "'NTILE'", "'PERCENT_RANK'", "'RANK'", "'ROW_NUMBER'", 
			"'GENERATED'", "'ALWAYS'", "'STORED'", "'TRUE'", "'FALSE'", "'WINDOW'", 
			"'NULLS'", "'FIRST'", "'LAST'", "'FILTER'", "'GROUPS'", "'EXCLUDE'", 
			"'TIES'", "'OTHERS'", "'DO'", "'NOTHING'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "SCOL", "DOT", "OPEN_PAR", "CLOSE_PAR", "COMMA", "ASSIGN", "STAR", 
			"PLUS", "MINUS", "TILDE", "PIPE2", "DIV", "MOD", "LT2", "GT2", "AMP", 
			"PIPE", "LT", "LT_EQ", "GT", "GT_EQ", "EQ", "NOT_EQ1", "NOT_EQ2", "ABORT_", 
			"ACTION_", "ADD_", "AFTER_", "ALL_", "ALTER_", "ANALYZE_", "AND_", "AS_", 
			"ASC_", "ATTACH_", "AUTOINCREMENT_", "BEFORE_", "BEGIN_", "BETWEEN_", 
			"BY_", "CASCADE_", "CASE_", "CAST_", "CHECK_", "COLLATE_", "COLUMN_", 
			"COMMIT_", "CONFLICT_", "CONSTRAINT_", "CREATE_", "CROSS_", "CURRENT_DATE_", 
			"CURRENT_TIME_", "CURRENT_TIMESTAMP_", "DATABASE_", "DEFAULT_", "DEFERRABLE_", 
			"DEFERRED_", "DELETE_", "DESC_", "DETACH_", "DISTINCT_", "DROP_", "EACH_", 
			"ELSE_", "END_", "ESCAPE_", "EXCEPT_", "EXCLUSIVE_", "EXISTS_", "EXPLAIN_", 
			"FAIL_", "FOR_", "FOREIGN_", "FROM_", "FULL_", "GLOB_", "GROUP_", "HAVING_", 
			"IF_", "IGNORE_", "IMMEDIATE_", "IN_", "INDEX_", "INDEXED_", "INITIALLY_", 
			"INNER_", "INSERT_", "INSTEAD_", "INTERSECT_", "INTO_", "IS_", "ISNULL_", 
			"JOIN_", "KEY_", "LEFT_", "LIKE_", "LIMIT_", "MATCH_", "NATURAL_", "NO_", 
			"NOT_", "NOTNULL_", "NULL_", "OF_", "OFFSET_", "ON_", "OR_", "ORDER_", 
			"OUTER_", "PLAN_", "PRAGMA_", "PRIMARY_", "QUERY_", "RAISE_", "RECURSIVE_", 
			"REFERENCES_", "REGEXP_", "REINDEX_", "RELEASE_", "RENAME_", "REPLACE_", 
			"RESTRICT_", "RETURNING_", "RIGHT_", "ROLLBACK_", "ROW_", "ROWS_", "SAVEPOINT_", 
			"SELECT_", "SET_", "TABLE_", "TEMP_", "TEMPORARY_", "THEN_", "TO_", "TRANSACTION_", 
			"TRIGGER_", "UNION_", "UNIQUE_", "UPDATE_", "USING_", "VACUUM_", "VALUES_", 
			"VIEW_", "VIRTUAL_", "WHEN_", "WHERE_", "WITH_", "WITHOUT_", "FIRST_VALUE_", 
			"OVER_", "PARTITION_", "RANGE_", "PRECEDING_", "UNBOUNDED_", "CURRENT_", 
			"FOLLOWING_", "CUME_DIST_", "DENSE_RANK_", "LAG_", "LAST_VALUE_", "LEAD_", 
			"NTH_VALUE_", "NTILE_", "PERCENT_RANK_", "RANK_", "ROW_NUMBER_", "GENERATED_", 
			"ALWAYS_", "STORED_", "TRUE_", "FALSE_", "WINDOW_", "NULLS_", "FIRST_", 
			"LAST_", "FILTER_", "GROUPS_", "EXCLUDE_", "TIES_", "OTHERS_", "DO_", 
			"NOTHING_", "IDENTIFIER", "NUMERIC_LITERAL", "BIND_PARAMETER", "STRING_LITERAL", 
			"BLOB_LITERAL", "SINGLE_LINE_COMMENT", "MULTILINE_COMMENT", "SPACES", 
			"UNEXPECTED_CHAR"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "SQLiteParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SQLiteParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ParseContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(SQLiteParser.EOF, 0); }
		public List<Sql_stmt_listContext> sql_stmt_list() {
			return getRuleContexts(Sql_stmt_listContext.class);
		}
		public Sql_stmt_listContext sql_stmt_list(int i) {
			return getRuleContext(Sql_stmt_listContext.class,i);
		}
		public ParseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parse; }
	}

	public final ParseContext parse() throws RecognitionException {
		ParseContext _localctx = new ParseContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_parse);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(229);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -6339801325483589630L) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & -7971300971697405919L) != 0) || ((((_la - 130)) & ~0x3f) == 0 && ((1L << (_la - 130)) & 550913L) != 0)) {
				{
				{
				setState(226);
				sql_stmt_list();
				}
				}
				setState(231);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(232);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Sql_stmt_listContext extends ParserRuleContext {
		public List<Sql_stmtContext> sql_stmt() {
			return getRuleContexts(Sql_stmtContext.class);
		}
		public Sql_stmtContext sql_stmt(int i) {
			return getRuleContext(Sql_stmtContext.class,i);
		}
		public List<TerminalNode> SCOL() { return getTokens(SQLiteParser.SCOL); }
		public TerminalNode SCOL(int i) {
			return getToken(SQLiteParser.SCOL, i);
		}
		public Sql_stmt_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sql_stmt_list; }
	}

	public final Sql_stmt_listContext sql_stmt_list() throws RecognitionException {
		Sql_stmt_listContext _localctx = new Sql_stmt_listContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_sql_stmt_list);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(237);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SCOL) {
				{
				{
				setState(234);
				match(SCOL);
				}
				}
				setState(239);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(240);
			sql_stmt();
			setState(249);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(242); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(241);
						match(SCOL);
						}
						}
						setState(244); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==SCOL );
					setState(246);
					sql_stmt();
					}
					} 
				}
				setState(251);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			}
			setState(255);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(252);
					match(SCOL);
					}
					} 
				}
				setState(257);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Sql_stmtContext extends ParserRuleContext {
		public Alter_table_stmtContext alter_table_stmt() {
			return getRuleContext(Alter_table_stmtContext.class,0);
		}
		public Analyze_stmtContext analyze_stmt() {
			return getRuleContext(Analyze_stmtContext.class,0);
		}
		public Attach_stmtContext attach_stmt() {
			return getRuleContext(Attach_stmtContext.class,0);
		}
		public Begin_stmtContext begin_stmt() {
			return getRuleContext(Begin_stmtContext.class,0);
		}
		public Commit_stmtContext commit_stmt() {
			return getRuleContext(Commit_stmtContext.class,0);
		}
		public Create_index_stmtContext create_index_stmt() {
			return getRuleContext(Create_index_stmtContext.class,0);
		}
		public Create_table_stmtContext create_table_stmt() {
			return getRuleContext(Create_table_stmtContext.class,0);
		}
		public Create_trigger_stmtContext create_trigger_stmt() {
			return getRuleContext(Create_trigger_stmtContext.class,0);
		}
		public Create_view_stmtContext create_view_stmt() {
			return getRuleContext(Create_view_stmtContext.class,0);
		}
		public Create_virtual_table_stmtContext create_virtual_table_stmt() {
			return getRuleContext(Create_virtual_table_stmtContext.class,0);
		}
		public Delete_stmtContext delete_stmt() {
			return getRuleContext(Delete_stmtContext.class,0);
		}
		public Delete_stmt_limitedContext delete_stmt_limited() {
			return getRuleContext(Delete_stmt_limitedContext.class,0);
		}
		public Detach_stmtContext detach_stmt() {
			return getRuleContext(Detach_stmtContext.class,0);
		}
		public Drop_stmtContext drop_stmt() {
			return getRuleContext(Drop_stmtContext.class,0);
		}
		public Insert_stmtContext insert_stmt() {
			return getRuleContext(Insert_stmtContext.class,0);
		}
		public Pragma_stmtContext pragma_stmt() {
			return getRuleContext(Pragma_stmtContext.class,0);
		}
		public Reindex_stmtContext reindex_stmt() {
			return getRuleContext(Reindex_stmtContext.class,0);
		}
		public Release_stmtContext release_stmt() {
			return getRuleContext(Release_stmtContext.class,0);
		}
		public Rollback_stmtContext rollback_stmt() {
			return getRuleContext(Rollback_stmtContext.class,0);
		}
		public Savepoint_stmtContext savepoint_stmt() {
			return getRuleContext(Savepoint_stmtContext.class,0);
		}
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public Update_stmtContext update_stmt() {
			return getRuleContext(Update_stmtContext.class,0);
		}
		public Update_stmt_limitedContext update_stmt_limited() {
			return getRuleContext(Update_stmt_limitedContext.class,0);
		}
		public Vacuum_stmtContext vacuum_stmt() {
			return getRuleContext(Vacuum_stmtContext.class,0);
		}
		public TerminalNode EXPLAIN_() { return getToken(SQLiteParser.EXPLAIN_, 0); }
		public TerminalNode QUERY_() { return getToken(SQLiteParser.QUERY_, 0); }
		public TerminalNode PLAN_() { return getToken(SQLiteParser.PLAN_, 0); }
		public Sql_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sql_stmt; }
	}

	public final Sql_stmtContext sql_stmt() throws RecognitionException {
		Sql_stmtContext _localctx = new Sql_stmtContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_sql_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(263);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXPLAIN_) {
				{
				setState(258);
				match(EXPLAIN_);
				setState(261);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==QUERY_) {
					{
					setState(259);
					match(QUERY_);
					setState(260);
					match(PLAN_);
					}
				}

				}
			}

			setState(289);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(265);
				alter_table_stmt();
				}
				break;
			case 2:
				{
				setState(266);
				analyze_stmt();
				}
				break;
			case 3:
				{
				setState(267);
				attach_stmt();
				}
				break;
			case 4:
				{
				setState(268);
				begin_stmt();
				}
				break;
			case 5:
				{
				setState(269);
				commit_stmt();
				}
				break;
			case 6:
				{
				setState(270);
				create_index_stmt();
				}
				break;
			case 7:
				{
				setState(271);
				create_table_stmt();
				}
				break;
			case 8:
				{
				setState(272);
				create_trigger_stmt();
				}
				break;
			case 9:
				{
				setState(273);
				create_view_stmt();
				}
				break;
			case 10:
				{
				setState(274);
				create_virtual_table_stmt();
				}
				break;
			case 11:
				{
				setState(275);
				delete_stmt();
				}
				break;
			case 12:
				{
				setState(276);
				delete_stmt_limited();
				}
				break;
			case 13:
				{
				setState(277);
				detach_stmt();
				}
				break;
			case 14:
				{
				setState(278);
				drop_stmt();
				}
				break;
			case 15:
				{
				setState(279);
				insert_stmt();
				}
				break;
			case 16:
				{
				setState(280);
				pragma_stmt();
				}
				break;
			case 17:
				{
				setState(281);
				reindex_stmt();
				}
				break;
			case 18:
				{
				setState(282);
				release_stmt();
				}
				break;
			case 19:
				{
				setState(283);
				rollback_stmt();
				}
				break;
			case 20:
				{
				setState(284);
				savepoint_stmt();
				}
				break;
			case 21:
				{
				setState(285);
				select_stmt();
				}
				break;
			case 22:
				{
				setState(286);
				update_stmt();
				}
				break;
			case 23:
				{
				setState(287);
				update_stmt_limited();
				}
				break;
			case 24:
				{
				setState(288);
				vacuum_stmt();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Alter_table_stmtContext extends ParserRuleContext {
		public Table_nameContext new_table_name;
		public Column_nameContext old_column_name;
		public Column_nameContext new_column_name;
		public TerminalNode ALTER_() { return getToken(SQLiteParser.ALTER_, 0); }
		public TerminalNode TABLE_() { return getToken(SQLiteParser.TABLE_, 0); }
		public List<Table_nameContext> table_name() {
			return getRuleContexts(Table_nameContext.class);
		}
		public Table_nameContext table_name(int i) {
			return getRuleContext(Table_nameContext.class,i);
		}
		public TerminalNode RENAME_() { return getToken(SQLiteParser.RENAME_, 0); }
		public TerminalNode ADD_() { return getToken(SQLiteParser.ADD_, 0); }
		public Column_defContext column_def() {
			return getRuleContext(Column_defContext.class,0);
		}
		public TerminalNode DROP_() { return getToken(SQLiteParser.DROP_, 0); }
		public List<Column_nameContext> column_name() {
			return getRuleContexts(Column_nameContext.class);
		}
		public Column_nameContext column_name(int i) {
			return getRuleContext(Column_nameContext.class,i);
		}
		public Schema_nameContext schema_name() {
			return getRuleContext(Schema_nameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(SQLiteParser.DOT, 0); }
		public TerminalNode TO_() { return getToken(SQLiteParser.TO_, 0); }
		public TerminalNode COLUMN_() { return getToken(SQLiteParser.COLUMN_, 0); }
		public Alter_table_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alter_table_stmt; }
	}

	public final Alter_table_stmtContext alter_table_stmt() throws RecognitionException {
		Alter_table_stmtContext _localctx = new Alter_table_stmtContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_alter_table_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(291);
			match(ALTER_);
			setState(292);
			match(TABLE_);
			setState(296);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(293);
				schema_name();
				setState(294);
				match(DOT);
				}
				break;
			}
			setState(298);
			table_name();
			setState(321);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RENAME_:
				{
				setState(299);
				match(RENAME_);
				setState(309);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
				case 1:
					{
					setState(300);
					match(TO_);
					setState(301);
					((Alter_table_stmtContext)_localctx).new_table_name = table_name();
					}
					break;
				case 2:
					{
					setState(303);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
					case 1:
						{
						setState(302);
						match(COLUMN_);
						}
						break;
					}
					setState(305);
					((Alter_table_stmtContext)_localctx).old_column_name = column_name();
					setState(306);
					match(TO_);
					setState(307);
					((Alter_table_stmtContext)_localctx).new_column_name = column_name();
					}
					break;
				}
				}
				break;
			case ADD_:
				{
				setState(311);
				match(ADD_);
				setState(313);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
				case 1:
					{
					setState(312);
					match(COLUMN_);
					}
					break;
				}
				setState(315);
				column_def();
				}
				break;
			case DROP_:
				{
				setState(316);
				match(DROP_);
				setState(318);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
				case 1:
					{
					setState(317);
					match(COLUMN_);
					}
					break;
				}
				setState(320);
				column_name();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Analyze_stmtContext extends ParserRuleContext {
		public TerminalNode ANALYZE_() { return getToken(SQLiteParser.ANALYZE_, 0); }
		public Schema_nameContext schema_name() {
			return getRuleContext(Schema_nameContext.class,0);
		}
		public Table_or_index_nameContext table_or_index_name() {
			return getRuleContext(Table_or_index_nameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(SQLiteParser.DOT, 0); }
		public Analyze_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_analyze_stmt; }
	}

	public final Analyze_stmtContext analyze_stmt() throws RecognitionException {
		Analyze_stmtContext _localctx = new Analyze_stmtContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_analyze_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(323);
			match(ANALYZE_);
			setState(331);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				setState(324);
				schema_name();
				}
				break;
			case 2:
				{
				setState(328);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
				case 1:
					{
					setState(325);
					schema_name();
					setState(326);
					match(DOT);
					}
					break;
				}
				setState(330);
				table_or_index_name();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Attach_stmtContext extends ParserRuleContext {
		public TerminalNode ATTACH_() { return getToken(SQLiteParser.ATTACH_, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode AS_() { return getToken(SQLiteParser.AS_, 0); }
		public Schema_nameContext schema_name() {
			return getRuleContext(Schema_nameContext.class,0);
		}
		public TerminalNode DATABASE_() { return getToken(SQLiteParser.DATABASE_, 0); }
		public Attach_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attach_stmt; }
	}

	public final Attach_stmtContext attach_stmt() throws RecognitionException {
		Attach_stmtContext _localctx = new Attach_stmtContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_attach_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(333);
			match(ATTACH_);
			setState(335);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				{
				setState(334);
				match(DATABASE_);
				}
				break;
			}
			setState(337);
			expr(0);
			setState(338);
			match(AS_);
			setState(339);
			schema_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Begin_stmtContext extends ParserRuleContext {
		public TerminalNode BEGIN_() { return getToken(SQLiteParser.BEGIN_, 0); }
		public TerminalNode TRANSACTION_() { return getToken(SQLiteParser.TRANSACTION_, 0); }
		public TerminalNode DEFERRED_() { return getToken(SQLiteParser.DEFERRED_, 0); }
		public TerminalNode IMMEDIATE_() { return getToken(SQLiteParser.IMMEDIATE_, 0); }
		public TerminalNode EXCLUSIVE_() { return getToken(SQLiteParser.EXCLUSIVE_, 0); }
		public Transaction_nameContext transaction_name() {
			return getRuleContext(Transaction_nameContext.class,0);
		}
		public Begin_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_begin_stmt; }
	}

	public final Begin_stmtContext begin_stmt() throws RecognitionException {
		Begin_stmtContext _localctx = new Begin_stmtContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_begin_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(341);
			match(BEGIN_);
			setState(343);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 58)) & ~0x3f) == 0 && ((1L << (_la - 58)) & 16779265L) != 0)) {
				{
				setState(342);
				_la = _input.LA(1);
				if ( !(((((_la - 58)) & ~0x3f) == 0 && ((1L << (_la - 58)) & 16779265L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(349);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TRANSACTION_) {
				{
				setState(345);
				match(TRANSACTION_);
				setState(347);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
				case 1:
					{
					setState(346);
					transaction_name();
					}
					break;
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Commit_stmtContext extends ParserRuleContext {
		public TerminalNode COMMIT_() { return getToken(SQLiteParser.COMMIT_, 0); }
		public TerminalNode END_() { return getToken(SQLiteParser.END_, 0); }
		public TerminalNode TRANSACTION_() { return getToken(SQLiteParser.TRANSACTION_, 0); }
		public Commit_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_commit_stmt; }
	}

	public final Commit_stmtContext commit_stmt() throws RecognitionException {
		Commit_stmtContext _localctx = new Commit_stmtContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_commit_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(351);
			_la = _input.LA(1);
			if ( !(_la==COMMIT_ || _la==END_) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(353);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TRANSACTION_) {
				{
				setState(352);
				match(TRANSACTION_);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Rollback_stmtContext extends ParserRuleContext {
		public TerminalNode ROLLBACK_() { return getToken(SQLiteParser.ROLLBACK_, 0); }
		public TerminalNode TRANSACTION_() { return getToken(SQLiteParser.TRANSACTION_, 0); }
		public TerminalNode TO_() { return getToken(SQLiteParser.TO_, 0); }
		public Savepoint_nameContext savepoint_name() {
			return getRuleContext(Savepoint_nameContext.class,0);
		}
		public TerminalNode SAVEPOINT_() { return getToken(SQLiteParser.SAVEPOINT_, 0); }
		public Rollback_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rollback_stmt; }
	}

	public final Rollback_stmtContext rollback_stmt() throws RecognitionException {
		Rollback_stmtContext _localctx = new Rollback_stmtContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_rollback_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(355);
			match(ROLLBACK_);
			setState(357);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TRANSACTION_) {
				{
				setState(356);
				match(TRANSACTION_);
				}
			}

			setState(364);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TO_) {
				{
				setState(359);
				match(TO_);
				setState(361);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
				case 1:
					{
					setState(360);
					match(SAVEPOINT_);
					}
					break;
				}
				setState(363);
				savepoint_name();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Savepoint_stmtContext extends ParserRuleContext {
		public TerminalNode SAVEPOINT_() { return getToken(SQLiteParser.SAVEPOINT_, 0); }
		public Savepoint_nameContext savepoint_name() {
			return getRuleContext(Savepoint_nameContext.class,0);
		}
		public Savepoint_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_savepoint_stmt; }
	}

	public final Savepoint_stmtContext savepoint_stmt() throws RecognitionException {
		Savepoint_stmtContext _localctx = new Savepoint_stmtContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_savepoint_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(366);
			match(SAVEPOINT_);
			setState(367);
			savepoint_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Release_stmtContext extends ParserRuleContext {
		public TerminalNode RELEASE_() { return getToken(SQLiteParser.RELEASE_, 0); }
		public Savepoint_nameContext savepoint_name() {
			return getRuleContext(Savepoint_nameContext.class,0);
		}
		public TerminalNode SAVEPOINT_() { return getToken(SQLiteParser.SAVEPOINT_, 0); }
		public Release_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_release_stmt; }
	}

	public final Release_stmtContext release_stmt() throws RecognitionException {
		Release_stmtContext _localctx = new Release_stmtContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_release_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(369);
			match(RELEASE_);
			setState(371);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				{
				setState(370);
				match(SAVEPOINT_);
				}
				break;
			}
			setState(373);
			savepoint_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Create_index_stmtContext extends ParserRuleContext {
		public TerminalNode CREATE_() { return getToken(SQLiteParser.CREATE_, 0); }
		public TerminalNode INDEX_() { return getToken(SQLiteParser.INDEX_, 0); }
		public Index_nameContext index_name() {
			return getRuleContext(Index_nameContext.class,0);
		}
		public TerminalNode ON_() { return getToken(SQLiteParser.ON_, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode OPEN_PAR() { return getToken(SQLiteParser.OPEN_PAR, 0); }
		public List<Indexed_columnContext> indexed_column() {
			return getRuleContexts(Indexed_columnContext.class);
		}
		public Indexed_columnContext indexed_column(int i) {
			return getRuleContext(Indexed_columnContext.class,i);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SQLiteParser.CLOSE_PAR, 0); }
		public TerminalNode UNIQUE_() { return getToken(SQLiteParser.UNIQUE_, 0); }
		public TerminalNode IF_() { return getToken(SQLiteParser.IF_, 0); }
		public TerminalNode NOT_() { return getToken(SQLiteParser.NOT_, 0); }
		public TerminalNode EXISTS_() { return getToken(SQLiteParser.EXISTS_, 0); }
		public Schema_nameContext schema_name() {
			return getRuleContext(Schema_nameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(SQLiteParser.DOT, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SQLiteParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLiteParser.COMMA, i);
		}
		public TerminalNode WHERE_() { return getToken(SQLiteParser.WHERE_, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Create_index_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_index_stmt; }
	}

	public final Create_index_stmtContext create_index_stmt() throws RecognitionException {
		Create_index_stmtContext _localctx = new Create_index_stmtContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_create_index_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(375);
			match(CREATE_);
			setState(377);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==UNIQUE_) {
				{
				setState(376);
				match(UNIQUE_);
				}
			}

			setState(379);
			match(INDEX_);
			setState(383);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				{
				setState(380);
				match(IF_);
				setState(381);
				match(NOT_);
				setState(382);
				match(EXISTS_);
				}
				break;
			}
			setState(388);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				{
				setState(385);
				schema_name();
				setState(386);
				match(DOT);
				}
				break;
			}
			setState(390);
			index_name();
			setState(391);
			match(ON_);
			setState(392);
			table_name();
			setState(393);
			match(OPEN_PAR);
			setState(394);
			indexed_column();
			setState(399);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(395);
				match(COMMA);
				setState(396);
				indexed_column();
				}
				}
				setState(401);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(402);
			match(CLOSE_PAR);
			setState(405);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE_) {
				{
				setState(403);
				match(WHERE_);
				setState(404);
				expr(0);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Indexed_columnContext extends ParserRuleContext {
		public Column_nameContext column_name() {
			return getRuleContext(Column_nameContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode COLLATE_() { return getToken(SQLiteParser.COLLATE_, 0); }
		public Collation_nameContext collation_name() {
			return getRuleContext(Collation_nameContext.class,0);
		}
		public Asc_descContext asc_desc() {
			return getRuleContext(Asc_descContext.class,0);
		}
		public Indexed_columnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_indexed_column; }
	}

	public final Indexed_columnContext indexed_column() throws RecognitionException {
		Indexed_columnContext _localctx = new Indexed_columnContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_indexed_column);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(409);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				{
				setState(407);
				column_name();
				}
				break;
			case 2:
				{
				setState(408);
				expr(0);
				}
				break;
			}
			setState(413);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLLATE_) {
				{
				setState(411);
				match(COLLATE_);
				setState(412);
				collation_name();
				}
			}

			setState(416);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASC_ || _la==DESC_) {
				{
				setState(415);
				asc_desc();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Create_table_stmtContext extends ParserRuleContext {
		public Token row_ROW_ID;
		public TerminalNode CREATE_() { return getToken(SQLiteParser.CREATE_, 0); }
		public TerminalNode TABLE_() { return getToken(SQLiteParser.TABLE_, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode OPEN_PAR() { return getToken(SQLiteParser.OPEN_PAR, 0); }
		public List<Column_defContext> column_def() {
			return getRuleContexts(Column_defContext.class);
		}
		public Column_defContext column_def(int i) {
			return getRuleContext(Column_defContext.class,i);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SQLiteParser.CLOSE_PAR, 0); }
		public TerminalNode AS_() { return getToken(SQLiteParser.AS_, 0); }
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public TerminalNode IF_() { return getToken(SQLiteParser.IF_, 0); }
		public TerminalNode NOT_() { return getToken(SQLiteParser.NOT_, 0); }
		public TerminalNode EXISTS_() { return getToken(SQLiteParser.EXISTS_, 0); }
		public Schema_nameContext schema_name() {
			return getRuleContext(Schema_nameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(SQLiteParser.DOT, 0); }
		public TerminalNode TEMP_() { return getToken(SQLiteParser.TEMP_, 0); }
		public TerminalNode TEMPORARY_() { return getToken(SQLiteParser.TEMPORARY_, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SQLiteParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLiteParser.COMMA, i);
		}
		public List<Table_constraintContext> table_constraint() {
			return getRuleContexts(Table_constraintContext.class);
		}
		public Table_constraintContext table_constraint(int i) {
			return getRuleContext(Table_constraintContext.class,i);
		}
		public TerminalNode WITHOUT_() { return getToken(SQLiteParser.WITHOUT_, 0); }
		public TerminalNode IDENTIFIER() { return getToken(SQLiteParser.IDENTIFIER, 0); }
		public Create_table_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_table_stmt; }
	}

	public final Create_table_stmtContext create_table_stmt() throws RecognitionException {
		Create_table_stmtContext _localctx = new Create_table_stmtContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_create_table_stmt);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(418);
			match(CREATE_);
			setState(420);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TEMP_ || _la==TEMPORARY_) {
				{
				setState(419);
				_la = _input.LA(1);
				if ( !(_la==TEMP_ || _la==TEMPORARY_) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(422);
			match(TABLE_);
			setState(426);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				{
				setState(423);
				match(IF_);
				setState(424);
				match(NOT_);
				setState(425);
				match(EXISTS_);
				}
				break;
			}
			setState(431);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				{
				setState(428);
				schema_name();
				setState(429);
				match(DOT);
				}
				break;
			}
			setState(433);
			table_name();
			setState(457);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPEN_PAR:
				{
				setState(434);
				match(OPEN_PAR);
				setState(435);
				column_def();
				setState(440);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
				while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1+1 ) {
						{
						{
						setState(436);
						match(COMMA);
						setState(437);
						column_def();
						}
						} 
					}
					setState(442);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
				}
				setState(447);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(443);
					match(COMMA);
					setState(444);
					table_constraint();
					}
					}
					setState(449);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(450);
				match(CLOSE_PAR);
				setState(453);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WITHOUT_) {
					{
					setState(451);
					match(WITHOUT_);
					setState(452);
					((Create_table_stmtContext)_localctx).row_ROW_ID = match(IDENTIFIER);
					}
				}

				}
				break;
			case AS_:
				{
				setState(455);
				match(AS_);
				setState(456);
				select_stmt();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Column_defContext extends ParserRuleContext {
		public Column_nameContext column_name() {
			return getRuleContext(Column_nameContext.class,0);
		}
		public Type_nameContext type_name() {
			return getRuleContext(Type_nameContext.class,0);
		}
		public List<Column_constraintContext> column_constraint() {
			return getRuleContexts(Column_constraintContext.class);
		}
		public Column_constraintContext column_constraint(int i) {
			return getRuleContext(Column_constraintContext.class,i);
		}
		public Column_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_def; }
	}

	public final Column_defContext column_def() throws RecognitionException {
		Column_defContext _localctx = new Column_defContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_column_def);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(459);
			column_name();
			setState(461);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				{
				setState(460);
				type_name();
				}
				break;
			}
			setState(466);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 72673329139417088L) != 0) || ((((_la - 102)) & ~0x3f) == 0 && ((1L << (_la - 102)) & 274877941765L) != 0) || _la==GENERATED_) {
				{
				{
				setState(463);
				column_constraint();
				}
				}
				setState(468);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Type_nameContext extends ParserRuleContext {
		public List<NameContext> name() {
			return getRuleContexts(NameContext.class);
		}
		public NameContext name(int i) {
			return getRuleContext(NameContext.class,i);
		}
		public TerminalNode OPEN_PAR() { return getToken(SQLiteParser.OPEN_PAR, 0); }
		public List<Signed_numberContext> signed_number() {
			return getRuleContexts(Signed_numberContext.class);
		}
		public Signed_numberContext signed_number(int i) {
			return getRuleContext(Signed_numberContext.class,i);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SQLiteParser.CLOSE_PAR, 0); }
		public TerminalNode COMMA() { return getToken(SQLiteParser.COMMA, 0); }
		public Type_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_name; }
	}

	public final Type_nameContext type_name() throws RecognitionException {
		Type_nameContext _localctx = new Type_nameContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_type_name);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(470); 
			_errHandler.sync(this);
			_alt = 1+1;
			do {
				switch (_alt) {
				case 1+1:
					{
					{
					setState(469);
					name();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(472); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
			} while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(484);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				{
				setState(474);
				match(OPEN_PAR);
				setState(475);
				signed_number();
				setState(476);
				match(CLOSE_PAR);
				}
				break;
			case 2:
				{
				setState(478);
				match(OPEN_PAR);
				setState(479);
				signed_number();
				setState(480);
				match(COMMA);
				setState(481);
				signed_number();
				setState(482);
				match(CLOSE_PAR);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Column_constraintContext extends ParserRuleContext {
		public TerminalNode CHECK_() { return getToken(SQLiteParser.CHECK_, 0); }
		public TerminalNode OPEN_PAR() { return getToken(SQLiteParser.OPEN_PAR, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SQLiteParser.CLOSE_PAR, 0); }
		public TerminalNode DEFAULT_() { return getToken(SQLiteParser.DEFAULT_, 0); }
		public TerminalNode COLLATE_() { return getToken(SQLiteParser.COLLATE_, 0); }
		public Collation_nameContext collation_name() {
			return getRuleContext(Collation_nameContext.class,0);
		}
		public Foreign_key_clauseContext foreign_key_clause() {
			return getRuleContext(Foreign_key_clauseContext.class,0);
		}
		public TerminalNode AS_() { return getToken(SQLiteParser.AS_, 0); }
		public TerminalNode CONSTRAINT_() { return getToken(SQLiteParser.CONSTRAINT_, 0); }
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public TerminalNode PRIMARY_() { return getToken(SQLiteParser.PRIMARY_, 0); }
		public TerminalNode KEY_() { return getToken(SQLiteParser.KEY_, 0); }
		public TerminalNode NULL_() { return getToken(SQLiteParser.NULL_, 0); }
		public TerminalNode UNIQUE_() { return getToken(SQLiteParser.UNIQUE_, 0); }
		public Signed_numberContext signed_number() {
			return getRuleContext(Signed_numberContext.class,0);
		}
		public Literal_valueContext literal_value() {
			return getRuleContext(Literal_valueContext.class,0);
		}
		public Conflict_clauseContext conflict_clause() {
			return getRuleContext(Conflict_clauseContext.class,0);
		}
		public TerminalNode GENERATED_() { return getToken(SQLiteParser.GENERATED_, 0); }
		public TerminalNode ALWAYS_() { return getToken(SQLiteParser.ALWAYS_, 0); }
		public TerminalNode STORED_() { return getToken(SQLiteParser.STORED_, 0); }
		public TerminalNode VIRTUAL_() { return getToken(SQLiteParser.VIRTUAL_, 0); }
		public Asc_descContext asc_desc() {
			return getRuleContext(Asc_descContext.class,0);
		}
		public TerminalNode AUTOINCREMENT_() { return getToken(SQLiteParser.AUTOINCREMENT_, 0); }
		public TerminalNode NOT_() { return getToken(SQLiteParser.NOT_, 0); }
		public Column_constraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_constraint; }
	}

	public final Column_constraintContext column_constraint() throws RecognitionException {
		Column_constraintContext _localctx = new Column_constraintContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_column_constraint);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(488);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CONSTRAINT_) {
				{
				setState(486);
				match(CONSTRAINT_);
				setState(487);
				name();
				}
			}

			setState(539);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PRIMARY_:
				{
				{
				setState(490);
				match(PRIMARY_);
				setState(491);
				match(KEY_);
				setState(493);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ASC_ || _la==DESC_) {
					{
					setState(492);
					asc_desc();
					}
				}

				setState(496);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ON_) {
					{
					setState(495);
					conflict_clause();
					}
				}

				setState(499);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AUTOINCREMENT_) {
					{
					setState(498);
					match(AUTOINCREMENT_);
					}
				}

				}
				}
				break;
			case NOT_:
			case NULL_:
			case UNIQUE_:
				{
				setState(506);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case NOT_:
				case NULL_:
					{
					setState(502);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==NOT_) {
						{
						setState(501);
						match(NOT_);
						}
					}

					setState(504);
					match(NULL_);
					}
					break;
				case UNIQUE_:
					{
					setState(505);
					match(UNIQUE_);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(509);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ON_) {
					{
					setState(508);
					conflict_clause();
					}
				}

				}
				break;
			case CHECK_:
				{
				setState(511);
				match(CHECK_);
				setState(512);
				match(OPEN_PAR);
				setState(513);
				expr(0);
				setState(514);
				match(CLOSE_PAR);
				}
				break;
			case DEFAULT_:
				{
				setState(516);
				match(DEFAULT_);
				setState(523);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
				case 1:
					{
					setState(517);
					signed_number();
					}
					break;
				case 2:
					{
					setState(518);
					literal_value();
					}
					break;
				case 3:
					{
					setState(519);
					match(OPEN_PAR);
					setState(520);
					expr(0);
					setState(521);
					match(CLOSE_PAR);
					}
					break;
				}
				}
				break;
			case COLLATE_:
				{
				setState(525);
				match(COLLATE_);
				setState(526);
				collation_name();
				}
				break;
			case REFERENCES_:
				{
				setState(527);
				foreign_key_clause();
				}
				break;
			case AS_:
			case GENERATED_:
				{
				setState(530);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==GENERATED_) {
					{
					setState(528);
					match(GENERATED_);
					setState(529);
					match(ALWAYS_);
					}
				}

				setState(532);
				match(AS_);
				setState(533);
				match(OPEN_PAR);
				setState(534);
				expr(0);
				setState(535);
				match(CLOSE_PAR);
				setState(537);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==VIRTUAL_ || _la==STORED_) {
					{
					setState(536);
					_la = _input.LA(1);
					if ( !(_la==VIRTUAL_ || _la==STORED_) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Signed_numberContext extends ParserRuleContext {
		public TerminalNode NUMERIC_LITERAL() { return getToken(SQLiteParser.NUMERIC_LITERAL, 0); }
		public TerminalNode PLUS() { return getToken(SQLiteParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(SQLiteParser.MINUS, 0); }
		public Signed_numberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_signed_number; }
	}

	public final Signed_numberContext signed_number() throws RecognitionException {
		Signed_numberContext _localctx = new Signed_numberContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_signed_number);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(542);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PLUS || _la==MINUS) {
				{
				setState(541);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(544);
			match(NUMERIC_LITERAL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Table_constraintContext extends ParserRuleContext {
		public TerminalNode OPEN_PAR() { return getToken(SQLiteParser.OPEN_PAR, 0); }
		public List<Indexed_columnContext> indexed_column() {
			return getRuleContexts(Indexed_columnContext.class);
		}
		public Indexed_columnContext indexed_column(int i) {
			return getRuleContext(Indexed_columnContext.class,i);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SQLiteParser.CLOSE_PAR, 0); }
		public TerminalNode CHECK_() { return getToken(SQLiteParser.CHECK_, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode FOREIGN_() { return getToken(SQLiteParser.FOREIGN_, 0); }
		public TerminalNode KEY_() { return getToken(SQLiteParser.KEY_, 0); }
		public List<Column_nameContext> column_name() {
			return getRuleContexts(Column_nameContext.class);
		}
		public Column_nameContext column_name(int i) {
			return getRuleContext(Column_nameContext.class,i);
		}
		public Foreign_key_clauseContext foreign_key_clause() {
			return getRuleContext(Foreign_key_clauseContext.class,0);
		}
		public TerminalNode CONSTRAINT_() { return getToken(SQLiteParser.CONSTRAINT_, 0); }
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public TerminalNode PRIMARY_() { return getToken(SQLiteParser.PRIMARY_, 0); }
		public TerminalNode UNIQUE_() { return getToken(SQLiteParser.UNIQUE_, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SQLiteParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLiteParser.COMMA, i);
		}
		public Conflict_clauseContext conflict_clause() {
			return getRuleContext(Conflict_clauseContext.class,0);
		}
		public Table_constraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_constraint; }
	}

	public final Table_constraintContext table_constraint() throws RecognitionException {
		Table_constraintContext _localctx = new Table_constraintContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_table_constraint);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(548);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CONSTRAINT_) {
				{
				setState(546);
				match(CONSTRAINT_);
				setState(547);
				name();
				}
			}

			setState(587);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PRIMARY_:
			case UNIQUE_:
				{
				setState(553);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case PRIMARY_:
					{
					setState(550);
					match(PRIMARY_);
					setState(551);
					match(KEY_);
					}
					break;
				case UNIQUE_:
					{
					setState(552);
					match(UNIQUE_);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(555);
				match(OPEN_PAR);
				setState(556);
				indexed_column();
				setState(561);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(557);
					match(COMMA);
					setState(558);
					indexed_column();
					}
					}
					setState(563);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(564);
				match(CLOSE_PAR);
				setState(566);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ON_) {
					{
					setState(565);
					conflict_clause();
					}
				}

				}
				break;
			case CHECK_:
				{
				setState(568);
				match(CHECK_);
				setState(569);
				match(OPEN_PAR);
				setState(570);
				expr(0);
				setState(571);
				match(CLOSE_PAR);
				}
				break;
			case FOREIGN_:
				{
				setState(573);
				match(FOREIGN_);
				setState(574);
				match(KEY_);
				setState(575);
				match(OPEN_PAR);
				setState(576);
				column_name();
				setState(581);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(577);
					match(COMMA);
					setState(578);
					column_name();
					}
					}
					setState(583);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(584);
				match(CLOSE_PAR);
				setState(585);
				foreign_key_clause();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Foreign_key_clauseContext extends ParserRuleContext {
		public TerminalNode REFERENCES_() { return getToken(SQLiteParser.REFERENCES_, 0); }
		public Foreign_tableContext foreign_table() {
			return getRuleContext(Foreign_tableContext.class,0);
		}
		public TerminalNode OPEN_PAR() { return getToken(SQLiteParser.OPEN_PAR, 0); }
		public List<Column_nameContext> column_name() {
			return getRuleContexts(Column_nameContext.class);
		}
		public Column_nameContext column_name(int i) {
			return getRuleContext(Column_nameContext.class,i);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SQLiteParser.CLOSE_PAR, 0); }
		public List<TerminalNode> ON_() { return getTokens(SQLiteParser.ON_); }
		public TerminalNode ON_(int i) {
			return getToken(SQLiteParser.ON_, i);
		}
		public List<TerminalNode> MATCH_() { return getTokens(SQLiteParser.MATCH_); }
		public TerminalNode MATCH_(int i) {
			return getToken(SQLiteParser.MATCH_, i);
		}
		public List<NameContext> name() {
			return getRuleContexts(NameContext.class);
		}
		public NameContext name(int i) {
			return getRuleContext(NameContext.class,i);
		}
		public TerminalNode DEFERRABLE_() { return getToken(SQLiteParser.DEFERRABLE_, 0); }
		public List<TerminalNode> DELETE_() { return getTokens(SQLiteParser.DELETE_); }
		public TerminalNode DELETE_(int i) {
			return getToken(SQLiteParser.DELETE_, i);
		}
		public List<TerminalNode> UPDATE_() { return getTokens(SQLiteParser.UPDATE_); }
		public TerminalNode UPDATE_(int i) {
			return getToken(SQLiteParser.UPDATE_, i);
		}
		public List<TerminalNode> SET_() { return getTokens(SQLiteParser.SET_); }
		public TerminalNode SET_(int i) {
			return getToken(SQLiteParser.SET_, i);
		}
		public List<TerminalNode> CASCADE_() { return getTokens(SQLiteParser.CASCADE_); }
		public TerminalNode CASCADE_(int i) {
			return getToken(SQLiteParser.CASCADE_, i);
		}
		public List<TerminalNode> RESTRICT_() { return getTokens(SQLiteParser.RESTRICT_); }
		public TerminalNode RESTRICT_(int i) {
			return getToken(SQLiteParser.RESTRICT_, i);
		}
		public List<TerminalNode> NO_() { return getTokens(SQLiteParser.NO_); }
		public TerminalNode NO_(int i) {
			return getToken(SQLiteParser.NO_, i);
		}
		public List<TerminalNode> ACTION_() { return getTokens(SQLiteParser.ACTION_); }
		public TerminalNode ACTION_(int i) {
			return getToken(SQLiteParser.ACTION_, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SQLiteParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLiteParser.COMMA, i);
		}
		public List<TerminalNode> NULL_() { return getTokens(SQLiteParser.NULL_); }
		public TerminalNode NULL_(int i) {
			return getToken(SQLiteParser.NULL_, i);
		}
		public List<TerminalNode> DEFAULT_() { return getTokens(SQLiteParser.DEFAULT_); }
		public TerminalNode DEFAULT_(int i) {
			return getToken(SQLiteParser.DEFAULT_, i);
		}
		public TerminalNode NOT_() { return getToken(SQLiteParser.NOT_, 0); }
		public TerminalNode INITIALLY_() { return getToken(SQLiteParser.INITIALLY_, 0); }
		public TerminalNode DEFERRED_() { return getToken(SQLiteParser.DEFERRED_, 0); }
		public TerminalNode IMMEDIATE_() { return getToken(SQLiteParser.IMMEDIATE_, 0); }
		public Foreign_key_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_foreign_key_clause; }
	}

	public final Foreign_key_clauseContext foreign_key_clause() throws RecognitionException {
		Foreign_key_clauseContext _localctx = new Foreign_key_clauseContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_foreign_key_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(589);
			match(REFERENCES_);
			setState(590);
			foreign_table();
			setState(602);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_PAR) {
				{
				setState(591);
				match(OPEN_PAR);
				setState(592);
				column_name();
				setState(597);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(593);
					match(COMMA);
					setState(594);
					column_name();
					}
					}
					setState(599);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(600);
				match(CLOSE_PAR);
				}
			}

			setState(618);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MATCH_ || _la==ON_) {
				{
				setState(616);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ON_:
					{
					setState(604);
					match(ON_);
					setState(605);
					_la = _input.LA(1);
					if ( !(_la==DELETE_ || _la==UPDATE_) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(612);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case SET_:
						{
						setState(606);
						match(SET_);
						setState(607);
						_la = _input.LA(1);
						if ( !(_la==DEFAULT_ || _la==NULL_) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
						break;
					case CASCADE_:
						{
						setState(608);
						match(CASCADE_);
						}
						break;
					case RESTRICT_:
						{
						setState(609);
						match(RESTRICT_);
						}
						break;
					case NO_:
						{
						setState(610);
						match(NO_);
						setState(611);
						match(ACTION_);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					break;
				case MATCH_:
					{
					setState(614);
					match(MATCH_);
					setState(615);
					name();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(620);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(629);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,69,_ctx) ) {
			case 1:
				{
				setState(622);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT_) {
					{
					setState(621);
					match(NOT_);
					}
				}

				setState(624);
				match(DEFERRABLE_);
				setState(627);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==INITIALLY_) {
					{
					setState(625);
					match(INITIALLY_);
					setState(626);
					_la = _input.LA(1);
					if ( !(_la==DEFERRED_ || _la==IMMEDIATE_) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Conflict_clauseContext extends ParserRuleContext {
		public TerminalNode ON_() { return getToken(SQLiteParser.ON_, 0); }
		public TerminalNode CONFLICT_() { return getToken(SQLiteParser.CONFLICT_, 0); }
		public TerminalNode ROLLBACK_() { return getToken(SQLiteParser.ROLLBACK_, 0); }
		public TerminalNode ABORT_() { return getToken(SQLiteParser.ABORT_, 0); }
		public TerminalNode FAIL_() { return getToken(SQLiteParser.FAIL_, 0); }
		public TerminalNode IGNORE_() { return getToken(SQLiteParser.IGNORE_, 0); }
		public TerminalNode REPLACE_() { return getToken(SQLiteParser.REPLACE_, 0); }
		public Conflict_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conflict_clause; }
	}

	public final Conflict_clauseContext conflict_clause() throws RecognitionException {
		Conflict_clauseContext _localctx = new Conflict_clauseContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_conflict_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(631);
			match(ON_);
			setState(632);
			match(CONFLICT_);
			setState(633);
			_la = _input.LA(1);
			if ( !(_la==ABORT_ || ((((_la - 72)) & ~0x3f) == 0 && ((1L << (_la - 72)) & 19140298416325121L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Create_trigger_stmtContext extends ParserRuleContext {
		public TerminalNode CREATE_() { return getToken(SQLiteParser.CREATE_, 0); }
		public TerminalNode TRIGGER_() { return getToken(SQLiteParser.TRIGGER_, 0); }
		public Trigger_nameContext trigger_name() {
			return getRuleContext(Trigger_nameContext.class,0);
		}
		public TerminalNode ON_() { return getToken(SQLiteParser.ON_, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode BEGIN_() { return getToken(SQLiteParser.BEGIN_, 0); }
		public TerminalNode END_() { return getToken(SQLiteParser.END_, 0); }
		public TerminalNode DELETE_() { return getToken(SQLiteParser.DELETE_, 0); }
		public TerminalNode INSERT_() { return getToken(SQLiteParser.INSERT_, 0); }
		public TerminalNode UPDATE_() { return getToken(SQLiteParser.UPDATE_, 0); }
		public TerminalNode IF_() { return getToken(SQLiteParser.IF_, 0); }
		public TerminalNode NOT_() { return getToken(SQLiteParser.NOT_, 0); }
		public TerminalNode EXISTS_() { return getToken(SQLiteParser.EXISTS_, 0); }
		public Schema_nameContext schema_name() {
			return getRuleContext(Schema_nameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(SQLiteParser.DOT, 0); }
		public TerminalNode BEFORE_() { return getToken(SQLiteParser.BEFORE_, 0); }
		public TerminalNode AFTER_() { return getToken(SQLiteParser.AFTER_, 0); }
		public TerminalNode INSTEAD_() { return getToken(SQLiteParser.INSTEAD_, 0); }
		public List<TerminalNode> OF_() { return getTokens(SQLiteParser.OF_); }
		public TerminalNode OF_(int i) {
			return getToken(SQLiteParser.OF_, i);
		}
		public TerminalNode FOR_() { return getToken(SQLiteParser.FOR_, 0); }
		public TerminalNode EACH_() { return getToken(SQLiteParser.EACH_, 0); }
		public TerminalNode ROW_() { return getToken(SQLiteParser.ROW_, 0); }
		public TerminalNode WHEN_() { return getToken(SQLiteParser.WHEN_, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<TerminalNode> SCOL() { return getTokens(SQLiteParser.SCOL); }
		public TerminalNode SCOL(int i) {
			return getToken(SQLiteParser.SCOL, i);
		}
		public TerminalNode TEMP_() { return getToken(SQLiteParser.TEMP_, 0); }
		public TerminalNode TEMPORARY_() { return getToken(SQLiteParser.TEMPORARY_, 0); }
		public List<Column_nameContext> column_name() {
			return getRuleContexts(Column_nameContext.class);
		}
		public Column_nameContext column_name(int i) {
			return getRuleContext(Column_nameContext.class,i);
		}
		public List<Update_stmtContext> update_stmt() {
			return getRuleContexts(Update_stmtContext.class);
		}
		public Update_stmtContext update_stmt(int i) {
			return getRuleContext(Update_stmtContext.class,i);
		}
		public List<Insert_stmtContext> insert_stmt() {
			return getRuleContexts(Insert_stmtContext.class);
		}
		public Insert_stmtContext insert_stmt(int i) {
			return getRuleContext(Insert_stmtContext.class,i);
		}
		public List<Delete_stmtContext> delete_stmt() {
			return getRuleContexts(Delete_stmtContext.class);
		}
		public Delete_stmtContext delete_stmt(int i) {
			return getRuleContext(Delete_stmtContext.class,i);
		}
		public List<Select_stmtContext> select_stmt() {
			return getRuleContexts(Select_stmtContext.class);
		}
		public Select_stmtContext select_stmt(int i) {
			return getRuleContext(Select_stmtContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SQLiteParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLiteParser.COMMA, i);
		}
		public Create_trigger_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_trigger_stmt; }
	}

	public final Create_trigger_stmtContext create_trigger_stmt() throws RecognitionException {
		Create_trigger_stmtContext _localctx = new Create_trigger_stmtContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_create_trigger_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(635);
			match(CREATE_);
			setState(637);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TEMP_ || _la==TEMPORARY_) {
				{
				setState(636);
				_la = _input.LA(1);
				if ( !(_la==TEMP_ || _la==TEMPORARY_) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(639);
			match(TRIGGER_);
			setState(643);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,71,_ctx) ) {
			case 1:
				{
				setState(640);
				match(IF_);
				setState(641);
				match(NOT_);
				setState(642);
				match(EXISTS_);
				}
				break;
			}
			setState(648);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,72,_ctx) ) {
			case 1:
				{
				setState(645);
				schema_name();
				setState(646);
				match(DOT);
				}
				break;
			}
			setState(650);
			trigger_name();
			setState(655);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BEFORE_:
				{
				setState(651);
				match(BEFORE_);
				}
				break;
			case AFTER_:
				{
				setState(652);
				match(AFTER_);
				}
				break;
			case INSTEAD_:
				{
				setState(653);
				match(INSTEAD_);
				setState(654);
				match(OF_);
				}
				break;
			case DELETE_:
			case INSERT_:
			case UPDATE_:
				break;
			default:
				break;
			}
			setState(671);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DELETE_:
				{
				setState(657);
				match(DELETE_);
				}
				break;
			case INSERT_:
				{
				setState(658);
				match(INSERT_);
				}
				break;
			case UPDATE_:
				{
				setState(659);
				match(UPDATE_);
				setState(669);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OF_) {
					{
					setState(660);
					match(OF_);
					setState(661);
					column_name();
					setState(666);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(662);
						match(COMMA);
						setState(663);
						column_name();
						}
						}
						setState(668);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(673);
			match(ON_);
			setState(674);
			table_name();
			setState(678);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FOR_) {
				{
				setState(675);
				match(FOR_);
				setState(676);
				match(EACH_);
				setState(677);
				match(ROW_);
				}
			}

			setState(682);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHEN_) {
				{
				setState(680);
				match(WHEN_);
				setState(681);
				expr(0);
				}
			}

			setState(684);
			match(BEGIN_);
			setState(693); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(689);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,79,_ctx) ) {
				case 1:
					{
					setState(685);
					update_stmt();
					}
					break;
				case 2:
					{
					setState(686);
					insert_stmt();
					}
					break;
				case 3:
					{
					setState(687);
					delete_stmt();
					}
					break;
				case 4:
					{
					setState(688);
					select_stmt();
					}
					break;
				}
				setState(691);
				match(SCOL);
				}
				}
				setState(695); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==DELETE_ || ((((_la - 88)) & ~0x3f) == 0 && ((1L << (_la - 88)) & 2386912217732743169L) != 0) );
			setState(697);
			match(END_);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Create_view_stmtContext extends ParserRuleContext {
		public TerminalNode CREATE_() { return getToken(SQLiteParser.CREATE_, 0); }
		public TerminalNode VIEW_() { return getToken(SQLiteParser.VIEW_, 0); }
		public View_nameContext view_name() {
			return getRuleContext(View_nameContext.class,0);
		}
		public TerminalNode AS_() { return getToken(SQLiteParser.AS_, 0); }
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public TerminalNode IF_() { return getToken(SQLiteParser.IF_, 0); }
		public TerminalNode NOT_() { return getToken(SQLiteParser.NOT_, 0); }
		public TerminalNode EXISTS_() { return getToken(SQLiteParser.EXISTS_, 0); }
		public Schema_nameContext schema_name() {
			return getRuleContext(Schema_nameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(SQLiteParser.DOT, 0); }
		public TerminalNode OPEN_PAR() { return getToken(SQLiteParser.OPEN_PAR, 0); }
		public List<Column_nameContext> column_name() {
			return getRuleContexts(Column_nameContext.class);
		}
		public Column_nameContext column_name(int i) {
			return getRuleContext(Column_nameContext.class,i);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SQLiteParser.CLOSE_PAR, 0); }
		public TerminalNode TEMP_() { return getToken(SQLiteParser.TEMP_, 0); }
		public TerminalNode TEMPORARY_() { return getToken(SQLiteParser.TEMPORARY_, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SQLiteParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLiteParser.COMMA, i);
		}
		public Create_view_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_view_stmt; }
	}

	public final Create_view_stmtContext create_view_stmt() throws RecognitionException {
		Create_view_stmtContext _localctx = new Create_view_stmtContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_create_view_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(699);
			match(CREATE_);
			setState(701);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TEMP_ || _la==TEMPORARY_) {
				{
				setState(700);
				_la = _input.LA(1);
				if ( !(_la==TEMP_ || _la==TEMPORARY_) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(703);
			match(VIEW_);
			setState(707);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,82,_ctx) ) {
			case 1:
				{
				setState(704);
				match(IF_);
				setState(705);
				match(NOT_);
				setState(706);
				match(EXISTS_);
				}
				break;
			}
			setState(712);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,83,_ctx) ) {
			case 1:
				{
				setState(709);
				schema_name();
				setState(710);
				match(DOT);
				}
				break;
			}
			setState(714);
			view_name();
			setState(726);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_PAR) {
				{
				setState(715);
				match(OPEN_PAR);
				setState(716);
				column_name();
				setState(721);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(717);
					match(COMMA);
					setState(718);
					column_name();
					}
					}
					setState(723);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(724);
				match(CLOSE_PAR);
				}
			}

			setState(728);
			match(AS_);
			setState(729);
			select_stmt();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Create_virtual_table_stmtContext extends ParserRuleContext {
		public TerminalNode CREATE_() { return getToken(SQLiteParser.CREATE_, 0); }
		public TerminalNode VIRTUAL_() { return getToken(SQLiteParser.VIRTUAL_, 0); }
		public TerminalNode TABLE_() { return getToken(SQLiteParser.TABLE_, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode USING_() { return getToken(SQLiteParser.USING_, 0); }
		public Module_nameContext module_name() {
			return getRuleContext(Module_nameContext.class,0);
		}
		public TerminalNode IF_() { return getToken(SQLiteParser.IF_, 0); }
		public TerminalNode NOT_() { return getToken(SQLiteParser.NOT_, 0); }
		public TerminalNode EXISTS_() { return getToken(SQLiteParser.EXISTS_, 0); }
		public Schema_nameContext schema_name() {
			return getRuleContext(Schema_nameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(SQLiteParser.DOT, 0); }
		public TerminalNode OPEN_PAR() { return getToken(SQLiteParser.OPEN_PAR, 0); }
		public List<Module_argumentContext> module_argument() {
			return getRuleContexts(Module_argumentContext.class);
		}
		public Module_argumentContext module_argument(int i) {
			return getRuleContext(Module_argumentContext.class,i);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SQLiteParser.CLOSE_PAR, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SQLiteParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLiteParser.COMMA, i);
		}
		public Create_virtual_table_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_virtual_table_stmt; }
	}

	public final Create_virtual_table_stmtContext create_virtual_table_stmt() throws RecognitionException {
		Create_virtual_table_stmtContext _localctx = new Create_virtual_table_stmtContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_create_virtual_table_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(731);
			match(CREATE_);
			setState(732);
			match(VIRTUAL_);
			setState(733);
			match(TABLE_);
			setState(737);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,86,_ctx) ) {
			case 1:
				{
				setState(734);
				match(IF_);
				setState(735);
				match(NOT_);
				setState(736);
				match(EXISTS_);
				}
				break;
			}
			setState(742);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,87,_ctx) ) {
			case 1:
				{
				setState(739);
				schema_name();
				setState(740);
				match(DOT);
				}
				break;
			}
			setState(744);
			table_name();
			setState(745);
			match(USING_);
			setState(746);
			module_name();
			setState(758);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_PAR) {
				{
				setState(747);
				match(OPEN_PAR);
				setState(748);
				module_argument();
				setState(753);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(749);
					match(COMMA);
					setState(750);
					module_argument();
					}
					}
					setState(755);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(756);
				match(CLOSE_PAR);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class With_clauseContext extends ParserRuleContext {
		public TerminalNode WITH_() { return getToken(SQLiteParser.WITH_, 0); }
		public List<Cte_table_nameContext> cte_table_name() {
			return getRuleContexts(Cte_table_nameContext.class);
		}
		public Cte_table_nameContext cte_table_name(int i) {
			return getRuleContext(Cte_table_nameContext.class,i);
		}
		public List<TerminalNode> AS_() { return getTokens(SQLiteParser.AS_); }
		public TerminalNode AS_(int i) {
			return getToken(SQLiteParser.AS_, i);
		}
		public List<TerminalNode> OPEN_PAR() { return getTokens(SQLiteParser.OPEN_PAR); }
		public TerminalNode OPEN_PAR(int i) {
			return getToken(SQLiteParser.OPEN_PAR, i);
		}
		public List<Select_stmtContext> select_stmt() {
			return getRuleContexts(Select_stmtContext.class);
		}
		public Select_stmtContext select_stmt(int i) {
			return getRuleContext(Select_stmtContext.class,i);
		}
		public List<TerminalNode> CLOSE_PAR() { return getTokens(SQLiteParser.CLOSE_PAR); }
		public TerminalNode CLOSE_PAR(int i) {
			return getToken(SQLiteParser.CLOSE_PAR, i);
		}
		public TerminalNode RECURSIVE_() { return getToken(SQLiteParser.RECURSIVE_, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SQLiteParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLiteParser.COMMA, i);
		}
		public With_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_with_clause; }
	}

	public final With_clauseContext with_clause() throws RecognitionException {
		With_clauseContext _localctx = new With_clauseContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_with_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(760);
			match(WITH_);
			setState(762);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,90,_ctx) ) {
			case 1:
				{
				setState(761);
				match(RECURSIVE_);
				}
				break;
			}
			setState(764);
			cte_table_name();
			setState(765);
			match(AS_);
			setState(766);
			match(OPEN_PAR);
			setState(767);
			select_stmt();
			setState(768);
			match(CLOSE_PAR);
			setState(778);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(769);
				match(COMMA);
				setState(770);
				cte_table_name();
				setState(771);
				match(AS_);
				setState(772);
				match(OPEN_PAR);
				setState(773);
				select_stmt();
				setState(774);
				match(CLOSE_PAR);
				}
				}
				setState(780);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Cte_table_nameContext extends ParserRuleContext {
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode OPEN_PAR() { return getToken(SQLiteParser.OPEN_PAR, 0); }
		public List<Column_nameContext> column_name() {
			return getRuleContexts(Column_nameContext.class);
		}
		public Column_nameContext column_name(int i) {
			return getRuleContext(Column_nameContext.class,i);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SQLiteParser.CLOSE_PAR, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SQLiteParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLiteParser.COMMA, i);
		}
		public Cte_table_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cte_table_name; }
	}

	public final Cte_table_nameContext cte_table_name() throws RecognitionException {
		Cte_table_nameContext _localctx = new Cte_table_nameContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_cte_table_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(781);
			table_name();
			setState(793);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_PAR) {
				{
				setState(782);
				match(OPEN_PAR);
				setState(783);
				column_name();
				setState(788);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(784);
					match(COMMA);
					setState(785);
					column_name();
					}
					}
					setState(790);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(791);
				match(CLOSE_PAR);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Recursive_cteContext extends ParserRuleContext {
		public Cte_table_nameContext cte_table_name() {
			return getRuleContext(Cte_table_nameContext.class,0);
		}
		public TerminalNode AS_() { return getToken(SQLiteParser.AS_, 0); }
		public TerminalNode OPEN_PAR() { return getToken(SQLiteParser.OPEN_PAR, 0); }
		public Initial_selectContext initial_select() {
			return getRuleContext(Initial_selectContext.class,0);
		}
		public TerminalNode UNION_() { return getToken(SQLiteParser.UNION_, 0); }
		public Recursive_selectContext recursive_select() {
			return getRuleContext(Recursive_selectContext.class,0);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SQLiteParser.CLOSE_PAR, 0); }
		public TerminalNode ALL_() { return getToken(SQLiteParser.ALL_, 0); }
		public Recursive_cteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_recursive_cte; }
	}

	public final Recursive_cteContext recursive_cte() throws RecognitionException {
		Recursive_cteContext _localctx = new Recursive_cteContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_recursive_cte);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(795);
			cte_table_name();
			setState(796);
			match(AS_);
			setState(797);
			match(OPEN_PAR);
			setState(798);
			initial_select();
			setState(799);
			match(UNION_);
			setState(801);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ALL_) {
				{
				setState(800);
				match(ALL_);
				}
			}

			setState(803);
			recursive_select();
			setState(804);
			match(CLOSE_PAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Common_table_expressionContext extends ParserRuleContext {
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode AS_() { return getToken(SQLiteParser.AS_, 0); }
		public List<TerminalNode> OPEN_PAR() { return getTokens(SQLiteParser.OPEN_PAR); }
		public TerminalNode OPEN_PAR(int i) {
			return getToken(SQLiteParser.OPEN_PAR, i);
		}
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public List<TerminalNode> CLOSE_PAR() { return getTokens(SQLiteParser.CLOSE_PAR); }
		public TerminalNode CLOSE_PAR(int i) {
			return getToken(SQLiteParser.CLOSE_PAR, i);
		}
		public List<Column_nameContext> column_name() {
			return getRuleContexts(Column_nameContext.class);
		}
		public Column_nameContext column_name(int i) {
			return getRuleContext(Column_nameContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SQLiteParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLiteParser.COMMA, i);
		}
		public Common_table_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_common_table_expression; }
	}

	public final Common_table_expressionContext common_table_expression() throws RecognitionException {
		Common_table_expressionContext _localctx = new Common_table_expressionContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_common_table_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(806);
			table_name();
			setState(818);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_PAR) {
				{
				setState(807);
				match(OPEN_PAR);
				setState(808);
				column_name();
				setState(813);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(809);
					match(COMMA);
					setState(810);
					column_name();
					}
					}
					setState(815);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(816);
				match(CLOSE_PAR);
				}
			}

			setState(820);
			match(AS_);
			setState(821);
			match(OPEN_PAR);
			setState(822);
			select_stmt();
			setState(823);
			match(CLOSE_PAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Delete_stmtContext extends ParserRuleContext {
		public TerminalNode DELETE_() { return getToken(SQLiteParser.DELETE_, 0); }
		public TerminalNode FROM_() { return getToken(SQLiteParser.FROM_, 0); }
		public Qualified_table_nameContext qualified_table_name() {
			return getRuleContext(Qualified_table_nameContext.class,0);
		}
		public With_clauseContext with_clause() {
			return getRuleContext(With_clauseContext.class,0);
		}
		public TerminalNode WHERE_() { return getToken(SQLiteParser.WHERE_, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Returning_clauseContext returning_clause() {
			return getRuleContext(Returning_clauseContext.class,0);
		}
		public Delete_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_delete_stmt; }
	}

	public final Delete_stmtContext delete_stmt() throws RecognitionException {
		Delete_stmtContext _localctx = new Delete_stmtContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_delete_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(826);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WITH_) {
				{
				setState(825);
				with_clause();
				}
			}

			setState(828);
			match(DELETE_);
			setState(829);
			match(FROM_);
			setState(830);
			qualified_table_name();
			setState(833);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE_) {
				{
				setState(831);
				match(WHERE_);
				setState(832);
				expr(0);
				}
			}

			setState(836);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RETURNING_) {
				{
				setState(835);
				returning_clause();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Delete_stmt_limitedContext extends ParserRuleContext {
		public TerminalNode DELETE_() { return getToken(SQLiteParser.DELETE_, 0); }
		public TerminalNode FROM_() { return getToken(SQLiteParser.FROM_, 0); }
		public Qualified_table_nameContext qualified_table_name() {
			return getRuleContext(Qualified_table_nameContext.class,0);
		}
		public With_clauseContext with_clause() {
			return getRuleContext(With_clauseContext.class,0);
		}
		public TerminalNode WHERE_() { return getToken(SQLiteParser.WHERE_, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Returning_clauseContext returning_clause() {
			return getRuleContext(Returning_clauseContext.class,0);
		}
		public Limit_stmtContext limit_stmt() {
			return getRuleContext(Limit_stmtContext.class,0);
		}
		public Order_by_stmtContext order_by_stmt() {
			return getRuleContext(Order_by_stmtContext.class,0);
		}
		public Delete_stmt_limitedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_delete_stmt_limited; }
	}

	public final Delete_stmt_limitedContext delete_stmt_limited() throws RecognitionException {
		Delete_stmt_limitedContext _localctx = new Delete_stmt_limitedContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_delete_stmt_limited);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(839);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WITH_) {
				{
				setState(838);
				with_clause();
				}
			}

			setState(841);
			match(DELETE_);
			setState(842);
			match(FROM_);
			setState(843);
			qualified_table_name();
			setState(846);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE_) {
				{
				setState(844);
				match(WHERE_);
				setState(845);
				expr(0);
				}
			}

			setState(849);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RETURNING_) {
				{
				setState(848);
				returning_clause();
				}
			}

			setState(855);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LIMIT_ || _la==ORDER_) {
				{
				setState(852);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ORDER_) {
					{
					setState(851);
					order_by_stmt();
					}
				}

				setState(854);
				limit_stmt();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Detach_stmtContext extends ParserRuleContext {
		public TerminalNode DETACH_() { return getToken(SQLiteParser.DETACH_, 0); }
		public Schema_nameContext schema_name() {
			return getRuleContext(Schema_nameContext.class,0);
		}
		public TerminalNode DATABASE_() { return getToken(SQLiteParser.DATABASE_, 0); }
		public Detach_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_detach_stmt; }
	}

	public final Detach_stmtContext detach_stmt() throws RecognitionException {
		Detach_stmtContext _localctx = new Detach_stmtContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_detach_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(857);
			match(DETACH_);
			setState(859);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,105,_ctx) ) {
			case 1:
				{
				setState(858);
				match(DATABASE_);
				}
				break;
			}
			setState(861);
			schema_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Drop_stmtContext extends ParserRuleContext {
		public Token object;
		public TerminalNode DROP_() { return getToken(SQLiteParser.DROP_, 0); }
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public TerminalNode INDEX_() { return getToken(SQLiteParser.INDEX_, 0); }
		public TerminalNode TABLE_() { return getToken(SQLiteParser.TABLE_, 0); }
		public TerminalNode TRIGGER_() { return getToken(SQLiteParser.TRIGGER_, 0); }
		public TerminalNode VIEW_() { return getToken(SQLiteParser.VIEW_, 0); }
		public TerminalNode IF_() { return getToken(SQLiteParser.IF_, 0); }
		public TerminalNode EXISTS_() { return getToken(SQLiteParser.EXISTS_, 0); }
		public Schema_nameContext schema_name() {
			return getRuleContext(Schema_nameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(SQLiteParser.DOT, 0); }
		public Drop_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_drop_stmt; }
	}

	public final Drop_stmtContext drop_stmt() throws RecognitionException {
		Drop_stmtContext _localctx = new Drop_stmtContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_drop_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(863);
			match(DROP_);
			setState(864);
			((Drop_stmtContext)_localctx).object = _input.LT(1);
			_la = _input.LA(1);
			if ( !(((((_la - 84)) & ~0x3f) == 0 && ((1L << (_la - 84)) & 2324138882699886593L) != 0)) ) {
				((Drop_stmtContext)_localctx).object = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(867);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,106,_ctx) ) {
			case 1:
				{
				setState(865);
				match(IF_);
				setState(866);
				match(EXISTS_);
				}
				break;
			}
			setState(872);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,107,_ctx) ) {
			case 1:
				{
				setState(869);
				schema_name();
				setState(870);
				match(DOT);
				}
				break;
			}
			setState(874);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExprContext extends ParserRuleContext {
		public Literal_valueContext literal_value() {
			return getRuleContext(Literal_valueContext.class,0);
		}
		public TerminalNode BIND_PARAMETER() { return getToken(SQLiteParser.BIND_PARAMETER, 0); }
		public Column_nameContext column_name() {
			return getRuleContext(Column_nameContext.class,0);
		}
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public List<TerminalNode> DOT() { return getTokens(SQLiteParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(SQLiteParser.DOT, i);
		}
		public Schema_nameContext schema_name() {
			return getRuleContext(Schema_nameContext.class,0);
		}
		public Unary_operatorContext unary_operator() {
			return getRuleContext(Unary_operatorContext.class,0);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public Function_nameContext function_name() {
			return getRuleContext(Function_nameContext.class,0);
		}
		public TerminalNode OPEN_PAR() { return getToken(SQLiteParser.OPEN_PAR, 0); }
		public TerminalNode CLOSE_PAR() { return getToken(SQLiteParser.CLOSE_PAR, 0); }
		public TerminalNode STAR() { return getToken(SQLiteParser.STAR, 0); }
		public Filter_clauseContext filter_clause() {
			return getRuleContext(Filter_clauseContext.class,0);
		}
		public Over_clauseContext over_clause() {
			return getRuleContext(Over_clauseContext.class,0);
		}
		public TerminalNode DISTINCT_() { return getToken(SQLiteParser.DISTINCT_, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SQLiteParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLiteParser.COMMA, i);
		}
		public TerminalNode CAST_() { return getToken(SQLiteParser.CAST_, 0); }
		public TerminalNode AS_() { return getToken(SQLiteParser.AS_, 0); }
		public Type_nameContext type_name() {
			return getRuleContext(Type_nameContext.class,0);
		}
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public TerminalNode EXISTS_() { return getToken(SQLiteParser.EXISTS_, 0); }
		public TerminalNode NOT_() { return getToken(SQLiteParser.NOT_, 0); }
		public TerminalNode CASE_() { return getToken(SQLiteParser.CASE_, 0); }
		public TerminalNode END_() { return getToken(SQLiteParser.END_, 0); }
		public List<TerminalNode> WHEN_() { return getTokens(SQLiteParser.WHEN_); }
		public TerminalNode WHEN_(int i) {
			return getToken(SQLiteParser.WHEN_, i);
		}
		public List<TerminalNode> THEN_() { return getTokens(SQLiteParser.THEN_); }
		public TerminalNode THEN_(int i) {
			return getToken(SQLiteParser.THEN_, i);
		}
		public TerminalNode ELSE_() { return getToken(SQLiteParser.ELSE_, 0); }
		public Raise_functionContext raise_function() {
			return getRuleContext(Raise_functionContext.class,0);
		}
		public TerminalNode PIPE2() { return getToken(SQLiteParser.PIPE2, 0); }
		public TerminalNode DIV() { return getToken(SQLiteParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(SQLiteParser.MOD, 0); }
		public TerminalNode PLUS() { return getToken(SQLiteParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(SQLiteParser.MINUS, 0); }
		public TerminalNode LT2() { return getToken(SQLiteParser.LT2, 0); }
		public TerminalNode GT2() { return getToken(SQLiteParser.GT2, 0); }
		public TerminalNode AMP() { return getToken(SQLiteParser.AMP, 0); }
		public TerminalNode PIPE() { return getToken(SQLiteParser.PIPE, 0); }
		public TerminalNode LT() { return getToken(SQLiteParser.LT, 0); }
		public TerminalNode LT_EQ() { return getToken(SQLiteParser.LT_EQ, 0); }
		public TerminalNode GT() { return getToken(SQLiteParser.GT, 0); }
		public TerminalNode GT_EQ() { return getToken(SQLiteParser.GT_EQ, 0); }
		public TerminalNode ASSIGN() { return getToken(SQLiteParser.ASSIGN, 0); }
		public TerminalNode EQ() { return getToken(SQLiteParser.EQ, 0); }
		public TerminalNode NOT_EQ1() { return getToken(SQLiteParser.NOT_EQ1, 0); }
		public TerminalNode NOT_EQ2() { return getToken(SQLiteParser.NOT_EQ2, 0); }
		public TerminalNode IS_() { return getToken(SQLiteParser.IS_, 0); }
		public TerminalNode FROM_() { return getToken(SQLiteParser.FROM_, 0); }
		public TerminalNode IN_() { return getToken(SQLiteParser.IN_, 0); }
		public TerminalNode LIKE_() { return getToken(SQLiteParser.LIKE_, 0); }
		public TerminalNode GLOB_() { return getToken(SQLiteParser.GLOB_, 0); }
		public TerminalNode MATCH_() { return getToken(SQLiteParser.MATCH_, 0); }
		public TerminalNode REGEXP_() { return getToken(SQLiteParser.REGEXP_, 0); }
		public TerminalNode AND_() { return getToken(SQLiteParser.AND_, 0); }
		public TerminalNode OR_() { return getToken(SQLiteParser.OR_, 0); }
		public TerminalNode BETWEEN_() { return getToken(SQLiteParser.BETWEEN_, 0); }
		public TerminalNode COLLATE_() { return getToken(SQLiteParser.COLLATE_, 0); }
		public Collation_nameContext collation_name() {
			return getRuleContext(Collation_nameContext.class,0);
		}
		public TerminalNode ESCAPE_() { return getToken(SQLiteParser.ESCAPE_, 0); }
		public TerminalNode ISNULL_() { return getToken(SQLiteParser.ISNULL_, 0); }
		public TerminalNode NOTNULL_() { return getToken(SQLiteParser.NOTNULL_, 0); }
		public TerminalNode NULL_() { return getToken(SQLiteParser.NULL_, 0); }
		public Table_function_nameContext table_function_name() {
			return getRuleContext(Table_function_nameContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 64;
		enterRecursionRule(_localctx, 64, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(964);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,121,_ctx) ) {
			case 1:
				{
				setState(877);
				literal_value();
				}
				break;
			case 2:
				{
				setState(878);
				match(BIND_PARAMETER);
				}
				break;
			case 3:
				{
				setState(887);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,109,_ctx) ) {
				case 1:
					{
					setState(882);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,108,_ctx) ) {
					case 1:
						{
						setState(879);
						schema_name();
						setState(880);
						match(DOT);
						}
						break;
					}
					setState(884);
					table_name();
					setState(885);
					match(DOT);
					}
					break;
				}
				setState(889);
				column_name();
				}
				break;
			case 4:
				{
				setState(890);
				unary_operator();
				setState(891);
				expr(21);
				}
				break;
			case 5:
				{
				setState(893);
				function_name();
				setState(894);
				match(OPEN_PAR);
				setState(907);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case OPEN_PAR:
				case PLUS:
				case MINUS:
				case TILDE:
				case ABORT_:
				case ACTION_:
				case ADD_:
				case AFTER_:
				case ALL_:
				case ALTER_:
				case ANALYZE_:
				case AND_:
				case AS_:
				case ASC_:
				case ATTACH_:
				case AUTOINCREMENT_:
				case BEFORE_:
				case BEGIN_:
				case BETWEEN_:
				case BY_:
				case CASCADE_:
				case CASE_:
				case CAST_:
				case CHECK_:
				case COLLATE_:
				case COLUMN_:
				case COMMIT_:
				case CONFLICT_:
				case CONSTRAINT_:
				case CREATE_:
				case CROSS_:
				case CURRENT_DATE_:
				case CURRENT_TIME_:
				case CURRENT_TIMESTAMP_:
				case DATABASE_:
				case DEFAULT_:
				case DEFERRABLE_:
				case DEFERRED_:
				case DELETE_:
				case DESC_:
				case DETACH_:
				case DISTINCT_:
				case DROP_:
				case EACH_:
				case ELSE_:
				case END_:
				case ESCAPE_:
				case EXCEPT_:
				case EXCLUSIVE_:
				case EXISTS_:
				case EXPLAIN_:
				case FAIL_:
				case FOR_:
				case FOREIGN_:
				case FROM_:
				case FULL_:
				case GLOB_:
				case GROUP_:
				case HAVING_:
				case IF_:
				case IGNORE_:
				case IMMEDIATE_:
				case IN_:
				case INDEX_:
				case INDEXED_:
				case INITIALLY_:
				case INNER_:
				case INSERT_:
				case INSTEAD_:
				case INTERSECT_:
				case INTO_:
				case IS_:
				case ISNULL_:
				case JOIN_:
				case KEY_:
				case LEFT_:
				case LIKE_:
				case LIMIT_:
				case MATCH_:
				case NATURAL_:
				case NO_:
				case NOT_:
				case NOTNULL_:
				case NULL_:
				case OF_:
				case OFFSET_:
				case ON_:
				case OR_:
				case ORDER_:
				case OUTER_:
				case PLAN_:
				case PRAGMA_:
				case PRIMARY_:
				case QUERY_:
				case RAISE_:
				case RECURSIVE_:
				case REFERENCES_:
				case REGEXP_:
				case REINDEX_:
				case RELEASE_:
				case RENAME_:
				case REPLACE_:
				case RESTRICT_:
				case RIGHT_:
				case ROLLBACK_:
				case ROW_:
				case ROWS_:
				case SAVEPOINT_:
				case SELECT_:
				case SET_:
				case TABLE_:
				case TEMP_:
				case TEMPORARY_:
				case THEN_:
				case TO_:
				case TRANSACTION_:
				case TRIGGER_:
				case UNION_:
				case UNIQUE_:
				case UPDATE_:
				case USING_:
				case VACUUM_:
				case VALUES_:
				case VIEW_:
				case VIRTUAL_:
				case WHEN_:
				case WHERE_:
				case WITH_:
				case WITHOUT_:
				case FIRST_VALUE_:
				case OVER_:
				case PARTITION_:
				case RANGE_:
				case PRECEDING_:
				case UNBOUNDED_:
				case CURRENT_:
				case FOLLOWING_:
				case CUME_DIST_:
				case DENSE_RANK_:
				case LAG_:
				case LAST_VALUE_:
				case LEAD_:
				case NTH_VALUE_:
				case NTILE_:
				case PERCENT_RANK_:
				case RANK_:
				case ROW_NUMBER_:
				case GENERATED_:
				case ALWAYS_:
				case STORED_:
				case TRUE_:
				case FALSE_:
				case WINDOW_:
				case NULLS_:
				case FIRST_:
				case LAST_:
				case FILTER_:
				case GROUPS_:
				case EXCLUDE_:
				case IDENTIFIER:
				case NUMERIC_LITERAL:
				case BIND_PARAMETER:
				case STRING_LITERAL:
				case BLOB_LITERAL:
					{
					{
					setState(896);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,110,_ctx) ) {
					case 1:
						{
						setState(895);
						match(DISTINCT_);
						}
						break;
					}
					setState(898);
					expr(0);
					setState(903);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(899);
						match(COMMA);
						setState(900);
						expr(0);
						}
						}
						setState(905);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					}
					break;
				case STAR:
					{
					setState(906);
					match(STAR);
					}
					break;
				case CLOSE_PAR:
					break;
				default:
					break;
				}
				setState(909);
				match(CLOSE_PAR);
				setState(911);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,113,_ctx) ) {
				case 1:
					{
					setState(910);
					filter_clause();
					}
					break;
				}
				setState(914);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,114,_ctx) ) {
				case 1:
					{
					setState(913);
					over_clause();
					}
					break;
				}
				}
				break;
			case 6:
				{
				setState(916);
				match(OPEN_PAR);
				setState(917);
				expr(0);
				setState(922);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(918);
					match(COMMA);
					setState(919);
					expr(0);
					}
					}
					setState(924);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(925);
				match(CLOSE_PAR);
				}
				break;
			case 7:
				{
				setState(927);
				match(CAST_);
				setState(928);
				match(OPEN_PAR);
				setState(929);
				expr(0);
				setState(930);
				match(AS_);
				setState(931);
				type_name();
				setState(932);
				match(CLOSE_PAR);
				}
				break;
			case 8:
				{
				setState(938);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EXISTS_ || _la==NOT_) {
					{
					setState(935);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==NOT_) {
						{
						setState(934);
						match(NOT_);
						}
					}

					setState(937);
					match(EXISTS_);
					}
				}

				setState(940);
				match(OPEN_PAR);
				setState(941);
				select_stmt();
				setState(942);
				match(CLOSE_PAR);
				}
				break;
			case 9:
				{
				setState(944);
				match(CASE_);
				setState(946);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,118,_ctx) ) {
				case 1:
					{
					setState(945);
					expr(0);
					}
					break;
				}
				setState(953); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(948);
					match(WHEN_);
					setState(949);
					expr(0);
					setState(950);
					match(THEN_);
					setState(951);
					expr(0);
					}
					}
					setState(955); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==WHEN_ );
				setState(959);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ELSE_) {
					{
					setState(957);
					match(ELSE_);
					setState(958);
					expr(0);
					}
				}

				setState(961);
				match(END_);
				}
				break;
			case 10:
				{
				setState(963);
				raise_function();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1091);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,138,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1089);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,137,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(966);
						if (!(precpred(_ctx, 20))) throw new FailedPredicateException(this, "precpred(_ctx, 20)");
						setState(967);
						match(PIPE2);
						setState(968);
						expr(21);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(969);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(970);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 12416L) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(971);
						expr(20);
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(972);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(973);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(974);
						expr(19);
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(975);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(976);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 245760L) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(977);
						expr(18);
						}
						break;
					case 5:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(978);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(979);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 3932160L) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(980);
						expr(17);
						}
						break;
					case 6:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(981);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(1000);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,123,_ctx) ) {
						case 1:
							{
							setState(982);
							match(ASSIGN);
							}
							break;
						case 2:
							{
							setState(983);
							match(EQ);
							}
							break;
						case 3:
							{
							setState(984);
							match(NOT_EQ1);
							}
							break;
						case 4:
							{
							setState(985);
							match(NOT_EQ2);
							}
							break;
						case 5:
							{
							setState(986);
							match(IS_);
							}
							break;
						case 6:
							{
							setState(987);
							match(IS_);
							setState(988);
							match(NOT_);
							}
							break;
						case 7:
							{
							setState(989);
							match(IS_);
							setState(991);
							_errHandler.sync(this);
							_la = _input.LA(1);
							if (_la==NOT_) {
								{
								setState(990);
								match(NOT_);
								}
							}

							setState(993);
							match(DISTINCT_);
							setState(994);
							match(FROM_);
							}
							break;
						case 8:
							{
							setState(995);
							match(IN_);
							}
							break;
						case 9:
							{
							setState(996);
							match(LIKE_);
							}
							break;
						case 10:
							{
							setState(997);
							match(GLOB_);
							}
							break;
						case 11:
							{
							setState(998);
							match(MATCH_);
							}
							break;
						case 12:
							{
							setState(999);
							match(REGEXP_);
							}
							break;
						}
						setState(1002);
						expr(16);
						}
						break;
					case 7:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1003);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(1004);
						match(AND_);
						setState(1005);
						expr(15);
						}
						break;
					case 8:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1006);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(1007);
						match(OR_);
						setState(1008);
						expr(14);
						}
						break;
					case 9:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1009);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(1010);
						match(IS_);
						setState(1012);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,124,_ctx) ) {
						case 1:
							{
							setState(1011);
							match(NOT_);
							}
							break;
						}
						setState(1014);
						expr(7);
						}
						break;
					case 10:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1015);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(1017);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==NOT_) {
							{
							setState(1016);
							match(NOT_);
							}
						}

						setState(1019);
						match(BETWEEN_);
						setState(1020);
						expr(0);
						setState(1021);
						match(AND_);
						setState(1022);
						expr(6);
						}
						break;
					case 11:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1024);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(1025);
						match(COLLATE_);
						setState(1026);
						collation_name();
						}
						break;
					case 12:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1027);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(1029);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==NOT_) {
							{
							setState(1028);
							match(NOT_);
							}
						}

						setState(1031);
						_la = _input.LA(1);
						if ( !(((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & 2199028498433L) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1032);
						expr(0);
						setState(1035);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,127,_ctx) ) {
						case 1:
							{
							setState(1033);
							match(ESCAPE_);
							setState(1034);
							expr(0);
							}
							break;
						}
						}
						break;
					case 13:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1037);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(1042);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case ISNULL_:
							{
							setState(1038);
							match(ISNULL_);
							}
							break;
						case NOTNULL_:
							{
							setState(1039);
							match(NOTNULL_);
							}
							break;
						case NOT_:
							{
							setState(1040);
							match(NOT_);
							setState(1041);
							match(NULL_);
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						}
						break;
					case 14:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1044);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(1046);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==NOT_) {
							{
							setState(1045);
							match(NOT_);
							}
						}

						setState(1048);
						match(IN_);
						setState(1087);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,136,_ctx) ) {
						case 1:
							{
							setState(1049);
							match(OPEN_PAR);
							setState(1059);
							_errHandler.sync(this);
							switch ( getInterpreter().adaptivePredict(_input,131,_ctx) ) {
							case 1:
								{
								setState(1050);
								select_stmt();
								}
								break;
							case 2:
								{
								setState(1051);
								expr(0);
								setState(1056);
								_errHandler.sync(this);
								_la = _input.LA(1);
								while (_la==COMMA) {
									{
									{
									setState(1052);
									match(COMMA);
									setState(1053);
									expr(0);
									}
									}
									setState(1058);
									_errHandler.sync(this);
									_la = _input.LA(1);
								}
								}
								break;
							}
							setState(1061);
							match(CLOSE_PAR);
							}
							break;
						case 2:
							{
							setState(1065);
							_errHandler.sync(this);
							switch ( getInterpreter().adaptivePredict(_input,132,_ctx) ) {
							case 1:
								{
								setState(1062);
								schema_name();
								setState(1063);
								match(DOT);
								}
								break;
							}
							setState(1067);
							table_name();
							}
							break;
						case 3:
							{
							setState(1071);
							_errHandler.sync(this);
							switch ( getInterpreter().adaptivePredict(_input,133,_ctx) ) {
							case 1:
								{
								setState(1068);
								schema_name();
								setState(1069);
								match(DOT);
								}
								break;
							}
							setState(1073);
							table_function_name();
							setState(1074);
							match(OPEN_PAR);
							setState(1083);
							_errHandler.sync(this);
							_la = _input.LA(1);
							if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -33552632L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & -1152921504606846977L) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & 4476578029606273023L) != 0)) {
								{
								setState(1075);
								expr(0);
								setState(1080);
								_errHandler.sync(this);
								_la = _input.LA(1);
								while (_la==COMMA) {
									{
									{
									setState(1076);
									match(COMMA);
									setState(1077);
									expr(0);
									}
									}
									setState(1082);
									_errHandler.sync(this);
									_la = _input.LA(1);
								}
								}
							}

							setState(1085);
							match(CLOSE_PAR);
							}
							break;
						}
						}
						break;
					}
					} 
				}
				setState(1093);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,138,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Raise_functionContext extends ParserRuleContext {
		public TerminalNode RAISE_() { return getToken(SQLiteParser.RAISE_, 0); }
		public TerminalNode OPEN_PAR() { return getToken(SQLiteParser.OPEN_PAR, 0); }
		public TerminalNode CLOSE_PAR() { return getToken(SQLiteParser.CLOSE_PAR, 0); }
		public TerminalNode IGNORE_() { return getToken(SQLiteParser.IGNORE_, 0); }
		public TerminalNode COMMA() { return getToken(SQLiteParser.COMMA, 0); }
		public Error_messageContext error_message() {
			return getRuleContext(Error_messageContext.class,0);
		}
		public TerminalNode ROLLBACK_() { return getToken(SQLiteParser.ROLLBACK_, 0); }
		public TerminalNode ABORT_() { return getToken(SQLiteParser.ABORT_, 0); }
		public TerminalNode FAIL_() { return getToken(SQLiteParser.FAIL_, 0); }
		public Raise_functionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_raise_function; }
	}

	public final Raise_functionContext raise_function() throws RecognitionException {
		Raise_functionContext _localctx = new Raise_functionContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_raise_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1094);
			match(RAISE_);
			setState(1095);
			match(OPEN_PAR);
			setState(1100);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IGNORE_:
				{
				setState(1096);
				match(IGNORE_);
				}
				break;
			case ABORT_:
			case FAIL_:
			case ROLLBACK_:
				{
				setState(1097);
				_la = _input.LA(1);
				if ( !(_la==ABORT_ || _la==FAIL_ || _la==ROLLBACK_) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1098);
				match(COMMA);
				setState(1099);
				error_message();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1102);
			match(CLOSE_PAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Literal_valueContext extends ParserRuleContext {
		public TerminalNode NUMERIC_LITERAL() { return getToken(SQLiteParser.NUMERIC_LITERAL, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(SQLiteParser.STRING_LITERAL, 0); }
		public TerminalNode BLOB_LITERAL() { return getToken(SQLiteParser.BLOB_LITERAL, 0); }
		public TerminalNode NULL_() { return getToken(SQLiteParser.NULL_, 0); }
		public TerminalNode TRUE_() { return getToken(SQLiteParser.TRUE_, 0); }
		public TerminalNode FALSE_() { return getToken(SQLiteParser.FALSE_, 0); }
		public TerminalNode CURRENT_TIME_() { return getToken(SQLiteParser.CURRENT_TIME_, 0); }
		public TerminalNode CURRENT_DATE_() { return getToken(SQLiteParser.CURRENT_DATE_, 0); }
		public TerminalNode CURRENT_TIMESTAMP_() { return getToken(SQLiteParser.CURRENT_TIMESTAMP_, 0); }
		public Literal_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal_value; }
	}

	public final Literal_valueContext literal_value() throws RecognitionException {
		Literal_valueContext _localctx = new Literal_valueContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_literal_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1104);
			_la = _input.LA(1);
			if ( !(((((_la - 52)) & ~0x3f) == 0 && ((1L << (_la - 52)) & 4503599627370503L) != 0) || ((((_la - 172)) & ~0x3f) == 0 && ((1L << (_la - 172)) & 212995L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Value_rowContext extends ParserRuleContext {
		public TerminalNode OPEN_PAR() { return getToken(SQLiteParser.OPEN_PAR, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SQLiteParser.CLOSE_PAR, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SQLiteParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLiteParser.COMMA, i);
		}
		public Value_rowContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value_row; }
	}

	public final Value_rowContext value_row() throws RecognitionException {
		Value_rowContext _localctx = new Value_rowContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_value_row);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1106);
			match(OPEN_PAR);
			setState(1107);
			expr(0);
			setState(1112);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1108);
				match(COMMA);
				setState(1109);
				expr(0);
				}
				}
				setState(1114);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1115);
			match(CLOSE_PAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Values_clauseContext extends ParserRuleContext {
		public TerminalNode VALUES_() { return getToken(SQLiteParser.VALUES_, 0); }
		public List<Value_rowContext> value_row() {
			return getRuleContexts(Value_rowContext.class);
		}
		public Value_rowContext value_row(int i) {
			return getRuleContext(Value_rowContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SQLiteParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLiteParser.COMMA, i);
		}
		public Values_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_values_clause; }
	}

	public final Values_clauseContext values_clause() throws RecognitionException {
		Values_clauseContext _localctx = new Values_clauseContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_values_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1117);
			match(VALUES_);
			setState(1118);
			value_row();
			setState(1123);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1119);
				match(COMMA);
				setState(1120);
				value_row();
				}
				}
				setState(1125);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Insert_stmtContext extends ParserRuleContext {
		public TerminalNode INTO_() { return getToken(SQLiteParser.INTO_, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode INSERT_() { return getToken(SQLiteParser.INSERT_, 0); }
		public TerminalNode REPLACE_() { return getToken(SQLiteParser.REPLACE_, 0); }
		public TerminalNode OR_() { return getToken(SQLiteParser.OR_, 0); }
		public TerminalNode DEFAULT_() { return getToken(SQLiteParser.DEFAULT_, 0); }
		public TerminalNode VALUES_() { return getToken(SQLiteParser.VALUES_, 0); }
		public With_clauseContext with_clause() {
			return getRuleContext(With_clauseContext.class,0);
		}
		public TerminalNode ROLLBACK_() { return getToken(SQLiteParser.ROLLBACK_, 0); }
		public TerminalNode ABORT_() { return getToken(SQLiteParser.ABORT_, 0); }
		public TerminalNode FAIL_() { return getToken(SQLiteParser.FAIL_, 0); }
		public TerminalNode IGNORE_() { return getToken(SQLiteParser.IGNORE_, 0); }
		public Schema_nameContext schema_name() {
			return getRuleContext(Schema_nameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(SQLiteParser.DOT, 0); }
		public TerminalNode AS_() { return getToken(SQLiteParser.AS_, 0); }
		public Table_aliasContext table_alias() {
			return getRuleContext(Table_aliasContext.class,0);
		}
		public TerminalNode OPEN_PAR() { return getToken(SQLiteParser.OPEN_PAR, 0); }
		public List<Column_nameContext> column_name() {
			return getRuleContexts(Column_nameContext.class);
		}
		public Column_nameContext column_name(int i) {
			return getRuleContext(Column_nameContext.class,i);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SQLiteParser.CLOSE_PAR, 0); }
		public Returning_clauseContext returning_clause() {
			return getRuleContext(Returning_clauseContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(SQLiteParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLiteParser.COMMA, i);
		}
		public Values_clauseContext values_clause() {
			return getRuleContext(Values_clauseContext.class,0);
		}
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public Upsert_clauseContext upsert_clause() {
			return getRuleContext(Upsert_clauseContext.class,0);
		}
		public Insert_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insert_stmt; }
	}

	public final Insert_stmtContext insert_stmt() throws RecognitionException {
		Insert_stmtContext _localctx = new Insert_stmtContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_insert_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1127);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WITH_) {
				{
				setState(1126);
				with_clause();
				}
			}

			setState(1134);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,143,_ctx) ) {
			case 1:
				{
				setState(1129);
				match(INSERT_);
				}
				break;
			case 2:
				{
				setState(1130);
				match(REPLACE_);
				}
				break;
			case 3:
				{
				setState(1131);
				match(INSERT_);
				setState(1132);
				match(OR_);
				setState(1133);
				_la = _input.LA(1);
				if ( !(_la==ABORT_ || ((((_la - 72)) & ~0x3f) == 0 && ((1L << (_la - 72)) & 19140298416325121L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			}
			setState(1136);
			match(INTO_);
			setState(1140);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,144,_ctx) ) {
			case 1:
				{
				setState(1137);
				schema_name();
				setState(1138);
				match(DOT);
				}
				break;
			}
			setState(1142);
			table_name();
			setState(1145);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AS_) {
				{
				setState(1143);
				match(AS_);
				setState(1144);
				table_alias();
				}
			}

			setState(1158);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_PAR) {
				{
				setState(1147);
				match(OPEN_PAR);
				setState(1148);
				column_name();
				setState(1153);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1149);
					match(COMMA);
					setState(1150);
					column_name();
					}
					}
					setState(1155);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1156);
				match(CLOSE_PAR);
				}
			}

			setState(1169);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SELECT_:
			case VALUES_:
			case WITH_:
				{
				{
				setState(1162);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,148,_ctx) ) {
				case 1:
					{
					setState(1160);
					values_clause();
					}
					break;
				case 2:
					{
					setState(1161);
					select_stmt();
					}
					break;
				}
				setState(1165);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ON_) {
					{
					setState(1164);
					upsert_clause();
					}
				}

				}
				}
				break;
			case DEFAULT_:
				{
				setState(1167);
				match(DEFAULT_);
				setState(1168);
				match(VALUES_);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1172);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RETURNING_) {
				{
				setState(1171);
				returning_clause();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Returning_clauseContext extends ParserRuleContext {
		public TerminalNode RETURNING_() { return getToken(SQLiteParser.RETURNING_, 0); }
		public List<Result_columnContext> result_column() {
			return getRuleContexts(Result_columnContext.class);
		}
		public Result_columnContext result_column(int i) {
			return getRuleContext(Result_columnContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SQLiteParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLiteParser.COMMA, i);
		}
		public Returning_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returning_clause; }
	}

	public final Returning_clauseContext returning_clause() throws RecognitionException {
		Returning_clauseContext _localctx = new Returning_clauseContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_returning_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1174);
			match(RETURNING_);
			setState(1175);
			result_column();
			setState(1180);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1176);
				match(COMMA);
				setState(1177);
				result_column();
				}
				}
				setState(1182);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Upsert_clauseContext extends ParserRuleContext {
		public TerminalNode ON_() { return getToken(SQLiteParser.ON_, 0); }
		public TerminalNode CONFLICT_() { return getToken(SQLiteParser.CONFLICT_, 0); }
		public TerminalNode DO_() { return getToken(SQLiteParser.DO_, 0); }
		public TerminalNode NOTHING_() { return getToken(SQLiteParser.NOTHING_, 0); }
		public TerminalNode UPDATE_() { return getToken(SQLiteParser.UPDATE_, 0); }
		public TerminalNode SET_() { return getToken(SQLiteParser.SET_, 0); }
		public TerminalNode OPEN_PAR() { return getToken(SQLiteParser.OPEN_PAR, 0); }
		public List<Indexed_columnContext> indexed_column() {
			return getRuleContexts(Indexed_columnContext.class);
		}
		public Indexed_columnContext indexed_column(int i) {
			return getRuleContext(Indexed_columnContext.class,i);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SQLiteParser.CLOSE_PAR, 0); }
		public List<TerminalNode> ASSIGN() { return getTokens(SQLiteParser.ASSIGN); }
		public TerminalNode ASSIGN(int i) {
			return getToken(SQLiteParser.ASSIGN, i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SQLiteParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLiteParser.COMMA, i);
		}
		public List<TerminalNode> WHERE_() { return getTokens(SQLiteParser.WHERE_); }
		public TerminalNode WHERE_(int i) {
			return getToken(SQLiteParser.WHERE_, i);
		}
		public List<Column_nameContext> column_name() {
			return getRuleContexts(Column_nameContext.class);
		}
		public Column_nameContext column_name(int i) {
			return getRuleContext(Column_nameContext.class,i);
		}
		public List<Column_name_listContext> column_name_list() {
			return getRuleContexts(Column_name_listContext.class);
		}
		public Column_name_listContext column_name_list(int i) {
			return getRuleContext(Column_name_listContext.class,i);
		}
		public Upsert_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_upsert_clause; }
	}

	public final Upsert_clauseContext upsert_clause() throws RecognitionException {
		Upsert_clauseContext _localctx = new Upsert_clauseContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_upsert_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1183);
			match(ON_);
			setState(1184);
			match(CONFLICT_);
			setState(1199);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_PAR) {
				{
				setState(1185);
				match(OPEN_PAR);
				setState(1186);
				indexed_column();
				setState(1191);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1187);
					match(COMMA);
					setState(1188);
					indexed_column();
					}
					}
					setState(1193);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1194);
				match(CLOSE_PAR);
				setState(1197);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHERE_) {
					{
					setState(1195);
					match(WHERE_);
					setState(1196);
					expr(0);
					}
				}

				}
			}

			setState(1201);
			match(DO_);
			setState(1228);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NOTHING_:
				{
				setState(1202);
				match(NOTHING_);
				}
				break;
			case UPDATE_:
				{
				setState(1203);
				match(UPDATE_);
				setState(1204);
				match(SET_);
				{
				setState(1207);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,156,_ctx) ) {
				case 1:
					{
					setState(1205);
					column_name();
					}
					break;
				case 2:
					{
					setState(1206);
					column_name_list();
					}
					break;
				}
				setState(1209);
				match(ASSIGN);
				setState(1210);
				expr(0);
				setState(1221);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1211);
					match(COMMA);
					setState(1214);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,157,_ctx) ) {
					case 1:
						{
						setState(1212);
						column_name();
						}
						break;
					case 2:
						{
						setState(1213);
						column_name_list();
						}
						break;
					}
					setState(1216);
					match(ASSIGN);
					setState(1217);
					expr(0);
					}
					}
					setState(1223);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1226);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHERE_) {
					{
					setState(1224);
					match(WHERE_);
					setState(1225);
					expr(0);
					}
				}

				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Pragma_stmtContext extends ParserRuleContext {
		public TerminalNode PRAGMA_() { return getToken(SQLiteParser.PRAGMA_, 0); }
		public Pragma_nameContext pragma_name() {
			return getRuleContext(Pragma_nameContext.class,0);
		}
		public Schema_nameContext schema_name() {
			return getRuleContext(Schema_nameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(SQLiteParser.DOT, 0); }
		public TerminalNode ASSIGN() { return getToken(SQLiteParser.ASSIGN, 0); }
		public Pragma_valueContext pragma_value() {
			return getRuleContext(Pragma_valueContext.class,0);
		}
		public TerminalNode OPEN_PAR() { return getToken(SQLiteParser.OPEN_PAR, 0); }
		public TerminalNode CLOSE_PAR() { return getToken(SQLiteParser.CLOSE_PAR, 0); }
		public Pragma_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pragma_stmt; }
	}

	public final Pragma_stmtContext pragma_stmt() throws RecognitionException {
		Pragma_stmtContext _localctx = new Pragma_stmtContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_pragma_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1230);
			match(PRAGMA_);
			setState(1234);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,161,_ctx) ) {
			case 1:
				{
				setState(1231);
				schema_name();
				setState(1232);
				match(DOT);
				}
				break;
			}
			setState(1236);
			pragma_name();
			setState(1243);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ASSIGN:
				{
				setState(1237);
				match(ASSIGN);
				setState(1238);
				pragma_value();
				}
				break;
			case OPEN_PAR:
				{
				setState(1239);
				match(OPEN_PAR);
				setState(1240);
				pragma_value();
				setState(1241);
				match(CLOSE_PAR);
				}
				break;
			case EOF:
			case SCOL:
			case ALTER_:
			case ANALYZE_:
			case ATTACH_:
			case BEGIN_:
			case COMMIT_:
			case CREATE_:
			case DELETE_:
			case DETACH_:
			case DROP_:
			case END_:
			case EXPLAIN_:
			case INSERT_:
			case PRAGMA_:
			case REINDEX_:
			case RELEASE_:
			case REPLACE_:
			case ROLLBACK_:
			case SAVEPOINT_:
			case SELECT_:
			case UPDATE_:
			case VACUUM_:
			case VALUES_:
			case WITH_:
				break;
			default:
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Pragma_valueContext extends ParserRuleContext {
		public Signed_numberContext signed_number() {
			return getRuleContext(Signed_numberContext.class,0);
		}
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public TerminalNode STRING_LITERAL() { return getToken(SQLiteParser.STRING_LITERAL, 0); }
		public Pragma_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pragma_value; }
	}

	public final Pragma_valueContext pragma_value() throws RecognitionException {
		Pragma_valueContext _localctx = new Pragma_valueContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_pragma_value);
		try {
			setState(1248);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,163,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1245);
				signed_number();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1246);
				name();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1247);
				match(STRING_LITERAL);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Reindex_stmtContext extends ParserRuleContext {
		public TerminalNode REINDEX_() { return getToken(SQLiteParser.REINDEX_, 0); }
		public Collation_nameContext collation_name() {
			return getRuleContext(Collation_nameContext.class,0);
		}
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public Index_nameContext index_name() {
			return getRuleContext(Index_nameContext.class,0);
		}
		public Schema_nameContext schema_name() {
			return getRuleContext(Schema_nameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(SQLiteParser.DOT, 0); }
		public Reindex_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_reindex_stmt; }
	}

	public final Reindex_stmtContext reindex_stmt() throws RecognitionException {
		Reindex_stmtContext _localctx = new Reindex_stmtContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_reindex_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1250);
			match(REINDEX_);
			setState(1261);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,166,_ctx) ) {
			case 1:
				{
				setState(1251);
				collation_name();
				}
				break;
			case 2:
				{
				setState(1255);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,164,_ctx) ) {
				case 1:
					{
					setState(1252);
					schema_name();
					setState(1253);
					match(DOT);
					}
					break;
				}
				setState(1259);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,165,_ctx) ) {
				case 1:
					{
					setState(1257);
					table_name();
					}
					break;
				case 2:
					{
					setState(1258);
					index_name();
					}
					break;
				}
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Select_stmtContext extends ParserRuleContext {
		public List<Select_coreContext> select_core() {
			return getRuleContexts(Select_coreContext.class);
		}
		public Select_coreContext select_core(int i) {
			return getRuleContext(Select_coreContext.class,i);
		}
		public Common_table_stmtContext common_table_stmt() {
			return getRuleContext(Common_table_stmtContext.class,0);
		}
		public List<Compound_operatorContext> compound_operator() {
			return getRuleContexts(Compound_operatorContext.class);
		}
		public Compound_operatorContext compound_operator(int i) {
			return getRuleContext(Compound_operatorContext.class,i);
		}
		public Order_by_stmtContext order_by_stmt() {
			return getRuleContext(Order_by_stmtContext.class,0);
		}
		public Limit_stmtContext limit_stmt() {
			return getRuleContext(Limit_stmtContext.class,0);
		}
		public Select_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select_stmt; }
	}

	public final Select_stmtContext select_stmt() throws RecognitionException {
		Select_stmtContext _localctx = new Select_stmtContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_select_stmt);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1264);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WITH_) {
				{
				setState(1263);
				common_table_stmt();
				}
			}

			setState(1266);
			select_core();
			setState(1272);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,168,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1267);
					compound_operator();
					setState(1268);
					select_core();
					}
					} 
				}
				setState(1274);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,168,_ctx);
			}
			setState(1276);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ORDER_) {
				{
				setState(1275);
				order_by_stmt();
				}
			}

			setState(1279);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LIMIT_) {
				{
				setState(1278);
				limit_stmt();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Join_clauseContext extends ParserRuleContext {
		public List<Table_or_subqueryContext> table_or_subquery() {
			return getRuleContexts(Table_or_subqueryContext.class);
		}
		public Table_or_subqueryContext table_or_subquery(int i) {
			return getRuleContext(Table_or_subqueryContext.class,i);
		}
		public List<Join_operatorContext> join_operator() {
			return getRuleContexts(Join_operatorContext.class);
		}
		public Join_operatorContext join_operator(int i) {
			return getRuleContext(Join_operatorContext.class,i);
		}
		public List<Join_constraintContext> join_constraint() {
			return getRuleContexts(Join_constraintContext.class);
		}
		public Join_constraintContext join_constraint(int i) {
			return getRuleContext(Join_constraintContext.class,i);
		}
		public Join_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_join_clause; }
	}

	public final Join_clauseContext join_clause() throws RecognitionException {
		Join_clauseContext _localctx = new Join_clauseContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_join_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1281);
			table_or_subquery();
			setState(1289);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA || _la==CROSS_ || ((((_la - 76)) & ~0x3f) == 0 && ((1L << (_la - 76)) & 562949971511297L) != 0)) {
				{
				{
				setState(1282);
				join_operator();
				setState(1283);
				table_or_subquery();
				setState(1285);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,171,_ctx) ) {
				case 1:
					{
					setState(1284);
					join_constraint();
					}
					break;
				}
				}
				}
				setState(1291);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Select_coreContext extends ParserRuleContext {
		public ExprContext whereExpr;
		public ExprContext expr;
		public List<ExprContext> groupByExpr = new ArrayList<ExprContext>();
		public ExprContext havingExpr;
		public TerminalNode SELECT_() { return getToken(SQLiteParser.SELECT_, 0); }
		public List<Result_columnContext> result_column() {
			return getRuleContexts(Result_columnContext.class);
		}
		public Result_columnContext result_column(int i) {
			return getRuleContext(Result_columnContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SQLiteParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLiteParser.COMMA, i);
		}
		public TerminalNode FROM_() { return getToken(SQLiteParser.FROM_, 0); }
		public TerminalNode WHERE_() { return getToken(SQLiteParser.WHERE_, 0); }
		public TerminalNode GROUP_() { return getToken(SQLiteParser.GROUP_, 0); }
		public TerminalNode BY_() { return getToken(SQLiteParser.BY_, 0); }
		public TerminalNode WINDOW_() { return getToken(SQLiteParser.WINDOW_, 0); }
		public List<Window_nameContext> window_name() {
			return getRuleContexts(Window_nameContext.class);
		}
		public Window_nameContext window_name(int i) {
			return getRuleContext(Window_nameContext.class,i);
		}
		public List<TerminalNode> AS_() { return getTokens(SQLiteParser.AS_); }
		public TerminalNode AS_(int i) {
			return getToken(SQLiteParser.AS_, i);
		}
		public List<Window_defnContext> window_defn() {
			return getRuleContexts(Window_defnContext.class);
		}
		public Window_defnContext window_defn(int i) {
			return getRuleContext(Window_defnContext.class,i);
		}
		public TerminalNode DISTINCT_() { return getToken(SQLiteParser.DISTINCT_, 0); }
		public TerminalNode ALL_() { return getToken(SQLiteParser.ALL_, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<Table_or_subqueryContext> table_or_subquery() {
			return getRuleContexts(Table_or_subqueryContext.class);
		}
		public Table_or_subqueryContext table_or_subquery(int i) {
			return getRuleContext(Table_or_subqueryContext.class,i);
		}
		public Join_clauseContext join_clause() {
			return getRuleContext(Join_clauseContext.class,0);
		}
		public TerminalNode HAVING_() { return getToken(SQLiteParser.HAVING_, 0); }
		public Values_clauseContext values_clause() {
			return getRuleContext(Values_clauseContext.class,0);
		}
		public Select_coreContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select_core; }
	}

	public final Select_coreContext select_core() throws RecognitionException {
		Select_coreContext _localctx = new Select_coreContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_select_core);
		int _la;
		try {
			setState(1355);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SELECT_:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(1292);
				match(SELECT_);
				setState(1294);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,173,_ctx) ) {
				case 1:
					{
					setState(1293);
					_la = _input.LA(1);
					if ( !(_la==ALL_ || _la==DISTINCT_) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					break;
				}
				setState(1296);
				result_column();
				setState(1301);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1297);
					match(COMMA);
					setState(1298);
					result_column();
					}
					}
					setState(1303);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1316);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==FROM_) {
					{
					setState(1304);
					match(FROM_);
					setState(1314);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,176,_ctx) ) {
					case 1:
						{
						setState(1305);
						table_or_subquery();
						setState(1310);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==COMMA) {
							{
							{
							setState(1306);
							match(COMMA);
							setState(1307);
							table_or_subquery();
							}
							}
							setState(1312);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						}
						break;
					case 2:
						{
						setState(1313);
						join_clause();
						}
						break;
					}
					}
				}

				setState(1320);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHERE_) {
					{
					setState(1318);
					match(WHERE_);
					setState(1319);
					((Select_coreContext)_localctx).whereExpr = expr(0);
					}
				}

				setState(1336);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==GROUP_) {
					{
					setState(1322);
					match(GROUP_);
					setState(1323);
					match(BY_);
					setState(1324);
					((Select_coreContext)_localctx).expr = expr(0);
					((Select_coreContext)_localctx).groupByExpr.add(((Select_coreContext)_localctx).expr);
					setState(1329);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(1325);
						match(COMMA);
						setState(1326);
						((Select_coreContext)_localctx).expr = expr(0);
						((Select_coreContext)_localctx).groupByExpr.add(((Select_coreContext)_localctx).expr);
						}
						}
						setState(1331);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1334);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==HAVING_) {
						{
						setState(1332);
						match(HAVING_);
						setState(1333);
						((Select_coreContext)_localctx).havingExpr = expr(0);
						}
					}

					}
				}

				setState(1352);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WINDOW_) {
					{
					setState(1338);
					match(WINDOW_);
					setState(1339);
					window_name();
					setState(1340);
					match(AS_);
					setState(1341);
					window_defn();
					setState(1349);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(1342);
						match(COMMA);
						setState(1343);
						window_name();
						setState(1344);
						match(AS_);
						setState(1345);
						window_defn();
						}
						}
						setState(1351);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				}
				}
				break;
			case VALUES_:
				enterOuterAlt(_localctx, 2);
				{
				setState(1354);
				values_clause();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Factored_select_stmtContext extends ParserRuleContext {
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public Factored_select_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factored_select_stmt; }
	}

	public final Factored_select_stmtContext factored_select_stmt() throws RecognitionException {
		Factored_select_stmtContext _localctx = new Factored_select_stmtContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_factored_select_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1357);
			select_stmt();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Simple_select_stmtContext extends ParserRuleContext {
		public Select_coreContext select_core() {
			return getRuleContext(Select_coreContext.class,0);
		}
		public Common_table_stmtContext common_table_stmt() {
			return getRuleContext(Common_table_stmtContext.class,0);
		}
		public Order_by_stmtContext order_by_stmt() {
			return getRuleContext(Order_by_stmtContext.class,0);
		}
		public Limit_stmtContext limit_stmt() {
			return getRuleContext(Limit_stmtContext.class,0);
		}
		public Simple_select_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simple_select_stmt; }
	}

	public final Simple_select_stmtContext simple_select_stmt() throws RecognitionException {
		Simple_select_stmtContext _localctx = new Simple_select_stmtContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_simple_select_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1360);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WITH_) {
				{
				setState(1359);
				common_table_stmt();
				}
			}

			setState(1362);
			select_core();
			setState(1364);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ORDER_) {
				{
				setState(1363);
				order_by_stmt();
				}
			}

			setState(1367);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LIMIT_) {
				{
				setState(1366);
				limit_stmt();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Compound_select_stmtContext extends ParserRuleContext {
		public List<Select_coreContext> select_core() {
			return getRuleContexts(Select_coreContext.class);
		}
		public Select_coreContext select_core(int i) {
			return getRuleContext(Select_coreContext.class,i);
		}
		public Common_table_stmtContext common_table_stmt() {
			return getRuleContext(Common_table_stmtContext.class,0);
		}
		public Order_by_stmtContext order_by_stmt() {
			return getRuleContext(Order_by_stmtContext.class,0);
		}
		public Limit_stmtContext limit_stmt() {
			return getRuleContext(Limit_stmtContext.class,0);
		}
		public List<TerminalNode> UNION_() { return getTokens(SQLiteParser.UNION_); }
		public TerminalNode UNION_(int i) {
			return getToken(SQLiteParser.UNION_, i);
		}
		public List<TerminalNode> INTERSECT_() { return getTokens(SQLiteParser.INTERSECT_); }
		public TerminalNode INTERSECT_(int i) {
			return getToken(SQLiteParser.INTERSECT_, i);
		}
		public List<TerminalNode> EXCEPT_() { return getTokens(SQLiteParser.EXCEPT_); }
		public TerminalNode EXCEPT_(int i) {
			return getToken(SQLiteParser.EXCEPT_, i);
		}
		public List<TerminalNode> ALL_() { return getTokens(SQLiteParser.ALL_); }
		public TerminalNode ALL_(int i) {
			return getToken(SQLiteParser.ALL_, i);
		}
		public Compound_select_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compound_select_stmt; }
	}

	public final Compound_select_stmtContext compound_select_stmt() throws RecognitionException {
		Compound_select_stmtContext _localctx = new Compound_select_stmtContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_compound_select_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1370);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WITH_) {
				{
				setState(1369);
				common_table_stmt();
				}
			}

			setState(1372);
			select_core();
			setState(1382); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1379);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case UNION_:
					{
					setState(1373);
					match(UNION_);
					setState(1375);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==ALL_) {
						{
						setState(1374);
						match(ALL_);
						}
					}

					}
					break;
				case INTERSECT_:
					{
					setState(1377);
					match(INTERSECT_);
					}
					break;
				case EXCEPT_:
					{
					setState(1378);
					match(EXCEPT_);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1381);
				select_core();
				}
				}
				setState(1384); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==EXCEPT_ || _la==INTERSECT_ || _la==UNION_ );
			setState(1387);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ORDER_) {
				{
				setState(1386);
				order_by_stmt();
				}
			}

			setState(1390);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LIMIT_) {
				{
				setState(1389);
				limit_stmt();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Table_or_subqueryContext extends ParserRuleContext {
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public Schema_nameContext schema_name() {
			return getRuleContext(Schema_nameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(SQLiteParser.DOT, 0); }
		public Table_aliasContext table_alias() {
			return getRuleContext(Table_aliasContext.class,0);
		}
		public TerminalNode INDEXED_() { return getToken(SQLiteParser.INDEXED_, 0); }
		public TerminalNode BY_() { return getToken(SQLiteParser.BY_, 0); }
		public Index_nameContext index_name() {
			return getRuleContext(Index_nameContext.class,0);
		}
		public TerminalNode NOT_() { return getToken(SQLiteParser.NOT_, 0); }
		public TerminalNode AS_() { return getToken(SQLiteParser.AS_, 0); }
		public Table_function_nameContext table_function_name() {
			return getRuleContext(Table_function_nameContext.class,0);
		}
		public TerminalNode OPEN_PAR() { return getToken(SQLiteParser.OPEN_PAR, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SQLiteParser.CLOSE_PAR, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SQLiteParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLiteParser.COMMA, i);
		}
		public List<Table_or_subqueryContext> table_or_subquery() {
			return getRuleContexts(Table_or_subqueryContext.class);
		}
		public Table_or_subqueryContext table_or_subquery(int i) {
			return getRuleContext(Table_or_subqueryContext.class,i);
		}
		public Join_clauseContext join_clause() {
			return getRuleContext(Join_clauseContext.class,0);
		}
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public Table_or_subqueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_or_subquery; }
	}

	public final Table_or_subqueryContext table_or_subquery() throws RecognitionException {
		Table_or_subqueryContext _localctx = new Table_or_subqueryContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_table_or_subquery);
		int _la;
		try {
			setState(1456);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,206,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(1395);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,194,_ctx) ) {
				case 1:
					{
					setState(1392);
					schema_name();
					setState(1393);
					match(DOT);
					}
					break;
				}
				setState(1397);
				table_name();
				setState(1402);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,196,_ctx) ) {
				case 1:
					{
					setState(1399);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,195,_ctx) ) {
					case 1:
						{
						setState(1398);
						match(AS_);
						}
						break;
					}
					setState(1401);
					table_alias();
					}
					break;
				}
				setState(1409);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case INDEXED_:
					{
					setState(1404);
					match(INDEXED_);
					setState(1405);
					match(BY_);
					setState(1406);
					index_name();
					}
					break;
				case NOT_:
					{
					setState(1407);
					match(NOT_);
					setState(1408);
					match(INDEXED_);
					}
					break;
				case EOF:
				case SCOL:
				case CLOSE_PAR:
				case COMMA:
				case ALTER_:
				case ANALYZE_:
				case ATTACH_:
				case BEGIN_:
				case COMMIT_:
				case CREATE_:
				case CROSS_:
				case DELETE_:
				case DETACH_:
				case DROP_:
				case END_:
				case EXCEPT_:
				case EXPLAIN_:
				case FULL_:
				case GROUP_:
				case INNER_:
				case INSERT_:
				case INTERSECT_:
				case JOIN_:
				case LEFT_:
				case LIMIT_:
				case NATURAL_:
				case ON_:
				case ORDER_:
				case PRAGMA_:
				case REINDEX_:
				case RELEASE_:
				case REPLACE_:
				case RETURNING_:
				case RIGHT_:
				case ROLLBACK_:
				case SAVEPOINT_:
				case SELECT_:
				case UNION_:
				case UPDATE_:
				case USING_:
				case VACUUM_:
				case VALUES_:
				case WHERE_:
				case WITH_:
				case WINDOW_:
					break;
				default:
					break;
				}
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1414);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,198,_ctx) ) {
				case 1:
					{
					setState(1411);
					schema_name();
					setState(1412);
					match(DOT);
					}
					break;
				}
				setState(1416);
				table_function_name();
				setState(1417);
				match(OPEN_PAR);
				setState(1418);
				expr(0);
				setState(1423);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1419);
					match(COMMA);
					setState(1420);
					expr(0);
					}
					}
					setState(1425);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1426);
				match(CLOSE_PAR);
				setState(1431);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,201,_ctx) ) {
				case 1:
					{
					setState(1428);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,200,_ctx) ) {
					case 1:
						{
						setState(1427);
						match(AS_);
						}
						break;
					}
					setState(1430);
					table_alias();
					}
					break;
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1433);
				match(OPEN_PAR);
				setState(1443);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,203,_ctx) ) {
				case 1:
					{
					setState(1434);
					table_or_subquery();
					setState(1439);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(1435);
						match(COMMA);
						setState(1436);
						table_or_subquery();
						}
						}
						setState(1441);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				case 2:
					{
					setState(1442);
					join_clause();
					}
					break;
				}
				setState(1445);
				match(CLOSE_PAR);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1447);
				match(OPEN_PAR);
				setState(1448);
				select_stmt();
				setState(1449);
				match(CLOSE_PAR);
				setState(1454);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,205,_ctx) ) {
				case 1:
					{
					setState(1451);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,204,_ctx) ) {
					case 1:
						{
						setState(1450);
						match(AS_);
						}
						break;
					}
					setState(1453);
					table_alias();
					}
					break;
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Result_columnContext extends ParserRuleContext {
		public TerminalNode STAR() { return getToken(SQLiteParser.STAR, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(SQLiteParser.DOT, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Column_aliasContext column_alias() {
			return getRuleContext(Column_aliasContext.class,0);
		}
		public TerminalNode AS_() { return getToken(SQLiteParser.AS_, 0); }
		public Result_columnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_result_column; }
	}

	public final Result_columnContext result_column() throws RecognitionException {
		Result_columnContext _localctx = new Result_columnContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_result_column);
		int _la;
		try {
			setState(1470);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,209,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1458);
				match(STAR);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1459);
				table_name();
				setState(1460);
				match(DOT);
				setState(1461);
				match(STAR);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1463);
				expr(0);
				setState(1468);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AS_ || _la==IDENTIFIER || _la==STRING_LITERAL) {
					{
					setState(1465);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==AS_) {
						{
						setState(1464);
						match(AS_);
						}
					}

					setState(1467);
					column_alias();
					}
				}

				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Join_operatorContext extends ParserRuleContext {
		public TerminalNode COMMA() { return getToken(SQLiteParser.COMMA, 0); }
		public TerminalNode JOIN_() { return getToken(SQLiteParser.JOIN_, 0); }
		public TerminalNode NATURAL_() { return getToken(SQLiteParser.NATURAL_, 0); }
		public TerminalNode INNER_() { return getToken(SQLiteParser.INNER_, 0); }
		public TerminalNode CROSS_() { return getToken(SQLiteParser.CROSS_, 0); }
		public TerminalNode LEFT_() { return getToken(SQLiteParser.LEFT_, 0); }
		public TerminalNode RIGHT_() { return getToken(SQLiteParser.RIGHT_, 0); }
		public TerminalNode FULL_() { return getToken(SQLiteParser.FULL_, 0); }
		public TerminalNode OUTER_() { return getToken(SQLiteParser.OUTER_, 0); }
		public Join_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_join_operator; }
	}

	public final Join_operatorContext join_operator() throws RecognitionException {
		Join_operatorContext _localctx = new Join_operatorContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_join_operator);
		int _la;
		try {
			setState(1485);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COMMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(1472);
				match(COMMA);
				}
				break;
			case CROSS_:
			case FULL_:
			case INNER_:
			case JOIN_:
			case LEFT_:
			case NATURAL_:
			case RIGHT_:
				enterOuterAlt(_localctx, 2);
				{
				setState(1474);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NATURAL_) {
					{
					setState(1473);
					match(NATURAL_);
					}
				}

				setState(1482);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case FULL_:
				case LEFT_:
				case RIGHT_:
					{
					setState(1476);
					_la = _input.LA(1);
					if ( !(((((_la - 76)) & ~0x3f) == 0 && ((1L << (_la - 76)) & 562949954469889L) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(1478);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==OUTER_) {
						{
						setState(1477);
						match(OUTER_);
						}
					}

					}
					break;
				case INNER_:
					{
					setState(1480);
					match(INNER_);
					}
					break;
				case CROSS_:
					{
					setState(1481);
					match(CROSS_);
					}
					break;
				case JOIN_:
					break;
				default:
					break;
				}
				setState(1484);
				match(JOIN_);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Join_constraintContext extends ParserRuleContext {
		public TerminalNode ON_() { return getToken(SQLiteParser.ON_, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode USING_() { return getToken(SQLiteParser.USING_, 0); }
		public TerminalNode OPEN_PAR() { return getToken(SQLiteParser.OPEN_PAR, 0); }
		public List<Column_nameContext> column_name() {
			return getRuleContexts(Column_nameContext.class);
		}
		public Column_nameContext column_name(int i) {
			return getRuleContext(Column_nameContext.class,i);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SQLiteParser.CLOSE_PAR, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SQLiteParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLiteParser.COMMA, i);
		}
		public Join_constraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_join_constraint; }
	}

	public final Join_constraintContext join_constraint() throws RecognitionException {
		Join_constraintContext _localctx = new Join_constraintContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_join_constraint);
		int _la;
		try {
			setState(1501);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ON_:
				enterOuterAlt(_localctx, 1);
				{
				setState(1487);
				match(ON_);
				setState(1488);
				expr(0);
				}
				break;
			case USING_:
				enterOuterAlt(_localctx, 2);
				{
				setState(1489);
				match(USING_);
				setState(1490);
				match(OPEN_PAR);
				setState(1491);
				column_name();
				setState(1496);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1492);
					match(COMMA);
					setState(1493);
					column_name();
					}
					}
					setState(1498);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1499);
				match(CLOSE_PAR);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Compound_operatorContext extends ParserRuleContext {
		public TerminalNode UNION_() { return getToken(SQLiteParser.UNION_, 0); }
		public TerminalNode ALL_() { return getToken(SQLiteParser.ALL_, 0); }
		public TerminalNode INTERSECT_() { return getToken(SQLiteParser.INTERSECT_, 0); }
		public TerminalNode EXCEPT_() { return getToken(SQLiteParser.EXCEPT_, 0); }
		public Compound_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compound_operator; }
	}

	public final Compound_operatorContext compound_operator() throws RecognitionException {
		Compound_operatorContext _localctx = new Compound_operatorContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_compound_operator);
		int _la;
		try {
			setState(1509);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case UNION_:
				enterOuterAlt(_localctx, 1);
				{
				setState(1503);
				match(UNION_);
				setState(1505);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ALL_) {
					{
					setState(1504);
					match(ALL_);
					}
				}

				}
				break;
			case INTERSECT_:
				enterOuterAlt(_localctx, 2);
				{
				setState(1507);
				match(INTERSECT_);
				}
				break;
			case EXCEPT_:
				enterOuterAlt(_localctx, 3);
				{
				setState(1508);
				match(EXCEPT_);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Update_stmtContext extends ParserRuleContext {
		public TerminalNode UPDATE_() { return getToken(SQLiteParser.UPDATE_, 0); }
		public Qualified_table_nameContext qualified_table_name() {
			return getRuleContext(Qualified_table_nameContext.class,0);
		}
		public TerminalNode SET_() { return getToken(SQLiteParser.SET_, 0); }
		public List<TerminalNode> ASSIGN() { return getTokens(SQLiteParser.ASSIGN); }
		public TerminalNode ASSIGN(int i) {
			return getToken(SQLiteParser.ASSIGN, i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<Column_nameContext> column_name() {
			return getRuleContexts(Column_nameContext.class);
		}
		public Column_nameContext column_name(int i) {
			return getRuleContext(Column_nameContext.class,i);
		}
		public List<Column_name_listContext> column_name_list() {
			return getRuleContexts(Column_name_listContext.class);
		}
		public Column_name_listContext column_name_list(int i) {
			return getRuleContext(Column_name_listContext.class,i);
		}
		public With_clauseContext with_clause() {
			return getRuleContext(With_clauseContext.class,0);
		}
		public TerminalNode OR_() { return getToken(SQLiteParser.OR_, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SQLiteParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLiteParser.COMMA, i);
		}
		public TerminalNode FROM_() { return getToken(SQLiteParser.FROM_, 0); }
		public TerminalNode WHERE_() { return getToken(SQLiteParser.WHERE_, 0); }
		public Returning_clauseContext returning_clause() {
			return getRuleContext(Returning_clauseContext.class,0);
		}
		public TerminalNode ROLLBACK_() { return getToken(SQLiteParser.ROLLBACK_, 0); }
		public TerminalNode ABORT_() { return getToken(SQLiteParser.ABORT_, 0); }
		public TerminalNode REPLACE_() { return getToken(SQLiteParser.REPLACE_, 0); }
		public TerminalNode FAIL_() { return getToken(SQLiteParser.FAIL_, 0); }
		public TerminalNode IGNORE_() { return getToken(SQLiteParser.IGNORE_, 0); }
		public List<Table_or_subqueryContext> table_or_subquery() {
			return getRuleContexts(Table_or_subqueryContext.class);
		}
		public Table_or_subqueryContext table_or_subquery(int i) {
			return getRuleContext(Table_or_subqueryContext.class,i);
		}
		public Join_clauseContext join_clause() {
			return getRuleContext(Join_clauseContext.class,0);
		}
		public Update_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_update_stmt; }
	}

	public final Update_stmtContext update_stmt() throws RecognitionException {
		Update_stmtContext _localctx = new Update_stmtContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_update_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1512);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WITH_) {
				{
				setState(1511);
				with_clause();
				}
			}

			setState(1514);
			match(UPDATE_);
			setState(1517);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,219,_ctx) ) {
			case 1:
				{
				setState(1515);
				match(OR_);
				setState(1516);
				_la = _input.LA(1);
				if ( !(_la==ABORT_ || ((((_la - 72)) & ~0x3f) == 0 && ((1L << (_la - 72)) & 19140298416325121L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			}
			setState(1519);
			qualified_table_name();
			setState(1520);
			match(SET_);
			setState(1523);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,220,_ctx) ) {
			case 1:
				{
				setState(1521);
				column_name();
				}
				break;
			case 2:
				{
				setState(1522);
				column_name_list();
				}
				break;
			}
			setState(1525);
			match(ASSIGN);
			setState(1526);
			expr(0);
			setState(1537);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1527);
				match(COMMA);
				setState(1530);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,221,_ctx) ) {
				case 1:
					{
					setState(1528);
					column_name();
					}
					break;
				case 2:
					{
					setState(1529);
					column_name_list();
					}
					break;
				}
				setState(1532);
				match(ASSIGN);
				setState(1533);
				expr(0);
				}
				}
				setState(1539);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1552);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FROM_) {
				{
				setState(1540);
				match(FROM_);
				setState(1550);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,224,_ctx) ) {
				case 1:
					{
					setState(1541);
					table_or_subquery();
					setState(1546);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(1542);
						match(COMMA);
						setState(1543);
						table_or_subquery();
						}
						}
						setState(1548);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				case 2:
					{
					setState(1549);
					join_clause();
					}
					break;
				}
				}
			}

			setState(1556);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE_) {
				{
				setState(1554);
				match(WHERE_);
				setState(1555);
				expr(0);
				}
			}

			setState(1559);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RETURNING_) {
				{
				setState(1558);
				returning_clause();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Column_name_listContext extends ParserRuleContext {
		public TerminalNode OPEN_PAR() { return getToken(SQLiteParser.OPEN_PAR, 0); }
		public List<Column_nameContext> column_name() {
			return getRuleContexts(Column_nameContext.class);
		}
		public Column_nameContext column_name(int i) {
			return getRuleContext(Column_nameContext.class,i);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SQLiteParser.CLOSE_PAR, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SQLiteParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLiteParser.COMMA, i);
		}
		public Column_name_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_name_list; }
	}

	public final Column_name_listContext column_name_list() throws RecognitionException {
		Column_name_listContext _localctx = new Column_name_listContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_column_name_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1561);
			match(OPEN_PAR);
			setState(1562);
			column_name();
			setState(1567);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1563);
				match(COMMA);
				setState(1564);
				column_name();
				}
				}
				setState(1569);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1570);
			match(CLOSE_PAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Update_stmt_limitedContext extends ParserRuleContext {
		public TerminalNode UPDATE_() { return getToken(SQLiteParser.UPDATE_, 0); }
		public Qualified_table_nameContext qualified_table_name() {
			return getRuleContext(Qualified_table_nameContext.class,0);
		}
		public TerminalNode SET_() { return getToken(SQLiteParser.SET_, 0); }
		public List<TerminalNode> ASSIGN() { return getTokens(SQLiteParser.ASSIGN); }
		public TerminalNode ASSIGN(int i) {
			return getToken(SQLiteParser.ASSIGN, i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<Column_nameContext> column_name() {
			return getRuleContexts(Column_nameContext.class);
		}
		public Column_nameContext column_name(int i) {
			return getRuleContext(Column_nameContext.class,i);
		}
		public List<Column_name_listContext> column_name_list() {
			return getRuleContexts(Column_name_listContext.class);
		}
		public Column_name_listContext column_name_list(int i) {
			return getRuleContext(Column_name_listContext.class,i);
		}
		public With_clauseContext with_clause() {
			return getRuleContext(With_clauseContext.class,0);
		}
		public TerminalNode OR_() { return getToken(SQLiteParser.OR_, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SQLiteParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLiteParser.COMMA, i);
		}
		public TerminalNode WHERE_() { return getToken(SQLiteParser.WHERE_, 0); }
		public Returning_clauseContext returning_clause() {
			return getRuleContext(Returning_clauseContext.class,0);
		}
		public Limit_stmtContext limit_stmt() {
			return getRuleContext(Limit_stmtContext.class,0);
		}
		public TerminalNode ROLLBACK_() { return getToken(SQLiteParser.ROLLBACK_, 0); }
		public TerminalNode ABORT_() { return getToken(SQLiteParser.ABORT_, 0); }
		public TerminalNode REPLACE_() { return getToken(SQLiteParser.REPLACE_, 0); }
		public TerminalNode FAIL_() { return getToken(SQLiteParser.FAIL_, 0); }
		public TerminalNode IGNORE_() { return getToken(SQLiteParser.IGNORE_, 0); }
		public Order_by_stmtContext order_by_stmt() {
			return getRuleContext(Order_by_stmtContext.class,0);
		}
		public Update_stmt_limitedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_update_stmt_limited; }
	}

	public final Update_stmt_limitedContext update_stmt_limited() throws RecognitionException {
		Update_stmt_limitedContext _localctx = new Update_stmt_limitedContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_update_stmt_limited);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1573);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WITH_) {
				{
				setState(1572);
				with_clause();
				}
			}

			setState(1575);
			match(UPDATE_);
			setState(1578);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,230,_ctx) ) {
			case 1:
				{
				setState(1576);
				match(OR_);
				setState(1577);
				_la = _input.LA(1);
				if ( !(_la==ABORT_ || ((((_la - 72)) & ~0x3f) == 0 && ((1L << (_la - 72)) & 19140298416325121L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			}
			setState(1580);
			qualified_table_name();
			setState(1581);
			match(SET_);
			setState(1584);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,231,_ctx) ) {
			case 1:
				{
				setState(1582);
				column_name();
				}
				break;
			case 2:
				{
				setState(1583);
				column_name_list();
				}
				break;
			}
			setState(1586);
			match(ASSIGN);
			setState(1587);
			expr(0);
			setState(1598);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1588);
				match(COMMA);
				setState(1591);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,232,_ctx) ) {
				case 1:
					{
					setState(1589);
					column_name();
					}
					break;
				case 2:
					{
					setState(1590);
					column_name_list();
					}
					break;
				}
				setState(1593);
				match(ASSIGN);
				setState(1594);
				expr(0);
				}
				}
				setState(1600);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1603);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE_) {
				{
				setState(1601);
				match(WHERE_);
				setState(1602);
				expr(0);
				}
			}

			setState(1606);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RETURNING_) {
				{
				setState(1605);
				returning_clause();
				}
			}

			setState(1612);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LIMIT_ || _la==ORDER_) {
				{
				setState(1609);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ORDER_) {
					{
					setState(1608);
					order_by_stmt();
					}
				}

				setState(1611);
				limit_stmt();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Qualified_table_nameContext extends ParserRuleContext {
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public Schema_nameContext schema_name() {
			return getRuleContext(Schema_nameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(SQLiteParser.DOT, 0); }
		public TerminalNode AS_() { return getToken(SQLiteParser.AS_, 0); }
		public AliasContext alias() {
			return getRuleContext(AliasContext.class,0);
		}
		public TerminalNode INDEXED_() { return getToken(SQLiteParser.INDEXED_, 0); }
		public TerminalNode BY_() { return getToken(SQLiteParser.BY_, 0); }
		public Index_nameContext index_name() {
			return getRuleContext(Index_nameContext.class,0);
		}
		public TerminalNode NOT_() { return getToken(SQLiteParser.NOT_, 0); }
		public Qualified_table_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualified_table_name; }
	}

	public final Qualified_table_nameContext qualified_table_name() throws RecognitionException {
		Qualified_table_nameContext _localctx = new Qualified_table_nameContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_qualified_table_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1617);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,238,_ctx) ) {
			case 1:
				{
				setState(1614);
				schema_name();
				setState(1615);
				match(DOT);
				}
				break;
			}
			setState(1619);
			table_name();
			setState(1622);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AS_) {
				{
				setState(1620);
				match(AS_);
				setState(1621);
				alias();
				}
			}

			setState(1629);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INDEXED_:
				{
				setState(1624);
				match(INDEXED_);
				setState(1625);
				match(BY_);
				setState(1626);
				index_name();
				}
				break;
			case NOT_:
				{
				setState(1627);
				match(NOT_);
				setState(1628);
				match(INDEXED_);
				}
				break;
			case EOF:
			case SCOL:
			case ALTER_:
			case ANALYZE_:
			case ATTACH_:
			case BEGIN_:
			case COMMIT_:
			case CREATE_:
			case DELETE_:
			case DETACH_:
			case DROP_:
			case END_:
			case EXPLAIN_:
			case INSERT_:
			case LIMIT_:
			case ORDER_:
			case PRAGMA_:
			case REINDEX_:
			case RELEASE_:
			case REPLACE_:
			case RETURNING_:
			case ROLLBACK_:
			case SAVEPOINT_:
			case SELECT_:
			case SET_:
			case UPDATE_:
			case VACUUM_:
			case VALUES_:
			case WHERE_:
			case WITH_:
				break;
			default:
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Vacuum_stmtContext extends ParserRuleContext {
		public TerminalNode VACUUM_() { return getToken(SQLiteParser.VACUUM_, 0); }
		public Schema_nameContext schema_name() {
			return getRuleContext(Schema_nameContext.class,0);
		}
		public TerminalNode INTO_() { return getToken(SQLiteParser.INTO_, 0); }
		public FilenameContext filename() {
			return getRuleContext(FilenameContext.class,0);
		}
		public Vacuum_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vacuum_stmt; }
	}

	public final Vacuum_stmtContext vacuum_stmt() throws RecognitionException {
		Vacuum_stmtContext _localctx = new Vacuum_stmtContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_vacuum_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1631);
			match(VACUUM_);
			setState(1633);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,241,_ctx) ) {
			case 1:
				{
				setState(1632);
				schema_name();
				}
				break;
			}
			setState(1637);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INTO_) {
				{
				setState(1635);
				match(INTO_);
				setState(1636);
				filename();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Filter_clauseContext extends ParserRuleContext {
		public TerminalNode FILTER_() { return getToken(SQLiteParser.FILTER_, 0); }
		public TerminalNode OPEN_PAR() { return getToken(SQLiteParser.OPEN_PAR, 0); }
		public TerminalNode WHERE_() { return getToken(SQLiteParser.WHERE_, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SQLiteParser.CLOSE_PAR, 0); }
		public Filter_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_filter_clause; }
	}

	public final Filter_clauseContext filter_clause() throws RecognitionException {
		Filter_clauseContext _localctx = new Filter_clauseContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_filter_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1639);
			match(FILTER_);
			setState(1640);
			match(OPEN_PAR);
			setState(1641);
			match(WHERE_);
			setState(1642);
			expr(0);
			setState(1643);
			match(CLOSE_PAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Window_defnContext extends ParserRuleContext {
		public TerminalNode OPEN_PAR() { return getToken(SQLiteParser.OPEN_PAR, 0); }
		public TerminalNode CLOSE_PAR() { return getToken(SQLiteParser.CLOSE_PAR, 0); }
		public TerminalNode ORDER_() { return getToken(SQLiteParser.ORDER_, 0); }
		public List<TerminalNode> BY_() { return getTokens(SQLiteParser.BY_); }
		public TerminalNode BY_(int i) {
			return getToken(SQLiteParser.BY_, i);
		}
		public List<Ordering_termContext> ordering_term() {
			return getRuleContexts(Ordering_termContext.class);
		}
		public Ordering_termContext ordering_term(int i) {
			return getRuleContext(Ordering_termContext.class,i);
		}
		public Base_window_nameContext base_window_name() {
			return getRuleContext(Base_window_nameContext.class,0);
		}
		public TerminalNode PARTITION_() { return getToken(SQLiteParser.PARTITION_, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public Frame_specContext frame_spec() {
			return getRuleContext(Frame_specContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(SQLiteParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLiteParser.COMMA, i);
		}
		public Window_defnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_window_defn; }
	}

	public final Window_defnContext window_defn() throws RecognitionException {
		Window_defnContext _localctx = new Window_defnContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_window_defn);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1645);
			match(OPEN_PAR);
			setState(1647);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,243,_ctx) ) {
			case 1:
				{
				setState(1646);
				base_window_name();
				}
				break;
			}
			setState(1659);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PARTITION_) {
				{
				setState(1649);
				match(PARTITION_);
				setState(1650);
				match(BY_);
				setState(1651);
				expr(0);
				setState(1656);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1652);
					match(COMMA);
					setState(1653);
					expr(0);
					}
					}
					setState(1658);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			{
			setState(1661);
			match(ORDER_);
			setState(1662);
			match(BY_);
			setState(1663);
			ordering_term();
			setState(1668);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1664);
				match(COMMA);
				setState(1665);
				ordering_term();
				}
				}
				setState(1670);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
			setState(1672);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & 2251799880794113L) != 0)) {
				{
				setState(1671);
				frame_spec();
				}
			}

			setState(1674);
			match(CLOSE_PAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Over_clauseContext extends ParserRuleContext {
		public TerminalNode OVER_() { return getToken(SQLiteParser.OVER_, 0); }
		public Window_nameContext window_name() {
			return getRuleContext(Window_nameContext.class,0);
		}
		public TerminalNode OPEN_PAR() { return getToken(SQLiteParser.OPEN_PAR, 0); }
		public TerminalNode CLOSE_PAR() { return getToken(SQLiteParser.CLOSE_PAR, 0); }
		public Base_window_nameContext base_window_name() {
			return getRuleContext(Base_window_nameContext.class,0);
		}
		public TerminalNode PARTITION_() { return getToken(SQLiteParser.PARTITION_, 0); }
		public List<TerminalNode> BY_() { return getTokens(SQLiteParser.BY_); }
		public TerminalNode BY_(int i) {
			return getToken(SQLiteParser.BY_, i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode ORDER_() { return getToken(SQLiteParser.ORDER_, 0); }
		public List<Ordering_termContext> ordering_term() {
			return getRuleContexts(Ordering_termContext.class);
		}
		public Ordering_termContext ordering_term(int i) {
			return getRuleContext(Ordering_termContext.class,i);
		}
		public Frame_specContext frame_spec() {
			return getRuleContext(Frame_specContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(SQLiteParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLiteParser.COMMA, i);
		}
		public Over_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_over_clause; }
	}

	public final Over_clauseContext over_clause() throws RecognitionException {
		Over_clauseContext _localctx = new Over_clauseContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_over_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1676);
			match(OVER_);
			setState(1710);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,254,_ctx) ) {
			case 1:
				{
				setState(1677);
				window_name();
				}
				break;
			case 2:
				{
				setState(1678);
				match(OPEN_PAR);
				setState(1680);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,248,_ctx) ) {
				case 1:
					{
					setState(1679);
					base_window_name();
					}
					break;
				}
				setState(1692);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION_) {
					{
					setState(1682);
					match(PARTITION_);
					setState(1683);
					match(BY_);
					setState(1684);
					expr(0);
					setState(1689);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(1685);
						match(COMMA);
						setState(1686);
						expr(0);
						}
						}
						setState(1691);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(1704);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ORDER_) {
					{
					setState(1694);
					match(ORDER_);
					setState(1695);
					match(BY_);
					setState(1696);
					ordering_term();
					setState(1701);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(1697);
						match(COMMA);
						setState(1698);
						ordering_term();
						}
						}
						setState(1703);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(1707);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & 2251799880794113L) != 0)) {
					{
					setState(1706);
					frame_spec();
					}
				}

				setState(1709);
				match(CLOSE_PAR);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Frame_specContext extends ParserRuleContext {
		public Frame_clauseContext frame_clause() {
			return getRuleContext(Frame_clauseContext.class,0);
		}
		public TerminalNode EXCLUDE_() { return getToken(SQLiteParser.EXCLUDE_, 0); }
		public TerminalNode NO_() { return getToken(SQLiteParser.NO_, 0); }
		public TerminalNode OTHERS_() { return getToken(SQLiteParser.OTHERS_, 0); }
		public TerminalNode CURRENT_() { return getToken(SQLiteParser.CURRENT_, 0); }
		public TerminalNode ROW_() { return getToken(SQLiteParser.ROW_, 0); }
		public TerminalNode GROUP_() { return getToken(SQLiteParser.GROUP_, 0); }
		public TerminalNode TIES_() { return getToken(SQLiteParser.TIES_, 0); }
		public Frame_specContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_frame_spec; }
	}

	public final Frame_specContext frame_spec() throws RecognitionException {
		Frame_specContext _localctx = new Frame_specContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_frame_spec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1712);
			frame_clause();
			setState(1722);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXCLUDE_) {
				{
				setState(1713);
				match(EXCLUDE_);
				setState(1720);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case NO_:
					{
					setState(1714);
					match(NO_);
					setState(1715);
					match(OTHERS_);
					}
					break;
				case CURRENT_:
					{
					setState(1716);
					match(CURRENT_);
					setState(1717);
					match(ROW_);
					}
					break;
				case GROUP_:
					{
					setState(1718);
					match(GROUP_);
					}
					break;
				case TIES_:
					{
					setState(1719);
					match(TIES_);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Frame_clauseContext extends ParserRuleContext {
		public TerminalNode RANGE_() { return getToken(SQLiteParser.RANGE_, 0); }
		public TerminalNode ROWS_() { return getToken(SQLiteParser.ROWS_, 0); }
		public TerminalNode GROUPS_() { return getToken(SQLiteParser.GROUPS_, 0); }
		public Frame_singleContext frame_single() {
			return getRuleContext(Frame_singleContext.class,0);
		}
		public TerminalNode BETWEEN_() { return getToken(SQLiteParser.BETWEEN_, 0); }
		public Frame_leftContext frame_left() {
			return getRuleContext(Frame_leftContext.class,0);
		}
		public TerminalNode AND_() { return getToken(SQLiteParser.AND_, 0); }
		public Frame_rightContext frame_right() {
			return getRuleContext(Frame_rightContext.class,0);
		}
		public Frame_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_frame_clause; }
	}

	public final Frame_clauseContext frame_clause() throws RecognitionException {
		Frame_clauseContext _localctx = new Frame_clauseContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_frame_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1724);
			_la = _input.LA(1);
			if ( !(((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & 2251799880794113L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1731);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,257,_ctx) ) {
			case 1:
				{
				setState(1725);
				frame_single();
				}
				break;
			case 2:
				{
				setState(1726);
				match(BETWEEN_);
				setState(1727);
				frame_left();
				setState(1728);
				match(AND_);
				setState(1729);
				frame_right();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Simple_function_invocationContext extends ParserRuleContext {
		public Simple_funcContext simple_func() {
			return getRuleContext(Simple_funcContext.class,0);
		}
		public TerminalNode OPEN_PAR() { return getToken(SQLiteParser.OPEN_PAR, 0); }
		public TerminalNode CLOSE_PAR() { return getToken(SQLiteParser.CLOSE_PAR, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode STAR() { return getToken(SQLiteParser.STAR, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SQLiteParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLiteParser.COMMA, i);
		}
		public Simple_function_invocationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simple_function_invocation; }
	}

	public final Simple_function_invocationContext simple_function_invocation() throws RecognitionException {
		Simple_function_invocationContext _localctx = new Simple_function_invocationContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_simple_function_invocation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1733);
			simple_func();
			setState(1734);
			match(OPEN_PAR);
			setState(1744);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPEN_PAR:
			case PLUS:
			case MINUS:
			case TILDE:
			case ABORT_:
			case ACTION_:
			case ADD_:
			case AFTER_:
			case ALL_:
			case ALTER_:
			case ANALYZE_:
			case AND_:
			case AS_:
			case ASC_:
			case ATTACH_:
			case AUTOINCREMENT_:
			case BEFORE_:
			case BEGIN_:
			case BETWEEN_:
			case BY_:
			case CASCADE_:
			case CASE_:
			case CAST_:
			case CHECK_:
			case COLLATE_:
			case COLUMN_:
			case COMMIT_:
			case CONFLICT_:
			case CONSTRAINT_:
			case CREATE_:
			case CROSS_:
			case CURRENT_DATE_:
			case CURRENT_TIME_:
			case CURRENT_TIMESTAMP_:
			case DATABASE_:
			case DEFAULT_:
			case DEFERRABLE_:
			case DEFERRED_:
			case DELETE_:
			case DESC_:
			case DETACH_:
			case DISTINCT_:
			case DROP_:
			case EACH_:
			case ELSE_:
			case END_:
			case ESCAPE_:
			case EXCEPT_:
			case EXCLUSIVE_:
			case EXISTS_:
			case EXPLAIN_:
			case FAIL_:
			case FOR_:
			case FOREIGN_:
			case FROM_:
			case FULL_:
			case GLOB_:
			case GROUP_:
			case HAVING_:
			case IF_:
			case IGNORE_:
			case IMMEDIATE_:
			case IN_:
			case INDEX_:
			case INDEXED_:
			case INITIALLY_:
			case INNER_:
			case INSERT_:
			case INSTEAD_:
			case INTERSECT_:
			case INTO_:
			case IS_:
			case ISNULL_:
			case JOIN_:
			case KEY_:
			case LEFT_:
			case LIKE_:
			case LIMIT_:
			case MATCH_:
			case NATURAL_:
			case NO_:
			case NOT_:
			case NOTNULL_:
			case NULL_:
			case OF_:
			case OFFSET_:
			case ON_:
			case OR_:
			case ORDER_:
			case OUTER_:
			case PLAN_:
			case PRAGMA_:
			case PRIMARY_:
			case QUERY_:
			case RAISE_:
			case RECURSIVE_:
			case REFERENCES_:
			case REGEXP_:
			case REINDEX_:
			case RELEASE_:
			case RENAME_:
			case REPLACE_:
			case RESTRICT_:
			case RIGHT_:
			case ROLLBACK_:
			case ROW_:
			case ROWS_:
			case SAVEPOINT_:
			case SELECT_:
			case SET_:
			case TABLE_:
			case TEMP_:
			case TEMPORARY_:
			case THEN_:
			case TO_:
			case TRANSACTION_:
			case TRIGGER_:
			case UNION_:
			case UNIQUE_:
			case UPDATE_:
			case USING_:
			case VACUUM_:
			case VALUES_:
			case VIEW_:
			case VIRTUAL_:
			case WHEN_:
			case WHERE_:
			case WITH_:
			case WITHOUT_:
			case FIRST_VALUE_:
			case OVER_:
			case PARTITION_:
			case RANGE_:
			case PRECEDING_:
			case UNBOUNDED_:
			case CURRENT_:
			case FOLLOWING_:
			case CUME_DIST_:
			case DENSE_RANK_:
			case LAG_:
			case LAST_VALUE_:
			case LEAD_:
			case NTH_VALUE_:
			case NTILE_:
			case PERCENT_RANK_:
			case RANK_:
			case ROW_NUMBER_:
			case GENERATED_:
			case ALWAYS_:
			case STORED_:
			case TRUE_:
			case FALSE_:
			case WINDOW_:
			case NULLS_:
			case FIRST_:
			case LAST_:
			case FILTER_:
			case GROUPS_:
			case EXCLUDE_:
			case IDENTIFIER:
			case NUMERIC_LITERAL:
			case BIND_PARAMETER:
			case STRING_LITERAL:
			case BLOB_LITERAL:
				{
				setState(1735);
				expr(0);
				setState(1740);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1736);
					match(COMMA);
					setState(1737);
					expr(0);
					}
					}
					setState(1742);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case STAR:
				{
				setState(1743);
				match(STAR);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1746);
			match(CLOSE_PAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Aggregate_function_invocationContext extends ParserRuleContext {
		public Aggregate_funcContext aggregate_func() {
			return getRuleContext(Aggregate_funcContext.class,0);
		}
		public TerminalNode OPEN_PAR() { return getToken(SQLiteParser.OPEN_PAR, 0); }
		public TerminalNode CLOSE_PAR() { return getToken(SQLiteParser.CLOSE_PAR, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode STAR() { return getToken(SQLiteParser.STAR, 0); }
		public Filter_clauseContext filter_clause() {
			return getRuleContext(Filter_clauseContext.class,0);
		}
		public TerminalNode DISTINCT_() { return getToken(SQLiteParser.DISTINCT_, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SQLiteParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLiteParser.COMMA, i);
		}
		public Aggregate_function_invocationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aggregate_function_invocation; }
	}

	public final Aggregate_function_invocationContext aggregate_function_invocation() throws RecognitionException {
		Aggregate_function_invocationContext _localctx = new Aggregate_function_invocationContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_aggregate_function_invocation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1748);
			aggregate_func();
			setState(1749);
			match(OPEN_PAR);
			setState(1762);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPEN_PAR:
			case PLUS:
			case MINUS:
			case TILDE:
			case ABORT_:
			case ACTION_:
			case ADD_:
			case AFTER_:
			case ALL_:
			case ALTER_:
			case ANALYZE_:
			case AND_:
			case AS_:
			case ASC_:
			case ATTACH_:
			case AUTOINCREMENT_:
			case BEFORE_:
			case BEGIN_:
			case BETWEEN_:
			case BY_:
			case CASCADE_:
			case CASE_:
			case CAST_:
			case CHECK_:
			case COLLATE_:
			case COLUMN_:
			case COMMIT_:
			case CONFLICT_:
			case CONSTRAINT_:
			case CREATE_:
			case CROSS_:
			case CURRENT_DATE_:
			case CURRENT_TIME_:
			case CURRENT_TIMESTAMP_:
			case DATABASE_:
			case DEFAULT_:
			case DEFERRABLE_:
			case DEFERRED_:
			case DELETE_:
			case DESC_:
			case DETACH_:
			case DISTINCT_:
			case DROP_:
			case EACH_:
			case ELSE_:
			case END_:
			case ESCAPE_:
			case EXCEPT_:
			case EXCLUSIVE_:
			case EXISTS_:
			case EXPLAIN_:
			case FAIL_:
			case FOR_:
			case FOREIGN_:
			case FROM_:
			case FULL_:
			case GLOB_:
			case GROUP_:
			case HAVING_:
			case IF_:
			case IGNORE_:
			case IMMEDIATE_:
			case IN_:
			case INDEX_:
			case INDEXED_:
			case INITIALLY_:
			case INNER_:
			case INSERT_:
			case INSTEAD_:
			case INTERSECT_:
			case INTO_:
			case IS_:
			case ISNULL_:
			case JOIN_:
			case KEY_:
			case LEFT_:
			case LIKE_:
			case LIMIT_:
			case MATCH_:
			case NATURAL_:
			case NO_:
			case NOT_:
			case NOTNULL_:
			case NULL_:
			case OF_:
			case OFFSET_:
			case ON_:
			case OR_:
			case ORDER_:
			case OUTER_:
			case PLAN_:
			case PRAGMA_:
			case PRIMARY_:
			case QUERY_:
			case RAISE_:
			case RECURSIVE_:
			case REFERENCES_:
			case REGEXP_:
			case REINDEX_:
			case RELEASE_:
			case RENAME_:
			case REPLACE_:
			case RESTRICT_:
			case RIGHT_:
			case ROLLBACK_:
			case ROW_:
			case ROWS_:
			case SAVEPOINT_:
			case SELECT_:
			case SET_:
			case TABLE_:
			case TEMP_:
			case TEMPORARY_:
			case THEN_:
			case TO_:
			case TRANSACTION_:
			case TRIGGER_:
			case UNION_:
			case UNIQUE_:
			case UPDATE_:
			case USING_:
			case VACUUM_:
			case VALUES_:
			case VIEW_:
			case VIRTUAL_:
			case WHEN_:
			case WHERE_:
			case WITH_:
			case WITHOUT_:
			case FIRST_VALUE_:
			case OVER_:
			case PARTITION_:
			case RANGE_:
			case PRECEDING_:
			case UNBOUNDED_:
			case CURRENT_:
			case FOLLOWING_:
			case CUME_DIST_:
			case DENSE_RANK_:
			case LAG_:
			case LAST_VALUE_:
			case LEAD_:
			case NTH_VALUE_:
			case NTILE_:
			case PERCENT_RANK_:
			case RANK_:
			case ROW_NUMBER_:
			case GENERATED_:
			case ALWAYS_:
			case STORED_:
			case TRUE_:
			case FALSE_:
			case WINDOW_:
			case NULLS_:
			case FIRST_:
			case LAST_:
			case FILTER_:
			case GROUPS_:
			case EXCLUDE_:
			case IDENTIFIER:
			case NUMERIC_LITERAL:
			case BIND_PARAMETER:
			case STRING_LITERAL:
			case BLOB_LITERAL:
				{
				setState(1751);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,260,_ctx) ) {
				case 1:
					{
					setState(1750);
					match(DISTINCT_);
					}
					break;
				}
				setState(1753);
				expr(0);
				setState(1758);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1754);
					match(COMMA);
					setState(1755);
					expr(0);
					}
					}
					setState(1760);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case STAR:
				{
				setState(1761);
				match(STAR);
				}
				break;
			case CLOSE_PAR:
				break;
			default:
				break;
			}
			setState(1764);
			match(CLOSE_PAR);
			setState(1766);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FILTER_) {
				{
				setState(1765);
				filter_clause();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Window_function_invocationContext extends ParserRuleContext {
		public Window_functionContext window_function() {
			return getRuleContext(Window_functionContext.class,0);
		}
		public TerminalNode OPEN_PAR() { return getToken(SQLiteParser.OPEN_PAR, 0); }
		public TerminalNode CLOSE_PAR() { return getToken(SQLiteParser.CLOSE_PAR, 0); }
		public TerminalNode OVER_() { return getToken(SQLiteParser.OVER_, 0); }
		public Window_defnContext window_defn() {
			return getRuleContext(Window_defnContext.class,0);
		}
		public Window_nameContext window_name() {
			return getRuleContext(Window_nameContext.class,0);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode STAR() { return getToken(SQLiteParser.STAR, 0); }
		public Filter_clauseContext filter_clause() {
			return getRuleContext(Filter_clauseContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(SQLiteParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLiteParser.COMMA, i);
		}
		public Window_function_invocationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_window_function_invocation; }
	}

	public final Window_function_invocationContext window_function_invocation() throws RecognitionException {
		Window_function_invocationContext _localctx = new Window_function_invocationContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_window_function_invocation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1768);
			window_function();
			setState(1769);
			match(OPEN_PAR);
			setState(1779);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPEN_PAR:
			case PLUS:
			case MINUS:
			case TILDE:
			case ABORT_:
			case ACTION_:
			case ADD_:
			case AFTER_:
			case ALL_:
			case ALTER_:
			case ANALYZE_:
			case AND_:
			case AS_:
			case ASC_:
			case ATTACH_:
			case AUTOINCREMENT_:
			case BEFORE_:
			case BEGIN_:
			case BETWEEN_:
			case BY_:
			case CASCADE_:
			case CASE_:
			case CAST_:
			case CHECK_:
			case COLLATE_:
			case COLUMN_:
			case COMMIT_:
			case CONFLICT_:
			case CONSTRAINT_:
			case CREATE_:
			case CROSS_:
			case CURRENT_DATE_:
			case CURRENT_TIME_:
			case CURRENT_TIMESTAMP_:
			case DATABASE_:
			case DEFAULT_:
			case DEFERRABLE_:
			case DEFERRED_:
			case DELETE_:
			case DESC_:
			case DETACH_:
			case DISTINCT_:
			case DROP_:
			case EACH_:
			case ELSE_:
			case END_:
			case ESCAPE_:
			case EXCEPT_:
			case EXCLUSIVE_:
			case EXISTS_:
			case EXPLAIN_:
			case FAIL_:
			case FOR_:
			case FOREIGN_:
			case FROM_:
			case FULL_:
			case GLOB_:
			case GROUP_:
			case HAVING_:
			case IF_:
			case IGNORE_:
			case IMMEDIATE_:
			case IN_:
			case INDEX_:
			case INDEXED_:
			case INITIALLY_:
			case INNER_:
			case INSERT_:
			case INSTEAD_:
			case INTERSECT_:
			case INTO_:
			case IS_:
			case ISNULL_:
			case JOIN_:
			case KEY_:
			case LEFT_:
			case LIKE_:
			case LIMIT_:
			case MATCH_:
			case NATURAL_:
			case NO_:
			case NOT_:
			case NOTNULL_:
			case NULL_:
			case OF_:
			case OFFSET_:
			case ON_:
			case OR_:
			case ORDER_:
			case OUTER_:
			case PLAN_:
			case PRAGMA_:
			case PRIMARY_:
			case QUERY_:
			case RAISE_:
			case RECURSIVE_:
			case REFERENCES_:
			case REGEXP_:
			case REINDEX_:
			case RELEASE_:
			case RENAME_:
			case REPLACE_:
			case RESTRICT_:
			case RIGHT_:
			case ROLLBACK_:
			case ROW_:
			case ROWS_:
			case SAVEPOINT_:
			case SELECT_:
			case SET_:
			case TABLE_:
			case TEMP_:
			case TEMPORARY_:
			case THEN_:
			case TO_:
			case TRANSACTION_:
			case TRIGGER_:
			case UNION_:
			case UNIQUE_:
			case UPDATE_:
			case USING_:
			case VACUUM_:
			case VALUES_:
			case VIEW_:
			case VIRTUAL_:
			case WHEN_:
			case WHERE_:
			case WITH_:
			case WITHOUT_:
			case FIRST_VALUE_:
			case OVER_:
			case PARTITION_:
			case RANGE_:
			case PRECEDING_:
			case UNBOUNDED_:
			case CURRENT_:
			case FOLLOWING_:
			case CUME_DIST_:
			case DENSE_RANK_:
			case LAG_:
			case LAST_VALUE_:
			case LEAD_:
			case NTH_VALUE_:
			case NTILE_:
			case PERCENT_RANK_:
			case RANK_:
			case ROW_NUMBER_:
			case GENERATED_:
			case ALWAYS_:
			case STORED_:
			case TRUE_:
			case FALSE_:
			case WINDOW_:
			case NULLS_:
			case FIRST_:
			case LAST_:
			case FILTER_:
			case GROUPS_:
			case EXCLUDE_:
			case IDENTIFIER:
			case NUMERIC_LITERAL:
			case BIND_PARAMETER:
			case STRING_LITERAL:
			case BLOB_LITERAL:
				{
				setState(1770);
				expr(0);
				setState(1775);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1771);
					match(COMMA);
					setState(1772);
					expr(0);
					}
					}
					setState(1777);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case STAR:
				{
				setState(1778);
				match(STAR);
				}
				break;
			case CLOSE_PAR:
				break;
			default:
				break;
			}
			setState(1781);
			match(CLOSE_PAR);
			setState(1783);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FILTER_) {
				{
				setState(1782);
				filter_clause();
				}
			}

			setState(1785);
			match(OVER_);
			setState(1788);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,267,_ctx) ) {
			case 1:
				{
				setState(1786);
				window_defn();
				}
				break;
			case 2:
				{
				setState(1787);
				window_name();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Common_table_stmtContext extends ParserRuleContext {
		public TerminalNode WITH_() { return getToken(SQLiteParser.WITH_, 0); }
		public List<Common_table_expressionContext> common_table_expression() {
			return getRuleContexts(Common_table_expressionContext.class);
		}
		public Common_table_expressionContext common_table_expression(int i) {
			return getRuleContext(Common_table_expressionContext.class,i);
		}
		public TerminalNode RECURSIVE_() { return getToken(SQLiteParser.RECURSIVE_, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SQLiteParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLiteParser.COMMA, i);
		}
		public Common_table_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_common_table_stmt; }
	}

	public final Common_table_stmtContext common_table_stmt() throws RecognitionException {
		Common_table_stmtContext _localctx = new Common_table_stmtContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_common_table_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1790);
			match(WITH_);
			setState(1792);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,268,_ctx) ) {
			case 1:
				{
				setState(1791);
				match(RECURSIVE_);
				}
				break;
			}
			setState(1794);
			common_table_expression();
			setState(1799);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1795);
				match(COMMA);
				setState(1796);
				common_table_expression();
				}
				}
				setState(1801);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Order_by_stmtContext extends ParserRuleContext {
		public TerminalNode ORDER_() { return getToken(SQLiteParser.ORDER_, 0); }
		public TerminalNode BY_() { return getToken(SQLiteParser.BY_, 0); }
		public List<Ordering_termContext> ordering_term() {
			return getRuleContexts(Ordering_termContext.class);
		}
		public Ordering_termContext ordering_term(int i) {
			return getRuleContext(Ordering_termContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SQLiteParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLiteParser.COMMA, i);
		}
		public Order_by_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_order_by_stmt; }
	}

	public final Order_by_stmtContext order_by_stmt() throws RecognitionException {
		Order_by_stmtContext _localctx = new Order_by_stmtContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_order_by_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1802);
			match(ORDER_);
			setState(1803);
			match(BY_);
			setState(1804);
			ordering_term();
			setState(1809);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1805);
				match(COMMA);
				setState(1806);
				ordering_term();
				}
				}
				setState(1811);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Limit_stmtContext extends ParserRuleContext {
		public TerminalNode LIMIT_() { return getToken(SQLiteParser.LIMIT_, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode OFFSET_() { return getToken(SQLiteParser.OFFSET_, 0); }
		public TerminalNode COMMA() { return getToken(SQLiteParser.COMMA, 0); }
		public Limit_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_limit_stmt; }
	}

	public final Limit_stmtContext limit_stmt() throws RecognitionException {
		Limit_stmtContext _localctx = new Limit_stmtContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_limit_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1812);
			match(LIMIT_);
			setState(1813);
			expr(0);
			setState(1816);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA || _la==OFFSET_) {
				{
				setState(1814);
				_la = _input.LA(1);
				if ( !(_la==COMMA || _la==OFFSET_) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1815);
				expr(0);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Ordering_termContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode COLLATE_() { return getToken(SQLiteParser.COLLATE_, 0); }
		public Collation_nameContext collation_name() {
			return getRuleContext(Collation_nameContext.class,0);
		}
		public Asc_descContext asc_desc() {
			return getRuleContext(Asc_descContext.class,0);
		}
		public TerminalNode NULLS_() { return getToken(SQLiteParser.NULLS_, 0); }
		public TerminalNode FIRST_() { return getToken(SQLiteParser.FIRST_, 0); }
		public TerminalNode LAST_() { return getToken(SQLiteParser.LAST_, 0); }
		public Ordering_termContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ordering_term; }
	}

	public final Ordering_termContext ordering_term() throws RecognitionException {
		Ordering_termContext _localctx = new Ordering_termContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_ordering_term);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1818);
			expr(0);
			setState(1821);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLLATE_) {
				{
				setState(1819);
				match(COLLATE_);
				setState(1820);
				collation_name();
				}
			}

			setState(1824);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASC_ || _la==DESC_) {
				{
				setState(1823);
				asc_desc();
				}
			}

			setState(1828);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NULLS_) {
				{
				setState(1826);
				match(NULLS_);
				setState(1827);
				_la = _input.LA(1);
				if ( !(_la==FIRST_ || _la==LAST_) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Asc_descContext extends ParserRuleContext {
		public TerminalNode ASC_() { return getToken(SQLiteParser.ASC_, 0); }
		public TerminalNode DESC_() { return getToken(SQLiteParser.DESC_, 0); }
		public Asc_descContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asc_desc; }
	}

	public final Asc_descContext asc_desc() throws RecognitionException {
		Asc_descContext _localctx = new Asc_descContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_asc_desc);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1830);
			_la = _input.LA(1);
			if ( !(_la==ASC_ || _la==DESC_) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Frame_leftContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode PRECEDING_() { return getToken(SQLiteParser.PRECEDING_, 0); }
		public TerminalNode FOLLOWING_() { return getToken(SQLiteParser.FOLLOWING_, 0); }
		public TerminalNode CURRENT_() { return getToken(SQLiteParser.CURRENT_, 0); }
		public TerminalNode ROW_() { return getToken(SQLiteParser.ROW_, 0); }
		public TerminalNode UNBOUNDED_() { return getToken(SQLiteParser.UNBOUNDED_, 0); }
		public Frame_leftContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_frame_left; }
	}

	public final Frame_leftContext frame_left() throws RecognitionException {
		Frame_leftContext _localctx = new Frame_leftContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_frame_left);
		try {
			setState(1842);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,275,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1832);
				expr(0);
				setState(1833);
				match(PRECEDING_);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1835);
				expr(0);
				setState(1836);
				match(FOLLOWING_);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1838);
				match(CURRENT_);
				setState(1839);
				match(ROW_);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1840);
				match(UNBOUNDED_);
				setState(1841);
				match(PRECEDING_);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Frame_rightContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode PRECEDING_() { return getToken(SQLiteParser.PRECEDING_, 0); }
		public TerminalNode FOLLOWING_() { return getToken(SQLiteParser.FOLLOWING_, 0); }
		public TerminalNode CURRENT_() { return getToken(SQLiteParser.CURRENT_, 0); }
		public TerminalNode ROW_() { return getToken(SQLiteParser.ROW_, 0); }
		public TerminalNode UNBOUNDED_() { return getToken(SQLiteParser.UNBOUNDED_, 0); }
		public Frame_rightContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_frame_right; }
	}

	public final Frame_rightContext frame_right() throws RecognitionException {
		Frame_rightContext _localctx = new Frame_rightContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_frame_right);
		try {
			setState(1854);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,276,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1844);
				expr(0);
				setState(1845);
				match(PRECEDING_);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1847);
				expr(0);
				setState(1848);
				match(FOLLOWING_);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1850);
				match(CURRENT_);
				setState(1851);
				match(ROW_);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1852);
				match(UNBOUNDED_);
				setState(1853);
				match(FOLLOWING_);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Frame_singleContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode PRECEDING_() { return getToken(SQLiteParser.PRECEDING_, 0); }
		public TerminalNode UNBOUNDED_() { return getToken(SQLiteParser.UNBOUNDED_, 0); }
		public TerminalNode CURRENT_() { return getToken(SQLiteParser.CURRENT_, 0); }
		public TerminalNode ROW_() { return getToken(SQLiteParser.ROW_, 0); }
		public Frame_singleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_frame_single; }
	}

	public final Frame_singleContext frame_single() throws RecognitionException {
		Frame_singleContext _localctx = new Frame_singleContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_frame_single);
		try {
			setState(1863);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,277,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1856);
				expr(0);
				setState(1857);
				match(PRECEDING_);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1859);
				match(UNBOUNDED_);
				setState(1860);
				match(PRECEDING_);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1861);
				match(CURRENT_);
				setState(1862);
				match(ROW_);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Window_functionContext extends ParserRuleContext {
		public List<TerminalNode> OPEN_PAR() { return getTokens(SQLiteParser.OPEN_PAR); }
		public TerminalNode OPEN_PAR(int i) {
			return getToken(SQLiteParser.OPEN_PAR, i);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<TerminalNode> CLOSE_PAR() { return getTokens(SQLiteParser.CLOSE_PAR); }
		public TerminalNode CLOSE_PAR(int i) {
			return getToken(SQLiteParser.CLOSE_PAR, i);
		}
		public TerminalNode OVER_() { return getToken(SQLiteParser.OVER_, 0); }
		public Order_by_expr_asc_descContext order_by_expr_asc_desc() {
			return getRuleContext(Order_by_expr_asc_descContext.class,0);
		}
		public TerminalNode FIRST_VALUE_() { return getToken(SQLiteParser.FIRST_VALUE_, 0); }
		public TerminalNode LAST_VALUE_() { return getToken(SQLiteParser.LAST_VALUE_, 0); }
		public Partition_byContext partition_by() {
			return getRuleContext(Partition_byContext.class,0);
		}
		public Frame_clauseContext frame_clause() {
			return getRuleContext(Frame_clauseContext.class,0);
		}
		public TerminalNode CUME_DIST_() { return getToken(SQLiteParser.CUME_DIST_, 0); }
		public TerminalNode PERCENT_RANK_() { return getToken(SQLiteParser.PERCENT_RANK_, 0); }
		public Order_by_exprContext order_by_expr() {
			return getRuleContext(Order_by_exprContext.class,0);
		}
		public TerminalNode DENSE_RANK_() { return getToken(SQLiteParser.DENSE_RANK_, 0); }
		public TerminalNode RANK_() { return getToken(SQLiteParser.RANK_, 0); }
		public TerminalNode ROW_NUMBER_() { return getToken(SQLiteParser.ROW_NUMBER_, 0); }
		public TerminalNode LAG_() { return getToken(SQLiteParser.LAG_, 0); }
		public TerminalNode LEAD_() { return getToken(SQLiteParser.LEAD_, 0); }
		public OffsetContext offset() {
			return getRuleContext(OffsetContext.class,0);
		}
		public Default_valueContext default_value() {
			return getRuleContext(Default_valueContext.class,0);
		}
		public TerminalNode NTH_VALUE_() { return getToken(SQLiteParser.NTH_VALUE_, 0); }
		public TerminalNode COMMA() { return getToken(SQLiteParser.COMMA, 0); }
		public Signed_numberContext signed_number() {
			return getRuleContext(Signed_numberContext.class,0);
		}
		public TerminalNode NTILE_() { return getToken(SQLiteParser.NTILE_, 0); }
		public Window_functionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_window_function; }
	}

	public final Window_functionContext window_function() throws RecognitionException {
		Window_functionContext _localctx = new Window_functionContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_window_function);
		int _la;
		try {
			setState(1950);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FIRST_VALUE_:
			case LAST_VALUE_:
				enterOuterAlt(_localctx, 1);
				{
				setState(1865);
				_la = _input.LA(1);
				if ( !(_la==FIRST_VALUE_ || _la==LAST_VALUE_) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1866);
				match(OPEN_PAR);
				setState(1867);
				expr(0);
				setState(1868);
				match(CLOSE_PAR);
				setState(1869);
				match(OVER_);
				setState(1870);
				match(OPEN_PAR);
				setState(1872);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION_) {
					{
					setState(1871);
					partition_by();
					}
				}

				setState(1874);
				order_by_expr_asc_desc();
				setState(1876);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & 2251799880794113L) != 0)) {
					{
					setState(1875);
					frame_clause();
					}
				}

				setState(1878);
				match(CLOSE_PAR);
				}
				break;
			case CUME_DIST_:
			case PERCENT_RANK_:
				enterOuterAlt(_localctx, 2);
				{
				setState(1880);
				_la = _input.LA(1);
				if ( !(_la==CUME_DIST_ || _la==PERCENT_RANK_) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1881);
				match(OPEN_PAR);
				setState(1882);
				match(CLOSE_PAR);
				setState(1883);
				match(OVER_);
				setState(1884);
				match(OPEN_PAR);
				setState(1886);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION_) {
					{
					setState(1885);
					partition_by();
					}
				}

				setState(1889);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ORDER_) {
					{
					setState(1888);
					order_by_expr();
					}
				}

				setState(1891);
				match(CLOSE_PAR);
				}
				break;
			case DENSE_RANK_:
			case RANK_:
			case ROW_NUMBER_:
				enterOuterAlt(_localctx, 3);
				{
				setState(1892);
				_la = _input.LA(1);
				if ( !(((((_la - 160)) & ~0x3f) == 0 && ((1L << (_la - 160)) & 385L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1893);
				match(OPEN_PAR);
				setState(1894);
				match(CLOSE_PAR);
				setState(1895);
				match(OVER_);
				setState(1896);
				match(OPEN_PAR);
				setState(1898);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION_) {
					{
					setState(1897);
					partition_by();
					}
				}

				setState(1900);
				order_by_expr_asc_desc();
				setState(1901);
				match(CLOSE_PAR);
				}
				break;
			case LAG_:
			case LEAD_:
				enterOuterAlt(_localctx, 4);
				{
				setState(1903);
				_la = _input.LA(1);
				if ( !(_la==LAG_ || _la==LEAD_) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1904);
				match(OPEN_PAR);
				setState(1905);
				expr(0);
				setState(1907);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,283,_ctx) ) {
				case 1:
					{
					setState(1906);
					offset();
					}
					break;
				}
				setState(1910);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(1909);
					default_value();
					}
				}

				setState(1912);
				match(CLOSE_PAR);
				setState(1913);
				match(OVER_);
				setState(1914);
				match(OPEN_PAR);
				setState(1916);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION_) {
					{
					setState(1915);
					partition_by();
					}
				}

				setState(1918);
				order_by_expr_asc_desc();
				setState(1919);
				match(CLOSE_PAR);
				}
				break;
			case NTH_VALUE_:
				enterOuterAlt(_localctx, 5);
				{
				setState(1921);
				match(NTH_VALUE_);
				setState(1922);
				match(OPEN_PAR);
				setState(1923);
				expr(0);
				setState(1924);
				match(COMMA);
				setState(1925);
				signed_number();
				setState(1926);
				match(CLOSE_PAR);
				setState(1927);
				match(OVER_);
				setState(1928);
				match(OPEN_PAR);
				setState(1930);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION_) {
					{
					setState(1929);
					partition_by();
					}
				}

				setState(1932);
				order_by_expr_asc_desc();
				setState(1934);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & 2251799880794113L) != 0)) {
					{
					setState(1933);
					frame_clause();
					}
				}

				setState(1936);
				match(CLOSE_PAR);
				}
				break;
			case NTILE_:
				enterOuterAlt(_localctx, 6);
				{
				setState(1938);
				match(NTILE_);
				setState(1939);
				match(OPEN_PAR);
				setState(1940);
				expr(0);
				setState(1941);
				match(CLOSE_PAR);
				setState(1942);
				match(OVER_);
				setState(1943);
				match(OPEN_PAR);
				setState(1945);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION_) {
					{
					setState(1944);
					partition_by();
					}
				}

				setState(1947);
				order_by_expr_asc_desc();
				setState(1948);
				match(CLOSE_PAR);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class OffsetContext extends ParserRuleContext {
		public TerminalNode COMMA() { return getToken(SQLiteParser.COMMA, 0); }
		public Signed_numberContext signed_number() {
			return getRuleContext(Signed_numberContext.class,0);
		}
		public OffsetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_offset; }
	}

	public final OffsetContext offset() throws RecognitionException {
		OffsetContext _localctx = new OffsetContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_offset);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1952);
			match(COMMA);
			setState(1953);
			signed_number();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Default_valueContext extends ParserRuleContext {
		public TerminalNode COMMA() { return getToken(SQLiteParser.COMMA, 0); }
		public Signed_numberContext signed_number() {
			return getRuleContext(Signed_numberContext.class,0);
		}
		public Default_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_default_value; }
	}

	public final Default_valueContext default_value() throws RecognitionException {
		Default_valueContext _localctx = new Default_valueContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_default_value);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1955);
			match(COMMA);
			setState(1956);
			signed_number();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Partition_byContext extends ParserRuleContext {
		public TerminalNode PARTITION_() { return getToken(SQLiteParser.PARTITION_, 0); }
		public TerminalNode BY_() { return getToken(SQLiteParser.BY_, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public Partition_byContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_partition_by; }
	}

	public final Partition_byContext partition_by() throws RecognitionException {
		Partition_byContext _localctx = new Partition_byContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_partition_by);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1958);
			match(PARTITION_);
			setState(1959);
			match(BY_);
			setState(1961); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1960);
					expr(0);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1963); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,290,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Order_by_exprContext extends ParserRuleContext {
		public TerminalNode ORDER_() { return getToken(SQLiteParser.ORDER_, 0); }
		public TerminalNode BY_() { return getToken(SQLiteParser.BY_, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public Order_by_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_order_by_expr; }
	}

	public final Order_by_exprContext order_by_expr() throws RecognitionException {
		Order_by_exprContext _localctx = new Order_by_exprContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_order_by_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1965);
			match(ORDER_);
			setState(1966);
			match(BY_);
			setState(1968); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1967);
				expr(0);
				}
				}
				setState(1970); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & -33552632L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & -1152921504606846977L) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & 4476578029606273023L) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Order_by_expr_asc_descContext extends ParserRuleContext {
		public TerminalNode ORDER_() { return getToken(SQLiteParser.ORDER_, 0); }
		public TerminalNode BY_() { return getToken(SQLiteParser.BY_, 0); }
		public Expr_asc_descContext expr_asc_desc() {
			return getRuleContext(Expr_asc_descContext.class,0);
		}
		public Order_by_expr_asc_descContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_order_by_expr_asc_desc; }
	}

	public final Order_by_expr_asc_descContext order_by_expr_asc_desc() throws RecognitionException {
		Order_by_expr_asc_descContext _localctx = new Order_by_expr_asc_descContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_order_by_expr_asc_desc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1972);
			match(ORDER_);
			setState(1973);
			match(BY_);
			setState(1974);
			expr_asc_desc();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Expr_asc_descContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<Asc_descContext> asc_desc() {
			return getRuleContexts(Asc_descContext.class);
		}
		public Asc_descContext asc_desc(int i) {
			return getRuleContext(Asc_descContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SQLiteParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLiteParser.COMMA, i);
		}
		public Expr_asc_descContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_asc_desc; }
	}

	public final Expr_asc_descContext expr_asc_desc() throws RecognitionException {
		Expr_asc_descContext _localctx = new Expr_asc_descContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_expr_asc_desc);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1976);
			expr(0);
			setState(1978);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASC_ || _la==DESC_) {
				{
				setState(1977);
				asc_desc();
				}
			}

			setState(1987);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1980);
				match(COMMA);
				setState(1981);
				expr(0);
				setState(1983);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ASC_ || _la==DESC_) {
					{
					setState(1982);
					asc_desc();
					}
				}

				}
				}
				setState(1989);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Initial_selectContext extends ParserRuleContext {
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public Initial_selectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initial_select; }
	}

	public final Initial_selectContext initial_select() throws RecognitionException {
		Initial_selectContext _localctx = new Initial_selectContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_initial_select);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1990);
			select_stmt();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Recursive_selectContext extends ParserRuleContext {
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public Recursive_selectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_recursive_select; }
	}

	public final Recursive_selectContext recursive_select() throws RecognitionException {
		Recursive_selectContext _localctx = new Recursive_selectContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_recursive_select);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1992);
			select_stmt();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Unary_operatorContext extends ParserRuleContext {
		public TerminalNode MINUS() { return getToken(SQLiteParser.MINUS, 0); }
		public TerminalNode PLUS() { return getToken(SQLiteParser.PLUS, 0); }
		public TerminalNode TILDE() { return getToken(SQLiteParser.TILDE, 0); }
		public TerminalNode NOT_() { return getToken(SQLiteParser.NOT_, 0); }
		public Unary_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unary_operator; }
	}

	public final Unary_operatorContext unary_operator() throws RecognitionException {
		Unary_operatorContext _localctx = new Unary_operatorContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_unary_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1994);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 1792L) != 0) || _la==NOT_) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Error_messageContext extends ParserRuleContext {
		public TerminalNode STRING_LITERAL() { return getToken(SQLiteParser.STRING_LITERAL, 0); }
		public Error_messageContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_error_message; }
	}

	public final Error_messageContext error_message() throws RecognitionException {
		Error_messageContext _localctx = new Error_messageContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_error_message);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1996);
			match(STRING_LITERAL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Module_argumentContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Column_defContext column_def() {
			return getRuleContext(Column_defContext.class,0);
		}
		public Module_argumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_module_argument; }
	}

	public final Module_argumentContext module_argument() throws RecognitionException {
		Module_argumentContext _localctx = new Module_argumentContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_module_argument);
		try {
			setState(2000);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,295,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1998);
				expr(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1999);
				column_def();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Column_aliasContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(SQLiteParser.IDENTIFIER, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(SQLiteParser.STRING_LITERAL, 0); }
		public Column_aliasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_alias; }
	}

	public final Column_aliasContext column_alias() throws RecognitionException {
		Column_aliasContext _localctx = new Column_aliasContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_column_alias);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2002);
			_la = _input.LA(1);
			if ( !(_la==IDENTIFIER || _la==STRING_LITERAL) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class KeywordContext extends ParserRuleContext {
		public TerminalNode ABORT_() { return getToken(SQLiteParser.ABORT_, 0); }
		public TerminalNode ACTION_() { return getToken(SQLiteParser.ACTION_, 0); }
		public TerminalNode ADD_() { return getToken(SQLiteParser.ADD_, 0); }
		public TerminalNode AFTER_() { return getToken(SQLiteParser.AFTER_, 0); }
		public TerminalNode ALL_() { return getToken(SQLiteParser.ALL_, 0); }
		public TerminalNode ALTER_() { return getToken(SQLiteParser.ALTER_, 0); }
		public TerminalNode ANALYZE_() { return getToken(SQLiteParser.ANALYZE_, 0); }
		public TerminalNode AND_() { return getToken(SQLiteParser.AND_, 0); }
		public TerminalNode AS_() { return getToken(SQLiteParser.AS_, 0); }
		public TerminalNode ASC_() { return getToken(SQLiteParser.ASC_, 0); }
		public TerminalNode ATTACH_() { return getToken(SQLiteParser.ATTACH_, 0); }
		public TerminalNode AUTOINCREMENT_() { return getToken(SQLiteParser.AUTOINCREMENT_, 0); }
		public TerminalNode BEFORE_() { return getToken(SQLiteParser.BEFORE_, 0); }
		public TerminalNode BEGIN_() { return getToken(SQLiteParser.BEGIN_, 0); }
		public TerminalNode BETWEEN_() { return getToken(SQLiteParser.BETWEEN_, 0); }
		public TerminalNode BY_() { return getToken(SQLiteParser.BY_, 0); }
		public TerminalNode CASCADE_() { return getToken(SQLiteParser.CASCADE_, 0); }
		public TerminalNode CASE_() { return getToken(SQLiteParser.CASE_, 0); }
		public TerminalNode CAST_() { return getToken(SQLiteParser.CAST_, 0); }
		public TerminalNode CHECK_() { return getToken(SQLiteParser.CHECK_, 0); }
		public TerminalNode COLLATE_() { return getToken(SQLiteParser.COLLATE_, 0); }
		public TerminalNode COLUMN_() { return getToken(SQLiteParser.COLUMN_, 0); }
		public TerminalNode COMMIT_() { return getToken(SQLiteParser.COMMIT_, 0); }
		public TerminalNode CONFLICT_() { return getToken(SQLiteParser.CONFLICT_, 0); }
		public TerminalNode CONSTRAINT_() { return getToken(SQLiteParser.CONSTRAINT_, 0); }
		public TerminalNode CREATE_() { return getToken(SQLiteParser.CREATE_, 0); }
		public TerminalNode CROSS_() { return getToken(SQLiteParser.CROSS_, 0); }
		public TerminalNode CURRENT_DATE_() { return getToken(SQLiteParser.CURRENT_DATE_, 0); }
		public TerminalNode CURRENT_TIME_() { return getToken(SQLiteParser.CURRENT_TIME_, 0); }
		public TerminalNode CURRENT_TIMESTAMP_() { return getToken(SQLiteParser.CURRENT_TIMESTAMP_, 0); }
		public TerminalNode DATABASE_() { return getToken(SQLiteParser.DATABASE_, 0); }
		public TerminalNode DEFAULT_() { return getToken(SQLiteParser.DEFAULT_, 0); }
		public TerminalNode DEFERRABLE_() { return getToken(SQLiteParser.DEFERRABLE_, 0); }
		public TerminalNode DEFERRED_() { return getToken(SQLiteParser.DEFERRED_, 0); }
		public TerminalNode DELETE_() { return getToken(SQLiteParser.DELETE_, 0); }
		public TerminalNode DESC_() { return getToken(SQLiteParser.DESC_, 0); }
		public TerminalNode DETACH_() { return getToken(SQLiteParser.DETACH_, 0); }
		public TerminalNode DISTINCT_() { return getToken(SQLiteParser.DISTINCT_, 0); }
		public TerminalNode DROP_() { return getToken(SQLiteParser.DROP_, 0); }
		public TerminalNode EACH_() { return getToken(SQLiteParser.EACH_, 0); }
		public TerminalNode ELSE_() { return getToken(SQLiteParser.ELSE_, 0); }
		public TerminalNode END_() { return getToken(SQLiteParser.END_, 0); }
		public TerminalNode ESCAPE_() { return getToken(SQLiteParser.ESCAPE_, 0); }
		public TerminalNode EXCEPT_() { return getToken(SQLiteParser.EXCEPT_, 0); }
		public TerminalNode EXCLUSIVE_() { return getToken(SQLiteParser.EXCLUSIVE_, 0); }
		public TerminalNode EXISTS_() { return getToken(SQLiteParser.EXISTS_, 0); }
		public TerminalNode EXPLAIN_() { return getToken(SQLiteParser.EXPLAIN_, 0); }
		public TerminalNode FAIL_() { return getToken(SQLiteParser.FAIL_, 0); }
		public TerminalNode FOR_() { return getToken(SQLiteParser.FOR_, 0); }
		public TerminalNode FOREIGN_() { return getToken(SQLiteParser.FOREIGN_, 0); }
		public TerminalNode FROM_() { return getToken(SQLiteParser.FROM_, 0); }
		public TerminalNode FULL_() { return getToken(SQLiteParser.FULL_, 0); }
		public TerminalNode GLOB_() { return getToken(SQLiteParser.GLOB_, 0); }
		public TerminalNode GROUP_() { return getToken(SQLiteParser.GROUP_, 0); }
		public TerminalNode HAVING_() { return getToken(SQLiteParser.HAVING_, 0); }
		public TerminalNode IF_() { return getToken(SQLiteParser.IF_, 0); }
		public TerminalNode IGNORE_() { return getToken(SQLiteParser.IGNORE_, 0); }
		public TerminalNode IMMEDIATE_() { return getToken(SQLiteParser.IMMEDIATE_, 0); }
		public TerminalNode IN_() { return getToken(SQLiteParser.IN_, 0); }
		public TerminalNode INDEX_() { return getToken(SQLiteParser.INDEX_, 0); }
		public TerminalNode INDEXED_() { return getToken(SQLiteParser.INDEXED_, 0); }
		public TerminalNode INITIALLY_() { return getToken(SQLiteParser.INITIALLY_, 0); }
		public TerminalNode INNER_() { return getToken(SQLiteParser.INNER_, 0); }
		public TerminalNode INSERT_() { return getToken(SQLiteParser.INSERT_, 0); }
		public TerminalNode INSTEAD_() { return getToken(SQLiteParser.INSTEAD_, 0); }
		public TerminalNode INTERSECT_() { return getToken(SQLiteParser.INTERSECT_, 0); }
		public TerminalNode INTO_() { return getToken(SQLiteParser.INTO_, 0); }
		public TerminalNode IS_() { return getToken(SQLiteParser.IS_, 0); }
		public TerminalNode ISNULL_() { return getToken(SQLiteParser.ISNULL_, 0); }
		public TerminalNode JOIN_() { return getToken(SQLiteParser.JOIN_, 0); }
		public TerminalNode KEY_() { return getToken(SQLiteParser.KEY_, 0); }
		public TerminalNode LEFT_() { return getToken(SQLiteParser.LEFT_, 0); }
		public TerminalNode LIKE_() { return getToken(SQLiteParser.LIKE_, 0); }
		public TerminalNode LIMIT_() { return getToken(SQLiteParser.LIMIT_, 0); }
		public TerminalNode MATCH_() { return getToken(SQLiteParser.MATCH_, 0); }
		public TerminalNode NATURAL_() { return getToken(SQLiteParser.NATURAL_, 0); }
		public TerminalNode NO_() { return getToken(SQLiteParser.NO_, 0); }
		public TerminalNode NOT_() { return getToken(SQLiteParser.NOT_, 0); }
		public TerminalNode NOTNULL_() { return getToken(SQLiteParser.NOTNULL_, 0); }
		public TerminalNode NULL_() { return getToken(SQLiteParser.NULL_, 0); }
		public TerminalNode OF_() { return getToken(SQLiteParser.OF_, 0); }
		public TerminalNode OFFSET_() { return getToken(SQLiteParser.OFFSET_, 0); }
		public TerminalNode ON_() { return getToken(SQLiteParser.ON_, 0); }
		public TerminalNode OR_() { return getToken(SQLiteParser.OR_, 0); }
		public TerminalNode ORDER_() { return getToken(SQLiteParser.ORDER_, 0); }
		public TerminalNode OUTER_() { return getToken(SQLiteParser.OUTER_, 0); }
		public TerminalNode PLAN_() { return getToken(SQLiteParser.PLAN_, 0); }
		public TerminalNode PRAGMA_() { return getToken(SQLiteParser.PRAGMA_, 0); }
		public TerminalNode PRIMARY_() { return getToken(SQLiteParser.PRIMARY_, 0); }
		public TerminalNode QUERY_() { return getToken(SQLiteParser.QUERY_, 0); }
		public TerminalNode RAISE_() { return getToken(SQLiteParser.RAISE_, 0); }
		public TerminalNode RECURSIVE_() { return getToken(SQLiteParser.RECURSIVE_, 0); }
		public TerminalNode REFERENCES_() { return getToken(SQLiteParser.REFERENCES_, 0); }
		public TerminalNode REGEXP_() { return getToken(SQLiteParser.REGEXP_, 0); }
		public TerminalNode REINDEX_() { return getToken(SQLiteParser.REINDEX_, 0); }
		public TerminalNode RELEASE_() { return getToken(SQLiteParser.RELEASE_, 0); }
		public TerminalNode RENAME_() { return getToken(SQLiteParser.RENAME_, 0); }
		public TerminalNode REPLACE_() { return getToken(SQLiteParser.REPLACE_, 0); }
		public TerminalNode RESTRICT_() { return getToken(SQLiteParser.RESTRICT_, 0); }
		public TerminalNode RIGHT_() { return getToken(SQLiteParser.RIGHT_, 0); }
		public TerminalNode ROLLBACK_() { return getToken(SQLiteParser.ROLLBACK_, 0); }
		public TerminalNode ROW_() { return getToken(SQLiteParser.ROW_, 0); }
		public TerminalNode ROWS_() { return getToken(SQLiteParser.ROWS_, 0); }
		public TerminalNode SAVEPOINT_() { return getToken(SQLiteParser.SAVEPOINT_, 0); }
		public TerminalNode SELECT_() { return getToken(SQLiteParser.SELECT_, 0); }
		public TerminalNode SET_() { return getToken(SQLiteParser.SET_, 0); }
		public TerminalNode TABLE_() { return getToken(SQLiteParser.TABLE_, 0); }
		public TerminalNode TEMP_() { return getToken(SQLiteParser.TEMP_, 0); }
		public TerminalNode TEMPORARY_() { return getToken(SQLiteParser.TEMPORARY_, 0); }
		public TerminalNode THEN_() { return getToken(SQLiteParser.THEN_, 0); }
		public TerminalNode TO_() { return getToken(SQLiteParser.TO_, 0); }
		public TerminalNode TRANSACTION_() { return getToken(SQLiteParser.TRANSACTION_, 0); }
		public TerminalNode TRIGGER_() { return getToken(SQLiteParser.TRIGGER_, 0); }
		public TerminalNode UNION_() { return getToken(SQLiteParser.UNION_, 0); }
		public TerminalNode UNIQUE_() { return getToken(SQLiteParser.UNIQUE_, 0); }
		public TerminalNode UPDATE_() { return getToken(SQLiteParser.UPDATE_, 0); }
		public TerminalNode USING_() { return getToken(SQLiteParser.USING_, 0); }
		public TerminalNode VACUUM_() { return getToken(SQLiteParser.VACUUM_, 0); }
		public TerminalNode VALUES_() { return getToken(SQLiteParser.VALUES_, 0); }
		public TerminalNode VIEW_() { return getToken(SQLiteParser.VIEW_, 0); }
		public TerminalNode VIRTUAL_() { return getToken(SQLiteParser.VIRTUAL_, 0); }
		public TerminalNode WHEN_() { return getToken(SQLiteParser.WHEN_, 0); }
		public TerminalNode WHERE_() { return getToken(SQLiteParser.WHERE_, 0); }
		public TerminalNode WITH_() { return getToken(SQLiteParser.WITH_, 0); }
		public TerminalNode WITHOUT_() { return getToken(SQLiteParser.WITHOUT_, 0); }
		public TerminalNode FIRST_VALUE_() { return getToken(SQLiteParser.FIRST_VALUE_, 0); }
		public TerminalNode OVER_() { return getToken(SQLiteParser.OVER_, 0); }
		public TerminalNode PARTITION_() { return getToken(SQLiteParser.PARTITION_, 0); }
		public TerminalNode RANGE_() { return getToken(SQLiteParser.RANGE_, 0); }
		public TerminalNode PRECEDING_() { return getToken(SQLiteParser.PRECEDING_, 0); }
		public TerminalNode UNBOUNDED_() { return getToken(SQLiteParser.UNBOUNDED_, 0); }
		public TerminalNode CURRENT_() { return getToken(SQLiteParser.CURRENT_, 0); }
		public TerminalNode FOLLOWING_() { return getToken(SQLiteParser.FOLLOWING_, 0); }
		public TerminalNode CUME_DIST_() { return getToken(SQLiteParser.CUME_DIST_, 0); }
		public TerminalNode DENSE_RANK_() { return getToken(SQLiteParser.DENSE_RANK_, 0); }
		public TerminalNode LAG_() { return getToken(SQLiteParser.LAG_, 0); }
		public TerminalNode LAST_VALUE_() { return getToken(SQLiteParser.LAST_VALUE_, 0); }
		public TerminalNode LEAD_() { return getToken(SQLiteParser.LEAD_, 0); }
		public TerminalNode NTH_VALUE_() { return getToken(SQLiteParser.NTH_VALUE_, 0); }
		public TerminalNode NTILE_() { return getToken(SQLiteParser.NTILE_, 0); }
		public TerminalNode PERCENT_RANK_() { return getToken(SQLiteParser.PERCENT_RANK_, 0); }
		public TerminalNode RANK_() { return getToken(SQLiteParser.RANK_, 0); }
		public TerminalNode ROW_NUMBER_() { return getToken(SQLiteParser.ROW_NUMBER_, 0); }
		public TerminalNode GENERATED_() { return getToken(SQLiteParser.GENERATED_, 0); }
		public TerminalNode ALWAYS_() { return getToken(SQLiteParser.ALWAYS_, 0); }
		public TerminalNode STORED_() { return getToken(SQLiteParser.STORED_, 0); }
		public TerminalNode TRUE_() { return getToken(SQLiteParser.TRUE_, 0); }
		public TerminalNode FALSE_() { return getToken(SQLiteParser.FALSE_, 0); }
		public TerminalNode WINDOW_() { return getToken(SQLiteParser.WINDOW_, 0); }
		public TerminalNode NULLS_() { return getToken(SQLiteParser.NULLS_, 0); }
		public TerminalNode FIRST_() { return getToken(SQLiteParser.FIRST_, 0); }
		public TerminalNode LAST_() { return getToken(SQLiteParser.LAST_, 0); }
		public TerminalNode FILTER_() { return getToken(SQLiteParser.FILTER_, 0); }
		public TerminalNode GROUPS_() { return getToken(SQLiteParser.GROUPS_, 0); }
		public TerminalNode EXCLUDE_() { return getToken(SQLiteParser.EXCLUDE_, 0); }
		public KeywordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keyword; }
	}

	public final KeywordContext keyword() throws RecognitionException {
		KeywordContext _localctx = new KeywordContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_keyword);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2004);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & -33554432L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & -1152921504606846977L) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & 9007199254740991L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class NameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public NameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_name; }
	}

	public final NameContext name() throws RecognitionException {
		NameContext _localctx = new NameContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2006);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Function_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Function_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_name; }
	}

	public final Function_nameContext function_name() throws RecognitionException {
		Function_nameContext _localctx = new Function_nameContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_function_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2008);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Schema_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Schema_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_schema_name; }
	}

	public final Schema_nameContext schema_name() throws RecognitionException {
		Schema_nameContext _localctx = new Schema_nameContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_schema_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2010);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Table_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Table_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_name; }
	}

	public final Table_nameContext table_name() throws RecognitionException {
		Table_nameContext _localctx = new Table_nameContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_table_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2012);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Table_or_index_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Table_or_index_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_or_index_name; }
	}

	public final Table_or_index_nameContext table_or_index_name() throws RecognitionException {
		Table_or_index_nameContext _localctx = new Table_or_index_nameContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_table_or_index_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2014);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Column_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Column_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_name; }
	}

	public final Column_nameContext column_name() throws RecognitionException {
		Column_nameContext _localctx = new Column_nameContext(_ctx, getState());
		enterRule(_localctx, 188, RULE_column_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2016);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Collation_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Collation_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_collation_name; }
	}

	public final Collation_nameContext collation_name() throws RecognitionException {
		Collation_nameContext _localctx = new Collation_nameContext(_ctx, getState());
		enterRule(_localctx, 190, RULE_collation_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2018);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Foreign_tableContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Foreign_tableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_foreign_table; }
	}

	public final Foreign_tableContext foreign_table() throws RecognitionException {
		Foreign_tableContext _localctx = new Foreign_tableContext(_ctx, getState());
		enterRule(_localctx, 192, RULE_foreign_table);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2020);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Index_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Index_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_index_name; }
	}

	public final Index_nameContext index_name() throws RecognitionException {
		Index_nameContext _localctx = new Index_nameContext(_ctx, getState());
		enterRule(_localctx, 194, RULE_index_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2022);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Trigger_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Trigger_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_trigger_name; }
	}

	public final Trigger_nameContext trigger_name() throws RecognitionException {
		Trigger_nameContext _localctx = new Trigger_nameContext(_ctx, getState());
		enterRule(_localctx, 196, RULE_trigger_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2024);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class View_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public View_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_view_name; }
	}

	public final View_nameContext view_name() throws RecognitionException {
		View_nameContext _localctx = new View_nameContext(_ctx, getState());
		enterRule(_localctx, 198, RULE_view_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2026);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Module_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Module_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_module_name; }
	}

	public final Module_nameContext module_name() throws RecognitionException {
		Module_nameContext _localctx = new Module_nameContext(_ctx, getState());
		enterRule(_localctx, 200, RULE_module_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2028);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Pragma_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Pragma_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pragma_name; }
	}

	public final Pragma_nameContext pragma_name() throws RecognitionException {
		Pragma_nameContext _localctx = new Pragma_nameContext(_ctx, getState());
		enterRule(_localctx, 202, RULE_pragma_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2030);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Savepoint_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Savepoint_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_savepoint_name; }
	}

	public final Savepoint_nameContext savepoint_name() throws RecognitionException {
		Savepoint_nameContext _localctx = new Savepoint_nameContext(_ctx, getState());
		enterRule(_localctx, 204, RULE_savepoint_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2032);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Transaction_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Transaction_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_transaction_name; }
	}

	public final Transaction_nameContext transaction_name() throws RecognitionException {
		Transaction_nameContext _localctx = new Transaction_nameContext(_ctx, getState());
		enterRule(_localctx, 206, RULE_transaction_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2034);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Window_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Window_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_window_name; }
	}

	public final Window_nameContext window_name() throws RecognitionException {
		Window_nameContext _localctx = new Window_nameContext(_ctx, getState());
		enterRule(_localctx, 208, RULE_window_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2036);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AliasContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public AliasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alias; }
	}

	public final AliasContext alias() throws RecognitionException {
		AliasContext _localctx = new AliasContext(_ctx, getState());
		enterRule(_localctx, 210, RULE_alias);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2038);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FilenameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public FilenameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_filename; }
	}

	public final FilenameContext filename() throws RecognitionException {
		FilenameContext _localctx = new FilenameContext(_ctx, getState());
		enterRule(_localctx, 212, RULE_filename);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2040);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Table_aliasContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Table_aliasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_alias; }
	}

	public final Table_aliasContext table_alias() throws RecognitionException {
		Table_aliasContext _localctx = new Table_aliasContext(_ctx, getState());
		enterRule(_localctx, 214, RULE_table_alias);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2042);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Base_window_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Base_window_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_base_window_name; }
	}

	public final Base_window_nameContext base_window_name() throws RecognitionException {
		Base_window_nameContext _localctx = new Base_window_nameContext(_ctx, getState());
		enterRule(_localctx, 216, RULE_base_window_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2044);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Simple_funcContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Simple_funcContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simple_func; }
	}

	public final Simple_funcContext simple_func() throws RecognitionException {
		Simple_funcContext _localctx = new Simple_funcContext(_ctx, getState());
		enterRule(_localctx, 218, RULE_simple_func);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2046);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Aggregate_funcContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Aggregate_funcContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aggregate_func; }
	}

	public final Aggregate_funcContext aggregate_func() throws RecognitionException {
		Aggregate_funcContext _localctx = new Aggregate_funcContext(_ctx, getState());
		enterRule(_localctx, 220, RULE_aggregate_func);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2048);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Table_function_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Table_function_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_function_name; }
	}

	public final Table_function_nameContext table_function_name() throws RecognitionException {
		Table_function_nameContext _localctx = new Table_function_nameContext(_ctx, getState());
		enterRule(_localctx, 222, RULE_table_function_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2050);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Any_nameContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(SQLiteParser.IDENTIFIER, 0); }
		public KeywordContext keyword() {
			return getRuleContext(KeywordContext.class,0);
		}
		public TerminalNode STRING_LITERAL() { return getToken(SQLiteParser.STRING_LITERAL, 0); }
		public TerminalNode OPEN_PAR() { return getToken(SQLiteParser.OPEN_PAR, 0); }
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SQLiteParser.CLOSE_PAR, 0); }
		public Any_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_any_name; }
	}

	public final Any_nameContext any_name() throws RecognitionException {
		Any_nameContext _localctx = new Any_nameContext(_ctx, getState());
		enterRule(_localctx, 224, RULE_any_name);
		try {
			setState(2059);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(2052);
				match(IDENTIFIER);
				}
				break;
			case ABORT_:
			case ACTION_:
			case ADD_:
			case AFTER_:
			case ALL_:
			case ALTER_:
			case ANALYZE_:
			case AND_:
			case AS_:
			case ASC_:
			case ATTACH_:
			case AUTOINCREMENT_:
			case BEFORE_:
			case BEGIN_:
			case BETWEEN_:
			case BY_:
			case CASCADE_:
			case CASE_:
			case CAST_:
			case CHECK_:
			case COLLATE_:
			case COLUMN_:
			case COMMIT_:
			case CONFLICT_:
			case CONSTRAINT_:
			case CREATE_:
			case CROSS_:
			case CURRENT_DATE_:
			case CURRENT_TIME_:
			case CURRENT_TIMESTAMP_:
			case DATABASE_:
			case DEFAULT_:
			case DEFERRABLE_:
			case DEFERRED_:
			case DELETE_:
			case DESC_:
			case DETACH_:
			case DISTINCT_:
			case DROP_:
			case EACH_:
			case ELSE_:
			case END_:
			case ESCAPE_:
			case EXCEPT_:
			case EXCLUSIVE_:
			case EXISTS_:
			case EXPLAIN_:
			case FAIL_:
			case FOR_:
			case FOREIGN_:
			case FROM_:
			case FULL_:
			case GLOB_:
			case GROUP_:
			case HAVING_:
			case IF_:
			case IGNORE_:
			case IMMEDIATE_:
			case IN_:
			case INDEX_:
			case INDEXED_:
			case INITIALLY_:
			case INNER_:
			case INSERT_:
			case INSTEAD_:
			case INTERSECT_:
			case INTO_:
			case IS_:
			case ISNULL_:
			case JOIN_:
			case KEY_:
			case LEFT_:
			case LIKE_:
			case LIMIT_:
			case MATCH_:
			case NATURAL_:
			case NO_:
			case NOT_:
			case NOTNULL_:
			case NULL_:
			case OF_:
			case OFFSET_:
			case ON_:
			case OR_:
			case ORDER_:
			case OUTER_:
			case PLAN_:
			case PRAGMA_:
			case PRIMARY_:
			case QUERY_:
			case RAISE_:
			case RECURSIVE_:
			case REFERENCES_:
			case REGEXP_:
			case REINDEX_:
			case RELEASE_:
			case RENAME_:
			case REPLACE_:
			case RESTRICT_:
			case RIGHT_:
			case ROLLBACK_:
			case ROW_:
			case ROWS_:
			case SAVEPOINT_:
			case SELECT_:
			case SET_:
			case TABLE_:
			case TEMP_:
			case TEMPORARY_:
			case THEN_:
			case TO_:
			case TRANSACTION_:
			case TRIGGER_:
			case UNION_:
			case UNIQUE_:
			case UPDATE_:
			case USING_:
			case VACUUM_:
			case VALUES_:
			case VIEW_:
			case VIRTUAL_:
			case WHEN_:
			case WHERE_:
			case WITH_:
			case WITHOUT_:
			case FIRST_VALUE_:
			case OVER_:
			case PARTITION_:
			case RANGE_:
			case PRECEDING_:
			case UNBOUNDED_:
			case CURRENT_:
			case FOLLOWING_:
			case CUME_DIST_:
			case DENSE_RANK_:
			case LAG_:
			case LAST_VALUE_:
			case LEAD_:
			case NTH_VALUE_:
			case NTILE_:
			case PERCENT_RANK_:
			case RANK_:
			case ROW_NUMBER_:
			case GENERATED_:
			case ALWAYS_:
			case STORED_:
			case TRUE_:
			case FALSE_:
			case WINDOW_:
			case NULLS_:
			case FIRST_:
			case LAST_:
			case FILTER_:
			case GROUPS_:
			case EXCLUDE_:
				enterOuterAlt(_localctx, 2);
				{
				setState(2053);
				keyword();
				}
				break;
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(2054);
				match(STRING_LITERAL);
				}
				break;
			case OPEN_PAR:
				enterOuterAlt(_localctx, 4);
				{
				setState(2055);
				match(OPEN_PAR);
				setState(2056);
				any_name();
				setState(2057);
				match(CLOSE_PAR);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 32:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 20);
		case 1:
			return precpred(_ctx, 19);
		case 2:
			return precpred(_ctx, 18);
		case 3:
			return precpred(_ctx, 17);
		case 4:
			return precpred(_ctx, 16);
		case 5:
			return precpred(_ctx, 15);
		case 6:
			return precpred(_ctx, 14);
		case 7:
			return precpred(_ctx, 13);
		case 8:
			return precpred(_ctx, 6);
		case 9:
			return precpred(_ctx, 5);
		case 10:
			return precpred(_ctx, 9);
		case 11:
			return precpred(_ctx, 8);
		case 12:
			return precpred(_ctx, 7);
		case 13:
			return precpred(_ctx, 4);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u00c1\u080e\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007"+
		"\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007"+
		"\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007"+
		"\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007"+
		"\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007"+
		"\u001b\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007"+
		"\u001e\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007"+
		"\"\u0002#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007"+
		"\'\u0002(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007+\u0002,\u0007"+
		",\u0002-\u0007-\u0002.\u0007.\u0002/\u0007/\u00020\u00070\u00021\u0007"+
		"1\u00022\u00072\u00023\u00073\u00024\u00074\u00025\u00075\u00026\u0007"+
		"6\u00027\u00077\u00028\u00078\u00029\u00079\u0002:\u0007:\u0002;\u0007"+
		";\u0002<\u0007<\u0002=\u0007=\u0002>\u0007>\u0002?\u0007?\u0002@\u0007"+
		"@\u0002A\u0007A\u0002B\u0007B\u0002C\u0007C\u0002D\u0007D\u0002E\u0007"+
		"E\u0002F\u0007F\u0002G\u0007G\u0002H\u0007H\u0002I\u0007I\u0002J\u0007"+
		"J\u0002K\u0007K\u0002L\u0007L\u0002M\u0007M\u0002N\u0007N\u0002O\u0007"+
		"O\u0002P\u0007P\u0002Q\u0007Q\u0002R\u0007R\u0002S\u0007S\u0002T\u0007"+
		"T\u0002U\u0007U\u0002V\u0007V\u0002W\u0007W\u0002X\u0007X\u0002Y\u0007"+
		"Y\u0002Z\u0007Z\u0002[\u0007[\u0002\\\u0007\\\u0002]\u0007]\u0002^\u0007"+
		"^\u0002_\u0007_\u0002`\u0007`\u0002a\u0007a\u0002b\u0007b\u0002c\u0007"+
		"c\u0002d\u0007d\u0002e\u0007e\u0002f\u0007f\u0002g\u0007g\u0002h\u0007"+
		"h\u0002i\u0007i\u0002j\u0007j\u0002k\u0007k\u0002l\u0007l\u0002m\u0007"+
		"m\u0002n\u0007n\u0002o\u0007o\u0002p\u0007p\u0001\u0000\u0005\u0000\u00e4"+
		"\b\u0000\n\u0000\f\u0000\u00e7\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001"+
		"\u0005\u0001\u00ec\b\u0001\n\u0001\f\u0001\u00ef\t\u0001\u0001\u0001\u0001"+
		"\u0001\u0004\u0001\u00f3\b\u0001\u000b\u0001\f\u0001\u00f4\u0001\u0001"+
		"\u0005\u0001\u00f8\b\u0001\n\u0001\f\u0001\u00fb\t\u0001\u0001\u0001\u0005"+
		"\u0001\u00fe\b\u0001\n\u0001\f\u0001\u0101\t\u0001\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0003\u0002\u0106\b\u0002\u0003\u0002\u0108\b\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003"+
		"\u0002\u0122\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0003\u0003\u0129\b\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0003\u0003\u0130\b\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0003\u0003\u0136\b\u0003\u0001\u0003\u0001\u0003\u0003"+
		"\u0003\u013a\b\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003\u013f"+
		"\b\u0003\u0001\u0003\u0003\u0003\u0142\b\u0003\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004\u0149\b\u0004\u0001\u0004"+
		"\u0003\u0004\u014c\b\u0004\u0001\u0005\u0001\u0005\u0003\u0005\u0150\b"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001"+
		"\u0006\u0003\u0006\u0158\b\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u015c"+
		"\b\u0006\u0003\u0006\u015e\b\u0006\u0001\u0007\u0001\u0007\u0003\u0007"+
		"\u0162\b\u0007\u0001\b\u0001\b\u0003\b\u0166\b\b\u0001\b\u0001\b\u0003"+
		"\b\u016a\b\b\u0001\b\u0003\b\u016d\b\b\u0001\t\u0001\t\u0001\t\u0001\n"+
		"\u0001\n\u0003\n\u0174\b\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0003"+
		"\u000b\u017a\b\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0003"+
		"\u000b\u0180\b\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u0185"+
		"\b\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0005\u000b\u018e\b\u000b\n\u000b\f\u000b\u0191\t\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u0196\b\u000b\u0001\f"+
		"\u0001\f\u0003\f\u019a\b\f\u0001\f\u0001\f\u0003\f\u019e\b\f\u0001\f\u0003"+
		"\f\u01a1\b\f\u0001\r\u0001\r\u0003\r\u01a5\b\r\u0001\r\u0001\r\u0001\r"+
		"\u0001\r\u0003\r\u01ab\b\r\u0001\r\u0001\r\u0001\r\u0003\r\u01b0\b\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0005\r\u01b7\b\r\n\r\f\r\u01ba\t\r"+
		"\u0001\r\u0001\r\u0005\r\u01be\b\r\n\r\f\r\u01c1\t\r\u0001\r\u0001\r\u0001"+
		"\r\u0003\r\u01c6\b\r\u0001\r\u0001\r\u0003\r\u01ca\b\r\u0001\u000e\u0001"+
		"\u000e\u0003\u000e\u01ce\b\u000e\u0001\u000e\u0005\u000e\u01d1\b\u000e"+
		"\n\u000e\f\u000e\u01d4\t\u000e\u0001\u000f\u0004\u000f\u01d7\b\u000f\u000b"+
		"\u000f\f\u000f\u01d8\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0003"+
		"\u000f\u01e5\b\u000f\u0001\u0010\u0001\u0010\u0003\u0010\u01e9\b\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0003\u0010\u01ee\b\u0010\u0001\u0010"+
		"\u0003\u0010\u01f1\b\u0010\u0001\u0010\u0003\u0010\u01f4\b\u0010\u0001"+
		"\u0010\u0003\u0010\u01f7\b\u0010\u0001\u0010\u0001\u0010\u0003\u0010\u01fb"+
		"\b\u0010\u0001\u0010\u0003\u0010\u01fe\b\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0003\u0010\u020c\b\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0003\u0010"+
		"\u0213\b\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0003\u0010\u021a\b\u0010\u0003\u0010\u021c\b\u0010\u0001\u0011\u0003"+
		"\u0011\u021f\b\u0011\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0003"+
		"\u0012\u0225\b\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0003\u0012\u022a"+
		"\b\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0005\u0012\u0230"+
		"\b\u0012\n\u0012\f\u0012\u0233\t\u0012\u0001\u0012\u0001\u0012\u0003\u0012"+
		"\u0237\b\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0005\u0012\u0244\b\u0012\n\u0012\f\u0012\u0247\t\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0003\u0012\u024c\b\u0012\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0005\u0013\u0254\b\u0013\n"+
		"\u0013\f\u0013\u0257\t\u0013\u0001\u0013\u0001\u0013\u0003\u0013\u025b"+
		"\b\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0003\u0013\u0265\b\u0013\u0001\u0013\u0001"+
		"\u0013\u0005\u0013\u0269\b\u0013\n\u0013\f\u0013\u026c\t\u0013\u0001\u0013"+
		"\u0003\u0013\u026f\b\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0003\u0013"+
		"\u0274\b\u0013\u0003\u0013\u0276\b\u0013\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0003\u0015\u027e\b\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0003\u0015\u0284\b\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0003\u0015\u0289\b\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0003\u0015\u0290\b\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0005\u0015\u0299\b\u0015\n\u0015\f\u0015\u029c\t\u0015\u0003\u0015"+
		"\u029e\b\u0015\u0003\u0015\u02a0\b\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0003\u0015\u02a7\b\u0015\u0001\u0015\u0001"+
		"\u0015\u0003\u0015\u02ab\b\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0003\u0015\u02b2\b\u0015\u0001\u0015\u0001\u0015\u0004"+
		"\u0015\u02b6\b\u0015\u000b\u0015\f\u0015\u02b7\u0001\u0015\u0001\u0015"+
		"\u0001\u0016\u0001\u0016\u0003\u0016\u02be\b\u0016\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0003\u0016\u02c4\b\u0016\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0003\u0016\u02c9\b\u0016\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0005\u0016\u02d0\b\u0016\n\u0016\f\u0016\u02d3"+
		"\t\u0016\u0001\u0016\u0001\u0016\u0003\u0016\u02d7\b\u0016\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017"+
		"\u0001\u0017\u0001\u0017\u0003\u0017\u02e2\b\u0017\u0001\u0017\u0001\u0017"+
		"\u0001\u0017\u0003\u0017\u02e7\b\u0017\u0001\u0017\u0001\u0017\u0001\u0017"+
		"\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0005\u0017\u02f0\b\u0017"+
		"\n\u0017\f\u0017\u02f3\t\u0017\u0001\u0017\u0001\u0017\u0003\u0017\u02f7"+
		"\b\u0017\u0001\u0018\u0001\u0018\u0003\u0018\u02fb\b\u0018\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0005\u0018"+
		"\u0309\b\u0018\n\u0018\f\u0018\u030c\t\u0018\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0001\u0019\u0001\u0019\u0005\u0019\u0313\b\u0019\n\u0019\f\u0019"+
		"\u0316\t\u0019\u0001\u0019\u0001\u0019\u0003\u0019\u031a\b\u0019\u0001"+
		"\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0003"+
		"\u001a\u0322\b\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001b\u0001"+
		"\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0005\u001b\u032c\b\u001b\n"+
		"\u001b\f\u001b\u032f\t\u001b\u0001\u001b\u0001\u001b\u0003\u001b\u0333"+
		"\b\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001"+
		"\u001c\u0003\u001c\u033b\b\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001"+
		"\u001c\u0001\u001c\u0003\u001c\u0342\b\u001c\u0001\u001c\u0003\u001c\u0345"+
		"\b\u001c\u0001\u001d\u0003\u001d\u0348\b\u001d\u0001\u001d\u0001\u001d"+
		"\u0001\u001d\u0001\u001d\u0001\u001d\u0003\u001d\u034f\b\u001d\u0001\u001d"+
		"\u0003\u001d\u0352\b\u001d\u0001\u001d\u0003\u001d\u0355\b\u001d\u0001"+
		"\u001d\u0003\u001d\u0358\b\u001d\u0001\u001e\u0001\u001e\u0003\u001e\u035c"+
		"\b\u001e\u0001\u001e\u0001\u001e\u0001\u001f\u0001\u001f\u0001\u001f\u0001"+
		"\u001f\u0003\u001f\u0364\b\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0003"+
		"\u001f\u0369\b\u001f\u0001\u001f\u0001\u001f\u0001 \u0001 \u0001 \u0001"+
		" \u0001 \u0001 \u0003 \u0373\b \u0001 \u0001 \u0001 \u0003 \u0378\b \u0001"+
		" \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0003 \u0381\b \u0001 \u0001"+
		" \u0001 \u0005 \u0386\b \n \f \u0389\t \u0001 \u0003 \u038c\b \u0001 "+
		"\u0001 \u0003 \u0390\b \u0001 \u0003 \u0393\b \u0001 \u0001 \u0001 \u0001"+
		" \u0005 \u0399\b \n \f \u039c\t \u0001 \u0001 \u0001 \u0001 \u0001 \u0001"+
		" \u0001 \u0001 \u0001 \u0001 \u0003 \u03a8\b \u0001 \u0003 \u03ab\b \u0001"+
		" \u0001 \u0001 \u0001 \u0001 \u0001 \u0003 \u03b3\b \u0001 \u0001 \u0001"+
		" \u0001 \u0001 \u0004 \u03ba\b \u000b \f \u03bb\u0001 \u0001 \u0003 \u03c0"+
		"\b \u0001 \u0001 \u0001 \u0003 \u03c5\b \u0001 \u0001 \u0001 \u0001 \u0001"+
		" \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001"+
		" \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001"+
		" \u0003 \u03e0\b \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0003"+
		" \u03e9\b \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001"+
		" \u0001 \u0003 \u03f5\b \u0001 \u0001 \u0001 \u0003 \u03fa\b \u0001 \u0001"+
		" \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0003 \u0406"+
		"\b \u0001 \u0001 \u0001 \u0001 \u0003 \u040c\b \u0001 \u0001 \u0001 \u0001"+
		" \u0001 \u0003 \u0413\b \u0001 \u0001 \u0003 \u0417\b \u0001 \u0001 \u0001"+
		" \u0001 \u0001 \u0001 \u0005 \u041f\b \n \f \u0422\t \u0003 \u0424\b "+
		"\u0001 \u0001 \u0001 \u0001 \u0003 \u042a\b \u0001 \u0001 \u0001 \u0001"+
		" \u0003 \u0430\b \u0001 \u0001 \u0001 \u0001 \u0001 \u0005 \u0437\b \n"+
		" \f \u043a\t \u0003 \u043c\b \u0001 \u0001 \u0003 \u0440\b \u0005 \u0442"+
		"\b \n \f \u0445\t \u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0003!\u044d"+
		"\b!\u0001!\u0001!\u0001\"\u0001\"\u0001#\u0001#\u0001#\u0001#\u0005#\u0457"+
		"\b#\n#\f#\u045a\t#\u0001#\u0001#\u0001$\u0001$\u0001$\u0001$\u0005$\u0462"+
		"\b$\n$\f$\u0465\t$\u0001%\u0003%\u0468\b%\u0001%\u0001%\u0001%\u0001%"+
		"\u0001%\u0003%\u046f\b%\u0001%\u0001%\u0001%\u0001%\u0003%\u0475\b%\u0001"+
		"%\u0001%\u0001%\u0003%\u047a\b%\u0001%\u0001%\u0001%\u0001%\u0005%\u0480"+
		"\b%\n%\f%\u0483\t%\u0001%\u0001%\u0003%\u0487\b%\u0001%\u0001%\u0003%"+
		"\u048b\b%\u0001%\u0003%\u048e\b%\u0001%\u0001%\u0003%\u0492\b%\u0001%"+
		"\u0003%\u0495\b%\u0001&\u0001&\u0001&\u0001&\u0005&\u049b\b&\n&\f&\u049e"+
		"\t&\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0005\'\u04a6\b\'"+
		"\n\'\f\'\u04a9\t\'\u0001\'\u0001\'\u0001\'\u0003\'\u04ae\b\'\u0003\'\u04b0"+
		"\b\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0003\'\u04b8\b\'"+
		"\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0003\'\u04bf\b\'\u0001\'\u0001"+
		"\'\u0001\'\u0005\'\u04c4\b\'\n\'\f\'\u04c7\t\'\u0001\'\u0001\'\u0003\'"+
		"\u04cb\b\'\u0003\'\u04cd\b\'\u0001(\u0001(\u0001(\u0001(\u0003(\u04d3"+
		"\b(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0003(\u04dc\b(\u0001"+
		")\u0001)\u0001)\u0003)\u04e1\b)\u0001*\u0001*\u0001*\u0001*\u0001*\u0003"+
		"*\u04e8\b*\u0001*\u0001*\u0003*\u04ec\b*\u0003*\u04ee\b*\u0001+\u0003"+
		"+\u04f1\b+\u0001+\u0001+\u0001+\u0001+\u0005+\u04f7\b+\n+\f+\u04fa\t+"+
		"\u0001+\u0003+\u04fd\b+\u0001+\u0003+\u0500\b+\u0001,\u0001,\u0001,\u0001"+
		",\u0003,\u0506\b,\u0005,\u0508\b,\n,\f,\u050b\t,\u0001-\u0001-\u0003-"+
		"\u050f\b-\u0001-\u0001-\u0001-\u0005-\u0514\b-\n-\f-\u0517\t-\u0001-\u0001"+
		"-\u0001-\u0001-\u0005-\u051d\b-\n-\f-\u0520\t-\u0001-\u0003-\u0523\b-"+
		"\u0003-\u0525\b-\u0001-\u0001-\u0003-\u0529\b-\u0001-\u0001-\u0001-\u0001"+
		"-\u0001-\u0005-\u0530\b-\n-\f-\u0533\t-\u0001-\u0001-\u0003-\u0537\b-"+
		"\u0003-\u0539\b-\u0001-\u0001-\u0001-\u0001-\u0001-\u0001-\u0001-\u0001"+
		"-\u0001-\u0005-\u0544\b-\n-\f-\u0547\t-\u0003-\u0549\b-\u0001-\u0003-"+
		"\u054c\b-\u0001.\u0001.\u0001/\u0003/\u0551\b/\u0001/\u0001/\u0003/\u0555"+
		"\b/\u0001/\u0003/\u0558\b/\u00010\u00030\u055b\b0\u00010\u00010\u0001"+
		"0\u00030\u0560\b0\u00010\u00010\u00030\u0564\b0\u00010\u00040\u0567\b"+
		"0\u000b0\f0\u0568\u00010\u00030\u056c\b0\u00010\u00030\u056f\b0\u0001"+
		"1\u00011\u00011\u00031\u0574\b1\u00011\u00011\u00031\u0578\b1\u00011\u0003"+
		"1\u057b\b1\u00011\u00011\u00011\u00011\u00011\u00031\u0582\b1\u00011\u0001"+
		"1\u00011\u00031\u0587\b1\u00011\u00011\u00011\u00011\u00011\u00051\u058e"+
		"\b1\n1\f1\u0591\t1\u00011\u00011\u00031\u0595\b1\u00011\u00031\u0598\b"+
		"1\u00011\u00011\u00011\u00011\u00051\u059e\b1\n1\f1\u05a1\t1\u00011\u0003"+
		"1\u05a4\b1\u00011\u00011\u00011\u00011\u00011\u00011\u00031\u05ac\b1\u0001"+
		"1\u00031\u05af\b1\u00031\u05b1\b1\u00012\u00012\u00012\u00012\u00012\u0001"+
		"2\u00012\u00032\u05ba\b2\u00012\u00032\u05bd\b2\u00032\u05bf\b2\u0001"+
		"3\u00013\u00033\u05c3\b3\u00013\u00013\u00033\u05c7\b3\u00013\u00013\u0003"+
		"3\u05cb\b3\u00013\u00033\u05ce\b3\u00014\u00014\u00014\u00014\u00014\u0001"+
		"4\u00014\u00054\u05d7\b4\n4\f4\u05da\t4\u00014\u00014\u00034\u05de\b4"+
		"\u00015\u00015\u00035\u05e2\b5\u00015\u00015\u00035\u05e6\b5\u00016\u0003"+
		"6\u05e9\b6\u00016\u00016\u00016\u00036\u05ee\b6\u00016\u00016\u00016\u0001"+
		"6\u00036\u05f4\b6\u00016\u00016\u00016\u00016\u00016\u00036\u05fb\b6\u0001"+
		"6\u00016\u00016\u00056\u0600\b6\n6\f6\u0603\t6\u00016\u00016\u00016\u0001"+
		"6\u00056\u0609\b6\n6\f6\u060c\t6\u00016\u00036\u060f\b6\u00036\u0611\b"+
		"6\u00016\u00016\u00036\u0615\b6\u00016\u00036\u0618\b6\u00017\u00017\u0001"+
		"7\u00017\u00057\u061e\b7\n7\f7\u0621\t7\u00017\u00017\u00018\u00038\u0626"+
		"\b8\u00018\u00018\u00018\u00038\u062b\b8\u00018\u00018\u00018\u00018\u0003"+
		"8\u0631\b8\u00018\u00018\u00018\u00018\u00018\u00038\u0638\b8\u00018\u0001"+
		"8\u00018\u00058\u063d\b8\n8\f8\u0640\t8\u00018\u00018\u00038\u0644\b8"+
		"\u00018\u00038\u0647\b8\u00018\u00038\u064a\b8\u00018\u00038\u064d\b8"+
		"\u00019\u00019\u00019\u00039\u0652\b9\u00019\u00019\u00019\u00039\u0657"+
		"\b9\u00019\u00019\u00019\u00019\u00019\u00039\u065e\b9\u0001:\u0001:\u0003"+
		":\u0662\b:\u0001:\u0001:\u0003:\u0666\b:\u0001;\u0001;\u0001;\u0001;\u0001"+
		";\u0001;\u0001<\u0001<\u0003<\u0670\b<\u0001<\u0001<\u0001<\u0001<\u0001"+
		"<\u0005<\u0677\b<\n<\f<\u067a\t<\u0003<\u067c\b<\u0001<\u0001<\u0001<"+
		"\u0001<\u0001<\u0005<\u0683\b<\n<\f<\u0686\t<\u0001<\u0003<\u0689\b<\u0001"+
		"<\u0001<\u0001=\u0001=\u0001=\u0001=\u0003=\u0691\b=\u0001=\u0001=\u0001"+
		"=\u0001=\u0001=\u0005=\u0698\b=\n=\f=\u069b\t=\u0003=\u069d\b=\u0001="+
		"\u0001=\u0001=\u0001=\u0001=\u0005=\u06a4\b=\n=\f=\u06a7\t=\u0003=\u06a9"+
		"\b=\u0001=\u0003=\u06ac\b=\u0001=\u0003=\u06af\b=\u0001>\u0001>\u0001"+
		">\u0001>\u0001>\u0001>\u0001>\u0001>\u0003>\u06b9\b>\u0003>\u06bb\b>\u0001"+
		"?\u0001?\u0001?\u0001?\u0001?\u0001?\u0001?\u0003?\u06c4\b?\u0001@\u0001"+
		"@\u0001@\u0001@\u0001@\u0005@\u06cb\b@\n@\f@\u06ce\t@\u0001@\u0003@\u06d1"+
		"\b@\u0001@\u0001@\u0001A\u0001A\u0001A\u0003A\u06d8\bA\u0001A\u0001A\u0001"+
		"A\u0005A\u06dd\bA\nA\fA\u06e0\tA\u0001A\u0003A\u06e3\bA\u0001A\u0001A"+
		"\u0003A\u06e7\bA\u0001B\u0001B\u0001B\u0001B\u0001B\u0005B\u06ee\bB\n"+
		"B\fB\u06f1\tB\u0001B\u0003B\u06f4\bB\u0001B\u0001B\u0003B\u06f8\bB\u0001"+
		"B\u0001B\u0001B\u0003B\u06fd\bB\u0001C\u0001C\u0003C\u0701\bC\u0001C\u0001"+
		"C\u0001C\u0005C\u0706\bC\nC\fC\u0709\tC\u0001D\u0001D\u0001D\u0001D\u0001"+
		"D\u0005D\u0710\bD\nD\fD\u0713\tD\u0001E\u0001E\u0001E\u0001E\u0003E\u0719"+
		"\bE\u0001F\u0001F\u0001F\u0003F\u071e\bF\u0001F\u0003F\u0721\bF\u0001"+
		"F\u0001F\u0003F\u0725\bF\u0001G\u0001G\u0001H\u0001H\u0001H\u0001H\u0001"+
		"H\u0001H\u0001H\u0001H\u0001H\u0001H\u0003H\u0733\bH\u0001I\u0001I\u0001"+
		"I\u0001I\u0001I\u0001I\u0001I\u0001I\u0001I\u0001I\u0003I\u073f\bI\u0001"+
		"J\u0001J\u0001J\u0001J\u0001J\u0001J\u0001J\u0003J\u0748\bJ\u0001K\u0001"+
		"K\u0001K\u0001K\u0001K\u0001K\u0001K\u0003K\u0751\bK\u0001K\u0001K\u0003"+
		"K\u0755\bK\u0001K\u0001K\u0001K\u0001K\u0001K\u0001K\u0001K\u0001K\u0003"+
		"K\u075f\bK\u0001K\u0003K\u0762\bK\u0001K\u0001K\u0001K\u0001K\u0001K\u0001"+
		"K\u0001K\u0003K\u076b\bK\u0001K\u0001K\u0001K\u0001K\u0001K\u0001K\u0001"+
		"K\u0003K\u0774\bK\u0001K\u0003K\u0777\bK\u0001K\u0001K\u0001K\u0001K\u0003"+
		"K\u077d\bK\u0001K\u0001K\u0001K\u0001K\u0001K\u0001K\u0001K\u0001K\u0001"+
		"K\u0001K\u0001K\u0001K\u0003K\u078b\bK\u0001K\u0001K\u0003K\u078f\bK\u0001"+
		"K\u0001K\u0001K\u0001K\u0001K\u0001K\u0001K\u0001K\u0001K\u0003K\u079a"+
		"\bK\u0001K\u0001K\u0001K\u0003K\u079f\bK\u0001L\u0001L\u0001L\u0001M\u0001"+
		"M\u0001M\u0001N\u0001N\u0001N\u0004N\u07aa\bN\u000bN\fN\u07ab\u0001O\u0001"+
		"O\u0001O\u0004O\u07b1\bO\u000bO\fO\u07b2\u0001P\u0001P\u0001P\u0001P\u0001"+
		"Q\u0001Q\u0003Q\u07bb\bQ\u0001Q\u0001Q\u0001Q\u0003Q\u07c0\bQ\u0005Q\u07c2"+
		"\bQ\nQ\fQ\u07c5\tQ\u0001R\u0001R\u0001S\u0001S\u0001T\u0001T\u0001U\u0001"+
		"U\u0001V\u0001V\u0003V\u07d1\bV\u0001W\u0001W\u0001X\u0001X\u0001Y\u0001"+
		"Y\u0001Z\u0001Z\u0001[\u0001[\u0001\\\u0001\\\u0001]\u0001]\u0001^\u0001"+
		"^\u0001_\u0001_\u0001`\u0001`\u0001a\u0001a\u0001b\u0001b\u0001c\u0001"+
		"c\u0001d\u0001d\u0001e\u0001e\u0001f\u0001f\u0001g\u0001g\u0001h\u0001"+
		"h\u0001i\u0001i\u0001j\u0001j\u0001k\u0001k\u0001l\u0001l\u0001m\u0001"+
		"m\u0001n\u0001n\u0001o\u0001o\u0001p\u0001p\u0001p\u0001p\u0001p\u0001"+
		"p\u0001p\u0003p\u080c\bp\u0001p\u0002\u01b8\u01d8\u0001@q\u0000\u0002"+
		"\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e"+
		" \"$&(*,.02468:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086"+
		"\u0088\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098\u009a\u009c\u009e"+
		"\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4\u00b6"+
		"\u00b8\u00ba\u00bc\u00be\u00c0\u00c2\u00c4\u00c6\u00c8\u00ca\u00cc\u00ce"+
		"\u00d0\u00d2\u00d4\u00d6\u00d8\u00da\u00dc\u00de\u00e0\u0000\u001d\u0003"+
		"\u0000::EERR\u0002\u0000//BB\u0001\u0000\u0085\u0086\u0002\u0000\u0092"+
		"\u0092\u00ab\u00ab\u0001\u0000\b\t\u0002\u0000;;\u008d\u008d\u0002\u0000"+
		"88hh\u0002\u0000::RR\u0005\u0000\u0019\u0019HHQQzz~~\u0004\u0000TT\u0084"+
		"\u0084\u008a\u008a\u0091\u0091\u0002\u0000\u0007\u0007\f\r\u0001\u0000"+
		"\u000e\u0011\u0001\u0000\u0012\u0015\u0004\u0000MMaaccvv\u0003\u0000\u0019"+
		"\u0019HH~~\u0005\u000046hh\u00ac\u00ad\u00ba\u00ba\u00bc\u00bd\u0002\u0000"+
		"\u001d\u001d>>\u0003\u0000LL``}}\u0003\u0000\u0080\u0080\u009a\u009a\u00b3"+
		"\u00b3\u0002\u0000\u0005\u0005jj\u0001\u0000\u00b0\u00b1\u0002\u0000\""+
		"\"<<\u0002\u0000\u0097\u0097\u00a2\u00a2\u0002\u0000\u009f\u009f\u00a6"+
		"\u00a6\u0002\u0000\u00a0\u00a0\u00a7\u00a8\u0002\u0000\u00a1\u00a1\u00a3"+
		"\u00a3\u0002\u0000\b\nff\u0002\u0000\u00b9\u00b9\u00bc\u00bc\u0002\u0000"+
		"\u0019{}\u00b4\u092a\u0000\u00e5\u0001\u0000\u0000\u0000\u0002\u00ed\u0001"+
		"\u0000\u0000\u0000\u0004\u0107\u0001\u0000\u0000\u0000\u0006\u0123\u0001"+
		"\u0000\u0000\u0000\b\u0143\u0001\u0000\u0000\u0000\n\u014d\u0001\u0000"+
		"\u0000\u0000\f\u0155\u0001\u0000\u0000\u0000\u000e\u015f\u0001\u0000\u0000"+
		"\u0000\u0010\u0163\u0001\u0000\u0000\u0000\u0012\u016e\u0001\u0000\u0000"+
		"\u0000\u0014\u0171\u0001\u0000\u0000\u0000\u0016\u0177\u0001\u0000\u0000"+
		"\u0000\u0018\u0199\u0001\u0000\u0000\u0000\u001a\u01a2\u0001\u0000\u0000"+
		"\u0000\u001c\u01cb\u0001\u0000\u0000\u0000\u001e\u01d6\u0001\u0000\u0000"+
		"\u0000 \u01e8\u0001\u0000\u0000\u0000\"\u021e\u0001\u0000\u0000\u0000"+
		"$\u0224\u0001\u0000\u0000\u0000&\u024d\u0001\u0000\u0000\u0000(\u0277"+
		"\u0001\u0000\u0000\u0000*\u027b\u0001\u0000\u0000\u0000,\u02bb\u0001\u0000"+
		"\u0000\u0000.\u02db\u0001\u0000\u0000\u00000\u02f8\u0001\u0000\u0000\u0000"+
		"2\u030d\u0001\u0000\u0000\u00004\u031b\u0001\u0000\u0000\u00006\u0326"+
		"\u0001\u0000\u0000\u00008\u033a\u0001\u0000\u0000\u0000:\u0347\u0001\u0000"+
		"\u0000\u0000<\u0359\u0001\u0000\u0000\u0000>\u035f\u0001\u0000\u0000\u0000"+
		"@\u03c4\u0001\u0000\u0000\u0000B\u0446\u0001\u0000\u0000\u0000D\u0450"+
		"\u0001\u0000\u0000\u0000F\u0452\u0001\u0000\u0000\u0000H\u045d\u0001\u0000"+
		"\u0000\u0000J\u0467\u0001\u0000\u0000\u0000L\u0496\u0001\u0000\u0000\u0000"+
		"N\u049f\u0001\u0000\u0000\u0000P\u04ce\u0001\u0000\u0000\u0000R\u04e0"+
		"\u0001\u0000\u0000\u0000T\u04e2\u0001\u0000\u0000\u0000V\u04f0\u0001\u0000"+
		"\u0000\u0000X\u0501\u0001\u0000\u0000\u0000Z\u054b\u0001\u0000\u0000\u0000"+
		"\\\u054d\u0001\u0000\u0000\u0000^\u0550\u0001\u0000\u0000\u0000`\u055a"+
		"\u0001\u0000\u0000\u0000b\u05b0\u0001\u0000\u0000\u0000d\u05be\u0001\u0000"+
		"\u0000\u0000f\u05cd\u0001\u0000\u0000\u0000h\u05dd\u0001\u0000\u0000\u0000"+
		"j\u05e5\u0001\u0000\u0000\u0000l\u05e8\u0001\u0000\u0000\u0000n\u0619"+
		"\u0001\u0000\u0000\u0000p\u0625\u0001\u0000\u0000\u0000r\u0651\u0001\u0000"+
		"\u0000\u0000t\u065f\u0001\u0000\u0000\u0000v\u0667\u0001\u0000\u0000\u0000"+
		"x\u066d\u0001\u0000\u0000\u0000z\u068c\u0001\u0000\u0000\u0000|\u06b0"+
		"\u0001\u0000\u0000\u0000~\u06bc\u0001\u0000\u0000\u0000\u0080\u06c5\u0001"+
		"\u0000\u0000\u0000\u0082\u06d4\u0001\u0000\u0000\u0000\u0084\u06e8\u0001"+
		"\u0000\u0000\u0000\u0086\u06fe\u0001\u0000\u0000\u0000\u0088\u070a\u0001"+
		"\u0000\u0000\u0000\u008a\u0714\u0001\u0000\u0000\u0000\u008c\u071a\u0001"+
		"\u0000\u0000\u0000\u008e\u0726\u0001\u0000\u0000\u0000\u0090\u0732\u0001"+
		"\u0000\u0000\u0000\u0092\u073e\u0001\u0000\u0000\u0000\u0094\u0747\u0001"+
		"\u0000\u0000\u0000\u0096\u079e\u0001\u0000\u0000\u0000\u0098\u07a0\u0001"+
		"\u0000\u0000\u0000\u009a\u07a3\u0001\u0000\u0000\u0000\u009c\u07a6\u0001"+
		"\u0000\u0000\u0000\u009e\u07ad\u0001\u0000\u0000\u0000\u00a0\u07b4\u0001"+
		"\u0000\u0000\u0000\u00a2\u07b8\u0001\u0000\u0000\u0000\u00a4\u07c6\u0001"+
		"\u0000\u0000\u0000\u00a6\u07c8\u0001\u0000\u0000\u0000\u00a8\u07ca\u0001"+
		"\u0000\u0000\u0000\u00aa\u07cc\u0001\u0000\u0000\u0000\u00ac\u07d0\u0001"+
		"\u0000\u0000\u0000\u00ae\u07d2\u0001\u0000\u0000\u0000\u00b0\u07d4\u0001"+
		"\u0000\u0000\u0000\u00b2\u07d6\u0001\u0000\u0000\u0000\u00b4\u07d8\u0001"+
		"\u0000\u0000\u0000\u00b6\u07da\u0001\u0000\u0000\u0000\u00b8\u07dc\u0001"+
		"\u0000\u0000\u0000\u00ba\u07de\u0001\u0000\u0000\u0000\u00bc\u07e0\u0001"+
		"\u0000\u0000\u0000\u00be\u07e2\u0001\u0000\u0000\u0000\u00c0\u07e4\u0001"+
		"\u0000\u0000\u0000\u00c2\u07e6\u0001\u0000\u0000\u0000\u00c4\u07e8\u0001"+
		"\u0000\u0000\u0000\u00c6\u07ea\u0001\u0000\u0000\u0000\u00c8\u07ec\u0001"+
		"\u0000\u0000\u0000\u00ca\u07ee\u0001\u0000\u0000\u0000\u00cc\u07f0\u0001"+
		"\u0000\u0000\u0000\u00ce\u07f2\u0001\u0000\u0000\u0000\u00d0\u07f4\u0001"+
		"\u0000\u0000\u0000\u00d2\u07f6\u0001\u0000\u0000\u0000\u00d4\u07f8\u0001"+
		"\u0000\u0000\u0000\u00d6\u07fa\u0001\u0000\u0000\u0000\u00d8\u07fc\u0001"+
		"\u0000\u0000\u0000\u00da\u07fe\u0001\u0000\u0000\u0000\u00dc\u0800\u0001"+
		"\u0000\u0000\u0000\u00de\u0802\u0001\u0000\u0000\u0000\u00e0\u080b\u0001"+
		"\u0000\u0000\u0000\u00e2\u00e4\u0003\u0002\u0001\u0000\u00e3\u00e2\u0001"+
		"\u0000\u0000\u0000\u00e4\u00e7\u0001\u0000\u0000\u0000\u00e5\u00e3\u0001"+
		"\u0000\u0000\u0000\u00e5\u00e6\u0001\u0000\u0000\u0000\u00e6\u00e8\u0001"+
		"\u0000\u0000\u0000\u00e7\u00e5\u0001\u0000\u0000\u0000\u00e8\u00e9\u0005"+
		"\u0000\u0000\u0001\u00e9\u0001\u0001\u0000\u0000\u0000\u00ea\u00ec\u0005"+
		"\u0001\u0000\u0000\u00eb\u00ea\u0001\u0000\u0000\u0000\u00ec\u00ef\u0001"+
		"\u0000\u0000\u0000\u00ed\u00eb\u0001\u0000\u0000\u0000\u00ed\u00ee\u0001"+
		"\u0000\u0000\u0000\u00ee\u00f0\u0001\u0000\u0000\u0000\u00ef\u00ed\u0001"+
		"\u0000\u0000\u0000\u00f0\u00f9\u0003\u0004\u0002\u0000\u00f1\u00f3\u0005"+
		"\u0001\u0000\u0000\u00f2\u00f1\u0001\u0000\u0000\u0000\u00f3\u00f4\u0001"+
		"\u0000\u0000\u0000\u00f4\u00f2\u0001\u0000\u0000\u0000\u00f4\u00f5\u0001"+
		"\u0000\u0000\u0000\u00f5\u00f6\u0001\u0000\u0000\u0000\u00f6\u00f8\u0003"+
		"\u0004\u0002\u0000\u00f7\u00f2\u0001\u0000\u0000\u0000\u00f8\u00fb\u0001"+
		"\u0000\u0000\u0000\u00f9\u00f7\u0001\u0000\u0000\u0000\u00f9\u00fa\u0001"+
		"\u0000\u0000\u0000\u00fa\u00ff\u0001\u0000\u0000\u0000\u00fb\u00f9\u0001"+
		"\u0000\u0000\u0000\u00fc\u00fe\u0005\u0001\u0000\u0000\u00fd\u00fc\u0001"+
		"\u0000\u0000\u0000\u00fe\u0101\u0001\u0000\u0000\u0000\u00ff\u00fd\u0001"+
		"\u0000\u0000\u0000\u00ff\u0100\u0001\u0000\u0000\u0000\u0100\u0003\u0001"+
		"\u0000\u0000\u0000\u0101\u00ff\u0001\u0000\u0000\u0000\u0102\u0105\u0005"+
		"G\u0000\u0000\u0103\u0104\u0005r\u0000\u0000\u0104\u0106\u0005o\u0000"+
		"\u0000\u0105\u0103\u0001\u0000\u0000\u0000\u0105\u0106\u0001\u0000\u0000"+
		"\u0000\u0106\u0108\u0001\u0000\u0000\u0000\u0107\u0102\u0001\u0000\u0000"+
		"\u0000\u0107\u0108\u0001\u0000\u0000\u0000\u0108\u0121\u0001\u0000\u0000"+
		"\u0000\u0109\u0122\u0003\u0006\u0003\u0000\u010a\u0122\u0003\b\u0004\u0000"+
		"\u010b\u0122\u0003\n\u0005\u0000\u010c\u0122\u0003\f\u0006\u0000\u010d"+
		"\u0122\u0003\u000e\u0007\u0000\u010e\u0122\u0003\u0016\u000b\u0000\u010f"+
		"\u0122\u0003\u001a\r\u0000\u0110\u0122\u0003*\u0015\u0000\u0111\u0122"+
		"\u0003,\u0016\u0000\u0112\u0122\u0003.\u0017\u0000\u0113\u0122\u00038"+
		"\u001c\u0000\u0114\u0122\u0003:\u001d\u0000\u0115\u0122\u0003<\u001e\u0000"+
		"\u0116\u0122\u0003>\u001f\u0000\u0117\u0122\u0003J%\u0000\u0118\u0122"+
		"\u0003P(\u0000\u0119\u0122\u0003T*\u0000\u011a\u0122\u0003\u0014\n\u0000"+
		"\u011b\u0122\u0003\u0010\b\u0000\u011c\u0122\u0003\u0012\t\u0000\u011d"+
		"\u0122\u0003V+\u0000\u011e\u0122\u0003l6\u0000\u011f\u0122\u0003p8\u0000"+
		"\u0120\u0122\u0003t:\u0000\u0121\u0109\u0001\u0000\u0000\u0000\u0121\u010a"+
		"\u0001\u0000\u0000\u0000\u0121\u010b\u0001\u0000\u0000\u0000\u0121\u010c"+
		"\u0001\u0000\u0000\u0000\u0121\u010d\u0001\u0000\u0000\u0000\u0121\u010e"+
		"\u0001\u0000\u0000\u0000\u0121\u010f\u0001\u0000\u0000\u0000\u0121\u0110"+
		"\u0001\u0000\u0000\u0000\u0121\u0111\u0001\u0000\u0000\u0000\u0121\u0112"+
		"\u0001\u0000\u0000\u0000\u0121\u0113\u0001\u0000\u0000\u0000\u0121\u0114"+
		"\u0001\u0000\u0000\u0000\u0121\u0115\u0001\u0000\u0000\u0000\u0121\u0116"+
		"\u0001\u0000\u0000\u0000\u0121\u0117\u0001\u0000\u0000\u0000\u0121\u0118"+
		"\u0001\u0000\u0000\u0000\u0121\u0119\u0001\u0000\u0000\u0000\u0121\u011a"+
		"\u0001\u0000\u0000\u0000\u0121\u011b\u0001\u0000\u0000\u0000\u0121\u011c"+
		"\u0001\u0000\u0000\u0000\u0121\u011d\u0001\u0000\u0000\u0000\u0121\u011e"+
		"\u0001\u0000\u0000\u0000\u0121\u011f\u0001\u0000\u0000\u0000\u0121\u0120"+
		"\u0001\u0000\u0000\u0000\u0122\u0005\u0001\u0000\u0000\u0000\u0123\u0124"+
		"\u0005\u001e\u0000\u0000\u0124\u0128\u0005\u0084\u0000\u0000\u0125\u0126"+
		"\u0003\u00b6[\u0000\u0126\u0127\u0005\u0002\u0000\u0000\u0127\u0129\u0001"+
		"\u0000\u0000\u0000\u0128\u0125\u0001\u0000\u0000\u0000\u0128\u0129\u0001"+
		"\u0000\u0000\u0000\u0129\u012a\u0001\u0000\u0000\u0000\u012a\u0141\u0003"+
		"\u00b8\\\u0000\u012b\u0135\u0005y\u0000\u0000\u012c\u012d\u0005\u0088"+
		"\u0000\u0000\u012d\u0136\u0003\u00b8\\\u0000\u012e\u0130\u0005.\u0000"+
		"\u0000\u012f\u012e\u0001\u0000\u0000\u0000\u012f\u0130\u0001\u0000\u0000"+
		"\u0000\u0130\u0131\u0001\u0000\u0000\u0000\u0131\u0132\u0003\u00bc^\u0000"+
		"\u0132\u0133\u0005\u0088\u0000\u0000\u0133\u0134\u0003\u00bc^\u0000\u0134"+
		"\u0136\u0001\u0000\u0000\u0000\u0135\u012c\u0001\u0000\u0000\u0000\u0135"+
		"\u012f\u0001\u0000\u0000\u0000\u0136\u0142\u0001\u0000\u0000\u0000\u0137"+
		"\u0139\u0005\u001b\u0000\u0000\u0138\u013a\u0005.\u0000\u0000\u0139\u0138"+
		"\u0001\u0000\u0000\u0000\u0139\u013a\u0001\u0000\u0000\u0000\u013a\u013b"+
		"\u0001\u0000\u0000\u0000\u013b\u0142\u0003\u001c\u000e\u0000\u013c\u013e"+
		"\u0005?\u0000\u0000\u013d\u013f\u0005.\u0000\u0000\u013e\u013d\u0001\u0000"+
		"\u0000\u0000\u013e\u013f\u0001\u0000\u0000\u0000\u013f\u0140\u0001\u0000"+
		"\u0000\u0000\u0140\u0142\u0003\u00bc^\u0000\u0141\u012b\u0001\u0000\u0000"+
		"\u0000\u0141\u0137\u0001\u0000\u0000\u0000\u0141\u013c\u0001\u0000\u0000"+
		"\u0000\u0142\u0007\u0001\u0000\u0000\u0000\u0143\u014b\u0005\u001f\u0000"+
		"\u0000\u0144\u014c\u0003\u00b6[\u0000\u0145\u0146\u0003\u00b6[\u0000\u0146"+
		"\u0147\u0005\u0002\u0000\u0000\u0147\u0149\u0001\u0000\u0000\u0000\u0148"+
		"\u0145\u0001\u0000\u0000\u0000\u0148\u0149\u0001\u0000\u0000\u0000\u0149"+
		"\u014a\u0001\u0000\u0000\u0000\u014a\u014c\u0003\u00ba]\u0000\u014b\u0144"+
		"\u0001\u0000\u0000\u0000\u014b\u0148\u0001\u0000\u0000\u0000\u014b\u014c"+
		"\u0001\u0000\u0000\u0000\u014c\t\u0001\u0000\u0000\u0000\u014d\u014f\u0005"+
		"#\u0000\u0000\u014e\u0150\u00057\u0000\u0000\u014f\u014e\u0001\u0000\u0000"+
		"\u0000\u014f\u0150\u0001\u0000\u0000\u0000\u0150\u0151\u0001\u0000\u0000"+
		"\u0000\u0151\u0152\u0003@ \u0000\u0152\u0153\u0005!\u0000\u0000\u0153"+
		"\u0154\u0003\u00b6[\u0000\u0154\u000b\u0001\u0000\u0000\u0000\u0155\u0157"+
		"\u0005&\u0000\u0000\u0156\u0158\u0007\u0000\u0000\u0000\u0157\u0156\u0001"+
		"\u0000\u0000\u0000\u0157\u0158\u0001\u0000\u0000\u0000\u0158\u015d\u0001"+
		"\u0000\u0000\u0000\u0159\u015b\u0005\u0089\u0000\u0000\u015a\u015c\u0003"+
		"\u00ceg\u0000\u015b\u015a\u0001\u0000\u0000\u0000\u015b\u015c\u0001\u0000"+
		"\u0000\u0000\u015c\u015e\u0001\u0000\u0000\u0000\u015d\u0159\u0001\u0000"+
		"\u0000\u0000\u015d\u015e\u0001\u0000\u0000\u0000\u015e\r\u0001\u0000\u0000"+
		"\u0000\u015f\u0161\u0007\u0001\u0000\u0000\u0160\u0162\u0005\u0089\u0000"+
		"\u0000\u0161\u0160\u0001\u0000\u0000\u0000\u0161\u0162\u0001\u0000\u0000"+
		"\u0000\u0162\u000f\u0001\u0000\u0000\u0000\u0163\u0165\u0005~\u0000\u0000"+
		"\u0164\u0166\u0005\u0089\u0000\u0000\u0165\u0164\u0001\u0000\u0000\u0000"+
		"\u0165\u0166\u0001\u0000\u0000\u0000\u0166\u016c\u0001\u0000\u0000\u0000"+
		"\u0167\u0169\u0005\u0088\u0000\u0000\u0168\u016a\u0005\u0081\u0000\u0000"+
		"\u0169\u0168\u0001\u0000\u0000\u0000\u0169\u016a\u0001\u0000\u0000\u0000"+
		"\u016a\u016b\u0001\u0000\u0000\u0000\u016b\u016d\u0003\u00ccf\u0000\u016c"+
		"\u0167\u0001\u0000\u0000\u0000\u016c\u016d\u0001\u0000\u0000\u0000\u016d"+
		"\u0011\u0001\u0000\u0000\u0000\u016e\u016f\u0005\u0081\u0000\u0000\u016f"+
		"\u0170\u0003\u00ccf\u0000\u0170\u0013\u0001\u0000\u0000\u0000\u0171\u0173"+
		"\u0005x\u0000\u0000\u0172\u0174\u0005\u0081\u0000\u0000\u0173\u0172\u0001"+
		"\u0000\u0000\u0000\u0173\u0174\u0001\u0000\u0000\u0000\u0174\u0175\u0001"+
		"\u0000\u0000\u0000\u0175\u0176\u0003\u00ccf\u0000\u0176\u0015\u0001\u0000"+
		"\u0000\u0000\u0177\u0179\u00052\u0000\u0000\u0178\u017a\u0005\u008c\u0000"+
		"\u0000\u0179\u0178\u0001\u0000\u0000\u0000\u0179\u017a\u0001\u0000\u0000"+
		"\u0000\u017a\u017b\u0001\u0000\u0000\u0000\u017b\u017f\u0005T\u0000\u0000"+
		"\u017c\u017d\u0005P\u0000\u0000\u017d\u017e\u0005f\u0000\u0000\u017e\u0180"+
		"\u0005F\u0000\u0000\u017f\u017c\u0001\u0000\u0000\u0000\u017f\u0180\u0001"+
		"\u0000\u0000\u0000\u0180\u0184\u0001\u0000\u0000\u0000\u0181\u0182\u0003"+
		"\u00b6[\u0000\u0182\u0183\u0005\u0002\u0000\u0000\u0183\u0185\u0001\u0000"+
		"\u0000\u0000\u0184\u0181\u0001\u0000\u0000\u0000\u0184\u0185\u0001\u0000"+
		"\u0000\u0000\u0185\u0186\u0001\u0000\u0000\u0000\u0186\u0187\u0003\u00c2"+
		"a\u0000\u0187\u0188\u0005k\u0000\u0000\u0188\u0189\u0003\u00b8\\\u0000"+
		"\u0189\u018a\u0005\u0003\u0000\u0000\u018a\u018f\u0003\u0018\f\u0000\u018b"+
		"\u018c\u0005\u0005\u0000\u0000\u018c\u018e\u0003\u0018\f\u0000\u018d\u018b"+
		"\u0001\u0000\u0000\u0000\u018e\u0191\u0001\u0000\u0000\u0000\u018f\u018d"+
		"\u0001\u0000\u0000\u0000\u018f\u0190\u0001\u0000\u0000\u0000\u0190\u0192"+
		"\u0001\u0000\u0000\u0000\u0191\u018f\u0001\u0000\u0000\u0000\u0192\u0195"+
		"\u0005\u0004\u0000\u0000\u0193\u0194\u0005\u0094\u0000\u0000\u0194\u0196"+
		"\u0003@ \u0000\u0195\u0193\u0001\u0000\u0000\u0000\u0195\u0196\u0001\u0000"+
		"\u0000\u0000\u0196\u0017\u0001\u0000\u0000\u0000\u0197\u019a\u0003\u00bc"+
		"^\u0000\u0198\u019a\u0003@ \u0000\u0199\u0197\u0001\u0000\u0000\u0000"+
		"\u0199\u0198\u0001\u0000\u0000\u0000\u019a\u019d\u0001\u0000\u0000\u0000"+
		"\u019b\u019c\u0005-\u0000\u0000\u019c\u019e\u0003\u00be_\u0000\u019d\u019b"+
		"\u0001\u0000\u0000\u0000\u019d\u019e\u0001\u0000\u0000\u0000\u019e\u01a0"+
		"\u0001\u0000\u0000\u0000\u019f\u01a1\u0003\u008eG\u0000\u01a0\u019f\u0001"+
		"\u0000\u0000\u0000\u01a0\u01a1\u0001\u0000\u0000\u0000\u01a1\u0019\u0001"+
		"\u0000\u0000\u0000\u01a2\u01a4\u00052\u0000\u0000\u01a3\u01a5\u0007\u0002"+
		"\u0000\u0000\u01a4\u01a3\u0001\u0000\u0000\u0000\u01a4\u01a5\u0001\u0000"+
		"\u0000\u0000\u01a5\u01a6\u0001\u0000\u0000\u0000\u01a6\u01aa\u0005\u0084"+
		"\u0000\u0000\u01a7\u01a8\u0005P\u0000\u0000\u01a8\u01a9\u0005f\u0000\u0000"+
		"\u01a9\u01ab\u0005F\u0000\u0000\u01aa\u01a7\u0001\u0000\u0000\u0000\u01aa"+
		"\u01ab\u0001\u0000\u0000\u0000\u01ab\u01af\u0001\u0000\u0000\u0000\u01ac"+
		"\u01ad\u0003\u00b6[\u0000\u01ad\u01ae\u0005\u0002\u0000\u0000\u01ae\u01b0"+
		"\u0001\u0000\u0000\u0000\u01af\u01ac\u0001\u0000\u0000\u0000\u01af\u01b0"+
		"\u0001\u0000\u0000\u0000\u01b0\u01b1\u0001\u0000\u0000\u0000\u01b1\u01c9"+
		"\u0003\u00b8\\\u0000\u01b2\u01b3\u0005\u0003\u0000\u0000\u01b3\u01b8\u0003"+
		"\u001c\u000e\u0000\u01b4\u01b5\u0005\u0005\u0000\u0000\u01b5\u01b7\u0003"+
		"\u001c\u000e\u0000\u01b6\u01b4\u0001\u0000\u0000\u0000\u01b7\u01ba\u0001"+
		"\u0000\u0000\u0000\u01b8\u01b9\u0001\u0000\u0000\u0000\u01b8\u01b6\u0001"+
		"\u0000\u0000\u0000\u01b9\u01bf\u0001\u0000\u0000\u0000\u01ba\u01b8\u0001"+
		"\u0000\u0000\u0000\u01bb\u01bc\u0005\u0005\u0000\u0000\u01bc\u01be\u0003"+
		"$\u0012\u0000\u01bd\u01bb\u0001\u0000\u0000\u0000\u01be\u01c1\u0001\u0000"+
		"\u0000\u0000\u01bf\u01bd\u0001\u0000\u0000\u0000\u01bf\u01c0\u0001\u0000"+
		"\u0000\u0000\u01c0\u01c2\u0001\u0000\u0000\u0000\u01c1\u01bf\u0001\u0000"+
		"\u0000\u0000\u01c2\u01c5\u0005\u0004\u0000\u0000\u01c3\u01c4\u0005\u0096"+
		"\u0000\u0000\u01c4\u01c6\u0005\u00b9\u0000\u0000\u01c5\u01c3\u0001\u0000"+
		"\u0000\u0000\u01c5\u01c6\u0001\u0000\u0000\u0000\u01c6\u01ca\u0001\u0000"+
		"\u0000\u0000\u01c7\u01c8\u0005!\u0000\u0000\u01c8\u01ca\u0003V+\u0000"+
		"\u01c9\u01b2\u0001\u0000\u0000\u0000\u01c9\u01c7\u0001\u0000\u0000\u0000"+
		"\u01ca\u001b\u0001\u0000\u0000\u0000\u01cb\u01cd\u0003\u00bc^\u0000\u01cc"+
		"\u01ce\u0003\u001e\u000f\u0000\u01cd\u01cc\u0001\u0000\u0000\u0000\u01cd"+
		"\u01ce\u0001\u0000\u0000\u0000\u01ce\u01d2\u0001\u0000\u0000\u0000\u01cf"+
		"\u01d1\u0003 \u0010\u0000\u01d0\u01cf\u0001\u0000\u0000\u0000\u01d1\u01d4"+
		"\u0001\u0000\u0000\u0000\u01d2\u01d0\u0001\u0000\u0000\u0000\u01d2\u01d3"+
		"\u0001\u0000\u0000\u0000\u01d3\u001d\u0001\u0000\u0000\u0000\u01d4\u01d2"+
		"\u0001\u0000\u0000\u0000\u01d5\u01d7\u0003\u00b2Y\u0000\u01d6\u01d5\u0001"+
		"\u0000\u0000\u0000\u01d7\u01d8\u0001\u0000\u0000\u0000\u01d8\u01d9\u0001"+
		"\u0000\u0000\u0000\u01d8\u01d6\u0001\u0000\u0000\u0000\u01d9\u01e4\u0001"+
		"\u0000\u0000\u0000\u01da\u01db\u0005\u0003\u0000\u0000\u01db\u01dc\u0003"+
		"\"\u0011\u0000\u01dc\u01dd\u0005\u0004\u0000\u0000\u01dd\u01e5\u0001\u0000"+
		"\u0000\u0000\u01de\u01df\u0005\u0003\u0000\u0000\u01df\u01e0\u0003\"\u0011"+
		"\u0000\u01e0\u01e1\u0005\u0005\u0000\u0000\u01e1\u01e2\u0003\"\u0011\u0000"+
		"\u01e2\u01e3\u0005\u0004\u0000\u0000\u01e3\u01e5\u0001\u0000\u0000\u0000"+
		"\u01e4\u01da\u0001\u0000\u0000\u0000\u01e4\u01de\u0001\u0000\u0000\u0000"+
		"\u01e4\u01e5\u0001\u0000\u0000\u0000\u01e5\u001f\u0001\u0000\u0000\u0000"+
		"\u01e6\u01e7\u00051\u0000\u0000\u01e7\u01e9\u0003\u00b2Y\u0000\u01e8\u01e6"+
		"\u0001\u0000\u0000\u0000\u01e8\u01e9\u0001\u0000\u0000\u0000\u01e9\u021b"+
		"\u0001\u0000\u0000\u0000\u01ea\u01eb\u0005q\u0000\u0000\u01eb\u01ed\u0005"+
		"_\u0000\u0000\u01ec\u01ee\u0003\u008eG\u0000\u01ed\u01ec\u0001\u0000\u0000"+
		"\u0000\u01ed\u01ee\u0001\u0000\u0000\u0000\u01ee\u01f0\u0001\u0000\u0000"+
		"\u0000\u01ef\u01f1\u0003(\u0014\u0000\u01f0\u01ef\u0001\u0000\u0000\u0000"+
		"\u01f0\u01f1\u0001\u0000\u0000\u0000\u01f1\u01f3\u0001\u0000\u0000\u0000"+
		"\u01f2\u01f4\u0005$\u0000\u0000\u01f3\u01f2\u0001\u0000\u0000\u0000\u01f3"+
		"\u01f4\u0001\u0000\u0000\u0000\u01f4\u021c\u0001\u0000\u0000\u0000\u01f5"+
		"\u01f7\u0005f\u0000\u0000\u01f6\u01f5\u0001\u0000\u0000\u0000\u01f6\u01f7"+
		"\u0001\u0000\u0000\u0000\u01f7\u01f8\u0001\u0000\u0000\u0000\u01f8\u01fb"+
		"\u0005h\u0000\u0000\u01f9\u01fb\u0005\u008c\u0000\u0000\u01fa\u01f6\u0001"+
		"\u0000\u0000\u0000\u01fa\u01f9\u0001\u0000\u0000\u0000\u01fb\u01fd\u0001"+
		"\u0000\u0000\u0000\u01fc\u01fe\u0003(\u0014\u0000\u01fd\u01fc\u0001\u0000"+
		"\u0000\u0000\u01fd\u01fe\u0001\u0000\u0000\u0000\u01fe\u021c\u0001\u0000"+
		"\u0000\u0000\u01ff\u0200\u0005,\u0000\u0000\u0200\u0201\u0005\u0003\u0000"+
		"\u0000\u0201\u0202\u0003@ \u0000\u0202\u0203\u0005\u0004\u0000\u0000\u0203"+
		"\u021c\u0001\u0000\u0000\u0000\u0204\u020b\u00058\u0000\u0000\u0205\u020c"+
		"\u0003\"\u0011\u0000\u0206\u020c\u0003D\"\u0000\u0207\u0208\u0005\u0003"+
		"\u0000\u0000\u0208\u0209\u0003@ \u0000\u0209\u020a\u0005\u0004\u0000\u0000"+
		"\u020a\u020c\u0001\u0000\u0000\u0000\u020b\u0205\u0001\u0000\u0000\u0000"+
		"\u020b\u0206\u0001\u0000\u0000\u0000\u020b\u0207\u0001\u0000\u0000\u0000"+
		"\u020c\u021c\u0001\u0000\u0000\u0000\u020d\u020e\u0005-\u0000\u0000\u020e"+
		"\u021c\u0003\u00be_\u0000\u020f\u021c\u0003&\u0013\u0000\u0210\u0211\u0005"+
		"\u00a9\u0000\u0000\u0211\u0213\u0005\u00aa\u0000\u0000\u0212\u0210\u0001"+
		"\u0000\u0000\u0000\u0212\u0213\u0001\u0000\u0000\u0000\u0213\u0214\u0001"+
		"\u0000\u0000\u0000\u0214\u0215\u0005!\u0000\u0000\u0215\u0216\u0005\u0003"+
		"\u0000\u0000\u0216\u0217\u0003@ \u0000\u0217\u0219\u0005\u0004\u0000\u0000"+
		"\u0218\u021a\u0007\u0003\u0000\u0000\u0219\u0218\u0001\u0000\u0000\u0000"+
		"\u0219\u021a\u0001\u0000\u0000\u0000\u021a\u021c\u0001\u0000\u0000\u0000"+
		"\u021b\u01ea\u0001\u0000\u0000\u0000\u021b\u01fa\u0001\u0000\u0000\u0000"+
		"\u021b\u01ff\u0001\u0000\u0000\u0000\u021b\u0204\u0001\u0000\u0000\u0000"+
		"\u021b\u020d\u0001\u0000\u0000\u0000\u021b\u020f\u0001\u0000\u0000\u0000"+
		"\u021b\u0212\u0001\u0000\u0000\u0000\u021c!\u0001\u0000\u0000\u0000\u021d"+
		"\u021f\u0007\u0004\u0000\u0000\u021e\u021d\u0001\u0000\u0000\u0000\u021e"+
		"\u021f\u0001\u0000\u0000\u0000\u021f\u0220\u0001\u0000\u0000\u0000\u0220"+
		"\u0221\u0005\u00ba\u0000\u0000\u0221#\u0001\u0000\u0000\u0000\u0222\u0223"+
		"\u00051\u0000\u0000\u0223\u0225\u0003\u00b2Y\u0000\u0224\u0222\u0001\u0000"+
		"\u0000\u0000\u0224\u0225\u0001\u0000\u0000\u0000\u0225\u024b\u0001\u0000"+
		"\u0000\u0000\u0226\u0227\u0005q\u0000\u0000\u0227\u022a\u0005_\u0000\u0000"+
		"\u0228\u022a\u0005\u008c\u0000\u0000\u0229\u0226\u0001\u0000\u0000\u0000"+
		"\u0229\u0228\u0001\u0000\u0000\u0000\u022a\u022b\u0001\u0000\u0000\u0000"+
		"\u022b\u022c\u0005\u0003\u0000\u0000\u022c\u0231\u0003\u0018\f\u0000\u022d"+
		"\u022e\u0005\u0005\u0000\u0000\u022e\u0230\u0003\u0018\f\u0000\u022f\u022d"+
		"\u0001\u0000\u0000\u0000\u0230\u0233\u0001\u0000\u0000\u0000\u0231\u022f"+
		"\u0001\u0000\u0000\u0000\u0231\u0232\u0001\u0000\u0000\u0000\u0232\u0234"+
		"\u0001\u0000\u0000\u0000\u0233\u0231\u0001\u0000\u0000\u0000\u0234\u0236"+
		"\u0005\u0004\u0000\u0000\u0235\u0237\u0003(\u0014\u0000\u0236\u0235\u0001"+
		"\u0000\u0000\u0000\u0236\u0237\u0001\u0000\u0000\u0000\u0237\u024c\u0001"+
		"\u0000\u0000\u0000\u0238\u0239\u0005,\u0000\u0000\u0239\u023a\u0005\u0003"+
		"\u0000\u0000\u023a\u023b\u0003@ \u0000\u023b\u023c\u0005\u0004\u0000\u0000"+
		"\u023c\u024c\u0001\u0000\u0000\u0000\u023d\u023e\u0005J\u0000\u0000\u023e"+
		"\u023f\u0005_\u0000\u0000\u023f\u0240\u0005\u0003\u0000\u0000\u0240\u0245"+
		"\u0003\u00bc^\u0000\u0241\u0242\u0005\u0005\u0000\u0000\u0242\u0244\u0003"+
		"\u00bc^\u0000\u0243\u0241\u0001\u0000\u0000\u0000\u0244\u0247\u0001\u0000"+
		"\u0000\u0000\u0245\u0243\u0001\u0000\u0000\u0000\u0245\u0246\u0001\u0000"+
		"\u0000\u0000\u0246\u0248\u0001\u0000\u0000\u0000\u0247\u0245\u0001\u0000"+
		"\u0000\u0000\u0248\u0249\u0005\u0004\u0000\u0000\u0249\u024a\u0003&\u0013"+
		"\u0000\u024a\u024c\u0001\u0000\u0000\u0000\u024b\u0229\u0001\u0000\u0000"+
		"\u0000\u024b\u0238\u0001\u0000\u0000\u0000\u024b\u023d\u0001\u0000\u0000"+
		"\u0000\u024c%\u0001\u0000\u0000\u0000\u024d\u024e\u0005u\u0000\u0000\u024e"+
		"\u025a\u0003\u00c0`\u0000\u024f\u0250\u0005\u0003\u0000\u0000\u0250\u0255"+
		"\u0003\u00bc^\u0000\u0251\u0252\u0005\u0005\u0000\u0000\u0252\u0254\u0003"+
		"\u00bc^\u0000\u0253\u0251\u0001\u0000\u0000\u0000\u0254\u0257\u0001\u0000"+
		"\u0000\u0000\u0255\u0253\u0001\u0000\u0000\u0000\u0255\u0256\u0001\u0000"+
		"\u0000\u0000\u0256\u0258\u0001\u0000\u0000\u0000\u0257\u0255\u0001\u0000"+
		"\u0000\u0000\u0258\u0259\u0005\u0004\u0000\u0000\u0259\u025b\u0001\u0000"+
		"\u0000\u0000\u025a\u024f\u0001\u0000\u0000\u0000\u025a\u025b\u0001\u0000"+
		"\u0000\u0000\u025b\u026a\u0001\u0000\u0000\u0000\u025c\u025d\u0005k\u0000"+
		"\u0000\u025d\u0264\u0007\u0005\u0000\u0000\u025e\u025f\u0005\u0083\u0000"+
		"\u0000\u025f\u0265\u0007\u0006\u0000\u0000\u0260\u0265\u0005)\u0000\u0000"+
		"\u0261\u0265\u0005{\u0000\u0000\u0262\u0263\u0005e\u0000\u0000\u0263\u0265"+
		"\u0005\u001a\u0000\u0000\u0264\u025e\u0001\u0000\u0000\u0000\u0264\u0260"+
		"\u0001\u0000\u0000\u0000\u0264\u0261\u0001\u0000\u0000\u0000\u0264\u0262"+
		"\u0001\u0000\u0000\u0000\u0265\u0269\u0001\u0000\u0000\u0000\u0266\u0267"+
		"\u0005c\u0000\u0000\u0267\u0269\u0003\u00b2Y\u0000\u0268\u025c\u0001\u0000"+
		"\u0000\u0000\u0268\u0266\u0001\u0000\u0000\u0000\u0269\u026c\u0001\u0000"+
		"\u0000\u0000\u026a\u0268\u0001\u0000\u0000\u0000\u026a\u026b\u0001\u0000"+
		"\u0000\u0000\u026b\u0275\u0001\u0000\u0000\u0000\u026c\u026a\u0001\u0000"+
		"\u0000\u0000\u026d\u026f\u0005f\u0000\u0000\u026e\u026d\u0001\u0000\u0000"+
		"\u0000\u026e\u026f\u0001\u0000\u0000\u0000\u026f\u0270\u0001\u0000\u0000"+
		"\u0000\u0270\u0273\u00059\u0000\u0000\u0271\u0272\u0005V\u0000\u0000\u0272"+
		"\u0274\u0007\u0007\u0000\u0000\u0273\u0271\u0001\u0000\u0000\u0000\u0273"+
		"\u0274\u0001\u0000\u0000\u0000\u0274\u0276\u0001\u0000\u0000\u0000\u0275"+
		"\u026e\u0001\u0000\u0000\u0000\u0275\u0276\u0001\u0000\u0000\u0000\u0276"+
		"\'\u0001\u0000\u0000\u0000\u0277\u0278\u0005k\u0000\u0000\u0278\u0279"+
		"\u00050\u0000\u0000\u0279\u027a\u0007\b\u0000\u0000\u027a)\u0001\u0000"+
		"\u0000\u0000\u027b\u027d\u00052\u0000\u0000\u027c\u027e\u0007\u0002\u0000"+
		"\u0000\u027d\u027c\u0001\u0000\u0000\u0000\u027d\u027e\u0001\u0000\u0000"+
		"\u0000\u027e\u027f\u0001\u0000\u0000\u0000\u027f\u0283\u0005\u008a\u0000"+
		"\u0000\u0280\u0281\u0005P\u0000\u0000\u0281\u0282\u0005f\u0000\u0000\u0282"+
		"\u0284\u0005F\u0000\u0000\u0283\u0280\u0001\u0000\u0000\u0000\u0283\u0284"+
		"\u0001\u0000\u0000\u0000\u0284\u0288\u0001\u0000\u0000\u0000\u0285\u0286"+
		"\u0003\u00b6[\u0000\u0286\u0287\u0005\u0002\u0000\u0000\u0287\u0289\u0001"+
		"\u0000\u0000\u0000\u0288\u0285\u0001\u0000\u0000\u0000\u0288\u0289\u0001"+
		"\u0000\u0000\u0000\u0289\u028a\u0001\u0000\u0000\u0000\u028a\u028f\u0003"+
		"\u00c4b\u0000\u028b\u0290\u0005%\u0000\u0000\u028c\u0290\u0005\u001c\u0000"+
		"\u0000\u028d\u028e\u0005Y\u0000\u0000\u028e\u0290\u0005i\u0000\u0000\u028f"+
		"\u028b\u0001\u0000\u0000\u0000\u028f\u028c\u0001\u0000\u0000\u0000\u028f"+
		"\u028d\u0001\u0000\u0000\u0000\u028f\u0290\u0001\u0000\u0000\u0000\u0290"+
		"\u029f\u0001\u0000\u0000\u0000\u0291\u02a0\u0005;\u0000\u0000\u0292\u02a0"+
		"\u0005X\u0000\u0000\u0293\u029d\u0005\u008d\u0000\u0000\u0294\u0295\u0005"+
		"i\u0000\u0000\u0295\u029a\u0003\u00bc^\u0000\u0296\u0297\u0005\u0005\u0000"+
		"\u0000\u0297\u0299\u0003\u00bc^\u0000\u0298\u0296\u0001\u0000\u0000\u0000"+
		"\u0299\u029c\u0001\u0000\u0000\u0000\u029a\u0298\u0001\u0000\u0000\u0000"+
		"\u029a\u029b\u0001\u0000\u0000\u0000\u029b\u029e\u0001\u0000\u0000\u0000"+
		"\u029c\u029a\u0001\u0000\u0000\u0000\u029d\u0294\u0001\u0000\u0000\u0000"+
		"\u029d\u029e\u0001\u0000\u0000\u0000\u029e\u02a0\u0001\u0000\u0000\u0000"+
		"\u029f\u0291\u0001\u0000\u0000\u0000\u029f\u0292\u0001\u0000\u0000\u0000"+
		"\u029f\u0293\u0001\u0000\u0000\u0000\u02a0\u02a1\u0001\u0000\u0000\u0000"+
		"\u02a1\u02a2\u0005k\u0000\u0000\u02a2\u02a6\u0003\u00b8\\\u0000\u02a3"+
		"\u02a4\u0005I\u0000\u0000\u02a4\u02a5\u0005@\u0000\u0000\u02a5\u02a7\u0005"+
		"\u007f\u0000\u0000\u02a6\u02a3\u0001\u0000\u0000\u0000\u02a6\u02a7\u0001"+
		"\u0000\u0000\u0000\u02a7\u02aa\u0001\u0000\u0000\u0000\u02a8\u02a9\u0005"+
		"\u0093\u0000\u0000\u02a9\u02ab\u0003@ \u0000\u02aa\u02a8\u0001\u0000\u0000"+
		"\u0000\u02aa\u02ab\u0001\u0000\u0000\u0000\u02ab\u02ac\u0001\u0000\u0000"+
		"\u0000\u02ac\u02b5\u0005&\u0000\u0000\u02ad\u02b2\u0003l6\u0000\u02ae"+
		"\u02b2\u0003J%\u0000\u02af\u02b2\u00038\u001c\u0000\u02b0\u02b2\u0003"+
		"V+\u0000\u02b1\u02ad\u0001\u0000\u0000\u0000\u02b1\u02ae\u0001\u0000\u0000"+
		"\u0000\u02b1\u02af\u0001\u0000\u0000\u0000\u02b1\u02b0\u0001\u0000\u0000"+
		"\u0000\u02b2\u02b3\u0001\u0000\u0000\u0000\u02b3\u02b4\u0005\u0001\u0000"+
		"\u0000\u02b4\u02b6\u0001\u0000\u0000\u0000\u02b5\u02b1\u0001\u0000\u0000"+
		"\u0000\u02b6\u02b7\u0001\u0000\u0000\u0000\u02b7\u02b5\u0001\u0000\u0000"+
		"\u0000\u02b7\u02b8\u0001\u0000\u0000\u0000\u02b8\u02b9\u0001\u0000\u0000"+
		"\u0000\u02b9\u02ba\u0005B\u0000\u0000\u02ba+\u0001\u0000\u0000\u0000\u02bb"+
		"\u02bd\u00052\u0000\u0000\u02bc\u02be\u0007\u0002\u0000\u0000\u02bd\u02bc"+
		"\u0001\u0000\u0000\u0000\u02bd\u02be\u0001\u0000\u0000\u0000\u02be\u02bf"+
		"\u0001\u0000\u0000\u0000\u02bf\u02c3\u0005\u0091\u0000\u0000\u02c0\u02c1"+
		"\u0005P\u0000\u0000\u02c1\u02c2\u0005f\u0000\u0000\u02c2\u02c4\u0005F"+
		"\u0000\u0000\u02c3\u02c0\u0001\u0000\u0000\u0000\u02c3\u02c4\u0001\u0000"+
		"\u0000\u0000\u02c4\u02c8\u0001\u0000\u0000\u0000\u02c5\u02c6\u0003\u00b6"+
		"[\u0000\u02c6\u02c7\u0005\u0002\u0000\u0000\u02c7\u02c9\u0001\u0000\u0000"+
		"\u0000\u02c8\u02c5\u0001\u0000\u0000\u0000\u02c8\u02c9\u0001\u0000\u0000"+
		"\u0000\u02c9\u02ca\u0001\u0000\u0000\u0000\u02ca\u02d6\u0003\u00c6c\u0000"+
		"\u02cb\u02cc\u0005\u0003\u0000\u0000\u02cc\u02d1\u0003\u00bc^\u0000\u02cd"+
		"\u02ce\u0005\u0005\u0000\u0000\u02ce\u02d0\u0003\u00bc^\u0000\u02cf\u02cd"+
		"\u0001\u0000\u0000\u0000\u02d0\u02d3\u0001\u0000\u0000\u0000\u02d1\u02cf"+
		"\u0001\u0000\u0000\u0000\u02d1\u02d2\u0001\u0000\u0000\u0000\u02d2\u02d4"+
		"\u0001\u0000\u0000\u0000\u02d3\u02d1\u0001\u0000\u0000\u0000\u02d4\u02d5"+
		"\u0005\u0004\u0000\u0000\u02d5\u02d7\u0001\u0000\u0000\u0000\u02d6\u02cb"+
		"\u0001\u0000\u0000\u0000\u02d6\u02d7\u0001\u0000\u0000\u0000\u02d7\u02d8"+
		"\u0001\u0000\u0000\u0000\u02d8\u02d9\u0005!\u0000\u0000\u02d9\u02da\u0003"+
		"V+\u0000\u02da-\u0001\u0000\u0000\u0000\u02db\u02dc\u00052\u0000\u0000"+
		"\u02dc\u02dd\u0005\u0092\u0000\u0000\u02dd\u02e1\u0005\u0084\u0000\u0000"+
		"\u02de\u02df\u0005P\u0000\u0000\u02df\u02e0\u0005f\u0000\u0000\u02e0\u02e2"+
		"\u0005F\u0000\u0000\u02e1\u02de\u0001\u0000\u0000\u0000\u02e1\u02e2\u0001"+
		"\u0000\u0000\u0000\u02e2\u02e6\u0001\u0000\u0000\u0000\u02e3\u02e4\u0003"+
		"\u00b6[\u0000\u02e4\u02e5\u0005\u0002\u0000\u0000\u02e5\u02e7\u0001\u0000"+
		"\u0000\u0000\u02e6\u02e3\u0001\u0000\u0000\u0000\u02e6\u02e7\u0001\u0000"+
		"\u0000\u0000\u02e7\u02e8\u0001\u0000\u0000\u0000\u02e8\u02e9\u0003\u00b8"+
		"\\\u0000\u02e9\u02ea\u0005\u008e\u0000\u0000\u02ea\u02f6\u0003\u00c8d"+
		"\u0000\u02eb\u02ec\u0005\u0003\u0000\u0000\u02ec\u02f1\u0003\u00acV\u0000"+
		"\u02ed\u02ee\u0005\u0005\u0000\u0000\u02ee\u02f0\u0003\u00acV\u0000\u02ef"+
		"\u02ed\u0001\u0000\u0000\u0000\u02f0\u02f3\u0001\u0000\u0000\u0000\u02f1"+
		"\u02ef\u0001\u0000\u0000\u0000\u02f1\u02f2\u0001\u0000\u0000\u0000\u02f2"+
		"\u02f4\u0001\u0000\u0000\u0000\u02f3\u02f1\u0001\u0000\u0000\u0000\u02f4"+
		"\u02f5\u0005\u0004\u0000\u0000\u02f5\u02f7\u0001\u0000\u0000\u0000\u02f6"+
		"\u02eb\u0001\u0000\u0000\u0000\u02f6\u02f7\u0001\u0000\u0000\u0000\u02f7"+
		"/\u0001\u0000\u0000\u0000\u02f8\u02fa\u0005\u0095\u0000\u0000\u02f9\u02fb"+
		"\u0005t\u0000\u0000\u02fa\u02f9\u0001\u0000\u0000\u0000\u02fa\u02fb\u0001"+
		"\u0000\u0000\u0000\u02fb\u02fc\u0001\u0000\u0000\u0000\u02fc\u02fd\u0003"+
		"2\u0019\u0000\u02fd\u02fe\u0005!\u0000\u0000\u02fe\u02ff\u0005\u0003\u0000"+
		"\u0000\u02ff\u0300\u0003V+\u0000\u0300\u030a\u0005\u0004\u0000\u0000\u0301"+
		"\u0302\u0005\u0005\u0000\u0000\u0302\u0303\u00032\u0019\u0000\u0303\u0304"+
		"\u0005!\u0000\u0000\u0304\u0305\u0005\u0003\u0000\u0000\u0305\u0306\u0003"+
		"V+\u0000\u0306\u0307\u0005\u0004\u0000\u0000\u0307\u0309\u0001\u0000\u0000"+
		"\u0000\u0308\u0301\u0001\u0000\u0000\u0000\u0309\u030c\u0001\u0000\u0000"+
		"\u0000\u030a\u0308\u0001\u0000\u0000\u0000\u030a\u030b\u0001\u0000\u0000"+
		"\u0000\u030b1\u0001\u0000\u0000\u0000\u030c\u030a\u0001\u0000\u0000\u0000"+
		"\u030d\u0319\u0003\u00b8\\\u0000\u030e\u030f\u0005\u0003\u0000\u0000\u030f"+
		"\u0314\u0003\u00bc^\u0000\u0310\u0311\u0005\u0005\u0000\u0000\u0311\u0313"+
		"\u0003\u00bc^\u0000\u0312\u0310\u0001\u0000\u0000\u0000\u0313\u0316\u0001"+
		"\u0000\u0000\u0000\u0314\u0312\u0001\u0000\u0000\u0000\u0314\u0315\u0001"+
		"\u0000\u0000\u0000\u0315\u0317\u0001\u0000\u0000\u0000\u0316\u0314\u0001"+
		"\u0000\u0000\u0000\u0317\u0318\u0005\u0004\u0000\u0000\u0318\u031a\u0001"+
		"\u0000\u0000\u0000\u0319\u030e\u0001\u0000\u0000\u0000\u0319\u031a\u0001"+
		"\u0000\u0000\u0000\u031a3\u0001\u0000\u0000\u0000\u031b\u031c\u00032\u0019"+
		"\u0000\u031c\u031d\u0005!\u0000\u0000\u031d\u031e\u0005\u0003\u0000\u0000"+
		"\u031e\u031f\u0003\u00a4R\u0000\u031f\u0321\u0005\u008b\u0000\u0000\u0320"+
		"\u0322\u0005\u001d\u0000\u0000\u0321\u0320\u0001\u0000\u0000\u0000\u0321"+
		"\u0322\u0001\u0000\u0000\u0000\u0322\u0323\u0001\u0000\u0000\u0000\u0323"+
		"\u0324\u0003\u00a6S\u0000\u0324\u0325\u0005\u0004\u0000\u0000\u03255\u0001"+
		"\u0000\u0000\u0000\u0326\u0332\u0003\u00b8\\\u0000\u0327\u0328\u0005\u0003"+
		"\u0000\u0000\u0328\u032d\u0003\u00bc^\u0000\u0329\u032a\u0005\u0005\u0000"+
		"\u0000\u032a\u032c\u0003\u00bc^\u0000\u032b\u0329\u0001\u0000\u0000\u0000"+
		"\u032c\u032f\u0001\u0000\u0000\u0000\u032d\u032b\u0001\u0000\u0000\u0000"+
		"\u032d\u032e\u0001\u0000\u0000\u0000\u032e\u0330\u0001\u0000\u0000\u0000"+
		"\u032f\u032d\u0001\u0000\u0000\u0000\u0330\u0331\u0005\u0004\u0000\u0000"+
		"\u0331\u0333\u0001\u0000\u0000\u0000\u0332\u0327\u0001\u0000\u0000\u0000"+
		"\u0332\u0333\u0001\u0000\u0000\u0000\u0333\u0334\u0001\u0000\u0000\u0000"+
		"\u0334\u0335\u0005!\u0000\u0000\u0335\u0336\u0005\u0003\u0000\u0000\u0336"+
		"\u0337\u0003V+\u0000\u0337\u0338\u0005\u0004\u0000\u0000\u03387\u0001"+
		"\u0000\u0000\u0000\u0339\u033b\u00030\u0018\u0000\u033a\u0339\u0001\u0000"+
		"\u0000\u0000\u033a\u033b\u0001\u0000\u0000\u0000\u033b\u033c\u0001\u0000"+
		"\u0000\u0000\u033c\u033d\u0005;\u0000\u0000\u033d\u033e\u0005K\u0000\u0000"+
		"\u033e\u0341\u0003r9\u0000\u033f\u0340\u0005\u0094\u0000\u0000\u0340\u0342"+
		"\u0003@ \u0000\u0341\u033f\u0001\u0000\u0000\u0000\u0341\u0342\u0001\u0000"+
		"\u0000\u0000\u0342\u0344\u0001\u0000\u0000\u0000\u0343\u0345\u0003L&\u0000"+
		"\u0344\u0343\u0001\u0000\u0000\u0000\u0344\u0345\u0001\u0000\u0000\u0000"+
		"\u03459\u0001\u0000\u0000\u0000\u0346\u0348\u00030\u0018\u0000\u0347\u0346"+
		"\u0001\u0000\u0000\u0000\u0347\u0348\u0001\u0000\u0000\u0000\u0348\u0349"+
		"\u0001\u0000\u0000\u0000\u0349\u034a\u0005;\u0000\u0000\u034a\u034b\u0005"+
		"K\u0000\u0000\u034b\u034e\u0003r9\u0000\u034c\u034d\u0005\u0094\u0000"+
		"\u0000\u034d\u034f\u0003@ \u0000\u034e\u034c\u0001\u0000\u0000\u0000\u034e"+
		"\u034f\u0001\u0000\u0000\u0000\u034f\u0351\u0001\u0000\u0000\u0000\u0350"+
		"\u0352\u0003L&\u0000\u0351\u0350\u0001\u0000\u0000\u0000\u0351\u0352\u0001"+
		"\u0000\u0000\u0000\u0352\u0357\u0001\u0000\u0000\u0000\u0353\u0355\u0003"+
		"\u0088D\u0000\u0354\u0353\u0001\u0000\u0000\u0000\u0354\u0355\u0001\u0000"+
		"\u0000\u0000\u0355\u0356\u0001\u0000\u0000\u0000\u0356\u0358\u0003\u008a"+
		"E\u0000\u0357\u0354\u0001\u0000\u0000\u0000\u0357\u0358\u0001\u0000\u0000"+
		"\u0000\u0358;\u0001\u0000\u0000\u0000\u0359\u035b\u0005=\u0000\u0000\u035a"+
		"\u035c\u00057\u0000\u0000\u035b\u035a\u0001\u0000\u0000\u0000\u035b\u035c"+
		"\u0001\u0000\u0000\u0000\u035c\u035d\u0001\u0000\u0000\u0000\u035d\u035e"+
		"\u0003\u00b6[\u0000\u035e=\u0001\u0000\u0000\u0000\u035f\u0360\u0005?"+
		"\u0000\u0000\u0360\u0363\u0007\t\u0000\u0000\u0361\u0362\u0005P\u0000"+
		"\u0000\u0362\u0364\u0005F\u0000\u0000\u0363\u0361\u0001\u0000\u0000\u0000"+
		"\u0363\u0364\u0001\u0000\u0000\u0000\u0364\u0368\u0001\u0000\u0000\u0000"+
		"\u0365\u0366\u0003\u00b6[\u0000\u0366\u0367\u0005\u0002\u0000\u0000\u0367"+
		"\u0369\u0001\u0000\u0000\u0000\u0368\u0365\u0001\u0000\u0000\u0000\u0368"+
		"\u0369\u0001\u0000\u0000\u0000\u0369\u036a\u0001\u0000\u0000\u0000\u036a"+
		"\u036b\u0003\u00e0p\u0000\u036b?\u0001\u0000\u0000\u0000\u036c\u036d\u0006"+
		" \uffff\uffff\u0000\u036d\u03c5\u0003D\"\u0000\u036e\u03c5\u0005\u00bb"+
		"\u0000\u0000\u036f\u0370\u0003\u00b6[\u0000\u0370\u0371\u0005\u0002\u0000"+
		"\u0000\u0371\u0373\u0001\u0000\u0000\u0000\u0372\u036f\u0001\u0000\u0000"+
		"\u0000\u0372\u0373\u0001\u0000\u0000\u0000\u0373\u0374\u0001\u0000\u0000"+
		"\u0000\u0374\u0375\u0003\u00b8\\\u0000\u0375\u0376\u0005\u0002\u0000\u0000"+
		"\u0376\u0378\u0001\u0000\u0000\u0000\u0377\u0372\u0001\u0000\u0000\u0000"+
		"\u0377\u0378\u0001\u0000\u0000\u0000\u0378\u0379\u0001\u0000\u0000\u0000"+
		"\u0379\u03c5\u0003\u00bc^\u0000\u037a\u037b\u0003\u00a8T\u0000\u037b\u037c"+
		"\u0003@ \u0015\u037c\u03c5\u0001\u0000\u0000\u0000\u037d\u037e\u0003\u00b4"+
		"Z\u0000\u037e\u038b\u0005\u0003\u0000\u0000\u037f\u0381\u0005>\u0000\u0000"+
		"\u0380\u037f\u0001\u0000\u0000\u0000\u0380\u0381\u0001\u0000\u0000\u0000"+
		"\u0381\u0382\u0001\u0000\u0000\u0000\u0382\u0387\u0003@ \u0000\u0383\u0384"+
		"\u0005\u0005\u0000\u0000\u0384\u0386\u0003@ \u0000\u0385\u0383\u0001\u0000"+
		"\u0000\u0000\u0386\u0389\u0001\u0000\u0000\u0000\u0387\u0385\u0001\u0000"+
		"\u0000\u0000\u0387\u0388\u0001\u0000\u0000\u0000\u0388\u038c\u0001\u0000"+
		"\u0000\u0000\u0389\u0387\u0001\u0000\u0000\u0000\u038a\u038c\u0005\u0007"+
		"\u0000\u0000\u038b\u0380\u0001\u0000\u0000\u0000\u038b\u038a\u0001\u0000"+
		"\u0000\u0000\u038b\u038c\u0001\u0000\u0000\u0000\u038c\u038d\u0001\u0000"+
		"\u0000\u0000\u038d\u038f\u0005\u0004\u0000\u0000\u038e\u0390\u0003v;\u0000"+
		"\u038f\u038e\u0001\u0000\u0000\u0000\u038f\u0390\u0001\u0000\u0000\u0000"+
		"\u0390\u0392\u0001\u0000\u0000\u0000\u0391\u0393\u0003z=\u0000\u0392\u0391"+
		"\u0001\u0000\u0000\u0000\u0392\u0393\u0001\u0000\u0000\u0000\u0393\u03c5"+
		"\u0001\u0000\u0000\u0000\u0394\u0395\u0005\u0003\u0000\u0000\u0395\u039a"+
		"\u0003@ \u0000\u0396\u0397\u0005\u0005\u0000\u0000\u0397\u0399\u0003@"+
		" \u0000\u0398\u0396\u0001\u0000\u0000\u0000\u0399\u039c\u0001\u0000\u0000"+
		"\u0000\u039a\u0398\u0001\u0000\u0000\u0000\u039a\u039b\u0001\u0000\u0000"+
		"\u0000\u039b\u039d\u0001\u0000\u0000\u0000\u039c\u039a\u0001\u0000\u0000"+
		"\u0000\u039d\u039e\u0005\u0004\u0000\u0000\u039e\u03c5\u0001\u0000\u0000"+
		"\u0000\u039f\u03a0\u0005+\u0000\u0000\u03a0\u03a1\u0005\u0003\u0000\u0000"+
		"\u03a1\u03a2\u0003@ \u0000\u03a2\u03a3\u0005!\u0000\u0000\u03a3\u03a4"+
		"\u0003\u001e\u000f\u0000\u03a4\u03a5\u0005\u0004\u0000\u0000\u03a5\u03c5"+
		"\u0001\u0000\u0000\u0000\u03a6\u03a8\u0005f\u0000\u0000\u03a7\u03a6\u0001"+
		"\u0000\u0000\u0000\u03a7\u03a8\u0001\u0000\u0000\u0000\u03a8\u03a9\u0001"+
		"\u0000\u0000\u0000\u03a9\u03ab\u0005F\u0000\u0000\u03aa\u03a7\u0001\u0000"+
		"\u0000\u0000\u03aa\u03ab\u0001\u0000\u0000\u0000\u03ab\u03ac\u0001\u0000"+
		"\u0000\u0000\u03ac\u03ad\u0005\u0003\u0000\u0000\u03ad\u03ae\u0003V+\u0000"+
		"\u03ae\u03af\u0005\u0004\u0000\u0000\u03af\u03c5\u0001\u0000\u0000\u0000"+
		"\u03b0\u03b2\u0005*\u0000\u0000\u03b1\u03b3\u0003@ \u0000\u03b2\u03b1"+
		"\u0001\u0000\u0000\u0000\u03b2\u03b3\u0001\u0000\u0000\u0000\u03b3\u03b9"+
		"\u0001\u0000\u0000\u0000\u03b4\u03b5\u0005\u0093\u0000\u0000\u03b5\u03b6"+
		"\u0003@ \u0000\u03b6\u03b7\u0005\u0087\u0000\u0000\u03b7\u03b8\u0003@"+
		" \u0000\u03b8\u03ba\u0001\u0000\u0000\u0000\u03b9\u03b4\u0001\u0000\u0000"+
		"\u0000\u03ba\u03bb\u0001\u0000\u0000\u0000\u03bb\u03b9\u0001\u0000\u0000"+
		"\u0000\u03bb\u03bc\u0001\u0000\u0000\u0000\u03bc\u03bf\u0001\u0000\u0000"+
		"\u0000\u03bd\u03be\u0005A\u0000\u0000\u03be\u03c0\u0003@ \u0000\u03bf"+
		"\u03bd\u0001\u0000\u0000\u0000\u03bf\u03c0\u0001\u0000\u0000\u0000\u03c0"+
		"\u03c1\u0001\u0000\u0000\u0000\u03c1\u03c2\u0005B\u0000\u0000\u03c2\u03c5"+
		"\u0001\u0000\u0000\u0000\u03c3\u03c5\u0003B!\u0000\u03c4\u036c\u0001\u0000"+
		"\u0000\u0000\u03c4\u036e\u0001\u0000\u0000\u0000\u03c4\u0377\u0001\u0000"+
		"\u0000\u0000\u03c4\u037a\u0001\u0000\u0000\u0000\u03c4\u037d\u0001\u0000"+
		"\u0000\u0000\u03c4\u0394\u0001\u0000\u0000\u0000\u03c4\u039f\u0001\u0000"+
		"\u0000\u0000\u03c4\u03aa\u0001\u0000\u0000\u0000\u03c4\u03b0\u0001\u0000"+
		"\u0000\u0000\u03c4\u03c3\u0001\u0000\u0000\u0000\u03c5\u0443\u0001\u0000"+
		"\u0000\u0000\u03c6\u03c7\n\u0014\u0000\u0000\u03c7\u03c8\u0005\u000b\u0000"+
		"\u0000\u03c8\u0442\u0003@ \u0015\u03c9\u03ca\n\u0013\u0000\u0000\u03ca"+
		"\u03cb\u0007\n\u0000\u0000\u03cb\u0442\u0003@ \u0014\u03cc\u03cd\n\u0012"+
		"\u0000\u0000\u03cd\u03ce\u0007\u0004\u0000\u0000\u03ce\u0442\u0003@ \u0013"+
		"\u03cf\u03d0\n\u0011\u0000\u0000\u03d0\u03d1\u0007\u000b\u0000\u0000\u03d1"+
		"\u0442\u0003@ \u0012\u03d2\u03d3\n\u0010\u0000\u0000\u03d3\u03d4\u0007"+
		"\f\u0000\u0000\u03d4\u0442\u0003@ \u0011\u03d5\u03e8\n\u000f\u0000\u0000"+
		"\u03d6\u03e9\u0005\u0006\u0000\u0000\u03d7\u03e9\u0005\u0016\u0000\u0000"+
		"\u03d8\u03e9\u0005\u0017\u0000\u0000\u03d9\u03e9\u0005\u0018\u0000\u0000"+
		"\u03da\u03e9\u0005\\\u0000\u0000\u03db\u03dc\u0005\\\u0000\u0000\u03dc"+
		"\u03e9\u0005f\u0000\u0000\u03dd\u03df\u0005\\\u0000\u0000\u03de\u03e0"+
		"\u0005f\u0000\u0000\u03df\u03de\u0001\u0000\u0000\u0000\u03df\u03e0\u0001"+
		"\u0000\u0000\u0000\u03e0\u03e1\u0001\u0000\u0000\u0000\u03e1\u03e2\u0005"+
		">\u0000\u0000\u03e2\u03e9\u0005K\u0000\u0000\u03e3\u03e9\u0005S\u0000"+
		"\u0000\u03e4\u03e9\u0005a\u0000\u0000\u03e5\u03e9\u0005M\u0000\u0000\u03e6"+
		"\u03e9\u0005c\u0000\u0000\u03e7\u03e9\u0005v\u0000\u0000\u03e8\u03d6\u0001"+
		"\u0000\u0000\u0000\u03e8\u03d7\u0001\u0000\u0000\u0000\u03e8\u03d8\u0001"+
		"\u0000\u0000\u0000\u03e8\u03d9\u0001\u0000\u0000\u0000\u03e8\u03da\u0001"+
		"\u0000\u0000\u0000\u03e8\u03db\u0001\u0000\u0000\u0000\u03e8\u03dd\u0001"+
		"\u0000\u0000\u0000\u03e8\u03e3\u0001\u0000\u0000\u0000\u03e8\u03e4\u0001"+
		"\u0000\u0000\u0000\u03e8\u03e5\u0001\u0000\u0000\u0000\u03e8\u03e6\u0001"+
		"\u0000\u0000\u0000\u03e8\u03e7\u0001\u0000\u0000\u0000\u03e9\u03ea\u0001"+
		"\u0000\u0000\u0000\u03ea\u0442\u0003@ \u0010\u03eb\u03ec\n\u000e\u0000"+
		"\u0000\u03ec\u03ed\u0005 \u0000\u0000\u03ed\u0442\u0003@ \u000f\u03ee"+
		"\u03ef\n\r\u0000\u0000\u03ef\u03f0\u0005l\u0000\u0000\u03f0\u0442\u0003"+
		"@ \u000e\u03f1\u03f2\n\u0006\u0000\u0000\u03f2\u03f4\u0005\\\u0000\u0000"+
		"\u03f3\u03f5\u0005f\u0000\u0000\u03f4\u03f3\u0001\u0000\u0000\u0000\u03f4"+
		"\u03f5\u0001\u0000\u0000\u0000\u03f5\u03f6\u0001\u0000\u0000\u0000\u03f6"+
		"\u0442\u0003@ \u0007\u03f7\u03f9\n\u0005\u0000\u0000\u03f8\u03fa\u0005"+
		"f\u0000\u0000\u03f9\u03f8\u0001\u0000\u0000\u0000\u03f9\u03fa\u0001\u0000"+
		"\u0000\u0000\u03fa\u03fb\u0001\u0000\u0000\u0000\u03fb\u03fc\u0005\'\u0000"+
		"\u0000\u03fc\u03fd\u0003@ \u0000\u03fd\u03fe\u0005 \u0000\u0000\u03fe"+
		"\u03ff\u0003@ \u0006\u03ff\u0442\u0001\u0000\u0000\u0000\u0400\u0401\n"+
		"\t\u0000\u0000\u0401\u0402\u0005-\u0000\u0000\u0402\u0442\u0003\u00be"+
		"_\u0000\u0403\u0405\n\b\u0000\u0000\u0404\u0406\u0005f\u0000\u0000\u0405"+
		"\u0404\u0001\u0000\u0000\u0000\u0405\u0406\u0001\u0000\u0000\u0000\u0406"+
		"\u0407\u0001\u0000\u0000\u0000\u0407\u0408\u0007\r\u0000\u0000\u0408\u040b"+
		"\u0003@ \u0000\u0409\u040a\u0005C\u0000\u0000\u040a\u040c\u0003@ \u0000"+
		"\u040b\u0409\u0001\u0000\u0000\u0000\u040b\u040c\u0001\u0000\u0000\u0000"+
		"\u040c\u0442\u0001\u0000\u0000\u0000\u040d\u0412\n\u0007\u0000\u0000\u040e"+
		"\u0413\u0005]\u0000\u0000\u040f\u0413\u0005g\u0000\u0000\u0410\u0411\u0005"+
		"f\u0000\u0000\u0411\u0413\u0005h\u0000\u0000\u0412\u040e\u0001\u0000\u0000"+
		"\u0000\u0412\u040f\u0001\u0000\u0000\u0000\u0412\u0410\u0001\u0000\u0000"+
		"\u0000\u0413\u0442\u0001\u0000\u0000\u0000\u0414\u0416\n\u0004\u0000\u0000"+
		"\u0415\u0417\u0005f\u0000\u0000\u0416\u0415\u0001\u0000\u0000\u0000\u0416"+
		"\u0417\u0001\u0000\u0000\u0000\u0417\u0418\u0001\u0000\u0000\u0000\u0418"+
		"\u043f\u0005S\u0000\u0000\u0419\u0423\u0005\u0003\u0000\u0000\u041a\u0424"+
		"\u0003V+\u0000\u041b\u0420\u0003@ \u0000\u041c\u041d\u0005\u0005\u0000"+
		"\u0000\u041d\u041f\u0003@ \u0000\u041e\u041c\u0001\u0000\u0000\u0000\u041f"+
		"\u0422\u0001\u0000\u0000\u0000\u0420\u041e\u0001\u0000\u0000\u0000\u0420"+
		"\u0421\u0001\u0000\u0000\u0000\u0421\u0424\u0001\u0000\u0000\u0000\u0422"+
		"\u0420\u0001\u0000\u0000\u0000\u0423\u041a\u0001\u0000\u0000\u0000\u0423"+
		"\u041b\u0001\u0000\u0000\u0000\u0423\u0424\u0001\u0000\u0000\u0000\u0424"+
		"\u0425\u0001\u0000\u0000\u0000\u0425\u0440\u0005\u0004\u0000\u0000\u0426"+
		"\u0427\u0003\u00b6[\u0000\u0427\u0428\u0005\u0002\u0000\u0000\u0428\u042a"+
		"\u0001\u0000\u0000\u0000\u0429\u0426\u0001\u0000\u0000\u0000\u0429\u042a"+
		"\u0001\u0000\u0000\u0000\u042a\u042b\u0001\u0000\u0000\u0000\u042b\u0440"+
		"\u0003\u00b8\\\u0000\u042c\u042d\u0003\u00b6[\u0000\u042d\u042e\u0005"+
		"\u0002\u0000\u0000\u042e\u0430\u0001\u0000\u0000\u0000\u042f\u042c\u0001"+
		"\u0000\u0000\u0000\u042f\u0430\u0001\u0000\u0000\u0000\u0430\u0431\u0001"+
		"\u0000\u0000\u0000\u0431\u0432\u0003\u00deo\u0000\u0432\u043b\u0005\u0003"+
		"\u0000\u0000\u0433\u0438\u0003@ \u0000\u0434\u0435\u0005\u0005\u0000\u0000"+
		"\u0435\u0437\u0003@ \u0000\u0436\u0434\u0001\u0000\u0000\u0000\u0437\u043a"+
		"\u0001\u0000\u0000\u0000\u0438\u0436\u0001\u0000\u0000\u0000\u0438\u0439"+
		"\u0001\u0000\u0000\u0000\u0439\u043c\u0001\u0000\u0000\u0000\u043a\u0438"+
		"\u0001\u0000\u0000\u0000\u043b\u0433\u0001\u0000\u0000\u0000\u043b\u043c"+
		"\u0001\u0000\u0000\u0000\u043c\u043d\u0001\u0000\u0000\u0000\u043d\u043e"+
		"\u0005\u0004\u0000\u0000\u043e\u0440\u0001\u0000\u0000\u0000\u043f\u0419"+
		"\u0001\u0000\u0000\u0000\u043f\u0429\u0001\u0000\u0000\u0000\u043f\u042f"+
		"\u0001\u0000\u0000\u0000\u0440\u0442\u0001\u0000\u0000\u0000\u0441\u03c6"+
		"\u0001\u0000\u0000\u0000\u0441\u03c9\u0001\u0000\u0000\u0000\u0441\u03cc"+
		"\u0001\u0000\u0000\u0000\u0441\u03cf\u0001\u0000\u0000\u0000\u0441\u03d2"+
		"\u0001\u0000\u0000\u0000\u0441\u03d5\u0001\u0000\u0000\u0000\u0441\u03eb"+
		"\u0001\u0000\u0000\u0000\u0441\u03ee\u0001\u0000\u0000\u0000\u0441\u03f1"+
		"\u0001\u0000\u0000\u0000\u0441\u03f7\u0001\u0000\u0000\u0000\u0441\u0400"+
		"\u0001\u0000\u0000\u0000\u0441\u0403\u0001\u0000\u0000\u0000\u0441\u040d"+
		"\u0001\u0000\u0000\u0000\u0441\u0414\u0001\u0000\u0000\u0000\u0442\u0445"+
		"\u0001\u0000\u0000\u0000\u0443\u0441\u0001\u0000\u0000\u0000\u0443\u0444"+
		"\u0001\u0000\u0000\u0000\u0444A\u0001\u0000\u0000\u0000\u0445\u0443\u0001"+
		"\u0000\u0000\u0000\u0446\u0447\u0005s\u0000\u0000\u0447\u044c\u0005\u0003"+
		"\u0000\u0000\u0448\u044d\u0005Q\u0000\u0000\u0449\u044a\u0007\u000e\u0000"+
		"\u0000\u044a\u044b\u0005\u0005\u0000\u0000\u044b\u044d\u0003\u00aaU\u0000"+
		"\u044c\u0448\u0001\u0000\u0000\u0000\u044c\u0449\u0001\u0000\u0000\u0000"+
		"\u044d\u044e\u0001\u0000\u0000\u0000\u044e\u044f\u0005\u0004\u0000\u0000"+
		"\u044fC\u0001\u0000\u0000\u0000\u0450\u0451\u0007\u000f\u0000\u0000\u0451"+
		"E\u0001\u0000\u0000\u0000\u0452\u0453\u0005\u0003\u0000\u0000\u0453\u0458"+
		"\u0003@ \u0000\u0454\u0455\u0005\u0005\u0000\u0000\u0455\u0457\u0003@"+
		" \u0000\u0456\u0454\u0001\u0000\u0000\u0000\u0457\u045a\u0001\u0000\u0000"+
		"\u0000\u0458\u0456\u0001\u0000\u0000\u0000\u0458\u0459\u0001\u0000\u0000"+
		"\u0000\u0459\u045b\u0001\u0000\u0000\u0000\u045a\u0458\u0001\u0000\u0000"+
		"\u0000\u045b\u045c\u0005\u0004\u0000\u0000\u045cG\u0001\u0000\u0000\u0000"+
		"\u045d\u045e\u0005\u0090\u0000\u0000\u045e\u0463\u0003F#\u0000\u045f\u0460"+
		"\u0005\u0005\u0000\u0000\u0460\u0462\u0003F#\u0000\u0461\u045f\u0001\u0000"+
		"\u0000\u0000\u0462\u0465\u0001\u0000\u0000\u0000\u0463\u0461\u0001\u0000"+
		"\u0000\u0000\u0463\u0464\u0001\u0000\u0000\u0000\u0464I\u0001\u0000\u0000"+
		"\u0000\u0465\u0463\u0001\u0000\u0000\u0000\u0466\u0468\u00030\u0018\u0000"+
		"\u0467\u0466\u0001\u0000\u0000\u0000\u0467\u0468\u0001\u0000\u0000\u0000"+
		"\u0468\u046e\u0001\u0000\u0000\u0000\u0469\u046f\u0005X\u0000\u0000\u046a"+
		"\u046f\u0005z\u0000\u0000\u046b\u046c\u0005X\u0000\u0000\u046c\u046d\u0005"+
		"l\u0000\u0000\u046d\u046f\u0007\b\u0000\u0000\u046e\u0469\u0001\u0000"+
		"\u0000\u0000\u046e\u046a\u0001\u0000\u0000\u0000\u046e\u046b\u0001\u0000"+
		"\u0000\u0000\u046f\u0470\u0001\u0000\u0000\u0000\u0470\u0474\u0005[\u0000"+
		"\u0000\u0471\u0472\u0003\u00b6[\u0000\u0472\u0473\u0005\u0002\u0000\u0000"+
		"\u0473\u0475\u0001\u0000\u0000\u0000\u0474\u0471\u0001\u0000\u0000\u0000"+
		"\u0474\u0475\u0001\u0000\u0000\u0000\u0475\u0476\u0001\u0000\u0000\u0000"+
		"\u0476\u0479\u0003\u00b8\\\u0000\u0477\u0478\u0005!\u0000\u0000\u0478"+
		"\u047a\u0003\u00d6k\u0000\u0479\u0477\u0001\u0000\u0000\u0000\u0479\u047a"+
		"\u0001\u0000\u0000\u0000\u047a\u0486\u0001\u0000\u0000\u0000\u047b\u047c"+
		"\u0005\u0003\u0000\u0000\u047c\u0481\u0003\u00bc^\u0000\u047d\u047e\u0005"+
		"\u0005\u0000\u0000\u047e\u0480\u0003\u00bc^\u0000\u047f\u047d\u0001\u0000"+
		"\u0000\u0000\u0480\u0483\u0001\u0000\u0000\u0000\u0481\u047f\u0001\u0000"+
		"\u0000\u0000\u0481\u0482\u0001\u0000\u0000\u0000\u0482\u0484\u0001\u0000"+
		"\u0000\u0000\u0483\u0481\u0001\u0000\u0000\u0000\u0484\u0485\u0005\u0004"+
		"\u0000\u0000\u0485\u0487\u0001\u0000\u0000\u0000\u0486\u047b\u0001\u0000"+
		"\u0000\u0000\u0486\u0487\u0001\u0000\u0000\u0000\u0487\u0491\u0001\u0000"+
		"\u0000\u0000\u0488\u048b\u0003H$\u0000\u0489\u048b\u0003V+\u0000\u048a"+
		"\u0488\u0001\u0000\u0000\u0000\u048a\u0489\u0001\u0000\u0000\u0000\u048b"+
		"\u048d\u0001\u0000\u0000\u0000\u048c\u048e\u0003N\'\u0000\u048d\u048c"+
		"\u0001\u0000\u0000\u0000\u048d\u048e\u0001\u0000\u0000\u0000\u048e\u0492"+
		"\u0001\u0000\u0000\u0000\u048f\u0490\u00058\u0000\u0000\u0490\u0492\u0005"+
		"\u0090\u0000\u0000\u0491\u048a\u0001\u0000\u0000\u0000\u0491\u048f\u0001"+
		"\u0000\u0000\u0000\u0492\u0494\u0001\u0000\u0000\u0000\u0493\u0495\u0003"+
		"L&\u0000\u0494\u0493\u0001\u0000\u0000\u0000\u0494\u0495\u0001\u0000\u0000"+
		"\u0000\u0495K\u0001\u0000\u0000\u0000\u0496\u0497\u0005|\u0000\u0000\u0497"+
		"\u049c\u0003d2\u0000\u0498\u0499\u0005\u0005\u0000\u0000\u0499\u049b\u0003"+
		"d2\u0000\u049a\u0498\u0001\u0000\u0000\u0000\u049b\u049e\u0001\u0000\u0000"+
		"\u0000\u049c\u049a\u0001\u0000\u0000\u0000\u049c\u049d\u0001\u0000\u0000"+
		"\u0000\u049dM\u0001\u0000\u0000\u0000\u049e\u049c\u0001\u0000\u0000\u0000"+
		"\u049f\u04a0\u0005k\u0000\u0000\u04a0\u04af\u00050\u0000\u0000\u04a1\u04a2"+
		"\u0005\u0003\u0000\u0000\u04a2\u04a7\u0003\u0018\f\u0000\u04a3\u04a4\u0005"+
		"\u0005\u0000\u0000\u04a4\u04a6\u0003\u0018\f\u0000\u04a5\u04a3\u0001\u0000"+
		"\u0000\u0000\u04a6\u04a9\u0001\u0000\u0000\u0000\u04a7\u04a5\u0001\u0000"+
		"\u0000\u0000\u04a7\u04a8\u0001\u0000\u0000\u0000\u04a8\u04aa\u0001\u0000"+
		"\u0000\u0000\u04a9\u04a7\u0001\u0000\u0000\u0000\u04aa\u04ad\u0005\u0004"+
		"\u0000\u0000\u04ab\u04ac\u0005\u0094\u0000\u0000\u04ac\u04ae\u0003@ \u0000"+
		"\u04ad\u04ab\u0001\u0000\u0000\u0000\u04ad\u04ae\u0001\u0000\u0000\u0000"+
		"\u04ae\u04b0\u0001\u0000\u0000\u0000\u04af\u04a1\u0001\u0000\u0000\u0000"+
		"\u04af\u04b0\u0001\u0000\u0000\u0000\u04b0\u04b1\u0001\u0000\u0000\u0000"+
		"\u04b1\u04cc\u0005\u00b7\u0000\u0000\u04b2\u04cd\u0005\u00b8\u0000\u0000"+
		"\u04b3\u04b4\u0005\u008d\u0000\u0000\u04b4\u04b7\u0005\u0083\u0000\u0000"+
		"\u04b5\u04b8\u0003\u00bc^\u0000\u04b6\u04b8\u0003n7\u0000\u04b7\u04b5"+
		"\u0001\u0000\u0000\u0000\u04b7\u04b6\u0001\u0000\u0000\u0000\u04b8\u04b9"+
		"\u0001\u0000\u0000\u0000\u04b9\u04ba\u0005\u0006\u0000\u0000\u04ba\u04c5"+
		"\u0003@ \u0000\u04bb\u04be\u0005\u0005\u0000\u0000\u04bc\u04bf\u0003\u00bc"+
		"^\u0000\u04bd\u04bf\u0003n7\u0000\u04be\u04bc\u0001\u0000\u0000\u0000"+
		"\u04be\u04bd\u0001\u0000\u0000\u0000\u04bf\u04c0\u0001\u0000\u0000\u0000"+
		"\u04c0\u04c1\u0005\u0006\u0000\u0000\u04c1\u04c2\u0003@ \u0000\u04c2\u04c4"+
		"\u0001\u0000\u0000\u0000\u04c3\u04bb\u0001\u0000\u0000\u0000\u04c4\u04c7"+
		"\u0001\u0000\u0000\u0000\u04c5\u04c3\u0001\u0000\u0000\u0000\u04c5\u04c6"+
		"\u0001\u0000\u0000\u0000\u04c6\u04ca\u0001\u0000\u0000\u0000\u04c7\u04c5"+
		"\u0001\u0000\u0000\u0000\u04c8\u04c9\u0005\u0094\u0000\u0000\u04c9\u04cb"+
		"\u0003@ \u0000\u04ca\u04c8\u0001\u0000\u0000\u0000\u04ca\u04cb\u0001\u0000"+
		"\u0000\u0000\u04cb\u04cd\u0001\u0000\u0000\u0000\u04cc\u04b2\u0001\u0000"+
		"\u0000\u0000\u04cc\u04b3\u0001\u0000\u0000\u0000\u04cdO\u0001\u0000\u0000"+
		"\u0000\u04ce\u04d2\u0005p\u0000\u0000\u04cf\u04d0\u0003\u00b6[\u0000\u04d0"+
		"\u04d1\u0005\u0002\u0000\u0000\u04d1\u04d3\u0001\u0000\u0000\u0000\u04d2"+
		"\u04cf\u0001\u0000\u0000\u0000\u04d2\u04d3\u0001\u0000\u0000\u0000\u04d3"+
		"\u04d4\u0001\u0000\u0000\u0000\u04d4\u04db\u0003\u00cae\u0000\u04d5\u04d6"+
		"\u0005\u0006\u0000\u0000\u04d6\u04dc\u0003R)\u0000\u04d7\u04d8\u0005\u0003"+
		"\u0000\u0000\u04d8\u04d9\u0003R)\u0000\u04d9\u04da\u0005\u0004\u0000\u0000"+
		"\u04da\u04dc\u0001\u0000\u0000\u0000\u04db\u04d5\u0001\u0000\u0000\u0000"+
		"\u04db\u04d7\u0001\u0000\u0000\u0000\u04db\u04dc\u0001\u0000\u0000\u0000"+
		"\u04dcQ\u0001\u0000\u0000\u0000\u04dd\u04e1\u0003\"\u0011\u0000\u04de"+
		"\u04e1\u0003\u00b2Y\u0000\u04df\u04e1\u0005\u00bc\u0000\u0000\u04e0\u04dd"+
		"\u0001\u0000\u0000\u0000\u04e0\u04de\u0001\u0000\u0000\u0000\u04e0\u04df"+
		"\u0001\u0000\u0000\u0000\u04e1S\u0001\u0000\u0000\u0000\u04e2\u04ed\u0005"+
		"w\u0000\u0000\u04e3\u04ee\u0003\u00be_\u0000\u04e4\u04e5\u0003\u00b6["+
		"\u0000\u04e5\u04e6\u0005\u0002\u0000\u0000\u04e6\u04e8\u0001\u0000\u0000"+
		"\u0000\u04e7\u04e4\u0001\u0000\u0000\u0000\u04e7\u04e8\u0001\u0000\u0000"+
		"\u0000\u04e8\u04eb\u0001\u0000\u0000\u0000\u04e9\u04ec\u0003\u00b8\\\u0000"+
		"\u04ea\u04ec\u0003\u00c2a\u0000\u04eb\u04e9\u0001\u0000\u0000\u0000\u04eb"+
		"\u04ea\u0001\u0000\u0000\u0000\u04ec\u04ee\u0001\u0000\u0000\u0000\u04ed"+
		"\u04e3\u0001\u0000\u0000\u0000\u04ed\u04e7\u0001\u0000\u0000\u0000\u04ed"+
		"\u04ee\u0001\u0000\u0000\u0000\u04eeU\u0001\u0000\u0000\u0000\u04ef\u04f1"+
		"\u0003\u0086C\u0000\u04f0\u04ef\u0001\u0000\u0000\u0000\u04f0\u04f1\u0001"+
		"\u0000\u0000\u0000\u04f1\u04f2\u0001\u0000\u0000\u0000\u04f2\u04f8\u0003"+
		"Z-\u0000\u04f3\u04f4\u0003j5\u0000\u04f4\u04f5\u0003Z-\u0000\u04f5\u04f7"+
		"\u0001\u0000\u0000\u0000\u04f6\u04f3\u0001\u0000\u0000\u0000\u04f7\u04fa"+
		"\u0001\u0000\u0000\u0000\u04f8\u04f6\u0001\u0000\u0000\u0000\u04f8\u04f9"+
		"\u0001\u0000\u0000\u0000\u04f9\u04fc\u0001\u0000\u0000\u0000\u04fa\u04f8"+
		"\u0001\u0000\u0000\u0000\u04fb\u04fd\u0003\u0088D\u0000\u04fc\u04fb\u0001"+
		"\u0000\u0000\u0000\u04fc\u04fd\u0001\u0000\u0000\u0000\u04fd\u04ff\u0001"+
		"\u0000\u0000\u0000\u04fe\u0500\u0003\u008aE\u0000\u04ff\u04fe\u0001\u0000"+
		"\u0000\u0000\u04ff\u0500\u0001\u0000\u0000\u0000\u0500W\u0001\u0000\u0000"+
		"\u0000\u0501\u0509\u0003b1\u0000\u0502\u0503\u0003f3\u0000\u0503\u0505"+
		"\u0003b1\u0000\u0504\u0506\u0003h4\u0000\u0505\u0504\u0001\u0000\u0000"+
		"\u0000\u0505\u0506\u0001\u0000\u0000\u0000\u0506\u0508\u0001\u0000\u0000"+
		"\u0000\u0507\u0502\u0001\u0000\u0000\u0000\u0508\u050b\u0001\u0000\u0000"+
		"\u0000\u0509\u0507\u0001\u0000\u0000\u0000\u0509\u050a\u0001\u0000\u0000"+
		"\u0000\u050aY\u0001\u0000\u0000\u0000\u050b\u0509\u0001\u0000\u0000\u0000"+
		"\u050c\u050e\u0005\u0082\u0000\u0000\u050d\u050f\u0007\u0010\u0000\u0000"+
		"\u050e\u050d\u0001\u0000\u0000\u0000\u050e\u050f\u0001\u0000\u0000\u0000"+
		"\u050f\u0510\u0001\u0000\u0000\u0000\u0510\u0515\u0003d2\u0000\u0511\u0512"+
		"\u0005\u0005\u0000\u0000\u0512\u0514\u0003d2\u0000\u0513\u0511\u0001\u0000"+
		"\u0000\u0000\u0514\u0517\u0001\u0000\u0000\u0000\u0515\u0513\u0001\u0000"+
		"\u0000\u0000\u0515\u0516\u0001\u0000\u0000\u0000\u0516\u0524\u0001\u0000"+
		"\u0000\u0000\u0517\u0515\u0001\u0000\u0000\u0000\u0518\u0522\u0005K\u0000"+
		"\u0000\u0519\u051e\u0003b1\u0000\u051a\u051b\u0005\u0005\u0000\u0000\u051b"+
		"\u051d\u0003b1\u0000\u051c\u051a\u0001\u0000\u0000\u0000\u051d\u0520\u0001"+
		"\u0000\u0000\u0000\u051e\u051c\u0001\u0000\u0000\u0000\u051e\u051f\u0001"+
		"\u0000\u0000\u0000\u051f\u0523\u0001\u0000\u0000\u0000\u0520\u051e\u0001"+
		"\u0000\u0000\u0000\u0521\u0523\u0003X,\u0000\u0522\u0519\u0001\u0000\u0000"+
		"\u0000\u0522\u0521\u0001\u0000\u0000\u0000\u0523\u0525\u0001\u0000\u0000"+
		"\u0000\u0524\u0518\u0001\u0000\u0000\u0000\u0524\u0525\u0001\u0000\u0000"+
		"\u0000\u0525\u0528\u0001\u0000\u0000\u0000\u0526\u0527\u0005\u0094\u0000"+
		"\u0000\u0527\u0529\u0003@ \u0000\u0528\u0526\u0001\u0000\u0000\u0000\u0528"+
		"\u0529\u0001\u0000\u0000\u0000\u0529\u0538\u0001\u0000\u0000\u0000\u052a"+
		"\u052b\u0005N\u0000\u0000\u052b\u052c\u0005(\u0000\u0000\u052c\u0531\u0003"+
		"@ \u0000\u052d\u052e\u0005\u0005\u0000\u0000\u052e\u0530\u0003@ \u0000"+
		"\u052f\u052d\u0001\u0000\u0000\u0000\u0530\u0533\u0001\u0000\u0000\u0000"+
		"\u0531\u052f\u0001\u0000\u0000\u0000\u0531\u0532\u0001\u0000\u0000\u0000"+
		"\u0532\u0536\u0001\u0000\u0000\u0000\u0533\u0531\u0001\u0000\u0000\u0000"+
		"\u0534\u0535\u0005O\u0000\u0000\u0535\u0537\u0003@ \u0000\u0536\u0534"+
		"\u0001\u0000\u0000\u0000\u0536\u0537\u0001\u0000\u0000\u0000\u0537\u0539"+
		"\u0001\u0000\u0000\u0000\u0538\u052a\u0001\u0000\u0000\u0000\u0538\u0539"+
		"\u0001\u0000\u0000\u0000\u0539\u0548\u0001\u0000\u0000\u0000\u053a\u053b"+
		"\u0005\u00ae\u0000\u0000\u053b\u053c\u0003\u00d0h\u0000\u053c\u053d\u0005"+
		"!\u0000\u0000\u053d\u0545\u0003x<\u0000\u053e\u053f\u0005\u0005\u0000"+
		"\u0000\u053f\u0540\u0003\u00d0h\u0000\u0540\u0541\u0005!\u0000\u0000\u0541"+
		"\u0542\u0003x<\u0000\u0542\u0544\u0001\u0000\u0000\u0000\u0543\u053e\u0001"+
		"\u0000\u0000\u0000\u0544\u0547\u0001\u0000\u0000\u0000\u0545\u0543\u0001"+
		"\u0000\u0000\u0000\u0545\u0546\u0001\u0000\u0000\u0000\u0546\u0549\u0001"+
		"\u0000\u0000\u0000\u0547\u0545\u0001\u0000\u0000\u0000\u0548\u053a\u0001"+
		"\u0000\u0000\u0000\u0548\u0549\u0001\u0000\u0000\u0000\u0549\u054c\u0001"+
		"\u0000\u0000\u0000\u054a\u054c\u0003H$\u0000\u054b\u050c\u0001\u0000\u0000"+
		"\u0000\u054b\u054a\u0001\u0000\u0000\u0000\u054c[\u0001\u0000\u0000\u0000"+
		"\u054d\u054e\u0003V+\u0000\u054e]\u0001\u0000\u0000\u0000\u054f\u0551"+
		"\u0003\u0086C\u0000\u0550\u054f\u0001\u0000\u0000\u0000\u0550\u0551\u0001"+
		"\u0000\u0000\u0000\u0551\u0552\u0001\u0000\u0000\u0000\u0552\u0554\u0003"+
		"Z-\u0000\u0553\u0555\u0003\u0088D\u0000\u0554\u0553\u0001\u0000\u0000"+
		"\u0000\u0554\u0555\u0001\u0000\u0000\u0000\u0555\u0557\u0001\u0000\u0000"+
		"\u0000\u0556\u0558\u0003\u008aE\u0000\u0557\u0556\u0001\u0000\u0000\u0000"+
		"\u0557\u0558\u0001\u0000\u0000\u0000\u0558_\u0001\u0000\u0000\u0000\u0559"+
		"\u055b\u0003\u0086C\u0000\u055a\u0559\u0001\u0000\u0000\u0000\u055a\u055b"+
		"\u0001\u0000\u0000\u0000\u055b\u055c\u0001\u0000\u0000\u0000\u055c\u0566"+
		"\u0003Z-\u0000\u055d\u055f\u0005\u008b\u0000\u0000\u055e\u0560\u0005\u001d"+
		"\u0000\u0000\u055f\u055e\u0001\u0000\u0000\u0000\u055f\u0560\u0001\u0000"+
		"\u0000\u0000\u0560\u0564\u0001\u0000\u0000\u0000\u0561\u0564\u0005Z\u0000"+
		"\u0000\u0562\u0564\u0005D\u0000\u0000\u0563\u055d\u0001\u0000\u0000\u0000"+
		"\u0563\u0561\u0001\u0000\u0000\u0000\u0563\u0562\u0001\u0000\u0000\u0000"+
		"\u0564\u0565\u0001\u0000\u0000\u0000\u0565\u0567\u0003Z-\u0000\u0566\u0563"+
		"\u0001\u0000\u0000\u0000\u0567\u0568\u0001\u0000\u0000\u0000\u0568\u0566"+
		"\u0001\u0000\u0000\u0000\u0568\u0569\u0001\u0000\u0000\u0000\u0569\u056b"+
		"\u0001\u0000\u0000\u0000\u056a\u056c\u0003\u0088D\u0000\u056b\u056a\u0001"+
		"\u0000\u0000\u0000\u056b\u056c\u0001\u0000\u0000\u0000\u056c\u056e\u0001"+
		"\u0000\u0000\u0000\u056d\u056f\u0003\u008aE\u0000\u056e\u056d\u0001\u0000"+
		"\u0000\u0000\u056e\u056f\u0001\u0000\u0000\u0000\u056fa\u0001\u0000\u0000"+
		"\u0000\u0570\u0571\u0003\u00b6[\u0000\u0571\u0572\u0005\u0002\u0000\u0000"+
		"\u0572\u0574\u0001\u0000\u0000\u0000\u0573\u0570\u0001\u0000\u0000\u0000"+
		"\u0573\u0574\u0001\u0000\u0000\u0000\u0574\u0575\u0001\u0000\u0000\u0000"+
		"\u0575\u057a\u0003\u00b8\\\u0000\u0576\u0578\u0005!\u0000\u0000\u0577"+
		"\u0576\u0001\u0000\u0000\u0000\u0577\u0578\u0001\u0000\u0000\u0000\u0578"+
		"\u0579\u0001\u0000\u0000\u0000\u0579\u057b\u0003\u00d6k\u0000\u057a\u0577"+
		"\u0001\u0000\u0000\u0000\u057a\u057b\u0001\u0000\u0000\u0000\u057b\u0581"+
		"\u0001\u0000\u0000\u0000\u057c\u057d\u0005U\u0000\u0000\u057d\u057e\u0005"+
		"(\u0000\u0000\u057e\u0582\u0003\u00c2a\u0000\u057f\u0580\u0005f\u0000"+
		"\u0000\u0580\u0582\u0005U\u0000\u0000\u0581\u057c\u0001\u0000\u0000\u0000"+
		"\u0581\u057f\u0001\u0000\u0000\u0000\u0581\u0582\u0001\u0000\u0000\u0000"+
		"\u0582\u05b1\u0001\u0000\u0000\u0000\u0583\u0584\u0003\u00b6[\u0000\u0584"+
		"\u0585\u0005\u0002\u0000\u0000\u0585\u0587\u0001\u0000\u0000\u0000\u0586"+
		"\u0583\u0001\u0000\u0000\u0000\u0586\u0587\u0001\u0000\u0000\u0000\u0587"+
		"\u0588\u0001\u0000\u0000\u0000\u0588\u0589\u0003\u00deo\u0000\u0589\u058a"+
		"\u0005\u0003\u0000\u0000\u058a\u058f\u0003@ \u0000\u058b\u058c\u0005\u0005"+
		"\u0000\u0000\u058c\u058e\u0003@ \u0000\u058d\u058b\u0001\u0000\u0000\u0000"+
		"\u058e\u0591\u0001\u0000\u0000\u0000\u058f\u058d\u0001\u0000\u0000\u0000"+
		"\u058f\u0590\u0001\u0000\u0000\u0000\u0590\u0592\u0001\u0000\u0000\u0000"+
		"\u0591\u058f\u0001\u0000\u0000\u0000\u0592\u0597\u0005\u0004\u0000\u0000"+
		"\u0593\u0595\u0005!\u0000\u0000\u0594\u0593\u0001\u0000\u0000\u0000\u0594"+
		"\u0595\u0001\u0000\u0000\u0000\u0595\u0596\u0001\u0000\u0000\u0000\u0596"+
		"\u0598\u0003\u00d6k\u0000\u0597\u0594\u0001\u0000\u0000\u0000\u0597\u0598"+
		"\u0001\u0000\u0000\u0000\u0598\u05b1\u0001\u0000\u0000\u0000\u0599\u05a3"+
		"\u0005\u0003\u0000\u0000\u059a\u059f\u0003b1\u0000\u059b\u059c\u0005\u0005"+
		"\u0000\u0000\u059c\u059e\u0003b1\u0000\u059d\u059b\u0001\u0000\u0000\u0000"+
		"\u059e\u05a1\u0001\u0000\u0000\u0000\u059f\u059d\u0001\u0000\u0000\u0000"+
		"\u059f\u05a0\u0001\u0000\u0000\u0000\u05a0\u05a4\u0001\u0000\u0000\u0000"+
		"\u05a1\u059f\u0001\u0000\u0000\u0000\u05a2\u05a4\u0003X,\u0000\u05a3\u059a"+
		"\u0001\u0000\u0000\u0000\u05a3\u05a2\u0001\u0000\u0000\u0000\u05a4\u05a5"+
		"\u0001\u0000\u0000\u0000\u05a5\u05a6\u0005\u0004\u0000\u0000\u05a6\u05b1"+
		"\u0001\u0000\u0000\u0000\u05a7\u05a8\u0005\u0003\u0000\u0000\u05a8\u05a9"+
		"\u0003V+\u0000\u05a9\u05ae\u0005\u0004\u0000\u0000\u05aa\u05ac\u0005!"+
		"\u0000\u0000\u05ab\u05aa\u0001\u0000\u0000\u0000\u05ab\u05ac\u0001\u0000"+
		"\u0000\u0000\u05ac\u05ad\u0001\u0000\u0000\u0000\u05ad\u05af\u0003\u00d6"+
		"k\u0000\u05ae\u05ab\u0001\u0000\u0000\u0000\u05ae\u05af\u0001\u0000\u0000"+
		"\u0000\u05af\u05b1\u0001\u0000\u0000\u0000\u05b0\u0573\u0001\u0000\u0000"+
		"\u0000\u05b0\u0586\u0001\u0000\u0000\u0000\u05b0\u0599\u0001\u0000\u0000"+
		"\u0000\u05b0\u05a7\u0001\u0000\u0000\u0000\u05b1c\u0001\u0000\u0000\u0000"+
		"\u05b2\u05bf\u0005\u0007\u0000\u0000\u05b3\u05b4\u0003\u00b8\\\u0000\u05b4"+
		"\u05b5\u0005\u0002\u0000\u0000\u05b5\u05b6\u0005\u0007\u0000\u0000\u05b6"+
		"\u05bf\u0001\u0000\u0000\u0000\u05b7\u05bc\u0003@ \u0000\u05b8\u05ba\u0005"+
		"!\u0000\u0000\u05b9\u05b8\u0001\u0000\u0000\u0000\u05b9\u05ba\u0001\u0000"+
		"\u0000\u0000\u05ba\u05bb\u0001\u0000\u0000\u0000\u05bb\u05bd\u0003\u00ae"+
		"W\u0000\u05bc\u05b9\u0001\u0000\u0000\u0000\u05bc\u05bd\u0001\u0000\u0000"+
		"\u0000\u05bd\u05bf\u0001\u0000\u0000\u0000\u05be\u05b2\u0001\u0000\u0000"+
		"\u0000\u05be\u05b3\u0001\u0000\u0000\u0000\u05be\u05b7\u0001\u0000\u0000"+
		"\u0000\u05bfe\u0001\u0000\u0000\u0000\u05c0\u05ce\u0005\u0005\u0000\u0000"+
		"\u05c1\u05c3\u0005d\u0000\u0000\u05c2\u05c1\u0001\u0000\u0000\u0000\u05c2"+
		"\u05c3\u0001\u0000\u0000\u0000\u05c3\u05ca\u0001\u0000\u0000\u0000\u05c4"+
		"\u05c6\u0007\u0011\u0000\u0000\u05c5\u05c7\u0005n\u0000\u0000\u05c6\u05c5"+
		"\u0001\u0000\u0000\u0000\u05c6\u05c7\u0001\u0000\u0000\u0000\u05c7\u05cb"+
		"\u0001\u0000\u0000\u0000\u05c8\u05cb\u0005W\u0000\u0000\u05c9\u05cb\u0005"+
		"3\u0000\u0000\u05ca\u05c4\u0001\u0000\u0000\u0000\u05ca\u05c8\u0001\u0000"+
		"\u0000\u0000\u05ca\u05c9\u0001\u0000\u0000\u0000\u05ca\u05cb\u0001\u0000"+
		"\u0000\u0000\u05cb\u05cc\u0001\u0000\u0000\u0000\u05cc\u05ce\u0005^\u0000"+
		"\u0000\u05cd\u05c0\u0001\u0000\u0000\u0000\u05cd\u05c2\u0001\u0000\u0000"+
		"\u0000\u05ceg\u0001\u0000\u0000\u0000\u05cf\u05d0\u0005k\u0000\u0000\u05d0"+
		"\u05de\u0003@ \u0000\u05d1\u05d2\u0005\u008e\u0000\u0000\u05d2\u05d3\u0005"+
		"\u0003\u0000\u0000\u05d3\u05d8\u0003\u00bc^\u0000\u05d4\u05d5\u0005\u0005"+
		"\u0000\u0000\u05d5\u05d7\u0003\u00bc^\u0000\u05d6\u05d4\u0001\u0000\u0000"+
		"\u0000\u05d7\u05da\u0001\u0000\u0000\u0000\u05d8\u05d6\u0001\u0000\u0000"+
		"\u0000\u05d8\u05d9\u0001\u0000\u0000\u0000\u05d9\u05db\u0001\u0000\u0000"+
		"\u0000\u05da\u05d8\u0001\u0000\u0000\u0000\u05db\u05dc\u0005\u0004\u0000"+
		"\u0000\u05dc\u05de\u0001\u0000\u0000\u0000\u05dd\u05cf\u0001\u0000\u0000"+
		"\u0000\u05dd\u05d1\u0001\u0000\u0000\u0000\u05dei\u0001\u0000\u0000\u0000"+
		"\u05df\u05e1\u0005\u008b\u0000\u0000\u05e0\u05e2\u0005\u001d\u0000\u0000"+
		"\u05e1\u05e0\u0001\u0000\u0000\u0000\u05e1\u05e2\u0001\u0000\u0000\u0000"+
		"\u05e2\u05e6\u0001\u0000\u0000\u0000\u05e3\u05e6\u0005Z\u0000\u0000\u05e4"+
		"\u05e6\u0005D\u0000\u0000\u05e5\u05df\u0001\u0000\u0000\u0000\u05e5\u05e3"+
		"\u0001\u0000\u0000\u0000\u05e5\u05e4\u0001\u0000\u0000\u0000\u05e6k\u0001"+
		"\u0000\u0000\u0000\u05e7\u05e9\u00030\u0018\u0000\u05e8\u05e7\u0001\u0000"+
		"\u0000\u0000\u05e8\u05e9\u0001\u0000\u0000\u0000\u05e9\u05ea\u0001\u0000"+
		"\u0000\u0000\u05ea\u05ed\u0005\u008d\u0000\u0000\u05eb\u05ec\u0005l\u0000"+
		"\u0000\u05ec\u05ee\u0007\b\u0000\u0000\u05ed\u05eb\u0001\u0000\u0000\u0000"+
		"\u05ed\u05ee\u0001\u0000\u0000\u0000\u05ee\u05ef\u0001\u0000\u0000\u0000"+
		"\u05ef\u05f0\u0003r9\u0000\u05f0\u05f3\u0005\u0083\u0000\u0000\u05f1\u05f4"+
		"\u0003\u00bc^\u0000\u05f2\u05f4\u0003n7\u0000\u05f3\u05f1\u0001\u0000"+
		"\u0000\u0000\u05f3\u05f2\u0001\u0000\u0000\u0000\u05f4\u05f5\u0001\u0000"+
		"\u0000\u0000\u05f5\u05f6\u0005\u0006\u0000\u0000\u05f6\u0601\u0003@ \u0000"+
		"\u05f7\u05fa\u0005\u0005\u0000\u0000\u05f8\u05fb\u0003\u00bc^\u0000\u05f9"+
		"\u05fb\u0003n7\u0000\u05fa\u05f8\u0001\u0000\u0000\u0000\u05fa\u05f9\u0001"+
		"\u0000\u0000\u0000\u05fb\u05fc\u0001\u0000\u0000\u0000\u05fc\u05fd\u0005"+
		"\u0006\u0000\u0000\u05fd\u05fe\u0003@ \u0000\u05fe\u0600\u0001\u0000\u0000"+
		"\u0000\u05ff\u05f7\u0001\u0000\u0000\u0000\u0600\u0603\u0001\u0000\u0000"+
		"\u0000\u0601\u05ff\u0001\u0000\u0000\u0000\u0601\u0602\u0001\u0000\u0000"+
		"\u0000\u0602\u0610\u0001\u0000\u0000\u0000\u0603\u0601\u0001\u0000\u0000"+
		"\u0000\u0604\u060e\u0005K\u0000\u0000\u0605\u060a\u0003b1\u0000\u0606"+
		"\u0607\u0005\u0005\u0000\u0000\u0607\u0609\u0003b1\u0000\u0608\u0606\u0001"+
		"\u0000\u0000\u0000\u0609\u060c\u0001\u0000\u0000\u0000\u060a\u0608\u0001"+
		"\u0000\u0000\u0000\u060a\u060b\u0001\u0000\u0000\u0000\u060b\u060f\u0001"+
		"\u0000\u0000\u0000\u060c\u060a\u0001\u0000\u0000\u0000\u060d\u060f\u0003"+
		"X,\u0000\u060e\u0605\u0001\u0000\u0000\u0000\u060e\u060d\u0001\u0000\u0000"+
		"\u0000\u060f\u0611\u0001\u0000\u0000\u0000\u0610\u0604\u0001\u0000\u0000"+
		"\u0000\u0610\u0611\u0001\u0000\u0000\u0000\u0611\u0614\u0001\u0000\u0000"+
		"\u0000\u0612\u0613\u0005\u0094\u0000\u0000\u0613\u0615\u0003@ \u0000\u0614"+
		"\u0612\u0001\u0000\u0000\u0000\u0614\u0615\u0001\u0000\u0000\u0000\u0615"+
		"\u0617\u0001\u0000\u0000\u0000\u0616\u0618\u0003L&\u0000\u0617\u0616\u0001"+
		"\u0000\u0000\u0000\u0617\u0618\u0001\u0000\u0000\u0000\u0618m\u0001\u0000"+
		"\u0000\u0000\u0619\u061a\u0005\u0003\u0000\u0000\u061a\u061f\u0003\u00bc"+
		"^\u0000\u061b\u061c\u0005\u0005\u0000\u0000\u061c\u061e\u0003\u00bc^\u0000"+
		"\u061d\u061b\u0001\u0000\u0000\u0000\u061e\u0621\u0001\u0000\u0000\u0000"+
		"\u061f\u061d\u0001\u0000\u0000\u0000\u061f\u0620\u0001\u0000\u0000\u0000"+
		"\u0620\u0622\u0001\u0000\u0000\u0000\u0621\u061f\u0001\u0000\u0000\u0000"+
		"\u0622\u0623\u0005\u0004\u0000\u0000\u0623o\u0001\u0000\u0000\u0000\u0624"+
		"\u0626\u00030\u0018\u0000\u0625\u0624\u0001\u0000\u0000\u0000\u0625\u0626"+
		"\u0001\u0000\u0000\u0000\u0626\u0627\u0001\u0000\u0000\u0000\u0627\u062a"+
		"\u0005\u008d\u0000\u0000\u0628\u0629\u0005l\u0000\u0000\u0629\u062b\u0007"+
		"\b\u0000\u0000\u062a\u0628\u0001\u0000\u0000\u0000\u062a\u062b\u0001\u0000"+
		"\u0000\u0000\u062b\u062c\u0001\u0000\u0000\u0000\u062c\u062d\u0003r9\u0000"+
		"\u062d\u0630\u0005\u0083\u0000\u0000\u062e\u0631\u0003\u00bc^\u0000\u062f"+
		"\u0631\u0003n7\u0000\u0630\u062e\u0001\u0000\u0000\u0000\u0630\u062f\u0001"+
		"\u0000\u0000\u0000\u0631\u0632\u0001\u0000\u0000\u0000\u0632\u0633\u0005"+
		"\u0006\u0000\u0000\u0633\u063e\u0003@ \u0000\u0634\u0637\u0005\u0005\u0000"+
		"\u0000\u0635\u0638\u0003\u00bc^\u0000\u0636\u0638\u0003n7\u0000\u0637"+
		"\u0635\u0001\u0000\u0000\u0000\u0637\u0636\u0001\u0000\u0000\u0000\u0638"+
		"\u0639\u0001\u0000\u0000\u0000\u0639\u063a\u0005\u0006\u0000\u0000\u063a"+
		"\u063b\u0003@ \u0000\u063b\u063d\u0001\u0000\u0000\u0000\u063c\u0634\u0001"+
		"\u0000\u0000\u0000\u063d\u0640\u0001\u0000\u0000\u0000\u063e\u063c\u0001"+
		"\u0000\u0000\u0000\u063e\u063f\u0001\u0000\u0000\u0000\u063f\u0643\u0001"+
		"\u0000\u0000\u0000\u0640\u063e\u0001\u0000\u0000\u0000\u0641\u0642\u0005"+
		"\u0094\u0000\u0000\u0642\u0644\u0003@ \u0000\u0643\u0641\u0001\u0000\u0000"+
		"\u0000\u0643\u0644\u0001\u0000\u0000\u0000\u0644\u0646\u0001\u0000\u0000"+
		"\u0000\u0645\u0647\u0003L&\u0000\u0646\u0645\u0001\u0000\u0000\u0000\u0646"+
		"\u0647\u0001\u0000\u0000\u0000\u0647\u064c\u0001\u0000\u0000\u0000\u0648"+
		"\u064a\u0003\u0088D\u0000\u0649\u0648\u0001\u0000\u0000\u0000\u0649\u064a"+
		"\u0001\u0000\u0000\u0000\u064a\u064b\u0001\u0000\u0000\u0000\u064b\u064d"+
		"\u0003\u008aE\u0000\u064c\u0649\u0001\u0000\u0000\u0000\u064c\u064d\u0001"+
		"\u0000\u0000\u0000\u064dq\u0001\u0000\u0000\u0000\u064e\u064f\u0003\u00b6"+
		"[\u0000\u064f\u0650\u0005\u0002\u0000\u0000\u0650\u0652\u0001\u0000\u0000"+
		"\u0000\u0651\u064e\u0001\u0000\u0000\u0000\u0651\u0652\u0001\u0000\u0000"+
		"\u0000\u0652\u0653\u0001\u0000\u0000\u0000\u0653\u0656\u0003\u00b8\\\u0000"+
		"\u0654\u0655\u0005!\u0000\u0000\u0655\u0657\u0003\u00d2i\u0000\u0656\u0654"+
		"\u0001\u0000\u0000\u0000\u0656\u0657\u0001\u0000\u0000\u0000\u0657\u065d"+
		"\u0001\u0000\u0000\u0000\u0658\u0659\u0005U\u0000\u0000\u0659\u065a\u0005"+
		"(\u0000\u0000\u065a\u065e\u0003\u00c2a\u0000\u065b\u065c\u0005f\u0000"+
		"\u0000\u065c\u065e\u0005U\u0000\u0000\u065d\u0658\u0001\u0000\u0000\u0000"+
		"\u065d\u065b\u0001\u0000\u0000\u0000\u065d\u065e\u0001\u0000\u0000\u0000"+
		"\u065es\u0001\u0000\u0000\u0000\u065f\u0661\u0005\u008f\u0000\u0000\u0660"+
		"\u0662\u0003\u00b6[\u0000\u0661\u0660\u0001\u0000\u0000\u0000\u0661\u0662"+
		"\u0001\u0000\u0000\u0000\u0662\u0665\u0001\u0000\u0000\u0000\u0663\u0664"+
		"\u0005[\u0000\u0000\u0664\u0666\u0003\u00d4j\u0000\u0665\u0663\u0001\u0000"+
		"\u0000\u0000\u0665\u0666\u0001\u0000\u0000\u0000\u0666u\u0001\u0000\u0000"+
		"\u0000\u0667\u0668\u0005\u00b2\u0000\u0000\u0668\u0669\u0005\u0003\u0000"+
		"\u0000\u0669\u066a\u0005\u0094\u0000\u0000\u066a\u066b\u0003@ \u0000\u066b"+
		"\u066c\u0005\u0004\u0000\u0000\u066cw\u0001\u0000\u0000\u0000\u066d\u066f"+
		"\u0005\u0003\u0000\u0000\u066e\u0670\u0003\u00d8l\u0000\u066f\u066e\u0001"+
		"\u0000\u0000\u0000\u066f\u0670\u0001\u0000\u0000\u0000\u0670\u067b\u0001"+
		"\u0000\u0000\u0000\u0671\u0672\u0005\u0099\u0000\u0000\u0672\u0673\u0005"+
		"(\u0000\u0000\u0673\u0678\u0003@ \u0000\u0674\u0675\u0005\u0005\u0000"+
		"\u0000\u0675\u0677\u0003@ \u0000\u0676\u0674\u0001\u0000\u0000\u0000\u0677"+
		"\u067a\u0001\u0000\u0000\u0000\u0678\u0676\u0001\u0000\u0000\u0000\u0678"+
		"\u0679\u0001\u0000\u0000\u0000\u0679\u067c\u0001\u0000\u0000\u0000\u067a"+
		"\u0678\u0001\u0000\u0000\u0000\u067b\u0671\u0001\u0000\u0000\u0000\u067b"+
		"\u067c\u0001\u0000\u0000\u0000\u067c\u067d\u0001\u0000\u0000\u0000\u067d"+
		"\u067e\u0005m\u0000\u0000\u067e\u067f\u0005(\u0000\u0000\u067f\u0684\u0003"+
		"\u008cF\u0000\u0680\u0681\u0005\u0005\u0000\u0000\u0681\u0683\u0003\u008c"+
		"F\u0000\u0682\u0680\u0001\u0000\u0000\u0000\u0683\u0686\u0001\u0000\u0000"+
		"\u0000\u0684\u0682\u0001\u0000\u0000\u0000\u0684\u0685\u0001\u0000\u0000"+
		"\u0000\u0685\u0688\u0001\u0000\u0000\u0000\u0686\u0684\u0001\u0000\u0000"+
		"\u0000\u0687\u0689\u0003|>\u0000\u0688\u0687\u0001\u0000\u0000\u0000\u0688"+
		"\u0689\u0001\u0000\u0000\u0000\u0689\u068a\u0001\u0000\u0000\u0000\u068a"+
		"\u068b\u0005\u0004\u0000\u0000\u068by\u0001\u0000\u0000\u0000\u068c\u06ae"+
		"\u0005\u0098\u0000\u0000\u068d\u06af\u0003\u00d0h\u0000\u068e\u0690\u0005"+
		"\u0003\u0000\u0000\u068f\u0691\u0003\u00d8l\u0000\u0690\u068f\u0001\u0000"+
		"\u0000\u0000\u0690\u0691\u0001\u0000\u0000\u0000\u0691\u069c\u0001\u0000"+
		"\u0000\u0000\u0692\u0693\u0005\u0099\u0000\u0000\u0693\u0694\u0005(\u0000"+
		"\u0000\u0694\u0699\u0003@ \u0000\u0695\u0696\u0005\u0005\u0000\u0000\u0696"+
		"\u0698\u0003@ \u0000\u0697\u0695\u0001\u0000\u0000\u0000\u0698\u069b\u0001"+
		"\u0000\u0000\u0000\u0699\u0697\u0001\u0000\u0000\u0000\u0699\u069a\u0001"+
		"\u0000\u0000\u0000\u069a\u069d\u0001\u0000\u0000\u0000\u069b\u0699\u0001"+
		"\u0000\u0000\u0000\u069c\u0692\u0001\u0000\u0000\u0000\u069c\u069d\u0001"+
		"\u0000\u0000\u0000\u069d\u06a8\u0001\u0000\u0000\u0000\u069e\u069f\u0005"+
		"m\u0000\u0000\u069f\u06a0\u0005(\u0000\u0000\u06a0\u06a5\u0003\u008cF"+
		"\u0000\u06a1\u06a2\u0005\u0005\u0000\u0000\u06a2\u06a4\u0003\u008cF\u0000"+
		"\u06a3\u06a1\u0001\u0000\u0000\u0000\u06a4\u06a7\u0001\u0000\u0000\u0000"+
		"\u06a5\u06a3\u0001\u0000\u0000\u0000\u06a5\u06a6\u0001\u0000\u0000\u0000"+
		"\u06a6\u06a9\u0001\u0000\u0000\u0000\u06a7\u06a5\u0001\u0000\u0000\u0000"+
		"\u06a8\u069e\u0001\u0000\u0000\u0000\u06a8\u06a9\u0001\u0000\u0000\u0000"+
		"\u06a9\u06ab\u0001\u0000\u0000\u0000\u06aa\u06ac\u0003|>\u0000\u06ab\u06aa"+
		"\u0001\u0000\u0000\u0000\u06ab\u06ac\u0001\u0000\u0000\u0000\u06ac\u06ad"+
		"\u0001\u0000\u0000\u0000\u06ad\u06af\u0005\u0004\u0000\u0000\u06ae\u068d"+
		"\u0001\u0000\u0000\u0000\u06ae\u068e\u0001\u0000\u0000\u0000\u06af{\u0001"+
		"\u0000\u0000\u0000\u06b0\u06ba\u0003~?\u0000\u06b1\u06b8\u0005\u00b4\u0000"+
		"\u0000\u06b2\u06b3\u0005e\u0000\u0000\u06b3\u06b9\u0005\u00b6\u0000\u0000"+
		"\u06b4\u06b5\u0005\u009d\u0000\u0000\u06b5\u06b9\u0005\u007f\u0000\u0000"+
		"\u06b6\u06b9\u0005N\u0000\u0000\u06b7\u06b9\u0005\u00b5\u0000\u0000\u06b8"+
		"\u06b2\u0001\u0000\u0000\u0000\u06b8\u06b4\u0001\u0000\u0000\u0000\u06b8"+
		"\u06b6\u0001\u0000\u0000\u0000\u06b8\u06b7\u0001\u0000\u0000\u0000\u06b9"+
		"\u06bb\u0001\u0000\u0000\u0000\u06ba\u06b1\u0001\u0000\u0000\u0000\u06ba"+
		"\u06bb\u0001\u0000\u0000\u0000\u06bb}\u0001\u0000\u0000\u0000\u06bc\u06c3"+
		"\u0007\u0012\u0000\u0000\u06bd\u06c4\u0003\u0094J\u0000\u06be\u06bf\u0005"+
		"\'\u0000\u0000\u06bf\u06c0\u0003\u0090H\u0000\u06c0\u06c1\u0005 \u0000"+
		"\u0000\u06c1\u06c2\u0003\u0092I\u0000\u06c2\u06c4\u0001\u0000\u0000\u0000"+
		"\u06c3\u06bd\u0001\u0000\u0000\u0000\u06c3\u06be\u0001\u0000\u0000\u0000"+
		"\u06c4\u007f\u0001\u0000\u0000\u0000\u06c5\u06c6\u0003\u00dam\u0000\u06c6"+
		"\u06d0\u0005\u0003\u0000\u0000\u06c7\u06cc\u0003@ \u0000\u06c8\u06c9\u0005"+
		"\u0005\u0000\u0000\u06c9\u06cb\u0003@ \u0000\u06ca\u06c8\u0001\u0000\u0000"+
		"\u0000\u06cb\u06ce\u0001\u0000\u0000\u0000\u06cc\u06ca\u0001\u0000\u0000"+
		"\u0000\u06cc\u06cd\u0001\u0000\u0000\u0000\u06cd\u06d1\u0001\u0000\u0000"+
		"\u0000\u06ce\u06cc\u0001\u0000\u0000\u0000\u06cf\u06d1\u0005\u0007\u0000"+
		"\u0000\u06d0\u06c7\u0001\u0000\u0000\u0000\u06d0\u06cf\u0001\u0000\u0000"+
		"\u0000\u06d1\u06d2\u0001\u0000\u0000\u0000\u06d2\u06d3\u0005\u0004\u0000"+
		"\u0000\u06d3\u0081\u0001\u0000\u0000\u0000\u06d4\u06d5\u0003\u00dcn\u0000"+
		"\u06d5\u06e2\u0005\u0003\u0000\u0000\u06d6\u06d8\u0005>\u0000\u0000\u06d7"+
		"\u06d6\u0001\u0000\u0000\u0000\u06d7\u06d8\u0001\u0000\u0000\u0000\u06d8"+
		"\u06d9\u0001\u0000\u0000\u0000\u06d9\u06de\u0003@ \u0000\u06da\u06db\u0005"+
		"\u0005\u0000\u0000\u06db\u06dd\u0003@ \u0000\u06dc\u06da\u0001\u0000\u0000"+
		"\u0000\u06dd\u06e0\u0001\u0000\u0000\u0000\u06de\u06dc\u0001\u0000\u0000"+
		"\u0000\u06de\u06df\u0001\u0000\u0000\u0000\u06df\u06e3\u0001\u0000\u0000"+
		"\u0000\u06e0\u06de\u0001\u0000\u0000\u0000\u06e1\u06e3\u0005\u0007\u0000"+
		"\u0000\u06e2\u06d7\u0001\u0000\u0000\u0000\u06e2\u06e1\u0001\u0000\u0000"+
		"\u0000\u06e2\u06e3\u0001\u0000\u0000\u0000\u06e3\u06e4\u0001\u0000\u0000"+
		"\u0000\u06e4\u06e6\u0005\u0004\u0000\u0000\u06e5\u06e7\u0003v;\u0000\u06e6"+
		"\u06e5\u0001\u0000\u0000\u0000\u06e6\u06e7\u0001\u0000\u0000\u0000\u06e7"+
		"\u0083\u0001\u0000\u0000\u0000\u06e8\u06e9\u0003\u0096K\u0000\u06e9\u06f3"+
		"\u0005\u0003\u0000\u0000\u06ea\u06ef\u0003@ \u0000\u06eb\u06ec\u0005\u0005"+
		"\u0000\u0000\u06ec\u06ee\u0003@ \u0000\u06ed\u06eb\u0001\u0000\u0000\u0000"+
		"\u06ee\u06f1\u0001\u0000\u0000\u0000\u06ef\u06ed\u0001\u0000\u0000\u0000"+
		"\u06ef\u06f0\u0001\u0000\u0000\u0000\u06f0\u06f4\u0001\u0000\u0000\u0000"+
		"\u06f1\u06ef\u0001\u0000\u0000\u0000\u06f2\u06f4\u0005\u0007\u0000\u0000"+
		"\u06f3\u06ea\u0001\u0000\u0000\u0000\u06f3\u06f2\u0001\u0000\u0000\u0000"+
		"\u06f3\u06f4\u0001\u0000\u0000\u0000\u06f4\u06f5\u0001\u0000\u0000\u0000"+
		"\u06f5\u06f7\u0005\u0004\u0000\u0000\u06f6\u06f8\u0003v;\u0000\u06f7\u06f6"+
		"\u0001\u0000\u0000\u0000\u06f7\u06f8\u0001\u0000\u0000\u0000\u06f8\u06f9"+
		"\u0001\u0000\u0000\u0000\u06f9\u06fc\u0005\u0098\u0000\u0000\u06fa\u06fd"+
		"\u0003x<\u0000\u06fb\u06fd\u0003\u00d0h\u0000\u06fc\u06fa\u0001\u0000"+
		"\u0000\u0000\u06fc\u06fb\u0001\u0000\u0000\u0000\u06fd\u0085\u0001\u0000"+
		"\u0000\u0000\u06fe\u0700\u0005\u0095\u0000\u0000\u06ff\u0701\u0005t\u0000"+
		"\u0000\u0700\u06ff\u0001\u0000\u0000\u0000\u0700\u0701\u0001\u0000\u0000"+
		"\u0000\u0701\u0702\u0001\u0000\u0000\u0000\u0702\u0707\u00036\u001b\u0000"+
		"\u0703\u0704\u0005\u0005\u0000\u0000\u0704\u0706\u00036\u001b\u0000\u0705"+
		"\u0703\u0001\u0000\u0000\u0000\u0706\u0709\u0001\u0000\u0000\u0000\u0707"+
		"\u0705\u0001\u0000\u0000\u0000\u0707\u0708\u0001\u0000\u0000\u0000\u0708"+
		"\u0087\u0001\u0000\u0000\u0000\u0709\u0707\u0001\u0000\u0000\u0000\u070a"+
		"\u070b\u0005m\u0000\u0000\u070b\u070c\u0005(\u0000\u0000\u070c\u0711\u0003"+
		"\u008cF\u0000\u070d\u070e\u0005\u0005\u0000\u0000\u070e\u0710\u0003\u008c"+
		"F\u0000\u070f\u070d\u0001\u0000\u0000\u0000\u0710\u0713\u0001\u0000\u0000"+
		"\u0000\u0711\u070f\u0001\u0000\u0000\u0000\u0711\u0712\u0001\u0000\u0000"+
		"\u0000\u0712\u0089\u0001\u0000\u0000\u0000\u0713\u0711\u0001\u0000\u0000"+
		"\u0000\u0714\u0715\u0005b\u0000\u0000\u0715\u0718\u0003@ \u0000\u0716"+
		"\u0717\u0007\u0013\u0000\u0000\u0717\u0719\u0003@ \u0000\u0718\u0716\u0001"+
		"\u0000\u0000\u0000\u0718\u0719\u0001\u0000\u0000\u0000\u0719\u008b\u0001"+
		"\u0000\u0000\u0000\u071a\u071d\u0003@ \u0000\u071b\u071c\u0005-\u0000"+
		"\u0000\u071c\u071e\u0003\u00be_\u0000\u071d\u071b\u0001\u0000\u0000\u0000"+
		"\u071d\u071e\u0001\u0000\u0000\u0000\u071e\u0720\u0001\u0000\u0000\u0000"+
		"\u071f\u0721\u0003\u008eG\u0000\u0720\u071f\u0001\u0000\u0000\u0000\u0720"+
		"\u0721\u0001\u0000\u0000\u0000\u0721\u0724\u0001\u0000\u0000\u0000\u0722"+
		"\u0723\u0005\u00af\u0000\u0000\u0723\u0725\u0007\u0014\u0000\u0000\u0724"+
		"\u0722\u0001\u0000\u0000\u0000\u0724\u0725\u0001\u0000\u0000\u0000\u0725"+
		"\u008d\u0001\u0000\u0000\u0000\u0726\u0727\u0007\u0015\u0000\u0000\u0727"+
		"\u008f\u0001\u0000\u0000\u0000\u0728\u0729\u0003@ \u0000\u0729\u072a\u0005"+
		"\u009b\u0000\u0000\u072a\u0733\u0001\u0000\u0000\u0000\u072b\u072c\u0003"+
		"@ \u0000\u072c\u072d\u0005\u009e\u0000\u0000\u072d\u0733\u0001\u0000\u0000"+
		"\u0000\u072e\u072f\u0005\u009d\u0000\u0000\u072f\u0733\u0005\u007f\u0000"+
		"\u0000\u0730\u0731\u0005\u009c\u0000\u0000\u0731\u0733\u0005\u009b\u0000"+
		"\u0000\u0732\u0728\u0001\u0000\u0000\u0000\u0732\u072b\u0001\u0000\u0000"+
		"\u0000\u0732\u072e\u0001\u0000\u0000\u0000\u0732\u0730\u0001\u0000\u0000"+
		"\u0000\u0733\u0091\u0001\u0000\u0000\u0000\u0734\u0735\u0003@ \u0000\u0735"+
		"\u0736\u0005\u009b\u0000\u0000\u0736\u073f\u0001\u0000\u0000\u0000\u0737"+
		"\u0738\u0003@ \u0000\u0738\u0739\u0005\u009e\u0000\u0000\u0739\u073f\u0001"+
		"\u0000\u0000\u0000\u073a\u073b\u0005\u009d\u0000\u0000\u073b\u073f\u0005"+
		"\u007f\u0000\u0000\u073c\u073d\u0005\u009c\u0000\u0000\u073d\u073f\u0005"+
		"\u009e\u0000\u0000\u073e\u0734\u0001\u0000\u0000\u0000\u073e\u0737\u0001"+
		"\u0000\u0000\u0000\u073e\u073a\u0001\u0000\u0000\u0000\u073e\u073c\u0001"+
		"\u0000\u0000\u0000\u073f\u0093\u0001\u0000\u0000\u0000\u0740\u0741\u0003"+
		"@ \u0000\u0741\u0742\u0005\u009b\u0000\u0000\u0742\u0748\u0001\u0000\u0000"+
		"\u0000\u0743\u0744\u0005\u009c\u0000\u0000\u0744\u0748\u0005\u009b\u0000"+
		"\u0000\u0745\u0746\u0005\u009d\u0000\u0000\u0746\u0748\u0005\u007f\u0000"+
		"\u0000\u0747\u0740\u0001\u0000\u0000\u0000\u0747\u0743\u0001\u0000\u0000"+
		"\u0000\u0747\u0745\u0001\u0000\u0000\u0000\u0748\u0095\u0001\u0000\u0000"+
		"\u0000\u0749\u074a\u0007\u0016\u0000\u0000\u074a\u074b\u0005\u0003\u0000"+
		"\u0000\u074b\u074c\u0003@ \u0000\u074c\u074d\u0005\u0004\u0000\u0000\u074d"+
		"\u074e\u0005\u0098\u0000\u0000\u074e\u0750\u0005\u0003\u0000\u0000\u074f"+
		"\u0751\u0003\u009cN\u0000\u0750\u074f\u0001\u0000\u0000\u0000\u0750\u0751"+
		"\u0001\u0000\u0000\u0000\u0751\u0752\u0001\u0000\u0000\u0000\u0752\u0754"+
		"\u0003\u00a0P\u0000\u0753\u0755\u0003~?\u0000\u0754\u0753\u0001\u0000"+
		"\u0000\u0000\u0754\u0755\u0001\u0000\u0000\u0000\u0755\u0756\u0001\u0000"+
		"\u0000\u0000\u0756\u0757\u0005\u0004\u0000\u0000\u0757\u079f\u0001\u0000"+
		"\u0000\u0000\u0758\u0759\u0007\u0017\u0000\u0000\u0759\u075a\u0005\u0003"+
		"\u0000\u0000\u075a\u075b\u0005\u0004\u0000\u0000\u075b\u075c\u0005\u0098"+
		"\u0000\u0000\u075c\u075e\u0005\u0003\u0000\u0000\u075d\u075f\u0003\u009c"+
		"N\u0000\u075e\u075d\u0001\u0000\u0000\u0000\u075e\u075f\u0001\u0000\u0000"+
		"\u0000\u075f\u0761\u0001\u0000\u0000\u0000\u0760\u0762\u0003\u009eO\u0000"+
		"\u0761\u0760\u0001\u0000\u0000\u0000\u0761\u0762\u0001\u0000\u0000\u0000"+
		"\u0762\u0763\u0001\u0000\u0000\u0000\u0763\u079f\u0005\u0004\u0000\u0000"+
		"\u0764\u0765\u0007\u0018\u0000\u0000\u0765\u0766\u0005\u0003\u0000\u0000"+
		"\u0766\u0767\u0005\u0004\u0000\u0000\u0767\u0768\u0005\u0098\u0000\u0000"+
		"\u0768\u076a\u0005\u0003\u0000\u0000\u0769\u076b\u0003\u009cN\u0000\u076a"+
		"\u0769\u0001\u0000\u0000\u0000\u076a\u076b\u0001\u0000\u0000\u0000\u076b"+
		"\u076c\u0001\u0000\u0000\u0000\u076c\u076d\u0003\u00a0P\u0000\u076d\u076e"+
		"\u0005\u0004\u0000\u0000\u076e\u079f\u0001\u0000\u0000\u0000\u076f\u0770"+
		"\u0007\u0019\u0000\u0000\u0770\u0771\u0005\u0003\u0000\u0000\u0771\u0773"+
		"\u0003@ \u0000\u0772\u0774\u0003\u0098L\u0000\u0773\u0772\u0001\u0000"+
		"\u0000\u0000\u0773\u0774\u0001\u0000\u0000\u0000\u0774\u0776\u0001\u0000"+
		"\u0000\u0000\u0775\u0777\u0003\u009aM\u0000\u0776\u0775\u0001\u0000\u0000"+
		"\u0000\u0776\u0777\u0001\u0000\u0000\u0000\u0777\u0778\u0001\u0000\u0000"+
		"\u0000\u0778\u0779\u0005\u0004\u0000\u0000\u0779\u077a\u0005\u0098\u0000"+
		"\u0000\u077a\u077c\u0005\u0003\u0000\u0000\u077b\u077d\u0003\u009cN\u0000"+
		"\u077c\u077b\u0001\u0000\u0000\u0000\u077c\u077d\u0001\u0000\u0000\u0000"+
		"\u077d\u077e\u0001\u0000\u0000\u0000\u077e\u077f\u0003\u00a0P\u0000\u077f"+
		"\u0780\u0005\u0004\u0000\u0000\u0780\u079f\u0001\u0000\u0000\u0000\u0781"+
		"\u0782\u0005\u00a4\u0000\u0000\u0782\u0783\u0005\u0003\u0000\u0000\u0783"+
		"\u0784\u0003@ \u0000\u0784\u0785\u0005\u0005\u0000\u0000\u0785\u0786\u0003"+
		"\"\u0011\u0000\u0786\u0787\u0005\u0004\u0000\u0000\u0787\u0788\u0005\u0098"+
		"\u0000\u0000\u0788\u078a\u0005\u0003\u0000\u0000\u0789\u078b\u0003\u009c"+
		"N\u0000\u078a\u0789\u0001\u0000\u0000\u0000\u078a\u078b\u0001\u0000\u0000"+
		"\u0000\u078b\u078c\u0001\u0000\u0000\u0000\u078c\u078e\u0003\u00a0P\u0000"+
		"\u078d\u078f\u0003~?\u0000\u078e\u078d\u0001\u0000\u0000\u0000\u078e\u078f"+
		"\u0001\u0000\u0000\u0000\u078f\u0790\u0001\u0000\u0000\u0000\u0790\u0791"+
		"\u0005\u0004\u0000\u0000\u0791\u079f\u0001\u0000\u0000\u0000\u0792\u0793"+
		"\u0005\u00a5\u0000\u0000\u0793\u0794\u0005\u0003\u0000\u0000\u0794\u0795"+
		"\u0003@ \u0000\u0795\u0796\u0005\u0004\u0000\u0000\u0796\u0797\u0005\u0098"+
		"\u0000\u0000\u0797\u0799\u0005\u0003\u0000\u0000\u0798\u079a\u0003\u009c"+
		"N\u0000\u0799\u0798\u0001\u0000\u0000\u0000\u0799\u079a\u0001\u0000\u0000"+
		"\u0000\u079a\u079b\u0001\u0000\u0000\u0000\u079b\u079c\u0003\u00a0P\u0000"+
		"\u079c\u079d\u0005\u0004\u0000\u0000\u079d\u079f\u0001\u0000\u0000\u0000"+
		"\u079e\u0749\u0001\u0000\u0000\u0000\u079e\u0758\u0001\u0000\u0000\u0000"+
		"\u079e\u0764\u0001\u0000\u0000\u0000\u079e\u076f\u0001\u0000\u0000\u0000"+
		"\u079e\u0781\u0001\u0000\u0000\u0000\u079e\u0792\u0001\u0000\u0000\u0000"+
		"\u079f\u0097\u0001\u0000\u0000\u0000\u07a0\u07a1\u0005\u0005\u0000\u0000"+
		"\u07a1\u07a2\u0003\"\u0011\u0000\u07a2\u0099\u0001\u0000\u0000\u0000\u07a3"+
		"\u07a4\u0005\u0005\u0000\u0000\u07a4\u07a5\u0003\"\u0011\u0000\u07a5\u009b"+
		"\u0001\u0000\u0000\u0000\u07a6\u07a7\u0005\u0099\u0000\u0000\u07a7\u07a9"+
		"\u0005(\u0000\u0000\u07a8\u07aa\u0003@ \u0000\u07a9\u07a8\u0001\u0000"+
		"\u0000\u0000\u07aa\u07ab\u0001\u0000\u0000\u0000\u07ab\u07a9\u0001\u0000"+
		"\u0000\u0000\u07ab\u07ac\u0001\u0000\u0000\u0000\u07ac\u009d\u0001\u0000"+
		"\u0000\u0000\u07ad\u07ae\u0005m\u0000\u0000\u07ae\u07b0\u0005(\u0000\u0000"+
		"\u07af\u07b1\u0003@ \u0000\u07b0\u07af\u0001\u0000\u0000\u0000\u07b1\u07b2"+
		"\u0001\u0000\u0000\u0000\u07b2\u07b0\u0001\u0000\u0000\u0000\u07b2\u07b3"+
		"\u0001\u0000\u0000\u0000\u07b3\u009f\u0001\u0000\u0000\u0000\u07b4\u07b5"+
		"\u0005m\u0000\u0000\u07b5\u07b6\u0005(\u0000\u0000\u07b6\u07b7\u0003\u00a2"+
		"Q\u0000\u07b7\u00a1\u0001\u0000\u0000\u0000\u07b8\u07ba\u0003@ \u0000"+
		"\u07b9\u07bb\u0003\u008eG\u0000\u07ba\u07b9\u0001\u0000\u0000\u0000\u07ba"+
		"\u07bb\u0001\u0000\u0000\u0000\u07bb\u07c3\u0001\u0000\u0000\u0000\u07bc"+
		"\u07bd\u0005\u0005\u0000\u0000\u07bd\u07bf\u0003@ \u0000\u07be\u07c0\u0003"+
		"\u008eG\u0000\u07bf\u07be\u0001\u0000\u0000\u0000\u07bf\u07c0\u0001\u0000"+
		"\u0000\u0000\u07c0\u07c2\u0001\u0000\u0000\u0000\u07c1\u07bc\u0001\u0000"+
		"\u0000\u0000\u07c2\u07c5\u0001\u0000\u0000\u0000\u07c3\u07c1\u0001\u0000"+
		"\u0000\u0000\u07c3\u07c4\u0001\u0000\u0000\u0000\u07c4\u00a3\u0001\u0000"+
		"\u0000\u0000\u07c5\u07c3\u0001\u0000\u0000\u0000\u07c6\u07c7\u0003V+\u0000"+
		"\u07c7\u00a5\u0001\u0000\u0000\u0000\u07c8\u07c9\u0003V+\u0000\u07c9\u00a7"+
		"\u0001\u0000\u0000\u0000\u07ca\u07cb\u0007\u001a\u0000\u0000\u07cb\u00a9"+
		"\u0001\u0000\u0000\u0000\u07cc\u07cd\u0005\u00bc\u0000\u0000\u07cd\u00ab"+
		"\u0001\u0000\u0000\u0000\u07ce\u07d1\u0003@ \u0000\u07cf\u07d1\u0003\u001c"+
		"\u000e\u0000\u07d0\u07ce\u0001\u0000\u0000\u0000\u07d0\u07cf\u0001\u0000"+
		"\u0000\u0000\u07d1\u00ad\u0001\u0000\u0000\u0000\u07d2\u07d3\u0007\u001b"+
		"\u0000\u0000\u07d3\u00af\u0001\u0000\u0000\u0000\u07d4\u07d5\u0007\u001c"+
		"\u0000\u0000\u07d5\u00b1\u0001\u0000\u0000\u0000\u07d6\u07d7\u0003\u00e0"+
		"p\u0000\u07d7\u00b3\u0001\u0000\u0000\u0000\u07d8\u07d9\u0003\u00e0p\u0000"+
		"\u07d9\u00b5\u0001\u0000\u0000\u0000\u07da\u07db\u0003\u00e0p\u0000\u07db"+
		"\u00b7\u0001\u0000\u0000\u0000\u07dc\u07dd\u0003\u00e0p\u0000\u07dd\u00b9"+
		"\u0001\u0000\u0000\u0000\u07de\u07df\u0003\u00e0p\u0000\u07df\u00bb\u0001"+
		"\u0000\u0000\u0000\u07e0\u07e1\u0003\u00e0p\u0000\u07e1\u00bd\u0001\u0000"+
		"\u0000\u0000\u07e2\u07e3\u0003\u00e0p\u0000\u07e3\u00bf\u0001\u0000\u0000"+
		"\u0000\u07e4\u07e5\u0003\u00e0p\u0000\u07e5\u00c1\u0001\u0000\u0000\u0000"+
		"\u07e6\u07e7\u0003\u00e0p\u0000\u07e7\u00c3\u0001\u0000\u0000\u0000\u07e8"+
		"\u07e9\u0003\u00e0p\u0000\u07e9\u00c5\u0001\u0000\u0000\u0000\u07ea\u07eb"+
		"\u0003\u00e0p\u0000\u07eb\u00c7\u0001\u0000\u0000\u0000\u07ec\u07ed\u0003"+
		"\u00e0p\u0000\u07ed\u00c9\u0001\u0000\u0000\u0000\u07ee\u07ef\u0003\u00e0"+
		"p\u0000\u07ef\u00cb\u0001\u0000\u0000\u0000\u07f0\u07f1\u0003\u00e0p\u0000"+
		"\u07f1\u00cd\u0001\u0000\u0000\u0000\u07f2\u07f3\u0003\u00e0p\u0000\u07f3"+
		"\u00cf\u0001\u0000\u0000\u0000\u07f4\u07f5\u0003\u00e0p\u0000\u07f5\u00d1"+
		"\u0001\u0000\u0000\u0000\u07f6\u07f7\u0003\u00e0p\u0000\u07f7\u00d3\u0001"+
		"\u0000\u0000\u0000\u07f8\u07f9\u0003\u00e0p\u0000\u07f9\u00d5\u0001\u0000"+
		"\u0000\u0000\u07fa\u07fb\u0003\u00e0p\u0000\u07fb\u00d7\u0001\u0000\u0000"+
		"\u0000\u07fc\u07fd\u0003\u00e0p\u0000\u07fd\u00d9\u0001\u0000\u0000\u0000"+
		"\u07fe\u07ff\u0003\u00e0p\u0000\u07ff\u00db\u0001\u0000\u0000\u0000\u0800"+
		"\u0801\u0003\u00e0p\u0000\u0801\u00dd\u0001\u0000\u0000\u0000\u0802\u0803"+
		"\u0003\u00e0p\u0000\u0803\u00df\u0001\u0000\u0000\u0000\u0804\u080c\u0005"+
		"\u00b9\u0000\u0000\u0805\u080c\u0003\u00b0X\u0000\u0806\u080c\u0005\u00bc"+
		"\u0000\u0000\u0807\u0808\u0005\u0003\u0000\u0000\u0808\u0809\u0003\u00e0"+
		"p\u0000\u0809\u080a\u0005\u0004\u0000\u0000\u080a\u080c\u0001\u0000\u0000"+
		"\u0000\u080b\u0804\u0001\u0000\u0000\u0000\u080b\u0805\u0001\u0000\u0000"+
		"\u0000\u080b\u0806\u0001\u0000\u0000\u0000\u080b\u0807\u0001\u0000\u0000"+
		"\u0000\u080c\u00e1\u0001\u0000\u0000\u0000\u0129\u00e5\u00ed\u00f4\u00f9"+
		"\u00ff\u0105\u0107\u0121\u0128\u012f\u0135\u0139\u013e\u0141\u0148\u014b"+
		"\u014f\u0157\u015b\u015d\u0161\u0165\u0169\u016c\u0173\u0179\u017f\u0184"+
		"\u018f\u0195\u0199\u019d\u01a0\u01a4\u01aa\u01af\u01b8\u01bf\u01c5\u01c9"+
		"\u01cd\u01d2\u01d8\u01e4\u01e8\u01ed\u01f0\u01f3\u01f6\u01fa\u01fd\u020b"+
		"\u0212\u0219\u021b\u021e\u0224\u0229\u0231\u0236\u0245\u024b\u0255\u025a"+
		"\u0264\u0268\u026a\u026e\u0273\u0275\u027d\u0283\u0288\u028f\u029a\u029d"+
		"\u029f\u02a6\u02aa\u02b1\u02b7\u02bd\u02c3\u02c8\u02d1\u02d6\u02e1\u02e6"+
		"\u02f1\u02f6\u02fa\u030a\u0314\u0319\u0321\u032d\u0332\u033a\u0341\u0344"+
		"\u0347\u034e\u0351\u0354\u0357\u035b\u0363\u0368\u0372\u0377\u0380\u0387"+
		"\u038b\u038f\u0392\u039a\u03a7\u03aa\u03b2\u03bb\u03bf\u03c4\u03df\u03e8"+
		"\u03f4\u03f9\u0405\u040b\u0412\u0416\u0420\u0423\u0429\u042f\u0438\u043b"+
		"\u043f\u0441\u0443\u044c\u0458\u0463\u0467\u046e\u0474\u0479\u0481\u0486"+
		"\u048a\u048d\u0491\u0494\u049c\u04a7\u04ad\u04af\u04b7\u04be\u04c5\u04ca"+
		"\u04cc\u04d2\u04db\u04e0\u04e7\u04eb\u04ed\u04f0\u04f8\u04fc\u04ff\u0505"+
		"\u0509\u050e\u0515\u051e\u0522\u0524\u0528\u0531\u0536\u0538\u0545\u0548"+
		"\u054b\u0550\u0554\u0557\u055a\u055f\u0563\u0568\u056b\u056e\u0573\u0577"+
		"\u057a\u0581\u0586\u058f\u0594\u0597\u059f\u05a3\u05ab\u05ae\u05b0\u05b9"+
		"\u05bc\u05be\u05c2\u05c6\u05ca\u05cd\u05d8\u05dd\u05e1\u05e5\u05e8\u05ed"+
		"\u05f3\u05fa\u0601\u060a\u060e\u0610\u0614\u0617\u061f\u0625\u062a\u0630"+
		"\u0637\u063e\u0643\u0646\u0649\u064c\u0651\u0656\u065d\u0661\u0665\u066f"+
		"\u0678\u067b\u0684\u0688\u0690\u0699\u069c\u06a5\u06a8\u06ab\u06ae\u06b8"+
		"\u06ba\u06c3\u06cc\u06d0\u06d7\u06de\u06e2\u06e6\u06ef\u06f3\u06f7\u06fc"+
		"\u0700\u0707\u0711\u0718\u071d\u0720\u0724\u0732\u073e\u0747\u0750\u0754"+
		"\u075e\u0761\u076a\u0773\u0776\u077c\u078a\u078e\u0799\u079e\u07ab\u07b2"+
		"\u07ba\u07bf\u07c3\u07d0\u080b";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}