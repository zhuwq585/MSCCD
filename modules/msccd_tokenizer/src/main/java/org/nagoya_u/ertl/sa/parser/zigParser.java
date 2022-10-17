package org.nagoya_u.ertl.sa.parser;
// Generated from /Users/syu/workspace/MSCCD/modules/msccd_tokenizer/src/main/java/org/nagoya_u/ertl/sa/parser/zig.g4 by ANTLR 4.8
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class zigParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		KEYWORD_ALIGN=1, KEYWORD_ALLOWZERO=2, KEYWORD_AND=3, KEYWORD_ANYFRAME=4, 
		KEYWORD_ANYTYPE=5, KEYWORD_ASM=6, KEYWORD_ASYNC=7, KEYWORD_AWAIT=8, KEYWORD_BREAK=9, 
		KEYWORD_CALLCONV=10, KEYWORD_CATCH=11, KEYWORD_COMPTIME=12, KEYWORD_CONST=13, 
		KEYWORD_CONTINUE=14, KEYWORD_DEFER=15, KEYWORD_ELSE=16, KEYWORD_ENUM=17, 
		KEYWORD_ERRDEFER=18, KEYWORD_ERROR=19, KEYWORD_EXPORT=20, KEYWORD_EXTERN=21, 
		KEYWORD_FN=22, KEYWORD_FOR=23, KEYWORD_IF=24, KEYWORD_INLINE=25, KEYWORD_NOALIAS=26, 
		KEYWORD_NOSUSPEND=27, KEYWORD_NOINLINE=28, KEYWORD_OPAQUE=29, KEYWORD_OR=30, 
		KEYWORD_ORELSE=31, KEYWORD_PACKED=32, KEYWORD_PUB=33, KEYWORD_RESUME=34, 
		KEYWORD_RETERN=35, KEYWORD_LINKSECTION=36, KEYWORD_STRUCT=37, KEYWORD_SUSPEND=38, 
		KEYWORD_SWITCH=39, KEYWORD_TEST=40, KEYWORD_THREADLOCAL=41, KEYWORD_TRY=42, 
		KEYWORD_UNION=43, KEYWORD_UNREACHABLE=44, KEYWORD_USINGNAMESPACE=45, KEYWORD_VAR=46, 
		KEYWORD_VOLATILE=47, KEYWORD_WHILE=48, Container_doc_comment=49, Doc_comment=50, 
		Line_comment=51, CHAR_LITERAL=52, FLOAT=53, INTEGER=54, STRINGLITERALSINGLE=55, 
		STRINGLITERAL=56, IDENTIFIER=57, BUILTINIDENTIFIER=58, AMPERSAND=59, AMPERSANDEQUAL=60, 
		ASTERISK=61, ASTERISK2=62, ASTERISKEQUAL=63, ASTERISKPERCENT=64, ASTERISKPERCENTEQUAL=65, 
		CARET=66, CARETEQUAL=67, COLON=68, COMMA=69, DOT=70, DOT2=71, DOT3=72, 
		DOTASTERISK=73, DOTQUESTIONMARK=74, EQUAL=75, EQUALEQUAL=76, EQUALRARROW=77, 
		EXCLAMATIONMARK=78, EXCLAMATIONMARKEQUAL=79, LARROW=80, LARROW2=81, LARROW2EQUAL=82, 
		LARROWEQUAL=83, LBRACE=84, LBRACKET=85, LPAREN=86, MINUS=87, MINUSEQUAL=88, 
		MINUSPERCENT=89, MINUSPERCENTEQUAL=90, MINUSRARROW=91, PERCENT=92, PERCENTEQUAL=93, 
		PIPE=94, PIPE2=95, PIPEEQUAL=96, PLUS=97, PLUS2=98, PLUSEQUAL=99, PLUSPERCENT=100, 
		PLUSPERCENTEQUAL=101, LETTERC=102, QUESTIONMARK=103, RARROW=104, RARROW2=105, 
		RARROW2EQUAL=106, RARROWEQUAL=107, RBRACE=108, RBRACKET=109, RPAREN=110, 
		SEMICOLON=111, SLASH=112, SLASHEQUAL=113, TILDE=114, Whitespace=115, Newline=116;
	public static final int
		RULE_root = 0, RULE_containerMembers = 1, RULE_containerDeclarations = 2, 
		RULE_testDecl = 3, RULE_topLevelComptime = 4, RULE_topLevelDecl = 5, RULE_fnProto = 6, 
		RULE_varDecl = 7, RULE_containerField = 8, RULE_statement = 9, RULE_ifStatement = 10, 
		RULE_labeledStatement = 11, RULE_loopStatement = 12, RULE_forStatement = 13, 
		RULE_whileStatement = 14, RULE_blockExprStatement = 15, RULE_blockExpr = 16, 
		RULE_assignExpr = 17, RULE_expr = 18, RULE_boolOrExpr = 19, RULE_boolAndExpr = 20, 
		RULE_compareExpr = 21, RULE_bitwiseExpr = 22, RULE_bitShiftExpr = 23, 
		RULE_additionExpr = 24, RULE_multiplyExpr = 25, RULE_prefixExpr = 26, 
		RULE_primaryExpr = 27, RULE_ifExpr = 28, RULE_block = 29, RULE_loopExpr = 30, 
		RULE_forExpr = 31, RULE_whileExpr = 32, RULE_curlysuffixExpr = 33, RULE_initList = 34, 
		RULE_typeExpr = 35, RULE_errorUnionExpr = 36, RULE_suffixExpr = 37, RULE_primaryTypeExpr = 38, 
		RULE_containerDecl = 39, RULE_errorSetDecl = 40, RULE_groupedExpr = 41, 
		RULE_ifTypeExpr = 42, RULE_labeledTypeExpr = 43, RULE_loopTypeExpr = 44, 
		RULE_forTypeExpr = 45, RULE_whileTypeExpr = 46, RULE_switchExpr = 47, 
		RULE_asmExpr = 48, RULE_asmOutput = 49, RULE_asmOutputItem = 50, RULE_asmInput = 51, 
		RULE_asmInputItem = 52, RULE_asmClobbers = 53, RULE_breakLabel = 54, RULE_blockLabel = 55, 
		RULE_fieldInit = 56, RULE_whileContinueExpr = 57, RULE_linkSection = 58, 
		RULE_callConv = 59, RULE_paramDecl = 60, RULE_paramType = 61, RULE_ifPrefix = 62, 
		RULE_whilePrefix = 63, RULE_forPrefix = 64, RULE_payload = 65, RULE_ptrpayload = 66, 
		RULE_ptrIndexpayload = 67, RULE_switchProng = 68, RULE_switchCase = 69, 
		RULE_switchItem = 70, RULE_assignOp = 71, RULE_compareOp = 72, RULE_bitwiseOp = 73, 
		RULE_bitShiftOp = 74, RULE_additionOp = 75, RULE_multiplyOp = 76, RULE_prefixOp = 77, 
		RULE_prefixTypeOp = 78, RULE_suffixOp = 79, RULE_fnCallArguments = 80, 
		RULE_sliceTypeStart = 81, RULE_ptrTypeStart = 82, RULE_arrayTypeStart = 83, 
		RULE_containerDeclAuto = 84, RULE_containerDeclType = 85, RULE_byteAlign = 86, 
		RULE_identifierList = 87, RULE_switchProngList = 88, RULE_asmOutputList = 89, 
		RULE_asmInputList = 90, RULE_stringList = 91, RULE_paramDeclList = 92, 
		RULE_exprList = 93;
	private static String[] makeRuleNames() {
		return new String[] {
			"root", "containerMembers", "containerDeclarations", "testDecl", "topLevelComptime", 
			"topLevelDecl", "fnProto", "varDecl", "containerField", "statement", 
			"ifStatement", "labeledStatement", "loopStatement", "forStatement", "whileStatement", 
			"blockExprStatement", "blockExpr", "assignExpr", "expr", "boolOrExpr", 
			"boolAndExpr", "compareExpr", "bitwiseExpr", "bitShiftExpr", "additionExpr", 
			"multiplyExpr", "prefixExpr", "primaryExpr", "ifExpr", "block", "loopExpr", 
			"forExpr", "whileExpr", "curlysuffixExpr", "initList", "typeExpr", "errorUnionExpr", 
			"suffixExpr", "primaryTypeExpr", "containerDecl", "errorSetDecl", "groupedExpr", 
			"ifTypeExpr", "labeledTypeExpr", "loopTypeExpr", "forTypeExpr", "whileTypeExpr", 
			"switchExpr", "asmExpr", "asmOutput", "asmOutputItem", "asmInput", "asmInputItem", 
			"asmClobbers", "breakLabel", "blockLabel", "fieldInit", "whileContinueExpr", 
			"linkSection", "callConv", "paramDecl", "paramType", "ifPrefix", "whilePrefix", 
			"forPrefix", "payload", "ptrpayload", "ptrIndexpayload", "switchProng", 
			"switchCase", "switchItem", "assignOp", "compareOp", "bitwiseOp", "bitShiftOp", 
			"additionOp", "multiplyOp", "prefixOp", "prefixTypeOp", "suffixOp", "fnCallArguments", 
			"sliceTypeStart", "ptrTypeStart", "arrayTypeStart", "containerDeclAuto", 
			"containerDeclType", "byteAlign", "identifierList", "switchProngList", 
			"asmOutputList", "asmInputList", "stringList", "paramDeclList", "exprList"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'align'", "'allowzero'", "'and'", "'anyframe'", "'anytype'", "'asm'", 
			"'async'", "'await'", "'break'", "'callconv'", "'catch'", "'comptime'", 
			"'const'", "'continue'", "'defer'", "'else'", "'enum'", "'errdefer'", 
			"'error'", "'export'", "'extern'", "'fn'", "'for'", "'if'", "'inline'", 
			"'noalias'", "'nosuspend'", "'noinline'", "'opaque'", "'or'", "'orelse'", 
			"'packed'", "'pub'", "'resume'", "'return'", "'linksection'", "'struct'", 
			"'suspend'", "'switch'", "'test'", "'threadlocal'", "'try'", "'union'", 
			"'unreachable'", "'usingnamespace'", "'var'", "'volatile'", "'while'", 
			null, null, null, null, null, null, null, null, null, null, null, "'&='", 
			null, "'**'", "'*='", null, "'*%='", null, "'^='", "':'", "','", null, 
			null, "'...'", "'.*'", "'.?'", null, "'=='", "'=>'", null, "'!='", null, 
			"'<<'", "'<<='", "'<='", "'{'", "'['", "'('", null, "'-='", null, "'-%='", 
			"'->'", null, "'%='", null, "'||'", "'|='", null, "'++'", "'+='", null, 
			"'+%='", "'c'", "'?'", null, null, "'>>='", "'>='", "'}'", "']'", "')'", 
			"';'", null, "'/='", "'~'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "KEYWORD_ALIGN", "KEYWORD_ALLOWZERO", "KEYWORD_AND", "KEYWORD_ANYFRAME", 
			"KEYWORD_ANYTYPE", "KEYWORD_ASM", "KEYWORD_ASYNC", "KEYWORD_AWAIT", "KEYWORD_BREAK", 
			"KEYWORD_CALLCONV", "KEYWORD_CATCH", "KEYWORD_COMPTIME", "KEYWORD_CONST", 
			"KEYWORD_CONTINUE", "KEYWORD_DEFER", "KEYWORD_ELSE", "KEYWORD_ENUM", 
			"KEYWORD_ERRDEFER", "KEYWORD_ERROR", "KEYWORD_EXPORT", "KEYWORD_EXTERN", 
			"KEYWORD_FN", "KEYWORD_FOR", "KEYWORD_IF", "KEYWORD_INLINE", "KEYWORD_NOALIAS", 
			"KEYWORD_NOSUSPEND", "KEYWORD_NOINLINE", "KEYWORD_OPAQUE", "KEYWORD_OR", 
			"KEYWORD_ORELSE", "KEYWORD_PACKED", "KEYWORD_PUB", "KEYWORD_RESUME", 
			"KEYWORD_RETERN", "KEYWORD_LINKSECTION", "KEYWORD_STRUCT", "KEYWORD_SUSPEND", 
			"KEYWORD_SWITCH", "KEYWORD_TEST", "KEYWORD_THREADLOCAL", "KEYWORD_TRY", 
			"KEYWORD_UNION", "KEYWORD_UNREACHABLE", "KEYWORD_USINGNAMESPACE", "KEYWORD_VAR", 
			"KEYWORD_VOLATILE", "KEYWORD_WHILE", "Container_doc_comment", "Doc_comment", 
			"Line_comment", "CHAR_LITERAL", "FLOAT", "INTEGER", "STRINGLITERALSINGLE", 
			"STRINGLITERAL", "IDENTIFIER", "BUILTINIDENTIFIER", "AMPERSAND", "AMPERSANDEQUAL", 
			"ASTERISK", "ASTERISK2", "ASTERISKEQUAL", "ASTERISKPERCENT", "ASTERISKPERCENTEQUAL", 
			"CARET", "CARETEQUAL", "COLON", "COMMA", "DOT", "DOT2", "DOT3", "DOTASTERISK", 
			"DOTQUESTIONMARK", "EQUAL", "EQUALEQUAL", "EQUALRARROW", "EXCLAMATIONMARK", 
			"EXCLAMATIONMARKEQUAL", "LARROW", "LARROW2", "LARROW2EQUAL", "LARROWEQUAL", 
			"LBRACE", "LBRACKET", "LPAREN", "MINUS", "MINUSEQUAL", "MINUSPERCENT", 
			"MINUSPERCENTEQUAL", "MINUSRARROW", "PERCENT", "PERCENTEQUAL", "PIPE", 
			"PIPE2", "PIPEEQUAL", "PLUS", "PLUS2", "PLUSEQUAL", "PLUSPERCENT", "PLUSPERCENTEQUAL", 
			"LETTERC", "QUESTIONMARK", "RARROW", "RARROW2", "RARROW2EQUAL", "RARROWEQUAL", 
			"RBRACE", "RBRACKET", "RPAREN", "SEMICOLON", "SLASH", "SLASHEQUAL", "TILDE", 
			"Whitespace", "Newline"
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
	public String getGrammarFileName() { return "zig.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public zigParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class RootContext extends ParserRuleContext {
		public ContainerMembersContext containerMembers() {
			return getRuleContext(ContainerMembersContext.class,0);
		}
		public TerminalNode Container_doc_comment() { return getToken(zigParser.Container_doc_comment, 0); }
		public RootContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_root; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof zigListener ) ((zigListener)listener).enterRoot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof zigListener ) ((zigListener)listener).exitRoot(this);
		}
	}

	public final RootContext root() throws RecognitionException {
		RootContext _localctx = new RootContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_root);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(189);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Container_doc_comment) {
				{
				setState(188);
				match(Container_doc_comment);
				}
			}

			setState(191);
			containerMembers();
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

	public static class ContainerMembersContext extends ParserRuleContext {
		public List<ContainerDeclarationsContext> containerDeclarations() {
			return getRuleContexts(ContainerDeclarationsContext.class);
		}
		public ContainerDeclarationsContext containerDeclarations(int i) {
			return getRuleContext(ContainerDeclarationsContext.class,i);
		}
		public List<ContainerFieldContext> containerField() {
			return getRuleContexts(ContainerFieldContext.class);
		}
		public ContainerFieldContext containerField(int i) {
			return getRuleContext(ContainerFieldContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(zigParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(zigParser.COMMA, i);
		}
		public ContainerMembersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_containerMembers; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof zigListener ) ((zigListener)listener).enterContainerMembers(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof zigListener ) ((zigListener)listener).exitContainerMembers(this);
		}
	}

	public final ContainerMembersContext containerMembers() throws RecognitionException {
		ContainerMembersContext _localctx = new ContainerMembersContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_containerMembers);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(193);
			containerDeclarations();
			setState(199);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(194);
					containerField();
					setState(195);
					match(COMMA);
					}
					} 
				}
				setState(201);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			setState(204);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(202);
				containerField();
				}
				break;
			case 2:
				{
				setState(203);
				containerDeclarations();
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

	public static class ContainerDeclarationsContext extends ParserRuleContext {
		public TestDeclContext testDecl() {
			return getRuleContext(TestDeclContext.class,0);
		}
		public ContainerDeclarationsContext containerDeclarations() {
			return getRuleContext(ContainerDeclarationsContext.class,0);
		}
		public TopLevelComptimeContext topLevelComptime() {
			return getRuleContext(TopLevelComptimeContext.class,0);
		}
		public TopLevelDeclContext topLevelDecl() {
			return getRuleContext(TopLevelDeclContext.class,0);
		}
		public TerminalNode Doc_comment() { return getToken(zigParser.Doc_comment, 0); }
		public TerminalNode KEYWORD_PUB() { return getToken(zigParser.KEYWORD_PUB, 0); }
		public ContainerDeclarationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_containerDeclarations; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof zigListener ) ((zigListener)listener).enterContainerDeclarations(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof zigListener ) ((zigListener)listener).exitContainerDeclarations(this);
		}
	}

	public final ContainerDeclarationsContext containerDeclarations() throws RecognitionException {
		ContainerDeclarationsContext _localctx = new ContainerDeclarationsContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_containerDeclarations);
		int _la;
		try {
			setState(221);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(206);
				testDecl();
				setState(207);
				containerDeclarations();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(209);
				topLevelComptime();
				setState(210);
				containerDeclarations();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(213);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Doc_comment) {
					{
					setState(212);
					match(Doc_comment);
					}
				}

				setState(216);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==KEYWORD_PUB) {
					{
					setState(215);
					match(KEYWORD_PUB);
					}
				}

				setState(218);
				topLevelDecl();
				setState(219);
				containerDeclarations();
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

	public static class TestDeclContext extends ParserRuleContext {
		public TerminalNode KEYWORD_TEST() { return getToken(zigParser.KEYWORD_TEST, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode Doc_comment() { return getToken(zigParser.Doc_comment, 0); }
		public TerminalNode STRINGLITERALSINGLE() { return getToken(zigParser.STRINGLITERALSINGLE, 0); }
		public TestDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_testDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof zigListener ) ((zigListener)listener).enterTestDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof zigListener ) ((zigListener)listener).exitTestDecl(this);
		}
	}

	public final TestDeclContext testDecl() throws RecognitionException {
		TestDeclContext _localctx = new TestDeclContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_testDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(224);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Doc_comment) {
				{
				setState(223);
				match(Doc_comment);
				}
			}

			setState(226);
			match(KEYWORD_TEST);
			setState(228);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STRINGLITERALSINGLE) {
				{
				setState(227);
				match(STRINGLITERALSINGLE);
				}
			}

			setState(230);
			block();
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

	public static class TopLevelComptimeContext extends ParserRuleContext {
		public TerminalNode KEYWORD_COMPTIME() { return getToken(zigParser.KEYWORD_COMPTIME, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode Doc_comment() { return getToken(zigParser.Doc_comment, 0); }
		public TopLevelComptimeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_topLevelComptime; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof zigListener ) ((zigListener)listener).enterTopLevelComptime(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof zigListener ) ((zigListener)listener).exitTopLevelComptime(this);
		}
	}

	public final TopLevelComptimeContext topLevelComptime() throws RecognitionException {
		TopLevelComptimeContext _localctx = new TopLevelComptimeContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_topLevelComptime);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(233);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Doc_comment) {
				{
				setState(232);
				match(Doc_comment);
				}
			}

			setState(235);
			match(KEYWORD_COMPTIME);
			setState(236);
			block();
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

	public static class TopLevelDeclContext extends ParserRuleContext {
		public FnProtoContext fnProto() {
			return getRuleContext(FnProtoContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(zigParser.SEMICOLON, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode KEYWORD_EXPORT() { return getToken(zigParser.KEYWORD_EXPORT, 0); }
		public TerminalNode KEYWORD_EXTERN() { return getToken(zigParser.KEYWORD_EXTERN, 0); }
		public TerminalNode KEYWORD_INLINE() { return getToken(zigParser.KEYWORD_INLINE, 0); }
		public TerminalNode KEYWORD_NOINLINE() { return getToken(zigParser.KEYWORD_NOINLINE, 0); }
		public TerminalNode STRINGLITERALSINGLE() { return getToken(zigParser.STRINGLITERALSINGLE, 0); }
		public VarDeclContext varDecl() {
			return getRuleContext(VarDeclContext.class,0);
		}
		public TerminalNode KEYWORD_THREADLOCAL() { return getToken(zigParser.KEYWORD_THREADLOCAL, 0); }
		public TerminalNode KEYWORD_USINGNAMESPACE() { return getToken(zigParser.KEYWORD_USINGNAMESPACE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TopLevelDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_topLevelDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof zigListener ) ((zigListener)listener).enterTopLevelDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof zigListener ) ((zigListener)listener).exitTopLevelDecl(this);
		}
	}

	public final TopLevelDeclContext topLevelDecl() throws RecognitionException {
		TopLevelDeclContext _localctx = new TopLevelDeclContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_topLevelDecl);
		int _la;
		try {
			setState(266);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(244);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case KEYWORD_EXPORT:
					{
					setState(238);
					match(KEYWORD_EXPORT);
					}
					break;
				case KEYWORD_EXTERN:
					{
					setState(239);
					match(KEYWORD_EXTERN);
					setState(241);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==STRINGLITERALSINGLE) {
						{
						setState(240);
						match(STRINGLITERALSINGLE);
						}
					}

					}
					break;
				case KEYWORD_INLINE:
				case KEYWORD_NOINLINE:
					{
					setState(243);
					_la = _input.LA(1);
					if ( !(_la==KEYWORD_INLINE || _la==KEYWORD_NOINLINE) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					break;
				case KEYWORD_FN:
					break;
				default:
					break;
				}
				setState(246);
				fnProto();
				setState(249);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case SEMICOLON:
					{
					setState(247);
					match(SEMICOLON);
					}
					break;
				case LBRACE:
					{
					setState(248);
					block();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(256);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case KEYWORD_EXPORT:
					{
					setState(251);
					match(KEYWORD_EXPORT);
					}
					break;
				case KEYWORD_EXTERN:
					{
					setState(252);
					match(KEYWORD_EXTERN);
					setState(254);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==STRINGLITERALSINGLE) {
						{
						setState(253);
						match(STRINGLITERALSINGLE);
						}
					}

					}
					break;
				case KEYWORD_CONST:
				case KEYWORD_THREADLOCAL:
				case KEYWORD_VAR:
					break;
				default:
					break;
				}
				setState(259);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==KEYWORD_THREADLOCAL) {
					{
					setState(258);
					match(KEYWORD_THREADLOCAL);
					}
				}

				setState(261);
				varDecl();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(262);
				match(KEYWORD_USINGNAMESPACE);
				setState(263);
				expr();
				setState(264);
				match(SEMICOLON);
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

	public static class FnProtoContext extends ParserRuleContext {
		public TerminalNode KEYWORD_FN() { return getToken(zigParser.KEYWORD_FN, 0); }
		public TerminalNode LPAREN() { return getToken(zigParser.LPAREN, 0); }
		public ParamDeclListContext paramDeclList() {
			return getRuleContext(ParamDeclListContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(zigParser.RPAREN, 0); }
		public TypeExprContext typeExpr() {
			return getRuleContext(TypeExprContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(zigParser.IDENTIFIER, 0); }
		public ByteAlignContext byteAlign() {
			return getRuleContext(ByteAlignContext.class,0);
		}
		public LinkSectionContext linkSection() {
			return getRuleContext(LinkSectionContext.class,0);
		}
		public CallConvContext callConv() {
			return getRuleContext(CallConvContext.class,0);
		}
		public TerminalNode EXCLAMATIONMARK() { return getToken(zigParser.EXCLAMATIONMARK, 0); }
		public FnProtoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fnProto; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof zigListener ) ((zigListener)listener).enterFnProto(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof zigListener ) ((zigListener)listener).exitFnProto(this);
		}
	}

	public final FnProtoContext fnProto() throws RecognitionException {
		FnProtoContext _localctx = new FnProtoContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_fnProto);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(268);
			match(KEYWORD_FN);
			setState(270);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(269);
				match(IDENTIFIER);
				}
			}

			setState(272);
			match(LPAREN);
			setState(273);
			paramDeclList();
			setState(274);
			match(RPAREN);
			setState(276);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KEYWORD_ALIGN) {
				{
				setState(275);
				byteAlign();
				}
			}

			setState(279);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KEYWORD_LINKSECTION) {
				{
				setState(278);
				linkSection();
				}
			}

			setState(282);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KEYWORD_CALLCONV) {
				{
				setState(281);
				callConv();
				}
			}

			setState(285);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXCLAMATIONMARK) {
				{
				setState(284);
				match(EXCLAMATIONMARK);
				}
			}

			setState(287);
			typeExpr();
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

	public static class VarDeclContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(zigParser.IDENTIFIER, 0); }
		public TerminalNode SEMICOLON() { return getToken(zigParser.SEMICOLON, 0); }
		public TerminalNode KEYWORD_CONST() { return getToken(zigParser.KEYWORD_CONST, 0); }
		public TerminalNode KEYWORD_VAR() { return getToken(zigParser.KEYWORD_VAR, 0); }
		public TerminalNode COLON() { return getToken(zigParser.COLON, 0); }
		public TypeExprContext typeExpr() {
			return getRuleContext(TypeExprContext.class,0);
		}
		public ByteAlignContext byteAlign() {
			return getRuleContext(ByteAlignContext.class,0);
		}
		public LinkSectionContext linkSection() {
			return getRuleContext(LinkSectionContext.class,0);
		}
		public TerminalNode EQUAL() { return getToken(zigParser.EQUAL, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public VarDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof zigListener ) ((zigListener)listener).enterVarDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof zigListener ) ((zigListener)listener).exitVarDecl(this);
		}
	}

	public final VarDeclContext varDecl() throws RecognitionException {
		VarDeclContext _localctx = new VarDeclContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_varDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(289);
			_la = _input.LA(1);
			if ( !(_la==KEYWORD_CONST || _la==KEYWORD_VAR) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(290);
			match(IDENTIFIER);
			setState(293);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(291);
				match(COLON);
				setState(292);
				typeExpr();
				}
			}

			setState(296);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KEYWORD_ALIGN) {
				{
				setState(295);
				byteAlign();
				}
			}

			setState(299);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KEYWORD_LINKSECTION) {
				{
				setState(298);
				linkSection();
				}
			}

			setState(303);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQUAL) {
				{
				setState(301);
				match(EQUAL);
				setState(302);
				expr();
				}
			}

			setState(305);
			match(SEMICOLON);
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

	public static class ContainerFieldContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(zigParser.IDENTIFIER, 0); }
		public TerminalNode Doc_comment() { return getToken(zigParser.Doc_comment, 0); }
		public TerminalNode KEYWORD_COMPTIME() { return getToken(zigParser.KEYWORD_COMPTIME, 0); }
		public TerminalNode COLON() { return getToken(zigParser.COLON, 0); }
		public TypeExprContext typeExpr() {
			return getRuleContext(TypeExprContext.class,0);
		}
		public TerminalNode EQUAL() { return getToken(zigParser.EQUAL, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ByteAlignContext byteAlign() {
			return getRuleContext(ByteAlignContext.class,0);
		}
		public ContainerFieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_containerField; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof zigListener ) ((zigListener)listener).enterContainerField(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof zigListener ) ((zigListener)listener).exitContainerField(this);
		}
	}

	public final ContainerFieldContext containerField() throws RecognitionException {
		ContainerFieldContext _localctx = new ContainerFieldContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_containerField);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(308);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Doc_comment) {
				{
				setState(307);
				match(Doc_comment);
				}
			}

			setState(311);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KEYWORD_COMPTIME) {
				{
				setState(310);
				match(KEYWORD_COMPTIME);
				}
			}

			setState(313);
			match(IDENTIFIER);
			setState(319);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(314);
				match(COLON);
				setState(315);
				typeExpr();
				setState(317);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==KEYWORD_ALIGN) {
					{
					setState(316);
					byteAlign();
					}
				}

				}
			}

			setState(323);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQUAL) {
				{
				setState(321);
				match(EQUAL);
				setState(322);
				expr();
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

	public static class StatementContext extends ParserRuleContext {
		public VarDeclContext varDecl() {
			return getRuleContext(VarDeclContext.class,0);
		}
		public TerminalNode KEYWORD_COMPTIME() { return getToken(zigParser.KEYWORD_COMPTIME, 0); }
		public BlockExprStatementContext blockExprStatement() {
			return getRuleContext(BlockExprStatementContext.class,0);
		}
		public TerminalNode KEYWORD_NOSUSPEND() { return getToken(zigParser.KEYWORD_NOSUSPEND, 0); }
		public TerminalNode KEYWORD_SUSPEND() { return getToken(zigParser.KEYWORD_SUSPEND, 0); }
		public TerminalNode KEYWORD_DEFER() { return getToken(zigParser.KEYWORD_DEFER, 0); }
		public TerminalNode KEYWORD_ERRDEFER() { return getToken(zigParser.KEYWORD_ERRDEFER, 0); }
		public PayloadContext payload() {
			return getRuleContext(PayloadContext.class,0);
		}
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public LabeledStatementContext labeledStatement() {
			return getRuleContext(LabeledStatementContext.class,0);
		}
		public SwitchExprContext switchExpr() {
			return getRuleContext(SwitchExprContext.class,0);
		}
		public AssignExprContext assignExpr() {
			return getRuleContext(AssignExprContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(zigParser.SEMICOLON, 0); }
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof zigListener ) ((zigListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof zigListener ) ((zigListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_statement);
		int _la;
		try {
			setState(348);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(326);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==KEYWORD_COMPTIME) {
					{
					setState(325);
					match(KEYWORD_COMPTIME);
					}
				}

				setState(328);
				varDecl();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(329);
				match(KEYWORD_COMPTIME);
				setState(330);
				blockExprStatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(331);
				match(KEYWORD_NOSUSPEND);
				setState(332);
				blockExprStatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(333);
				match(KEYWORD_SUSPEND);
				setState(334);
				blockExprStatement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(335);
				match(KEYWORD_DEFER);
				setState(336);
				blockExprStatement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(337);
				match(KEYWORD_ERRDEFER);
				setState(339);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PIPE) {
					{
					setState(338);
					payload();
					}
				}

				setState(341);
				blockExprStatement();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(342);
				ifStatement();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(343);
				labeledStatement();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(344);
				switchExpr();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(345);
				assignExpr();
				setState(346);
				match(SEMICOLON);
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

	public static class IfStatementContext extends ParserRuleContext {
		public IfPrefixContext ifPrefix() {
			return getRuleContext(IfPrefixContext.class,0);
		}
		public BlockExprContext blockExpr() {
			return getRuleContext(BlockExprContext.class,0);
		}
		public TerminalNode KEYWORD_ELSE() { return getToken(zigParser.KEYWORD_ELSE, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public PayloadContext payload() {
			return getRuleContext(PayloadContext.class,0);
		}
		public AssignExprContext assignExpr() {
			return getRuleContext(AssignExprContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(zigParser.SEMICOLON, 0); }
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof zigListener ) ((zigListener)listener).enterIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof zigListener ) ((zigListener)listener).exitIfStatement(this);
		}
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_ifStatement);
		int _la;
		try {
			setState(369);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(350);
				ifPrefix();
				setState(351);
				blockExpr();
				setState(357);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==KEYWORD_ELSE) {
					{
					setState(352);
					match(KEYWORD_ELSE);
					setState(354);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==PIPE) {
						{
						setState(353);
						payload();
						}
					}

					setState(356);
					statement();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(359);
				ifPrefix();
				setState(360);
				assignExpr();
				setState(367);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case SEMICOLON:
					{
					setState(361);
					match(SEMICOLON);
					}
					break;
				case KEYWORD_ELSE:
					{
					setState(362);
					match(KEYWORD_ELSE);
					setState(364);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==PIPE) {
						{
						setState(363);
						payload();
						}
					}

					setState(366);
					statement();
					}
					break;
				default:
					throw new NoViableAltException(this);
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

	public static class LabeledStatementContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public LoopStatementContext loopStatement() {
			return getRuleContext(LoopStatementContext.class,0);
		}
		public BlockLabelContext blockLabel() {
			return getRuleContext(BlockLabelContext.class,0);
		}
		public LabeledStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_labeledStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof zigListener ) ((zigListener)listener).enterLabeledStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof zigListener ) ((zigListener)listener).exitLabeledStatement(this);
		}
	}

	public final LabeledStatementContext labeledStatement() throws RecognitionException {
		LabeledStatementContext _localctx = new LabeledStatementContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_labeledStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(372);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(371);
				blockLabel();
				}
			}

			setState(376);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACE:
				{
				setState(374);
				block();
				}
				break;
			case KEYWORD_FOR:
			case KEYWORD_INLINE:
			case KEYWORD_WHILE:
				{
				setState(375);
				loopStatement();
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

	public static class LoopStatementContext extends ParserRuleContext {
		public ForStatementContext forStatement() {
			return getRuleContext(ForStatementContext.class,0);
		}
		public WhileStatementContext whileStatement() {
			return getRuleContext(WhileStatementContext.class,0);
		}
		public TerminalNode KEYWORD_INLINE() { return getToken(zigParser.KEYWORD_INLINE, 0); }
		public LoopStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loopStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof zigListener ) ((zigListener)listener).enterLoopStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof zigListener ) ((zigListener)listener).exitLoopStatement(this);
		}
	}

	public final LoopStatementContext loopStatement() throws RecognitionException {
		LoopStatementContext _localctx = new LoopStatementContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_loopStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(379);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KEYWORD_INLINE) {
				{
				setState(378);
				match(KEYWORD_INLINE);
				}
			}

			setState(383);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KEYWORD_FOR:
				{
				setState(381);
				forStatement();
				}
				break;
			case KEYWORD_WHILE:
				{
				setState(382);
				whileStatement();
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

	public static class ForStatementContext extends ParserRuleContext {
		public ForPrefixContext forPrefix() {
			return getRuleContext(ForPrefixContext.class,0);
		}
		public BlockExprContext blockExpr() {
			return getRuleContext(BlockExprContext.class,0);
		}
		public TerminalNode KEYWORD_ELSE() { return getToken(zigParser.KEYWORD_ELSE, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public AssignExprContext assignExpr() {
			return getRuleContext(AssignExprContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(zigParser.SEMICOLON, 0); }
		public ForStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof zigListener ) ((zigListener)listener).enterForStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof zigListener ) ((zigListener)listener).exitForStatement(this);
		}
	}

	public final ForStatementContext forStatement() throws RecognitionException {
		ForStatementContext _localctx = new ForStatementContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_forStatement);
		int _la;
		try {
			setState(398);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(385);
				forPrefix();
				setState(386);
				blockExpr();
				setState(389);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==KEYWORD_ELSE) {
					{
					setState(387);
					match(KEYWORD_ELSE);
					setState(388);
					statement();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(391);
				forPrefix();
				setState(392);
				assignExpr();
				setState(396);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case SEMICOLON:
					{
					setState(393);
					match(SEMICOLON);
					}
					break;
				case KEYWORD_ELSE:
					{
					setState(394);
					match(KEYWORD_ELSE);
					setState(395);
					statement();
					}
					break;
				default:
					throw new NoViableAltException(this);
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

	public static class WhileStatementContext extends ParserRuleContext {
		public WhilePrefixContext whilePrefix() {
			return getRuleContext(WhilePrefixContext.class,0);
		}
		public BlockExprContext blockExpr() {
			return getRuleContext(BlockExprContext.class,0);
		}
		public TerminalNode KEYWORD_ELSE() { return getToken(zigParser.KEYWORD_ELSE, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public PayloadContext payload() {
			return getRuleContext(PayloadContext.class,0);
		}
		public AssignExprContext assignExpr() {
			return getRuleContext(AssignExprContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(zigParser.SEMICOLON, 0); }
		public WhileStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof zigListener ) ((zigListener)listener).enterWhileStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof zigListener ) ((zigListener)listener).exitWhileStatement(this);
		}
	}

	public final WhileStatementContext whileStatement() throws RecognitionException {
		WhileStatementContext _localctx = new WhileStatementContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_whileStatement);
		int _la;
		try {
			setState(419);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(400);
				whilePrefix();
				setState(401);
				blockExpr();
				setState(407);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==KEYWORD_ELSE) {
					{
					setState(402);
					match(KEYWORD_ELSE);
					setState(404);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==PIPE) {
						{
						setState(403);
						payload();
						}
					}

					setState(406);
					statement();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(409);
				whilePrefix();
				setState(410);
				assignExpr();
				setState(417);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case SEMICOLON:
					{
					setState(411);
					match(SEMICOLON);
					}
					break;
				case KEYWORD_ELSE:
					{
					setState(412);
					match(KEYWORD_ELSE);
					setState(414);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==PIPE) {
						{
						setState(413);
						payload();
						}
					}

					setState(416);
					statement();
					}
					break;
				default:
					throw new NoViableAltException(this);
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

	public static class BlockExprStatementContext extends ParserRuleContext {
		public BlockExprContext blockExpr() {
			return getRuleContext(BlockExprContext.class,0);
		}
		public AssignExprContext assignExpr() {
			return getRuleContext(AssignExprContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(zigParser.SEMICOLON, 0); }
		public BlockExprStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockExprStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof zigListener ) ((zigListener)listener).enterBlockExprStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof zigListener ) ((zigListener)listener).exitBlockExprStatement(this);
		}
	}

	public final BlockExprStatementContext blockExprStatement() throws RecognitionException {
		BlockExprStatementContext _localctx = new BlockExprStatementContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_blockExprStatement);
		try {
			setState(425);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(421);
				blockExpr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(422);
				assignExpr();
				setState(423);
				match(SEMICOLON);
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

	public static class BlockExprContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public BlockLabelContext blockLabel() {
			return getRuleContext(BlockLabelContext.class,0);
		}
		public BlockExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof zigListener ) ((zigListener)listener).enterBlockExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof zigListener ) ((zigListener)listener).exitBlockExpr(this);
		}
	}

	public final BlockExprContext blockExpr() throws RecognitionException {
		BlockExprContext _localctx = new BlockExprContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_blockExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(428);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(427);
				blockLabel();
				}
			}

			setState(430);
			block();
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

	public static class AssignExprContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public AssignOpContext assignOp() {
			return getRuleContext(AssignOpContext.class,0);
		}
		public AssignExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof zigListener ) ((zigListener)listener).enterAssignExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof zigListener ) ((zigListener)listener).exitAssignExpr(this);
		}
	}

	public final AssignExprContext assignExpr() throws RecognitionException {
		AssignExprContext _localctx = new AssignExprContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_assignExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(432);
			expr();
			setState(436);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 60)) & ~0x3f) == 0 && ((1L << (_la - 60)) & ((1L << (AMPERSANDEQUAL - 60)) | (1L << (ASTERISKEQUAL - 60)) | (1L << (ASTERISKPERCENTEQUAL - 60)) | (1L << (CARETEQUAL - 60)) | (1L << (EQUAL - 60)) | (1L << (LARROW2EQUAL - 60)) | (1L << (MINUSEQUAL - 60)) | (1L << (MINUSPERCENTEQUAL - 60)) | (1L << (PERCENTEQUAL - 60)) | (1L << (PIPEEQUAL - 60)) | (1L << (PLUSEQUAL - 60)) | (1L << (PLUSPERCENTEQUAL - 60)) | (1L << (RARROW2EQUAL - 60)) | (1L << (SLASHEQUAL - 60)))) != 0)) {
				{
				setState(433);
				assignOp();
				setState(434);
				expr();
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

	public static class ExprContext extends ParserRuleContext {
		public BoolOrExprContext boolOrExpr() {
			return getRuleContext(BoolOrExprContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof zigListener ) ((zigListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof zigListener ) ((zigListener)listener).exitExpr(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(438);
			boolOrExpr();
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

	public static class BoolOrExprContext extends ParserRuleContext {
		public List<BoolAndExprContext> boolAndExpr() {
			return getRuleContexts(BoolAndExprContext.class);
		}
		public BoolAndExprContext boolAndExpr(int i) {
			return getRuleContext(BoolAndExprContext.class,i);
		}
		public List<TerminalNode> KEYWORD_OR() { return getTokens(zigParser.KEYWORD_OR); }
		public TerminalNode KEYWORD_OR(int i) {
			return getToken(zigParser.KEYWORD_OR, i);
		}
		public BoolOrExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolOrExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof zigListener ) ((zigListener)listener).enterBoolOrExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof zigListener ) ((zigListener)listener).exitBoolOrExpr(this);
		}
	}

	public final BoolOrExprContext boolOrExpr() throws RecognitionException {
		BoolOrExprContext _localctx = new BoolOrExprContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_boolOrExpr);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(440);
			boolAndExpr();
			setState(445);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,53,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(441);
					match(KEYWORD_OR);
					setState(442);
					boolAndExpr();
					}
					} 
				}
				setState(447);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,53,_ctx);
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

	public static class BoolAndExprContext extends ParserRuleContext {
		public List<CompareExprContext> compareExpr() {
			return getRuleContexts(CompareExprContext.class);
		}
		public CompareExprContext compareExpr(int i) {
			return getRuleContext(CompareExprContext.class,i);
		}
		public List<TerminalNode> KEYWORD_AND() { return getTokens(zigParser.KEYWORD_AND); }
		public TerminalNode KEYWORD_AND(int i) {
			return getToken(zigParser.KEYWORD_AND, i);
		}
		public BoolAndExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolAndExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof zigListener ) ((zigListener)listener).enterBoolAndExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof zigListener ) ((zigListener)listener).exitBoolAndExpr(this);
		}
	}

	public final BoolAndExprContext boolAndExpr() throws RecognitionException {
		BoolAndExprContext _localctx = new BoolAndExprContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_boolAndExpr);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(448);
			compareExpr();
			setState(453);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,54,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(449);
					match(KEYWORD_AND);
					setState(450);
					compareExpr();
					}
					} 
				}
				setState(455);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,54,_ctx);
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

	public static class CompareExprContext extends ParserRuleContext {
		public List<BitwiseExprContext> bitwiseExpr() {
			return getRuleContexts(BitwiseExprContext.class);
		}
		public BitwiseExprContext bitwiseExpr(int i) {
			return getRuleContext(BitwiseExprContext.class,i);
		}
		public CompareOpContext compareOp() {
			return getRuleContext(CompareOpContext.class,0);
		}
		public CompareExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compareExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof zigListener ) ((zigListener)listener).enterCompareExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof zigListener ) ((zigListener)listener).exitCompareExpr(this);
		}
	}

	public final CompareExprContext compareExpr() throws RecognitionException {
		CompareExprContext _localctx = new CompareExprContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_compareExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(456);
			bitwiseExpr();
			setState(460);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
			case 1:
				{
				setState(457);
				compareOp();
				setState(458);
				bitwiseExpr();
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

	public static class BitwiseExprContext extends ParserRuleContext {
		public List<BitShiftExprContext> bitShiftExpr() {
			return getRuleContexts(BitShiftExprContext.class);
		}
		public BitShiftExprContext bitShiftExpr(int i) {
			return getRuleContext(BitShiftExprContext.class,i);
		}
		public List<BitwiseOpContext> bitwiseOp() {
			return getRuleContexts(BitwiseOpContext.class);
		}
		public BitwiseOpContext bitwiseOp(int i) {
			return getRuleContext(BitwiseOpContext.class,i);
		}
		public BitwiseExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bitwiseExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof zigListener ) ((zigListener)listener).enterBitwiseExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof zigListener ) ((zigListener)listener).exitBitwiseExpr(this);
		}
	}

	public final BitwiseExprContext bitwiseExpr() throws RecognitionException {
		BitwiseExprContext _localctx = new BitwiseExprContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_bitwiseExpr);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(462);
			bitShiftExpr();
			setState(468);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,56,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(463);
					bitwiseOp();
					setState(464);
					bitShiftExpr();
					}
					} 
				}
				setState(470);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,56,_ctx);
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

	public static class BitShiftExprContext extends ParserRuleContext {
		public List<AdditionExprContext> additionExpr() {
			return getRuleContexts(AdditionExprContext.class);
		}
		public AdditionExprContext additionExpr(int i) {
			return getRuleContext(AdditionExprContext.class,i);
		}
		public List<BitShiftOpContext> bitShiftOp() {
			return getRuleContexts(BitShiftOpContext.class);
		}
		public BitShiftOpContext bitShiftOp(int i) {
			return getRuleContext(BitShiftOpContext.class,i);
		}
		public BitShiftExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bitShiftExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof zigListener ) ((zigListener)listener).enterBitShiftExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof zigListener ) ((zigListener)listener).exitBitShiftExpr(this);
		}
	}

	public final BitShiftExprContext bitShiftExpr() throws RecognitionException {
		BitShiftExprContext _localctx = new BitShiftExprContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_bitShiftExpr);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(471);
			additionExpr();
			setState(477);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,57,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(472);
					bitShiftOp();
					setState(473);
					additionExpr();
					}
					} 
				}
				setState(479);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,57,_ctx);
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

	public static class AdditionExprContext extends ParserRuleContext {
		public List<MultiplyExprContext> multiplyExpr() {
			return getRuleContexts(MultiplyExprContext.class);
		}
		public MultiplyExprContext multiplyExpr(int i) {
			return getRuleContext(MultiplyExprContext.class,i);
		}
		public List<AdditionOpContext> additionOp() {
			return getRuleContexts(AdditionOpContext.class);
		}
		public AdditionOpContext additionOp(int i) {
			return getRuleContext(AdditionOpContext.class,i);
		}
		public AdditionExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_additionExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof zigListener ) ((zigListener)listener).enterAdditionExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof zigListener ) ((zigListener)listener).exitAdditionExpr(this);
		}
	}

	public final AdditionExprContext additionExpr() throws RecognitionException {
		AdditionExprContext _localctx = new AdditionExprContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_additionExpr);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(480);
			multiplyExpr();
			setState(486);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,58,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(481);
					additionOp();
					setState(482);
					multiplyExpr();
					}
					} 
				}
				setState(488);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,58,_ctx);
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

	public static class MultiplyExprContext extends ParserRuleContext {
		public List<PrefixExprContext> prefixExpr() {
			return getRuleContexts(PrefixExprContext.class);
		}
		public PrefixExprContext prefixExpr(int i) {
			return getRuleContext(PrefixExprContext.class,i);
		}
		public List<MultiplyOpContext> multiplyOp() {
			return getRuleContexts(MultiplyOpContext.class);
		}
		public MultiplyOpContext multiplyOp(int i) {
			return getRuleContext(MultiplyOpContext.class,i);
		}
		public MultiplyExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplyExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof zigListener ) ((zigListener)listener).enterMultiplyExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof zigListener ) ((zigListener)listener).exitMultiplyExpr(this);
		}
	}

	public final MultiplyExprContext multiplyExpr() throws RecognitionException {
		MultiplyExprContext _localctx = new MultiplyExprContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_multiplyExpr);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(489);
			prefixExpr();
			setState(495);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,59,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(490);
					multiplyOp();
					setState(491);
					prefixExpr();
					}
					} 
				}
				setState(497);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,59,_ctx);
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

	public static class PrefixExprContext extends ParserRuleContext {
		public PrimaryExprContext primaryExpr() {
			return getRuleContext(PrimaryExprContext.class,0);
		}
		public List<PrefixOpContext> prefixOp() {
			return getRuleContexts(PrefixOpContext.class);
		}
		public PrefixOpContext prefixOp(int i) {
			return getRuleContext(PrefixOpContext.class,i);
		}
		public PrefixExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prefixExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof zigListener ) ((zigListener)listener).enterPrefixExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof zigListener ) ((zigListener)listener).exitPrefixExpr(this);
		}
	}

	public final PrefixExprContext prefixExpr() throws RecognitionException {
		PrefixExprContext _localctx = new PrefixExprContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_prefixExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(501);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD_AWAIT) | (1L << KEYWORD_TRY) | (1L << AMPERSAND))) != 0) || ((((_la - 78)) & ~0x3f) == 0 && ((1L << (_la - 78)) & ((1L << (EXCLAMATIONMARK - 78)) | (1L << (MINUS - 78)) | (1L << (MINUSPERCENT - 78)) | (1L << (TILDE - 78)))) != 0)) {
				{
				{
				setState(498);
				prefixOp();
				}
				}
				setState(503);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(504);
			primaryExpr();
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

	public static class PrimaryExprContext extends ParserRuleContext {
		public AsmExprContext asmExpr() {
			return getRuleContext(AsmExprContext.class,0);
		}
		public IfExprContext ifExpr() {
			return getRuleContext(IfExprContext.class,0);
		}
		public TerminalNode KEYWORD_BREAK() { return getToken(zigParser.KEYWORD_BREAK, 0); }
		public BreakLabelContext breakLabel() {
			return getRuleContext(BreakLabelContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode KEYWORD_COMPTIME() { return getToken(zigParser.KEYWORD_COMPTIME, 0); }
		public TerminalNode KEYWORD_NOSUSPEND() { return getToken(zigParser.KEYWORD_NOSUSPEND, 0); }
		public TerminalNode KEYWORD_CONTINUE() { return getToken(zigParser.KEYWORD_CONTINUE, 0); }
		public TerminalNode KEYWORD_RESUME() { return getToken(zigParser.KEYWORD_RESUME, 0); }
		public TerminalNode KEYWORD_RETERN() { return getToken(zigParser.KEYWORD_RETERN, 0); }
		public LoopExprContext loopExpr() {
			return getRuleContext(LoopExprContext.class,0);
		}
		public BlockLabelContext blockLabel() {
			return getRuleContext(BlockLabelContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public CurlysuffixExprContext curlysuffixExpr() {
			return getRuleContext(CurlysuffixExprContext.class,0);
		}
		public PrimaryExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof zigListener ) ((zigListener)listener).enterPrimaryExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof zigListener ) ((zigListener)listener).exitPrimaryExpr(this);
		}
	}

	public final PrimaryExprContext primaryExpr() throws RecognitionException {
		PrimaryExprContext _localctx = new PrimaryExprContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_primaryExpr);
		int _la;
		try {
			setState(535);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,66,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(506);
				asmExpr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(507);
				ifExpr();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(508);
				match(KEYWORD_BREAK);
				setState(510);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,61,_ctx) ) {
				case 1:
					{
					setState(509);
					breakLabel();
					}
					break;
				}
				setState(513);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,62,_ctx) ) {
				case 1:
					{
					setState(512);
					expr();
					}
					break;
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(515);
				match(KEYWORD_COMPTIME);
				setState(516);
				expr();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(517);
				match(KEYWORD_NOSUSPEND);
				setState(518);
				expr();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(519);
				match(KEYWORD_CONTINUE);
				setState(521);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,63,_ctx) ) {
				case 1:
					{
					setState(520);
					breakLabel();
					}
					break;
				}
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(523);
				match(KEYWORD_RESUME);
				setState(524);
				expr();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(525);
				match(KEYWORD_RETERN);
				setState(527);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,64,_ctx) ) {
				case 1:
					{
					setState(526);
					expr();
					}
					break;
				}
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(530);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IDENTIFIER) {
					{
					setState(529);
					blockLabel();
					}
				}

				setState(532);
				loopExpr();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(533);
				block();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(534);
				curlysuffixExpr();
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

	public static class IfExprContext extends ParserRuleContext {
		public IfPrefixContext ifPrefix() {
			return getRuleContext(IfPrefixContext.class,0);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode KEYWORD_ELSE() { return getToken(zigParser.KEYWORD_ELSE, 0); }
		public PayloadContext payload() {
			return getRuleContext(PayloadContext.class,0);
		}
		public IfExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof zigListener ) ((zigListener)listener).enterIfExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof zigListener ) ((zigListener)listener).exitIfExpr(this);
		}
	}

	public final IfExprContext ifExpr() throws RecognitionException {
		IfExprContext _localctx = new IfExprContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_ifExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(537);
			ifPrefix();
			setState(538);
			expr();
			setState(544);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,68,_ctx) ) {
			case 1:
				{
				setState(539);
				match(KEYWORD_ELSE);
				setState(541);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PIPE) {
					{
					setState(540);
					payload();
					}
				}

				setState(543);
				expr();
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

	public static class BlockContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(zigParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(zigParser.RBRACE, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof zigListener ) ((zigListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof zigListener ) ((zigListener)listener).exitBlock(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(546);
			match(LBRACE);
			setState(550);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD_ANYFRAME) | (1L << KEYWORD_ASM) | (1L << KEYWORD_ASYNC) | (1L << KEYWORD_AWAIT) | (1L << KEYWORD_BREAK) | (1L << KEYWORD_COMPTIME) | (1L << KEYWORD_CONST) | (1L << KEYWORD_CONTINUE) | (1L << KEYWORD_DEFER) | (1L << KEYWORD_ENUM) | (1L << KEYWORD_ERRDEFER) | (1L << KEYWORD_ERROR) | (1L << KEYWORD_EXTERN) | (1L << KEYWORD_FN) | (1L << KEYWORD_FOR) | (1L << KEYWORD_IF) | (1L << KEYWORD_INLINE) | (1L << KEYWORD_NOSUSPEND) | (1L << KEYWORD_OPAQUE) | (1L << KEYWORD_PACKED) | (1L << KEYWORD_RESUME) | (1L << KEYWORD_RETERN) | (1L << KEYWORD_STRUCT) | (1L << KEYWORD_SUSPEND) | (1L << KEYWORD_SWITCH) | (1L << KEYWORD_TRY) | (1L << KEYWORD_UNION) | (1L << KEYWORD_UNREACHABLE) | (1L << KEYWORD_VAR) | (1L << KEYWORD_WHILE) | (1L << CHAR_LITERAL) | (1L << FLOAT) | (1L << INTEGER) | (1L << STRINGLITERAL) | (1L << IDENTIFIER) | (1L << BUILTINIDENTIFIER) | (1L << AMPERSAND) | (1L << ASTERISK) | (1L << ASTERISK2))) != 0) || ((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & ((1L << (DOT - 70)) | (1L << (EXCLAMATIONMARK - 70)) | (1L << (LBRACE - 70)) | (1L << (LBRACKET - 70)) | (1L << (LPAREN - 70)) | (1L << (MINUS - 70)) | (1L << (MINUSPERCENT - 70)) | (1L << (QUESTIONMARK - 70)) | (1L << (TILDE - 70)))) != 0)) {
				{
				{
				setState(547);
				statement();
				}
				}
				setState(552);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(553);
			match(RBRACE);
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

	public static class LoopExprContext extends ParserRuleContext {
		public ForExprContext forExpr() {
			return getRuleContext(ForExprContext.class,0);
		}
		public WhileExprContext whileExpr() {
			return getRuleContext(WhileExprContext.class,0);
		}
		public TerminalNode KEYWORD_INLINE() { return getToken(zigParser.KEYWORD_INLINE, 0); }
		public LoopExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loopExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof zigListener ) ((zigListener)listener).enterLoopExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof zigListener ) ((zigListener)listener).exitLoopExpr(this);
		}
	}

	public final LoopExprContext loopExpr() throws RecognitionException {
		LoopExprContext _localctx = new LoopExprContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_loopExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(556);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KEYWORD_INLINE) {
				{
				setState(555);
				match(KEYWORD_INLINE);
				}
			}

			setState(560);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KEYWORD_FOR:
				{
				setState(558);
				forExpr();
				}
				break;
			case KEYWORD_WHILE:
				{
				setState(559);
				whileExpr();
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

	public static class ForExprContext extends ParserRuleContext {
		public ForPrefixContext forPrefix() {
			return getRuleContext(ForPrefixContext.class,0);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode KEYWORD_ELSE() { return getToken(zigParser.KEYWORD_ELSE, 0); }
		public ForExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof zigListener ) ((zigListener)listener).enterForExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof zigListener ) ((zigListener)listener).exitForExpr(this);
		}
	}

	public final ForExprContext forExpr() throws RecognitionException {
		ForExprContext _localctx = new ForExprContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_forExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(562);
			forPrefix();
			setState(563);
			expr();
			setState(566);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,72,_ctx) ) {
			case 1:
				{
				setState(564);
				match(KEYWORD_ELSE);
				setState(565);
				expr();
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

	public static class WhileExprContext extends ParserRuleContext {
		public WhilePrefixContext whilePrefix() {
			return getRuleContext(WhilePrefixContext.class,0);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode KEYWORD_ELSE() { return getToken(zigParser.KEYWORD_ELSE, 0); }
		public PayloadContext payload() {
			return getRuleContext(PayloadContext.class,0);
		}
		public WhileExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof zigListener ) ((zigListener)listener).enterWhileExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof zigListener ) ((zigListener)listener).exitWhileExpr(this);
		}
	}

	public final WhileExprContext whileExpr() throws RecognitionException {
		WhileExprContext _localctx = new WhileExprContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_whileExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(568);
			whilePrefix();
			setState(569);
			expr();
			setState(575);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,74,_ctx) ) {
			case 1:
				{
				setState(570);
				match(KEYWORD_ELSE);
				setState(572);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PIPE) {
					{
					setState(571);
					payload();
					}
				}

				setState(574);
				expr();
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

	public static class CurlysuffixExprContext extends ParserRuleContext {
		public TypeExprContext typeExpr() {
			return getRuleContext(TypeExprContext.class,0);
		}
		public InitListContext initList() {
			return getRuleContext(InitListContext.class,0);
		}
		public CurlysuffixExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_curlysuffixExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof zigListener ) ((zigListener)listener).enterCurlysuffixExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof zigListener ) ((zigListener)listener).exitCurlysuffixExpr(this);
		}
	}

	public final CurlysuffixExprContext curlysuffixExpr() throws RecognitionException {
		CurlysuffixExprContext _localctx = new CurlysuffixExprContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_curlysuffixExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(577);
			typeExpr();
			setState(579);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LBRACE) {
				{
				setState(578);
				initList();
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

	public static class InitListContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(zigParser.LBRACE, 0); }
		public List<FieldInitContext> fieldInit() {
			return getRuleContexts(FieldInitContext.class);
		}
		public FieldInitContext fieldInit(int i) {
			return getRuleContext(FieldInitContext.class,i);
		}
		public TerminalNode RBRACE() { return getToken(zigParser.RBRACE, 0); }
		public List<TerminalNode> COMMA() { return getTokens(zigParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(zigParser.COMMA, i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public InitListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof zigListener ) ((zigListener)listener).enterInitList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof zigListener ) ((zigListener)listener).exitInitList(this);
		}
	}

	public final InitListContext initList() throws RecognitionException {
		InitListContext _localctx = new InitListContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_initList);
		int _la;
		try {
			int _alt;
			setState(611);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,80,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(581);
				match(LBRACE);
				setState(582);
				fieldInit();
				setState(587);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,76,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(583);
						match(COMMA);
						setState(584);
						fieldInit();
						}
						} 
					}
					setState(589);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,76,_ctx);
				}
				setState(591);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(590);
					match(COMMA);
					}
				}

				setState(593);
				match(RBRACE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(595);
				match(LBRACE);
				setState(596);
				expr();
				setState(601);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,78,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(597);
						match(COMMA);
						setState(598);
						expr();
						}
						} 
					}
					setState(603);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,78,_ctx);
				}
				setState(605);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(604);
					match(COMMA);
					}
				}

				setState(607);
				match(RBRACE);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(609);
				match(LBRACE);
				setState(610);
				match(RBRACE);
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

	public static class TypeExprContext extends ParserRuleContext {
		public ErrorUnionExprContext errorUnionExpr() {
			return getRuleContext(ErrorUnionExprContext.class,0);
		}
		public List<PrefixTypeOpContext> prefixTypeOp() {
			return getRuleContexts(PrefixTypeOpContext.class);
		}
		public PrefixTypeOpContext prefixTypeOp(int i) {
			return getRuleContext(PrefixTypeOpContext.class,i);
		}
		public TypeExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof zigListener ) ((zigListener)listener).enterTypeExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof zigListener ) ((zigListener)listener).exitTypeExpr(this);
		}
	}

	public final TypeExprContext typeExpr() throws RecognitionException {
		TypeExprContext _localctx = new TypeExprContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_typeExpr);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(616);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,81,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(613);
					prefixTypeOp();
					}
					} 
				}
				setState(618);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,81,_ctx);
			}
			setState(619);
			errorUnionExpr();
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

	public static class ErrorUnionExprContext extends ParserRuleContext {
		public SuffixExprContext suffixExpr() {
			return getRuleContext(SuffixExprContext.class,0);
		}
		public TerminalNode EXCLAMATIONMARK() { return getToken(zigParser.EXCLAMATIONMARK, 0); }
		public TypeExprContext typeExpr() {
			return getRuleContext(TypeExprContext.class,0);
		}
		public ErrorUnionExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_errorUnionExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof zigListener ) ((zigListener)listener).enterErrorUnionExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof zigListener ) ((zigListener)listener).exitErrorUnionExpr(this);
		}
	}

	public final ErrorUnionExprContext errorUnionExpr() throws RecognitionException {
		ErrorUnionExprContext _localctx = new ErrorUnionExprContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_errorUnionExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(621);
			suffixExpr();
			setState(624);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,82,_ctx) ) {
			case 1:
				{
				setState(622);
				match(EXCLAMATIONMARK);
				setState(623);
				typeExpr();
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

	public static class SuffixExprContext extends ParserRuleContext {
		public TerminalNode KEYWORD_ASYNC() { return getToken(zigParser.KEYWORD_ASYNC, 0); }
		public PrimaryTypeExprContext primaryTypeExpr() {
			return getRuleContext(PrimaryTypeExprContext.class,0);
		}
		public List<FnCallArgumentsContext> fnCallArguments() {
			return getRuleContexts(FnCallArgumentsContext.class);
		}
		public FnCallArgumentsContext fnCallArguments(int i) {
			return getRuleContext(FnCallArgumentsContext.class,i);
		}
		public List<SuffixOpContext> suffixOp() {
			return getRuleContexts(SuffixOpContext.class);
		}
		public SuffixOpContext suffixOp(int i) {
			return getRuleContext(SuffixOpContext.class,i);
		}
		public SuffixExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_suffixExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof zigListener ) ((zigListener)listener).enterSuffixExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof zigListener ) ((zigListener)listener).exitSuffixExpr(this);
		}
	}

	public final SuffixExprContext suffixExpr() throws RecognitionException {
		SuffixExprContext _localctx = new SuffixExprContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_suffixExpr);
		int _la;
		try {
			int _alt;
			setState(644);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KEYWORD_ASYNC:
				enterOuterAlt(_localctx, 1);
				{
				setState(626);
				match(KEYWORD_ASYNC);
				setState(627);
				primaryTypeExpr();
				setState(631);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & ((1L << (DOT - 70)) | (1L << (DOTASTERISK - 70)) | (1L << (DOTQUESTIONMARK - 70)) | (1L << (LBRACKET - 70)))) != 0)) {
					{
					{
					setState(628);
					suffixOp();
					}
					}
					setState(633);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(634);
				fnCallArguments();
				}
				break;
			case KEYWORD_ANYFRAME:
			case KEYWORD_COMPTIME:
			case KEYWORD_ENUM:
			case KEYWORD_ERROR:
			case KEYWORD_EXTERN:
			case KEYWORD_FN:
			case KEYWORD_FOR:
			case KEYWORD_IF:
			case KEYWORD_INLINE:
			case KEYWORD_OPAQUE:
			case KEYWORD_PACKED:
			case KEYWORD_STRUCT:
			case KEYWORD_SWITCH:
			case KEYWORD_UNION:
			case KEYWORD_UNREACHABLE:
			case KEYWORD_WHILE:
			case CHAR_LITERAL:
			case FLOAT:
			case INTEGER:
			case STRINGLITERAL:
			case IDENTIFIER:
			case BUILTINIDENTIFIER:
			case DOT:
			case LPAREN:
				enterOuterAlt(_localctx, 2);
				{
				setState(636);
				primaryTypeExpr();
				setState(641);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,85,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						setState(639);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case DOT:
						case DOTASTERISK:
						case DOTQUESTIONMARK:
						case LBRACKET:
							{
							setState(637);
							suffixOp();
							}
							break;
						case LPAREN:
							{
							setState(638);
							fnCallArguments();
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						} 
					}
					setState(643);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,85,_ctx);
				}
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

	public static class PrimaryTypeExprContext extends ParserRuleContext {
		public TerminalNode BUILTINIDENTIFIER() { return getToken(zigParser.BUILTINIDENTIFIER, 0); }
		public FnCallArgumentsContext fnCallArguments() {
			return getRuleContext(FnCallArgumentsContext.class,0);
		}
		public TerminalNode CHAR_LITERAL() { return getToken(zigParser.CHAR_LITERAL, 0); }
		public ContainerDeclContext containerDecl() {
			return getRuleContext(ContainerDeclContext.class,0);
		}
		public TerminalNode DOT() { return getToken(zigParser.DOT, 0); }
		public TerminalNode IDENTIFIER() { return getToken(zigParser.IDENTIFIER, 0); }
		public InitListContext initList() {
			return getRuleContext(InitListContext.class,0);
		}
		public ErrorSetDeclContext errorSetDecl() {
			return getRuleContext(ErrorSetDeclContext.class,0);
		}
		public TerminalNode FLOAT() { return getToken(zigParser.FLOAT, 0); }
		public FnProtoContext fnProto() {
			return getRuleContext(FnProtoContext.class,0);
		}
		public GroupedExprContext groupedExpr() {
			return getRuleContext(GroupedExprContext.class,0);
		}
		public LabeledTypeExprContext labeledTypeExpr() {
			return getRuleContext(LabeledTypeExprContext.class,0);
		}
		public IfTypeExprContext ifTypeExpr() {
			return getRuleContext(IfTypeExprContext.class,0);
		}
		public TerminalNode INTEGER() { return getToken(zigParser.INTEGER, 0); }
		public TerminalNode KEYWORD_COMPTIME() { return getToken(zigParser.KEYWORD_COMPTIME, 0); }
		public TypeExprContext typeExpr() {
			return getRuleContext(TypeExprContext.class,0);
		}
		public TerminalNode KEYWORD_ERROR() { return getToken(zigParser.KEYWORD_ERROR, 0); }
		public TerminalNode KEYWORD_ANYFRAME() { return getToken(zigParser.KEYWORD_ANYFRAME, 0); }
		public TerminalNode KEYWORD_UNREACHABLE() { return getToken(zigParser.KEYWORD_UNREACHABLE, 0); }
		public TerminalNode STRINGLITERAL() { return getToken(zigParser.STRINGLITERAL, 0); }
		public SwitchExprContext switchExpr() {
			return getRuleContext(SwitchExprContext.class,0);
		}
		public PrimaryTypeExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryTypeExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof zigListener ) ((zigListener)listener).enterPrimaryTypeExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof zigListener ) ((zigListener)listener).exitPrimaryTypeExpr(this);
		}
	}

	public final PrimaryTypeExprContext primaryTypeExpr() throws RecognitionException {
		PrimaryTypeExprContext _localctx = new PrimaryTypeExprContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_primaryTypeExpr);
		try {
			setState(671);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,87,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(646);
				match(BUILTINIDENTIFIER);
				setState(647);
				fnCallArguments();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(648);
				match(CHAR_LITERAL);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(649);
				containerDecl();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(650);
				match(DOT);
				setState(651);
				match(IDENTIFIER);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(652);
				match(DOT);
				setState(653);
				initList();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(654);
				errorSetDecl();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(655);
				match(FLOAT);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(656);
				fnProto();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(657);
				groupedExpr();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(658);
				labeledTypeExpr();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(659);
				match(IDENTIFIER);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(660);
				ifTypeExpr();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(661);
				match(INTEGER);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(662);
				match(KEYWORD_COMPTIME);
				setState(663);
				typeExpr();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(664);
				match(KEYWORD_ERROR);
				setState(665);
				match(DOT);
				setState(666);
				match(IDENTIFIER);
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(667);
				match(KEYWORD_ANYFRAME);
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(668);
				match(KEYWORD_UNREACHABLE);
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(669);
				match(STRINGLITERAL);
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(670);
				switchExpr();
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

	public static class ContainerDeclContext extends ParserRuleContext {
		public ContainerDeclAutoContext containerDeclAuto() {
			return getRuleContext(ContainerDeclAutoContext.class,0);
		}
		public TerminalNode KEYWORD_EXTERN() { return getToken(zigParser.KEYWORD_EXTERN, 0); }
		public TerminalNode KEYWORD_PACKED() { return getToken(zigParser.KEYWORD_PACKED, 0); }
		public ContainerDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_containerDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof zigListener ) ((zigListener)listener).enterContainerDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof zigListener ) ((zigListener)listener).exitContainerDecl(this);
		}
	}

	public final ContainerDeclContext containerDecl() throws RecognitionException {
		ContainerDeclContext _localctx = new ContainerDeclContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_containerDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(674);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KEYWORD_EXTERN || _la==KEYWORD_PACKED) {
				{
				setState(673);
				_la = _input.LA(1);
				if ( !(_la==KEYWORD_EXTERN || _la==KEYWORD_PACKED) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(676);
			containerDeclAuto();
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

	public static class ErrorSetDeclContext extends ParserRuleContext {
		public TerminalNode KEYWORD_ERROR() { return getToken(zigParser.KEYWORD_ERROR, 0); }
		public TerminalNode LBRACE() { return getToken(zigParser.LBRACE, 0); }
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(zigParser.RBRACE, 0); }
		public ErrorSetDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_errorSetDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof zigListener ) ((zigListener)listener).enterErrorSetDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof zigListener ) ((zigListener)listener).exitErrorSetDecl(this);
		}
	}

	public final ErrorSetDeclContext errorSetDecl() throws RecognitionException {
		ErrorSetDeclContext _localctx = new ErrorSetDeclContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_errorSetDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(678);
			match(KEYWORD_ERROR);
			setState(679);
			match(LBRACE);
			setState(680);
			identifierList();
			setState(681);
			match(RBRACE);
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

	public static class GroupedExprContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(zigParser.LPAREN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(zigParser.RPAREN, 0); }
		public GroupedExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_groupedExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof zigListener ) ((zigListener)listener).enterGroupedExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof zigListener ) ((zigListener)listener).exitGroupedExpr(this);
		}
	}

	public final GroupedExprContext groupedExpr() throws RecognitionException {
		GroupedExprContext _localctx = new GroupedExprContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_groupedExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(683);
			match(LPAREN);
			setState(684);
			expr();
			setState(685);
			match(RPAREN);
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

	public static class IfTypeExprContext extends ParserRuleContext {
		public IfPrefixContext ifPrefix() {
			return getRuleContext(IfPrefixContext.class,0);
		}
		public List<TypeExprContext> typeExpr() {
			return getRuleContexts(TypeExprContext.class);
		}
		public TypeExprContext typeExpr(int i) {
			return getRuleContext(TypeExprContext.class,i);
		}
		public TerminalNode KEYWORD_ELSE() { return getToken(zigParser.KEYWORD_ELSE, 0); }
		public PayloadContext payload() {
			return getRuleContext(PayloadContext.class,0);
		}
		public IfTypeExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifTypeExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof zigListener ) ((zigListener)listener).enterIfTypeExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof zigListener ) ((zigListener)listener).exitIfTypeExpr(this);
		}
	}

	public final IfTypeExprContext ifTypeExpr() throws RecognitionException {
		IfTypeExprContext _localctx = new IfTypeExprContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_ifTypeExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(687);
			ifPrefix();
			setState(688);
			typeExpr();
			setState(694);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,90,_ctx) ) {
			case 1:
				{
				setState(689);
				match(KEYWORD_ELSE);
				setState(691);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PIPE) {
					{
					setState(690);
					payload();
					}
				}

				setState(693);
				typeExpr();
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

	public static class LabeledTypeExprContext extends ParserRuleContext {
		public BlockLabelContext blockLabel() {
			return getRuleContext(BlockLabelContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public LoopTypeExprContext loopTypeExpr() {
			return getRuleContext(LoopTypeExprContext.class,0);
		}
		public LabeledTypeExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_labeledTypeExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof zigListener ) ((zigListener)listener).enterLabeledTypeExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof zigListener ) ((zigListener)listener).exitLabeledTypeExpr(this);
		}
	}

	public final LabeledTypeExprContext labeledTypeExpr() throws RecognitionException {
		LabeledTypeExprContext _localctx = new LabeledTypeExprContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_labeledTypeExpr);
		int _la;
		try {
			setState(703);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,92,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(696);
				blockLabel();
				setState(697);
				block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(700);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IDENTIFIER) {
					{
					setState(699);
					blockLabel();
					}
				}

				setState(702);
				loopTypeExpr();
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

	public static class LoopTypeExprContext extends ParserRuleContext {
		public ForTypeExprContext forTypeExpr() {
			return getRuleContext(ForTypeExprContext.class,0);
		}
		public WhileTypeExprContext whileTypeExpr() {
			return getRuleContext(WhileTypeExprContext.class,0);
		}
		public TerminalNode KEYWORD_INLINE() { return getToken(zigParser.KEYWORD_INLINE, 0); }
		public LoopTypeExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loopTypeExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof zigListener ) ((zigListener)listener).enterLoopTypeExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof zigListener ) ((zigListener)listener).exitLoopTypeExpr(this);
		}
	}

	public final LoopTypeExprContext loopTypeExpr() throws RecognitionException {
		LoopTypeExprContext _localctx = new LoopTypeExprContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_loopTypeExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(706);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KEYWORD_INLINE) {
				{
				setState(705);
				match(KEYWORD_INLINE);
				}
			}

			setState(710);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KEYWORD_FOR:
				{
				setState(708);
				forTypeExpr();
				}
				break;
			case KEYWORD_WHILE:
				{
				setState(709);
				whileTypeExpr();
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

	public static class ForTypeExprContext extends ParserRuleContext {
		public ForPrefixContext forPrefix() {
			return getRuleContext(ForPrefixContext.class,0);
		}
		public List<TypeExprContext> typeExpr() {
			return getRuleContexts(TypeExprContext.class);
		}
		public TypeExprContext typeExpr(int i) {
			return getRuleContext(TypeExprContext.class,i);
		}
		public TerminalNode KEYWORD_ELSE() { return getToken(zigParser.KEYWORD_ELSE, 0); }
		public ForTypeExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forTypeExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof zigListener ) ((zigListener)listener).enterForTypeExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof zigListener ) ((zigListener)listener).exitForTypeExpr(this);
		}
	}

	public final ForTypeExprContext forTypeExpr() throws RecognitionException {
		ForTypeExprContext _localctx = new ForTypeExprContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_forTypeExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(712);
			forPrefix();
			setState(713);
			typeExpr();
			setState(716);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,95,_ctx) ) {
			case 1:
				{
				setState(714);
				match(KEYWORD_ELSE);
				setState(715);
				typeExpr();
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

	public static class WhileTypeExprContext extends ParserRuleContext {
		public WhilePrefixContext whilePrefix() {
			return getRuleContext(WhilePrefixContext.class,0);
		}
		public List<TypeExprContext> typeExpr() {
			return getRuleContexts(TypeExprContext.class);
		}
		public TypeExprContext typeExpr(int i) {
			return getRuleContext(TypeExprContext.class,i);
		}
		public TerminalNode KEYWORD_ELSE() { return getToken(zigParser.KEYWORD_ELSE, 0); }
		public PayloadContext payload() {
			return getRuleContext(PayloadContext.class,0);
		}
		public WhileTypeExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileTypeExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof zigListener ) ((zigListener)listener).enterWhileTypeExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof zigListener ) ((zigListener)listener).exitWhileTypeExpr(this);
		}
	}

	public final WhileTypeExprContext whileTypeExpr() throws RecognitionException {
		WhileTypeExprContext _localctx = new WhileTypeExprContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_whileTypeExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(718);
			whilePrefix();
			setState(719);
			typeExpr();
			setState(725);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,97,_ctx) ) {
			case 1:
				{
				setState(720);
				match(KEYWORD_ELSE);
				setState(722);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PIPE) {
					{
					setState(721);
					payload();
					}
				}

				setState(724);
				typeExpr();
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

	public static class SwitchExprContext extends ParserRuleContext {
		public TerminalNode KEYWORD_SWITCH() { return getToken(zigParser.KEYWORD_SWITCH, 0); }
		public TerminalNode LPAREN() { return getToken(zigParser.LPAREN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(zigParser.RPAREN, 0); }
		public TerminalNode LBRACE() { return getToken(zigParser.LBRACE, 0); }
		public SwitchProngListContext switchProngList() {
			return getRuleContext(SwitchProngListContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(zigParser.RBRACE, 0); }
		public SwitchExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof zigListener ) ((zigListener)listener).enterSwitchExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof zigListener ) ((zigListener)listener).exitSwitchExpr(this);
		}
	}

	public final SwitchExprContext switchExpr() throws RecognitionException {
		SwitchExprContext _localctx = new SwitchExprContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_switchExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(727);
			match(KEYWORD_SWITCH);
			setState(728);
			match(LPAREN);
			setState(729);
			expr();
			setState(730);
			match(RPAREN);
			setState(731);
			match(LBRACE);
			setState(732);
			switchProngList();
			setState(733);
			match(RBRACE);
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

	public static class AsmExprContext extends ParserRuleContext {
		public TerminalNode KEYWORD_ASM() { return getToken(zigParser.KEYWORD_ASM, 0); }
		public TerminalNode LPAREN() { return getToken(zigParser.LPAREN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(zigParser.RPAREN, 0); }
		public TerminalNode KEYWORD_VOLATILE() { return getToken(zigParser.KEYWORD_VOLATILE, 0); }
		public AsmOutputContext asmOutput() {
			return getRuleContext(AsmOutputContext.class,0);
		}
		public AsmExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asmExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof zigListener ) ((zigListener)listener).enterAsmExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof zigListener ) ((zigListener)listener).exitAsmExpr(this);
		}
	}

	public final AsmExprContext asmExpr() throws RecognitionException {
		AsmExprContext _localctx = new AsmExprContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_asmExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(735);
			match(KEYWORD_ASM);
			setState(737);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KEYWORD_VOLATILE) {
				{
				setState(736);
				match(KEYWORD_VOLATILE);
				}
			}

			setState(739);
			match(LPAREN);
			setState(740);
			expr();
			setState(742);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(741);
				asmOutput();
				}
			}

			setState(744);
			match(RPAREN);
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

	public static class AsmOutputContext extends ParserRuleContext {
		public TerminalNode COLON() { return getToken(zigParser.COLON, 0); }
		public AsmOutputListContext asmOutputList() {
			return getRuleContext(AsmOutputListContext.class,0);
		}
		public AsmInputContext asmInput() {
			return getRuleContext(AsmInputContext.class,0);
		}
		public AsmOutputContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asmOutput; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof zigListener ) ((zigListener)listener).enterAsmOutput(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof zigListener ) ((zigListener)listener).exitAsmOutput(this);
		}
	}

	public final AsmOutputContext asmOutput() throws RecognitionException {
		AsmOutputContext _localctx = new AsmOutputContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_asmOutput);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(746);
			match(COLON);
			setState(747);
			asmOutputList();
			setState(749);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(748);
				asmInput();
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

	public static class AsmOutputItemContext extends ParserRuleContext {
		public TerminalNode LBRACKET() { return getToken(zigParser.LBRACKET, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(zigParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(zigParser.IDENTIFIER, i);
		}
		public TerminalNode RBRACKET() { return getToken(zigParser.RBRACKET, 0); }
		public TerminalNode STRINGLITERAL() { return getToken(zigParser.STRINGLITERAL, 0); }
		public TerminalNode LPAREN() { return getToken(zigParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(zigParser.RPAREN, 0); }
		public TerminalNode MINUSRARROW() { return getToken(zigParser.MINUSRARROW, 0); }
		public TypeExprContext typeExpr() {
			return getRuleContext(TypeExprContext.class,0);
		}
		public AsmOutputItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asmOutputItem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof zigListener ) ((zigListener)listener).enterAsmOutputItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof zigListener ) ((zigListener)listener).exitAsmOutputItem(this);
		}
	}

	public final AsmOutputItemContext asmOutputItem() throws RecognitionException {
		AsmOutputItemContext _localctx = new AsmOutputItemContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_asmOutputItem);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(751);
			match(LBRACKET);
			setState(752);
			match(IDENTIFIER);
			setState(753);
			match(RBRACKET);
			setState(754);
			match(STRINGLITERAL);
			setState(755);
			match(LPAREN);
			setState(759);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MINUSRARROW:
				{
				setState(756);
				match(MINUSRARROW);
				setState(757);
				typeExpr();
				}
				break;
			case IDENTIFIER:
				{
				setState(758);
				match(IDENTIFIER);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(761);
			match(RPAREN);
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

	public static class AsmInputContext extends ParserRuleContext {
		public TerminalNode COLON() { return getToken(zigParser.COLON, 0); }
		public AsmInputListContext asmInputList() {
			return getRuleContext(AsmInputListContext.class,0);
		}
		public AsmClobbersContext asmClobbers() {
			return getRuleContext(AsmClobbersContext.class,0);
		}
		public AsmInputContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asmInput; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof zigListener ) ((zigListener)listener).enterAsmInput(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof zigListener ) ((zigListener)listener).exitAsmInput(this);
		}
	}

	public final AsmInputContext asmInput() throws RecognitionException {
		AsmInputContext _localctx = new AsmInputContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_asmInput);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(763);
			match(COLON);
			setState(764);
			asmInputList();
			setState(766);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(765);
				asmClobbers();
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

	public static class AsmInputItemContext extends ParserRuleContext {
		public TerminalNode LBRACKET() { return getToken(zigParser.LBRACKET, 0); }
		public TerminalNode IDENTIFIER() { return getToken(zigParser.IDENTIFIER, 0); }
		public TerminalNode RBRACKET() { return getToken(zigParser.RBRACKET, 0); }
		public TerminalNode STRINGLITERAL() { return getToken(zigParser.STRINGLITERAL, 0); }
		public TerminalNode LPAREN() { return getToken(zigParser.LPAREN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(zigParser.RPAREN, 0); }
		public AsmInputItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asmInputItem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof zigListener ) ((zigListener)listener).enterAsmInputItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof zigListener ) ((zigListener)listener).exitAsmInputItem(this);
		}
	}

	public final AsmInputItemContext asmInputItem() throws RecognitionException {
		AsmInputItemContext _localctx = new AsmInputItemContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_asmInputItem);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(768);
			match(LBRACKET);
			setState(769);
			match(IDENTIFIER);
			setState(770);
			match(RBRACKET);
			setState(771);
			match(STRINGLITERAL);
			setState(772);
			match(LPAREN);
			setState(773);
			expr();
			setState(774);
			match(RPAREN);
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

	public static class AsmClobbersContext extends ParserRuleContext {
		public TerminalNode COLON() { return getToken(zigParser.COLON, 0); }
		public StringListContext stringList() {
			return getRuleContext(StringListContext.class,0);
		}
		public AsmClobbersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asmClobbers; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof zigListener ) ((zigListener)listener).enterAsmClobbers(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof zigListener ) ((zigListener)listener).exitAsmClobbers(this);
		}
	}

	public final AsmClobbersContext asmClobbers() throws RecognitionException {
		AsmClobbersContext _localctx = new AsmClobbersContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_asmClobbers);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(776);
			match(COLON);
			setState(777);
			stringList();
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

	public static class BreakLabelContext extends ParserRuleContext {
		public TerminalNode COLON() { return getToken(zigParser.COLON, 0); }
		public TerminalNode IDENTIFIER() { return getToken(zigParser.IDENTIFIER, 0); }
		public BreakLabelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_breakLabel; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof zigListener ) ((zigListener)listener).enterBreakLabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof zigListener ) ((zigListener)listener).exitBreakLabel(this);
		}
	}

	public final BreakLabelContext breakLabel() throws RecognitionException {
		BreakLabelContext _localctx = new BreakLabelContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_breakLabel);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(779);
			match(COLON);
			setState(780);
			match(IDENTIFIER);
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

	public static class BlockLabelContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(zigParser.IDENTIFIER, 0); }
		public TerminalNode COLON() { return getToken(zigParser.COLON, 0); }
		public BlockLabelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockLabel; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof zigListener ) ((zigListener)listener).enterBlockLabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof zigListener ) ((zigListener)listener).exitBlockLabel(this);
		}
	}

	public final BlockLabelContext blockLabel() throws RecognitionException {
		BlockLabelContext _localctx = new BlockLabelContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_blockLabel);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(782);
			match(IDENTIFIER);
			setState(783);
			match(COLON);
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

	public static class FieldInitContext extends ParserRuleContext {
		public TerminalNode DOT() { return getToken(zigParser.DOT, 0); }
		public TerminalNode IDENTIFIER() { return getToken(zigParser.IDENTIFIER, 0); }
		public TerminalNode EQUAL() { return getToken(zigParser.EQUAL, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public FieldInitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldInit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof zigListener ) ((zigListener)listener).enterFieldInit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof zigListener ) ((zigListener)listener).exitFieldInit(this);
		}
	}

	public final FieldInitContext fieldInit() throws RecognitionException {
		FieldInitContext _localctx = new FieldInitContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_fieldInit);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(785);
			match(DOT);
			setState(786);
			match(IDENTIFIER);
			setState(787);
			match(EQUAL);
			setState(788);
			expr();
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

	public static class WhileContinueExprContext extends ParserRuleContext {
		public TerminalNode COLON() { return getToken(zigParser.COLON, 0); }
		public TerminalNode LPAREN() { return getToken(zigParser.LPAREN, 0); }
		public AssignExprContext assignExpr() {
			return getRuleContext(AssignExprContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(zigParser.RPAREN, 0); }
		public WhileContinueExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileContinueExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof zigListener ) ((zigListener)listener).enterWhileContinueExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof zigListener ) ((zigListener)listener).exitWhileContinueExpr(this);
		}
	}

	public final WhileContinueExprContext whileContinueExpr() throws RecognitionException {
		WhileContinueExprContext _localctx = new WhileContinueExprContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_whileContinueExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(790);
			match(COLON);
			setState(791);
			match(LPAREN);
			setState(792);
			assignExpr();
			setState(793);
			match(RPAREN);
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

	public static class LinkSectionContext extends ParserRuleContext {
		public TerminalNode KEYWORD_LINKSECTION() { return getToken(zigParser.KEYWORD_LINKSECTION, 0); }
		public TerminalNode LPAREN() { return getToken(zigParser.LPAREN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(zigParser.RPAREN, 0); }
		public LinkSectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_linkSection; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof zigListener ) ((zigListener)listener).enterLinkSection(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof zigListener ) ((zigListener)listener).exitLinkSection(this);
		}
	}

	public final LinkSectionContext linkSection() throws RecognitionException {
		LinkSectionContext _localctx = new LinkSectionContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_linkSection);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(795);
			match(KEYWORD_LINKSECTION);
			setState(796);
			match(LPAREN);
			setState(797);
			expr();
			setState(798);
			match(RPAREN);
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

	public static class CallConvContext extends ParserRuleContext {
		public TerminalNode KEYWORD_CALLCONV() { return getToken(zigParser.KEYWORD_CALLCONV, 0); }
		public TerminalNode LPAREN() { return getToken(zigParser.LPAREN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(zigParser.RPAREN, 0); }
		public CallConvContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_callConv; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof zigListener ) ((zigListener)listener).enterCallConv(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof zigListener ) ((zigListener)listener).exitCallConv(this);
		}
	}

	public final CallConvContext callConv() throws RecognitionException {
		CallConvContext _localctx = new CallConvContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_callConv);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(800);
			match(KEYWORD_CALLCONV);
			setState(801);
			match(LPAREN);
			setState(802);
			expr();
			setState(803);
			match(RPAREN);
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

	public static class ParamDeclContext extends ParserRuleContext {
		public ParamTypeContext paramType() {
			return getRuleContext(ParamTypeContext.class,0);
		}
		public TerminalNode Doc_comment() { return getToken(zigParser.Doc_comment, 0); }
		public TerminalNode IDENTIFIER() { return getToken(zigParser.IDENTIFIER, 0); }
		public TerminalNode COLON() { return getToken(zigParser.COLON, 0); }
		public TerminalNode KEYWORD_NOALIAS() { return getToken(zigParser.KEYWORD_NOALIAS, 0); }
		public TerminalNode KEYWORD_COMPTIME() { return getToken(zigParser.KEYWORD_COMPTIME, 0); }
		public TerminalNode DOT3() { return getToken(zigParser.DOT3, 0); }
		public ParamDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_paramDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof zigListener ) ((zigListener)listener).enterParamDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof zigListener ) ((zigListener)listener).exitParamDecl(this);
		}
	}

	public final ParamDeclContext paramDecl() throws RecognitionException {
		ParamDeclContext _localctx = new ParamDeclContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_paramDecl);
		int _la;
		try {
			setState(817);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KEYWORD_ANYFRAME:
			case KEYWORD_ANYTYPE:
			case KEYWORD_ASYNC:
			case KEYWORD_COMPTIME:
			case KEYWORD_ENUM:
			case KEYWORD_ERROR:
			case KEYWORD_EXTERN:
			case KEYWORD_FN:
			case KEYWORD_FOR:
			case KEYWORD_IF:
			case KEYWORD_INLINE:
			case KEYWORD_NOALIAS:
			case KEYWORD_OPAQUE:
			case KEYWORD_PACKED:
			case KEYWORD_STRUCT:
			case KEYWORD_SWITCH:
			case KEYWORD_UNION:
			case KEYWORD_UNREACHABLE:
			case KEYWORD_WHILE:
			case Doc_comment:
			case CHAR_LITERAL:
			case FLOAT:
			case INTEGER:
			case STRINGLITERAL:
			case IDENTIFIER:
			case BUILTINIDENTIFIER:
			case ASTERISK:
			case ASTERISK2:
			case DOT:
			case LBRACKET:
			case LPAREN:
			case QUESTIONMARK:
				enterOuterAlt(_localctx, 1);
				{
				setState(806);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Doc_comment) {
					{
					setState(805);
					match(Doc_comment);
					}
				}

				setState(809);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,104,_ctx) ) {
				case 1:
					{
					setState(808);
					_la = _input.LA(1);
					if ( !(_la==KEYWORD_COMPTIME || _la==KEYWORD_NOALIAS) ) {
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
				setState(813);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,105,_ctx) ) {
				case 1:
					{
					setState(811);
					match(IDENTIFIER);
					setState(812);
					match(COLON);
					}
					break;
				}
				setState(815);
				paramType();
				}
				break;
			case DOT3:
				enterOuterAlt(_localctx, 2);
				{
				setState(816);
				match(DOT3);
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

	public static class ParamTypeContext extends ParserRuleContext {
		public TerminalNode KEYWORD_ANYTYPE() { return getToken(zigParser.KEYWORD_ANYTYPE, 0); }
		public TypeExprContext typeExpr() {
			return getRuleContext(TypeExprContext.class,0);
		}
		public ParamTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_paramType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof zigListener ) ((zigListener)listener).enterParamType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof zigListener ) ((zigListener)listener).exitParamType(this);
		}
	}

	public final ParamTypeContext paramType() throws RecognitionException {
		ParamTypeContext _localctx = new ParamTypeContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_paramType);
		try {
			setState(821);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KEYWORD_ANYTYPE:
				enterOuterAlt(_localctx, 1);
				{
				setState(819);
				match(KEYWORD_ANYTYPE);
				}
				break;
			case KEYWORD_ANYFRAME:
			case KEYWORD_ASYNC:
			case KEYWORD_COMPTIME:
			case KEYWORD_ENUM:
			case KEYWORD_ERROR:
			case KEYWORD_EXTERN:
			case KEYWORD_FN:
			case KEYWORD_FOR:
			case KEYWORD_IF:
			case KEYWORD_INLINE:
			case KEYWORD_OPAQUE:
			case KEYWORD_PACKED:
			case KEYWORD_STRUCT:
			case KEYWORD_SWITCH:
			case KEYWORD_UNION:
			case KEYWORD_UNREACHABLE:
			case KEYWORD_WHILE:
			case CHAR_LITERAL:
			case FLOAT:
			case INTEGER:
			case STRINGLITERAL:
			case IDENTIFIER:
			case BUILTINIDENTIFIER:
			case ASTERISK:
			case ASTERISK2:
			case DOT:
			case LBRACKET:
			case LPAREN:
			case QUESTIONMARK:
				enterOuterAlt(_localctx, 2);
				{
				setState(820);
				typeExpr();
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

	public static class IfPrefixContext extends ParserRuleContext {
		public TerminalNode KEYWORD_IF() { return getToken(zigParser.KEYWORD_IF, 0); }
		public TerminalNode LPAREN() { return getToken(zigParser.LPAREN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(zigParser.RPAREN, 0); }
		public PtrpayloadContext ptrpayload() {
			return getRuleContext(PtrpayloadContext.class,0);
		}
		public IfPrefixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifPrefix; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof zigListener ) ((zigListener)listener).enterIfPrefix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof zigListener ) ((zigListener)listener).exitIfPrefix(this);
		}
	}

	public final IfPrefixContext ifPrefix() throws RecognitionException {
		IfPrefixContext _localctx = new IfPrefixContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_ifPrefix);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(823);
			match(KEYWORD_IF);
			setState(824);
			match(LPAREN);
			setState(825);
			expr();
			setState(826);
			match(RPAREN);
			setState(828);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PIPE) {
				{
				setState(827);
				ptrpayload();
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

	public static class WhilePrefixContext extends ParserRuleContext {
		public TerminalNode KEYWORD_WHILE() { return getToken(zigParser.KEYWORD_WHILE, 0); }
		public TerminalNode LPAREN() { return getToken(zigParser.LPAREN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(zigParser.RPAREN, 0); }
		public PtrpayloadContext ptrpayload() {
			return getRuleContext(PtrpayloadContext.class,0);
		}
		public WhileContinueExprContext whileContinueExpr() {
			return getRuleContext(WhileContinueExprContext.class,0);
		}
		public WhilePrefixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whilePrefix; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof zigListener ) ((zigListener)listener).enterWhilePrefix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof zigListener ) ((zigListener)listener).exitWhilePrefix(this);
		}
	}

	public final WhilePrefixContext whilePrefix() throws RecognitionException {
		WhilePrefixContext _localctx = new WhilePrefixContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_whilePrefix);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(830);
			match(KEYWORD_WHILE);
			setState(831);
			match(LPAREN);
			setState(832);
			expr();
			setState(833);
			match(RPAREN);
			setState(835);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PIPE) {
				{
				setState(834);
				ptrpayload();
				}
			}

			setState(838);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(837);
				whileContinueExpr();
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

	public static class ForPrefixContext extends ParserRuleContext {
		public TerminalNode KEYWORD_FOR() { return getToken(zigParser.KEYWORD_FOR, 0); }
		public TerminalNode LPAREN() { return getToken(zigParser.LPAREN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(zigParser.RPAREN, 0); }
		public PtrIndexpayloadContext ptrIndexpayload() {
			return getRuleContext(PtrIndexpayloadContext.class,0);
		}
		public ForPrefixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forPrefix; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof zigListener ) ((zigListener)listener).enterForPrefix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof zigListener ) ((zigListener)listener).exitForPrefix(this);
		}
	}

	public final ForPrefixContext forPrefix() throws RecognitionException {
		ForPrefixContext _localctx = new ForPrefixContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_forPrefix);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(840);
			match(KEYWORD_FOR);
			setState(841);
			match(LPAREN);
			setState(842);
			expr();
			setState(843);
			match(RPAREN);
			setState(844);
			ptrIndexpayload();
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

	public static class PayloadContext extends ParserRuleContext {
		public List<TerminalNode> PIPE() { return getTokens(zigParser.PIPE); }
		public TerminalNode PIPE(int i) {
			return getToken(zigParser.PIPE, i);
		}
		public TerminalNode IDENTIFIER() { return getToken(zigParser.IDENTIFIER, 0); }
		public PayloadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_payload; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof zigListener ) ((zigListener)listener).enterPayload(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof zigListener ) ((zigListener)listener).exitPayload(this);
		}
	}

	public final PayloadContext payload() throws RecognitionException {
		PayloadContext _localctx = new PayloadContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_payload);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(846);
			match(PIPE);
			setState(847);
			match(IDENTIFIER);
			setState(848);
			match(PIPE);
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

	public static class PtrpayloadContext extends ParserRuleContext {
		public List<TerminalNode> PIPE() { return getTokens(zigParser.PIPE); }
		public TerminalNode PIPE(int i) {
			return getToken(zigParser.PIPE, i);
		}
		public TerminalNode IDENTIFIER() { return getToken(zigParser.IDENTIFIER, 0); }
		public TerminalNode ASTERISK() { return getToken(zigParser.ASTERISK, 0); }
		public PtrpayloadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ptrpayload; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof zigListener ) ((zigListener)listener).enterPtrpayload(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof zigListener ) ((zigListener)listener).exitPtrpayload(this);
		}
	}

	public final PtrpayloadContext ptrpayload() throws RecognitionException {
		PtrpayloadContext _localctx = new PtrpayloadContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_ptrpayload);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(850);
			match(PIPE);
			setState(852);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASTERISK) {
				{
				setState(851);
				match(ASTERISK);
				}
			}

			setState(854);
			match(IDENTIFIER);
			setState(855);
			match(PIPE);
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

	public static class PtrIndexpayloadContext extends ParserRuleContext {
		public List<TerminalNode> PIPE() { return getTokens(zigParser.PIPE); }
		public TerminalNode PIPE(int i) {
			return getToken(zigParser.PIPE, i);
		}
		public List<TerminalNode> IDENTIFIER() { return getTokens(zigParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(zigParser.IDENTIFIER, i);
		}
		public TerminalNode ASTERISK() { return getToken(zigParser.ASTERISK, 0); }
		public TerminalNode COMMA() { return getToken(zigParser.COMMA, 0); }
		public PtrIndexpayloadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ptrIndexpayload; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof zigListener ) ((zigListener)listener).enterPtrIndexpayload(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof zigListener ) ((zigListener)listener).exitPtrIndexpayload(this);
		}
	}

	public final PtrIndexpayloadContext ptrIndexpayload() throws RecognitionException {
		PtrIndexpayloadContext _localctx = new PtrIndexpayloadContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_ptrIndexpayload);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(857);
			match(PIPE);
			setState(859);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASTERISK) {
				{
				setState(858);
				match(ASTERISK);
				}
			}

			setState(861);
			match(IDENTIFIER);
			setState(864);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(862);
				match(COMMA);
				setState(863);
				match(IDENTIFIER);
				}
			}

			setState(866);
			match(PIPE);
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

	public static class SwitchProngContext extends ParserRuleContext {
		public SwitchCaseContext switchCase() {
			return getRuleContext(SwitchCaseContext.class,0);
		}
		public TerminalNode EQUALRARROW() { return getToken(zigParser.EQUALRARROW, 0); }
		public AssignExprContext assignExpr() {
			return getRuleContext(AssignExprContext.class,0);
		}
		public PtrpayloadContext ptrpayload() {
			return getRuleContext(PtrpayloadContext.class,0);
		}
		public SwitchProngContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchProng; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof zigListener ) ((zigListener)listener).enterSwitchProng(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof zigListener ) ((zigListener)listener).exitSwitchProng(this);
		}
	}

	public final SwitchProngContext switchProng() throws RecognitionException {
		SwitchProngContext _localctx = new SwitchProngContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_switchProng);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(868);
			switchCase();
			setState(869);
			match(EQUALRARROW);
			setState(871);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PIPE) {
				{
				setState(870);
				ptrpayload();
				}
			}

			setState(873);
			assignExpr();
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

	public static class SwitchCaseContext extends ParserRuleContext {
		public List<SwitchItemContext> switchItem() {
			return getRuleContexts(SwitchItemContext.class);
		}
		public SwitchItemContext switchItem(int i) {
			return getRuleContext(SwitchItemContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(zigParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(zigParser.COMMA, i);
		}
		public TerminalNode KEYWORD_ELSE() { return getToken(zigParser.KEYWORD_ELSE, 0); }
		public SwitchCaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchCase; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof zigListener ) ((zigListener)listener).enterSwitchCase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof zigListener ) ((zigListener)listener).exitSwitchCase(this);
		}
	}

	public final SwitchCaseContext switchCase() throws RecognitionException {
		SwitchCaseContext _localctx = new SwitchCaseContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_switchCase);
		int _la;
		try {
			int _alt;
			setState(887);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KEYWORD_ANYFRAME:
			case KEYWORD_ASM:
			case KEYWORD_ASYNC:
			case KEYWORD_AWAIT:
			case KEYWORD_BREAK:
			case KEYWORD_COMPTIME:
			case KEYWORD_CONTINUE:
			case KEYWORD_ENUM:
			case KEYWORD_ERROR:
			case KEYWORD_EXTERN:
			case KEYWORD_FN:
			case KEYWORD_FOR:
			case KEYWORD_IF:
			case KEYWORD_INLINE:
			case KEYWORD_NOSUSPEND:
			case KEYWORD_OPAQUE:
			case KEYWORD_PACKED:
			case KEYWORD_RESUME:
			case KEYWORD_RETERN:
			case KEYWORD_STRUCT:
			case KEYWORD_SWITCH:
			case KEYWORD_TRY:
			case KEYWORD_UNION:
			case KEYWORD_UNREACHABLE:
			case KEYWORD_WHILE:
			case CHAR_LITERAL:
			case FLOAT:
			case INTEGER:
			case STRINGLITERAL:
			case IDENTIFIER:
			case BUILTINIDENTIFIER:
			case AMPERSAND:
			case ASTERISK:
			case ASTERISK2:
			case DOT:
			case EXCLAMATIONMARK:
			case LBRACE:
			case LBRACKET:
			case LPAREN:
			case MINUS:
			case MINUSPERCENT:
			case QUESTIONMARK:
			case TILDE:
				enterOuterAlt(_localctx, 1);
				{
				setState(875);
				switchItem();
				setState(880);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,115,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(876);
						match(COMMA);
						setState(877);
						switchItem();
						}
						} 
					}
					setState(882);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,115,_ctx);
				}
				setState(884);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(883);
					match(COMMA);
					}
				}

				}
				break;
			case KEYWORD_ELSE:
				enterOuterAlt(_localctx, 2);
				{
				setState(886);
				match(KEYWORD_ELSE);
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

	public static class SwitchItemContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode DOT3() { return getToken(zigParser.DOT3, 0); }
		public SwitchItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchItem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof zigListener ) ((zigListener)listener).enterSwitchItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof zigListener ) ((zigListener)listener).exitSwitchItem(this);
		}
	}

	public final SwitchItemContext switchItem() throws RecognitionException {
		SwitchItemContext _localctx = new SwitchItemContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_switchItem);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(889);
			expr();
			setState(892);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DOT3) {
				{
				setState(890);
				match(DOT3);
				setState(891);
				expr();
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

	public static class AssignOpContext extends ParserRuleContext {
		public TerminalNode ASTERISKEQUAL() { return getToken(zigParser.ASTERISKEQUAL, 0); }
		public TerminalNode SLASHEQUAL() { return getToken(zigParser.SLASHEQUAL, 0); }
		public TerminalNode PERCENTEQUAL() { return getToken(zigParser.PERCENTEQUAL, 0); }
		public TerminalNode PLUSEQUAL() { return getToken(zigParser.PLUSEQUAL, 0); }
		public TerminalNode MINUSEQUAL() { return getToken(zigParser.MINUSEQUAL, 0); }
		public TerminalNode LARROW2EQUAL() { return getToken(zigParser.LARROW2EQUAL, 0); }
		public TerminalNode RARROW2EQUAL() { return getToken(zigParser.RARROW2EQUAL, 0); }
		public TerminalNode AMPERSANDEQUAL() { return getToken(zigParser.AMPERSANDEQUAL, 0); }
		public TerminalNode CARETEQUAL() { return getToken(zigParser.CARETEQUAL, 0); }
		public TerminalNode PIPEEQUAL() { return getToken(zigParser.PIPEEQUAL, 0); }
		public TerminalNode ASTERISKPERCENTEQUAL() { return getToken(zigParser.ASTERISKPERCENTEQUAL, 0); }
		public TerminalNode PLUSPERCENTEQUAL() { return getToken(zigParser.PLUSPERCENTEQUAL, 0); }
		public TerminalNode MINUSPERCENTEQUAL() { return getToken(zigParser.MINUSPERCENTEQUAL, 0); }
		public TerminalNode EQUAL() { return getToken(zigParser.EQUAL, 0); }
		public AssignOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignOp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof zigListener ) ((zigListener)listener).enterAssignOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof zigListener ) ((zigListener)listener).exitAssignOp(this);
		}
	}

	public final AssignOpContext assignOp() throws RecognitionException {
		AssignOpContext _localctx = new AssignOpContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_assignOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(894);
			_la = _input.LA(1);
			if ( !(((((_la - 60)) & ~0x3f) == 0 && ((1L << (_la - 60)) & ((1L << (AMPERSANDEQUAL - 60)) | (1L << (ASTERISKEQUAL - 60)) | (1L << (ASTERISKPERCENTEQUAL - 60)) | (1L << (CARETEQUAL - 60)) | (1L << (EQUAL - 60)) | (1L << (LARROW2EQUAL - 60)) | (1L << (MINUSEQUAL - 60)) | (1L << (MINUSPERCENTEQUAL - 60)) | (1L << (PERCENTEQUAL - 60)) | (1L << (PIPEEQUAL - 60)) | (1L << (PLUSEQUAL - 60)) | (1L << (PLUSPERCENTEQUAL - 60)) | (1L << (RARROW2EQUAL - 60)) | (1L << (SLASHEQUAL - 60)))) != 0)) ) {
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

	public static class CompareOpContext extends ParserRuleContext {
		public TerminalNode EQUALEQUAL() { return getToken(zigParser.EQUALEQUAL, 0); }
		public TerminalNode EXCLAMATIONMARKEQUAL() { return getToken(zigParser.EXCLAMATIONMARKEQUAL, 0); }
		public TerminalNode LARROW() { return getToken(zigParser.LARROW, 0); }
		public TerminalNode RARROW() { return getToken(zigParser.RARROW, 0); }
		public TerminalNode LARROWEQUAL() { return getToken(zigParser.LARROWEQUAL, 0); }
		public TerminalNode RARROWEQUAL() { return getToken(zigParser.RARROWEQUAL, 0); }
		public CompareOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compareOp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof zigListener ) ((zigListener)listener).enterCompareOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof zigListener ) ((zigListener)listener).exitCompareOp(this);
		}
	}

	public final CompareOpContext compareOp() throws RecognitionException {
		CompareOpContext _localctx = new CompareOpContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_compareOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(896);
			_la = _input.LA(1);
			if ( !(((((_la - 76)) & ~0x3f) == 0 && ((1L << (_la - 76)) & ((1L << (EQUALEQUAL - 76)) | (1L << (EXCLAMATIONMARKEQUAL - 76)) | (1L << (LARROW - 76)) | (1L << (LARROWEQUAL - 76)) | (1L << (RARROW - 76)) | (1L << (RARROWEQUAL - 76)))) != 0)) ) {
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

	public static class BitwiseOpContext extends ParserRuleContext {
		public TerminalNode AMPERSAND() { return getToken(zigParser.AMPERSAND, 0); }
		public TerminalNode CARET() { return getToken(zigParser.CARET, 0); }
		public TerminalNode PIPE() { return getToken(zigParser.PIPE, 0); }
		public TerminalNode KEYWORD_ORELSE() { return getToken(zigParser.KEYWORD_ORELSE, 0); }
		public TerminalNode KEYWORD_CATCH() { return getToken(zigParser.KEYWORD_CATCH, 0); }
		public PayloadContext payload() {
			return getRuleContext(PayloadContext.class,0);
		}
		public BitwiseOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bitwiseOp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof zigListener ) ((zigListener)listener).enterBitwiseOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof zigListener ) ((zigListener)listener).exitBitwiseOp(this);
		}
	}

	public final BitwiseOpContext bitwiseOp() throws RecognitionException {
		BitwiseOpContext _localctx = new BitwiseOpContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_bitwiseOp);
		int _la;
		try {
			setState(906);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AMPERSAND:
				enterOuterAlt(_localctx, 1);
				{
				setState(898);
				match(AMPERSAND);
				}
				break;
			case CARET:
				enterOuterAlt(_localctx, 2);
				{
				setState(899);
				match(CARET);
				}
				break;
			case PIPE:
				enterOuterAlt(_localctx, 3);
				{
				setState(900);
				match(PIPE);
				}
				break;
			case KEYWORD_ORELSE:
				enterOuterAlt(_localctx, 4);
				{
				setState(901);
				match(KEYWORD_ORELSE);
				}
				break;
			case KEYWORD_CATCH:
				enterOuterAlt(_localctx, 5);
				{
				setState(902);
				match(KEYWORD_CATCH);
				setState(904);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PIPE) {
					{
					setState(903);
					payload();
					}
				}

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

	public static class BitShiftOpContext extends ParserRuleContext {
		public TerminalNode LARROW2() { return getToken(zigParser.LARROW2, 0); }
		public TerminalNode RARROW2() { return getToken(zigParser.RARROW2, 0); }
		public BitShiftOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bitShiftOp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof zigListener ) ((zigListener)listener).enterBitShiftOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof zigListener ) ((zigListener)listener).exitBitShiftOp(this);
		}
	}

	public final BitShiftOpContext bitShiftOp() throws RecognitionException {
		BitShiftOpContext _localctx = new BitShiftOpContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_bitShiftOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(908);
			_la = _input.LA(1);
			if ( !(_la==LARROW2 || _la==RARROW2) ) {
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

	public static class AdditionOpContext extends ParserRuleContext {
		public TerminalNode PLUS() { return getToken(zigParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(zigParser.MINUS, 0); }
		public TerminalNode PLUS2() { return getToken(zigParser.PLUS2, 0); }
		public TerminalNode PLUSPERCENT() { return getToken(zigParser.PLUSPERCENT, 0); }
		public TerminalNode MINUSPERCENT() { return getToken(zigParser.MINUSPERCENT, 0); }
		public AdditionOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_additionOp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof zigListener ) ((zigListener)listener).enterAdditionOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof zigListener ) ((zigListener)listener).exitAdditionOp(this);
		}
	}

	public final AdditionOpContext additionOp() throws RecognitionException {
		AdditionOpContext _localctx = new AdditionOpContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_additionOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(910);
			_la = _input.LA(1);
			if ( !(((((_la - 87)) & ~0x3f) == 0 && ((1L << (_la - 87)) & ((1L << (MINUS - 87)) | (1L << (MINUSPERCENT - 87)) | (1L << (PLUS - 87)) | (1L << (PLUS2 - 87)) | (1L << (PLUSPERCENT - 87)))) != 0)) ) {
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

	public static class MultiplyOpContext extends ParserRuleContext {
		public TerminalNode PIPE2() { return getToken(zigParser.PIPE2, 0); }
		public TerminalNode ASTERISK() { return getToken(zigParser.ASTERISK, 0); }
		public TerminalNode SLASH() { return getToken(zigParser.SLASH, 0); }
		public TerminalNode PERCENT() { return getToken(zigParser.PERCENT, 0); }
		public TerminalNode ASTERISK2() { return getToken(zigParser.ASTERISK2, 0); }
		public TerminalNode ASTERISKPERCENT() { return getToken(zigParser.ASTERISKPERCENT, 0); }
		public MultiplyOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplyOp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof zigListener ) ((zigListener)listener).enterMultiplyOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof zigListener ) ((zigListener)listener).exitMultiplyOp(this);
		}
	}

	public final MultiplyOpContext multiplyOp() throws RecognitionException {
		MultiplyOpContext _localctx = new MultiplyOpContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_multiplyOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(912);
			_la = _input.LA(1);
			if ( !(((((_la - 61)) & ~0x3f) == 0 && ((1L << (_la - 61)) & ((1L << (ASTERISK - 61)) | (1L << (ASTERISK2 - 61)) | (1L << (ASTERISKPERCENT - 61)) | (1L << (PERCENT - 61)) | (1L << (PIPE2 - 61)) | (1L << (SLASH - 61)))) != 0)) ) {
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

	public static class PrefixOpContext extends ParserRuleContext {
		public TerminalNode EXCLAMATIONMARK() { return getToken(zigParser.EXCLAMATIONMARK, 0); }
		public TerminalNode MINUS() { return getToken(zigParser.MINUS, 0); }
		public TerminalNode TILDE() { return getToken(zigParser.TILDE, 0); }
		public TerminalNode MINUSPERCENT() { return getToken(zigParser.MINUSPERCENT, 0); }
		public TerminalNode AMPERSAND() { return getToken(zigParser.AMPERSAND, 0); }
		public TerminalNode KEYWORD_TRY() { return getToken(zigParser.KEYWORD_TRY, 0); }
		public TerminalNode KEYWORD_AWAIT() { return getToken(zigParser.KEYWORD_AWAIT, 0); }
		public PrefixOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prefixOp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof zigListener ) ((zigListener)listener).enterPrefixOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof zigListener ) ((zigListener)listener).exitPrefixOp(this);
		}
	}

	public final PrefixOpContext prefixOp() throws RecognitionException {
		PrefixOpContext _localctx = new PrefixOpContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_prefixOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(914);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD_AWAIT) | (1L << KEYWORD_TRY) | (1L << AMPERSAND))) != 0) || ((((_la - 78)) & ~0x3f) == 0 && ((1L << (_la - 78)) & ((1L << (EXCLAMATIONMARK - 78)) | (1L << (MINUS - 78)) | (1L << (MINUSPERCENT - 78)) | (1L << (TILDE - 78)))) != 0)) ) {
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

	public static class PrefixTypeOpContext extends ParserRuleContext {
		public TerminalNode QUESTIONMARK() { return getToken(zigParser.QUESTIONMARK, 0); }
		public TerminalNode KEYWORD_ANYFRAME() { return getToken(zigParser.KEYWORD_ANYFRAME, 0); }
		public TerminalNode MINUSRARROW() { return getToken(zigParser.MINUSRARROW, 0); }
		public SliceTypeStartContext sliceTypeStart() {
			return getRuleContext(SliceTypeStartContext.class,0);
		}
		public List<ByteAlignContext> byteAlign() {
			return getRuleContexts(ByteAlignContext.class);
		}
		public ByteAlignContext byteAlign(int i) {
			return getRuleContext(ByteAlignContext.class,i);
		}
		public List<TerminalNode> KEYWORD_CONST() { return getTokens(zigParser.KEYWORD_CONST); }
		public TerminalNode KEYWORD_CONST(int i) {
			return getToken(zigParser.KEYWORD_CONST, i);
		}
		public List<TerminalNode> KEYWORD_VOLATILE() { return getTokens(zigParser.KEYWORD_VOLATILE); }
		public TerminalNode KEYWORD_VOLATILE(int i) {
			return getToken(zigParser.KEYWORD_VOLATILE, i);
		}
		public List<TerminalNode> KEYWORD_ALLOWZERO() { return getTokens(zigParser.KEYWORD_ALLOWZERO); }
		public TerminalNode KEYWORD_ALLOWZERO(int i) {
			return getToken(zigParser.KEYWORD_ALLOWZERO, i);
		}
		public PtrTypeStartContext ptrTypeStart() {
			return getRuleContext(PtrTypeStartContext.class,0);
		}
		public List<TerminalNode> KEYWORD_ALIGN() { return getTokens(zigParser.KEYWORD_ALIGN); }
		public TerminalNode KEYWORD_ALIGN(int i) {
			return getToken(zigParser.KEYWORD_ALIGN, i);
		}
		public List<TerminalNode> LPAREN() { return getTokens(zigParser.LPAREN); }
		public TerminalNode LPAREN(int i) {
			return getToken(zigParser.LPAREN, i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> RPAREN() { return getTokens(zigParser.RPAREN); }
		public TerminalNode RPAREN(int i) {
			return getToken(zigParser.RPAREN, i);
		}
		public List<TerminalNode> COLON() { return getTokens(zigParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(zigParser.COLON, i);
		}
		public List<TerminalNode> INTEGER() { return getTokens(zigParser.INTEGER); }
		public TerminalNode INTEGER(int i) {
			return getToken(zigParser.INTEGER, i);
		}
		public ArrayTypeStartContext arrayTypeStart() {
			return getRuleContext(ArrayTypeStartContext.class,0);
		}
		public PrefixTypeOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prefixTypeOp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof zigListener ) ((zigListener)listener).enterPrefixTypeOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof zigListener ) ((zigListener)listener).exitPrefixTypeOp(this);
		}
	}

	public final PrefixTypeOpContext prefixTypeOp() throws RecognitionException {
		PrefixTypeOpContext _localctx = new PrefixTypeOpContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_prefixTypeOp);
		int _la;
		try {
			setState(950);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,126,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(916);
				match(QUESTIONMARK);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(917);
				match(KEYWORD_ANYFRAME);
				setState(918);
				match(MINUSRARROW);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(919);
				sliceTypeStart();
				setState(926);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD_ALIGN) | (1L << KEYWORD_ALLOWZERO) | (1L << KEYWORD_CONST) | (1L << KEYWORD_VOLATILE))) != 0)) {
					{
					setState(924);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case KEYWORD_ALIGN:
						{
						setState(920);
						byteAlign();
						}
						break;
					case KEYWORD_CONST:
						{
						setState(921);
						match(KEYWORD_CONST);
						}
						break;
					case KEYWORD_VOLATILE:
						{
						setState(922);
						match(KEYWORD_VOLATILE);
						}
						break;
					case KEYWORD_ALLOWZERO:
						{
						setState(923);
						match(KEYWORD_ALLOWZERO);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(928);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(929);
				ptrTypeStart();
				setState(946);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD_ALIGN) | (1L << KEYWORD_ALLOWZERO) | (1L << KEYWORD_CONST) | (1L << KEYWORD_VOLATILE))) != 0)) {
					{
					setState(944);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case KEYWORD_ALIGN:
						{
						setState(930);
						match(KEYWORD_ALIGN);
						setState(931);
						match(LPAREN);
						setState(932);
						expr();
						setState(937);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==COLON) {
							{
							setState(933);
							match(COLON);
							setState(934);
							match(INTEGER);
							setState(935);
							match(COLON);
							setState(936);
							match(INTEGER);
							}
						}

						setState(939);
						match(RPAREN);
						}
						break;
					case KEYWORD_CONST:
						{
						setState(941);
						match(KEYWORD_CONST);
						}
						break;
					case KEYWORD_VOLATILE:
						{
						setState(942);
						match(KEYWORD_VOLATILE);
						}
						break;
					case KEYWORD_ALLOWZERO:
						{
						setState(943);
						match(KEYWORD_ALLOWZERO);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(948);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(949);
				arrayTypeStart();
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

	public static class SuffixOpContext extends ParserRuleContext {
		public TerminalNode LBRACKET() { return getToken(zigParser.LBRACKET, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode RBRACKET() { return getToken(zigParser.RBRACKET, 0); }
		public TerminalNode DOT2() { return getToken(zigParser.DOT2, 0); }
		public TerminalNode COLON() { return getToken(zigParser.COLON, 0); }
		public TerminalNode DOT() { return getToken(zigParser.DOT, 0); }
		public TerminalNode IDENTIFIER() { return getToken(zigParser.IDENTIFIER, 0); }
		public TerminalNode DOTASTERISK() { return getToken(zigParser.DOTASTERISK, 0); }
		public TerminalNode DOTQUESTIONMARK() { return getToken(zigParser.DOTQUESTIONMARK, 0); }
		public SuffixOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_suffixOp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof zigListener ) ((zigListener)listener).enterSuffixOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof zigListener ) ((zigListener)listener).exitSuffixOp(this);
		}
	}

	public final SuffixOpContext suffixOp() throws RecognitionException {
		SuffixOpContext _localctx = new SuffixOpContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_suffixOp);
		int _la;
		try {
			setState(972);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACKET:
				enterOuterAlt(_localctx, 1);
				{
				setState(952);
				match(LBRACKET);
				setState(953);
				expr();
				setState(964);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DOT2) {
					{
					setState(954);
					match(DOT2);
					setState(962);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,129,_ctx) ) {
					case 1:
						{
						setState(956);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD_ANYFRAME) | (1L << KEYWORD_ASM) | (1L << KEYWORD_ASYNC) | (1L << KEYWORD_AWAIT) | (1L << KEYWORD_BREAK) | (1L << KEYWORD_COMPTIME) | (1L << KEYWORD_CONTINUE) | (1L << KEYWORD_ENUM) | (1L << KEYWORD_ERROR) | (1L << KEYWORD_EXTERN) | (1L << KEYWORD_FN) | (1L << KEYWORD_FOR) | (1L << KEYWORD_IF) | (1L << KEYWORD_INLINE) | (1L << KEYWORD_NOSUSPEND) | (1L << KEYWORD_OPAQUE) | (1L << KEYWORD_PACKED) | (1L << KEYWORD_RESUME) | (1L << KEYWORD_RETERN) | (1L << KEYWORD_STRUCT) | (1L << KEYWORD_SWITCH) | (1L << KEYWORD_TRY) | (1L << KEYWORD_UNION) | (1L << KEYWORD_UNREACHABLE) | (1L << KEYWORD_WHILE) | (1L << CHAR_LITERAL) | (1L << FLOAT) | (1L << INTEGER) | (1L << STRINGLITERAL) | (1L << IDENTIFIER) | (1L << BUILTINIDENTIFIER) | (1L << AMPERSAND) | (1L << ASTERISK) | (1L << ASTERISK2))) != 0) || ((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & ((1L << (DOT - 70)) | (1L << (EXCLAMATIONMARK - 70)) | (1L << (LBRACE - 70)) | (1L << (LBRACKET - 70)) | (1L << (LPAREN - 70)) | (1L << (MINUS - 70)) | (1L << (MINUSPERCENT - 70)) | (1L << (QUESTIONMARK - 70)) | (1L << (TILDE - 70)))) != 0)) {
							{
							setState(955);
							expr();
							}
						}

						setState(960);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==COLON) {
							{
							setState(958);
							match(COLON);
							setState(959);
							expr();
							}
						}

						}
						break;
					}
					}
				}

				setState(966);
				match(RBRACKET);
				}
				break;
			case DOT:
				enterOuterAlt(_localctx, 2);
				{
				setState(968);
				match(DOT);
				setState(969);
				match(IDENTIFIER);
				}
				break;
			case DOTASTERISK:
				enterOuterAlt(_localctx, 3);
				{
				setState(970);
				match(DOTASTERISK);
				}
				break;
			case DOTQUESTIONMARK:
				enterOuterAlt(_localctx, 4);
				{
				setState(971);
				match(DOTQUESTIONMARK);
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

	public static class FnCallArgumentsContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(zigParser.LPAREN, 0); }
		public ExprListContext exprList() {
			return getRuleContext(ExprListContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(zigParser.RPAREN, 0); }
		public FnCallArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fnCallArguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof zigListener ) ((zigListener)listener).enterFnCallArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof zigListener ) ((zigListener)listener).exitFnCallArguments(this);
		}
	}

	public final FnCallArgumentsContext fnCallArguments() throws RecognitionException {
		FnCallArgumentsContext _localctx = new FnCallArgumentsContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_fnCallArguments);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(974);
			match(LPAREN);
			setState(975);
			exprList();
			setState(976);
			match(RPAREN);
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

	public static class SliceTypeStartContext extends ParserRuleContext {
		public TerminalNode LBRACKET() { return getToken(zigParser.LBRACKET, 0); }
		public TerminalNode RBRACKET() { return getToken(zigParser.RBRACKET, 0); }
		public TerminalNode COLON() { return getToken(zigParser.COLON, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public SliceTypeStartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sliceTypeStart; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof zigListener ) ((zigListener)listener).enterSliceTypeStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof zigListener ) ((zigListener)listener).exitSliceTypeStart(this);
		}
	}

	public final SliceTypeStartContext sliceTypeStart() throws RecognitionException {
		SliceTypeStartContext _localctx = new SliceTypeStartContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_sliceTypeStart);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(978);
			match(LBRACKET);
			setState(981);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(979);
				match(COLON);
				setState(980);
				expr();
				}
			}

			setState(983);
			match(RBRACKET);
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

	public static class PtrTypeStartContext extends ParserRuleContext {
		public TerminalNode ASTERISK() { return getToken(zigParser.ASTERISK, 0); }
		public TerminalNode ASTERISK2() { return getToken(zigParser.ASTERISK2, 0); }
		public TerminalNode LBRACKET() { return getToken(zigParser.LBRACKET, 0); }
		public TerminalNode RBRACKET() { return getToken(zigParser.RBRACKET, 0); }
		public TerminalNode LETTERC() { return getToken(zigParser.LETTERC, 0); }
		public TerminalNode COLON() { return getToken(zigParser.COLON, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public PtrTypeStartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ptrTypeStart; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof zigListener ) ((zigListener)listener).enterPtrTypeStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof zigListener ) ((zigListener)listener).exitPtrTypeStart(this);
		}
	}

	public final PtrTypeStartContext ptrTypeStart() throws RecognitionException {
		PtrTypeStartContext _localctx = new PtrTypeStartContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_ptrTypeStart);
		try {
			setState(995);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ASTERISK:
				enterOuterAlt(_localctx, 1);
				{
				setState(985);
				match(ASTERISK);
				}
				break;
			case ASTERISK2:
				enterOuterAlt(_localctx, 2);
				{
				setState(986);
				match(ASTERISK2);
				}
				break;
			case LBRACKET:
				enterOuterAlt(_localctx, 3);
				{
				setState(987);
				match(LBRACKET);
				setState(988);
				match(ASTERISK);
				setState(992);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LETTERC:
					{
					setState(989);
					match(LETTERC);
					}
					break;
				case COLON:
					{
					setState(990);
					match(COLON);
					setState(991);
					expr();
					}
					break;
				case RBRACKET:
					break;
				default:
					break;
				}
				setState(994);
				match(RBRACKET);
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

	public static class ArrayTypeStartContext extends ParserRuleContext {
		public TerminalNode LBRACKET() { return getToken(zigParser.LBRACKET, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode RBRACKET() { return getToken(zigParser.RBRACKET, 0); }
		public TerminalNode COLON() { return getToken(zigParser.COLON, 0); }
		public ArrayTypeStartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayTypeStart; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof zigListener ) ((zigListener)listener).enterArrayTypeStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof zigListener ) ((zigListener)listener).exitArrayTypeStart(this);
		}
	}

	public final ArrayTypeStartContext arrayTypeStart() throws RecognitionException {
		ArrayTypeStartContext _localctx = new ArrayTypeStartContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_arrayTypeStart);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(997);
			match(LBRACKET);
			setState(998);
			expr();
			setState(1001);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(999);
				match(COLON);
				setState(1000);
				expr();
				}
			}

			setState(1003);
			match(RBRACKET);
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

	public static class ContainerDeclAutoContext extends ParserRuleContext {
		public ContainerDeclTypeContext containerDeclType() {
			return getRuleContext(ContainerDeclTypeContext.class,0);
		}
		public TerminalNode LBRACE() { return getToken(zigParser.LBRACE, 0); }
		public ContainerMembersContext containerMembers() {
			return getRuleContext(ContainerMembersContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(zigParser.RBRACE, 0); }
		public TerminalNode Container_doc_comment() { return getToken(zigParser.Container_doc_comment, 0); }
		public ContainerDeclAutoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_containerDeclAuto; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof zigListener ) ((zigListener)listener).enterContainerDeclAuto(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof zigListener ) ((zigListener)listener).exitContainerDeclAuto(this);
		}
	}

	public final ContainerDeclAutoContext containerDeclAuto() throws RecognitionException {
		ContainerDeclAutoContext _localctx = new ContainerDeclAutoContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_containerDeclAuto);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1005);
			containerDeclType();
			setState(1006);
			match(LBRACE);
			setState(1008);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Container_doc_comment) {
				{
				setState(1007);
				match(Container_doc_comment);
				}
			}

			setState(1010);
			containerMembers();
			setState(1011);
			match(RBRACE);
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

	public static class ContainerDeclTypeContext extends ParserRuleContext {
		public TerminalNode KEYWORD_STRUCT() { return getToken(zigParser.KEYWORD_STRUCT, 0); }
		public TerminalNode KEYWORD_OPAQUE() { return getToken(zigParser.KEYWORD_OPAQUE, 0); }
		public TerminalNode KEYWORD_ENUM() { return getToken(zigParser.KEYWORD_ENUM, 0); }
		public List<TerminalNode> LPAREN() { return getTokens(zigParser.LPAREN); }
		public TerminalNode LPAREN(int i) {
			return getToken(zigParser.LPAREN, i);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<TerminalNode> RPAREN() { return getTokens(zigParser.RPAREN); }
		public TerminalNode RPAREN(int i) {
			return getToken(zigParser.RPAREN, i);
		}
		public TerminalNode KEYWORD_UNION() { return getToken(zigParser.KEYWORD_UNION, 0); }
		public ContainerDeclTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_containerDeclType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof zigListener ) ((zigListener)listener).enterContainerDeclType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof zigListener ) ((zigListener)listener).exitContainerDeclType(this);
		}
	}

	public final ContainerDeclTypeContext containerDeclType() throws RecognitionException {
		ContainerDeclTypeContext _localctx = new ContainerDeclTypeContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_containerDeclType);
		int _la;
		try {
			setState(1037);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KEYWORD_STRUCT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1013);
				match(KEYWORD_STRUCT);
				}
				break;
			case KEYWORD_OPAQUE:
				enterOuterAlt(_localctx, 2);
				{
				setState(1014);
				match(KEYWORD_OPAQUE);
				}
				break;
			case KEYWORD_ENUM:
				enterOuterAlt(_localctx, 3);
				{
				setState(1015);
				match(KEYWORD_ENUM);
				setState(1020);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LPAREN) {
					{
					setState(1016);
					match(LPAREN);
					setState(1017);
					expr();
					setState(1018);
					match(RPAREN);
					}
				}

				}
				break;
			case KEYWORD_UNION:
				enterOuterAlt(_localctx, 4);
				{
				setState(1022);
				match(KEYWORD_UNION);
				setState(1035);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LPAREN) {
					{
					setState(1023);
					match(LPAREN);
					setState(1032);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,139,_ctx) ) {
					case 1:
						{
						setState(1024);
						match(KEYWORD_ENUM);
						setState(1029);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==LPAREN) {
							{
							setState(1025);
							match(LPAREN);
							setState(1026);
							expr();
							setState(1027);
							match(RPAREN);
							}
						}

						}
						break;
					case 2:
						{
						setState(1031);
						expr();
						}
						break;
					}
					setState(1034);
					match(RPAREN);
					}
				}

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

	public static class ByteAlignContext extends ParserRuleContext {
		public TerminalNode KEYWORD_ALIGN() { return getToken(zigParser.KEYWORD_ALIGN, 0); }
		public TerminalNode LPAREN() { return getToken(zigParser.LPAREN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(zigParser.RPAREN, 0); }
		public ByteAlignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_byteAlign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof zigListener ) ((zigListener)listener).enterByteAlign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof zigListener ) ((zigListener)listener).exitByteAlign(this);
		}
	}

	public final ByteAlignContext byteAlign() throws RecognitionException {
		ByteAlignContext _localctx = new ByteAlignContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_byteAlign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1039);
			match(KEYWORD_ALIGN);
			setState(1040);
			match(LPAREN);
			setState(1041);
			expr();
			setState(1042);
			match(RPAREN);
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

	public static class IdentifierListContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(zigParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(zigParser.IDENTIFIER, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(zigParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(zigParser.COMMA, i);
		}
		public List<TerminalNode> Doc_comment() { return getTokens(zigParser.Doc_comment); }
		public TerminalNode Doc_comment(int i) {
			return getToken(zigParser.Doc_comment, i);
		}
		public IdentifierListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifierList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof zigListener ) ((zigListener)listener).enterIdentifierList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof zigListener ) ((zigListener)listener).exitIdentifierList(this);
		}
	}

	public final IdentifierListContext identifierList() throws RecognitionException {
		IdentifierListContext _localctx = new IdentifierListContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_identifierList);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1051);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,143,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1045);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==Doc_comment) {
						{
						setState(1044);
						match(Doc_comment);
						}
					}

					setState(1047);
					match(IDENTIFIER);
					setState(1048);
					match(COMMA);
					}
					} 
				}
				setState(1053);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,143,_ctx);
			}
			setState(1058);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Doc_comment || _la==IDENTIFIER) {
				{
				setState(1055);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Doc_comment) {
					{
					setState(1054);
					match(Doc_comment);
					}
				}

				setState(1057);
				match(IDENTIFIER);
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

	public static class SwitchProngListContext extends ParserRuleContext {
		public List<SwitchProngContext> switchProng() {
			return getRuleContexts(SwitchProngContext.class);
		}
		public SwitchProngContext switchProng(int i) {
			return getRuleContext(SwitchProngContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(zigParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(zigParser.COMMA, i);
		}
		public SwitchProngListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchProngList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof zigListener ) ((zigListener)listener).enterSwitchProngList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof zigListener ) ((zigListener)listener).exitSwitchProngList(this);
		}
	}

	public final SwitchProngListContext switchProngList() throws RecognitionException {
		SwitchProngListContext _localctx = new SwitchProngListContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_switchProngList);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1065);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,146,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1060);
					switchProng();
					setState(1061);
					match(COMMA);
					}
					} 
				}
				setState(1067);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,146,_ctx);
			}
			setState(1069);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD_ANYFRAME) | (1L << KEYWORD_ASM) | (1L << KEYWORD_ASYNC) | (1L << KEYWORD_AWAIT) | (1L << KEYWORD_BREAK) | (1L << KEYWORD_COMPTIME) | (1L << KEYWORD_CONTINUE) | (1L << KEYWORD_ELSE) | (1L << KEYWORD_ENUM) | (1L << KEYWORD_ERROR) | (1L << KEYWORD_EXTERN) | (1L << KEYWORD_FN) | (1L << KEYWORD_FOR) | (1L << KEYWORD_IF) | (1L << KEYWORD_INLINE) | (1L << KEYWORD_NOSUSPEND) | (1L << KEYWORD_OPAQUE) | (1L << KEYWORD_PACKED) | (1L << KEYWORD_RESUME) | (1L << KEYWORD_RETERN) | (1L << KEYWORD_STRUCT) | (1L << KEYWORD_SWITCH) | (1L << KEYWORD_TRY) | (1L << KEYWORD_UNION) | (1L << KEYWORD_UNREACHABLE) | (1L << KEYWORD_WHILE) | (1L << CHAR_LITERAL) | (1L << FLOAT) | (1L << INTEGER) | (1L << STRINGLITERAL) | (1L << IDENTIFIER) | (1L << BUILTINIDENTIFIER) | (1L << AMPERSAND) | (1L << ASTERISK) | (1L << ASTERISK2))) != 0) || ((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & ((1L << (DOT - 70)) | (1L << (EXCLAMATIONMARK - 70)) | (1L << (LBRACE - 70)) | (1L << (LBRACKET - 70)) | (1L << (LPAREN - 70)) | (1L << (MINUS - 70)) | (1L << (MINUSPERCENT - 70)) | (1L << (QUESTIONMARK - 70)) | (1L << (TILDE - 70)))) != 0)) {
				{
				setState(1068);
				switchProng();
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

	public static class AsmOutputListContext extends ParserRuleContext {
		public List<AsmOutputItemContext> asmOutputItem() {
			return getRuleContexts(AsmOutputItemContext.class);
		}
		public AsmOutputItemContext asmOutputItem(int i) {
			return getRuleContext(AsmOutputItemContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(zigParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(zigParser.COMMA, i);
		}
		public AsmOutputListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asmOutputList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof zigListener ) ((zigListener)listener).enterAsmOutputList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof zigListener ) ((zigListener)listener).exitAsmOutputList(this);
		}
	}

	public final AsmOutputListContext asmOutputList() throws RecognitionException {
		AsmOutputListContext _localctx = new AsmOutputListContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_asmOutputList);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1076);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,148,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1071);
					asmOutputItem();
					setState(1072);
					match(COMMA);
					}
					} 
				}
				setState(1078);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,148,_ctx);
			}
			setState(1080);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LBRACKET) {
				{
				setState(1079);
				asmOutputItem();
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

	public static class AsmInputListContext extends ParserRuleContext {
		public List<AsmInputItemContext> asmInputItem() {
			return getRuleContexts(AsmInputItemContext.class);
		}
		public AsmInputItemContext asmInputItem(int i) {
			return getRuleContext(AsmInputItemContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(zigParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(zigParser.COMMA, i);
		}
		public AsmInputListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asmInputList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof zigListener ) ((zigListener)listener).enterAsmInputList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof zigListener ) ((zigListener)listener).exitAsmInputList(this);
		}
	}

	public final AsmInputListContext asmInputList() throws RecognitionException {
		AsmInputListContext _localctx = new AsmInputListContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_asmInputList);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1087);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,150,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1082);
					asmInputItem();
					setState(1083);
					match(COMMA);
					}
					} 
				}
				setState(1089);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,150,_ctx);
			}
			setState(1091);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LBRACKET) {
				{
				setState(1090);
				asmInputItem();
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

	public static class StringListContext extends ParserRuleContext {
		public List<TerminalNode> STRINGLITERAL() { return getTokens(zigParser.STRINGLITERAL); }
		public TerminalNode STRINGLITERAL(int i) {
			return getToken(zigParser.STRINGLITERAL, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(zigParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(zigParser.COMMA, i);
		}
		public StringListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof zigListener ) ((zigListener)listener).enterStringList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof zigListener ) ((zigListener)listener).exitStringList(this);
		}
	}

	public final StringListContext stringList() throws RecognitionException {
		StringListContext _localctx = new StringListContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_stringList);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1097);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,152,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1093);
					match(STRINGLITERAL);
					setState(1094);
					match(COMMA);
					}
					} 
				}
				setState(1099);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,152,_ctx);
			}
			setState(1101);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STRINGLITERAL) {
				{
				setState(1100);
				match(STRINGLITERAL);
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

	public static class ParamDeclListContext extends ParserRuleContext {
		public List<ParamDeclContext> paramDecl() {
			return getRuleContexts(ParamDeclContext.class);
		}
		public ParamDeclContext paramDecl(int i) {
			return getRuleContext(ParamDeclContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(zigParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(zigParser.COMMA, i);
		}
		public ParamDeclListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_paramDeclList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof zigListener ) ((zigListener)listener).enterParamDeclList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof zigListener ) ((zigListener)listener).exitParamDeclList(this);
		}
	}

	public final ParamDeclListContext paramDeclList() throws RecognitionException {
		ParamDeclListContext _localctx = new ParamDeclListContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_paramDeclList);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1108);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,154,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1103);
					paramDecl();
					setState(1104);
					match(COMMA);
					}
					} 
				}
				setState(1110);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,154,_ctx);
			}
			setState(1112);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD_ANYFRAME) | (1L << KEYWORD_ANYTYPE) | (1L << KEYWORD_ASYNC) | (1L << KEYWORD_COMPTIME) | (1L << KEYWORD_ENUM) | (1L << KEYWORD_ERROR) | (1L << KEYWORD_EXTERN) | (1L << KEYWORD_FN) | (1L << KEYWORD_FOR) | (1L << KEYWORD_IF) | (1L << KEYWORD_INLINE) | (1L << KEYWORD_NOALIAS) | (1L << KEYWORD_OPAQUE) | (1L << KEYWORD_PACKED) | (1L << KEYWORD_STRUCT) | (1L << KEYWORD_SWITCH) | (1L << KEYWORD_UNION) | (1L << KEYWORD_UNREACHABLE) | (1L << KEYWORD_WHILE) | (1L << Doc_comment) | (1L << CHAR_LITERAL) | (1L << FLOAT) | (1L << INTEGER) | (1L << STRINGLITERAL) | (1L << IDENTIFIER) | (1L << BUILTINIDENTIFIER) | (1L << ASTERISK) | (1L << ASTERISK2))) != 0) || ((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & ((1L << (DOT - 70)) | (1L << (DOT3 - 70)) | (1L << (LBRACKET - 70)) | (1L << (LPAREN - 70)) | (1L << (QUESTIONMARK - 70)))) != 0)) {
				{
				setState(1111);
				paramDecl();
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

	public static class ExprListContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(zigParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(zigParser.COMMA, i);
		}
		public ExprListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof zigListener ) ((zigListener)listener).enterExprList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof zigListener ) ((zigListener)listener).exitExprList(this);
		}
	}

	public final ExprListContext exprList() throws RecognitionException {
		ExprListContext _localctx = new ExprListContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_exprList);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1119);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,156,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1114);
					expr();
					setState(1115);
					match(COMMA);
					}
					} 
				}
				setState(1121);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,156,_ctx);
			}
			setState(1123);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD_ANYFRAME) | (1L << KEYWORD_ASM) | (1L << KEYWORD_ASYNC) | (1L << KEYWORD_AWAIT) | (1L << KEYWORD_BREAK) | (1L << KEYWORD_COMPTIME) | (1L << KEYWORD_CONTINUE) | (1L << KEYWORD_ENUM) | (1L << KEYWORD_ERROR) | (1L << KEYWORD_EXTERN) | (1L << KEYWORD_FN) | (1L << KEYWORD_FOR) | (1L << KEYWORD_IF) | (1L << KEYWORD_INLINE) | (1L << KEYWORD_NOSUSPEND) | (1L << KEYWORD_OPAQUE) | (1L << KEYWORD_PACKED) | (1L << KEYWORD_RESUME) | (1L << KEYWORD_RETERN) | (1L << KEYWORD_STRUCT) | (1L << KEYWORD_SWITCH) | (1L << KEYWORD_TRY) | (1L << KEYWORD_UNION) | (1L << KEYWORD_UNREACHABLE) | (1L << KEYWORD_WHILE) | (1L << CHAR_LITERAL) | (1L << FLOAT) | (1L << INTEGER) | (1L << STRINGLITERAL) | (1L << IDENTIFIER) | (1L << BUILTINIDENTIFIER) | (1L << AMPERSAND) | (1L << ASTERISK) | (1L << ASTERISK2))) != 0) || ((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & ((1L << (DOT - 70)) | (1L << (EXCLAMATIONMARK - 70)) | (1L << (LBRACE - 70)) | (1L << (LBRACKET - 70)) | (1L << (LPAREN - 70)) | (1L << (MINUS - 70)) | (1L << (MINUSPERCENT - 70)) | (1L << (QUESTIONMARK - 70)) | (1L << (TILDE - 70)))) != 0)) {
				{
				setState(1122);
				expr();
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3v\u0468\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\3"+
		"\2\5\2\u00c0\n\2\3\2\3\2\3\3\3\3\3\3\3\3\7\3\u00c8\n\3\f\3\16\3\u00cb"+
		"\13\3\3\3\3\3\5\3\u00cf\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4\u00d8\n\4"+
		"\3\4\5\4\u00db\n\4\3\4\3\4\3\4\5\4\u00e0\n\4\3\5\5\5\u00e3\n\5\3\5\3\5"+
		"\5\5\u00e7\n\5\3\5\3\5\3\6\5\6\u00ec\n\6\3\6\3\6\3\6\3\7\3\7\3\7\5\7\u00f4"+
		"\n\7\3\7\5\7\u00f7\n\7\3\7\3\7\3\7\5\7\u00fc\n\7\3\7\3\7\3\7\5\7\u0101"+
		"\n\7\5\7\u0103\n\7\3\7\5\7\u0106\n\7\3\7\3\7\3\7\3\7\3\7\5\7\u010d\n\7"+
		"\3\b\3\b\5\b\u0111\n\b\3\b\3\b\3\b\3\b\5\b\u0117\n\b\3\b\5\b\u011a\n\b"+
		"\3\b\5\b\u011d\n\b\3\b\5\b\u0120\n\b\3\b\3\b\3\t\3\t\3\t\3\t\5\t\u0128"+
		"\n\t\3\t\5\t\u012b\n\t\3\t\5\t\u012e\n\t\3\t\3\t\5\t\u0132\n\t\3\t\3\t"+
		"\3\n\5\n\u0137\n\n\3\n\5\n\u013a\n\n\3\n\3\n\3\n\3\n\5\n\u0140\n\n\5\n"+
		"\u0142\n\n\3\n\3\n\5\n\u0146\n\n\3\13\5\13\u0149\n\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u0156\n\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\5\13\u015f\n\13\3\f\3\f\3\f\3\f\5\f\u0165\n\f\3\f"+
		"\5\f\u0168\n\f\3\f\3\f\3\f\3\f\3\f\5\f\u016f\n\f\3\f\5\f\u0172\n\f\5\f"+
		"\u0174\n\f\3\r\5\r\u0177\n\r\3\r\3\r\5\r\u017b\n\r\3\16\5\16\u017e\n\16"+
		"\3\16\3\16\5\16\u0182\n\16\3\17\3\17\3\17\3\17\5\17\u0188\n\17\3\17\3"+
		"\17\3\17\3\17\3\17\5\17\u018f\n\17\5\17\u0191\n\17\3\20\3\20\3\20\3\20"+
		"\5\20\u0197\n\20\3\20\5\20\u019a\n\20\3\20\3\20\3\20\3\20\3\20\5\20\u01a1"+
		"\n\20\3\20\5\20\u01a4\n\20\5\20\u01a6\n\20\3\21\3\21\3\21\3\21\5\21\u01ac"+
		"\n\21\3\22\5\22\u01af\n\22\3\22\3\22\3\23\3\23\3\23\3\23\5\23\u01b7\n"+
		"\23\3\24\3\24\3\25\3\25\3\25\7\25\u01be\n\25\f\25\16\25\u01c1\13\25\3"+
		"\26\3\26\3\26\7\26\u01c6\n\26\f\26\16\26\u01c9\13\26\3\27\3\27\3\27\3"+
		"\27\5\27\u01cf\n\27\3\30\3\30\3\30\3\30\7\30\u01d5\n\30\f\30\16\30\u01d8"+
		"\13\30\3\31\3\31\3\31\3\31\7\31\u01de\n\31\f\31\16\31\u01e1\13\31\3\32"+
		"\3\32\3\32\3\32\7\32\u01e7\n\32\f\32\16\32\u01ea\13\32\3\33\3\33\3\33"+
		"\3\33\7\33\u01f0\n\33\f\33\16\33\u01f3\13\33\3\34\7\34\u01f6\n\34\f\34"+
		"\16\34\u01f9\13\34\3\34\3\34\3\35\3\35\3\35\3\35\5\35\u0201\n\35\3\35"+
		"\5\35\u0204\n\35\3\35\3\35\3\35\3\35\3\35\3\35\5\35\u020c\n\35\3\35\3"+
		"\35\3\35\3\35\5\35\u0212\n\35\3\35\5\35\u0215\n\35\3\35\3\35\3\35\5\35"+
		"\u021a\n\35\3\36\3\36\3\36\3\36\5\36\u0220\n\36\3\36\5\36\u0223\n\36\3"+
		"\37\3\37\7\37\u0227\n\37\f\37\16\37\u022a\13\37\3\37\3\37\3 \5 \u022f"+
		"\n \3 \3 \5 \u0233\n \3!\3!\3!\3!\5!\u0239\n!\3\"\3\"\3\"\3\"\5\"\u023f"+
		"\n\"\3\"\5\"\u0242\n\"\3#\3#\5#\u0246\n#\3$\3$\3$\3$\7$\u024c\n$\f$\16"+
		"$\u024f\13$\3$\5$\u0252\n$\3$\3$\3$\3$\3$\3$\7$\u025a\n$\f$\16$\u025d"+
		"\13$\3$\5$\u0260\n$\3$\3$\3$\3$\5$\u0266\n$\3%\7%\u0269\n%\f%\16%\u026c"+
		"\13%\3%\3%\3&\3&\3&\5&\u0273\n&\3\'\3\'\3\'\7\'\u0278\n\'\f\'\16\'\u027b"+
		"\13\'\3\'\3\'\3\'\3\'\3\'\7\'\u0282\n\'\f\'\16\'\u0285\13\'\5\'\u0287"+
		"\n\'\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3"+
		"(\3(\3(\3(\5(\u02a2\n(\3)\5)\u02a5\n)\3)\3)\3*\3*\3*\3*\3*\3+\3+\3+\3"+
		"+\3,\3,\3,\3,\5,\u02b6\n,\3,\5,\u02b9\n,\3-\3-\3-\3-\5-\u02bf\n-\3-\5"+
		"-\u02c2\n-\3.\5.\u02c5\n.\3.\3.\5.\u02c9\n.\3/\3/\3/\3/\5/\u02cf\n/\3"+
		"\60\3\60\3\60\3\60\5\60\u02d5\n\60\3\60\5\60\u02d8\n\60\3\61\3\61\3\61"+
		"\3\61\3\61\3\61\3\61\3\61\3\62\3\62\5\62\u02e4\n\62\3\62\3\62\3\62\5\62"+
		"\u02e9\n\62\3\62\3\62\3\63\3\63\3\63\5\63\u02f0\n\63\3\64\3\64\3\64\3"+
		"\64\3\64\3\64\3\64\3\64\5\64\u02fa\n\64\3\64\3\64\3\65\3\65\3\65\5\65"+
		"\u0301\n\65\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\67\3\67\3\67\38"+
		"\38\38\39\39\39\3:\3:\3:\3:\3:\3;\3;\3;\3;\3;\3<\3<\3<\3<\3<\3=\3=\3="+
		"\3=\3=\3>\5>\u0329\n>\3>\5>\u032c\n>\3>\3>\5>\u0330\n>\3>\3>\5>\u0334"+
		"\n>\3?\3?\5?\u0338\n?\3@\3@\3@\3@\3@\5@\u033f\n@\3A\3A\3A\3A\3A\5A\u0346"+
		"\nA\3A\5A\u0349\nA\3B\3B\3B\3B\3B\3B\3C\3C\3C\3C\3D\3D\5D\u0357\nD\3D"+
		"\3D\3D\3E\3E\5E\u035e\nE\3E\3E\3E\5E\u0363\nE\3E\3E\3F\3F\3F\5F\u036a"+
		"\nF\3F\3F\3G\3G\3G\7G\u0371\nG\fG\16G\u0374\13G\3G\5G\u0377\nG\3G\5G\u037a"+
		"\nG\3H\3H\3H\5H\u037f\nH\3I\3I\3J\3J\3K\3K\3K\3K\3K\3K\5K\u038b\nK\5K"+
		"\u038d\nK\3L\3L\3M\3M\3N\3N\3O\3O\3P\3P\3P\3P\3P\3P\3P\3P\7P\u039f\nP"+
		"\fP\16P\u03a2\13P\3P\3P\3P\3P\3P\3P\3P\3P\5P\u03ac\nP\3P\3P\3P\3P\3P\7"+
		"P\u03b3\nP\fP\16P\u03b6\13P\3P\5P\u03b9\nP\3Q\3Q\3Q\3Q\5Q\u03bf\nQ\3Q"+
		"\3Q\5Q\u03c3\nQ\5Q\u03c5\nQ\5Q\u03c7\nQ\3Q\3Q\3Q\3Q\3Q\3Q\5Q\u03cf\nQ"+
		"\3R\3R\3R\3R\3S\3S\3S\5S\u03d8\nS\3S\3S\3T\3T\3T\3T\3T\3T\3T\5T\u03e3"+
		"\nT\3T\5T\u03e6\nT\3U\3U\3U\3U\5U\u03ec\nU\3U\3U\3V\3V\3V\5V\u03f3\nV"+
		"\3V\3V\3V\3W\3W\3W\3W\3W\3W\3W\5W\u03ff\nW\3W\3W\3W\3W\3W\3W\3W\5W\u0408"+
		"\nW\3W\5W\u040b\nW\3W\5W\u040e\nW\5W\u0410\nW\3X\3X\3X\3X\3X\3Y\5Y\u0418"+
		"\nY\3Y\3Y\7Y\u041c\nY\fY\16Y\u041f\13Y\3Y\5Y\u0422\nY\3Y\5Y\u0425\nY\3"+
		"Z\3Z\3Z\7Z\u042a\nZ\fZ\16Z\u042d\13Z\3Z\5Z\u0430\nZ\3[\3[\3[\7[\u0435"+
		"\n[\f[\16[\u0438\13[\3[\5[\u043b\n[\3\\\3\\\3\\\7\\\u0440\n\\\f\\\16\\"+
		"\u0443\13\\\3\\\5\\\u0446\n\\\3]\3]\7]\u044a\n]\f]\16]\u044d\13]\3]\5"+
		"]\u0450\n]\3^\3^\3^\7^\u0455\n^\f^\16^\u0458\13^\3^\5^\u045b\n^\3_\3_"+
		"\3_\7_\u0460\n_\f_\16_\u0463\13_\3_\5_\u0466\n_\3_\2\2`\2\4\6\b\n\f\16"+
		"\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bd"+
		"fhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c\u008e\u0090\u0092"+
		"\u0094\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa"+
		"\u00ac\u00ae\u00b0\u00b2\u00b4\u00b6\u00b8\u00ba\u00bc\2\f\4\2\33\33\36"+
		"\36\4\2\17\17\60\60\4\2\27\27\"\"\4\2\16\16\34\34\20\2>>AACCEEMMTTZZ\\"+
		"\\__bbeeggllss\7\2NNQRUUjjmm\4\2SSkk\6\2YY[[cdff\7\2?@BB^^aarr\t\2\n\n"+
		",,==PPYY[[tt\2\u04df\2\u00bf\3\2\2\2\4\u00c3\3\2\2\2\6\u00df\3\2\2\2\b"+
		"\u00e2\3\2\2\2\n\u00eb\3\2\2\2\f\u010c\3\2\2\2\16\u010e\3\2\2\2\20\u0123"+
		"\3\2\2\2\22\u0136\3\2\2\2\24\u015e\3\2\2\2\26\u0173\3\2\2\2\30\u0176\3"+
		"\2\2\2\32\u017d\3\2\2\2\34\u0190\3\2\2\2\36\u01a5\3\2\2\2 \u01ab\3\2\2"+
		"\2\"\u01ae\3\2\2\2$\u01b2\3\2\2\2&\u01b8\3\2\2\2(\u01ba\3\2\2\2*\u01c2"+
		"\3\2\2\2,\u01ca\3\2\2\2.\u01d0\3\2\2\2\60\u01d9\3\2\2\2\62\u01e2\3\2\2"+
		"\2\64\u01eb\3\2\2\2\66\u01f7\3\2\2\28\u0219\3\2\2\2:\u021b\3\2\2\2<\u0224"+
		"\3\2\2\2>\u022e\3\2\2\2@\u0234\3\2\2\2B\u023a\3\2\2\2D\u0243\3\2\2\2F"+
		"\u0265\3\2\2\2H\u026a\3\2\2\2J\u026f\3\2\2\2L\u0286\3\2\2\2N\u02a1\3\2"+
		"\2\2P\u02a4\3\2\2\2R\u02a8\3\2\2\2T\u02ad\3\2\2\2V\u02b1\3\2\2\2X\u02c1"+
		"\3\2\2\2Z\u02c4\3\2\2\2\\\u02ca\3\2\2\2^\u02d0\3\2\2\2`\u02d9\3\2\2\2"+
		"b\u02e1\3\2\2\2d\u02ec\3\2\2\2f\u02f1\3\2\2\2h\u02fd\3\2\2\2j\u0302\3"+
		"\2\2\2l\u030a\3\2\2\2n\u030d\3\2\2\2p\u0310\3\2\2\2r\u0313\3\2\2\2t\u0318"+
		"\3\2\2\2v\u031d\3\2\2\2x\u0322\3\2\2\2z\u0333\3\2\2\2|\u0337\3\2\2\2~"+
		"\u0339\3\2\2\2\u0080\u0340\3\2\2\2\u0082\u034a\3\2\2\2\u0084\u0350\3\2"+
		"\2\2\u0086\u0354\3\2\2\2\u0088\u035b\3\2\2\2\u008a\u0366\3\2\2\2\u008c"+
		"\u0379\3\2\2\2\u008e\u037b\3\2\2\2\u0090\u0380\3\2\2\2\u0092\u0382\3\2"+
		"\2\2\u0094\u038c\3\2\2\2\u0096\u038e\3\2\2\2\u0098\u0390\3\2\2\2\u009a"+
		"\u0392\3\2\2\2\u009c\u0394\3\2\2\2\u009e\u03b8\3\2\2\2\u00a0\u03ce\3\2"+
		"\2\2\u00a2\u03d0\3\2\2\2\u00a4\u03d4\3\2\2\2\u00a6\u03e5\3\2\2\2\u00a8"+
		"\u03e7\3\2\2\2\u00aa\u03ef\3\2\2\2\u00ac\u040f\3\2\2\2\u00ae\u0411\3\2"+
		"\2\2\u00b0\u041d\3\2\2\2\u00b2\u042b\3\2\2\2\u00b4\u0436\3\2\2\2\u00b6"+
		"\u0441\3\2\2\2\u00b8\u044b\3\2\2\2\u00ba\u0456\3\2\2\2\u00bc\u0461\3\2"+
		"\2\2\u00be\u00c0\7\63\2\2\u00bf\u00be\3\2\2\2\u00bf\u00c0\3\2\2\2\u00c0"+
		"\u00c1\3\2\2\2\u00c1\u00c2\5\4\3\2\u00c2\3\3\2\2\2\u00c3\u00c9\5\6\4\2"+
		"\u00c4\u00c5\5\22\n\2\u00c5\u00c6\7G\2\2\u00c6\u00c8\3\2\2\2\u00c7\u00c4"+
		"\3\2\2\2\u00c8\u00cb\3\2\2\2\u00c9\u00c7\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca"+
		"\u00ce\3\2\2\2\u00cb\u00c9\3\2\2\2\u00cc\u00cf\5\22\n\2\u00cd\u00cf\5"+
		"\6\4\2\u00ce\u00cc\3\2\2\2\u00ce\u00cd\3\2\2\2\u00cf\5\3\2\2\2\u00d0\u00d1"+
		"\5\b\5\2\u00d1\u00d2\5\6\4\2\u00d2\u00e0\3\2\2\2\u00d3\u00d4\5\n\6\2\u00d4"+
		"\u00d5\5\6\4\2\u00d5\u00e0\3\2\2\2\u00d6\u00d8\7\64\2\2\u00d7\u00d6\3"+
		"\2\2\2\u00d7\u00d8\3\2\2\2\u00d8\u00da\3\2\2\2\u00d9\u00db\7#\2\2\u00da"+
		"\u00d9\3\2\2\2\u00da\u00db\3\2\2\2\u00db\u00dc\3\2\2\2\u00dc\u00dd\5\f"+
		"\7\2\u00dd\u00de\5\6\4\2\u00de\u00e0\3\2\2\2\u00df\u00d0\3\2\2\2\u00df"+
		"\u00d3\3\2\2\2\u00df\u00d7\3\2\2\2\u00e0\7\3\2\2\2\u00e1\u00e3\7\64\2"+
		"\2\u00e2\u00e1\3\2\2\2\u00e2\u00e3\3\2\2\2\u00e3\u00e4\3\2\2\2\u00e4\u00e6"+
		"\7*\2\2\u00e5\u00e7\79\2\2\u00e6\u00e5\3\2\2\2\u00e6\u00e7\3\2\2\2\u00e7"+
		"\u00e8\3\2\2\2\u00e8\u00e9\5<\37\2\u00e9\t\3\2\2\2\u00ea\u00ec\7\64\2"+
		"\2\u00eb\u00ea\3\2\2\2\u00eb\u00ec\3\2\2\2\u00ec\u00ed\3\2\2\2\u00ed\u00ee"+
		"\7\16\2\2\u00ee\u00ef\5<\37\2\u00ef\13\3\2\2\2\u00f0\u00f7\7\26\2\2\u00f1"+
		"\u00f3\7\27\2\2\u00f2\u00f4\79\2\2\u00f3\u00f2\3\2\2\2\u00f3\u00f4\3\2"+
		"\2\2\u00f4\u00f7\3\2\2\2\u00f5\u00f7\t\2\2\2\u00f6\u00f0\3\2\2\2\u00f6"+
		"\u00f1\3\2\2\2\u00f6\u00f5\3\2\2\2\u00f6\u00f7\3\2\2\2\u00f7\u00f8\3\2"+
		"\2\2\u00f8\u00fb\5\16\b\2\u00f9\u00fc\7q\2\2\u00fa\u00fc\5<\37\2\u00fb"+
		"\u00f9\3\2\2\2\u00fb\u00fa\3\2\2\2\u00fc\u010d\3\2\2\2\u00fd\u0103\7\26"+
		"\2\2\u00fe\u0100\7\27\2\2\u00ff\u0101\79\2\2\u0100\u00ff\3\2\2\2\u0100"+
		"\u0101\3\2\2\2\u0101\u0103\3\2\2\2\u0102\u00fd\3\2\2\2\u0102\u00fe\3\2"+
		"\2\2\u0102\u0103\3\2\2\2\u0103\u0105\3\2\2\2\u0104\u0106\7+\2\2\u0105"+
		"\u0104\3\2\2\2\u0105\u0106\3\2\2\2\u0106\u0107\3\2\2\2\u0107\u010d\5\20"+
		"\t\2\u0108\u0109\7/\2\2\u0109\u010a\5&\24\2\u010a\u010b\7q\2\2\u010b\u010d"+
		"\3\2\2\2\u010c\u00f6\3\2\2\2\u010c\u0102\3\2\2\2\u010c\u0108\3\2\2\2\u010d"+
		"\r\3\2\2\2\u010e\u0110\7\30\2\2\u010f\u0111\7;\2\2\u0110\u010f\3\2\2\2"+
		"\u0110\u0111\3\2\2\2\u0111\u0112\3\2\2\2\u0112\u0113\7X\2\2\u0113\u0114"+
		"\5\u00ba^\2\u0114\u0116\7p\2\2\u0115\u0117\5\u00aeX\2\u0116\u0115\3\2"+
		"\2\2\u0116\u0117\3\2\2\2\u0117\u0119\3\2\2\2\u0118\u011a\5v<\2\u0119\u0118"+
		"\3\2\2\2\u0119\u011a\3\2\2\2\u011a\u011c\3\2\2\2\u011b\u011d\5x=\2\u011c"+
		"\u011b\3\2\2\2\u011c\u011d\3\2\2\2\u011d\u011f\3\2\2\2\u011e\u0120\7P"+
		"\2\2\u011f\u011e\3\2\2\2\u011f\u0120\3\2\2\2\u0120\u0121\3\2\2\2\u0121"+
		"\u0122\5H%\2\u0122\17\3\2\2\2\u0123\u0124\t\3\2\2\u0124\u0127\7;\2\2\u0125"+
		"\u0126\7F\2\2\u0126\u0128\5H%\2\u0127\u0125\3\2\2\2\u0127\u0128\3\2\2"+
		"\2\u0128\u012a\3\2\2\2\u0129\u012b\5\u00aeX\2\u012a\u0129\3\2\2\2\u012a"+
		"\u012b\3\2\2\2\u012b\u012d\3\2\2\2\u012c\u012e\5v<\2\u012d\u012c\3\2\2"+
		"\2\u012d\u012e\3\2\2\2\u012e\u0131\3\2\2\2\u012f\u0130\7M\2\2\u0130\u0132"+
		"\5&\24\2\u0131\u012f\3\2\2\2\u0131\u0132\3\2\2\2\u0132\u0133\3\2\2\2\u0133"+
		"\u0134\7q\2\2\u0134\21\3\2\2\2\u0135\u0137\7\64\2\2\u0136\u0135\3\2\2"+
		"\2\u0136\u0137\3\2\2\2\u0137\u0139\3\2\2\2\u0138\u013a\7\16\2\2\u0139"+
		"\u0138\3\2\2\2\u0139\u013a\3\2\2\2\u013a\u013b\3\2\2\2\u013b\u0141\7;"+
		"\2\2\u013c\u013d\7F\2\2\u013d\u013f\5H%\2\u013e\u0140\5\u00aeX\2\u013f"+
		"\u013e\3\2\2\2\u013f\u0140\3\2\2\2\u0140\u0142\3\2\2\2\u0141\u013c\3\2"+
		"\2\2\u0141\u0142\3\2\2\2\u0142\u0145\3\2\2\2\u0143\u0144\7M\2\2\u0144"+
		"\u0146\5&\24\2\u0145\u0143\3\2\2\2\u0145\u0146\3\2\2\2\u0146\23\3\2\2"+
		"\2\u0147\u0149\7\16\2\2\u0148\u0147\3\2\2\2\u0148\u0149\3\2\2\2\u0149"+
		"\u014a\3\2\2\2\u014a\u015f\5\20\t\2\u014b\u014c\7\16\2\2\u014c\u015f\5"+
		" \21\2\u014d\u014e\7\35\2\2\u014e\u015f\5 \21\2\u014f\u0150\7(\2\2\u0150"+
		"\u015f\5 \21\2\u0151\u0152\7\21\2\2\u0152\u015f\5 \21\2\u0153\u0155\7"+
		"\24\2\2\u0154\u0156\5\u0084C\2\u0155\u0154\3\2\2\2\u0155\u0156\3\2\2\2"+
		"\u0156\u0157\3\2\2\2\u0157\u015f\5 \21\2\u0158\u015f\5\26\f\2\u0159\u015f"+
		"\5\30\r\2\u015a\u015f\5`\61\2\u015b\u015c\5$\23\2\u015c\u015d\7q\2\2\u015d"+
		"\u015f\3\2\2\2\u015e\u0148\3\2\2\2\u015e\u014b\3\2\2\2\u015e\u014d\3\2"+
		"\2\2\u015e\u014f\3\2\2\2\u015e\u0151\3\2\2\2\u015e\u0153\3\2\2\2\u015e"+
		"\u0158\3\2\2\2\u015e\u0159\3\2\2\2\u015e\u015a\3\2\2\2\u015e\u015b\3\2"+
		"\2\2\u015f\25\3\2\2\2\u0160\u0161\5~@\2\u0161\u0167\5\"\22\2\u0162\u0164"+
		"\7\22\2\2\u0163\u0165\5\u0084C\2\u0164\u0163\3\2\2\2\u0164\u0165\3\2\2"+
		"\2\u0165\u0166\3\2\2\2\u0166\u0168\5\24\13\2\u0167\u0162\3\2\2\2\u0167"+
		"\u0168\3\2\2\2\u0168\u0174\3\2\2\2\u0169\u016a\5~@\2\u016a\u0171\5$\23"+
		"\2\u016b\u0172\7q\2\2\u016c\u016e\7\22\2\2\u016d\u016f\5\u0084C\2\u016e"+
		"\u016d\3\2\2\2\u016e\u016f\3\2\2\2\u016f\u0170\3\2\2\2\u0170\u0172\5\24"+
		"\13\2\u0171\u016b\3\2\2\2\u0171\u016c\3\2\2\2\u0172\u0174\3\2\2\2\u0173"+
		"\u0160\3\2\2\2\u0173\u0169\3\2\2\2\u0174\27\3\2\2\2\u0175\u0177\5p9\2"+
		"\u0176\u0175\3\2\2\2\u0176\u0177\3\2\2\2\u0177\u017a\3\2\2\2\u0178\u017b"+
		"\5<\37\2\u0179\u017b\5\32\16\2\u017a\u0178\3\2\2\2\u017a\u0179\3\2\2\2"+
		"\u017b\31\3\2\2\2\u017c\u017e\7\33\2\2\u017d\u017c\3\2\2\2\u017d\u017e"+
		"\3\2\2\2\u017e\u0181\3\2\2\2\u017f\u0182\5\34\17\2\u0180\u0182\5\36\20"+
		"\2\u0181\u017f\3\2\2\2\u0181\u0180\3\2\2\2\u0182\33\3\2\2\2\u0183\u0184"+
		"\5\u0082B\2\u0184\u0187\5\"\22\2\u0185\u0186\7\22\2\2\u0186\u0188\5\24"+
		"\13\2\u0187\u0185\3\2\2\2\u0187\u0188\3\2\2\2\u0188\u0191\3\2\2\2\u0189"+
		"\u018a\5\u0082B\2\u018a\u018e\5$\23\2\u018b\u018f\7q\2\2\u018c\u018d\7"+
		"\22\2\2\u018d\u018f\5\24\13\2\u018e\u018b\3\2\2\2\u018e\u018c\3\2\2\2"+
		"\u018f\u0191\3\2\2\2\u0190\u0183\3\2\2\2\u0190\u0189\3\2\2\2\u0191\35"+
		"\3\2\2\2\u0192\u0193\5\u0080A\2\u0193\u0199\5\"\22\2\u0194\u0196\7\22"+
		"\2\2\u0195\u0197\5\u0084C\2\u0196\u0195\3\2\2\2\u0196\u0197\3\2\2\2\u0197"+
		"\u0198\3\2\2\2\u0198\u019a\5\24\13\2\u0199\u0194\3\2\2\2\u0199\u019a\3"+
		"\2\2\2\u019a\u01a6\3\2\2\2\u019b\u019c\5\u0080A\2\u019c\u01a3\5$\23\2"+
		"\u019d\u01a4\7q\2\2\u019e\u01a0\7\22\2\2\u019f\u01a1\5\u0084C\2\u01a0"+
		"\u019f\3\2\2\2\u01a0\u01a1\3\2\2\2\u01a1\u01a2\3\2\2\2\u01a2\u01a4\5\24"+
		"\13\2\u01a3\u019d\3\2\2\2\u01a3\u019e\3\2\2\2\u01a4\u01a6\3\2\2\2\u01a5"+
		"\u0192\3\2\2\2\u01a5\u019b\3\2\2\2\u01a6\37\3\2\2\2\u01a7\u01ac\5\"\22"+
		"\2\u01a8\u01a9\5$\23\2\u01a9\u01aa\7q\2\2\u01aa\u01ac\3\2\2\2\u01ab\u01a7"+
		"\3\2\2\2\u01ab\u01a8\3\2\2\2\u01ac!\3\2\2\2\u01ad\u01af\5p9\2\u01ae\u01ad"+
		"\3\2\2\2\u01ae\u01af\3\2\2\2\u01af\u01b0\3\2\2\2\u01b0\u01b1\5<\37\2\u01b1"+
		"#\3\2\2\2\u01b2\u01b6\5&\24\2\u01b3\u01b4\5\u0090I\2\u01b4\u01b5\5&\24"+
		"\2\u01b5\u01b7\3\2\2\2\u01b6\u01b3\3\2\2\2\u01b6\u01b7\3\2\2\2\u01b7%"+
		"\3\2\2\2\u01b8\u01b9\5(\25\2\u01b9\'\3\2\2\2\u01ba\u01bf\5*\26\2\u01bb"+
		"\u01bc\7 \2\2\u01bc\u01be\5*\26\2\u01bd\u01bb\3\2\2\2\u01be\u01c1\3\2"+
		"\2\2\u01bf\u01bd\3\2\2\2\u01bf\u01c0\3\2\2\2\u01c0)\3\2\2\2\u01c1\u01bf"+
		"\3\2\2\2\u01c2\u01c7\5,\27\2\u01c3\u01c4\7\5\2\2\u01c4\u01c6\5,\27\2\u01c5"+
		"\u01c3\3\2\2\2\u01c6\u01c9\3\2\2\2\u01c7\u01c5\3\2\2\2\u01c7\u01c8\3\2"+
		"\2\2\u01c8+\3\2\2\2\u01c9\u01c7\3\2\2\2\u01ca\u01ce\5.\30\2\u01cb\u01cc"+
		"\5\u0092J\2\u01cc\u01cd\5.\30\2\u01cd\u01cf\3\2\2\2\u01ce\u01cb\3\2\2"+
		"\2\u01ce\u01cf\3\2\2\2\u01cf-\3\2\2\2\u01d0\u01d6\5\60\31\2\u01d1\u01d2"+
		"\5\u0094K\2\u01d2\u01d3\5\60\31\2\u01d3\u01d5\3\2\2\2\u01d4\u01d1\3\2"+
		"\2\2\u01d5\u01d8\3\2\2\2\u01d6\u01d4\3\2\2\2\u01d6\u01d7\3\2\2\2\u01d7"+
		"/\3\2\2\2\u01d8\u01d6\3\2\2\2\u01d9\u01df\5\62\32\2\u01da\u01db\5\u0096"+
		"L\2\u01db\u01dc\5\62\32\2\u01dc\u01de\3\2\2\2\u01dd\u01da\3\2\2\2\u01de"+
		"\u01e1\3\2\2\2\u01df\u01dd\3\2\2\2\u01df\u01e0\3\2\2\2\u01e0\61\3\2\2"+
		"\2\u01e1\u01df\3\2\2\2\u01e2\u01e8\5\64\33\2\u01e3\u01e4\5\u0098M\2\u01e4"+
		"\u01e5\5\64\33\2\u01e5\u01e7\3\2\2\2\u01e6\u01e3\3\2\2\2\u01e7\u01ea\3"+
		"\2\2\2\u01e8\u01e6\3\2\2\2\u01e8\u01e9\3\2\2\2\u01e9\63\3\2\2\2\u01ea"+
		"\u01e8\3\2\2\2\u01eb\u01f1\5\66\34\2\u01ec\u01ed\5\u009aN\2\u01ed\u01ee"+
		"\5\66\34\2\u01ee\u01f0\3\2\2\2\u01ef\u01ec\3\2\2\2\u01f0\u01f3\3\2\2\2"+
		"\u01f1\u01ef\3\2\2\2\u01f1\u01f2\3\2\2\2\u01f2\65\3\2\2\2\u01f3\u01f1"+
		"\3\2\2\2\u01f4\u01f6\5\u009cO\2\u01f5\u01f4\3\2\2\2\u01f6\u01f9\3\2\2"+
		"\2\u01f7\u01f5\3\2\2\2\u01f7\u01f8\3\2\2\2\u01f8\u01fa\3\2\2\2\u01f9\u01f7"+
		"\3\2\2\2\u01fa\u01fb\58\35\2\u01fb\67\3\2\2\2\u01fc\u021a\5b\62\2\u01fd"+
		"\u021a\5:\36\2\u01fe\u0200\7\13\2\2\u01ff\u0201\5n8\2\u0200\u01ff\3\2"+
		"\2\2\u0200\u0201\3\2\2\2\u0201\u0203\3\2\2\2\u0202\u0204\5&\24\2\u0203"+
		"\u0202\3\2\2\2\u0203\u0204\3\2\2\2\u0204\u021a\3\2\2\2\u0205\u0206\7\16"+
		"\2\2\u0206\u021a\5&\24\2\u0207\u0208\7\35\2\2\u0208\u021a\5&\24\2\u0209"+
		"\u020b\7\20\2\2\u020a\u020c\5n8\2\u020b\u020a\3\2\2\2\u020b\u020c\3\2"+
		"\2\2\u020c\u021a\3\2\2\2\u020d\u020e\7$\2\2\u020e\u021a\5&\24\2\u020f"+
		"\u0211\7%\2\2\u0210\u0212\5&\24\2\u0211\u0210\3\2\2\2\u0211\u0212\3\2"+
		"\2\2\u0212\u021a\3\2\2\2\u0213\u0215\5p9\2\u0214\u0213\3\2\2\2\u0214\u0215"+
		"\3\2\2\2\u0215\u0216\3\2\2\2\u0216\u021a\5> \2\u0217\u021a\5<\37\2\u0218"+
		"\u021a\5D#\2\u0219\u01fc\3\2\2\2\u0219\u01fd\3\2\2\2\u0219\u01fe\3\2\2"+
		"\2\u0219\u0205\3\2\2\2\u0219\u0207\3\2\2\2\u0219\u0209\3\2\2\2\u0219\u020d"+
		"\3\2\2\2\u0219\u020f\3\2\2\2\u0219\u0214\3\2\2\2\u0219\u0217\3\2\2\2\u0219"+
		"\u0218\3\2\2\2\u021a9\3\2\2\2\u021b\u021c\5~@\2\u021c\u0222\5&\24\2\u021d"+
		"\u021f\7\22\2\2\u021e\u0220\5\u0084C\2\u021f\u021e\3\2\2\2\u021f\u0220"+
		"\3\2\2\2\u0220\u0221\3\2\2\2\u0221\u0223\5&\24\2\u0222\u021d\3\2\2\2\u0222"+
		"\u0223\3\2\2\2\u0223;\3\2\2\2\u0224\u0228\7V\2\2\u0225\u0227\5\24\13\2"+
		"\u0226\u0225\3\2\2\2\u0227\u022a\3\2\2\2\u0228\u0226\3\2\2\2\u0228\u0229"+
		"\3\2\2\2\u0229\u022b\3\2\2\2\u022a\u0228\3\2\2\2\u022b\u022c\7n\2\2\u022c"+
		"=\3\2\2\2\u022d\u022f\7\33\2\2\u022e\u022d\3\2\2\2\u022e\u022f\3\2\2\2"+
		"\u022f\u0232\3\2\2\2\u0230\u0233\5@!\2\u0231\u0233\5B\"\2\u0232\u0230"+
		"\3\2\2\2\u0232\u0231\3\2\2\2\u0233?\3\2\2\2\u0234\u0235\5\u0082B\2\u0235"+
		"\u0238\5&\24\2\u0236\u0237\7\22\2\2\u0237\u0239\5&\24\2\u0238\u0236\3"+
		"\2\2\2\u0238\u0239\3\2\2\2\u0239A\3\2\2\2\u023a\u023b\5\u0080A\2\u023b"+
		"\u0241\5&\24\2\u023c\u023e\7\22\2\2\u023d\u023f\5\u0084C\2\u023e\u023d"+
		"\3\2\2\2\u023e\u023f\3\2\2\2\u023f\u0240\3\2\2\2\u0240\u0242\5&\24\2\u0241"+
		"\u023c\3\2\2\2\u0241\u0242\3\2\2\2\u0242C\3\2\2\2\u0243\u0245\5H%\2\u0244"+
		"\u0246\5F$\2\u0245\u0244\3\2\2\2\u0245\u0246\3\2\2\2\u0246E\3\2\2\2\u0247"+
		"\u0248\7V\2\2\u0248\u024d\5r:\2\u0249\u024a\7G\2\2\u024a\u024c\5r:\2\u024b"+
		"\u0249\3\2\2\2\u024c\u024f\3\2\2\2\u024d\u024b\3\2\2\2\u024d\u024e\3\2"+
		"\2\2\u024e\u0251\3\2\2\2\u024f\u024d\3\2\2\2\u0250\u0252\7G\2\2\u0251"+
		"\u0250\3\2\2\2\u0251\u0252\3\2\2\2\u0252\u0253\3\2\2\2\u0253\u0254\7n"+
		"\2\2\u0254\u0266\3\2\2\2\u0255\u0256\7V\2\2\u0256\u025b\5&\24\2\u0257"+
		"\u0258\7G\2\2\u0258\u025a\5&\24\2\u0259\u0257\3\2\2\2\u025a\u025d\3\2"+
		"\2\2\u025b\u0259\3\2\2\2\u025b\u025c\3\2\2\2\u025c\u025f\3\2\2\2\u025d"+
		"\u025b\3\2\2\2\u025e\u0260\7G\2\2\u025f\u025e\3\2\2\2\u025f\u0260\3\2"+
		"\2\2\u0260\u0261\3\2\2\2\u0261\u0262\7n\2\2\u0262\u0266\3\2\2\2\u0263"+
		"\u0264\7V\2\2\u0264\u0266\7n\2\2\u0265\u0247\3\2\2\2\u0265\u0255\3\2\2"+
		"\2\u0265\u0263\3\2\2\2\u0266G\3\2\2\2\u0267\u0269\5\u009eP\2\u0268\u0267"+
		"\3\2\2\2\u0269\u026c\3\2\2\2\u026a\u0268\3\2\2\2\u026a\u026b\3\2\2\2\u026b"+
		"\u026d\3\2\2\2\u026c\u026a\3\2\2\2\u026d\u026e\5J&\2\u026eI\3\2\2\2\u026f"+
		"\u0272\5L\'\2\u0270\u0271\7P\2\2\u0271\u0273\5H%\2\u0272\u0270\3\2\2\2"+
		"\u0272\u0273\3\2\2\2\u0273K\3\2\2\2\u0274\u0275\7\t\2\2\u0275\u0279\5"+
		"N(\2\u0276\u0278\5\u00a0Q\2\u0277\u0276\3\2\2\2\u0278\u027b\3\2\2\2\u0279"+
		"\u0277\3\2\2\2\u0279\u027a\3\2\2\2\u027a\u027c\3\2\2\2\u027b\u0279\3\2"+
		"\2\2\u027c\u027d\5\u00a2R\2\u027d\u0287\3\2\2\2\u027e\u0283\5N(\2\u027f"+
		"\u0282\5\u00a0Q\2\u0280\u0282\5\u00a2R\2\u0281\u027f\3\2\2\2\u0281\u0280"+
		"\3\2\2\2\u0282\u0285\3\2\2\2\u0283\u0281\3\2\2\2\u0283\u0284\3\2\2\2\u0284"+
		"\u0287\3\2\2\2\u0285\u0283\3\2\2\2\u0286\u0274\3\2\2\2\u0286\u027e\3\2"+
		"\2\2\u0287M\3\2\2\2\u0288\u0289\7<\2\2\u0289\u02a2\5\u00a2R\2\u028a\u02a2"+
		"\7\66\2\2\u028b\u02a2\5P)\2\u028c\u028d\7H\2\2\u028d\u02a2\7;\2\2\u028e"+
		"\u028f\7H\2\2\u028f\u02a2\5F$\2\u0290\u02a2\5R*\2\u0291\u02a2\7\67\2\2"+
		"\u0292\u02a2\5\16\b\2\u0293\u02a2\5T+\2\u0294\u02a2\5X-\2\u0295\u02a2"+
		"\7;\2\2\u0296\u02a2\5V,\2\u0297\u02a2\78\2\2\u0298\u0299\7\16\2\2\u0299"+
		"\u02a2\5H%\2\u029a\u029b\7\25\2\2\u029b\u029c\7H\2\2\u029c\u02a2\7;\2"+
		"\2\u029d\u02a2\7\6\2\2\u029e\u02a2\7.\2\2\u029f\u02a2\7:\2\2\u02a0\u02a2"+
		"\5`\61\2\u02a1\u0288\3\2\2\2\u02a1\u028a\3\2\2\2\u02a1\u028b\3\2\2\2\u02a1"+
		"\u028c\3\2\2\2\u02a1\u028e\3\2\2\2\u02a1\u0290\3\2\2\2\u02a1\u0291\3\2"+
		"\2\2\u02a1\u0292\3\2\2\2\u02a1\u0293\3\2\2\2\u02a1\u0294\3\2\2\2\u02a1"+
		"\u0295\3\2\2\2\u02a1\u0296\3\2\2\2\u02a1\u0297\3\2\2\2\u02a1\u0298\3\2"+
		"\2\2\u02a1\u029a\3\2\2\2\u02a1\u029d\3\2\2\2\u02a1\u029e\3\2\2\2\u02a1"+
		"\u029f\3\2\2\2\u02a1\u02a0\3\2\2\2\u02a2O\3\2\2\2\u02a3\u02a5\t\4\2\2"+
		"\u02a4\u02a3\3\2\2\2\u02a4\u02a5\3\2\2\2\u02a5\u02a6\3\2\2\2\u02a6\u02a7"+
		"\5\u00aaV\2\u02a7Q\3\2\2\2\u02a8\u02a9\7\25\2\2\u02a9\u02aa\7V\2\2\u02aa"+
		"\u02ab\5\u00b0Y\2\u02ab\u02ac\7n\2\2\u02acS\3\2\2\2\u02ad\u02ae\7X\2\2"+
		"\u02ae\u02af\5&\24\2\u02af\u02b0\7p\2\2\u02b0U\3\2\2\2\u02b1\u02b2\5~"+
		"@\2\u02b2\u02b8\5H%\2\u02b3\u02b5\7\22\2\2\u02b4\u02b6\5\u0084C\2\u02b5"+
		"\u02b4\3\2\2\2\u02b5\u02b6\3\2\2\2\u02b6\u02b7\3\2\2\2\u02b7\u02b9\5H"+
		"%\2\u02b8\u02b3\3\2\2\2\u02b8\u02b9\3\2\2\2\u02b9W\3\2\2\2\u02ba\u02bb"+
		"\5p9\2\u02bb\u02bc\5<\37\2\u02bc\u02c2\3\2\2\2\u02bd\u02bf\5p9\2\u02be"+
		"\u02bd\3\2\2\2\u02be\u02bf\3\2\2\2\u02bf\u02c0\3\2\2\2\u02c0\u02c2\5Z"+
		".\2\u02c1\u02ba\3\2\2\2\u02c1\u02be\3\2\2\2\u02c2Y\3\2\2\2\u02c3\u02c5"+
		"\7\33\2\2\u02c4\u02c3\3\2\2\2\u02c4\u02c5\3\2\2\2\u02c5\u02c8\3\2\2\2"+
		"\u02c6\u02c9\5\\/\2\u02c7\u02c9\5^\60\2\u02c8\u02c6\3\2\2\2\u02c8\u02c7"+
		"\3\2\2\2\u02c9[\3\2\2\2\u02ca\u02cb\5\u0082B\2\u02cb\u02ce\5H%\2\u02cc"+
		"\u02cd\7\22\2\2\u02cd\u02cf\5H%\2\u02ce\u02cc\3\2\2\2\u02ce\u02cf\3\2"+
		"\2\2\u02cf]\3\2\2\2\u02d0\u02d1\5\u0080A\2\u02d1\u02d7\5H%\2\u02d2\u02d4"+
		"\7\22\2\2\u02d3\u02d5\5\u0084C\2\u02d4\u02d3\3\2\2\2\u02d4\u02d5\3\2\2"+
		"\2\u02d5\u02d6\3\2\2\2\u02d6\u02d8\5H%\2\u02d7\u02d2\3\2\2\2\u02d7\u02d8"+
		"\3\2\2\2\u02d8_\3\2\2\2\u02d9\u02da\7)\2\2\u02da\u02db\7X\2\2\u02db\u02dc"+
		"\5&\24\2\u02dc\u02dd\7p\2\2\u02dd\u02de\7V\2\2\u02de\u02df\5\u00b2Z\2"+
		"\u02df\u02e0\7n\2\2\u02e0a\3\2\2\2\u02e1\u02e3\7\b\2\2\u02e2\u02e4\7\61"+
		"\2\2\u02e3\u02e2\3\2\2\2\u02e3\u02e4\3\2\2\2\u02e4\u02e5\3\2\2\2\u02e5"+
		"\u02e6\7X\2\2\u02e6\u02e8\5&\24\2\u02e7\u02e9\5d\63\2\u02e8\u02e7\3\2"+
		"\2\2\u02e8\u02e9\3\2\2\2\u02e9\u02ea\3\2\2\2\u02ea\u02eb\7p\2\2\u02eb"+
		"c\3\2\2\2\u02ec\u02ed\7F\2\2\u02ed\u02ef\5\u00b4[\2\u02ee\u02f0\5h\65"+
		"\2\u02ef\u02ee\3\2\2\2\u02ef\u02f0\3\2\2\2\u02f0e\3\2\2\2\u02f1\u02f2"+
		"\7W\2\2\u02f2\u02f3\7;\2\2\u02f3\u02f4\7o\2\2\u02f4\u02f5\7:\2\2\u02f5"+
		"\u02f9\7X\2\2\u02f6\u02f7\7]\2\2\u02f7\u02fa\5H%\2\u02f8\u02fa\7;\2\2"+
		"\u02f9\u02f6\3\2\2\2\u02f9\u02f8\3\2\2\2\u02fa\u02fb\3\2\2\2\u02fb\u02fc"+
		"\7p\2\2\u02fcg\3\2\2\2\u02fd\u02fe\7F\2\2\u02fe\u0300\5\u00b6\\\2\u02ff"+
		"\u0301\5l\67\2\u0300\u02ff\3\2\2\2\u0300\u0301\3\2\2\2\u0301i\3\2\2\2"+
		"\u0302\u0303\7W\2\2\u0303\u0304\7;\2\2\u0304\u0305\7o\2\2\u0305\u0306"+
		"\7:\2\2\u0306\u0307\7X\2\2\u0307\u0308\5&\24\2\u0308\u0309\7p\2\2\u0309"+
		"k\3\2\2\2\u030a\u030b\7F\2\2\u030b\u030c\5\u00b8]\2\u030cm\3\2\2\2\u030d"+
		"\u030e\7F\2\2\u030e\u030f\7;\2\2\u030fo\3\2\2\2\u0310\u0311\7;\2\2\u0311"+
		"\u0312\7F\2\2\u0312q\3\2\2\2\u0313\u0314\7H\2\2\u0314\u0315\7;\2\2\u0315"+
		"\u0316\7M\2\2\u0316\u0317\5&\24\2\u0317s\3\2\2\2\u0318\u0319\7F\2\2\u0319"+
		"\u031a\7X\2\2\u031a\u031b\5$\23\2\u031b\u031c\7p\2\2\u031cu\3\2\2\2\u031d"+
		"\u031e\7&\2\2\u031e\u031f\7X\2\2\u031f\u0320\5&\24\2\u0320\u0321\7p\2"+
		"\2\u0321w\3\2\2\2\u0322\u0323\7\f\2\2\u0323\u0324\7X\2\2\u0324\u0325\5"+
		"&\24\2\u0325\u0326\7p\2\2\u0326y\3\2\2\2\u0327\u0329\7\64\2\2\u0328\u0327"+
		"\3\2\2\2\u0328\u0329\3\2\2\2\u0329\u032b\3\2\2\2\u032a\u032c\t\5\2\2\u032b"+
		"\u032a\3\2\2\2\u032b\u032c\3\2\2\2\u032c\u032f\3\2\2\2\u032d\u032e\7;"+
		"\2\2\u032e\u0330\7F\2\2\u032f\u032d\3\2\2\2\u032f\u0330\3\2\2\2\u0330"+
		"\u0331\3\2\2\2\u0331\u0334\5|?\2\u0332\u0334\7J\2\2\u0333\u0328\3\2\2"+
		"\2\u0333\u0332\3\2\2\2\u0334{\3\2\2\2\u0335\u0338\7\7\2\2\u0336\u0338"+
		"\5H%\2\u0337\u0335\3\2\2\2\u0337\u0336\3\2\2\2\u0338}\3\2\2\2\u0339\u033a"+
		"\7\32\2\2\u033a\u033b\7X\2\2\u033b\u033c\5&\24\2\u033c\u033e\7p\2\2\u033d"+
		"\u033f\5\u0086D\2\u033e\u033d\3\2\2\2\u033e\u033f\3\2\2\2\u033f\177\3"+
		"\2\2\2\u0340\u0341\7\62\2\2\u0341\u0342\7X\2\2\u0342\u0343\5&\24\2\u0343"+
		"\u0345\7p\2\2\u0344\u0346\5\u0086D\2\u0345\u0344\3\2\2\2\u0345\u0346\3"+
		"\2\2\2\u0346\u0348\3\2\2\2\u0347\u0349\5t;\2\u0348\u0347\3\2\2\2\u0348"+
		"\u0349\3\2\2\2\u0349\u0081\3\2\2\2\u034a\u034b\7\31\2\2\u034b\u034c\7"+
		"X\2\2\u034c\u034d\5&\24\2\u034d\u034e\7p\2\2\u034e\u034f\5\u0088E\2\u034f"+
		"\u0083\3\2\2\2\u0350\u0351\7`\2\2\u0351\u0352\7;\2\2\u0352\u0353\7`\2"+
		"\2\u0353\u0085\3\2\2\2\u0354\u0356\7`\2\2\u0355\u0357\7?\2\2\u0356\u0355"+
		"\3\2\2\2\u0356\u0357\3\2\2\2\u0357\u0358\3\2\2\2\u0358\u0359\7;\2\2\u0359"+
		"\u035a\7`\2\2\u035a\u0087\3\2\2\2\u035b\u035d\7`\2\2\u035c\u035e\7?\2"+
		"\2\u035d\u035c\3\2\2\2\u035d\u035e\3\2\2\2\u035e\u035f\3\2\2\2\u035f\u0362"+
		"\7;\2\2\u0360\u0361\7G\2\2\u0361\u0363\7;\2\2\u0362\u0360\3\2\2\2\u0362"+
		"\u0363\3\2\2\2\u0363\u0364\3\2\2\2\u0364\u0365\7`\2\2\u0365\u0089\3\2"+
		"\2\2\u0366\u0367\5\u008cG\2\u0367\u0369\7O\2\2\u0368\u036a\5\u0086D\2"+
		"\u0369\u0368\3\2\2\2\u0369\u036a\3\2\2\2\u036a\u036b\3\2\2\2\u036b\u036c"+
		"\5$\23\2\u036c\u008b\3\2\2\2\u036d\u0372\5\u008eH\2\u036e\u036f\7G\2\2"+
		"\u036f\u0371\5\u008eH\2\u0370\u036e\3\2\2\2\u0371\u0374\3\2\2\2\u0372"+
		"\u0370\3\2\2\2\u0372\u0373\3\2\2\2\u0373\u0376\3\2\2\2\u0374\u0372\3\2"+
		"\2\2\u0375\u0377\7G\2\2\u0376\u0375\3\2\2\2\u0376\u0377\3\2\2\2\u0377"+
		"\u037a\3\2\2\2\u0378\u037a\7\22\2\2\u0379\u036d\3\2\2\2\u0379\u0378\3"+
		"\2\2\2\u037a\u008d\3\2\2\2\u037b\u037e\5&\24\2\u037c\u037d\7J\2\2\u037d"+
		"\u037f\5&\24\2\u037e\u037c\3\2\2\2\u037e\u037f\3\2\2\2\u037f\u008f\3\2"+
		"\2\2\u0380\u0381\t\6\2\2\u0381\u0091\3\2\2\2\u0382\u0383\t\7\2\2\u0383"+
		"\u0093\3\2\2\2\u0384\u038d\7=\2\2\u0385\u038d\7D\2\2\u0386\u038d\7`\2"+
		"\2\u0387\u038d\7!\2\2\u0388\u038a\7\r\2\2\u0389\u038b\5\u0084C\2\u038a"+
		"\u0389\3\2\2\2\u038a\u038b\3\2\2\2\u038b\u038d\3\2\2\2\u038c\u0384\3\2"+
		"\2\2\u038c\u0385\3\2\2\2\u038c\u0386\3\2\2\2\u038c\u0387\3\2\2\2\u038c"+
		"\u0388\3\2\2\2\u038d\u0095\3\2\2\2\u038e\u038f\t\b\2\2\u038f\u0097\3\2"+
		"\2\2\u0390\u0391\t\t\2\2\u0391\u0099\3\2\2\2\u0392\u0393\t\n\2\2\u0393"+
		"\u009b\3\2\2\2\u0394\u0395\t\13\2\2\u0395\u009d\3\2\2\2\u0396\u03b9\7"+
		"i\2\2\u0397\u0398\7\6\2\2\u0398\u03b9\7]\2\2\u0399\u03a0\5\u00a4S\2\u039a"+
		"\u039f\5\u00aeX\2\u039b\u039f\7\17\2\2\u039c\u039f\7\61\2\2\u039d\u039f"+
		"\7\4\2\2\u039e\u039a\3\2\2\2\u039e\u039b\3\2\2\2\u039e\u039c\3\2\2\2\u039e"+
		"\u039d\3\2\2\2\u039f\u03a2\3\2\2\2\u03a0\u039e\3\2\2\2\u03a0\u03a1\3\2"+
		"\2\2\u03a1\u03b9\3\2\2\2\u03a2\u03a0\3\2\2\2\u03a3\u03b4\5\u00a6T\2\u03a4"+
		"\u03a5\7\3\2\2\u03a5\u03a6\7X\2\2\u03a6\u03ab\5&\24\2\u03a7\u03a8\7F\2"+
		"\2\u03a8\u03a9\78\2\2\u03a9\u03aa\7F\2\2\u03aa\u03ac\78\2\2\u03ab\u03a7"+
		"\3\2\2\2\u03ab\u03ac\3\2\2\2\u03ac\u03ad\3\2\2\2\u03ad\u03ae\7p\2\2\u03ae"+
		"\u03b3\3\2\2\2\u03af\u03b3\7\17\2\2\u03b0\u03b3\7\61\2\2\u03b1\u03b3\7"+
		"\4\2\2\u03b2\u03a4\3\2\2\2\u03b2\u03af\3\2\2\2\u03b2\u03b0\3\2\2\2\u03b2"+
		"\u03b1\3\2\2\2\u03b3\u03b6\3\2\2\2\u03b4\u03b2\3\2\2\2\u03b4\u03b5\3\2"+
		"\2\2\u03b5\u03b9\3\2\2\2\u03b6\u03b4\3\2\2\2\u03b7\u03b9\5\u00a8U\2\u03b8"+
		"\u0396\3\2\2\2\u03b8\u0397\3\2\2\2\u03b8\u0399\3\2\2\2\u03b8\u03a3\3\2"+
		"\2\2\u03b8\u03b7\3\2\2\2\u03b9\u009f\3\2\2\2\u03ba\u03bb\7W\2\2\u03bb"+
		"\u03c6\5&\24\2\u03bc\u03c4\7I\2\2\u03bd\u03bf\5&\24\2\u03be\u03bd\3\2"+
		"\2\2\u03be\u03bf\3\2\2\2\u03bf\u03c2\3\2\2\2\u03c0\u03c1\7F\2\2\u03c1"+
		"\u03c3\5&\24\2\u03c2\u03c0\3\2\2\2\u03c2\u03c3\3\2\2\2\u03c3\u03c5\3\2"+
		"\2\2\u03c4\u03be\3\2\2\2\u03c4\u03c5\3\2\2\2\u03c5\u03c7\3\2\2\2\u03c6"+
		"\u03bc\3\2\2\2\u03c6\u03c7\3\2\2\2\u03c7\u03c8\3\2\2\2\u03c8\u03c9\7o"+
		"\2\2\u03c9\u03cf\3\2\2\2\u03ca\u03cb\7H\2\2\u03cb\u03cf\7;\2\2\u03cc\u03cf"+
		"\7K\2\2\u03cd\u03cf\7L\2\2\u03ce\u03ba\3\2\2\2\u03ce\u03ca\3\2\2\2\u03ce"+
		"\u03cc\3\2\2\2\u03ce\u03cd\3\2\2\2\u03cf\u00a1\3\2\2\2\u03d0\u03d1\7X"+
		"\2\2\u03d1\u03d2\5\u00bc_\2\u03d2\u03d3\7p\2\2\u03d3\u00a3\3\2\2\2\u03d4"+
		"\u03d7\7W\2\2\u03d5\u03d6\7F\2\2\u03d6\u03d8\5&\24\2\u03d7\u03d5\3\2\2"+
		"\2\u03d7\u03d8\3\2\2\2\u03d8\u03d9\3\2\2\2\u03d9\u03da\7o\2\2\u03da\u00a5"+
		"\3\2\2\2\u03db\u03e6\7?\2\2\u03dc\u03e6\7@\2\2\u03dd\u03de\7W\2\2\u03de"+
		"\u03e2\7?\2\2\u03df\u03e3\7h\2\2\u03e0\u03e1\7F\2\2\u03e1\u03e3\5&\24"+
		"\2\u03e2\u03df\3\2\2\2\u03e2\u03e0\3\2\2\2\u03e2\u03e3\3\2\2\2\u03e3\u03e4"+
		"\3\2\2\2\u03e4\u03e6\7o\2\2\u03e5\u03db\3\2\2\2\u03e5\u03dc\3\2\2\2\u03e5"+
		"\u03dd\3\2\2\2\u03e6\u00a7\3\2\2\2\u03e7\u03e8\7W\2\2\u03e8\u03eb\5&\24"+
		"\2\u03e9\u03ea\7F\2\2\u03ea\u03ec\5&\24\2\u03eb\u03e9\3\2\2\2\u03eb\u03ec"+
		"\3\2\2\2\u03ec\u03ed\3\2\2\2\u03ed\u03ee\7o\2\2\u03ee\u00a9\3\2\2\2\u03ef"+
		"\u03f0\5\u00acW\2\u03f0\u03f2\7V\2\2\u03f1\u03f3\7\63\2\2\u03f2\u03f1"+
		"\3\2\2\2\u03f2\u03f3\3\2\2\2\u03f3\u03f4\3\2\2\2\u03f4\u03f5\5\4\3\2\u03f5"+
		"\u03f6\7n\2\2\u03f6\u00ab\3\2\2\2\u03f7\u0410\7\'\2\2\u03f8\u0410\7\37"+
		"\2\2\u03f9\u03fe\7\23\2\2\u03fa\u03fb\7X\2\2\u03fb\u03fc\5&\24\2\u03fc"+
		"\u03fd\7p\2\2\u03fd\u03ff\3\2\2\2\u03fe\u03fa\3\2\2\2\u03fe\u03ff\3\2"+
		"\2\2\u03ff\u0410\3\2\2\2\u0400\u040d\7-\2\2\u0401\u040a\7X\2\2\u0402\u0407"+
		"\7\23\2\2\u0403\u0404\7X\2\2\u0404\u0405\5&\24\2\u0405\u0406\7p\2\2\u0406"+
		"\u0408\3\2\2\2\u0407\u0403\3\2\2\2\u0407\u0408\3\2\2\2\u0408\u040b\3\2"+
		"\2\2\u0409\u040b\5&\24\2\u040a\u0402\3\2\2\2\u040a\u0409\3\2\2\2\u040b"+
		"\u040c\3\2\2\2\u040c\u040e\7p\2\2\u040d\u0401\3\2\2\2\u040d\u040e\3\2"+
		"\2\2\u040e\u0410\3\2\2\2\u040f\u03f7\3\2\2\2\u040f\u03f8\3\2\2\2\u040f"+
		"\u03f9\3\2\2\2\u040f\u0400\3\2\2\2\u0410\u00ad\3\2\2\2\u0411\u0412\7\3"+
		"\2\2\u0412\u0413\7X\2\2\u0413\u0414\5&\24\2\u0414\u0415\7p\2\2\u0415\u00af"+
		"\3\2\2\2\u0416\u0418\7\64\2\2\u0417\u0416\3\2\2\2\u0417\u0418\3\2\2\2"+
		"\u0418\u0419\3\2\2\2\u0419\u041a\7;\2\2\u041a\u041c\7G\2\2\u041b\u0417"+
		"\3\2\2\2\u041c\u041f\3\2\2\2\u041d\u041b\3\2\2\2\u041d\u041e\3\2\2\2\u041e"+
		"\u0424\3\2\2\2\u041f\u041d\3\2\2\2\u0420\u0422\7\64\2\2\u0421\u0420\3"+
		"\2\2\2\u0421\u0422\3\2\2\2\u0422\u0423\3\2\2\2\u0423\u0425\7;\2\2\u0424"+
		"\u0421\3\2\2\2\u0424\u0425\3\2\2\2\u0425\u00b1\3\2\2\2\u0426\u0427\5\u008a"+
		"F\2\u0427\u0428\7G\2\2\u0428\u042a\3\2\2\2\u0429\u0426\3\2\2\2\u042a\u042d"+
		"\3\2\2\2\u042b\u0429\3\2\2\2\u042b\u042c\3\2\2\2\u042c\u042f\3\2\2\2\u042d"+
		"\u042b\3\2\2\2\u042e\u0430\5\u008aF\2\u042f\u042e\3\2\2\2\u042f\u0430"+
		"\3\2\2\2\u0430\u00b3\3\2\2\2\u0431\u0432\5f\64\2\u0432\u0433\7G\2\2\u0433"+
		"\u0435\3\2\2\2\u0434\u0431\3\2\2\2\u0435\u0438\3\2\2\2\u0436\u0434\3\2"+
		"\2\2\u0436\u0437\3\2\2\2\u0437\u043a\3\2\2\2\u0438\u0436\3\2\2\2\u0439"+
		"\u043b\5f\64\2\u043a\u0439\3\2\2\2\u043a\u043b\3\2\2\2\u043b\u00b5\3\2"+
		"\2\2\u043c\u043d\5j\66\2\u043d\u043e\7G\2\2\u043e\u0440\3\2\2\2\u043f"+
		"\u043c\3\2\2\2\u0440\u0443\3\2\2\2\u0441\u043f\3\2\2\2\u0441\u0442\3\2"+
		"\2\2\u0442\u0445\3\2\2\2\u0443\u0441\3\2\2\2\u0444\u0446\5j\66\2\u0445"+
		"\u0444\3\2\2\2\u0445\u0446\3\2\2\2\u0446\u00b7\3\2\2\2\u0447\u0448\7:"+
		"\2\2\u0448\u044a\7G\2\2\u0449\u0447\3\2\2\2\u044a\u044d\3\2\2\2\u044b"+
		"\u0449\3\2\2\2\u044b\u044c\3\2\2\2\u044c\u044f\3\2\2\2\u044d\u044b\3\2"+
		"\2\2\u044e\u0450\7:\2\2\u044f\u044e\3\2\2\2\u044f\u0450\3\2\2\2\u0450"+
		"\u00b9\3\2\2\2\u0451\u0452\5z>\2\u0452\u0453\7G\2\2\u0453\u0455\3\2\2"+
		"\2\u0454\u0451\3\2\2\2\u0455\u0458\3\2\2\2\u0456\u0454\3\2\2\2\u0456\u0457"+
		"\3\2\2\2\u0457\u045a\3\2\2\2\u0458\u0456\3\2\2\2\u0459\u045b\5z>\2\u045a"+
		"\u0459\3\2\2\2\u045a\u045b\3\2\2\2\u045b\u00bb\3\2\2\2\u045c\u045d\5&"+
		"\24\2\u045d\u045e\7G\2\2\u045e\u0460\3\2\2\2\u045f\u045c\3\2\2\2\u0460"+
		"\u0463\3\2\2\2\u0461\u045f\3\2\2\2\u0461\u0462\3\2\2\2\u0462\u0465\3\2"+
		"\2\2\u0463\u0461\3\2\2\2\u0464\u0466\5&\24\2\u0465\u0464\3\2\2\2\u0465"+
		"\u0466\3\2\2\2\u0466\u00bd\3\2\2\2\u00a0\u00bf\u00c9\u00ce\u00d7\u00da"+
		"\u00df\u00e2\u00e6\u00eb\u00f3\u00f6\u00fb\u0100\u0102\u0105\u010c\u0110"+
		"\u0116\u0119\u011c\u011f\u0127\u012a\u012d\u0131\u0136\u0139\u013f\u0141"+
		"\u0145\u0148\u0155\u015e\u0164\u0167\u016e\u0171\u0173\u0176\u017a\u017d"+
		"\u0181\u0187\u018e\u0190\u0196\u0199\u01a0\u01a3\u01a5\u01ab\u01ae\u01b6"+
		"\u01bf\u01c7\u01ce\u01d6\u01df\u01e8\u01f1\u01f7\u0200\u0203\u020b\u0211"+
		"\u0214\u0219\u021f\u0222\u0228\u022e\u0232\u0238\u023e\u0241\u0245\u024d"+
		"\u0251\u025b\u025f\u0265\u026a\u0272\u0279\u0281\u0283\u0286\u02a1\u02a4"+
		"\u02b5\u02b8\u02be\u02c1\u02c4\u02c8\u02ce\u02d4\u02d7\u02e3\u02e8\u02ef"+
		"\u02f9\u0300\u0328\u032b\u032f\u0333\u0337\u033e\u0345\u0348\u0356\u035d"+
		"\u0362\u0369\u0372\u0376\u0379\u037e\u038a\u038c\u039e\u03a0\u03ab\u03b2"+
		"\u03b4\u03b8\u03be\u03c2\u03c4\u03c6\u03ce\u03d7\u03e2\u03e5\u03eb\u03f2"+
		"\u03fe\u0407\u040a\u040d\u040f\u0417\u041d\u0421\u0424\u042b\u042f\u0436"+
		"\u043a\u0441\u0445\u044b\u044f\u0456\u045a\u0461\u0465";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}