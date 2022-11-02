// Generated from /Users/syu/workspace/MSCCD/grammarDefinations/Ada/Ada.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class AdaLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ABORT=1, ABS=2, ABSTRACT=3, ACCEPT=4, ACCESS=5, ALIASED=6, ALL=7, AND=8, 
		ARRAY=9, AT=10, BEGIN=11, BODY=12, CASE=13, CONSTANT=14, DECLARE=15, DELAY=16, 
		DELTA=17, DIGITS=18, DO=19, ELSE=20, ELSIF=21, END=22, ENTRY=23, EXCEPTION=24, 
		EXIT=25, FOR=26, FUNCTION=27, GENERIC=28, GOTO=29, IF=30, IN=31, INTERFACE=32, 
		IS=33, LIMITED=34, LOOP=35, MOD=36, NEW=37, NOT=38, NuLL=39, OF=40, OR=41, 
		OTHERS=42, OUT=43, OVERRIDING=44, PACKAGE=45, PARALLEL=46, PRAGMA=47, 
		PRIVATE=48, PROCEDURE=49, PROTECTED=50, RAISE=51, RANGE=52, RECORD=53, 
		REM=54, RENAMES=55, REQUEUE=56, RETURN=57, REVERSE=58, SELECT=59, SEPARATE=60, 
		SOME=61, SUBTYPE=62, SYNCHRONIZED=63, TAGGED=64, TASK=65, TERMINATE=66, 
		THEN=67, TYPE=68, UNTIL=69, USE=70, WHEN=71, WHILE=72, WITH=73, XOR=74, 
		BY_ENTRY=75, BY_PROTECTED_PROCEDURE=76, OPTIONAL=77, CLASS=78, STANDARD=79, 
		CONCAT=80, TIC=81, LPAREN=82, RPAREN=83, MUL=84, PLUS=85, COMMA=86, MINUS=87, 
		DOT=88, DIV=89, COLON=90, SEMI=91, LESSTHAN=92, EQ=93, GREATERTHAN=94, 
		AT_SIGN=95, LEFT_BRACKET=96, RIGHT_BRACKET=97, PIPE=98, RIGHT_SHAFT=99, 
		DOT_DOT=100, EXPON=101, ASSIGN=102, NE=103, LE=104, GE=105, LT_LT=106, 
		GT_GT=107, BOX=108, UNDERLINE=109, IDENTIFIER=110, NUMERIC_LITERAL=111, 
		CHARACTER_LITERAL=112, STRING_LITERAL=113, WS=114, COMMENT=115;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"ABORT", "ABS", "ABSTRACT", "ACCEPT", "ACCESS", "ALIASED", "ALL", "AND", 
			"ARRAY", "AT", "BEGIN", "BODY", "CASE", "CONSTANT", "DECLARE", "DELAY", 
			"DELTA", "DIGITS", "DO", "ELSE", "ELSIF", "END", "ENTRY", "EXCEPTION", 
			"EXIT", "FOR", "FUNCTION", "GENERIC", "GOTO", "IF", "IN", "INTERFACE", 
			"IS", "LIMITED", "LOOP", "MOD", "NEW", "NOT", "NuLL", "OF", "OR", "OTHERS", 
			"OUT", "OVERRIDING", "PACKAGE", "PARALLEL", "PRAGMA", "PRIVATE", "PROCEDURE", 
			"PROTECTED", "RAISE", "RANGE", "RECORD", "REM", "RENAMES", "REQUEUE", 
			"RETURN", "REVERSE", "SELECT", "SEPARATE", "SOME", "SUBTYPE", "SYNCHRONIZED", 
			"TAGGED", "TASK", "TERMINATE", "THEN", "TYPE", "UNTIL", "USE", "WHEN", 
			"WHILE", "WITH", "XOR", "BY_ENTRY", "BY_PROTECTED_PROCEDURE", "OPTIONAL", 
			"CLASS", "STANDARD", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", 
			"K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", 
			"Y", "Z", "CONCAT", "TIC", "LPAREN", "RPAREN", "MUL", "PLUS", "COMMA", 
			"MINUS", "DOT", "DIV", "COLON", "SEMI", "LESSTHAN", "EQ", "GREATERTHAN", 
			"AT_SIGN", "LEFT_BRACKET", "RIGHT_BRACKET", "PIPE", "RIGHT_SHAFT", "DOT_DOT", 
			"EXPON", "ASSIGN", "NE", "LE", "GE", "LT_LT", "GT_GT", "BOX", "UNDERLINE", 
			"IDENTIFIER", "LETTER_UPPERCASE", "LETTER_LOWERCASE", "LETTER_TITLECASE", 
			"LETTER_MODIFIER", "LETTER_OTHER", "NUMBER_LETTER", "IDENTIFIER_START", 
			"MARK_NON_SPACING", "MARK_SPACING_COMBINING", "NUMBER_DECIMAL", "PUNCTUATION_CONNECTOR", 
			"IDENTIFIER_EXTEND", "NUMERIC_LITERAL", "DECIMAL_LITERAL", "NUMERAL", 
			"EXPONENT", "DIGIT", "BASED_LITERAL", "BASE", "BASED_NUMERAL", "EXTENDED_DIGIT", 
			"GRAPHIC_CHARACTER", "CHARACTER_LITERAL", "STRING_LITERAL", "NON_QUOTATION_MARK_GRAPHIC_CHARACTER", 
			"STRING_ELEMENT", "WS", "COMMENT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, "'&'", "'''", "'('", 
			"')'", "'*'", "'+'", "','", "'-'", "'.'", "'/'", "':'", "';'", "'<'", 
			"'='", "'>'", "'@'", "'['", "']'", "'|'", "'=>'", "'..'", "'**'", "':='", 
			"'/='", "'<='", "'>='", "'<<'", "'>>'", "'<>'", "'_'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "ABORT", "ABS", "ABSTRACT", "ACCEPT", "ACCESS", "ALIASED", "ALL", 
			"AND", "ARRAY", "AT", "BEGIN", "BODY", "CASE", "CONSTANT", "DECLARE", 
			"DELAY", "DELTA", "DIGITS", "DO", "ELSE", "ELSIF", "END", "ENTRY", "EXCEPTION", 
			"EXIT", "FOR", "FUNCTION", "GENERIC", "GOTO", "IF", "IN", "INTERFACE", 
			"IS", "LIMITED", "LOOP", "MOD", "NEW", "NOT", "NuLL", "OF", "OR", "OTHERS", 
			"OUT", "OVERRIDING", "PACKAGE", "PARALLEL", "PRAGMA", "PRIVATE", "PROCEDURE", 
			"PROTECTED", "RAISE", "RANGE", "RECORD", "REM", "RENAMES", "REQUEUE", 
			"RETURN", "REVERSE", "SELECT", "SEPARATE", "SOME", "SUBTYPE", "SYNCHRONIZED", 
			"TAGGED", "TASK", "TERMINATE", "THEN", "TYPE", "UNTIL", "USE", "WHEN", 
			"WHILE", "WITH", "XOR", "BY_ENTRY", "BY_PROTECTED_PROCEDURE", "OPTIONAL", 
			"CLASS", "STANDARD", "CONCAT", "TIC", "LPAREN", "RPAREN", "MUL", "PLUS", 
			"COMMA", "MINUS", "DOT", "DIV", "COLON", "SEMI", "LESSTHAN", "EQ", "GREATERTHAN", 
			"AT_SIGN", "LEFT_BRACKET", "RIGHT_BRACKET", "PIPE", "RIGHT_SHAFT", "DOT_DOT", 
			"EXPON", "ASSIGN", "NE", "LE", "GE", "LT_LT", "GT_GT", "BOX", "UNDERLINE", 
			"IDENTIFIER", "NUMERIC_LITERAL", "CHARACTER_LITERAL", "STRING_LITERAL", 
			"WS", "COMMENT"
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


	public AdaLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Ada.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2u\u045b\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\4"+
		"`\t`\4a\ta\4b\tb\4c\tc\4d\td\4e\te\4f\tf\4g\tg\4h\th\4i\ti\4j\tj\4k\t"+
		"k\4l\tl\4m\tm\4n\tn\4o\to\4p\tp\4q\tq\4r\tr\4s\ts\4t\tt\4u\tu\4v\tv\4"+
		"w\tw\4x\tx\4y\ty\4z\tz\4{\t{\4|\t|\4}\t}\4~\t~\4\177\t\177\4\u0080\t\u0080"+
		"\4\u0081\t\u0081\4\u0082\t\u0082\4\u0083\t\u0083\4\u0084\t\u0084\4\u0085"+
		"\t\u0085\4\u0086\t\u0086\4\u0087\t\u0087\4\u0088\t\u0088\4\u0089\t\u0089"+
		"\4\u008a\t\u008a\4\u008b\t\u008b\4\u008c\t\u008c\4\u008d\t\u008d\4\u008e"+
		"\t\u008e\4\u008f\t\u008f\4\u0090\t\u0090\4\u0091\t\u0091\4\u0092\t\u0092"+
		"\4\u0093\t\u0093\4\u0094\t\u0094\4\u0095\t\u0095\4\u0096\t\u0096\4\u0097"+
		"\t\u0097\4\u0098\t\u0098\4\u0099\t\u0099\4\u009a\t\u009a\4\u009b\t\u009b"+
		"\4\u009c\t\u009c\4\u009d\t\u009d\4\u009e\t\u009e\4\u009f\t\u009f\4\u00a0"+
		"\t\u00a0\4\u00a1\t\u00a1\4\u00a2\t\u00a2\4\u00a3\t\u00a3\4\u00a4\t\u00a4"+
		"\4\u00a5\t\u00a5\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3"+
		"\t\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\r"+
		"\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\33"+
		"\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37"+
		"\3 \3 \3 \3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3\"\3\"\3\"\3#\3#\3#\3#\3#\3#"+
		"\3#\3#\3$\3$\3$\3$\3$\3%\3%\3%\3%\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3(\3(\3"+
		"(\3(\3(\3)\3)\3)\3*\3*\3*\3+\3+\3+\3+\3+\3+\3+\3,\3,\3,\3,\3-\3-\3-\3"+
		"-\3-\3-\3-\3-\3-\3-\3-\3.\3.\3.\3.\3.\3.\3.\3.\3/\3/\3/\3/\3/\3/\3/\3"+
		"/\3/\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\61\3\61\3\61\3\61\3\61\3\61"+
		"\3\61\3\61\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\63\3\63"+
		"\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\64\3\64\3\64\3\64\3\64\3\64"+
		"\3\65\3\65\3\65\3\65\3\65\3\65\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\67"+
		"\3\67\3\67\3\67\38\38\38\38\38\38\38\38\39\39\39\39\39\39\39\39\3:\3:"+
		"\3:\3:\3:\3:\3:\3;\3;\3;\3;\3;\3;\3;\3;\3<\3<\3<\3<\3<\3<\3<\3=\3=\3="+
		"\3=\3=\3=\3=\3=\3=\3>\3>\3>\3>\3>\3?\3?\3?\3?\3?\3?\3?\3?\3@\3@\3@\3@"+
		"\3@\3@\3@\3@\3@\3@\3@\3@\3@\3A\3A\3A\3A\3A\3A\3A\3B\3B\3B\3B\3B\3C\3C"+
		"\3C\3C\3C\3C\3C\3C\3C\3C\3D\3D\3D\3D\3D\3E\3E\3E\3E\3E\3F\3F\3F\3F\3F"+
		"\3F\3G\3G\3G\3G\3H\3H\3H\3H\3H\3I\3I\3I\3I\3I\3I\3J\3J\3J\3J\3J\3K\3K"+
		"\3K\3K\3L\3L\3L\3L\3L\3L\3L\3L\3L\3M\3M\3M\3M\3M\3M\3M\3M\3M\3M\3M\3M"+
		"\3M\3M\3M\3M\3M\3M\3M\3M\3M\3M\3M\3N\3N\3N\3N\3N\3N\3N\3N\3N\3O\3O\3O"+
		"\3O\3O\3O\3P\3P\3P\3P\3P\3P\3P\3P\3P\3Q\3Q\3R\3R\3S\3S\3T\3T\3U\3U\3V"+
		"\3V\3W\3W\3X\3X\3Y\3Y\3Z\3Z\3[\3[\3\\\3\\\3]\3]\3^\3^\3_\3_\3`\3`\3a\3"+
		"a\3b\3b\3c\3c\3d\3d\3e\3e\3f\3f\3g\3g\3h\3h\3i\3i\3j\3j\3k\3k\3l\3l\3"+
		"m\3m\3n\3n\3o\3o\3p\3p\3q\3q\3r\3r\3s\3s\3t\3t\3u\3u\3v\3v\3w\3w\3x\3"+
		"x\3y\3y\3z\3z\3{\3{\3|\3|\3}\3}\3~\3~\3~\3\177\3\177\3\177\3\u0080\3\u0080"+
		"\3\u0080\3\u0081\3\u0081\3\u0081\3\u0082\3\u0082\3\u0082\3\u0083\3\u0083"+
		"\3\u0083\3\u0084\3\u0084\3\u0084\3\u0085\3\u0085\3\u0085\3\u0086\3\u0086"+
		"\3\u0086\3\u0087\3\u0087\3\u0087\3\u0088\3\u0088\3\u0089\3\u0089\3\u0089"+
		"\7\u0089\u03cf\n\u0089\f\u0089\16\u0089\u03d2\13\u0089\3\u008a\3\u008a"+
		"\3\u008b\3\u008b\3\u008c\3\u008c\3\u008d\3\u008d\3\u008e\3\u008e\3\u008f"+
		"\3\u008f\3\u0090\3\u0090\3\u0090\3\u0090\3\u0090\3\u0090\5\u0090\u03e6"+
		"\n\u0090\3\u0091\3\u0091\3\u0092\3\u0092\3\u0093\3\u0093\3\u0094\3\u0094"+
		"\3\u0095\3\u0095\3\u0095\3\u0095\5\u0095\u03f4\n\u0095\3\u0096\3\u0096"+
		"\5\u0096\u03f8\n\u0096\3\u0097\3\u0097\3\u0097\3\u0097\5\u0097\u03fe\n"+
		"\u0097\3\u0097\5\u0097\u0401\n\u0097\3\u0098\3\u0098\5\u0098\u0405\n\u0098"+
		"\3\u0098\7\u0098\u0408\n\u0098\f\u0098\16\u0098\u040b\13\u0098\3\u0099"+
		"\3\u0099\5\u0099\u040f\n\u0099\3\u0099\3\u0099\3\u0099\3\u0099\3\u0099"+
		"\3\u0099\5\u0099\u0417\n\u0099\3\u009a\3\u009a\3\u009b\3\u009b\3\u009b"+
		"\3\u009b\3\u009b\3\u009b\5\u009b\u0421\n\u009b\3\u009b\3\u009b\5\u009b"+
		"\u0425\n\u009b\3\u009c\3\u009c\3\u009d\3\u009d\5\u009d\u042b\n\u009d\3"+
		"\u009d\7\u009d\u042e\n\u009d\f\u009d\16\u009d\u0431\13\u009d\3\u009e\3"+
		"\u009e\5\u009e\u0435\n\u009e\3\u009f\5\u009f\u0438\n\u009f\3\u00a0\3\u00a0"+
		"\3\u00a0\3\u00a0\3\u00a1\3\u00a1\3\u00a1\3\u00a1\3\u00a2\3\u00a2\3\u00a3"+
		"\3\u00a3\3\u00a3\5\u00a3\u0447\n\u00a3\3\u00a4\7\u00a4\u044a\n\u00a4\f"+
		"\u00a4\16\u00a4\u044d\13\u00a4\3\u00a4\3\u00a4\3\u00a5\3\u00a5\3\u00a5"+
		"\3\u00a5\7\u00a5\u0455\n\u00a5\f\u00a5\16\u00a5\u0458\13\u00a5\3\u00a5"+
		"\3\u00a5\2\2\u00a6\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r"+
		"\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33"+
		"\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63"+
		"e\64g\65i\66k\67m8o9q:s;u<w=y>{?}@\177A\u0081B\u0083C\u0085D\u0087E\u0089"+
		"F\u008bG\u008dH\u008fI\u0091J\u0093K\u0095L\u0097M\u0099N\u009bO\u009d"+
		"P\u009fQ\u00a1\2\u00a3\2\u00a5\2\u00a7\2\u00a9\2\u00ab\2\u00ad\2\u00af"+
		"\2\u00b1\2\u00b3\2\u00b5\2\u00b7\2\u00b9\2\u00bb\2\u00bd\2\u00bf\2\u00c1"+
		"\2\u00c3\2\u00c5\2\u00c7\2\u00c9\2\u00cb\2\u00cd\2\u00cf\2\u00d1\2\u00d3"+
		"\2\u00d5R\u00d7S\u00d9T\u00dbU\u00ddV\u00dfW\u00e1X\u00e3Y\u00e5Z\u00e7"+
		"[\u00e9\\\u00eb]\u00ed^\u00ef_\u00f1`\u00f3a\u00f5b\u00f7c\u00f9d\u00fb"+
		"e\u00fdf\u00ffg\u0101h\u0103i\u0105j\u0107k\u0109l\u010bm\u010dn\u010f"+
		"o\u0111p\u0113\2\u0115\2\u0117\2\u0119\2\u011b\2\u011d\2\u011f\2\u0121"+
		"\2\u0123\2\u0125\2\u0127\2\u0129\2\u012bq\u012d\2\u012f\2\u0131\2\u0133"+
		"\2\u0135\2\u0137\2\u0139\2\u013b\2\u013d\2\u013fr\u0141s\u0143\2\u0145"+
		"\2\u0147t\u0149u\3\2!\4\2CCcc\4\2DDdd\4\2EEee\4\2FFff\4\2GGgg\4\2HHhh"+
		"\4\2IIii\4\2JJjj\4\2KKkk\4\2LLll\4\2MMmm\4\2NNnn\4\2OOoo\4\2PPpp\4\2Q"+
		"Qqq\4\2RRrr\4\2SSss\4\2TTtt\4\2UUuu\4\2VVvv\4\2WWww\4\2XXxx\4\2YYyy\4"+
		"\2ZZzz\4\2[[{{\4\2\\\\||\f\2\u01c7\u01c7\u01ca\u01ca\u01cd\u01cd\u01f4"+
		"\u01f4\u1f8a\u1f91\u1f9a\u1fa1\u1faa\u1fb1\u1fbe\u1fbe\u1fce\u1fce\u1ffe"+
		"\u1ffe\b\2aa\u2041\u2042\u2056\u2056\ufe35\ufe36\ufe4f\ufe51\uff41\uff41"+
		"\4\2CHch\3\2##\3\2\u202a\u202a\f\u0275\2C\2\\\2\u00c2\2\u00d8\2\u00da"+
		"\2\u00e0\2\u0102\2\u0102\2\u0104\2\u0104\2\u0106\2\u0106\2\u0108\2\u0108"+
		"\2\u010a\2\u010a\2\u010c\2\u010c\2\u010e\2\u010e\2\u0110\2\u0110\2\u0112"+
		"\2\u0112\2\u0114\2\u0114\2\u0116\2\u0116\2\u0118\2\u0118\2\u011a\2\u011a"+
		"\2\u011c\2\u011c\2\u011e\2\u011e\2\u0120\2\u0120\2\u0122\2\u0122\2\u0124"+
		"\2\u0124\2\u0126\2\u0126\2\u0128\2\u0128\2\u012a\2\u012a\2\u012c\2\u012c"+
		"\2\u012e\2\u012e\2\u0130\2\u0130\2\u0132\2\u0132\2\u0134\2\u0134\2\u0136"+
		"\2\u0136\2\u0138\2\u0138\2\u013b\2\u013b\2\u013d\2\u013d\2\u013f\2\u013f"+
		"\2\u0141\2\u0141\2\u0143\2\u0143\2\u0145\2\u0145\2\u0147\2\u0147\2\u0149"+
		"\2\u0149\2\u014c\2\u014c\2\u014e\2\u014e\2\u0150\2\u0150\2\u0152\2\u0152"+
		"\2\u0154\2\u0154\2\u0156\2\u0156\2\u0158\2\u0158\2\u015a\2\u015a\2\u015c"+
		"\2\u015c\2\u015e\2\u015e\2\u0160\2\u0160\2\u0162\2\u0162\2\u0164\2\u0164"+
		"\2\u0166\2\u0166\2\u0168\2\u0168\2\u016a\2\u016a\2\u016c\2\u016c\2\u016e"+
		"\2\u016e\2\u0170\2\u0170\2\u0172\2\u0172\2\u0174\2\u0174\2\u0176\2\u0176"+
		"\2\u0178\2\u0178\2\u017a\2\u017b\2\u017d\2\u017d\2\u017f\2\u017f\2\u0183"+
		"\2\u0184\2\u0186\2\u0186\2\u0188\2\u0189\2\u018b\2\u018d\2\u0190\2\u0193"+
		"\2\u0195\2\u0196\2\u0198\2\u019a\2\u019e\2\u019f\2\u01a1\2\u01a2\2\u01a4"+
		"\2\u01a4\2\u01a6\2\u01a6\2\u01a8\2\u01a9\2\u01ab\2\u01ab\2\u01ae\2\u01ae"+
		"\2\u01b0\2\u01b1\2\u01b3\2\u01b5\2\u01b7\2\u01b7\2\u01b9\2\u01ba\2\u01be"+
		"\2\u01be\2\u01c6\2\u01c6\2\u01c9\2\u01c9\2\u01cc\2\u01cc\2\u01cf\2\u01cf"+
		"\2\u01d1\2\u01d1\2\u01d3\2\u01d3\2\u01d5\2\u01d5\2\u01d7\2\u01d7\2\u01d9"+
		"\2\u01d9\2\u01db\2\u01db\2\u01dd\2\u01dd\2\u01e0\2\u01e0\2\u01e2\2\u01e2"+
		"\2\u01e4\2\u01e4\2\u01e6\2\u01e6\2\u01e8\2\u01e8\2\u01ea\2\u01ea\2\u01ec"+
		"\2\u01ec\2\u01ee\2\u01ee\2\u01f0\2\u01f0\2\u01f3\2\u01f3\2\u01f6\2\u01f6"+
		"\2\u01f8\2\u01fa\2\u01fc\2\u01fc\2\u01fe\2\u01fe\2\u0200\2\u0200\2\u0202"+
		"\2\u0202\2\u0204\2\u0204\2\u0206\2\u0206\2\u0208\2\u0208\2\u020a\2\u020a"+
		"\2\u020c\2\u020c\2\u020e\2\u020e\2\u0210\2\u0210\2\u0212\2\u0212\2\u0214"+
		"\2\u0214\2\u0216\2\u0216\2\u0218\2\u0218\2\u021a\2\u021a\2\u021c\2\u021c"+
		"\2\u021e\2\u021e\2\u0220\2\u0220\2\u0222\2\u0222\2\u0224\2\u0224\2\u0226"+
		"\2\u0226\2\u0228\2\u0228\2\u022a\2\u022a\2\u022c\2\u022c\2\u022e\2\u022e"+
		"\2\u0230\2\u0230\2\u0232\2\u0232\2\u0234\2\u0234\2\u023c\2\u023d\2\u023f"+
		"\2\u0240\2\u0243\2\u0243\2\u0245\2\u0248\2\u024a\2\u024a\2\u024c\2\u024c"+
		"\2\u024e\2\u024e\2\u0250\2\u0250\2\u0372\2\u0372\2\u0374\2\u0374\2\u0378"+
		"\2\u0378\2\u0381\2\u0381\2\u0388\2\u0388\2\u038a\2\u038c\2\u038e\2\u038e"+
		"\2\u0390\2\u0391\2\u0393\2\u03a3\2\u03a5\2\u03ad\2\u03d1\2\u03d1\2\u03d4"+
		"\2\u03d6\2\u03da\2\u03da\2\u03dc\2\u03dc\2\u03de\2\u03de\2\u03e0\2\u03e0"+
		"\2\u03e2\2\u03e2\2\u03e4\2\u03e4\2\u03e6\2\u03e6\2\u03e8\2\u03e8\2\u03ea"+
		"\2\u03ea\2\u03ec\2\u03ec\2\u03ee\2\u03ee\2\u03f0\2\u03f0\2\u03f6\2\u03f6"+
		"\2\u03f9\2\u03f9\2\u03fb\2\u03fc\2\u03ff\2\u0431\2\u0462\2\u0462\2\u0464"+
		"\2\u0464\2\u0466\2\u0466\2\u0468\2\u0468\2\u046a\2\u046a\2\u046c\2\u046c"+
		"\2\u046e\2\u046e\2\u0470\2\u0470\2\u0472\2\u0472\2\u0474\2\u0474\2\u0476"+
		"\2\u0476\2\u0478\2\u0478\2\u047a\2\u047a\2\u047c\2\u047c\2\u047e\2\u047e"+
		"\2\u0480\2\u0480\2\u0482\2\u0482\2\u048c\2\u048c\2\u048e\2\u048e\2\u0490"+
		"\2\u0490\2\u0492\2\u0492\2\u0494\2\u0494\2\u0496\2\u0496\2\u0498\2\u0498"+
		"\2\u049a\2\u049a\2\u049c\2\u049c\2\u049e\2\u049e\2\u04a0\2\u04a0\2\u04a2"+
		"\2\u04a2\2\u04a4\2\u04a4\2\u04a6\2\u04a6\2\u04a8\2\u04a8\2\u04aa\2\u04aa"+
		"\2\u04ac\2\u04ac\2\u04ae\2\u04ae\2\u04b0\2\u04b0\2\u04b2\2\u04b2\2\u04b4"+
		"\2\u04b4\2\u04b6\2\u04b6\2\u04b8\2\u04b8\2\u04ba\2\u04ba\2\u04bc\2\u04bc"+
		"\2\u04be\2\u04be\2\u04c0\2\u04c0\2\u04c2\2\u04c3\2\u04c5\2\u04c5\2\u04c7"+
		"\2\u04c7\2\u04c9\2\u04c9\2\u04cb\2\u04cb\2\u04cd\2\u04cd\2\u04cf\2\u04cf"+
		"\2\u04d2\2\u04d2\2\u04d4\2\u04d4\2\u04d6\2\u04d6\2\u04d8\2\u04d8\2\u04da"+
		"\2\u04da\2\u04dc\2\u04dc\2\u04de\2\u04de\2\u04e0\2\u04e0\2\u04e2\2\u04e2"+
		"\2\u04e4\2\u04e4\2\u04e6\2\u04e6\2\u04e8\2\u04e8\2\u04ea\2\u04ea\2\u04ec"+
		"\2\u04ec\2\u04ee\2\u04ee\2\u04f0\2\u04f0\2\u04f2\2\u04f2\2\u04f4\2\u04f4"+
		"\2\u04f6\2\u04f6\2\u04f8\2\u04f8\2\u04fa\2\u04fa\2\u04fc\2\u04fc\2\u04fe"+
		"\2\u04fe\2\u0500\2\u0500\2\u0502\2\u0502\2\u0504\2\u0504\2\u0506\2\u0506"+
		"\2\u0508\2\u0508\2\u050a\2\u050a\2\u050c\2\u050c\2\u050e\2\u050e\2\u0510"+
		"\2\u0510\2\u0512\2\u0512\2\u0514\2\u0514\2\u0516\2\u0516\2\u0518\2\u0518"+
		"\2\u051a\2\u051a\2\u051c\2\u051c\2\u051e\2\u051e\2\u0520\2\u0520\2\u0522"+
		"\2\u0522\2\u0524\2\u0524\2\u0526\2\u0526\2\u0528\2\u0528\2\u052a\2\u052a"+
		"\2\u052c\2\u052c\2\u052e\2\u052e\2\u0530\2\u0530\2\u0533\2\u0558\2\u10a2"+
		"\2\u10c7\2\u10c9\2\u10c9\2\u10cf\2\u10cf\2\u13a2\2\u13f7\2\u1e02\2\u1e02"+
		"\2\u1e04\2\u1e04\2\u1e06\2\u1e06\2\u1e08\2\u1e08\2\u1e0a\2\u1e0a\2\u1e0c"+
		"\2\u1e0c\2\u1e0e\2\u1e0e\2\u1e10\2\u1e10\2\u1e12\2\u1e12\2\u1e14\2\u1e14"+
		"\2\u1e16\2\u1e16\2\u1e18\2\u1e18\2\u1e1a\2\u1e1a\2\u1e1c\2\u1e1c\2\u1e1e"+
		"\2\u1e1e\2\u1e20\2\u1e20\2\u1e22\2\u1e22\2\u1e24\2\u1e24\2\u1e26\2\u1e26"+
		"\2\u1e28\2\u1e28\2\u1e2a\2\u1e2a\2\u1e2c\2\u1e2c\2\u1e2e\2\u1e2e\2\u1e30"+
		"\2\u1e30\2\u1e32\2\u1e32\2\u1e34\2\u1e34\2\u1e36\2\u1e36\2\u1e38\2\u1e38"+
		"\2\u1e3a\2\u1e3a\2\u1e3c\2\u1e3c\2\u1e3e\2\u1e3e\2\u1e40\2\u1e40\2\u1e42"+
		"\2\u1e42\2\u1e44\2\u1e44\2\u1e46\2\u1e46\2\u1e48\2\u1e48\2\u1e4a\2\u1e4a"+
		"\2\u1e4c\2\u1e4c\2\u1e4e\2\u1e4e\2\u1e50\2\u1e50\2\u1e52\2\u1e52\2\u1e54"+
		"\2\u1e54\2\u1e56\2\u1e56\2\u1e58\2\u1e58\2\u1e5a\2\u1e5a\2\u1e5c\2\u1e5c"+
		"\2\u1e5e\2\u1e5e\2\u1e60\2\u1e60\2\u1e62\2\u1e62\2\u1e64\2\u1e64\2\u1e66"+
		"\2\u1e66\2\u1e68\2\u1e68\2\u1e6a\2\u1e6a\2\u1e6c\2\u1e6c\2\u1e6e\2\u1e6e"+
		"\2\u1e70\2\u1e70\2\u1e72\2\u1e72\2\u1e74\2\u1e74\2\u1e76\2\u1e76\2\u1e78"+
		"\2\u1e78\2\u1e7a\2\u1e7a\2\u1e7c\2\u1e7c\2\u1e7e\2\u1e7e\2\u1e80\2\u1e80"+
		"\2\u1e82\2\u1e82\2\u1e84\2\u1e84\2\u1e86\2\u1e86\2\u1e88\2\u1e88\2\u1e8a"+
		"\2\u1e8a\2\u1e8c\2\u1e8c\2\u1e8e\2\u1e8e\2\u1e90\2\u1e90\2\u1e92\2\u1e92"+
		"\2\u1e94\2\u1e94\2\u1e96\2\u1e96\2\u1ea0\2\u1ea0\2\u1ea2\2\u1ea2\2\u1ea4"+
		"\2\u1ea4\2\u1ea6\2\u1ea6\2\u1ea8\2\u1ea8\2\u1eaa\2\u1eaa\2\u1eac\2\u1eac"+
		"\2\u1eae\2\u1eae\2\u1eb0\2\u1eb0\2\u1eb2\2\u1eb2\2\u1eb4\2\u1eb4\2\u1eb6"+
		"\2\u1eb6\2\u1eb8\2\u1eb8\2\u1eba\2\u1eba\2\u1ebc\2\u1ebc\2\u1ebe\2\u1ebe"+
		"\2\u1ec0\2\u1ec0\2\u1ec2\2\u1ec2\2\u1ec4\2\u1ec4\2\u1ec6\2\u1ec6\2\u1ec8"+
		"\2\u1ec8\2\u1eca\2\u1eca\2\u1ecc\2\u1ecc\2\u1ece\2\u1ece\2\u1ed0\2\u1ed0"+
		"\2\u1ed2\2\u1ed2\2\u1ed4\2\u1ed4\2\u1ed6\2\u1ed6\2\u1ed8\2\u1ed8\2\u1eda"+
		"\2\u1eda\2\u1edc\2\u1edc\2\u1ede\2\u1ede\2\u1ee0\2\u1ee0\2\u1ee2\2\u1ee2"+
		"\2\u1ee4\2\u1ee4\2\u1ee6\2\u1ee6\2\u1ee8\2\u1ee8\2\u1eea\2\u1eea\2\u1eec"+
		"\2\u1eec\2\u1eee\2\u1eee\2\u1ef0\2\u1ef0\2\u1ef2\2\u1ef2\2\u1ef4\2\u1ef4"+
		"\2\u1ef6\2\u1ef6\2\u1ef8\2\u1ef8\2\u1efa\2\u1efa\2\u1efc\2\u1efc\2\u1efe"+
		"\2\u1efe\2\u1f00\2\u1f00\2\u1f0a\2\u1f11\2\u1f1a\2\u1f1f\2\u1f2a\2\u1f31"+
		"\2\u1f3a\2\u1f41\2\u1f4a\2\u1f4f\2\u1f5b\2\u1f5b\2\u1f5d\2\u1f5d\2\u1f5f"+
		"\2\u1f5f\2\u1f61\2\u1f61\2\u1f6a\2\u1f71\2\u1fba\2\u1fbd\2\u1fca\2\u1fcd"+
		"\2\u1fda\2\u1fdd\2\u1fea\2\u1fee\2\u1ffa\2\u1ffd\2\u2104\2\u2104\2\u2109"+
		"\2\u2109\2\u210d\2\u210f\2\u2112\2\u2114\2\u2117\2\u2117\2\u211b\2\u211f"+
		"\2\u2126\2\u2126\2\u2128\2\u2128\2\u212a\2\u212a\2\u212c\2\u212f\2\u2132"+
		"\2\u2135\2\u2140\2\u2141\2\u2147\2\u2147\2\u2185\2\u2185\2\u2c02\2\u2c30"+
		"\2\u2c62\2\u2c62\2\u2c64\2\u2c66\2\u2c69\2\u2c69\2\u2c6b\2\u2c6b\2\u2c6d"+
		"\2\u2c6d\2\u2c6f\2\u2c72\2\u2c74\2\u2c74\2\u2c77\2\u2c77\2\u2c80\2\u2c82"+
		"\2\u2c84\2\u2c84\2\u2c86\2\u2c86\2\u2c88\2\u2c88\2\u2c8a\2\u2c8a\2\u2c8c"+
		"\2\u2c8c\2\u2c8e\2\u2c8e\2\u2c90\2\u2c90\2\u2c92\2\u2c92\2\u2c94\2\u2c94"+
		"\2\u2c96\2\u2c96\2\u2c98\2\u2c98\2\u2c9a\2\u2c9a\2\u2c9c\2\u2c9c\2\u2c9e"+
		"\2\u2c9e\2\u2ca0\2\u2ca0\2\u2ca2\2\u2ca2\2\u2ca4\2\u2ca4\2\u2ca6\2\u2ca6"+
		"\2\u2ca8\2\u2ca8\2\u2caa\2\u2caa\2\u2cac\2\u2cac\2\u2cae\2\u2cae\2\u2cb0"+
		"\2\u2cb0\2\u2cb2\2\u2cb2\2\u2cb4\2\u2cb4\2\u2cb6\2\u2cb6\2\u2cb8\2\u2cb8"+
		"\2\u2cba\2\u2cba\2\u2cbc\2\u2cbc\2\u2cbe\2\u2cbe\2\u2cc0\2\u2cc0\2\u2cc2"+
		"\2\u2cc2\2\u2cc4\2\u2cc4\2\u2cc6\2\u2cc6\2\u2cc8\2\u2cc8\2\u2cca\2\u2cca"+
		"\2\u2ccc\2\u2ccc\2\u2cce\2\u2cce\2\u2cd0\2\u2cd0\2\u2cd2\2\u2cd2\2\u2cd4"+
		"\2\u2cd4\2\u2cd6\2\u2cd6\2\u2cd8\2\u2cd8\2\u2cda\2\u2cda\2\u2cdc\2\u2cdc"+
		"\2\u2cde\2\u2cde\2\u2ce0\2\u2ce0\2\u2ce2\2\u2ce2\2\u2ce4\2\u2ce4\2\u2ced"+
		"\2\u2ced\2\u2cef\2\u2cef\2\u2cf4\2\u2cf4\2\ua642\2\ua642\2\ua644\2\ua644"+
		"\2\ua646\2\ua646\2\ua648\2\ua648\2\ua64a\2\ua64a\2\ua64c\2\ua64c\2\ua64e"+
		"\2\ua64e\2\ua650\2\ua650\2\ua652\2\ua652\2\ua654\2\ua654\2\ua656\2\ua656"+
		"\2\ua658\2\ua658\2\ua65a\2\ua65a\2\ua65c\2\ua65c\2\ua65e\2\ua65e\2\ua660"+
		"\2\ua660\2\ua662\2\ua662\2\ua664\2\ua664\2\ua666\2\ua666\2\ua668\2\ua668"+
		"\2\ua66a\2\ua66a\2\ua66c\2\ua66c\2\ua66e\2\ua66e\2\ua682\2\ua682\2\ua684"+
		"\2\ua684\2\ua686\2\ua686\2\ua688\2\ua688\2\ua68a\2\ua68a\2\ua68c\2\ua68c"+
		"\2\ua68e\2\ua68e\2\ua690\2\ua690\2\ua692\2\ua692\2\ua694\2\ua694\2\ua696"+
		"\2\ua696\2\ua698\2\ua698\2\ua69a\2\ua69a\2\ua69c\2\ua69c\2\ua724\2\ua724"+
		"\2\ua726\2\ua726\2\ua728\2\ua728\2\ua72a\2\ua72a\2\ua72c\2\ua72c\2\ua72e"+
		"\2\ua72e\2\ua730\2\ua730\2\ua734\2\ua734\2\ua736\2\ua736\2\ua738\2\ua738"+
		"\2\ua73a\2\ua73a\2\ua73c\2\ua73c\2\ua73e\2\ua73e\2\ua740\2\ua740\2\ua742"+
		"\2\ua742\2\ua744\2\ua744\2\ua746\2\ua746\2\ua748\2\ua748\2\ua74a\2\ua74a"+
		"\2\ua74c\2\ua74c\2\ua74e\2\ua74e\2\ua750\2\ua750\2\ua752\2\ua752\2\ua754"+
		"\2\ua754\2\ua756\2\ua756\2\ua758\2\ua758\2\ua75a\2\ua75a\2\ua75c\2\ua75c"+
		"\2\ua75e\2\ua75e\2\ua760\2\ua760\2\ua762\2\ua762\2\ua764\2\ua764\2\ua766"+
		"\2\ua766\2\ua768\2\ua768\2\ua76a\2\ua76a\2\ua76c\2\ua76c\2\ua76e\2\ua76e"+
		"\2\ua770\2\ua770\2\ua77b\2\ua77b\2\ua77d\2\ua77d\2\ua77f\2\ua780\2\ua782"+
		"\2\ua782\2\ua784\2\ua784\2\ua786\2\ua786\2\ua788\2\ua788\2\ua78d\2\ua78d"+
		"\2\ua78f\2\ua78f\2\ua792\2\ua792\2\ua794\2\ua794\2\ua798\2\ua798\2\ua79a"+
		"\2\ua79a\2\ua79c\2\ua79c\2\ua79e\2\ua79e\2\ua7a0\2\ua7a0\2\ua7a2\2\ua7a2"+
		"\2\ua7a4\2\ua7a4\2\ua7a6\2\ua7a6\2\ua7a8\2\ua7a8\2\ua7aa\2\ua7aa\2\ua7ac"+
		"\2\ua7b0\2\ua7b2\2\ua7b6\2\ua7b8\2\ua7b8\2\uff23\2\uff3c\2\u0402\3\u0429"+
		"\3\u04b2\3\u04d5\3\u0c82\3\u0cb4\3\u18a2\3\u18c1\3\ud402\3\ud41b\3\ud436"+
		"\3\ud44f\3\ud46a\3\ud483\3\ud49e\3\ud49e\3\ud4a0\3\ud4a1\3\ud4a4\3\ud4a4"+
		"\3\ud4a7\3\ud4a8\3\ud4ab\3\ud4ae\3\ud4b0\3\ud4b7\3\ud4d2\3\ud4eb\3\ud506"+
		"\3\ud507\3\ud509\3\ud50c\3\ud50f\3\ud516\3\ud518\3\ud51e\3\ud53a\3\ud53b"+
		"\3\ud53d\3\ud540\3\ud542\3\ud546\3\ud548\3\ud548\3\ud54c\3\ud552\3\ud56e"+
		"\3\ud587\3\ud5a2\3\ud5bb\3\ud5d6\3\ud5ef\3\ud60a\3\ud623\3\ud63e\3\ud657"+
		"\3\ud672\3\ud68b\3\ud6aa\3\ud6c2\3\ud6e4\3\ud6fc\3\ud71e\3\ud736\3\ud758"+
		"\3\ud770\3\ud792\3\ud7aa\3\ud7cc\3\ud7cc\3\ue902\3\ue923\3\u027b\2c\2"+
		"|\2\u00b7\2\u00b7\2\u00e1\2\u00f8\2\u00fa\2\u0101\2\u0103\2\u0103\2\u0105"+
		"\2\u0105\2\u0107\2\u0107\2\u0109\2\u0109\2\u010b\2\u010b\2\u010d\2\u010d"+
		"\2\u010f\2\u010f\2\u0111\2\u0111\2\u0113\2\u0113\2\u0115\2\u0115\2\u0117"+
		"\2\u0117\2\u0119\2\u0119\2\u011b\2\u011b\2\u011d\2\u011d\2\u011f\2\u011f"+
		"\2\u0121\2\u0121\2\u0123\2\u0123\2\u0125\2\u0125\2\u0127\2\u0127\2\u0129"+
		"\2\u0129\2\u012b\2\u012b\2\u012d\2\u012d\2\u012f\2\u012f\2\u0131\2\u0131"+
		"\2\u0133\2\u0133\2\u0135\2\u0135\2\u0137\2\u0137\2\u0139\2\u013a\2\u013c"+
		"\2\u013c\2\u013e\2\u013e\2\u0140\2\u0140\2\u0142\2\u0142\2\u0144\2\u0144"+
		"\2\u0146\2\u0146\2\u0148\2\u0148\2\u014a\2\u014b\2\u014d\2\u014d\2\u014f"+
		"\2\u014f\2\u0151\2\u0151\2\u0153\2\u0153\2\u0155\2\u0155\2\u0157\2\u0157"+
		"\2\u0159\2\u0159\2\u015b\2\u015b\2\u015d\2\u015d\2\u015f\2\u015f\2\u0161"+
		"\2\u0161\2\u0163\2\u0163\2\u0165\2\u0165\2\u0167\2\u0167\2\u0169\2\u0169"+
		"\2\u016b\2\u016b\2\u016d\2\u016d\2\u016f\2\u016f\2\u0171\2\u0171\2\u0173"+
		"\2\u0173\2\u0175\2\u0175\2\u0177\2\u0177\2\u0179\2\u0179\2\u017c\2\u017c"+
		"\2\u017e\2\u017e\2\u0180\2\u0182\2\u0185\2\u0185\2\u0187\2\u0187\2\u018a"+
		"\2\u018a\2\u018e\2\u018f\2\u0194\2\u0194\2\u0197\2\u0197\2\u019b\2\u019d"+
		"\2\u01a0\2\u01a0\2\u01a3\2\u01a3\2\u01a5\2\u01a5\2\u01a7\2\u01a7\2\u01aa"+
		"\2\u01aa\2\u01ac\2\u01ad\2\u01af\2\u01af\2\u01b2\2\u01b2\2\u01b6\2\u01b6"+
		"\2\u01b8\2\u01b8\2\u01bb\2\u01bc\2\u01bf\2\u01c1\2\u01c8\2\u01c8\2\u01cb"+
		"\2\u01cb\2\u01ce\2\u01ce\2\u01d0\2\u01d0\2\u01d2\2\u01d2\2\u01d4\2\u01d4"+
		"\2\u01d6\2\u01d6\2\u01d8\2\u01d8\2\u01da\2\u01da\2\u01dc\2\u01dc\2\u01de"+
		"\2\u01df\2\u01e1\2\u01e1\2\u01e3\2\u01e3\2\u01e5\2\u01e5\2\u01e7\2\u01e7"+
		"\2\u01e9\2\u01e9\2\u01eb\2\u01eb\2\u01ed\2\u01ed\2\u01ef\2\u01ef\2\u01f1"+
		"\2\u01f2\2\u01f5\2\u01f5\2\u01f7\2\u01f7\2\u01fb\2\u01fb\2\u01fd\2\u01fd"+
		"\2\u01ff\2\u01ff\2\u0201\2\u0201\2\u0203\2\u0203\2\u0205\2\u0205\2\u0207"+
		"\2\u0207\2\u0209\2\u0209\2\u020b\2\u020b\2\u020d\2\u020d\2\u020f\2\u020f"+
		"\2\u0211\2\u0211\2\u0213\2\u0213\2\u0215\2\u0215\2\u0217\2\u0217\2\u0219"+
		"\2\u0219\2\u021b\2\u021b\2\u021d\2\u021d\2\u021f\2\u021f\2\u0221\2\u0221"+
		"\2\u0223\2\u0223\2\u0225\2\u0225\2\u0227\2\u0227\2\u0229\2\u0229\2\u022b"+
		"\2\u022b\2\u022d\2\u022d\2\u022f\2\u022f\2\u0231\2\u0231\2\u0233\2\u0233"+
		"\2\u0235\2\u023b\2\u023e\2\u023e\2\u0241\2\u0242\2\u0244\2\u0244\2\u0249"+
		"\2\u0249\2\u024b\2\u024b\2\u024d\2\u024d\2\u024f\2\u024f\2\u0251\2\u0295"+
		"\2\u0297\2\u02b1\2\u0373\2\u0373\2\u0375\2\u0375\2\u0379\2\u0379\2\u037d"+
		"\2\u037f\2\u0392\2\u0392\2\u03ae\2\u03d0\2\u03d2\2\u03d3\2\u03d7\2\u03d9"+
		"\2\u03db\2\u03db\2\u03dd\2\u03dd\2\u03df\2\u03df\2\u03e1\2\u03e1\2\u03e3"+
		"\2\u03e3\2\u03e5\2\u03e5\2\u03e7\2\u03e7\2\u03e9\2\u03e9\2\u03eb\2\u03eb"+
		"\2\u03ed\2\u03ed\2\u03ef\2\u03ef\2\u03f1\2\u03f5\2\u03f7\2\u03f7\2\u03fa"+
		"\2\u03fa\2\u03fd\2\u03fe\2\u0432\2\u0461\2\u0463\2\u0463\2\u0465\2\u0465"+
		"\2\u0467\2\u0467\2\u0469\2\u0469\2\u046b\2\u046b\2\u046d\2\u046d\2\u046f"+
		"\2\u046f\2\u0471\2\u0471\2\u0473\2\u0473\2\u0475\2\u0475\2\u0477\2\u0477"+
		"\2\u0479\2\u0479\2\u047b\2\u047b\2\u047d\2\u047d\2\u047f\2\u047f\2\u0481"+
		"\2\u0481\2\u0483\2\u0483\2\u048d\2\u048d\2\u048f\2\u048f\2\u0491\2\u0491"+
		"\2\u0493\2\u0493\2\u0495\2\u0495\2\u0497\2\u0497\2\u0499\2\u0499\2\u049b"+
		"\2\u049b\2\u049d\2\u049d\2\u049f\2\u049f\2\u04a1\2\u04a1\2\u04a3\2\u04a3"+
		"\2\u04a5\2\u04a5\2\u04a7\2\u04a7\2\u04a9\2\u04a9\2\u04ab\2\u04ab\2\u04ad"+
		"\2\u04ad\2\u04af\2\u04af\2\u04b1\2\u04b1\2\u04b3\2\u04b3\2\u04b5\2\u04b5"+
		"\2\u04b7\2\u04b7\2\u04b9\2\u04b9\2\u04bb\2\u04bb\2\u04bd\2\u04bd\2\u04bf"+
		"\2\u04bf\2\u04c1\2\u04c1\2\u04c4\2\u04c4\2\u04c6\2\u04c6\2\u04c8\2\u04c8"+
		"\2\u04ca\2\u04ca\2\u04cc\2\u04cc\2\u04ce\2\u04ce\2\u04d0\2\u04d1\2\u04d3"+
		"\2\u04d3\2\u04d5\2\u04d5\2\u04d7\2\u04d7\2\u04d9\2\u04d9\2\u04db\2\u04db"+
		"\2\u04dd\2\u04dd\2\u04df\2\u04df\2\u04e1\2\u04e1\2\u04e3\2\u04e3\2\u04e5"+
		"\2\u04e5\2\u04e7\2\u04e7\2\u04e9\2\u04e9\2\u04eb\2\u04eb\2\u04ed\2\u04ed"+
		"\2\u04ef\2\u04ef\2\u04f1\2\u04f1\2\u04f3\2\u04f3\2\u04f5\2\u04f5\2\u04f7"+
		"\2\u04f7\2\u04f9\2\u04f9\2\u04fb\2\u04fb\2\u04fd\2\u04fd\2\u04ff\2\u04ff"+
		"\2\u0501\2\u0501\2\u0503\2\u0503\2\u0505\2\u0505\2\u0507\2\u0507\2\u0509"+
		"\2\u0509\2\u050b\2\u050b\2\u050d\2\u050d\2\u050f\2\u050f\2\u0511\2\u0511"+
		"\2\u0513\2\u0513\2\u0515\2\u0515\2\u0517\2\u0517\2\u0519\2\u0519\2\u051b"+
		"\2\u051b\2\u051d\2\u051d\2\u051f\2\u051f\2\u0521\2\u0521\2\u0523\2\u0523"+
		"\2\u0525\2\u0525\2\u0527\2\u0527\2\u0529\2\u0529\2\u052b\2\u052b\2\u052d"+
		"\2\u052d\2\u052f\2\u052f\2\u0531\2\u0531\2\u0563\2\u0589\2\u13fa\2\u13ff"+
		"\2\u1c82\2\u1c8a\2\u1d02\2\u1d2d\2\u1d6d\2\u1d79\2\u1d7b\2\u1d9c\2\u1e03"+
		"\2\u1e03\2\u1e05\2\u1e05\2\u1e07\2\u1e07\2\u1e09\2\u1e09\2\u1e0b\2\u1e0b"+
		"\2\u1e0d\2\u1e0d\2\u1e0f\2\u1e0f\2\u1e11\2\u1e11\2\u1e13\2\u1e13\2\u1e15"+
		"\2\u1e15\2\u1e17\2\u1e17\2\u1e19\2\u1e19\2\u1e1b\2\u1e1b\2\u1e1d\2\u1e1d"+
		"\2\u1e1f\2\u1e1f\2\u1e21\2\u1e21\2\u1e23\2\u1e23\2\u1e25\2\u1e25\2\u1e27"+
		"\2\u1e27\2\u1e29\2\u1e29\2\u1e2b\2\u1e2b\2\u1e2d\2\u1e2d\2\u1e2f\2\u1e2f"+
		"\2\u1e31\2\u1e31\2\u1e33\2\u1e33\2\u1e35\2\u1e35\2\u1e37\2\u1e37\2\u1e39"+
		"\2\u1e39\2\u1e3b\2\u1e3b\2\u1e3d\2\u1e3d\2\u1e3f\2\u1e3f\2\u1e41\2\u1e41"+
		"\2\u1e43\2\u1e43\2\u1e45\2\u1e45\2\u1e47\2\u1e47\2\u1e49\2\u1e49\2\u1e4b"+
		"\2\u1e4b\2\u1e4d\2\u1e4d\2\u1e4f\2\u1e4f\2\u1e51\2\u1e51\2\u1e53\2\u1e53"+
		"\2\u1e55\2\u1e55\2\u1e57\2\u1e57\2\u1e59\2\u1e59\2\u1e5b\2\u1e5b\2\u1e5d"+
		"\2\u1e5d\2\u1e5f\2\u1e5f\2\u1e61\2\u1e61\2\u1e63\2\u1e63\2\u1e65\2\u1e65"+
		"\2\u1e67\2\u1e67\2\u1e69\2\u1e69\2\u1e6b\2\u1e6b\2\u1e6d\2\u1e6d\2\u1e6f"+
		"\2\u1e6f\2\u1e71\2\u1e71\2\u1e73\2\u1e73\2\u1e75\2\u1e75\2\u1e77\2\u1e77"+
		"\2\u1e79\2\u1e79\2\u1e7b\2\u1e7b\2\u1e7d\2\u1e7d\2\u1e7f\2\u1e7f\2\u1e81"+
		"\2\u1e81\2\u1e83\2\u1e83\2\u1e85\2\u1e85\2\u1e87\2\u1e87\2\u1e89\2\u1e89"+
		"\2\u1e8b\2\u1e8b\2\u1e8d\2\u1e8d\2\u1e8f\2\u1e8f\2\u1e91\2\u1e91\2\u1e93"+
		"\2\u1e93\2\u1e95\2\u1e95\2\u1e97\2\u1e9f\2\u1ea1\2\u1ea1\2\u1ea3\2\u1ea3"+
		"\2\u1ea5\2\u1ea5\2\u1ea7\2\u1ea7\2\u1ea9\2\u1ea9\2\u1eab\2\u1eab\2\u1ead"+
		"\2\u1ead\2\u1eaf\2\u1eaf\2\u1eb1\2\u1eb1\2\u1eb3\2\u1eb3\2\u1eb5\2\u1eb5"+
		"\2\u1eb7\2\u1eb7\2\u1eb9\2\u1eb9\2\u1ebb\2\u1ebb\2\u1ebd\2\u1ebd\2\u1ebf"+
		"\2\u1ebf\2\u1ec1\2\u1ec1\2\u1ec3\2\u1ec3\2\u1ec5\2\u1ec5\2\u1ec7\2\u1ec7"+
		"\2\u1ec9\2\u1ec9\2\u1ecb\2\u1ecb\2\u1ecd\2\u1ecd\2\u1ecf\2\u1ecf\2\u1ed1"+
		"\2\u1ed1\2\u1ed3\2\u1ed3\2\u1ed5\2\u1ed5\2\u1ed7\2\u1ed7\2\u1ed9\2\u1ed9"+
		"\2\u1edb\2\u1edb\2\u1edd\2\u1edd\2\u1edf\2\u1edf\2\u1ee1\2\u1ee1\2\u1ee3"+
		"\2\u1ee3\2\u1ee5\2\u1ee5\2\u1ee7\2\u1ee7\2\u1ee9\2\u1ee9\2\u1eeb\2\u1eeb"+
		"\2\u1eed\2\u1eed\2\u1eef\2\u1eef\2\u1ef1\2\u1ef1\2\u1ef3\2\u1ef3\2\u1ef5"+
		"\2\u1ef5\2\u1ef7\2\u1ef7\2\u1ef9\2\u1ef9\2\u1efb\2\u1efb\2\u1efd\2\u1efd"+
		"\2\u1eff\2\u1eff\2\u1f01\2\u1f09\2\u1f12\2\u1f17\2\u1f22\2\u1f29\2\u1f32"+
		"\2\u1f39\2\u1f42\2\u1f47\2\u1f52\2\u1f59\2\u1f62\2\u1f69\2\u1f72\2\u1f7f"+
		"\2\u1f82\2\u1f89\2\u1f92\2\u1f99\2\u1fa2\2\u1fa9\2\u1fb2\2\u1fb6\2\u1fb8"+
		"\2\u1fb9\2\u1fc0\2\u1fc0\2\u1fc4\2\u1fc6\2\u1fc8\2\u1fc9\2\u1fd2\2\u1fd5"+
		"\2\u1fd8\2\u1fd9\2\u1fe2\2\u1fe9\2\u1ff4\2\u1ff6\2\u1ff8\2\u1ff9\2\u210c"+
		"\2\u210c\2\u2110\2\u2111\2\u2115\2\u2115\2\u2131\2\u2131\2\u2136\2\u2136"+
		"\2\u213b\2\u213b\2\u213e\2\u213f\2\u2148\2\u214b\2\u2150\2\u2150\2\u2186"+
		"\2\u2186\2\u2c32\2\u2c60\2\u2c63\2\u2c63\2\u2c67\2\u2c68\2\u2c6a\2\u2c6a"+
		"\2\u2c6c\2\u2c6c\2\u2c6e\2\u2c6e\2\u2c73\2\u2c73\2\u2c75\2\u2c76\2\u2c78"+
		"\2\u2c7d\2\u2c83\2\u2c83\2\u2c85\2\u2c85\2\u2c87\2\u2c87\2\u2c89\2\u2c89"+
		"\2\u2c8b\2\u2c8b\2\u2c8d\2\u2c8d\2\u2c8f\2\u2c8f\2\u2c91\2\u2c91\2\u2c93"+
		"\2\u2c93\2\u2c95\2\u2c95\2\u2c97\2\u2c97\2\u2c99\2\u2c99\2\u2c9b\2\u2c9b"+
		"\2\u2c9d\2\u2c9d\2\u2c9f\2\u2c9f\2\u2ca1\2\u2ca1\2\u2ca3\2\u2ca3\2\u2ca5"+
		"\2\u2ca5\2\u2ca7\2\u2ca7\2\u2ca9\2\u2ca9\2\u2cab\2\u2cab\2\u2cad\2\u2cad"+
		"\2\u2caf\2\u2caf\2\u2cb1\2\u2cb1\2\u2cb3\2\u2cb3\2\u2cb5\2\u2cb5\2\u2cb7"+
		"\2\u2cb7\2\u2cb9\2\u2cb9\2\u2cbb\2\u2cbb\2\u2cbd\2\u2cbd\2\u2cbf\2\u2cbf"+
		"\2\u2cc1\2\u2cc1\2\u2cc3\2\u2cc3\2\u2cc5\2\u2cc5\2\u2cc7\2\u2cc7\2\u2cc9"+
		"\2\u2cc9\2\u2ccb\2\u2ccb\2\u2ccd\2\u2ccd\2\u2ccf\2\u2ccf\2\u2cd1\2\u2cd1"+
		"\2\u2cd3\2\u2cd3\2\u2cd5\2\u2cd5\2\u2cd7\2\u2cd7\2\u2cd9\2\u2cd9\2\u2cdb"+
		"\2\u2cdb\2\u2cdd\2\u2cdd\2\u2cdf\2\u2cdf\2\u2ce1\2\u2ce1\2\u2ce3\2\u2ce3"+
		"\2\u2ce5\2\u2ce6\2\u2cee\2\u2cee\2\u2cf0\2\u2cf0\2\u2cf5\2\u2cf5\2\u2d02"+
		"\2\u2d27\2\u2d29\2\u2d29\2\u2d2f\2\u2d2f\2\ua643\2\ua643\2\ua645\2\ua645"+
		"\2\ua647\2\ua647\2\ua649\2\ua649\2\ua64b\2\ua64b\2\ua64d\2\ua64d\2\ua64f"+
		"\2\ua64f\2\ua651\2\ua651\2\ua653\2\ua653\2\ua655\2\ua655\2\ua657\2\ua657"+
		"\2\ua659\2\ua659\2\ua65b\2\ua65b\2\ua65d\2\ua65d\2\ua65f\2\ua65f\2\ua661"+
		"\2\ua661\2\ua663\2\ua663\2\ua665\2\ua665\2\ua667\2\ua667\2\ua669\2\ua669"+
		"\2\ua66b\2\ua66b\2\ua66d\2\ua66d\2\ua66f\2\ua66f\2\ua683\2\ua683\2\ua685"+
		"\2\ua685\2\ua687\2\ua687\2\ua689\2\ua689\2\ua68b\2\ua68b\2\ua68d\2\ua68d"+
		"\2\ua68f\2\ua68f\2\ua691\2\ua691\2\ua693\2\ua693\2\ua695\2\ua695\2\ua697"+
		"\2\ua697\2\ua699\2\ua699\2\ua69b\2\ua69b\2\ua69d\2\ua69d\2\ua725\2\ua725"+
		"\2\ua727\2\ua727\2\ua729\2\ua729\2\ua72b\2\ua72b\2\ua72d\2\ua72d\2\ua72f"+
		"\2\ua72f\2\ua731\2\ua733\2\ua735\2\ua735\2\ua737\2\ua737\2\ua739\2\ua739"+
		"\2\ua73b\2\ua73b\2\ua73d\2\ua73d\2\ua73f\2\ua73f\2\ua741\2\ua741\2\ua743"+
		"\2\ua743\2\ua745\2\ua745\2\ua747\2\ua747\2\ua749\2\ua749\2\ua74b\2\ua74b"+
		"\2\ua74d\2\ua74d\2\ua74f\2\ua74f\2\ua751\2\ua751\2\ua753\2\ua753\2\ua755"+
		"\2\ua755\2\ua757\2\ua757\2\ua759\2\ua759\2\ua75b\2\ua75b\2\ua75d\2\ua75d"+
		"\2\ua75f\2\ua75f\2\ua761\2\ua761\2\ua763\2\ua763\2\ua765\2\ua765\2\ua767"+
		"\2\ua767\2\ua769\2\ua769\2\ua76b\2\ua76b\2\ua76d\2\ua76d\2\ua76f\2\ua76f"+
		"\2\ua771\2\ua771\2\ua773\2\ua77a\2\ua77c\2\ua77c\2\ua77e\2\ua77e\2\ua781"+
		"\2\ua781\2\ua783\2\ua783\2\ua785\2\ua785\2\ua787\2\ua787\2\ua789\2\ua789"+
		"\2\ua78e\2\ua78e\2\ua790\2\ua790\2\ua793\2\ua793\2\ua795\2\ua797\2\ua799"+
		"\2\ua799\2\ua79b\2\ua79b\2\ua79d\2\ua79d\2\ua79f\2\ua79f\2\ua7a1\2\ua7a1"+
		"\2\ua7a3\2\ua7a3\2\ua7a5\2\ua7a5\2\ua7a7\2\ua7a7\2\ua7a9\2\ua7a9\2\ua7ab"+
		"\2\ua7ab\2\ua7b7\2\ua7b7\2\ua7b9\2\ua7b9\2\ua7fc\2\ua7fc\2\uab32\2\uab5c"+
		"\2\uab62\2\uab67\2\uab72\2\uabc1\2\ufb02\2\ufb08\2\ufb15\2\ufb19\2\uff43"+
		"\2\uff5c\2\u042a\3\u0451\3\u04da\3\u04fd\3\u0cc2\3\u0cf4\3\u18c2\3\u18e1"+
		"\3\ud41c\3\ud435\3\ud450\3\ud456\3\ud458\3\ud469\3\ud484\3\ud49d\3\ud4b8"+
		"\3\ud4bb\3\ud4bd\3\ud4bd\3\ud4bf\3\ud4c5\3\ud4c7\3\ud4d1\3\ud4ec\3\ud505"+
		"\3\ud520\3\ud539\3\ud554\3\ud56d\3\ud588\3\ud5a1\3\ud5bc\3\ud5d5\3\ud5f0"+
		"\3\ud609\3\ud624\3\ud63d\3\ud658\3\ud671\3\ud68c\3\ud6a7\3\ud6c4\3\ud6dc"+
		"\3\ud6de\3\ud6e3\3\ud6fe\3\ud716\3\ud718\3\ud71d\3\ud738\3\ud750\3\ud752"+
		"\3\ud757\3\ud772\3\ud78a\3\ud78c\3\ud791\3\ud7ac\3\ud7c4\3\ud7c6\3\ud7cb"+
		"\3\ud7cd\3\ud7cd\3\ue924\3\ue945\3;\2\u02b2\2\u02c3\2\u02c8\2\u02d3\2"+
		"\u02e2\2\u02e6\2\u02ee\2\u02ee\2\u02f0\2\u02f0\2\u0376\2\u0376\2\u037c"+
		"\2\u037c\2\u055b\2\u055b\2\u0642\2\u0642\2\u06e7\2\u06e8\2\u07f6\2\u07f7"+
		"\2\u07fc\2\u07fc\2\u081c\2\u081c\2\u0826\2\u0826\2\u082a\2\u082a\2\u0973"+
		"\2\u0973\2\u0e48\2\u0e48\2\u0ec8\2\u0ec8\2\u10fe\2\u10fe\2\u17d9\2\u17d9"+
		"\2\u1845\2\u1845\2\u1aa9\2\u1aa9\2\u1c7a\2\u1c7f\2\u1d2e\2\u1d6c\2\u1d7a"+
		"\2\u1d7a\2\u1d9d\2\u1dc1\2\u2073\2\u2073\2\u2081\2\u2081\2\u2092\2\u209e"+
		"\2\u2c7e\2\u2c7f\2\u2d71\2\u2d71\2\u2e31\2\u2e31\2\u3007\2\u3007\2\u3033"+
		"\2\u3037\2\u303d\2\u303d\2\u309f\2\u30a0\2\u30fe\2\u3100\2\ua017\2\ua017"+
		"\2\ua4fa\2\ua4ff\2\ua60e\2\ua60e\2\ua681\2\ua681\2\ua69e\2\ua69f\2\ua719"+
		"\2\ua721\2\ua772\2\ua772\2\ua78a\2\ua78a\2\ua7fa\2\ua7fb\2\ua9d1\2\ua9d1"+
		"\2\ua9e8\2\ua9e8\2\uaa72\2\uaa72\2\uaadf\2\uaadf\2\uaaf5\2\uaaf6\2\uab5e"+
		"\2\uab61\2\uff72\2\uff72\2\uffa0\2\uffa1\2\u6b42\3\u6b45\3\u6f95\3\u6fa1"+
		"\3\u6fe2\3\u6fe3\3\u01cd\2\u00ac\2\u00ac\2\u00bc\2\u00bc\2\u01bd\2\u01bd"+
		"\2\u01c2\2\u01c5\2\u0296\2\u0296\2\u05d2\2\u05ec\2\u05f2\2\u05f4\2\u0622"+
		"\2\u0641\2\u0643\2\u064c\2\u0670\2\u0671\2\u0673\2\u06d5\2\u06d7\2\u06d7"+
		"\2\u06f0\2\u06f1\2\u06fc\2\u06fe\2\u0701\2\u0701\2\u0712\2\u0712\2\u0714"+
		"\2\u0731\2\u074f\2\u07a7\2\u07b3\2\u07b3\2\u07cc\2\u07ec\2\u0802\2\u0817"+
		"\2\u0842\2\u085a\2\u0862\2\u086c\2\u08a2\2\u08b6\2\u08b8\2\u08bf\2\u0906"+
		"\2\u093b\2\u093f\2\u093f\2\u0952\2\u0952\2\u095a\2\u0963\2\u0974\2\u0982"+
		"\2\u0987\2\u098e\2\u0991\2\u0992\2\u0995\2\u09aa\2\u09ac\2\u09b2\2\u09b4"+
		"\2\u09b4\2\u09b8\2\u09bb\2\u09bf\2\u09bf\2\u09d0\2\u09d0\2\u09de\2\u09df"+
		"\2\u09e1\2\u09e3\2\u09f2\2\u09f3\2\u09fe\2\u09fe\2\u0a07\2\u0a0c\2\u0a11"+
		"\2\u0a12\2\u0a15\2\u0a2a\2\u0a2c\2\u0a32\2\u0a34\2\u0a35\2\u0a37\2\u0a38"+
		"\2\u0a3a\2\u0a3b\2\u0a5b\2\u0a5e\2\u0a60\2\u0a60\2\u0a74\2\u0a76\2\u0a87"+
		"\2\u0a8f\2\u0a91\2\u0a93\2\u0a95\2\u0aaa\2\u0aac\2\u0ab2\2\u0ab4\2\u0ab5"+
		"\2\u0ab7\2\u0abb\2\u0abf\2\u0abf\2\u0ad2\2\u0ad2\2\u0ae2\2\u0ae3\2\u0afb"+
		"\2\u0afb\2\u0b07\2\u0b0e\2\u0b11\2\u0b12\2\u0b15\2\u0b2a\2\u0b2c\2\u0b32"+
		"\2\u0b34\2\u0b35\2\u0b37\2\u0b3b\2\u0b3f\2\u0b3f\2\u0b5e\2\u0b5f\2\u0b61"+
		"\2\u0b63\2\u0b73\2\u0b73\2\u0b85\2\u0b85\2\u0b87\2\u0b8c\2\u0b90\2\u0b92"+
		"\2\u0b94\2\u0b97\2\u0b9b\2\u0b9c\2\u0b9e\2\u0b9e\2\u0ba0\2\u0ba1\2\u0ba5"+
		"\2\u0ba6\2\u0baa\2\u0bac\2\u0bb0\2\u0bbb\2\u0bd2\2\u0bd2\2\u0c07\2\u0c0e"+
		"\2\u0c10\2\u0c12\2\u0c14\2\u0c2a\2\u0c2c\2\u0c3b\2\u0c3f\2\u0c3f\2\u0c5a"+
		"\2\u0c5c\2\u0c62\2\u0c63\2\u0c82\2\u0c82\2\u0c87\2\u0c8e\2\u0c90\2\u0c92"+
		"\2\u0c94\2\u0caa\2\u0cac\2\u0cb5\2\u0cb7\2\u0cbb\2\u0cbf\2\u0cbf\2\u0ce0"+
		"\2\u0ce0\2\u0ce2\2\u0ce3\2\u0cf3\2\u0cf4\2\u0d07\2\u0d0e\2\u0d10\2\u0d12"+
		"\2\u0d14\2\u0d3c\2\u0d3f\2\u0d3f\2\u0d50\2\u0d50\2\u0d56\2\u0d58\2\u0d61"+
		"\2\u0d63\2\u0d7c\2\u0d81\2\u0d87\2\u0d98\2\u0d9c\2\u0db3\2\u0db5\2\u0dbd"+
		"\2\u0dbf\2\u0dbf\2\u0dc2\2\u0dc8\2\u0e03\2\u0e32\2\u0e34\2\u0e35\2\u0e42"+
		"\2\u0e47\2\u0e83\2\u0e84\2\u0e86\2\u0e86\2\u0e89\2\u0e8a\2\u0e8c\2\u0e8c"+
		"\2\u0e8f\2\u0e8f\2\u0e96\2\u0e99\2\u0e9b\2\u0ea1\2\u0ea3\2\u0ea5\2\u0ea7"+
		"\2\u0ea7\2\u0ea9\2\u0ea9\2\u0eac\2\u0ead\2\u0eaf\2\u0eb2\2\u0eb4\2\u0eb5"+
		"\2\u0ebf\2\u0ebf\2\u0ec2\2\u0ec6\2\u0ede\2\u0ee1\2\u0f02\2\u0f02\2\u0f42"+
		"\2\u0f49\2\u0f4b\2\u0f6e\2\u0f8a\2\u0f8e\2\u1002\2\u102c\2\u1041\2\u1041"+
		"\2\u1052\2\u1057\2\u105c\2\u105f\2\u1063\2\u1063\2\u1067\2\u1068\2\u1070"+
		"\2\u1072\2\u1077\2\u1083\2\u1090\2\u1090\2\u10d2\2\u10fc\2\u10ff\2\u124a"+
		"\2\u124c\2\u124f\2\u1252\2\u1258\2\u125a\2\u125a\2\u125c\2\u125f\2\u1262"+
		"\2\u128a\2\u128c\2\u128f\2\u1292\2\u12b2\2\u12b4\2\u12b7\2\u12ba\2\u12c0"+
		"\2\u12c2\2\u12c2\2\u12c4\2\u12c7\2\u12ca\2\u12d8\2\u12da\2\u1312\2\u1314"+
		"\2\u1317\2\u131a\2\u135c\2\u1382\2\u1391\2\u1403\2\u166e\2\u1671\2\u1681"+
		"\2\u1683\2\u169c\2\u16a2\2\u16ec\2\u16f3\2\u16fa\2\u1702\2\u170e\2\u1710"+
		"\2\u1713\2\u1722\2\u1733\2\u1742\2\u1753\2\u1762\2\u176e\2\u1770\2\u1772"+
		"\2\u1782\2\u17b5\2\u17de\2\u17de\2\u1822\2\u1844\2\u1846\2\u1879\2\u1882"+
		"\2\u1886\2\u1889\2\u18aa\2\u18ac\2\u18ac\2\u18b2\2\u18f7\2\u1902\2\u1920"+
		"\2\u1952\2\u196f\2\u1972\2\u1976\2\u1982\2\u19ad\2\u19b2\2\u19cb\2\u1a02"+
		"\2\u1a18\2\u1a22\2\u1a56\2\u1b07\2\u1b35\2\u1b47\2\u1b4d\2\u1b85\2\u1ba2"+
		"\2\u1bb0\2\u1bb1\2\u1bbc\2\u1be7\2\u1c02\2\u1c25\2\u1c4f\2\u1c51\2\u1c5c"+
		"\2\u1c79\2\u1ceb\2\u1cee\2\u1cf0\2\u1cf3\2\u1cf7\2\u1cf8\2\u2137\2\u213a"+
		"\2\u2d32\2\u2d69\2\u2d82\2\u2d98\2\u2da2\2\u2da8\2\u2daa\2\u2db0\2\u2db2"+
		"\2\u2db8\2\u2dba\2\u2dc0\2\u2dc2\2\u2dc8\2\u2dca\2\u2dd0\2\u2dd2\2\u2dd8"+
		"\2\u2dda\2\u2de0\2\u3008\2\u3008\2\u303e\2\u303e\2\u3043\2\u3098\2\u30a1"+
		"\2\u30a1\2\u30a3\2\u30fc\2\u3101\2\u3101\2\u3107\2\u3130\2\u3133\2\u3190"+
		"\2\u31a2\2\u31bc\2\u31f2\2\u3201\2\u3402\2\u4db7\2\u4e02\2\u9fec\2\ua002"+
		"\2\ua016\2\ua018\2\ua48e\2\ua4d2\2\ua4f9\2\ua502\2\ua60d\2\ua612\2\ua621"+
		"\2\ua62c\2\ua62d\2\ua670\2\ua670\2\ua6a2\2\ua6e7\2\ua791\2\ua791\2\ua7f9"+
		"\2\ua7f9\2\ua7fd\2\ua803\2\ua805\2\ua807\2\ua809\2\ua80c\2\ua80e\2\ua824"+
		"\2\ua842\2\ua875\2\ua884\2\ua8b5\2\ua8f4\2\ua8f9\2\ua8fd\2\ua8fd\2\ua8ff"+
		"\2\ua8ff\2\ua90c\2\ua927\2\ua932\2\ua948\2\ua962\2\ua97e\2\ua986\2\ua9b4"+
		"\2\ua9e2\2\ua9e6\2\ua9e9\2\ua9f1\2\ua9fc\2\uaa00\2\uaa02\2\uaa2a\2\uaa42"+
		"\2\uaa44\2\uaa46\2\uaa4d\2\uaa62\2\uaa71\2\uaa73\2\uaa78\2\uaa7c\2\uaa7c"+
		"\2\uaa80\2\uaab1\2\uaab3\2\uaab3\2\uaab7\2\uaab8\2\uaabb\2\uaabf\2\uaac2"+
		"\2\uaac2\2\uaac4\2\uaac4\2\uaadd\2\uaade\2\uaae2\2\uaaec\2\uaaf4\2\uaaf4"+
		"\2\uab03\2\uab08\2\uab0b\2\uab10\2\uab13\2\uab18\2\uab22\2\uab28\2\uab2a"+
		"\2\uab30\2\uabc2\2\uabe4\2\uac02\2\ud7a5\2\ud7b2\2\ud7c8\2\ud7cd\2\ud7fd"+
		"\2\uf902\2\ufa6f\2\ufa72\2\ufadb\2\ufb1f\2\ufb1f\2\ufb21\2\ufb2a\2\ufb2c"+
		"\2\ufb38\2\ufb3a\2\ufb3e\2\ufb40\2\ufb40\2\ufb42\2\ufb43\2\ufb45\2\ufb46"+
		"\2\ufb48\2\ufbb3\2\ufbd5\2\ufd3f\2\ufd52\2\ufd91\2\ufd94\2\ufdc9\2\ufdf2"+
		"\2\ufdfd\2\ufe72\2\ufe76\2\ufe78\2\ufefe\2\uff68\2\uff71\2\uff73\2\uff9f"+
		"\2\uffa2\2\uffc0\2\uffc4\2\uffc9\2\uffcc\2\uffd1\2\uffd4\2\uffd9\2\uffdc"+
		"\2\uffde\2\2\3\r\3\17\3(\3*\3<\3>\3?\3A\3O\3R\3_\3\u0082\3\u00fc\3\u0282"+
		"\3\u029e\3\u02a2\3\u02d2\3\u0302\3\u0321\3\u032f\3\u0342\3\u0344\3\u034b"+
		"\3\u0352\3\u0377\3\u0382\3\u039f\3\u03a2\3\u03c5\3\u03ca\3\u03d1\3\u0452"+
		"\3\u049f\3\u0502\3\u0529\3\u0532\3\u0565\3\u0602\3\u0738\3\u0742\3\u0757"+
		"\3\u0762\3\u0769\3\u0802\3\u0807\3\u080a\3\u080a\3\u080c\3\u0837\3\u0839"+
		"\3\u083a\3\u083e\3\u083e\3\u0841\3\u0857\3\u0862\3\u0878\3\u0882\3\u08a0"+
		"\3\u08e2\3\u08f4\3\u08f6\3\u08f7\3\u0902\3\u0917\3\u0922\3\u093b\3\u0982"+
		"\3\u09b9\3\u09c0\3\u09c1\3\u0a02\3\u0a02\3\u0a12\3\u0a15\3\u0a17\3\u0a19"+
		"\3\u0a1b\3\u0a35\3\u0a62\3\u0a7e\3\u0a82\3\u0a9e\3\u0ac2\3\u0ac9\3\u0acb"+
		"\3\u0ae6\3\u0b02\3\u0b37\3\u0b42\3\u0b57\3\u0b62\3\u0b74\3\u0b82\3\u0b93"+
		"\3\u0c02\3\u0c4a\3\u1005\3\u1039\3\u1085\3\u10b1\3\u10d2\3\u10ea\3\u1105"+
		"\3\u1128\3\u1152\3\u1174\3\u1178\3\u1178\3\u1185\3\u11b4\3\u11c3\3\u11c6"+
		"\3\u11dc\3\u11dc\3\u11de\3\u11de\3\u1202\3\u1213\3\u1215\3\u122d\3\u1282"+
		"\3\u1288\3\u128a\3\u128a\3\u128c\3\u128f\3\u1291\3\u129f\3\u12a1\3\u12aa"+
		"\3\u12b2\3\u12e0\3\u1307\3\u130e\3\u1311\3\u1312\3\u1315\3\u132a\3\u132c"+
		"\3\u1332\3\u1334\3\u1335\3\u1337\3\u133b\3\u133f\3\u133f\3\u1352\3\u1352"+
		"\3\u135f\3\u1363\3\u1402\3\u1436\3\u1449\3\u144c\3\u1482\3\u14b1\3\u14c6"+
		"\3\u14c7\3\u14c9\3\u14c9\3\u1582\3\u15b0\3\u15da\3\u15dd\3\u1602\3\u1631"+
		"\3\u1646\3\u1646\3\u1682\3\u16ac\3\u1702\3\u171b\3\u1901\3\u1901\3\u1a02"+
		"\3\u1a02\3\u1a0d\3\u1a34\3\u1a3c\3\u1a3c\3\u1a52\3\u1a52\3\u1a5e\3\u1a85"+
		"\3\u1a88\3\u1a8b\3\u1ac2\3\u1afa\3\u1c02\3\u1c0a\3\u1c0c\3\u1c30\3\u1c42"+
		"\3\u1c42\3\u1c74\3\u1c91\3\u1d02\3\u1d08\3\u1d0a\3\u1d0b\3\u1d0d\3\u1d32"+
		"\3\u1d48\3\u1d48\3\u2002\3\u239b\3\u2482\3\u2545\3\u3002\3\u3430\3\u4402"+
		"\3\u4648\3\u6802\3\u6a3a\3\u6a42\3\u6a60\3\u6ad2\3\u6aef\3\u6b02\3\u6b31"+
		"\3\u6b65\3\u6b79\3\u6b7f\3\u6b91\3\u6f02\3\u6f46\3\u6f52\3\u6f52\3\u7002"+
		"\3\u87ee\3\u8802\3\u8af4\3\ub002\3\ub120\3\ub172\3\ub2fd\3\ubc02\3\ubc6c"+
		"\3\ubc72\3\ubc7e\3\ubc82\3\ubc8a\3\ubc92\3\ubc9b\3\ue802\3\ue8c6\3\uee02"+
		"\3\uee05\3\uee07\3\uee21\3\uee23\3\uee24\3\uee26\3\uee26\3\uee29\3\uee29"+
		"\3\uee2b\3\uee34\3\uee36\3\uee39\3\uee3b\3\uee3b\3\uee3d\3\uee3d\3\uee44"+
		"\3\uee44\3\uee49\3\uee49\3\uee4b\3\uee4b\3\uee4d\3\uee4d\3\uee4f\3\uee51"+
		"\3\uee53\3\uee54\3\uee56\3\uee56\3\uee59\3\uee59\3\uee5b\3\uee5b\3\uee5d"+
		"\3\uee5d\3\uee5f\3\uee5f\3\uee61\3\uee61\3\uee63\3\uee64\3\uee66\3\uee66"+
		"\3\uee69\3\uee6c\3\uee6e\3\uee74\3\uee76\3\uee79\3\uee7b\3\uee7e\3\uee80"+
		"\3\uee80\3\uee82\3\uee8b\3\uee8d\3\uee9d\3\ueea3\3\ueea5\3\ueea7\3\ueeab"+
		"\3\ueead\3\ueebd\3\2\4\ua6d8\4\ua702\4\ub736\4\ub742\4\ub81f\4\ub822\4"+
		"\ucea3\4\uceb2\4\uebe2\4\uf802\4\ufa1f\4\16\2\u16f0\2\u16f2\2\u2162\2"+
		"\u2184\2\u2187\2\u218a\2\u3009\2\u3009\2\u3023\2\u302b\2\u303a\2\u303c"+
		"\2\ua6e8\2\ua6f1\2\u0142\3\u0176\3\u0343\3\u0343\3\u034c\3\u034c\3\u03d3"+
		"\3\u03d7\3\u2402\3\u2470\3\u012f\2\u0302\2\u0371\2\u0485\2\u0489\2\u0593"+
		"\2\u05bf\2\u05c1\2\u05c1\2\u05c3\2\u05c4\2\u05c6\2\u05c7\2\u05c9\2\u05c9"+
		"\2\u0612\2\u061c\2\u064d\2\u0661\2\u0672\2\u0672\2\u06d8\2\u06de\2\u06e1"+
		"\2\u06e6\2\u06e9\2\u06ea\2\u06ec\2\u06ef\2\u0713\2\u0713\2\u0732\2\u074c"+
		"\2\u07a8\2\u07b2\2\u07ed\2\u07f5\2\u0818\2\u081b\2\u081d\2\u0825\2\u0827"+
		"\2\u0829\2\u082b\2\u082f\2\u085b\2\u085d\2\u08d6\2\u08e3\2\u08e5\2\u0904"+
		"\2\u093c\2\u093c\2\u093e\2\u093e\2\u0943\2\u094a\2\u094f\2\u094f\2\u0953"+
		"\2\u0959\2\u0964\2\u0965\2\u0983\2\u0983\2\u09be\2\u09be\2\u09c3\2\u09c6"+
		"\2\u09cf\2\u09cf\2\u09e4\2\u09e5\2\u0a03\2\u0a04\2\u0a3e\2\u0a3e\2\u0a43"+
		"\2\u0a44\2\u0a49\2\u0a4a\2\u0a4d\2\u0a4f\2\u0a53\2\u0a53\2\u0a72\2\u0a73"+
		"\2\u0a77\2\u0a77\2\u0a83\2\u0a84\2\u0abe\2\u0abe\2\u0ac3\2\u0ac7\2\u0ac9"+
		"\2\u0aca\2\u0acf\2\u0acf\2\u0ae4\2\u0ae5\2\u0afc\2\u0b01\2\u0b03\2\u0b03"+
		"\2\u0b3e\2\u0b3e\2\u0b41\2\u0b41\2\u0b43\2\u0b46\2\u0b4f\2\u0b4f\2\u0b58"+
		"\2\u0b58\2\u0b64\2\u0b65\2\u0b84\2\u0b84\2\u0bc2\2\u0bc2\2\u0bcf\2\u0bcf"+
		"\2\u0c02\2\u0c02\2\u0c40\2\u0c42\2\u0c48\2\u0c4a\2\u0c4c\2\u0c4f\2\u0c57"+
		"\2\u0c58\2\u0c64\2\u0c65\2\u0c83\2\u0c83\2\u0cbe\2\u0cbe\2\u0cc1\2\u0cc1"+
		"\2\u0cc8\2\u0cc8\2\u0cce\2\u0ccf\2\u0ce4\2\u0ce5\2\u0d02\2\u0d03\2\u0d3d"+
		"\2\u0d3e\2\u0d43\2\u0d46\2\u0d4f\2\u0d4f\2\u0d64\2\u0d65\2\u0dcc\2\u0dcc"+
		"\2\u0dd4\2\u0dd6\2\u0dd8\2\u0dd8\2\u0e33\2\u0e33\2\u0e36\2\u0e3c\2\u0e49"+
		"\2\u0e50\2\u0eb3\2\u0eb3\2\u0eb6\2\u0ebb\2\u0ebd\2\u0ebe\2\u0eca\2\u0ecf"+
		"\2\u0f1a\2\u0f1b\2\u0f37\2\u0f37\2\u0f39\2\u0f39\2\u0f3b\2\u0f3b\2\u0f73"+
		"\2\u0f80\2\u0f82\2\u0f86\2\u0f88\2\u0f89\2\u0f8f\2\u0f99\2\u0f9b\2\u0fbe"+
		"\2\u0fc8\2\u0fc8\2\u102f\2\u1032\2\u1034\2\u1039\2\u103b\2\u103c\2\u103f"+
		"\2\u1040\2\u105a\2\u105b\2\u1060\2\u1062\2\u1073\2\u1076\2\u1084\2\u1084"+
		"\2\u1087\2\u1088\2\u108f\2\u108f\2\u109f\2\u109f\2\u135f\2\u1361\2\u1714"+
		"\2\u1716\2\u1734\2\u1736\2\u1754\2\u1755\2\u1774\2\u1775\2\u17b6\2\u17b7"+
		"\2\u17b9\2\u17bf\2\u17c8\2\u17c8\2\u17cb\2\u17d5\2\u17df\2\u17df\2\u180d"+
		"\2\u180f\2\u1887\2\u1888\2\u18ab\2\u18ab\2\u1922\2\u1924\2\u1929\2\u192a"+
		"\2\u1934\2\u1934\2\u193b\2\u193d\2\u1a19\2\u1a1a\2\u1a1d\2\u1a1d\2\u1a58"+
		"\2\u1a58\2\u1a5a\2\u1a60\2\u1a62\2\u1a62\2\u1a64\2\u1a64\2\u1a67\2\u1a6e"+
		"\2\u1a75\2\u1a7e\2\u1a81\2\u1a81\2\u1ab2\2\u1abf\2\u1b02\2\u1b05\2\u1b36"+
		"\2\u1b36\2\u1b38\2\u1b3c\2\u1b3e\2\u1b3e\2\u1b44\2\u1b44\2\u1b6d\2\u1b75"+
		"\2\u1b82\2\u1b83\2\u1ba4\2\u1ba7\2\u1baa\2\u1bab\2\u1bad\2\u1baf\2\u1be8"+
		"\2\u1be8\2\u1bea\2\u1beb\2\u1bef\2\u1bef\2\u1bf1\2\u1bf3\2\u1c2e\2\u1c35"+
		"\2\u1c38\2\u1c39\2\u1cd2\2\u1cd4\2\u1cd6\2\u1ce2\2\u1ce4\2\u1cea\2\u1cef"+
		"\2\u1cef\2\u1cf6\2\u1cf6\2\u1cfa\2\u1cfb\2\u1dc2\2\u1dfb\2\u1dfd\2\u1e01"+
		"\2\u20d2\2\u20de\2\u20e3\2\u20e3\2\u20e7\2\u20f2\2\u2cf1\2\u2cf3\2\u2d81"+
		"\2\u2d81\2\u2de2\2\u2e01\2\u302c\2\u302f\2\u309b\2\u309c\2\ua671\2\ua671"+
		"\2\ua676\2\ua67f\2\ua6a0\2\ua6a1\2\ua6f2\2\ua6f3\2\ua804\2\ua804\2\ua808"+
		"\2\ua808\2\ua80d\2\ua80d\2\ua827\2\ua828\2\ua8c6\2\ua8c7\2\ua8e2\2\ua8f3"+
		"\2\ua928\2\ua92f\2\ua949\2\ua953\2\ua982\2\ua984\2\ua9b5\2\ua9b5\2\ua9b8"+
		"\2\ua9bb\2\ua9be\2\ua9be\2\ua9e7\2\ua9e7\2\uaa2b\2\uaa30\2\uaa33\2\uaa34"+
		"\2\uaa37\2\uaa38\2\uaa45\2\uaa45\2\uaa4e\2\uaa4e\2\uaa7e\2\uaa7e\2\uaab2"+
		"\2\uaab2\2\uaab4\2\uaab6\2\uaab9\2\uaaba\2\uaac0\2\uaac1\2\uaac3\2\uaac3"+
		"\2\uaaee\2\uaaef\2\uaaf8\2\uaaf8\2\uabe7\2\uabe7\2\uabea\2\uabea\2\uabef"+
		"\2\uabef\2\ufb20\2\ufb20\2\ufe02\2\ufe11\2\ufe22\2\ufe31\2\u01ff\3\u01ff"+
		"\3\u02e2\3\u02e2\3\u0378\3\u037c\3\u0a03\3\u0a05\3\u0a07\3\u0a08\3\u0a0e"+
		"\3\u0a11\3\u0a3a\3\u0a3c\3\u0a41\3\u0a41\3\u0ae7\3\u0ae8\3\u1003\3\u1003"+
		"\3\u103a\3\u1048\3\u1081\3\u1083\3\u10b5\3\u10b8\3\u10bb\3\u10bc\3\u1102"+
		"\3\u1104\3\u1129\3\u112d\3\u112f\3\u1136\3\u1175\3\u1175\3\u1182\3\u1183"+
		"\3\u11b8\3\u11c0\3\u11cc\3\u11ce\3\u1231\3\u1233\3\u1236\3\u1236\3\u1238"+
		"\3\u1239\3\u1240\3\u1240\3\u12e1\3\u12e1\3\u12e5\3\u12ec\3\u1302\3\u1303"+
		"\3\u133e\3\u133e\3\u1342\3\u1342\3\u1368\3\u136e\3\u1372\3\u1376\3\u143a"+
		"\3\u1441\3\u1444\3\u1446\3\u1448\3\u1448\3\u14b5\3\u14ba\3\u14bc\3\u14bc"+
		"\3\u14c1\3\u14c2\3\u14c4\3\u14c5\3\u15b4\3\u15b7\3\u15be\3\u15bf\3\u15c1"+
		"\3\u15c2\3\u15de\3\u15df\3\u1635\3\u163c\3\u163f\3\u163f\3\u1641\3\u1642"+
		"\3\u16ad\3\u16ad\3\u16af\3\u16af\3\u16b2\3\u16b7\3\u16b9\3\u16b9\3\u171f"+
		"\3\u1721\3\u1724\3\u1727\3\u1729\3\u172d\3\u1a03\3\u1a08\3\u1a0b\3\u1a0c"+
		"\3\u1a35\3\u1a3a\3\u1a3d\3\u1a40\3\u1a49\3\u1a49\3\u1a53\3\u1a58\3\u1a5b"+
		"\3\u1a5d\3\u1a8c\3\u1a98\3\u1a9a\3\u1a9b\3\u1c32\3\u1c38\3\u1c3a\3\u1c3f"+
		"\3\u1c41\3\u1c41\3\u1c94\3\u1ca9\3\u1cac\3\u1cb2\3\u1cb4\3\u1cb5\3\u1cb7"+
		"\3\u1cb8\3\u1d33\3\u1d38\3\u1d3c\3\u1d3c\3\u1d3e\3\u1d3f\3\u1d41\3\u1d47"+
		"\3\u1d49\3\u1d49\3\u6af2\3\u6af6\3\u6b32\3\u6b38\3\u6f91\3\u6f94\3\ubc9f"+
		"\3\ubca0\3\ud169\3\ud16b\3\ud17d\3\ud184\3\ud187\3\ud18d\3\ud1ac\3\ud1af"+
		"\3\ud244\3\ud246\3\uda02\3\uda38\3\uda3d\3\uda6e\3\uda77\3\uda77\3\uda86"+
		"\3\uda86\3\uda9d\3\udaa1\3\udaa3\3\udab1\3\ue002\3\ue008\3\ue00a\3\ue01a"+
		"\3\ue01d\3\ue023\3\ue025\3\ue026\3\ue028\3\ue02c\3\ue8d2\3\ue8d8\3\ue946"+
		"\3\ue94c\3\u0102\20\u01f1\20\u00a2\2\u0905\2\u0905\2\u093d\2\u093d\2\u0940"+
		"\2\u0942\2\u094b\2\u094e\2\u0950\2\u0951\2\u0984\2\u0985\2\u09c0\2\u09c2"+
		"\2\u09c9\2\u09ca\2\u09cd\2\u09ce\2\u09d9\2\u09d9\2\u0a05\2\u0a05\2\u0a40"+
		"\2\u0a42\2\u0a85\2\u0a85\2\u0ac0\2\u0ac2\2\u0acb\2\u0acb\2\u0acd\2\u0ace"+
		"\2\u0b04\2\u0b05\2\u0b40\2\u0b40\2\u0b42\2\u0b42\2\u0b49\2\u0b4a\2\u0b4d"+
		"\2\u0b4e\2\u0b59\2\u0b59\2\u0bc0\2\u0bc1\2\u0bc3\2\u0bc4\2\u0bc8\2\u0bca"+
		"\2\u0bcc\2\u0bce\2\u0bd9\2\u0bd9\2\u0c03\2\u0c05\2\u0c43\2\u0c46\2\u0c84"+
		"\2\u0c85\2\u0cc0\2\u0cc0\2\u0cc2\2\u0cc6\2\u0cc9\2\u0cca\2\u0ccc\2\u0ccd"+
		"\2\u0cd7\2\u0cd8\2\u0d04\2\u0d05\2\u0d40\2\u0d42\2\u0d48\2\u0d4a\2\u0d4c"+
		"\2\u0d4e\2\u0d59\2\u0d59\2\u0d84\2\u0d85\2\u0dd1\2\u0dd3\2\u0dda\2\u0de1"+
		"\2\u0df4\2\u0df5\2\u0f40\2\u0f41\2\u0f81\2\u0f81\2\u102d\2\u102e\2\u1033"+
		"\2\u1033\2\u103a\2\u103a\2\u103d\2\u103e\2\u1058\2\u1059\2\u1064\2\u1066"+
		"\2\u1069\2\u106f\2\u1085\2\u1086\2\u1089\2\u108e\2\u1091\2\u1091\2\u109c"+
		"\2\u109e\2\u17b8\2\u17b8\2\u17c0\2\u17c7\2\u17c9\2\u17ca\2\u1925\2\u1928"+
		"\2\u192b\2\u192d\2\u1932\2\u1933\2\u1935\2\u193a\2\u1a1b\2\u1a1c\2\u1a57"+
		"\2\u1a57\2\u1a59\2\u1a59\2\u1a63\2\u1a63\2\u1a65\2\u1a66\2\u1a6f\2\u1a74"+
		"\2\u1b06\2\u1b06\2\u1b37\2\u1b37\2\u1b3d\2\u1b3d\2\u1b3f\2\u1b43\2\u1b45"+
		"\2\u1b46\2\u1b84\2\u1b84\2\u1ba3\2\u1ba3\2\u1ba8\2\u1ba9\2\u1bac\2\u1bac"+
		"\2\u1be9\2\u1be9\2\u1bec\2\u1bee\2\u1bf0\2\u1bf0\2\u1bf4\2\u1bf5\2\u1c26"+
		"\2\u1c2d\2\u1c36\2\u1c37\2\u1ce3\2\u1ce3\2\u1cf4\2\u1cf5\2\u1cf9\2\u1cf9"+
		"\2\u3030\2\u3031\2\ua825\2\ua826\2\ua829\2\ua829\2\ua882\2\ua883\2\ua8b6"+
		"\2\ua8c5\2\ua954\2\ua955\2\ua985\2\ua985\2\ua9b6\2\ua9b7\2\ua9bc\2\ua9bd"+
		"\2\ua9bf\2\ua9c2\2\uaa31\2\uaa32\2\uaa35\2\uaa36\2\uaa4f\2\uaa4f\2\uaa7d"+
		"\2\uaa7d\2\uaa7f\2\uaa7f\2\uaaed\2\uaaed\2\uaaf0\2\uaaf1\2\uaaf7\2\uaaf7"+
		"\2\uabe5\2\uabe6\2\uabe8\2\uabe9\2\uabeb\2\uabec\2\uabee\2\uabee\2\u1002"+
		"\3\u1002\3\u1004\3\u1004\3\u1084\3\u1084\3\u10b2\3\u10b4\3\u10b9\3\u10ba"+
		"\3\u112e\3\u112e\3\u1184\3\u1184\3\u11b5\3\u11b7\3\u11c1\3\u11c2\3\u122e"+
		"\3\u1230\3\u1234\3\u1235\3\u1237\3\u1237\3\u12e2\3\u12e4\3\u1304\3\u1305"+
		"\3\u1340\3\u1341\3\u1343\3\u1346\3\u1349\3\u134a\3\u134d\3\u134f\3\u1359"+
		"\3\u1359\3\u1364\3\u1365\3\u1437\3\u1439\3\u1442\3\u1443\3\u1447\3\u1447"+
		"\3\u14b2\3\u14b4\3\u14bb\3\u14bb\3\u14bd\3\u14c0\3\u14c3\3\u14c3\3\u15b1"+
		"\3\u15b3\3\u15ba\3\u15bd\3\u15c0\3\u15c0\3\u1632\3\u1634\3\u163d\3\u163e"+
		"\3\u1640\3\u1640\3\u16ae\3\u16ae\3\u16b0\3\u16b1\3\u16b8\3\u16b8\3\u1722"+
		"\3\u1723\3\u1728\3\u1728\3\u1a09\3\u1a0a\3\u1a3b\3\u1a3b\3\u1a59\3\u1a5a"+
		"\3\u1a99\3\u1a99\3\u1c31\3\u1c31\3\u1c40\3\u1c40\3\u1cab\3\u1cab\3\u1cb3"+
		"\3\u1cb3\3\u1cb6\3\u1cb6\3\u6f53\3\u6f80\3\ud167\3\ud168\3\ud16f\3\ud174"+
		"\39\2\62\2;\2\u0662\2\u066b\2\u06f2\2\u06fb\2\u07c2\2\u07cb\2\u0968\2"+
		"\u0971\2\u09e8\2\u09f1\2\u0a68\2\u0a71\2\u0ae8\2\u0af1\2\u0b68\2\u0b71"+
		"\2\u0be8\2\u0bf1\2\u0c68\2\u0c71\2\u0ce8\2\u0cf1\2\u0d68\2\u0d71\2\u0de8"+
		"\2\u0df1\2\u0e52\2\u0e5b\2\u0ed2\2\u0edb\2\u0f22\2\u0f2b\2\u1042\2\u104b"+
		"\2\u1092\2\u109b\2\u17e2\2\u17eb\2\u1812\2\u181b\2\u1948\2\u1951\2\u19d2"+
		"\2\u19db\2\u1a82\2\u1a8b\2\u1a92\2\u1a9b\2\u1b52\2\u1b5b\2\u1bb2\2\u1bbb"+
		"\2\u1c42\2\u1c4b\2\u1c52\2\u1c5b\2\ua622\2\ua62b\2\ua8d2\2\ua8db\2\ua902"+
		"\2\ua90b\2\ua9d2\2\ua9db\2\ua9f2\2\ua9fb\2\uaa52\2\uaa5b\2\uabf2\2\uabfb"+
		"\2\uff12\2\uff1b\2\u04a2\3\u04ab\3\u1068\3\u1071\3\u10f2\3\u10fb\3\u1138"+
		"\3\u1141\3\u11d2\3\u11db\3\u12f2\3\u12fb\3\u1452\3\u145b\3\u14d2\3\u14db"+
		"\3\u1652\3\u165b\3\u16c2\3\u16cb\3\u1732\3\u173b\3\u18e2\3\u18eb\3\u1c52"+
		"\3\u1c5b\3\u1d52\3\u1d5b\3\u6a62\3\u6a6b\3\u6b52\3\u6b5b\3\ud7d0\3\ud801"+
		"\3\ue952\3\ue95b\3\u028e\2\"\2\u0080\2\u00a2\2\u00ae\2\u00b0\2\u0379\2"+
		"\u037c\2\u0381\2\u0386\2\u038c\2\u038e\2\u038e\2\u0390\2\u03a3\2\u03a5"+
		"\2\u0531\2\u0533\2\u0558\2\u055b\2\u0561\2\u0563\2\u0589\2\u058b\2\u058c"+
		"\2\u058f\2\u0591\2\u0593\2\u05c9\2\u05d2\2\u05ec\2\u05f2\2\u05f6\2\u0608"+
		"\2\u061d\2\u0620\2\u06de\2\u06e0\2\u070f\2\u0712\2\u074c\2\u074f\2\u07b3"+
		"\2\u07c2\2\u07fc\2\u0802\2\u082f\2\u0832\2\u0840\2\u0842\2\u085d\2\u0860"+
		"\2\u0860\2\u0862\2\u086c\2\u08a2\2\u08b6\2\u08b8\2\u08bf\2\u08d6\2\u08e3"+
		"\2\u08e5\2\u0985\2\u0987\2\u098e\2\u0991\2\u0992\2\u0995\2\u09aa\2\u09ac"+
		"\2\u09b2\2\u09b4\2\u09b4\2\u09b8\2\u09bb\2\u09be\2\u09c6\2\u09c9\2\u09ca"+
		"\2\u09cd\2\u09d0\2\u09d9\2\u09d9\2\u09de\2\u09df\2\u09e1\2\u09e5\2\u09e8"+
		"\2\u09ff\2\u0a03\2\u0a05\2\u0a07\2\u0a0c\2\u0a11\2\u0a12\2\u0a15\2\u0a2a"+
		"\2\u0a2c\2\u0a32\2\u0a34\2\u0a35\2\u0a37\2\u0a38\2\u0a3a\2\u0a3b\2\u0a3e"+
		"\2\u0a3e\2\u0a40\2\u0a44\2\u0a49\2\u0a4a\2\u0a4d\2\u0a4f\2\u0a53\2\u0a53"+
		"\2\u0a5b\2\u0a5e\2\u0a60\2\u0a60\2\u0a68\2\u0a77\2\u0a83\2\u0a85\2\u0a87"+
		"\2\u0a8f\2\u0a91\2\u0a93\2\u0a95\2\u0aaa\2\u0aac\2\u0ab2\2\u0ab4\2\u0ab5"+
		"\2\u0ab7\2\u0abb\2\u0abe\2\u0ac7\2\u0ac9\2\u0acb\2\u0acd\2\u0acf\2\u0ad2"+
		"\2\u0ad2\2\u0ae2\2\u0ae5\2\u0ae8\2\u0af3\2\u0afb\2\u0b01\2\u0b03\2\u0b05"+
		"\2\u0b07\2\u0b0e\2\u0b11\2\u0b12\2\u0b15\2\u0b2a\2\u0b2c\2\u0b32\2\u0b34"+
		"\2\u0b35\2\u0b37\2\u0b3b\2\u0b3e\2\u0b46\2\u0b49\2\u0b4a\2\u0b4d\2\u0b4f"+
		"\2\u0b58\2\u0b59\2\u0b5e\2\u0b5f\2\u0b61\2\u0b65\2\u0b68\2\u0b79\2\u0b84"+
		"\2\u0b85\2\u0b87\2\u0b8c\2\u0b90\2\u0b92\2\u0b94\2\u0b97\2\u0b9b\2\u0b9c"+
		"\2\u0b9e\2\u0b9e\2\u0ba0\2\u0ba1\2\u0ba5\2\u0ba6\2\u0baa\2\u0bac\2\u0bb0"+
		"\2\u0bbb\2\u0bc0\2\u0bc4\2\u0bc8\2\u0bca\2\u0bcc\2\u0bcf\2\u0bd2\2\u0bd2"+
		"\2\u0bd9\2\u0bd9\2\u0be8\2\u0bfc\2\u0c02\2\u0c05\2\u0c07\2\u0c0e\2\u0c10"+
		"\2\u0c12\2\u0c14\2\u0c2a\2\u0c2c\2\u0c3b\2\u0c3f\2\u0c46\2\u0c48\2\u0c4a"+
		"\2\u0c4c\2\u0c4f\2\u0c57\2\u0c58\2\u0c5a\2\u0c5c\2\u0c62\2\u0c65\2\u0c68"+
		"\2\u0c71\2\u0c7a\2\u0c85\2\u0c87\2\u0c8e\2\u0c90\2\u0c92\2\u0c94\2\u0caa"+
		"\2\u0cac\2\u0cb5\2\u0cb7\2\u0cbb\2\u0cbe\2\u0cc6\2\u0cc8\2\u0cca\2\u0ccc"+
		"\2\u0ccf\2\u0cd7\2\u0cd8\2\u0ce0\2\u0ce0\2\u0ce2\2\u0ce5\2\u0ce8\2\u0cf1"+
		"\2\u0cf3\2\u0cf4\2\u0d02\2\u0d05\2\u0d07\2\u0d0e\2\u0d10\2\u0d12\2\u0d14"+
		"\2\u0d46\2\u0d48\2\u0d4a\2\u0d4c\2\u0d51\2\u0d56\2\u0d65\2\u0d68\2\u0d81"+
		"\2\u0d84\2\u0d85\2\u0d87\2\u0d98\2\u0d9c\2\u0db3\2\u0db5\2\u0dbd\2\u0dbf"+
		"\2\u0dbf\2\u0dc2\2\u0dc8\2\u0dcc\2\u0dcc\2\u0dd1\2\u0dd6\2\u0dd8\2\u0dd8"+
		"\2\u0dda\2\u0de1\2\u0de8\2\u0df1\2\u0df4\2\u0df6\2\u0e03\2\u0e3c\2\u0e41"+
		"\2\u0e5d\2\u0e83\2\u0e84\2\u0e86\2\u0e86\2\u0e89\2\u0e8a\2\u0e8c\2\u0e8c"+
		"\2\u0e8f\2\u0e8f\2\u0e96\2\u0e99\2\u0e9b\2\u0ea1\2\u0ea3\2\u0ea5\2\u0ea7"+
		"\2\u0ea7\2\u0ea9\2\u0ea9\2\u0eac\2\u0ead\2\u0eaf\2\u0ebb\2\u0ebd\2\u0ebf"+
		"\2\u0ec2\2\u0ec6\2\u0ec8\2\u0ec8\2\u0eca\2\u0ecf\2\u0ed2\2\u0edb\2\u0ede"+
		"\2\u0ee1\2\u0f02\2\u0f49\2\u0f4b\2\u0f6e\2\u0f73\2\u0f99\2\u0f9b\2\u0fbe"+
		"\2\u0fc0\2\u0fce\2\u0fd0\2\u0fdc\2\u1002\2\u10c7\2\u10c9\2\u10c9\2\u10cf"+
		"\2\u10cf\2\u10d2\2\u124a\2\u124c\2\u124f\2\u1252\2\u1258\2\u125a\2\u125a"+
		"\2\u125c\2\u125f\2\u1262\2\u128a\2\u128c\2\u128f\2\u1292\2\u12b2\2\u12b4"+
		"\2\u12b7\2\u12ba\2\u12c0\2\u12c2\2\u12c2\2\u12c4\2\u12c7\2\u12ca\2\u12d8"+
		"\2\u12da\2\u1312\2\u1314\2\u1317\2\u131a\2\u135c\2\u135f\2\u137e\2\u1382"+
		"\2\u139b\2\u13a2\2\u13f7\2\u13fa\2\u13ff\2\u1402\2\u169e\2\u16a2\2\u16fa"+
		"\2\u1702\2\u170e\2\u1710\2\u1716\2\u1722\2\u1738\2\u1742\2\u1755\2\u1762"+
		"\2\u176e\2\u1770\2\u1772\2\u1774\2\u1775\2\u1782\2\u17df\2\u17e2\2\u17eb"+
		"\2\u17f2\2\u17fb\2\u1802\2\u180f\2\u1812\2\u181b\2\u1822\2\u1879\2\u1882"+
		"\2\u18ac\2\u18b2\2\u18f7\2\u1902\2\u1920\2\u1922\2\u192d\2\u1932\2\u193d"+
		"\2\u1942\2\u1942\2\u1946\2\u196f\2\u1972\2\u1976\2\u1982\2\u19ad\2\u19b2"+
		"\2\u19cb\2\u19d2\2\u19dc\2\u19e0\2\u1a1d\2\u1a20\2\u1a60\2\u1a62\2\u1a7e"+
		"\2\u1a81\2\u1a8b\2\u1a92\2\u1a9b\2\u1aa2\2\u1aaf\2\u1ab2\2\u1ac0\2\u1b02"+
		"\2\u1b4d\2\u1b52\2\u1b7e\2\u1b82\2\u1bf5\2\u1bfe\2\u1c39\2\u1c3d\2\u1c4b"+
		"\2\u1c4f\2\u1c8a\2\u1cc2\2\u1cc9\2\u1cd2\2\u1cfb\2\u1d02\2\u1dfb\2\u1dfd"+
		"\2\u1f17\2\u1f1a\2\u1f1f\2\u1f22\2\u1f47\2\u1f4a\2\u1f4f\2\u1f52\2\u1f59"+
		"\2\u1f5b\2\u1f5b\2\u1f5d\2\u1f5d\2\u1f5f\2\u1f5f\2\u1f61\2\u1f7f\2\u1f82"+
		"\2\u1fb6\2\u1fb8\2\u1fc6\2\u1fc8\2\u1fd5\2\u1fd8\2\u1fdd\2\u1fdf\2\u1ff1"+
		"\2\u1ff4\2\u1ff6\2\u1ff8\2\u2000\2\u2002\2\u200c\2\u2012\2\u2029\2\u2031"+
		"\2\u2061\2\u2072\2\u2073\2\u2076\2\u2090\2\u2092\2\u209e\2\u20a2\2\u20c1"+
		"\2\u20d2\2\u20f2\2\u2102\2\u218d\2\u2192\2\u2428\2\u2442\2\u244c\2\u2462"+
		"\2\u2b75\2\u2b78\2\u2b97\2\u2b9a\2\u2bbb\2\u2bbf\2\u2bca\2\u2bcc\2\u2bd4"+
		"\2\u2bee\2\u2bf1\2\u2c02\2\u2c30\2\u2c32\2\u2c60\2\u2c62\2\u2cf5\2\u2cfb"+
		"\2\u2d27\2\u2d29\2\u2d29\2\u2d2f\2\u2d2f\2\u2d32\2\u2d69\2\u2d71\2\u2d72"+
		"\2\u2d81\2\u2d98\2\u2da2\2\u2da8\2\u2daa\2\u2db0\2\u2db2\2\u2db8\2\u2dba"+
		"\2\u2dc0\2\u2dc2\2\u2dc8\2\u2dca\2\u2dd0\2\u2dd2\2\u2dd8\2\u2dda\2\u2de0"+
		"\2\u2de2\2\u2e4b\2\u2e82\2\u2e9b\2\u2e9d\2\u2ef5\2\u2f02\2\u2fd7\2\u2ff2"+
		"\2\u2ffd\2\u3002\2\u3041\2\u3043\2\u3098\2\u309b\2\u3101\2\u3107\2\u3130"+
		"\2\u3133\2\u3190\2\u3192\2\u31bc\2\u31c2\2\u31e5\2\u31f2\2\u3220\2\u3222"+
		"\2\u3300\2\u3302\2\u4db7\2\u4dc2\2\u9fec\2\ua002\2\ua48e\2\ua492\2\ua4c8"+
		"\2\ua4d2\2\ua62d\2\ua642\2\ua6f9\2\ua702\2\ua7b0\2\ua7b2\2\ua7b9\2\ua7f9"+
		"\2\ua82d\2\ua832\2\ua83b\2\ua842\2\ua879\2\ua882\2\ua8c7\2\ua8d0\2\ua8db"+
		"\2\ua8e2\2\ua8ff\2\ua902\2\ua955\2\ua961\2\ua97e\2\ua982\2\ua9cf\2\ua9d1"+
		"\2\ua9db\2\ua9e0\2\uaa00\2\uaa02\2\uaa38\2\uaa42\2\uaa4f\2\uaa52\2\uaa5b"+
		"\2\uaa5e\2\uaac4\2\uaadd\2\uaaf8\2\uab03\2\uab08\2\uab0b\2\uab10\2\uab13"+
		"\2\uab18\2\uab22\2\uab28\2\uab2a\2\uab30\2\uab32\2\uab67\2\uab72\2\uabef"+
		"\2\uabf2\2\uabfb\2\uac02\2\ud7a5\2\ud7b2\2\ud7c8\2\ud7cd\2\ud7fd\2\uf902"+
		"\2\ufa6f\2\ufa72\2\ufadb\2\ufb02\2\ufb08\2\ufb15\2\ufb19\2\ufb1f\2\ufb38"+
		"\2\ufb3a\2\ufb3e\2\ufb40\2\ufb40\2\ufb42\2\ufb43\2\ufb45\2\ufb46\2\ufb48"+
		"\2\ufbc3\2\ufbd5\2\ufd41\2\ufd52\2\ufd91\2\ufd94\2\ufdc9\2\ufdf2\2\ufdff"+
		"\2\ufe02\2\ufe1b\2\ufe22\2\ufe54\2\ufe56\2\ufe68\2\ufe6a\2\ufe6d\2\ufe72"+
		"\2\ufe76\2\ufe78\2\ufefe\2\uff03\2\uffc0\2\uffc4\2\uffc9\2\uffcc\2\uffd1"+
		"\2\uffd4\2\uffd9\2\uffdc\2\uffde\2\uffe2\2\uffe8\2\uffea\2\ufff0\2\ufffe"+
		"\2\uffff\2\2\3\r\3\17\3(\3*\3<\3>\3?\3A\3O\3R\3_\3\u0082\3\u00fc\3\u0102"+
		"\3\u0104\3\u0109\3\u0135\3\u0139\3\u0190\3\u0192\3\u019d\3\u01a2\3\u01a2"+
		"\3\u01d2\3\u01ff\3\u0282\3\u029e\3\u02a2\3\u02d2\3\u02e2\3\u02fd\3\u0302"+
		"\3\u0325\3\u032f\3\u034c\3\u0352\3\u037c\3\u0382\3\u039f\3\u03a1\3\u03c5"+
		"\3\u03ca\3\u03d7\3\u0402\3\u049f\3\u04a2\3\u04ab\3\u04b2\3\u04d5\3\u04da"+
		"\3\u04fd\3\u0502\3\u0529\3\u0532\3\u0565\3\u0571\3\u0571\3\u0602\3\u0738"+
		"\3\u0742\3\u0757\3\u0762\3\u0769\3\u0802\3\u0807\3\u080a\3\u080a\3\u080c"+
		"\3\u0837\3\u0839\3\u083a\3\u083e\3\u083e\3\u0841\3\u0857\3\u0859\3\u08a0"+
		"\3\u08a9\3\u08b1\3\u08e2\3\u08f4\3\u08f6\3\u08f7\3\u08fd\3\u091d\3\u0921"+
		"\3\u093b\3\u0941\3\u0941\3\u0982\3\u09b9\3\u09be\3\u09d1\3\u09d4\3\u0a05"+
		"\3\u0a07\3\u0a08\3\u0a0e\3\u0a15\3\u0a17\3\u0a19\3\u0a1b\3\u0a35\3\u0a3a"+
		"\3\u0a3c\3\u0a41\3\u0a49\3\u0a52\3\u0a5a\3\u0a62\3\u0aa1\3\u0ac2\3\u0ae8"+
		"\3\u0aed\3\u0af8\3\u0b02\3\u0b37\3\u0b3b\3\u0b57\3\u0b5a\3\u0b74\3\u0b7a"+
		"\3\u0b93\3\u0b9b\3\u0b9e\3\u0bab\3\u0bb1\3\u0c02\3\u0c4a\3\u0c82\3\u0cb4"+
		"\3\u0cc2\3\u0cf4\3\u0cfc\3\u0d01\3\u0e62\3\u0e80\3\u1002\3\u104f\3\u1054"+
		"\3\u1071\3\u1081\3\u10be\3\u10c0\3\u10c3\3\u10d2\3\u10ea\3\u10f2\3\u10fb"+
		"\3\u1102\3\u1136\3\u1138\3\u1145\3\u1152\3\u1178\3\u1182\3\u11cf\3\u11d2"+
		"\3\u11e1\3\u11e3\3\u11f6\3\u1202\3\u1213\3\u1215\3\u1240\3\u1282\3\u1288"+
		"\3\u128a\3\u128a\3\u128c\3\u128f\3\u1291\3\u129f\3\u12a1\3\u12ab\3\u12b2"+
		"\3\u12ec\3\u12f2\3\u12fb\3\u1302\3\u1305\3\u1307\3\u130e\3\u1311\3\u1312"+
		"\3\u1315\3\u132a\3\u132c\3\u1332\3\u1334\3\u1335\3\u1337\3\u133b\3\u133e"+
		"\3\u1346\3\u1349\3\u134a\3\u134d\3\u134f\3\u1352\3\u1352\3\u1359\3\u1359"+
		"\3\u135f\3\u1365\3\u1368\3\u136e\3\u1372\3\u1376\3\u1402\3\u145b\3\u145d"+
		"\3\u145d\3\u145f\3\u145f\3\u1482\3\u14c9\3\u14d2\3\u14db\3\u1582\3\u15b7"+
		"\3\u15ba\3\u15df\3\u1602\3\u1646\3\u1652\3\u165b\3\u1662\3\u166e\3\u1682"+
		"\3\u16b9\3\u16c2\3\u16cb\3\u1702\3\u171b\3\u171f\3\u172d\3\u1732\3\u1741"+
		"\3\u18a2\3\u18f4\3\u1901\3\u1901\3\u1a02\3\u1a49\3\u1a52\3\u1a85\3\u1a88"+
		"\3\u1a9e\3\u1aa0\3\u1aa4\3\u1ac2\3\u1afa\3\u1c02\3\u1c0a\3\u1c0c\3\u1c38"+
		"\3\u1c3a\3\u1c47\3\u1c52\3\u1c6e\3\u1c72\3\u1c91\3\u1c94\3\u1ca9\3\u1cab"+
		"\3\u1cb8\3\u1d02\3\u1d08\3\u1d0a\3\u1d0b\3\u1d0d\3\u1d38\3\u1d3c\3\u1d3c"+
		"\3\u1d3e\3\u1d3f\3\u1d41\3\u1d49\3\u1d52\3\u1d5b\3\u2002\3\u239b\3\u2402"+
		"\3\u2470\3\u2472\3\u2476\3\u2482\3\u2545\3\u3002\3\u3430\3\u4402\3\u4648"+
		"\3\u6802\3\u6a3a\3\u6a42\3\u6a60\3\u6a62\3\u6a6b\3\u6a70\3\u6a71\3\u6ad2"+
		"\3\u6aef\3\u6af2\3\u6af7\3\u6b02\3\u6b47\3\u6b52\3\u6b5b\3\u6b5d\3\u6b63"+
		"\3\u6b65\3\u6b79\3\u6b7f\3\u6b91\3\u6f02\3\u6f46\3\u6f52\3\u6f80\3\u6f91"+
		"\3\u6fa1\3\u6fe2\3\u6fe3\3\u7002\3\u87ee\3\u8802\3\u8af4\3\ub002\3\ub120"+
		"\3\ub172\3\ub2fd\3\ubc02\3\ubc6c\3\ubc72\3\ubc7e\3\ubc82\3\ubc8a\3\ubc92"+
		"\3\ubc9b\3\ubc9e\3\ubca1\3\ud002\3\ud0f7\3\ud102\3\ud128\3\ud12b\3\ud174"+
		"\3\ud17d\3\ud1ea\3\ud202\3\ud247\3\ud302\3\ud358\3\ud362\3\ud373\3\ud402"+
		"\3\ud456\3\ud458\3\ud49e\3\ud4a0\3\ud4a1\3\ud4a4\3\ud4a4\3\ud4a7\3\ud4a8"+
		"\3\ud4ab\3\ud4ae\3\ud4b0\3\ud4bb\3\ud4bd\3\ud4bd\3\ud4bf\3\ud4c5\3\ud4c7"+
		"\3\ud507\3\ud509\3\ud50c\3\ud50f\3\ud516\3\ud518\3\ud51e\3\ud520\3\ud53b"+
		"\3\ud53d\3\ud540\3\ud542\3\ud546\3\ud548\3\ud548\3\ud54c\3\ud552\3\ud554"+
		"\3\ud6a7\3\ud6aa\3\ud7cd\3\ud7d0\3\uda8d\3\uda9d\3\udaa1\3\udaa3\3\udab1"+
		"\3\ue002\3\ue008\3\ue00a\3\ue01a\3\ue01d\3\ue023\3\ue025\3\ue026\3\ue028"+
		"\3\ue02c\3\ue802\3\ue8c6\3\ue8c9\3\ue8d8\3\ue902\3\ue94c\3\ue952\3\ue95b"+
		"\3\ue960\3\ue961\3\uee02\3\uee05\3\uee07\3\uee21\3\uee23\3\uee24\3\uee26"+
		"\3\uee26\3\uee29\3\uee29\3\uee2b\3\uee34\3\uee36\3\uee39\3\uee3b\3\uee3b"+
		"\3\uee3d\3\uee3d\3\uee44\3\uee44\3\uee49\3\uee49\3\uee4b\3\uee4b\3\uee4d"+
		"\3\uee4d\3\uee4f\3\uee51\3\uee53\3\uee54\3\uee56\3\uee56\3\uee59\3\uee59"+
		"\3\uee5b\3\uee5b\3\uee5d\3\uee5d\3\uee5f\3\uee5f\3\uee61\3\uee61\3\uee63"+
		"\3\uee64\3\uee66\3\uee66\3\uee69\3\uee6c\3\uee6e\3\uee74\3\uee76\3\uee79"+
		"\3\uee7b\3\uee7e\3\uee80\3\uee80\3\uee82\3\uee8b\3\uee8d\3\uee9d\3\ueea3"+
		"\3\ueea5\3\ueea7\3\ueeab\3\ueead\3\ueebd\3\ueef2\3\ueef3\3\uf002\3\uf02d"+
		"\3\uf032\3\uf095\3\uf0a2\3\uf0b0\3\uf0b3\3\uf0c1\3\uf0c3\3\uf0d1\3\uf0d3"+
		"\3\uf0f7\3\uf102\3\uf10e\3\uf112\3\uf130\3\uf132\3\uf16d\3\uf172\3\uf1ae"+
		"\3\uf1e8\3\uf204\3\uf212\3\uf23d\3\uf242\3\uf24a\3\uf252\3\uf253\3\uf262"+
		"\3\uf267\3\uf302\3\uf6d6\3\uf6e2\3\uf6ee\3\uf6f2\3\uf6fa\3\uf702\3\uf775"+
		"\3\uf782\3\uf7d6\3\uf802\3\uf80d\3\uf812\3\uf849\3\uf852\3\uf85b\3\uf862"+
		"\3\uf889\3\uf892\3\uf8af\3\uf902\3\uf90d\3\uf912\3\uf940\3\uf942\3\uf94e"+
		"\3\uf952\3\uf96d\3\uf982\3\uf999\3\uf9c2\3\uf9c2\3\uf9d2\3\uf9e8\3\2\4"+
		"\ua6d8\4\ua702\4\ub736\4\ub742\4\ub81f\4\ub822\4\ucea3\4\uceb2\4\uebe2"+
		"\4\uf802\4\ufa1f\4\u0102\20\u01f1\20\30\2\2\2\"\2\u0081\2\u00a2\2\u00af"+
		"\2\u00af\2\u0602\2\u0607\2\u061e\2\u061e\2\u06df\2\u06df\2\u0711\2\u0711"+
		"\2\u08e4\2\u08e4\2\u1682\2\u1682\2\u1810\2\u1810\2\u2002\2\u2011\2\u202a"+
		"\2\u2031\2\u2061\2\u2066\2\u2068\2\u2071\2\u3002\2\u3002\2\uff01\2\uff01"+
		"\2\ufffb\2\ufffd\2\u10bf\3\u10bf\3\ubca2\3\ubca5\3\ud175\3\ud17c\3\3\20"+
		"\3\20\"\20\u0081\20\u0442\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2"+
		"\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2"+
		"\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3"+
		"\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2"+
		"\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67"+
		"\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2"+
		"\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2"+
		"\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]"+
		"\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2"+
		"\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2"+
		"\2w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\2}\3\2\2\2\2\177\3\2\2\2\2\u0081\3\2"+
		"\2\2\2\u0083\3\2\2\2\2\u0085\3\2\2\2\2\u0087\3\2\2\2\2\u0089\3\2\2\2\2"+
		"\u008b\3\2\2\2\2\u008d\3\2\2\2\2\u008f\3\2\2\2\2\u0091\3\2\2\2\2\u0093"+
		"\3\2\2\2\2\u0095\3\2\2\2\2\u0097\3\2\2\2\2\u0099\3\2\2\2\2\u009b\3\2\2"+
		"\2\2\u009d\3\2\2\2\2\u009f\3\2\2\2\2\u00d5\3\2\2\2\2\u00d7\3\2\2\2\2\u00d9"+
		"\3\2\2\2\2\u00db\3\2\2\2\2\u00dd\3\2\2\2\2\u00df\3\2\2\2\2\u00e1\3\2\2"+
		"\2\2\u00e3\3\2\2\2\2\u00e5\3\2\2\2\2\u00e7\3\2\2\2\2\u00e9\3\2\2\2\2\u00eb"+
		"\3\2\2\2\2\u00ed\3\2\2\2\2\u00ef\3\2\2\2\2\u00f1\3\2\2\2\2\u00f3\3\2\2"+
		"\2\2\u00f5\3\2\2\2\2\u00f7\3\2\2\2\2\u00f9\3\2\2\2\2\u00fb\3\2\2\2\2\u00fd"+
		"\3\2\2\2\2\u00ff\3\2\2\2\2\u0101\3\2\2\2\2\u0103\3\2\2\2\2\u0105\3\2\2"+
		"\2\2\u0107\3\2\2\2\2\u0109\3\2\2\2\2\u010b\3\2\2\2\2\u010d\3\2\2\2\2\u010f"+
		"\3\2\2\2\2\u0111\3\2\2\2\2\u012b\3\2\2\2\2\u013f\3\2\2\2\2\u0141\3\2\2"+
		"\2\2\u0147\3\2\2\2\2\u0149\3\2\2\2\3\u014b\3\2\2\2\5\u0151\3\2\2\2\7\u0155"+
		"\3\2\2\2\t\u015e\3\2\2\2\13\u0165\3\2\2\2\r\u016c\3\2\2\2\17\u0174\3\2"+
		"\2\2\21\u0178\3\2\2\2\23\u017c\3\2\2\2\25\u0182\3\2\2\2\27\u0185\3\2\2"+
		"\2\31\u018b\3\2\2\2\33\u0190\3\2\2\2\35\u0195\3\2\2\2\37\u019e\3\2\2\2"+
		"!\u01a6\3\2\2\2#\u01ac\3\2\2\2%\u01b2\3\2\2\2\'\u01b9\3\2\2\2)\u01bc\3"+
		"\2\2\2+\u01c1\3\2\2\2-\u01c7\3\2\2\2/\u01cb\3\2\2\2\61\u01d1\3\2\2\2\63"+
		"\u01db\3\2\2\2\65\u01e0\3\2\2\2\67\u01e4\3\2\2\29\u01ed\3\2\2\2;\u01f5"+
		"\3\2\2\2=\u01fa\3\2\2\2?\u01fd\3\2\2\2A\u0200\3\2\2\2C\u020a\3\2\2\2E"+
		"\u020d\3\2\2\2G\u0215\3\2\2\2I\u021a\3\2\2\2K\u021e\3\2\2\2M\u0222\3\2"+
		"\2\2O\u0226\3\2\2\2Q\u022b\3\2\2\2S\u022e\3\2\2\2U\u0231\3\2\2\2W\u0238"+
		"\3\2\2\2Y\u023c\3\2\2\2[\u0247\3\2\2\2]\u024f\3\2\2\2_\u0258\3\2\2\2a"+
		"\u025f\3\2\2\2c\u0267\3\2\2\2e\u0271\3\2\2\2g\u027b\3\2\2\2i\u0281\3\2"+
		"\2\2k\u0287\3\2\2\2m\u028e\3\2\2\2o\u0292\3\2\2\2q\u029a\3\2\2\2s\u02a2"+
		"\3\2\2\2u\u02a9\3\2\2\2w\u02b1\3\2\2\2y\u02b8\3\2\2\2{\u02c1\3\2\2\2}"+
		"\u02c6\3\2\2\2\177\u02ce\3\2\2\2\u0081\u02db\3\2\2\2\u0083\u02e2\3\2\2"+
		"\2\u0085\u02e7\3\2\2\2\u0087\u02f1\3\2\2\2\u0089\u02f6\3\2\2\2\u008b\u02fb"+
		"\3\2\2\2\u008d\u0301\3\2\2\2\u008f\u0305\3\2\2\2\u0091\u030a\3\2\2\2\u0093"+
		"\u0310\3\2\2\2\u0095\u0315\3\2\2\2\u0097\u0319\3\2\2\2\u0099\u0322\3\2"+
		"\2\2\u009b\u0339\3\2\2\2\u009d\u0342\3\2\2\2\u009f\u0348\3\2\2\2\u00a1"+
		"\u0351\3\2\2\2\u00a3\u0353\3\2\2\2\u00a5\u0355\3\2\2\2\u00a7\u0357\3\2"+
		"\2\2\u00a9\u0359\3\2\2\2\u00ab\u035b\3\2\2\2\u00ad\u035d\3\2\2\2\u00af"+
		"\u035f\3\2\2\2\u00b1\u0361\3\2\2\2\u00b3\u0363\3\2\2\2\u00b5\u0365\3\2"+
		"\2\2\u00b7\u0367\3\2\2\2\u00b9\u0369\3\2\2\2\u00bb\u036b\3\2\2\2\u00bd"+
		"\u036d\3\2\2\2\u00bf\u036f\3\2\2\2\u00c1\u0371\3\2\2\2\u00c3\u0373\3\2"+
		"\2\2\u00c5\u0375\3\2\2\2\u00c7\u0377\3\2\2\2\u00c9\u0379\3\2\2\2\u00cb"+
		"\u037b\3\2\2\2\u00cd\u037d\3\2\2\2\u00cf\u037f\3\2\2\2\u00d1\u0381\3\2"+
		"\2\2\u00d3\u0383\3\2\2\2\u00d5\u0385\3\2\2\2\u00d7\u0387\3\2\2\2\u00d9"+
		"\u0389\3\2\2\2\u00db\u038b\3\2\2\2\u00dd\u038d\3\2\2\2\u00df\u038f\3\2"+
		"\2\2\u00e1\u0391\3\2\2\2\u00e3\u0393\3\2\2\2\u00e5\u0395\3\2\2\2\u00e7"+
		"\u0397\3\2\2\2\u00e9\u0399\3\2\2\2\u00eb\u039b\3\2\2\2\u00ed\u039d\3\2"+
		"\2\2\u00ef\u039f\3\2\2\2\u00f1\u03a1\3\2\2\2\u00f3\u03a3\3\2\2\2\u00f5"+
		"\u03a5\3\2\2\2\u00f7\u03a7\3\2\2\2\u00f9\u03a9\3\2\2\2\u00fb\u03ab\3\2"+
		"\2\2\u00fd\u03ae\3\2\2\2\u00ff\u03b1\3\2\2\2\u0101\u03b4\3\2\2\2\u0103"+
		"\u03b7\3\2\2\2\u0105\u03ba\3\2\2\2\u0107\u03bd\3\2\2\2\u0109\u03c0\3\2"+
		"\2\2\u010b\u03c3\3\2\2\2\u010d\u03c6\3\2\2\2\u010f\u03c9\3\2\2\2\u0111"+
		"\u03cb\3\2\2\2\u0113\u03d3\3\2\2\2\u0115\u03d5\3\2\2\2\u0117\u03d7\3\2"+
		"\2\2\u0119\u03d9\3\2\2\2\u011b\u03db\3\2\2\2\u011d\u03dd\3\2\2\2\u011f"+
		"\u03e5\3\2\2\2\u0121\u03e7\3\2\2\2\u0123\u03e9\3\2\2\2\u0125\u03eb\3\2"+
		"\2\2\u0127\u03ed\3\2\2\2\u0129\u03f3\3\2\2\2\u012b\u03f7\3\2\2\2\u012d"+
		"\u03f9\3\2\2\2\u012f\u0402\3\2\2\2\u0131\u0416\3\2\2\2\u0133\u0418\3\2"+
		"\2\2\u0135\u041a\3\2\2\2\u0137\u0426\3\2\2\2\u0139\u0428\3\2\2\2\u013b"+
		"\u0434\3\2\2\2\u013d\u0437\3\2\2\2\u013f\u0439\3\2\2\2\u0141\u043d\3\2"+
		"\2\2\u0143\u0441\3\2\2\2\u0145\u0446\3\2\2\2\u0147\u044b\3\2\2\2\u0149"+
		"\u0450\3\2\2\2\u014b\u014c\5\u00a1Q\2\u014c\u014d\5\u00a3R\2\u014d\u014e"+
		"\5\u00bd_\2\u014e\u014f\5\u00c3b\2\u014f\u0150\5\u00c7d\2\u0150\4\3\2"+
		"\2\2\u0151\u0152\5\u00a1Q\2\u0152\u0153\5\u00a3R\2\u0153\u0154\5\u00c5"+
		"c\2\u0154\6\3\2\2\2\u0155\u0156\5\u00a1Q\2\u0156\u0157\5\u00a3R\2\u0157"+
		"\u0158\5\u00c5c\2\u0158\u0159\5\u00c7d\2\u0159\u015a\5\u00c3b\2\u015a"+
		"\u015b\5\u00a1Q\2\u015b\u015c\5\u00a5S\2\u015c\u015d\5\u00c7d\2\u015d"+
		"\b\3\2\2\2\u015e\u015f\5\u00a1Q\2\u015f\u0160\5\u00a5S\2\u0160\u0161\5"+
		"\u00a5S\2\u0161\u0162\5\u00a9U\2\u0162\u0163\5\u00bf`\2\u0163\u0164\5"+
		"\u00c7d\2\u0164\n\3\2\2\2\u0165\u0166\5\u00a1Q\2\u0166\u0167\5\u00a5S"+
		"\2\u0167\u0168\5\u00a5S\2\u0168\u0169\5\u00a9U\2\u0169\u016a\5\u00c5c"+
		"\2\u016a\u016b\5\u00c5c\2\u016b\f\3\2\2\2\u016c\u016d\5\u00a1Q\2\u016d"+
		"\u016e\5\u00b7\\\2\u016e\u016f\5\u00b1Y\2\u016f\u0170\5\u00a1Q\2\u0170"+
		"\u0171\5\u00c5c\2\u0171\u0172\5\u00a9U\2\u0172\u0173\5\u00a7T\2\u0173"+
		"\16\3\2\2\2\u0174\u0175\5\u00a1Q\2\u0175\u0176\5\u00b7\\\2\u0176\u0177"+
		"\5\u00b7\\\2\u0177\20\3\2\2\2\u0178\u0179\5\u00a1Q\2\u0179\u017a\5\u00bb"+
		"^\2\u017a\u017b\5\u00a7T\2\u017b\22\3\2\2\2\u017c\u017d\5\u00a1Q\2\u017d"+
		"\u017e\5\u00c3b\2\u017e\u017f\5\u00c3b\2\u017f\u0180\5\u00a1Q\2\u0180"+
		"\u0181\5\u00d1i\2\u0181\24\3\2\2\2\u0182\u0183\5\u00a1Q\2\u0183\u0184"+
		"\5\u00c7d\2\u0184\26\3\2\2\2\u0185\u0186\5\u00a3R\2\u0186\u0187\5\u00a9"+
		"U\2\u0187\u0188\5\u00adW\2\u0188\u0189\5\u00b1Y\2\u0189\u018a\5\u00bb"+
		"^\2\u018a\30\3\2\2\2\u018b\u018c\5\u00a3R\2\u018c\u018d\5\u00bd_\2\u018d"+
		"\u018e\5\u00a7T\2\u018e\u018f\5\u00d1i\2\u018f\32\3\2\2\2\u0190\u0191"+
		"\5\u00a5S\2\u0191\u0192\5\u00a1Q\2\u0192\u0193\5\u00c5c\2\u0193\u0194"+
		"\5\u00a9U\2\u0194\34\3\2\2\2\u0195\u0196\5\u00a5S\2\u0196\u0197\5\u00bd"+
		"_\2\u0197\u0198\5\u00bb^\2\u0198\u0199\5\u00c5c\2\u0199\u019a\5\u00c7"+
		"d\2\u019a\u019b\5\u00a1Q\2\u019b\u019c\5\u00bb^\2\u019c\u019d\5\u00c7"+
		"d\2\u019d\36\3\2\2\2\u019e\u019f\5\u00a7T\2\u019f\u01a0\5\u00a9U\2\u01a0"+
		"\u01a1\5\u00a5S\2\u01a1\u01a2\5\u00b7\\\2\u01a2\u01a3\5\u00a1Q\2\u01a3"+
		"\u01a4\5\u00c3b\2\u01a4\u01a5\5\u00a9U\2\u01a5 \3\2\2\2\u01a6\u01a7\5"+
		"\u00a7T\2\u01a7\u01a8\5\u00a9U\2\u01a8\u01a9\5\u00b7\\\2\u01a9\u01aa\5"+
		"\u00a1Q\2\u01aa\u01ab\5\u00d1i\2\u01ab\"\3\2\2\2\u01ac\u01ad\5\u00a7T"+
		"\2\u01ad\u01ae\5\u00a9U\2\u01ae\u01af\5\u00b7\\\2\u01af\u01b0\5\u00c7"+
		"d\2\u01b0\u01b1\5\u00a1Q\2\u01b1$\3\2\2\2\u01b2\u01b3\5\u00a7T\2\u01b3"+
		"\u01b4\5\u00b1Y\2\u01b4\u01b5\5\u00adW\2\u01b5\u01b6\5\u00b1Y\2\u01b6"+
		"\u01b7\5\u00c7d\2\u01b7\u01b8\5\u00c5c\2\u01b8&\3\2\2\2\u01b9\u01ba\5"+
		"\u00a7T\2\u01ba\u01bb\5\u00bd_\2\u01bb(\3\2\2\2\u01bc\u01bd\5\u00a9U\2"+
		"\u01bd\u01be\5\u00b7\\\2\u01be\u01bf\5\u00c5c\2\u01bf\u01c0\5\u00a9U\2"+
		"\u01c0*\3\2\2\2\u01c1\u01c2\5\u00a9U\2\u01c2\u01c3\5\u00b7\\\2\u01c3\u01c4"+
		"\5\u00c5c\2\u01c4\u01c5\5\u00b1Y\2\u01c5\u01c6\5\u00abV\2\u01c6,\3\2\2"+
		"\2\u01c7\u01c8\5\u00a9U\2\u01c8\u01c9\5\u00bb^\2\u01c9\u01ca\5\u00a7T"+
		"\2\u01ca.\3\2\2\2\u01cb\u01cc\5\u00a9U\2\u01cc\u01cd\5\u00bb^\2\u01cd"+
		"\u01ce\5\u00c7d\2\u01ce\u01cf\5\u00c3b\2\u01cf\u01d0\5\u00d1i\2\u01d0"+
		"\60\3\2\2\2\u01d1\u01d2\5\u00a9U\2\u01d2\u01d3\5\u00cfh\2\u01d3\u01d4"+
		"\5\u00a5S\2\u01d4\u01d5\5\u00a9U\2\u01d5\u01d6\5\u00bf`\2\u01d6\u01d7"+
		"\5\u00c7d\2\u01d7\u01d8\5\u00b1Y\2\u01d8\u01d9\5\u00bd_\2\u01d9\u01da"+
		"\5\u00bb^\2\u01da\62\3\2\2\2\u01db\u01dc\5\u00a9U\2\u01dc\u01dd\5\u00cf"+
		"h\2\u01dd\u01de\5\u00b1Y\2\u01de\u01df\5\u00c7d\2\u01df\64\3\2\2\2\u01e0"+
		"\u01e1\5\u00abV\2\u01e1\u01e2\5\u00bd_\2\u01e2\u01e3\5\u00c3b\2\u01e3"+
		"\66\3\2\2\2\u01e4\u01e5\5\u00abV\2\u01e5\u01e6\5\u00c9e\2\u01e6\u01e7"+
		"\5\u00bb^\2\u01e7\u01e8\5\u00a5S\2\u01e8\u01e9\5\u00c7d\2\u01e9\u01ea"+
		"\5\u00b1Y\2\u01ea\u01eb\5\u00bd_\2\u01eb\u01ec\5\u00bb^\2\u01ec8\3\2\2"+
		"\2\u01ed\u01ee\5\u00adW\2\u01ee\u01ef\5\u00a9U\2\u01ef\u01f0\5\u00bb^"+
		"\2\u01f0\u01f1\5\u00a9U\2\u01f1\u01f2\5\u00c3b\2\u01f2\u01f3\5\u00b1Y"+
		"\2\u01f3\u01f4\5\u00a5S\2\u01f4:\3\2\2\2\u01f5\u01f6\5\u00adW\2\u01f6"+
		"\u01f7\5\u00bd_\2\u01f7\u01f8\5\u00c7d\2\u01f8\u01f9\5\u00bd_\2\u01f9"+
		"<\3\2\2\2\u01fa\u01fb\5\u00b1Y\2\u01fb\u01fc\5\u00abV\2\u01fc>\3\2\2\2"+
		"\u01fd\u01fe\5\u00b1Y\2\u01fe\u01ff\5\u00bb^\2\u01ff@\3\2\2\2\u0200\u0201"+
		"\5\u00b1Y\2\u0201\u0202\5\u00bb^\2\u0202\u0203\5\u00c7d\2\u0203\u0204"+
		"\5\u00a9U\2\u0204\u0205\5\u00c3b\2\u0205\u0206\5\u00abV\2\u0206\u0207"+
		"\5\u00a1Q\2\u0207\u0208\5\u00a5S\2\u0208\u0209\5\u00a9U\2\u0209B\3\2\2"+
		"\2\u020a\u020b\5\u00b1Y\2\u020b\u020c\5\u00c5c\2\u020cD\3\2\2\2\u020d"+
		"\u020e\5\u00b7\\\2\u020e\u020f\5\u00b1Y\2\u020f\u0210\5\u00b9]\2\u0210"+
		"\u0211\5\u00b1Y\2\u0211\u0212\5\u00c7d\2\u0212\u0213\5\u00a9U\2\u0213"+
		"\u0214\5\u00a7T\2\u0214F\3\2\2\2\u0215\u0216\5\u00b7\\\2\u0216\u0217\5"+
		"\u00bd_\2\u0217\u0218\5\u00bd_\2\u0218\u0219\5\u00bf`\2\u0219H\3\2\2\2"+
		"\u021a\u021b\5\u00b9]\2\u021b\u021c\5\u00bd_\2\u021c\u021d\5\u00a7T\2"+
		"\u021dJ\3\2\2\2\u021e\u021f\5\u00bb^\2\u021f\u0220\5\u00a9U\2\u0220\u0221"+
		"\5\u00cdg\2\u0221L\3\2\2\2\u0222\u0223\5\u00bb^\2\u0223\u0224\5\u00bd"+
		"_\2\u0224\u0225\5\u00c7d\2\u0225N\3\2\2\2\u0226\u0227\5\u00bb^\2\u0227"+
		"\u0228\5\u00c9e\2\u0228\u0229\5\u00b7\\\2\u0229\u022a\5\u00b7\\\2\u022a"+
		"P\3\2\2\2\u022b\u022c\5\u00bd_\2\u022c\u022d\5\u00abV\2\u022dR\3\2\2\2"+
		"\u022e\u022f\5\u00bd_\2\u022f\u0230\5\u00c3b\2\u0230T\3\2\2\2\u0231\u0232"+
		"\5\u00bd_\2\u0232\u0233\5\u00c7d\2\u0233\u0234\5\u00afX\2\u0234\u0235"+
		"\5\u00a9U\2\u0235\u0236\5\u00c3b\2\u0236\u0237\5\u00c5c\2\u0237V\3\2\2"+
		"\2\u0238\u0239\5\u00bd_\2\u0239\u023a\5\u00c9e\2\u023a\u023b\5\u00c7d"+
		"\2\u023bX\3\2\2\2\u023c\u023d\5\u00bd_\2\u023d\u023e\5\u00cbf\2\u023e"+
		"\u023f\5\u00a9U\2\u023f\u0240\5\u00c3b\2\u0240\u0241\5\u00c3b\2\u0241"+
		"\u0242\5\u00b1Y\2\u0242\u0243\5\u00a7T\2\u0243\u0244\5\u00b1Y\2\u0244"+
		"\u0245\5\u00bb^\2\u0245\u0246\5\u00adW\2\u0246Z\3\2\2\2\u0247\u0248\5"+
		"\u00bf`\2\u0248\u0249\5\u00a1Q\2\u0249\u024a\5\u00a5S\2\u024a\u024b\5"+
		"\u00b5[\2\u024b\u024c\5\u00a1Q\2\u024c\u024d\5\u00adW\2\u024d\u024e\5"+
		"\u00a9U\2\u024e\\\3\2\2\2\u024f\u0250\5\u00bf`\2\u0250\u0251\5\u00a1Q"+
		"\2\u0251\u0252\5\u00c3b\2\u0252\u0253\5\u00a1Q\2\u0253\u0254\5\u00b7\\"+
		"\2\u0254\u0255\5\u00b7\\\2\u0255\u0256\5\u00a9U\2\u0256\u0257\5\u00b7"+
		"\\\2\u0257^\3\2\2\2\u0258\u0259\5\u00bf`\2\u0259\u025a\5\u00c3b\2\u025a"+
		"\u025b\5\u00a1Q\2\u025b\u025c\5\u00adW\2\u025c\u025d\5\u00b9]\2\u025d"+
		"\u025e\5\u00a1Q\2\u025e`\3\2\2\2\u025f\u0260\5\u00bf`\2\u0260\u0261\5"+
		"\u00c3b\2\u0261\u0262\5\u00b1Y\2\u0262\u0263\5\u00cbf\2\u0263\u0264\5"+
		"\u00a1Q\2\u0264\u0265\5\u00c7d\2\u0265\u0266\5\u00a9U\2\u0266b\3\2\2\2"+
		"\u0267\u0268\5\u00bf`\2\u0268\u0269\5\u00c3b\2\u0269\u026a\5\u00bd_\2"+
		"\u026a\u026b\5\u00a5S\2\u026b\u026c\5\u00a9U\2\u026c\u026d\5\u00a7T\2"+
		"\u026d\u026e\5\u00c9e\2\u026e\u026f\5\u00c3b\2\u026f\u0270\5\u00a9U\2"+
		"\u0270d\3\2\2\2\u0271\u0272\5\u00bf`\2\u0272\u0273\5\u00c3b\2\u0273\u0274"+
		"\5\u00bd_\2\u0274\u0275\5\u00c7d\2\u0275\u0276\5\u00a9U\2\u0276\u0277"+
		"\5\u00a5S\2\u0277\u0278\5\u00c7d\2\u0278\u0279\5\u00a9U\2\u0279\u027a"+
		"\5\u00a7T\2\u027af\3\2\2\2\u027b\u027c\5\u00c3b\2\u027c\u027d\5\u00a1"+
		"Q\2\u027d\u027e\5\u00b1Y\2\u027e\u027f\5\u00c5c\2\u027f\u0280\5\u00a9"+
		"U\2\u0280h\3\2\2\2\u0281\u0282\5\u00c3b\2\u0282\u0283\5\u00a1Q\2\u0283"+
		"\u0284\5\u00bb^\2\u0284\u0285\5\u00adW\2\u0285\u0286\5\u00a9U\2\u0286"+
		"j\3\2\2\2\u0287\u0288\5\u00c3b\2\u0288\u0289\5\u00a9U\2\u0289\u028a\5"+
		"\u00a5S\2\u028a\u028b\5\u00bd_\2\u028b\u028c\5\u00c3b\2\u028c\u028d\5"+
		"\u00a7T\2\u028dl\3\2\2\2\u028e\u028f\5\u00c3b\2\u028f\u0290\5\u00a9U\2"+
		"\u0290\u0291\5\u00b9]\2\u0291n\3\2\2\2\u0292\u0293\5\u00c3b\2\u0293\u0294"+
		"\5\u00a9U\2\u0294\u0295\5\u00bb^\2\u0295\u0296\5\u00a1Q\2\u0296\u0297"+
		"\5\u00b9]\2\u0297\u0298\5\u00a9U\2\u0298\u0299\5\u00c5c\2\u0299p\3\2\2"+
		"\2\u029a\u029b\5\u00c3b\2\u029b\u029c\5\u00a9U\2\u029c\u029d\5\u00c1a"+
		"\2\u029d\u029e\5\u00c9e\2\u029e\u029f\5\u00a9U\2\u029f\u02a0\5\u00c9e"+
		"\2\u02a0\u02a1\5\u00a9U\2\u02a1r\3\2\2\2\u02a2\u02a3\5\u00c3b\2\u02a3"+
		"\u02a4\5\u00a9U\2\u02a4\u02a5\5\u00c7d\2\u02a5\u02a6\5\u00c9e\2\u02a6"+
		"\u02a7\5\u00c3b\2\u02a7\u02a8\5\u00bb^\2\u02a8t\3\2\2\2\u02a9\u02aa\5"+
		"\u00c3b\2\u02aa\u02ab\5\u00a9U\2\u02ab\u02ac\5\u00cbf\2\u02ac\u02ad\5"+
		"\u00a9U\2\u02ad\u02ae\5\u00c3b\2\u02ae\u02af\5\u00c5c\2\u02af\u02b0\5"+
		"\u00a9U\2\u02b0v\3\2\2\2\u02b1\u02b2\5\u00c5c\2\u02b2\u02b3\5\u00a9U\2"+
		"\u02b3\u02b4\5\u00b7\\\2\u02b4\u02b5\5\u00a9U\2\u02b5\u02b6\5\u00a5S\2"+
		"\u02b6\u02b7\5\u00c7d\2\u02b7x\3\2\2\2\u02b8\u02b9\5\u00c5c\2\u02b9\u02ba"+
		"\5\u00a9U\2\u02ba\u02bb\5\u00bf`\2\u02bb\u02bc\5\u00a1Q\2\u02bc\u02bd"+
		"\5\u00c3b\2\u02bd\u02be\5\u00a1Q\2\u02be\u02bf\5\u00c7d\2\u02bf\u02c0"+
		"\5\u00a9U\2\u02c0z\3\2\2\2\u02c1\u02c2\5\u00c5c\2\u02c2\u02c3\5\u00bd"+
		"_\2\u02c3\u02c4\5\u00b9]\2\u02c4\u02c5\5\u00a9U\2\u02c5|\3\2\2\2\u02c6"+
		"\u02c7\5\u00c5c\2\u02c7\u02c8\5\u00c9e\2\u02c8\u02c9\5\u00a3R\2\u02c9"+
		"\u02ca\5\u00c7d\2\u02ca\u02cb\5\u00d1i\2\u02cb\u02cc\5\u00bf`\2\u02cc"+
		"\u02cd\5\u00a9U\2\u02cd~\3\2\2\2\u02ce\u02cf\5\u00c5c\2\u02cf\u02d0\5"+
		"\u00d1i\2\u02d0\u02d1\5\u00bb^\2\u02d1\u02d2\5\u00a5S\2\u02d2\u02d3\5"+
		"\u00afX\2\u02d3\u02d4\5\u00c3b\2\u02d4\u02d5\5\u00bd_\2\u02d5\u02d6\5"+
		"\u00bb^\2\u02d6\u02d7\5\u00b1Y\2\u02d7\u02d8\5\u00d3j\2\u02d8\u02d9\5"+
		"\u00a9U\2\u02d9\u02da\5\u00a7T\2\u02da\u0080\3\2\2\2\u02db\u02dc\5\u00c7"+
		"d\2\u02dc\u02dd\5\u00a1Q\2\u02dd\u02de\5\u00adW\2\u02de\u02df\5\u00ad"+
		"W\2\u02df\u02e0\5\u00a9U\2\u02e0\u02e1\5\u00a7T\2\u02e1\u0082\3\2\2\2"+
		"\u02e2\u02e3\5\u00c7d\2\u02e3\u02e4\5\u00a1Q\2\u02e4\u02e5\5\u00c5c\2"+
		"\u02e5\u02e6\5\u00b5[\2\u02e6\u0084\3\2\2\2\u02e7\u02e8\5\u00c7d\2\u02e8"+
		"\u02e9\5\u00a9U\2\u02e9\u02ea\5\u00c3b\2\u02ea\u02eb\5\u00b9]\2\u02eb"+
		"\u02ec\5\u00b1Y\2\u02ec\u02ed\5\u00bb^\2\u02ed\u02ee\5\u00a1Q\2\u02ee"+
		"\u02ef\5\u00c7d\2\u02ef\u02f0\5\u00a9U\2\u02f0\u0086\3\2\2\2\u02f1\u02f2"+
		"\5\u00c7d\2\u02f2\u02f3\5\u00afX\2\u02f3\u02f4\5\u00a9U\2\u02f4\u02f5"+
		"\5\u00bb^\2\u02f5\u0088\3\2\2\2\u02f6\u02f7\5\u00c7d\2\u02f7\u02f8\5\u00d1"+
		"i\2\u02f8\u02f9\5\u00bf`\2\u02f9\u02fa\5\u00a9U\2\u02fa\u008a\3\2\2\2"+
		"\u02fb\u02fc\5\u00c9e\2\u02fc\u02fd\5\u00bb^\2\u02fd\u02fe\5\u00c7d\2"+
		"\u02fe\u02ff\5\u00b1Y\2\u02ff\u0300\5\u00b7\\\2\u0300\u008c\3\2\2\2\u0301"+
		"\u0302\5\u00c9e\2\u0302\u0303\5\u00c5c\2\u0303\u0304\5\u00a9U\2\u0304"+
		"\u008e\3\2\2\2\u0305\u0306\5\u00cdg\2\u0306\u0307\5\u00afX\2\u0307\u0308"+
		"\5\u00a9U\2\u0308\u0309\5\u00bb^\2\u0309\u0090\3\2\2\2\u030a\u030b\5\u00cd"+
		"g\2\u030b\u030c\5\u00afX\2\u030c\u030d\5\u00b1Y\2\u030d\u030e\5\u00b7"+
		"\\\2\u030e\u030f\5\u00a9U\2\u030f\u0092\3\2\2\2\u0310\u0311\5\u00cdg\2"+
		"\u0311\u0312\5\u00b1Y\2\u0312\u0313\5\u00c7d\2\u0313\u0314\5\u00afX\2"+
		"\u0314\u0094\3\2\2\2\u0315\u0316\5\u00cfh\2\u0316\u0317\5\u00bd_\2\u0317"+
		"\u0318\5\u00c3b\2\u0318\u0096\3\2\2\2\u0319\u031a\5\u00a3R\2\u031a\u031b"+
		"\5\u00d1i\2\u031b\u031c\7a\2\2\u031c\u031d\5\u00a9U\2\u031d\u031e\5\u00bb"+
		"^\2\u031e\u031f\5\u00c7d\2\u031f\u0320\5\u00c3b\2\u0320\u0321\5\u00d1"+
		"i\2\u0321\u0098\3\2\2\2\u0322\u0323\5\u00a3R\2\u0323\u0324\5\u00d1i\2"+
		"\u0324\u0325\7a\2\2\u0325\u0326\5\u00bf`\2\u0326\u0327\5\u00c3b\2\u0327"+
		"\u0328\5\u00bd_\2\u0328\u0329\5\u00c7d\2\u0329\u032a\5\u00a9U\2\u032a"+
		"\u032b\5\u00a5S\2\u032b\u032c\5\u00c7d\2\u032c\u032d\5\u00a9U\2\u032d"+
		"\u032e\5\u00a7T\2\u032e\u032f\7a\2\2\u032f\u0330\5\u00bf`\2\u0330\u0331"+
		"\5\u00c3b\2\u0331\u0332\5\u00bd_\2\u0332\u0333\5\u00a5S\2\u0333\u0334"+
		"\5\u00a9U\2\u0334\u0335\5\u00a7T\2\u0335\u0336\5\u00c9e\2\u0336\u0337"+
		"\5\u00c3b\2\u0337\u0338\5\u00a9U\2\u0338\u009a\3\2\2\2\u0339\u033a\5\u00bd"+
		"_\2\u033a\u033b\5\u00bf`\2\u033b\u033c\5\u00c7d\2\u033c\u033d\5\u00b1"+
		"Y\2\u033d\u033e\5\u00bd_\2\u033e\u033f\5\u00bb^\2\u033f\u0340\5\u00a1"+
		"Q\2\u0340\u0341\5\u00b7\\\2\u0341\u009c\3\2\2\2\u0342\u0343\5\u00a5S\2"+
		"\u0343\u0344\5\u00b7\\\2\u0344\u0345\5\u00a1Q\2\u0345\u0346\5\u00c5c\2"+
		"\u0346\u0347\5\u00c5c\2\u0347\u009e\3\2\2\2\u0348\u0349\5\u00c5c\2\u0349"+
		"\u034a\5\u00c7d\2\u034a\u034b\5\u00a1Q\2\u034b\u034c\5\u00bb^\2\u034c"+
		"\u034d\5\u00a7T\2\u034d\u034e\5\u00a1Q\2\u034e\u034f\5\u00c3b\2\u034f"+
		"\u0350\5\u00a7T\2\u0350\u00a0\3\2\2\2\u0351\u0352\t\2\2\2\u0352\u00a2"+
		"\3\2\2\2\u0353\u0354\t\3\2\2\u0354\u00a4\3\2\2\2\u0355\u0356\t\4\2\2\u0356"+
		"\u00a6\3\2\2\2\u0357\u0358\t\5\2\2\u0358\u00a8\3\2\2\2\u0359\u035a\t\6"+
		"\2\2\u035a\u00aa\3\2\2\2\u035b\u035c\t\7\2\2\u035c\u00ac\3\2\2\2\u035d"+
		"\u035e\t\b\2\2\u035e\u00ae\3\2\2\2\u035f\u0360\t\t\2\2\u0360\u00b0\3\2"+
		"\2\2\u0361\u0362\t\n\2\2\u0362\u00b2\3\2\2\2\u0363\u0364\t\13\2\2\u0364"+
		"\u00b4\3\2\2\2\u0365\u0366\t\f\2\2\u0366\u00b6\3\2\2\2\u0367\u0368\t\r"+
		"\2\2\u0368\u00b8\3\2\2\2\u0369\u036a\t\16\2\2\u036a\u00ba\3\2\2\2\u036b"+
		"\u036c\t\17\2\2\u036c\u00bc\3\2\2\2\u036d\u036e\t\20\2\2\u036e\u00be\3"+
		"\2\2\2\u036f\u0370\t\21\2\2\u0370\u00c0\3\2\2\2\u0371\u0372\t\22\2\2\u0372"+
		"\u00c2\3\2\2\2\u0373\u0374\t\23\2\2\u0374\u00c4\3\2\2\2\u0375\u0376\t"+
		"\24\2\2\u0376\u00c6\3\2\2\2\u0377\u0378\t\25\2\2\u0378\u00c8\3\2\2\2\u0379"+
		"\u037a\t\26\2\2\u037a\u00ca\3\2\2\2\u037b\u037c\t\27\2\2\u037c\u00cc\3"+
		"\2\2\2\u037d\u037e\t\30\2\2\u037e\u00ce\3\2\2\2\u037f\u0380\t\31\2\2\u0380"+
		"\u00d0\3\2\2\2\u0381\u0382\t\32\2\2\u0382\u00d2\3\2\2\2\u0383\u0384\t"+
		"\33\2\2\u0384\u00d4\3\2\2\2\u0385\u0386\7(\2\2\u0386\u00d6\3\2\2\2\u0387"+
		"\u0388\7)\2\2\u0388\u00d8\3\2\2\2\u0389\u038a\7*\2\2\u038a\u00da\3\2\2"+
		"\2\u038b\u038c\7+\2\2\u038c\u00dc\3\2\2\2\u038d\u038e\7,\2\2\u038e\u00de"+
		"\3\2\2\2\u038f\u0390\7-\2\2\u0390\u00e0\3\2\2\2\u0391\u0392\7.\2\2\u0392"+
		"\u00e2\3\2\2\2\u0393\u0394\7/\2\2\u0394\u00e4\3\2\2\2\u0395\u0396\7\60"+
		"\2\2\u0396\u00e6\3\2\2\2\u0397\u0398\7\61\2\2\u0398\u00e8\3\2\2\2\u0399"+
		"\u039a\7<\2\2\u039a\u00ea\3\2\2\2\u039b\u039c\7=\2\2\u039c\u00ec\3\2\2"+
		"\2\u039d\u039e\7>\2\2\u039e\u00ee\3\2\2\2\u039f\u03a0\7?\2\2\u03a0\u00f0"+
		"\3\2\2\2\u03a1\u03a2\7@\2\2\u03a2\u00f2\3\2\2\2\u03a3\u03a4\7B\2\2\u03a4"+
		"\u00f4\3\2\2\2\u03a5\u03a6\7]\2\2\u03a6\u00f6\3\2\2\2\u03a7\u03a8\7_\2"+
		"\2\u03a8\u00f8\3\2\2\2\u03a9\u03aa\7~\2\2\u03aa\u00fa\3\2\2\2\u03ab\u03ac"+
		"\7?\2\2\u03ac\u03ad\7@\2\2\u03ad\u00fc\3\2\2\2\u03ae\u03af\7\60\2\2\u03af"+
		"\u03b0\7\60\2\2\u03b0\u00fe\3\2\2\2\u03b1\u03b2\7,\2\2\u03b2\u03b3\7,"+
		"\2\2\u03b3\u0100\3\2\2\2\u03b4\u03b5\7<\2\2\u03b5\u03b6\7?\2\2\u03b6\u0102"+
		"\3\2\2\2\u03b7\u03b8\7\61\2\2\u03b8\u03b9\7?\2\2\u03b9\u0104\3\2\2\2\u03ba"+
		"\u03bb\7>\2\2\u03bb\u03bc\7?\2\2\u03bc\u0106\3\2\2\2\u03bd\u03be\7@\2"+
		"\2\u03be\u03bf\7?\2\2\u03bf\u0108\3\2\2\2\u03c0\u03c1\7>\2\2\u03c1\u03c2"+
		"\7>\2\2\u03c2\u010a\3\2\2\2\u03c3\u03c4\7@\2\2\u03c4\u03c5\7@\2\2\u03c5"+
		"\u010c\3\2\2\2\u03c6\u03c7\7>\2\2\u03c7\u03c8\7@\2\2\u03c8\u010e\3\2\2"+
		"\2\u03c9\u03ca\7a\2\2\u03ca\u0110\3\2\2\2\u03cb\u03d0\5\u011f\u0090\2"+
		"\u03cc\u03cf\5\u011f\u0090\2\u03cd\u03cf\5\u0129\u0095\2\u03ce\u03cc\3"+
		"\2\2\2\u03ce\u03cd\3\2\2\2\u03cf\u03d2\3\2\2\2\u03d0\u03ce\3\2\2\2\u03d0"+
		"\u03d1\3\2\2\2\u03d1\u0112\3\2\2\2\u03d2\u03d0\3\2\2\2\u03d3\u03d4\t!"+
		"\2\2\u03d4\u0114\3\2\2\2\u03d5\u03d6\t\"\2\2\u03d6\u0116\3\2\2\2\u03d7"+
		"\u03d8\t\34\2\2\u03d8\u0118\3\2\2\2\u03d9\u03da\t#\2\2\u03da\u011a\3\2"+
		"\2\2\u03db\u03dc\t$\2\2\u03dc\u011c\3\2\2\2\u03dd\u03de\t%\2\2\u03de\u011e"+
		"\3\2\2\2\u03df\u03e6\5\u0113\u008a\2\u03e0\u03e6\5\u0115\u008b\2\u03e1"+
		"\u03e6\5\u0117\u008c\2\u03e2\u03e6\5\u0119\u008d\2\u03e3\u03e6\5\u011b"+
		"\u008e\2\u03e4\u03e6\5\u011d\u008f\2\u03e5\u03df\3\2\2\2\u03e5\u03e0\3"+
		"\2\2\2\u03e5\u03e1\3\2\2\2\u03e5\u03e2\3\2\2\2\u03e5\u03e3\3\2\2\2\u03e5"+
		"\u03e4\3\2\2\2\u03e6\u0120\3\2\2\2\u03e7\u03e8\t&\2\2\u03e8\u0122\3\2"+
		"\2\2\u03e9\u03ea\t\'\2\2\u03ea\u0124\3\2\2\2\u03eb\u03ec\t(\2\2\u03ec"+
		"\u0126\3\2\2\2\u03ed\u03ee\t\35\2\2\u03ee\u0128\3\2\2\2\u03ef\u03f4\5"+
		"\u0121\u0091\2\u03f0\u03f4\5\u0123\u0092\2\u03f1\u03f4\5\u0125\u0093\2"+
		"\u03f2\u03f4\5\u0127\u0094\2\u03f3\u03ef\3\2\2\2\u03f3\u03f0\3\2\2\2\u03f3"+
		"\u03f1\3\2\2\2\u03f3\u03f2\3\2\2\2\u03f4\u012a\3\2\2\2\u03f5\u03f8\5\u012d"+
		"\u0097\2\u03f6\u03f8\5\u0135\u009b\2\u03f7\u03f5\3\2\2\2\u03f7\u03f6\3"+
		"\2\2\2\u03f8\u012c\3\2\2\2\u03f9\u03fd\5\u012f\u0098\2\u03fa\u03fb\5\u00e5"+
		"s\2\u03fb\u03fc\5\u012f\u0098\2\u03fc\u03fe\3\2\2\2\u03fd\u03fa\3\2\2"+
		"\2\u03fd\u03fe\3\2\2\2\u03fe\u0400\3\2\2\2\u03ff\u0401\5\u0131\u0099\2"+
		"\u0400\u03ff\3\2\2\2\u0400\u0401\3\2\2\2\u0401\u012e\3\2\2\2\u0402\u0409"+
		"\5\u0133\u009a\2\u0403\u0405\5\u010f\u0088\2\u0404\u0403\3\2\2\2\u0404"+
		"\u0405\3\2\2\2\u0405\u0406\3\2\2\2\u0406\u0408\5\u0133\u009a\2\u0407\u0404"+
		"\3\2\2\2\u0408\u040b\3\2\2\2\u0409\u0407\3\2\2\2\u0409\u040a\3\2\2\2\u040a"+
		"\u0130\3\2\2\2\u040b\u0409\3\2\2\2\u040c\u040e\5\u00a9U\2\u040d\u040f"+
		"\5\u00dfp\2\u040e\u040d\3\2\2\2\u040e\u040f\3\2\2\2\u040f\u0410\3\2\2"+
		"\2\u0410\u0411\5\u012f\u0098\2\u0411\u0417\3\2\2\2\u0412\u0413\5\u00a9"+
		"U\2\u0413\u0414\5\u00e3r\2\u0414\u0415\5\u012f\u0098\2\u0415\u0417\3\2"+
		"\2\2\u0416\u040c\3\2\2\2\u0416\u0412\3\2\2\2\u0417\u0132\3\2\2\2\u0418"+
		"\u0419\4\62;\2\u0419\u0134\3\2\2\2\u041a\u041b\5\u0137\u009c\2\u041b\u041c"+
		"\7%\2\2\u041c\u0420\5\u0139\u009d\2\u041d\u041e\5\u00e5s\2\u041e\u041f"+
		"\5\u0139\u009d\2\u041f\u0421\3\2\2\2\u0420\u041d\3\2\2\2\u0420\u0421\3"+
		"\2\2\2\u0421\u0422\3\2\2\2\u0422\u0424\7%\2\2\u0423\u0425\5\u0131\u0099"+
		"\2\u0424\u0423\3\2\2\2\u0424\u0425\3\2\2\2\u0425\u0136\3\2\2\2\u0426\u0427"+
		"\5\u012f\u0098\2\u0427\u0138\3\2\2\2\u0428\u042f\5\u013b\u009e\2\u0429"+
		"\u042b\5\u010f\u0088\2\u042a\u0429\3\2\2\2\u042a\u042b\3\2\2\2\u042b\u042c"+
		"\3\2\2\2\u042c\u042e\5\u013b\u009e\2\u042d\u042a\3\2\2\2\u042e\u0431\3"+
		"\2\2\2\u042f\u042d\3\2\2\2\u042f\u0430\3\2\2\2\u0430\u013a\3\2\2\2\u0431"+
		"\u042f\3\2\2\2\u0432\u0435\5\u0133\u009a\2\u0433\u0435\t\36\2\2\u0434"+
		"\u0432\3\2\2\2\u0434\u0433\3\2\2\2\u0435\u013c\3\2\2\2\u0436\u0438\t)"+
		"\2\2\u0437\u0436\3\2\2\2\u0438\u013e\3\2\2\2\u0439\u043a\7)\2\2\u043a"+
		"\u043b\5\u013d\u009f\2\u043b\u043c\7)\2\2\u043c\u0140\3\2\2\2\u043d\u043e"+
		"\7$\2\2\u043e\u043f\5\u0145\u00a3\2\u043f\u0440\7$\2\2\u0440\u0142\3\2"+
		"\2\2\u0441\u0442\n\37\2\2\u0442\u0144\3\2\2\2\u0443\u0444\7$\2\2\u0444"+
		"\u0447\7$\2\2\u0445\u0447\5\u0143\u00a2\2\u0446\u0443\3\2\2\2\u0446\u0445"+
		"\3\2\2\2\u0447\u0146\3\2\2\2\u0448\u044a\t*\2\2\u0449\u0448\3\2\2\2\u044a"+
		"\u044d\3\2\2\2\u044b\u0449\3\2\2\2\u044b\u044c\3\2\2\2\u044c\u044e\3\2"+
		"\2\2\u044d\u044b\3\2\2\2\u044e\u044f\b\u00a4\2\2\u044f\u0148\3\2\2\2\u0450"+
		"\u0451\7/\2\2\u0451\u0452\7/\2\2\u0452\u0456\3\2\2\2\u0453\u0455\n \2"+
		"\2\u0454\u0453\3\2\2\2\u0455\u0458\3\2\2\2\u0456\u0454\3\2\2\2\u0456\u0457"+
		"\3\2\2\2\u0457\u0459\3\2\2\2\u0458\u0456\3\2\2\2\u0459\u045a\b\u00a5\3"+
		"\2\u045a\u014a\3\2\2\2\30\2\u03ce\u03d0\u03e5\u03f3\u03f7\u03fd\u0400"+
		"\u0404\u0409\u040e\u0416\u0420\u0424\u042a\u042f\u0434\u0437\u0446\u0449"+
		"\u044b\u0456\4\b\2\2\2\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}