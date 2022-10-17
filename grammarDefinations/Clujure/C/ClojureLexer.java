// Generated from Clojure.g4 by ANTLR 4.9.3
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ClojureLexer extends Lexer {
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
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
			"T__17", "T__18", "T__19", "STRING", "FLOAT", "FLOAT_TAIL", "FLOAT_DECIMAL", 
			"FLOAT_EXP", "HEXD", "HEX", "BIN", "LONG", "BIGN", "CHAR_U", "CHAR_NAMED", 
			"CHAR_ANY", "NIL", "BOOLEAN", "SYMBOL", "NS_SYMBOL", "PARAM_NAME", "NAME", 
			"SYMBOL_HEAD", "SYMBOL_REST", "WS", "COMMENT", "TRASH"
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


	public ClojureLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Clojure.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2%\u0168\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\b"+
		"\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20"+
		"\3\20\3\20\3\21\3\21\3\21\3\22\3\22\3\22\3\23\3\23\3\23\3\24\3\24\3\24"+
		"\3\25\3\25\3\26\3\26\3\26\3\26\7\26\u008f\n\26\f\26\16\26\u0092\13\26"+
		"\3\26\3\26\3\27\5\27\u0097\n\27\3\27\6\27\u009a\n\27\r\27\16\27\u009b"+
		"\3\27\3\27\5\27\u00a0\n\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\5\27\u00ab\n\27\3\27\3\27\3\27\5\27\u00b0\n\27\3\30\3\30\3\30\3\30\3"+
		"\30\5\30\u00b7\n\30\3\31\3\31\6\31\u00bb\n\31\r\31\16\31\u00bc\3\32\3"+
		"\32\5\32\u00c1\n\32\3\32\6\32\u00c4\n\32\r\32\16\32\u00c5\3\33\3\33\3"+
		"\34\3\34\3\34\6\34\u00cd\n\34\r\34\16\34\u00ce\3\35\3\35\3\35\6\35\u00d4"+
		"\n\35\r\35\16\35\u00d5\3\36\5\36\u00d9\n\36\3\36\6\36\u00dc\n\36\r\36"+
		"\16\36\u00dd\3\36\5\36\u00e1\n\36\3\37\5\37\u00e4\n\37\3\37\6\37\u00e7"+
		"\n\37\r\37\16\37\u00e8\3\37\3\37\3 \3 \3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3"+
		"!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3"+
		"!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\5!\u011b\n!\3\"\3\"\3\"\3#\3#\3#\3#\3"+
		"$\3$\3$\3$\3$\3$\3$\3$\3$\5$\u012d\n$\3%\3%\5%\u0131\n%\3&\3&\3&\3&\3"+
		"\'\3\'\3\'\7\'\u013a\n\'\f\'\16\'\u013d\13\'\3\'\5\'\u0140\n\'\3(\3(\7"+
		"(\u0144\n(\f(\16(\u0147\13(\3(\3(\6(\u014b\n(\r(\16(\u014c\7(\u014f\n"+
		"(\f(\16(\u0152\13(\3)\3)\3*\3*\5*\u0158\n*\3+\3+\3,\3,\7,\u015e\n,\f,"+
		"\16,\u0161\13,\3-\3-\5-\u0165\n-\3-\3-\2\2.\3\3\5\4\7\5\t\6\13\7\r\b\17"+
		"\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+"+
		"\27-\30/\2\61\2\63\2\65\2\67\319\32;\33=\34?\35A\36C\37E G!I\"K#M$O\2"+
		"Q\2S\2U\2W\2Y%\3\2\20\3\2$$\3\2\62;\4\2GGgg\5\2\62;CHch\4\2ZZzz\4\2DD"+
		"dd\3\2\62\63\4\2NNnn\4\2PPpp\5\2\62;FHfh\20\2\13\f\17\17\"\"$%\'\')+."+
		".\61<BB]]_`bb}}\177\u0080\4\2\60\60\62;\6\2\13\f\17\17\"\"..\4\2\f\f\17"+
		"\17\2\u0182\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2"+
		"\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27"+
		"\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2"+
		"\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2"+
		"\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2"+
		"C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2Y\3"+
		"\2\2\2\3[\3\2\2\2\5]\3\2\2\2\7_\3\2\2\2\ta\3\2\2\2\13c\3\2\2\2\re\3\2"+
		"\2\2\17g\3\2\2\2\21j\3\2\2\2\23l\3\2\2\2\25n\3\2\2\2\27p\3\2\2\2\31s\3"+
		"\2\2\2\33u\3\2\2\2\35w\3\2\2\2\37y\3\2\2\2!|\3\2\2\2#\177\3\2\2\2%\u0082"+
		"\3\2\2\2\'\u0085\3\2\2\2)\u0088\3\2\2\2+\u008a\3\2\2\2-\u00af\3\2\2\2"+
		"/\u00b6\3\2\2\2\61\u00b8\3\2\2\2\63\u00be\3\2\2\2\65\u00c7\3\2\2\2\67"+
		"\u00c9\3\2\2\29\u00d0\3\2\2\2;\u00d8\3\2\2\2=\u00e3\3\2\2\2?\u00ec\3\2"+
		"\2\2A\u00f3\3\2\2\2C\u011c\3\2\2\2E\u011f\3\2\2\2G\u012c\3\2\2\2I\u0130"+
		"\3\2\2\2K\u0132\3\2\2\2M\u0136\3\2\2\2O\u0141\3\2\2\2Q\u0153\3\2\2\2S"+
		"\u0157\3\2\2\2U\u0159\3\2\2\2W\u015b\3\2\2\2Y\u0164\3\2\2\2[\\\7*\2\2"+
		"\\\4\3\2\2\2]^\7+\2\2^\6\3\2\2\2_`\7]\2\2`\b\3\2\2\2ab\7_\2\2b\n\3\2\2"+
		"\2cd\7}\2\2d\f\3\2\2\2ef\7\177\2\2f\16\3\2\2\2gh\7%\2\2hi\7}\2\2i\20\3"+
		"\2\2\2jk\7)\2\2k\22\3\2\2\2lm\7b\2\2m\24\3\2\2\2no\7\u0080\2\2o\26\3\2"+
		"\2\2pq\7\u0080\2\2qr\7B\2\2r\30\3\2\2\2st\7`\2\2t\32\3\2\2\2uv\7B\2\2"+
		"v\34\3\2\2\2wx\7%\2\2x\36\3\2\2\2yz\7%\2\2z{\7*\2\2{ \3\2\2\2|}\7%\2\2"+
		"}~\7`\2\2~\"\3\2\2\2\177\u0080\7%\2\2\u0080\u0081\7)\2\2\u0081$\3\2\2"+
		"\2\u0082\u0083\7%\2\2\u0083\u0084\7-\2\2\u0084&\3\2\2\2\u0085\u0086\7"+
		"%\2\2\u0086\u0087\7a\2\2\u0087(\3\2\2\2\u0088\u0089\7<\2\2\u0089*\3\2"+
		"\2\2\u008a\u0090\7$\2\2\u008b\u008f\n\2\2\2\u008c\u008d\7^\2\2\u008d\u008f"+
		"\7$\2\2\u008e\u008b\3\2\2\2\u008e\u008c\3\2\2\2\u008f\u0092\3\2\2\2\u0090"+
		"\u008e\3\2\2\2\u0090\u0091\3\2\2\2\u0091\u0093\3\2\2\2\u0092\u0090\3\2"+
		"\2\2\u0093\u0094\7$\2\2\u0094,\3\2\2\2\u0095\u0097\7/\2\2\u0096\u0095"+
		"\3\2\2\2\u0096\u0097\3\2\2\2\u0097\u0099\3\2\2\2\u0098\u009a\t\3\2\2\u0099"+
		"\u0098\3\2\2\2\u009a\u009b\3\2\2\2\u009b\u0099\3\2\2\2\u009b\u009c\3\2"+
		"\2\2\u009c\u009d\3\2\2\2\u009d\u00b0\5/\30\2\u009e\u00a0\7/\2\2\u009f"+
		"\u009e\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1\u00a2\7K"+
		"\2\2\u00a2\u00a3\7p\2\2\u00a3\u00a4\7h\2\2\u00a4\u00a5\7k\2\2\u00a5\u00a6"+
		"\7p\2\2\u00a6\u00a7\7k\2\2\u00a7\u00a8\7v\2\2\u00a8\u00b0\7{\2\2\u00a9"+
		"\u00ab\7/\2\2\u00aa\u00a9\3\2\2\2\u00aa\u00ab\3\2\2\2\u00ab\u00ac\3\2"+
		"\2\2\u00ac\u00ad\7P\2\2\u00ad\u00ae\7c\2\2\u00ae\u00b0\7P\2\2\u00af\u0096"+
		"\3\2\2\2\u00af\u009f\3\2\2\2\u00af\u00aa\3\2\2\2\u00b0.\3\2\2\2\u00b1"+
		"\u00b2\5\61\31\2\u00b2\u00b3\5\63\32\2\u00b3\u00b7\3\2\2\2\u00b4\u00b7"+
		"\5\61\31\2\u00b5\u00b7\5\63\32\2\u00b6\u00b1\3\2\2\2\u00b6\u00b4\3\2\2"+
		"\2\u00b6\u00b5\3\2\2\2\u00b7\60\3\2\2\2\u00b8\u00ba\7\60\2\2\u00b9\u00bb"+
		"\t\3\2\2\u00ba\u00b9\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc\u00ba\3\2\2\2\u00bc"+
		"\u00bd\3\2\2\2\u00bd\62\3\2\2\2\u00be\u00c0\t\4\2\2\u00bf\u00c1\7/\2\2"+
		"\u00c0\u00bf\3\2\2\2\u00c0\u00c1\3\2\2\2\u00c1\u00c3\3\2\2\2\u00c2\u00c4"+
		"\t\3\2\2\u00c3\u00c2\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c5\u00c3\3\2\2\2\u00c5"+
		"\u00c6\3\2\2\2\u00c6\64\3\2\2\2\u00c7\u00c8\t\5\2\2\u00c8\66\3\2\2\2\u00c9"+
		"\u00ca\7\62\2\2\u00ca\u00cc\t\6\2\2\u00cb\u00cd\5\65\33\2\u00cc\u00cb"+
		"\3\2\2\2\u00cd\u00ce\3\2\2\2\u00ce\u00cc\3\2\2\2\u00ce\u00cf\3\2\2\2\u00cf"+
		"8\3\2\2\2\u00d0\u00d1\7\62\2\2\u00d1\u00d3\t\7\2\2\u00d2\u00d4\t\b\2\2"+
		"\u00d3\u00d2\3\2\2\2\u00d4\u00d5\3\2\2\2\u00d5\u00d3\3\2\2\2\u00d5\u00d6"+
		"\3\2\2\2\u00d6:\3\2\2\2\u00d7\u00d9\7/\2\2\u00d8\u00d7\3\2\2\2\u00d8\u00d9"+
		"\3\2\2\2\u00d9\u00db\3\2\2\2\u00da\u00dc\t\3\2\2\u00db\u00da\3\2\2\2\u00dc"+
		"\u00dd\3\2\2\2\u00dd\u00db\3\2\2\2\u00dd\u00de\3\2\2\2\u00de\u00e0\3\2"+
		"\2\2\u00df\u00e1\t\t\2\2\u00e0\u00df\3\2\2\2\u00e0\u00e1\3\2\2\2\u00e1"+
		"<\3\2\2\2\u00e2\u00e4\7/\2\2\u00e3\u00e2\3\2\2\2\u00e3\u00e4\3\2\2\2\u00e4"+
		"\u00e6\3\2\2\2\u00e5\u00e7\t\3\2\2\u00e6\u00e5\3\2\2\2\u00e7\u00e8\3\2"+
		"\2\2\u00e8\u00e6\3\2\2\2\u00e8\u00e9\3\2\2\2\u00e9\u00ea\3\2\2\2\u00ea"+
		"\u00eb\t\n\2\2\u00eb>\3\2\2\2\u00ec\u00ed\7^\2\2\u00ed\u00ee\7w\2\2\u00ee"+
		"\u00ef\t\13\2\2\u00ef\u00f0\5\65\33\2\u00f0\u00f1\5\65\33\2\u00f1\u00f2"+
		"\5\65\33\2\u00f2@\3\2\2\2\u00f3\u011a\7^\2\2\u00f4\u00f5\7p\2\2\u00f5"+
		"\u00f6\7g\2\2\u00f6\u00f7\7y\2\2\u00f7\u00f8\7n\2\2\u00f8\u00f9\7k\2\2"+
		"\u00f9\u00fa\7p\2\2\u00fa\u011b\7g\2\2\u00fb\u00fc\7t\2\2\u00fc\u00fd"+
		"\7g\2\2\u00fd\u00fe\7v\2\2\u00fe\u00ff\7w\2\2\u00ff\u0100\7t\2\2\u0100"+
		"\u011b\7p\2\2\u0101\u0102\7u\2\2\u0102\u0103\7r\2\2\u0103\u0104\7c\2\2"+
		"\u0104\u0105\7e\2\2\u0105\u011b\7g\2\2\u0106\u0107\7v\2\2\u0107\u0108"+
		"\7c\2\2\u0108\u011b\7d\2\2\u0109\u010a\7h\2\2\u010a\u010b\7q\2\2\u010b"+
		"\u010c\7t\2\2\u010c\u010d\7o\2\2\u010d\u010e\7h\2\2\u010e\u010f\7g\2\2"+
		"\u010f\u0110\7g\2\2\u0110\u011b\7f\2\2\u0111\u0112\7d\2\2\u0112\u0113"+
		"\7c\2\2\u0113\u0114\7e\2\2\u0114\u0115\7m\2\2\u0115\u0116\7u\2\2\u0116"+
		"\u0117\7r\2\2\u0117\u0118\7c\2\2\u0118\u0119\7e\2\2\u0119\u011b\7g\2\2"+
		"\u011a\u00f4\3\2\2\2\u011a\u00fb\3\2\2\2\u011a\u0101\3\2\2\2\u011a\u0106"+
		"\3\2\2\2\u011a\u0109\3\2\2\2\u011a\u0111\3\2\2\2\u011bB\3\2\2\2\u011c"+
		"\u011d\7^\2\2\u011d\u011e\13\2\2\2\u011eD\3\2\2\2\u011f\u0120\7p\2\2\u0120"+
		"\u0121\7k\2\2\u0121\u0122\7n\2\2\u0122F\3\2\2\2\u0123\u0124\7v\2\2\u0124"+
		"\u0125\7t\2\2\u0125\u0126\7w\2\2\u0126\u012d\7g\2\2\u0127\u0128\7h\2\2"+
		"\u0128\u0129\7c\2\2\u0129\u012a\7n\2\2\u012a\u012b\7u\2\2\u012b\u012d"+
		"\7g\2\2\u012c\u0123\3\2\2\2\u012c\u0127\3\2\2\2\u012dH\3\2\2\2\u012e\u0131"+
		"\4\60\61\2\u012f\u0131\5O(\2\u0130\u012e\3\2\2\2\u0130\u012f\3\2\2\2\u0131"+
		"J\3\2\2\2\u0132\u0133\5O(\2\u0133\u0134\7\61\2\2\u0134\u0135\5I%\2\u0135"+
		"L\3\2\2\2\u0136\u013f\7\'\2\2\u0137\u013b\4\63;\2\u0138\u013a\4\62;\2"+
		"\u0139\u0138\3\2\2\2\u013a\u013d\3\2\2\2\u013b\u0139\3\2\2\2\u013b\u013c"+
		"\3\2\2\2\u013c\u0140\3\2\2\2\u013d\u013b\3\2\2\2\u013e\u0140\7(\2\2\u013f"+
		"\u0137\3\2\2\2\u013f\u013e\3\2\2\2\u013f\u0140\3\2\2\2\u0140N\3\2\2\2"+
		"\u0141\u0145\5Q)\2\u0142\u0144\5S*\2\u0143\u0142\3\2\2\2\u0144\u0147\3"+
		"\2\2\2\u0145\u0143\3\2\2\2\u0145\u0146\3\2\2\2\u0146\u0150\3\2\2\2\u0147"+
		"\u0145\3\2\2\2\u0148\u014a\7<\2\2\u0149\u014b\5S*\2\u014a\u0149\3\2\2"+
		"\2\u014b\u014c\3\2\2\2\u014c\u014a\3\2\2\2\u014c\u014d\3\2\2\2\u014d\u014f"+
		"\3\2\2\2\u014e\u0148\3\2\2\2\u014f\u0152\3\2\2\2\u0150\u014e\3\2\2\2\u0150"+
		"\u0151\3\2\2\2\u0151P\3\2\2\2\u0152\u0150\3\2\2\2\u0153\u0154\n\f\2\2"+
		"\u0154R\3\2\2\2\u0155\u0158\5Q)\2\u0156\u0158\t\r\2\2\u0157\u0155\3\2"+
		"\2\2\u0157\u0156\3\2\2\2\u0158T\3\2\2\2\u0159\u015a\t\16\2\2\u015aV\3"+
		"\2\2\2\u015b\u015f\7=\2\2\u015c\u015e\n\17\2\2\u015d\u015c\3\2\2\2\u015e"+
		"\u0161\3\2\2\2\u015f\u015d\3\2\2\2\u015f\u0160\3\2\2\2\u0160X\3\2\2\2"+
		"\u0161\u015f\3\2\2\2\u0162\u0165\5U+\2\u0163\u0165\5W,\2\u0164\u0162\3"+
		"\2\2\2\u0164\u0163\3\2\2\2\u0165\u0166\3\2\2\2\u0166\u0167\b-\2\2\u0167"+
		"Z\3\2\2\2 \2\u008e\u0090\u0096\u009b\u009f\u00aa\u00af\u00b6\u00bc\u00c0"+
		"\u00c5\u00ce\u00d5\u00d8\u00dd\u00e0\u00e3\u00e8\u011a\u012c\u0130\u013b"+
		"\u013f\u0145\u014c\u0150\u0157\u015f\u0164\3\2\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}