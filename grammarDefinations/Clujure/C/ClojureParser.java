// Generated from Clojure.g4 by ANTLR 4.9.3
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ClojureParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, STRING=21, FLOAT=22, HEX=23, BIN=24, LONG=25, 
		BIGN=26, CHAR_U=27, CHAR_NAMED=28, CHAR_ANY=29, NIL=30, BOOLEAN=31, SYMBOL=32, 
		NS_SYMBOL=33, PARAM_NAME=34, TRASH=35;
	public static final int
		RULE_file_ = 0, RULE_form = 1, RULE_forms = 2, RULE_list_ = 3, RULE_vector = 4, 
		RULE_map_ = 5, RULE_set_ = 6, RULE_reader_macro = 7, RULE_quote = 8, RULE_backtick = 9, 
		RULE_unquote = 10, RULE_unquote_splicing = 11, RULE_tag = 12, RULE_deref = 13, 
		RULE_gensym = 14, RULE_lambda_ = 15, RULE_meta_data = 16, RULE_var_quote = 17, 
		RULE_host_expr = 18, RULE_discard = 19, RULE_dispatch = 20, RULE_regex = 21, 
		RULE_literal = 22, RULE_string_ = 23, RULE_hex_ = 24, RULE_bin_ = 25, 
		RULE_bign = 26, RULE_number = 27, RULE_character = 28, RULE_named_char = 29, 
		RULE_any_char = 30, RULE_u_hex_quad = 31, RULE_nil_ = 32, RULE_keyword = 33, 
		RULE_simple_keyword = 34, RULE_macro_keyword = 35, RULE_symbol = 36, RULE_simple_sym = 37, 
		RULE_ns_symbol = 38, RULE_param_name = 39;
	private static String[] makeRuleNames() {
		return new String[] {
			"file_", "form", "forms", "list_", "vector", "map_", "set_", "reader_macro", 
			"quote", "backtick", "unquote", "unquote_splicing", "tag", "deref", "gensym", 
			"lambda_", "meta_data", "var_quote", "host_expr", "discard", "dispatch", 
			"regex", "literal", "string_", "hex_", "bin_", "bign", "number", "character", 
			"named_char", "any_char", "u_hex_quad", "nil_", "keyword", "simple_keyword", 
			"macro_keyword", "symbol", "simple_sym", "ns_symbol", "param_name"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "'['", "']'", "'{'", "'}'", "'#{'", "'''", "'`'", 
			"'~'", "'~@'", "'^'", "'@'", "'#'", "'#('", "'#^'", "'#''", "'#+'", "'#_'", 
			"':'", null, null, null, null, null, null, null, null, null, "'nil'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, "STRING", "FLOAT", 
			"HEX", "BIN", "LONG", "BIGN", "CHAR_U", "CHAR_NAMED", "CHAR_ANY", "NIL", 
			"BOOLEAN", "SYMBOL", "NS_SYMBOL", "PARAM_NAME", "TRASH"
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
	public String getGrammarFileName() { return "Clojure.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ClojureParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class File_Context extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(ClojureParser.EOF, 0); }
		public List<FormContext> form() {
			return getRuleContexts(FormContext.class);
		}
		public FormContext form(int i) {
			return getRuleContext(FormContext.class,i);
		}
		public File_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_file_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).enterFile_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).exitFile_(this);
		}
	}

	public final File_Context file_() throws RecognitionException {
		File_Context _localctx = new File_Context(_ctx, getState());
		enterRule(_localctx, 0, RULE_file_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(83);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__2) | (1L << T__4) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << STRING) | (1L << FLOAT) | (1L << HEX) | (1L << BIN) | (1L << LONG) | (1L << BIGN) | (1L << CHAR_U) | (1L << CHAR_NAMED) | (1L << CHAR_ANY) | (1L << NIL) | (1L << BOOLEAN) | (1L << SYMBOL) | (1L << NS_SYMBOL) | (1L << PARAM_NAME))) != 0)) {
				{
				{
				setState(80);
				form();
				}
				}
				setState(85);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(86);
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

	public static class FormContext extends ParserRuleContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public List_Context list_() {
			return getRuleContext(List_Context.class,0);
		}
		public VectorContext vector() {
			return getRuleContext(VectorContext.class,0);
		}
		public Map_Context map_() {
			return getRuleContext(Map_Context.class,0);
		}
		public Reader_macroContext reader_macro() {
			return getRuleContext(Reader_macroContext.class,0);
		}
		public FormContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_form; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).enterForm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).exitForm(this);
		}
	}

	public final FormContext form() throws RecognitionException {
		FormContext _localctx = new FormContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_form);
		try {
			setState(93);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(88);
				literal();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(89);
				list_();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(90);
				vector();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(91);
				map_();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(92);
				reader_macro();
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

	public static class FormsContext extends ParserRuleContext {
		public List<FormContext> form() {
			return getRuleContexts(FormContext.class);
		}
		public FormContext form(int i) {
			return getRuleContext(FormContext.class,i);
		}
		public FormsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forms; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).enterForms(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).exitForms(this);
		}
	}

	public final FormsContext forms() throws RecognitionException {
		FormsContext _localctx = new FormsContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_forms);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(98);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__2) | (1L << T__4) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << STRING) | (1L << FLOAT) | (1L << HEX) | (1L << BIN) | (1L << LONG) | (1L << BIGN) | (1L << CHAR_U) | (1L << CHAR_NAMED) | (1L << CHAR_ANY) | (1L << NIL) | (1L << BOOLEAN) | (1L << SYMBOL) | (1L << NS_SYMBOL) | (1L << PARAM_NAME))) != 0)) {
				{
				{
				setState(95);
				form();
				}
				}
				setState(100);
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

	public static class List_Context extends ParserRuleContext {
		public FormsContext forms() {
			return getRuleContext(FormsContext.class,0);
		}
		public List_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).enterList_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).exitList_(this);
		}
	}

	public final List_Context list_() throws RecognitionException {
		List_Context _localctx = new List_Context(_ctx, getState());
		enterRule(_localctx, 6, RULE_list_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
			match(T__0);
			setState(102);
			forms();
			setState(103);
			match(T__1);
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

	public static class VectorContext extends ParserRuleContext {
		public FormsContext forms() {
			return getRuleContext(FormsContext.class,0);
		}
		public VectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vector; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).enterVector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).exitVector(this);
		}
	}

	public final VectorContext vector() throws RecognitionException {
		VectorContext _localctx = new VectorContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_vector);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(105);
			match(T__2);
			setState(106);
			forms();
			setState(107);
			match(T__3);
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

	public static class Map_Context extends ParserRuleContext {
		public List<FormContext> form() {
			return getRuleContexts(FormContext.class);
		}
		public FormContext form(int i) {
			return getRuleContext(FormContext.class,i);
		}
		public Map_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_map_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).enterMap_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).exitMap_(this);
		}
	}

	public final Map_Context map_() throws RecognitionException {
		Map_Context _localctx = new Map_Context(_ctx, getState());
		enterRule(_localctx, 10, RULE_map_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(109);
			match(T__4);
			setState(115);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__2) | (1L << T__4) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << STRING) | (1L << FLOAT) | (1L << HEX) | (1L << BIN) | (1L << LONG) | (1L << BIGN) | (1L << CHAR_U) | (1L << CHAR_NAMED) | (1L << CHAR_ANY) | (1L << NIL) | (1L << BOOLEAN) | (1L << SYMBOL) | (1L << NS_SYMBOL) | (1L << PARAM_NAME))) != 0)) {
				{
				{
				setState(110);
				form();
				setState(111);
				form();
				}
				}
				setState(117);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(118);
			match(T__5);
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

	public static class Set_Context extends ParserRuleContext {
		public FormsContext forms() {
			return getRuleContext(FormsContext.class,0);
		}
		public Set_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_set_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).enterSet_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).exitSet_(this);
		}
	}

	public final Set_Context set_() throws RecognitionException {
		Set_Context _localctx = new Set_Context(_ctx, getState());
		enterRule(_localctx, 12, RULE_set_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			match(T__6);
			setState(121);
			forms();
			setState(122);
			match(T__5);
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

	public static class Reader_macroContext extends ParserRuleContext {
		public Lambda_Context lambda_() {
			return getRuleContext(Lambda_Context.class,0);
		}
		public Meta_dataContext meta_data() {
			return getRuleContext(Meta_dataContext.class,0);
		}
		public RegexContext regex() {
			return getRuleContext(RegexContext.class,0);
		}
		public Var_quoteContext var_quote() {
			return getRuleContext(Var_quoteContext.class,0);
		}
		public Host_exprContext host_expr() {
			return getRuleContext(Host_exprContext.class,0);
		}
		public Set_Context set_() {
			return getRuleContext(Set_Context.class,0);
		}
		public TagContext tag() {
			return getRuleContext(TagContext.class,0);
		}
		public DiscardContext discard() {
			return getRuleContext(DiscardContext.class,0);
		}
		public DispatchContext dispatch() {
			return getRuleContext(DispatchContext.class,0);
		}
		public DerefContext deref() {
			return getRuleContext(DerefContext.class,0);
		}
		public QuoteContext quote() {
			return getRuleContext(QuoteContext.class,0);
		}
		public BacktickContext backtick() {
			return getRuleContext(BacktickContext.class,0);
		}
		public UnquoteContext unquote() {
			return getRuleContext(UnquoteContext.class,0);
		}
		public Unquote_splicingContext unquote_splicing() {
			return getRuleContext(Unquote_splicingContext.class,0);
		}
		public GensymContext gensym() {
			return getRuleContext(GensymContext.class,0);
		}
		public Reader_macroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_reader_macro; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).enterReader_macro(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).exitReader_macro(this);
		}
	}

	public final Reader_macroContext reader_macro() throws RecognitionException {
		Reader_macroContext _localctx = new Reader_macroContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_reader_macro);
		try {
			setState(139);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(124);
				lambda_();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(125);
				meta_data();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(126);
				regex();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(127);
				var_quote();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(128);
				host_expr();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(129);
				set_();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(130);
				tag();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(131);
				discard();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(132);
				dispatch();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(133);
				deref();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(134);
				quote();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(135);
				backtick();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(136);
				unquote();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(137);
				unquote_splicing();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(138);
				gensym();
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

	public static class QuoteContext extends ParserRuleContext {
		public FormContext form() {
			return getRuleContext(FormContext.class,0);
		}
		public QuoteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_quote; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).enterQuote(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).exitQuote(this);
		}
	}

	public final QuoteContext quote() throws RecognitionException {
		QuoteContext _localctx = new QuoteContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_quote);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(141);
			match(T__7);
			setState(142);
			form();
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

	public static class BacktickContext extends ParserRuleContext {
		public FormContext form() {
			return getRuleContext(FormContext.class,0);
		}
		public BacktickContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_backtick; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).enterBacktick(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).exitBacktick(this);
		}
	}

	public final BacktickContext backtick() throws RecognitionException {
		BacktickContext _localctx = new BacktickContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_backtick);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(144);
			match(T__8);
			setState(145);
			form();
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

	public static class UnquoteContext extends ParserRuleContext {
		public FormContext form() {
			return getRuleContext(FormContext.class,0);
		}
		public UnquoteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unquote; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).enterUnquote(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).exitUnquote(this);
		}
	}

	public final UnquoteContext unquote() throws RecognitionException {
		UnquoteContext _localctx = new UnquoteContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_unquote);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(147);
			match(T__9);
			setState(148);
			form();
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

	public static class Unquote_splicingContext extends ParserRuleContext {
		public FormContext form() {
			return getRuleContext(FormContext.class,0);
		}
		public Unquote_splicingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unquote_splicing; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).enterUnquote_splicing(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).exitUnquote_splicing(this);
		}
	}

	public final Unquote_splicingContext unquote_splicing() throws RecognitionException {
		Unquote_splicingContext _localctx = new Unquote_splicingContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_unquote_splicing);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(150);
			match(T__10);
			setState(151);
			form();
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

	public static class TagContext extends ParserRuleContext {
		public List<FormContext> form() {
			return getRuleContexts(FormContext.class);
		}
		public FormContext form(int i) {
			return getRuleContext(FormContext.class,i);
		}
		public TagContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tag; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).enterTag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).exitTag(this);
		}
	}

	public final TagContext tag() throws RecognitionException {
		TagContext _localctx = new TagContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_tag);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(153);
			match(T__11);
			setState(154);
			form();
			setState(155);
			form();
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

	public static class DerefContext extends ParserRuleContext {
		public FormContext form() {
			return getRuleContext(FormContext.class,0);
		}
		public DerefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_deref; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).enterDeref(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).exitDeref(this);
		}
	}

	public final DerefContext deref() throws RecognitionException {
		DerefContext _localctx = new DerefContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_deref);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(157);
			match(T__12);
			setState(158);
			form();
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

	public static class GensymContext extends ParserRuleContext {
		public TerminalNode SYMBOL() { return getToken(ClojureParser.SYMBOL, 0); }
		public GensymContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gensym; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).enterGensym(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).exitGensym(this);
		}
	}

	public final GensymContext gensym() throws RecognitionException {
		GensymContext _localctx = new GensymContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_gensym);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(160);
			match(SYMBOL);
			setState(161);
			match(T__13);
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

	public static class Lambda_Context extends ParserRuleContext {
		public List<FormContext> form() {
			return getRuleContexts(FormContext.class);
		}
		public FormContext form(int i) {
			return getRuleContext(FormContext.class,i);
		}
		public Lambda_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lambda_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).enterLambda_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).exitLambda_(this);
		}
	}

	public final Lambda_Context lambda_() throws RecognitionException {
		Lambda_Context _localctx = new Lambda_Context(_ctx, getState());
		enterRule(_localctx, 30, RULE_lambda_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(163);
			match(T__14);
			setState(167);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__2) | (1L << T__4) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << STRING) | (1L << FLOAT) | (1L << HEX) | (1L << BIN) | (1L << LONG) | (1L << BIGN) | (1L << CHAR_U) | (1L << CHAR_NAMED) | (1L << CHAR_ANY) | (1L << NIL) | (1L << BOOLEAN) | (1L << SYMBOL) | (1L << NS_SYMBOL) | (1L << PARAM_NAME))) != 0)) {
				{
				{
				setState(164);
				form();
				}
				}
				setState(169);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(170);
			match(T__1);
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

	public static class Meta_dataContext extends ParserRuleContext {
		public Map_Context map_() {
			return getRuleContext(Map_Context.class,0);
		}
		public FormContext form() {
			return getRuleContext(FormContext.class,0);
		}
		public Meta_dataContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_meta_data; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).enterMeta_data(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).exitMeta_data(this);
		}
	}

	public final Meta_dataContext meta_data() throws RecognitionException {
		Meta_dataContext _localctx = new Meta_dataContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_meta_data);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(172);
			match(T__15);
			setState(177);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(173);
				map_();
				setState(174);
				form();
				}
				break;
			case 2:
				{
				setState(176);
				form();
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

	public static class Var_quoteContext extends ParserRuleContext {
		public SymbolContext symbol() {
			return getRuleContext(SymbolContext.class,0);
		}
		public Var_quoteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_quote; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).enterVar_quote(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).exitVar_quote(this);
		}
	}

	public final Var_quoteContext var_quote() throws RecognitionException {
		Var_quoteContext _localctx = new Var_quoteContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_var_quote);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(179);
			match(T__16);
			setState(180);
			symbol();
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

	public static class Host_exprContext extends ParserRuleContext {
		public List<FormContext> form() {
			return getRuleContexts(FormContext.class);
		}
		public FormContext form(int i) {
			return getRuleContext(FormContext.class,i);
		}
		public Host_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_host_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).enterHost_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).exitHost_expr(this);
		}
	}

	public final Host_exprContext host_expr() throws RecognitionException {
		Host_exprContext _localctx = new Host_exprContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_host_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(182);
			match(T__17);
			setState(183);
			form();
			setState(184);
			form();
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

	public static class DiscardContext extends ParserRuleContext {
		public FormContext form() {
			return getRuleContext(FormContext.class,0);
		}
		public DiscardContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_discard; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).enterDiscard(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).exitDiscard(this);
		}
	}

	public final DiscardContext discard() throws RecognitionException {
		DiscardContext _localctx = new DiscardContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_discard);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(186);
			match(T__18);
			setState(187);
			form();
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

	public static class DispatchContext extends ParserRuleContext {
		public SymbolContext symbol() {
			return getRuleContext(SymbolContext.class,0);
		}
		public FormContext form() {
			return getRuleContext(FormContext.class,0);
		}
		public DispatchContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dispatch; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).enterDispatch(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).exitDispatch(this);
		}
	}

	public final DispatchContext dispatch() throws RecognitionException {
		DispatchContext _localctx = new DispatchContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_dispatch);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(189);
			match(T__13);
			setState(190);
			symbol();
			setState(191);
			form();
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

	public static class RegexContext extends ParserRuleContext {
		public String_Context string_() {
			return getRuleContext(String_Context.class,0);
		}
		public RegexContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_regex; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).enterRegex(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).exitRegex(this);
		}
	}

	public final RegexContext regex() throws RecognitionException {
		RegexContext _localctx = new RegexContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_regex);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(193);
			match(T__13);
			setState(194);
			string_();
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

	public static class LiteralContext extends ParserRuleContext {
		public String_Context string_() {
			return getRuleContext(String_Context.class,0);
		}
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public CharacterContext character() {
			return getRuleContext(CharacterContext.class,0);
		}
		public Nil_Context nil_() {
			return getRuleContext(Nil_Context.class,0);
		}
		public TerminalNode BOOLEAN() { return getToken(ClojureParser.BOOLEAN, 0); }
		public KeywordContext keyword() {
			return getRuleContext(KeywordContext.class,0);
		}
		public SymbolContext symbol() {
			return getRuleContext(SymbolContext.class,0);
		}
		public Param_nameContext param_name() {
			return getRuleContext(Param_nameContext.class,0);
		}
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).exitLiteral(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_literal);
		try {
			setState(204);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(196);
				string_();
				}
				break;
			case FLOAT:
			case HEX:
			case BIN:
			case LONG:
			case BIGN:
				enterOuterAlt(_localctx, 2);
				{
				setState(197);
				number();
				}
				break;
			case CHAR_U:
			case CHAR_NAMED:
			case CHAR_ANY:
				enterOuterAlt(_localctx, 3);
				{
				setState(198);
				character();
				}
				break;
			case NIL:
				enterOuterAlt(_localctx, 4);
				{
				setState(199);
				nil_();
				}
				break;
			case BOOLEAN:
				enterOuterAlt(_localctx, 5);
				{
				setState(200);
				match(BOOLEAN);
				}
				break;
			case T__19:
				enterOuterAlt(_localctx, 6);
				{
				setState(201);
				keyword();
				}
				break;
			case SYMBOL:
			case NS_SYMBOL:
				enterOuterAlt(_localctx, 7);
				{
				setState(202);
				symbol();
				}
				break;
			case PARAM_NAME:
				enterOuterAlt(_localctx, 8);
				{
				setState(203);
				param_name();
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

	public static class String_Context extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(ClojureParser.STRING, 0); }
		public String_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).enterString_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).exitString_(this);
		}
	}

	public final String_Context string_() throws RecognitionException {
		String_Context _localctx = new String_Context(_ctx, getState());
		enterRule(_localctx, 46, RULE_string_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(206);
			match(STRING);
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

	public static class Hex_Context extends ParserRuleContext {
		public TerminalNode HEX() { return getToken(ClojureParser.HEX, 0); }
		public Hex_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hex_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).enterHex_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).exitHex_(this);
		}
	}

	public final Hex_Context hex_() throws RecognitionException {
		Hex_Context _localctx = new Hex_Context(_ctx, getState());
		enterRule(_localctx, 48, RULE_hex_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(208);
			match(HEX);
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

	public static class Bin_Context extends ParserRuleContext {
		public TerminalNode BIN() { return getToken(ClojureParser.BIN, 0); }
		public Bin_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bin_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).enterBin_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).exitBin_(this);
		}
	}

	public final Bin_Context bin_() throws RecognitionException {
		Bin_Context _localctx = new Bin_Context(_ctx, getState());
		enterRule(_localctx, 50, RULE_bin_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(210);
			match(BIN);
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

	public static class BignContext extends ParserRuleContext {
		public TerminalNode BIGN() { return getToken(ClojureParser.BIGN, 0); }
		public BignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).enterBign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).exitBign(this);
		}
	}

	public final BignContext bign() throws RecognitionException {
		BignContext _localctx = new BignContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_bign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(212);
			match(BIGN);
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

	public static class NumberContext extends ParserRuleContext {
		public TerminalNode FLOAT() { return getToken(ClojureParser.FLOAT, 0); }
		public Hex_Context hex_() {
			return getRuleContext(Hex_Context.class,0);
		}
		public Bin_Context bin_() {
			return getRuleContext(Bin_Context.class,0);
		}
		public BignContext bign() {
			return getRuleContext(BignContext.class,0);
		}
		public TerminalNode LONG() { return getToken(ClojureParser.LONG, 0); }
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).enterNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).exitNumber(this);
		}
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_number);
		try {
			setState(219);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FLOAT:
				enterOuterAlt(_localctx, 1);
				{
				setState(214);
				match(FLOAT);
				}
				break;
			case HEX:
				enterOuterAlt(_localctx, 2);
				{
				setState(215);
				hex_();
				}
				break;
			case BIN:
				enterOuterAlt(_localctx, 3);
				{
				setState(216);
				bin_();
				}
				break;
			case BIGN:
				enterOuterAlt(_localctx, 4);
				{
				setState(217);
				bign();
				}
				break;
			case LONG:
				enterOuterAlt(_localctx, 5);
				{
				setState(218);
				match(LONG);
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

	public static class CharacterContext extends ParserRuleContext {
		public Named_charContext named_char() {
			return getRuleContext(Named_charContext.class,0);
		}
		public U_hex_quadContext u_hex_quad() {
			return getRuleContext(U_hex_quadContext.class,0);
		}
		public Any_charContext any_char() {
			return getRuleContext(Any_charContext.class,0);
		}
		public CharacterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_character; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).enterCharacter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).exitCharacter(this);
		}
	}

	public final CharacterContext character() throws RecognitionException {
		CharacterContext _localctx = new CharacterContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_character);
		try {
			setState(224);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CHAR_NAMED:
				enterOuterAlt(_localctx, 1);
				{
				setState(221);
				named_char();
				}
				break;
			case CHAR_U:
				enterOuterAlt(_localctx, 2);
				{
				setState(222);
				u_hex_quad();
				}
				break;
			case CHAR_ANY:
				enterOuterAlt(_localctx, 3);
				{
				setState(223);
				any_char();
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

	public static class Named_charContext extends ParserRuleContext {
		public TerminalNode CHAR_NAMED() { return getToken(ClojureParser.CHAR_NAMED, 0); }
		public Named_charContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_named_char; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).enterNamed_char(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).exitNamed_char(this);
		}
	}

	public final Named_charContext named_char() throws RecognitionException {
		Named_charContext _localctx = new Named_charContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_named_char);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(226);
			match(CHAR_NAMED);
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

	public static class Any_charContext extends ParserRuleContext {
		public TerminalNode CHAR_ANY() { return getToken(ClojureParser.CHAR_ANY, 0); }
		public Any_charContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_any_char; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).enterAny_char(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).exitAny_char(this);
		}
	}

	public final Any_charContext any_char() throws RecognitionException {
		Any_charContext _localctx = new Any_charContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_any_char);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(228);
			match(CHAR_ANY);
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

	public static class U_hex_quadContext extends ParserRuleContext {
		public TerminalNode CHAR_U() { return getToken(ClojureParser.CHAR_U, 0); }
		public U_hex_quadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_u_hex_quad; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).enterU_hex_quad(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).exitU_hex_quad(this);
		}
	}

	public final U_hex_quadContext u_hex_quad() throws RecognitionException {
		U_hex_quadContext _localctx = new U_hex_quadContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_u_hex_quad);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(230);
			match(CHAR_U);
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

	public static class Nil_Context extends ParserRuleContext {
		public TerminalNode NIL() { return getToken(ClojureParser.NIL, 0); }
		public Nil_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nil_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).enterNil_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).exitNil_(this);
		}
	}

	public final Nil_Context nil_() throws RecognitionException {
		Nil_Context _localctx = new Nil_Context(_ctx, getState());
		enterRule(_localctx, 64, RULE_nil_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(232);
			match(NIL);
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

	public static class KeywordContext extends ParserRuleContext {
		public Macro_keywordContext macro_keyword() {
			return getRuleContext(Macro_keywordContext.class,0);
		}
		public Simple_keywordContext simple_keyword() {
			return getRuleContext(Simple_keywordContext.class,0);
		}
		public KeywordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keyword; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).enterKeyword(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).exitKeyword(this);
		}
	}

	public final KeywordContext keyword() throws RecognitionException {
		KeywordContext _localctx = new KeywordContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_keyword);
		try {
			setState(236);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(234);
				macro_keyword();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(235);
				simple_keyword();
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

	public static class Simple_keywordContext extends ParserRuleContext {
		public SymbolContext symbol() {
			return getRuleContext(SymbolContext.class,0);
		}
		public Simple_keywordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simple_keyword; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).enterSimple_keyword(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).exitSimple_keyword(this);
		}
	}

	public final Simple_keywordContext simple_keyword() throws RecognitionException {
		Simple_keywordContext _localctx = new Simple_keywordContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_simple_keyword);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(238);
			match(T__19);
			setState(239);
			symbol();
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

	public static class Macro_keywordContext extends ParserRuleContext {
		public SymbolContext symbol() {
			return getRuleContext(SymbolContext.class,0);
		}
		public Macro_keywordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_macro_keyword; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).enterMacro_keyword(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).exitMacro_keyword(this);
		}
	}

	public final Macro_keywordContext macro_keyword() throws RecognitionException {
		Macro_keywordContext _localctx = new Macro_keywordContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_macro_keyword);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(241);
			match(T__19);
			setState(242);
			match(T__19);
			setState(243);
			symbol();
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

	public static class SymbolContext extends ParserRuleContext {
		public Ns_symbolContext ns_symbol() {
			return getRuleContext(Ns_symbolContext.class,0);
		}
		public Simple_symContext simple_sym() {
			return getRuleContext(Simple_symContext.class,0);
		}
		public SymbolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_symbol; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).enterSymbol(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).exitSymbol(this);
		}
	}

	public final SymbolContext symbol() throws RecognitionException {
		SymbolContext _localctx = new SymbolContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_symbol);
		try {
			setState(247);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NS_SYMBOL:
				enterOuterAlt(_localctx, 1);
				{
				setState(245);
				ns_symbol();
				}
				break;
			case SYMBOL:
				enterOuterAlt(_localctx, 2);
				{
				setState(246);
				simple_sym();
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

	public static class Simple_symContext extends ParserRuleContext {
		public TerminalNode SYMBOL() { return getToken(ClojureParser.SYMBOL, 0); }
		public Simple_symContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simple_sym; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).enterSimple_sym(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).exitSimple_sym(this);
		}
	}

	public final Simple_symContext simple_sym() throws RecognitionException {
		Simple_symContext _localctx = new Simple_symContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_simple_sym);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(249);
			match(SYMBOL);
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

	public static class Ns_symbolContext extends ParserRuleContext {
		public TerminalNode NS_SYMBOL() { return getToken(ClojureParser.NS_SYMBOL, 0); }
		public Ns_symbolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ns_symbol; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).enterNs_symbol(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).exitNs_symbol(this);
		}
	}

	public final Ns_symbolContext ns_symbol() throws RecognitionException {
		Ns_symbolContext _localctx = new Ns_symbolContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_ns_symbol);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(251);
			match(NS_SYMBOL);
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

	public static class Param_nameContext extends ParserRuleContext {
		public TerminalNode PARAM_NAME() { return getToken(ClojureParser.PARAM_NAME, 0); }
		public Param_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).enterParam_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).exitParam_name(this);
		}
	}

	public final Param_nameContext param_name() throws RecognitionException {
		Param_nameContext _localctx = new Param_nameContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_param_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(253);
			match(PARAM_NAME);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3%\u0102\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\3\2\7\2T\n\2\f"+
		"\2\16\2W\13\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\5\3`\n\3\3\4\7\4c\n\4\f\4\16"+
		"\4f\13\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\7\7t\n\7\f\7"+
		"\16\7w\13\7\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u008e\n\t\3\n\3\n\3\n\3\13\3\13\3\13\3"+
		"\f\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3"+
		"\20\3\21\3\21\7\21\u00a8\n\21\f\21\16\21\u00ab\13\21\3\21\3\21\3\22\3"+
		"\22\3\22\3\22\3\22\5\22\u00b4\n\22\3\23\3\23\3\23\3\24\3\24\3\24\3\24"+
		"\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\5\30\u00cf\n\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34"+
		"\3\34\3\35\3\35\3\35\3\35\3\35\5\35\u00de\n\35\3\36\3\36\3\36\5\36\u00e3"+
		"\n\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#\5#\u00ef\n#\3$\3$\3$\3%\3%\3"+
		"%\3%\3&\3&\5&\u00fa\n&\3\'\3\'\3(\3(\3)\3)\3)\2\2*\2\4\6\b\n\f\16\20\22"+
		"\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNP\2\2\2\u00ff\2U\3"+
		"\2\2\2\4_\3\2\2\2\6d\3\2\2\2\bg\3\2\2\2\nk\3\2\2\2\fo\3\2\2\2\16z\3\2"+
		"\2\2\20\u008d\3\2\2\2\22\u008f\3\2\2\2\24\u0092\3\2\2\2\26\u0095\3\2\2"+
		"\2\30\u0098\3\2\2\2\32\u009b\3\2\2\2\34\u009f\3\2\2\2\36\u00a2\3\2\2\2"+
		" \u00a5\3\2\2\2\"\u00ae\3\2\2\2$\u00b5\3\2\2\2&\u00b8\3\2\2\2(\u00bc\3"+
		"\2\2\2*\u00bf\3\2\2\2,\u00c3\3\2\2\2.\u00ce\3\2\2\2\60\u00d0\3\2\2\2\62"+
		"\u00d2\3\2\2\2\64\u00d4\3\2\2\2\66\u00d6\3\2\2\28\u00dd\3\2\2\2:\u00e2"+
		"\3\2\2\2<\u00e4\3\2\2\2>\u00e6\3\2\2\2@\u00e8\3\2\2\2B\u00ea\3\2\2\2D"+
		"\u00ee\3\2\2\2F\u00f0\3\2\2\2H\u00f3\3\2\2\2J\u00f9\3\2\2\2L\u00fb\3\2"+
		"\2\2N\u00fd\3\2\2\2P\u00ff\3\2\2\2RT\5\4\3\2SR\3\2\2\2TW\3\2\2\2US\3\2"+
		"\2\2UV\3\2\2\2VX\3\2\2\2WU\3\2\2\2XY\7\2\2\3Y\3\3\2\2\2Z`\5.\30\2[`\5"+
		"\b\5\2\\`\5\n\6\2]`\5\f\7\2^`\5\20\t\2_Z\3\2\2\2_[\3\2\2\2_\\\3\2\2\2"+
		"_]\3\2\2\2_^\3\2\2\2`\5\3\2\2\2ac\5\4\3\2ba\3\2\2\2cf\3\2\2\2db\3\2\2"+
		"\2de\3\2\2\2e\7\3\2\2\2fd\3\2\2\2gh\7\3\2\2hi\5\6\4\2ij\7\4\2\2j\t\3\2"+
		"\2\2kl\7\5\2\2lm\5\6\4\2mn\7\6\2\2n\13\3\2\2\2ou\7\7\2\2pq\5\4\3\2qr\5"+
		"\4\3\2rt\3\2\2\2sp\3\2\2\2tw\3\2\2\2us\3\2\2\2uv\3\2\2\2vx\3\2\2\2wu\3"+
		"\2\2\2xy\7\b\2\2y\r\3\2\2\2z{\7\t\2\2{|\5\6\4\2|}\7\b\2\2}\17\3\2\2\2"+
		"~\u008e\5 \21\2\177\u008e\5\"\22\2\u0080\u008e\5,\27\2\u0081\u008e\5$"+
		"\23\2\u0082\u008e\5&\24\2\u0083\u008e\5\16\b\2\u0084\u008e\5\32\16\2\u0085"+
		"\u008e\5(\25\2\u0086\u008e\5*\26\2\u0087\u008e\5\34\17\2\u0088\u008e\5"+
		"\22\n\2\u0089\u008e\5\24\13\2\u008a\u008e\5\26\f\2\u008b\u008e\5\30\r"+
		"\2\u008c\u008e\5\36\20\2\u008d~\3\2\2\2\u008d\177\3\2\2\2\u008d\u0080"+
		"\3\2\2\2\u008d\u0081\3\2\2\2\u008d\u0082\3\2\2\2\u008d\u0083\3\2\2\2\u008d"+
		"\u0084\3\2\2\2\u008d\u0085\3\2\2\2\u008d\u0086\3\2\2\2\u008d\u0087\3\2"+
		"\2\2\u008d\u0088\3\2\2\2\u008d\u0089\3\2\2\2\u008d\u008a\3\2\2\2\u008d"+
		"\u008b\3\2\2\2\u008d\u008c\3\2\2\2\u008e\21\3\2\2\2\u008f\u0090\7\n\2"+
		"\2\u0090\u0091\5\4\3\2\u0091\23\3\2\2\2\u0092\u0093\7\13\2\2\u0093\u0094"+
		"\5\4\3\2\u0094\25\3\2\2\2\u0095\u0096\7\f\2\2\u0096\u0097\5\4\3\2\u0097"+
		"\27\3\2\2\2\u0098\u0099\7\r\2\2\u0099\u009a\5\4\3\2\u009a\31\3\2\2\2\u009b"+
		"\u009c\7\16\2\2\u009c\u009d\5\4\3\2\u009d\u009e\5\4\3\2\u009e\33\3\2\2"+
		"\2\u009f\u00a0\7\17\2\2\u00a0\u00a1\5\4\3\2\u00a1\35\3\2\2\2\u00a2\u00a3"+
		"\7\"\2\2\u00a3\u00a4\7\20\2\2\u00a4\37\3\2\2\2\u00a5\u00a9\7\21\2\2\u00a6"+
		"\u00a8\5\4\3\2\u00a7\u00a6\3\2\2\2\u00a8\u00ab\3\2\2\2\u00a9\u00a7\3\2"+
		"\2\2\u00a9\u00aa\3\2\2\2\u00aa\u00ac\3\2\2\2\u00ab\u00a9\3\2\2\2\u00ac"+
		"\u00ad\7\4\2\2\u00ad!\3\2\2\2\u00ae\u00b3\7\22\2\2\u00af\u00b0\5\f\7\2"+
		"\u00b0\u00b1\5\4\3\2\u00b1\u00b4\3\2\2\2\u00b2\u00b4\5\4\3\2\u00b3\u00af"+
		"\3\2\2\2\u00b3\u00b2\3\2\2\2\u00b4#\3\2\2\2\u00b5\u00b6\7\23\2\2\u00b6"+
		"\u00b7\5J&\2\u00b7%\3\2\2\2\u00b8\u00b9\7\24\2\2\u00b9\u00ba\5\4\3\2\u00ba"+
		"\u00bb\5\4\3\2\u00bb\'\3\2\2\2\u00bc\u00bd\7\25\2\2\u00bd\u00be\5\4\3"+
		"\2\u00be)\3\2\2\2\u00bf\u00c0\7\20\2\2\u00c0\u00c1\5J&\2\u00c1\u00c2\5"+
		"\4\3\2\u00c2+\3\2\2\2\u00c3\u00c4\7\20\2\2\u00c4\u00c5\5\60\31\2\u00c5"+
		"-\3\2\2\2\u00c6\u00cf\5\60\31\2\u00c7\u00cf\58\35\2\u00c8\u00cf\5:\36"+
		"\2\u00c9\u00cf\5B\"\2\u00ca\u00cf\7!\2\2\u00cb\u00cf\5D#\2\u00cc\u00cf"+
		"\5J&\2\u00cd\u00cf\5P)\2\u00ce\u00c6\3\2\2\2\u00ce\u00c7\3\2\2\2\u00ce"+
		"\u00c8\3\2\2\2\u00ce\u00c9\3\2\2\2\u00ce\u00ca\3\2\2\2\u00ce\u00cb\3\2"+
		"\2\2\u00ce\u00cc\3\2\2\2\u00ce\u00cd\3\2\2\2\u00cf/\3\2\2\2\u00d0\u00d1"+
		"\7\27\2\2\u00d1\61\3\2\2\2\u00d2\u00d3\7\31\2\2\u00d3\63\3\2\2\2\u00d4"+
		"\u00d5\7\32\2\2\u00d5\65\3\2\2\2\u00d6\u00d7\7\34\2\2\u00d7\67\3\2\2\2"+
		"\u00d8\u00de\7\30\2\2\u00d9\u00de\5\62\32\2\u00da\u00de\5\64\33\2\u00db"+
		"\u00de\5\66\34\2\u00dc\u00de\7\33\2\2\u00dd\u00d8\3\2\2\2\u00dd\u00d9"+
		"\3\2\2\2\u00dd\u00da\3\2\2\2\u00dd\u00db\3\2\2\2\u00dd\u00dc\3\2\2\2\u00de"+
		"9\3\2\2\2\u00df\u00e3\5<\37\2\u00e0\u00e3\5@!\2\u00e1\u00e3\5> \2\u00e2"+
		"\u00df\3\2\2\2\u00e2\u00e0\3\2\2\2\u00e2\u00e1\3\2\2\2\u00e3;\3\2\2\2"+
		"\u00e4\u00e5\7\36\2\2\u00e5=\3\2\2\2\u00e6\u00e7\7\37\2\2\u00e7?\3\2\2"+
		"\2\u00e8\u00e9\7\35\2\2\u00e9A\3\2\2\2\u00ea\u00eb\7 \2\2\u00ebC\3\2\2"+
		"\2\u00ec\u00ef\5H%\2\u00ed\u00ef\5F$\2\u00ee\u00ec\3\2\2\2\u00ee\u00ed"+
		"\3\2\2\2\u00efE\3\2\2\2\u00f0\u00f1\7\26\2\2\u00f1\u00f2\5J&\2\u00f2G"+
		"\3\2\2\2\u00f3\u00f4\7\26\2\2\u00f4\u00f5\7\26\2\2\u00f5\u00f6\5J&\2\u00f6"+
		"I\3\2\2\2\u00f7\u00fa\5N(\2\u00f8\u00fa\5L\'\2\u00f9\u00f7\3\2\2\2\u00f9"+
		"\u00f8\3\2\2\2\u00faK\3\2\2\2\u00fb\u00fc\7\"\2\2\u00fcM\3\2\2\2\u00fd"+
		"\u00fe\7#\2\2\u00feO\3\2\2\2\u00ff\u0100\7$\2\2\u0100Q\3\2\2\2\16U_du"+
		"\u008d\u00a9\u00b3\u00ce\u00dd\u00e2\u00ee\u00f9";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}