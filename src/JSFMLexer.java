// Generated from C:/Users/Shan/IdeaProjects/CMPILER-Scanner/src\JSFMLexer.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class JSFMLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		BOOLEAN=1, BREAK=2, CASE=3, CHAR=4, CONST=5, CONTINUE=6, DEFAULT=7, DO=8, 
		ELSE=9, FINAL=10, FLOAT=11, FOR=12, IF=13, INT=14, MAIN=15, RETURN=16, 
		STRING=17, SWITCH=18, VOID=19, WHILE=20, INPUT=21, OUTPUT=22, IDENTIFIER=23, 
		LPAREN=24, RPAREN=25, LBRACE=26, RBRACE=27, LBRACK=28, RBRACK=29, SEMI=30, 
		COMMA=31, DOT=32, ASSIGN=33, GT=34, LT=35, BANG=36, QUESTION=37, COLON=38, 
		EQUAL=39, GEQ=40, LEQ=41, NEQ=42, AND=43, OR=44, INC=45, DEC=46, ADD=47, 
		SUB=48, MUL=49, DIV=50, MOD=51, ADD_ASSIGN=52, SUB_ASSIGN=53, MUL_ASSIGN=54, 
		DIV_ASSIGN=55, ELLIPSIS=56, DECIMAL_LITERAL=57, FLOAT_LITERAL=58, BOOL_LITERAL=59, 
		CHAR_LITERAL=60, STRING_LITERAL=61, NULL_LITERAL=62, WS=63, COMMENT=64;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"BOOLEAN", "BREAK", "CASE", "CHAR", "CONST", "CONTINUE", "DEFAULT", "DO", 
			"ELSE", "FINAL", "FLOAT", "FOR", "IF", "INT", "MAIN", "RETURN", "STRING", 
			"SWITCH", "VOID", "WHILE", "INPUT", "OUTPUT", "IDENTIFIER", "LPAREN", 
			"RPAREN", "LBRACE", "RBRACE", "LBRACK", "RBRACK", "SEMI", "COMMA", "DOT", 
			"ASSIGN", "GT", "LT", "BANG", "QUESTION", "COLON", "EQUAL", "GEQ", "LEQ", 
			"NEQ", "AND", "OR", "INC", "DEC", "ADD", "SUB", "MUL", "DIV", "MOD", 
			"ADD_ASSIGN", "SUB_ASSIGN", "MUL_ASSIGN", "DIV_ASSIGN", "ELLIPSIS", "DECIMAL_LITERAL", 
			"FLOAT_LITERAL", "BOOL_LITERAL", "CHAR_LITERAL", "STRING_LITERAL", "NULL_LITERAL", 
			"EscapeSequence", "ExponentPart", "LetterOrDigit", "Digits", "Letter", 
			"WS", "COMMENT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'boolin'", "'cease'", "'option'", "'kachow'", "'fiber'", "'megaman'", 
			"'basic'", "'perform'", "'otherwise'", "'ultimate'", "'coke'", "'repeat'", 
			"'upon'", "'techies'", "'main'", "'respond'", "'thread'", "'choices'", 
			"'faceless'", "'during'", "'inputf'", "'outputf'", null, "'('", "')'", 
			"'{'", "'}'", "'['", "']'", "';'", "','", "'.'", "'='", "'>'", "'<'", 
			"'!'", "'?'", "':'", "'=='", "'>='", "'<='", "'!='", "'&&'", "'||'", 
			"'++'", "'--'", "'+'", "'-'", "'*'", "'/'", "'%'", "'+='", "'-='", "'*='", 
			"'/='", "'...'", null, null, null, null, null, "'null'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "BOOLEAN", "BREAK", "CASE", "CHAR", "CONST", "CONTINUE", "DEFAULT", 
			"DO", "ELSE", "FINAL", "FLOAT", "FOR", "IF", "INT", "MAIN", "RETURN", 
			"STRING", "SWITCH", "VOID", "WHILE", "INPUT", "OUTPUT", "IDENTIFIER", 
			"LPAREN", "RPAREN", "LBRACE", "RBRACE", "LBRACK", "RBRACK", "SEMI", "COMMA", 
			"DOT", "ASSIGN", "GT", "LT", "BANG", "QUESTION", "COLON", "EQUAL", "GEQ", 
			"LEQ", "NEQ", "AND", "OR", "INC", "DEC", "ADD", "SUB", "MUL", "DIV", 
			"MOD", "ADD_ASSIGN", "SUB_ASSIGN", "MUL_ASSIGN", "DIV_ASSIGN", "ELLIPSIS", 
			"DECIMAL_LITERAL", "FLOAT_LITERAL", "BOOL_LITERAL", "CHAR_LITERAL", "STRING_LITERAL", 
			"NULL_LITERAL", "WS", "COMMENT"
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


	public JSFMLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "JSFMLexer.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2B\u020f\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3"+
		"\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3"+
		"\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3"+
		"\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3"+
		"\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3"+
		"\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3"+
		"\30\3\30\7\30\u012e\n\30\f\30\16\30\u0131\13\30\3\31\3\31\3\32\3\32\3"+
		"\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3"+
		"#\3#\3$\3$\3%\3%\3&\3&\3\'\3\'\3(\3(\3(\3)\3)\3)\3*\3*\3*\3+\3+\3+\3,"+
		"\3,\3,\3-\3-\3-\3.\3.\3.\3/\3/\3/\3\60\3\60\3\61\3\61\3\62\3\62\3\63\3"+
		"\63\3\64\3\64\3\65\3\65\3\65\3\66\3\66\3\66\3\67\3\67\3\67\38\38\38\3"+
		"9\39\39\39\3:\3:\3:\5:\u0186\n:\3:\6:\u0189\n:\r:\16:\u018a\3:\5:\u018e"+
		"\n:\5:\u0190\n:\3:\5:\u0193\n:\3;\3;\3;\5;\u0198\n;\3;\3;\5;\u019c\n;"+
		"\3;\5;\u019f\n;\3;\5;\u01a2\n;\3;\3;\3;\5;\u01a7\n;\3;\5;\u01aa\n;\5;"+
		"\u01ac\n;\3<\3<\3<\3<\3<\3<\3<\3<\3<\5<\u01b7\n<\3=\3=\3=\5=\u01bc\n="+
		"\3=\3=\3>\3>\3>\7>\u01c3\n>\f>\16>\u01c6\13>\3>\3>\3?\3?\3?\3?\3?\3@\3"+
		"@\3@\3@\5@\u01d3\n@\3@\5@\u01d6\n@\3@\5@\u01d9\n@\3A\3A\5A\u01dd\nA\3"+
		"A\3A\3B\3B\5B\u01e3\nB\3C\3C\7C\u01e7\nC\fC\16C\u01ea\13C\3C\5C\u01ed"+
		"\nC\3D\3D\3E\6E\u01f2\nE\rE\16E\u01f3\3E\3E\3F\3F\3F\3F\7F\u01fc\nF\f"+
		"F\16F\u01ff\13F\3F\3F\3F\3F\3F\3F\7F\u0207\nF\fF\16F\u020a\13F\5F\u020c"+
		"\nF\3F\3F\3\u01fd\2G\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27"+
		"\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33"+
		"\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63"+
		"e\64g\65i\66k\67m8o9q:s;u<w=y>{?}@\177\2\u0081\2\u0083\2\u0085\2\u0087"+
		"\2\u0089A\u008bB\3\2\21\3\2\63;\4\2NNnn\6\2FFHHffhh\6\2\f\f\17\17))^^"+
		"\6\2\f\f\17\17$$^^\n\2$$))^^ddhhppttvv\3\2\62\65\3\2\629\4\2GGgg\4\2-"+
		"-//\3\2\62;\4\2\62;aa\6\2&&C\\aac|\5\2\13\f\16\17\"\"\4\2\f\f\17\17\2"+
		"\u0225\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2"+
		"\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3"+
		"\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2"+
		"\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2"+
		"/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2"+
		"\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2"+
		"G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3"+
		"\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2"+
		"\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2"+
		"m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3"+
		"\2\2\2\2{\3\2\2\2\2}\3\2\2\2\2\u0089\3\2\2\2\2\u008b\3\2\2\2\3\u008d\3"+
		"\2\2\2\5\u0094\3\2\2\2\7\u009a\3\2\2\2\t\u00a1\3\2\2\2\13\u00a8\3\2\2"+
		"\2\r\u00ae\3\2\2\2\17\u00b6\3\2\2\2\21\u00bc\3\2\2\2\23\u00c4\3\2\2\2"+
		"\25\u00ce\3\2\2\2\27\u00d7\3\2\2\2\31\u00dc\3\2\2\2\33\u00e3\3\2\2\2\35"+
		"\u00e8\3\2\2\2\37\u00f0\3\2\2\2!\u00f5\3\2\2\2#\u00fd\3\2\2\2%\u0104\3"+
		"\2\2\2\'\u010c\3\2\2\2)\u0115\3\2\2\2+\u011c\3\2\2\2-\u0123\3\2\2\2/\u012b"+
		"\3\2\2\2\61\u0132\3\2\2\2\63\u0134\3\2\2\2\65\u0136\3\2\2\2\67\u0138\3"+
		"\2\2\29\u013a\3\2\2\2;\u013c\3\2\2\2=\u013e\3\2\2\2?\u0140\3\2\2\2A\u0142"+
		"\3\2\2\2C\u0144\3\2\2\2E\u0146\3\2\2\2G\u0148\3\2\2\2I\u014a\3\2\2\2K"+
		"\u014c\3\2\2\2M\u014e\3\2\2\2O\u0150\3\2\2\2Q\u0153\3\2\2\2S\u0156\3\2"+
		"\2\2U\u0159\3\2\2\2W\u015c\3\2\2\2Y\u015f\3\2\2\2[\u0162\3\2\2\2]\u0165"+
		"\3\2\2\2_\u0168\3\2\2\2a\u016a\3\2\2\2c\u016c\3\2\2\2e\u016e\3\2\2\2g"+
		"\u0170\3\2\2\2i\u0172\3\2\2\2k\u0175\3\2\2\2m\u0178\3\2\2\2o\u017b\3\2"+
		"\2\2q\u017e\3\2\2\2s\u018f\3\2\2\2u\u01ab\3\2\2\2w\u01b6\3\2\2\2y\u01b8"+
		"\3\2\2\2{\u01bf\3\2\2\2}\u01c9\3\2\2\2\177\u01d8\3\2\2\2\u0081\u01da\3"+
		"\2\2\2\u0083\u01e2\3\2\2\2\u0085\u01e4\3\2\2\2\u0087\u01ee\3\2\2\2\u0089"+
		"\u01f1\3\2\2\2\u008b\u020b\3\2\2\2\u008d\u008e\7d\2\2\u008e\u008f\7q\2"+
		"\2\u008f\u0090\7q\2\2\u0090\u0091\7n\2\2\u0091\u0092\7k\2\2\u0092\u0093"+
		"\7p\2\2\u0093\4\3\2\2\2\u0094\u0095\7e\2\2\u0095\u0096\7g\2\2\u0096\u0097"+
		"\7c\2\2\u0097\u0098\7u\2\2\u0098\u0099\7g\2\2\u0099\6\3\2\2\2\u009a\u009b"+
		"\7q\2\2\u009b\u009c\7r\2\2\u009c\u009d\7v\2\2\u009d\u009e\7k\2\2\u009e"+
		"\u009f\7q\2\2\u009f\u00a0\7p\2\2\u00a0\b\3\2\2\2\u00a1\u00a2\7m\2\2\u00a2"+
		"\u00a3\7c\2\2\u00a3\u00a4\7e\2\2\u00a4\u00a5\7j\2\2\u00a5\u00a6\7q\2\2"+
		"\u00a6\u00a7\7y\2\2\u00a7\n\3\2\2\2\u00a8\u00a9\7h\2\2\u00a9\u00aa\7k"+
		"\2\2\u00aa\u00ab\7d\2\2\u00ab\u00ac\7g\2\2\u00ac\u00ad\7t\2\2\u00ad\f"+
		"\3\2\2\2\u00ae\u00af\7o\2\2\u00af\u00b0\7g\2\2\u00b0\u00b1\7i\2\2\u00b1"+
		"\u00b2\7c\2\2\u00b2\u00b3\7o\2\2\u00b3\u00b4\7c\2\2\u00b4\u00b5\7p\2\2"+
		"\u00b5\16\3\2\2\2\u00b6\u00b7\7d\2\2\u00b7\u00b8\7c\2\2\u00b8\u00b9\7"+
		"u\2\2\u00b9\u00ba\7k\2\2\u00ba\u00bb\7e\2\2\u00bb\20\3\2\2\2\u00bc\u00bd"+
		"\7r\2\2\u00bd\u00be\7g\2\2\u00be\u00bf\7t\2\2\u00bf\u00c0\7h\2\2\u00c0"+
		"\u00c1\7q\2\2\u00c1\u00c2\7t\2\2\u00c2\u00c3\7o\2\2\u00c3\22\3\2\2\2\u00c4"+
		"\u00c5\7q\2\2\u00c5\u00c6\7v\2\2\u00c6\u00c7\7j\2\2\u00c7\u00c8\7g\2\2"+
		"\u00c8\u00c9\7t\2\2\u00c9\u00ca\7y\2\2\u00ca\u00cb\7k\2\2\u00cb\u00cc"+
		"\7u\2\2\u00cc\u00cd\7g\2\2\u00cd\24\3\2\2\2\u00ce\u00cf\7w\2\2\u00cf\u00d0"+
		"\7n\2\2\u00d0\u00d1\7v\2\2\u00d1\u00d2\7k\2\2\u00d2\u00d3\7o\2\2\u00d3"+
		"\u00d4\7c\2\2\u00d4\u00d5\7v\2\2\u00d5\u00d6\7g\2\2\u00d6\26\3\2\2\2\u00d7"+
		"\u00d8\7e\2\2\u00d8\u00d9\7q\2\2\u00d9\u00da\7m\2\2\u00da\u00db\7g\2\2"+
		"\u00db\30\3\2\2\2\u00dc\u00dd\7t\2\2\u00dd\u00de\7g\2\2\u00de\u00df\7"+
		"r\2\2\u00df\u00e0\7g\2\2\u00e0\u00e1\7c\2\2\u00e1\u00e2\7v\2\2\u00e2\32"+
		"\3\2\2\2\u00e3\u00e4\7w\2\2\u00e4\u00e5\7r\2\2\u00e5\u00e6\7q\2\2\u00e6"+
		"\u00e7\7p\2\2\u00e7\34\3\2\2\2\u00e8\u00e9\7v\2\2\u00e9\u00ea\7g\2\2\u00ea"+
		"\u00eb\7e\2\2\u00eb\u00ec\7j\2\2\u00ec\u00ed\7k\2\2\u00ed\u00ee\7g\2\2"+
		"\u00ee\u00ef\7u\2\2\u00ef\36\3\2\2\2\u00f0\u00f1\7o\2\2\u00f1\u00f2\7"+
		"c\2\2\u00f2\u00f3\7k\2\2\u00f3\u00f4\7p\2\2\u00f4 \3\2\2\2\u00f5\u00f6"+
		"\7t\2\2\u00f6\u00f7\7g\2\2\u00f7\u00f8\7u\2\2\u00f8\u00f9\7r\2\2\u00f9"+
		"\u00fa\7q\2\2\u00fa\u00fb\7p\2\2\u00fb\u00fc\7f\2\2\u00fc\"\3\2\2\2\u00fd"+
		"\u00fe\7v\2\2\u00fe\u00ff\7j\2\2\u00ff\u0100\7t\2\2\u0100\u0101\7g\2\2"+
		"\u0101\u0102\7c\2\2\u0102\u0103\7f\2\2\u0103$\3\2\2\2\u0104\u0105\7e\2"+
		"\2\u0105\u0106\7j\2\2\u0106\u0107\7q\2\2\u0107\u0108\7k\2\2\u0108\u0109"+
		"\7e\2\2\u0109\u010a\7g\2\2\u010a\u010b\7u\2\2\u010b&\3\2\2\2\u010c\u010d"+
		"\7h\2\2\u010d\u010e\7c\2\2\u010e\u010f\7e\2\2\u010f\u0110\7g\2\2\u0110"+
		"\u0111\7n\2\2\u0111\u0112\7g\2\2\u0112\u0113\7u\2\2\u0113\u0114\7u\2\2"+
		"\u0114(\3\2\2\2\u0115\u0116\7f\2\2\u0116\u0117\7w\2\2\u0117\u0118\7t\2"+
		"\2\u0118\u0119\7k\2\2\u0119\u011a\7p\2\2\u011a\u011b\7i\2\2\u011b*\3\2"+
		"\2\2\u011c\u011d\7k\2\2\u011d\u011e\7p\2\2\u011e\u011f\7r\2\2\u011f\u0120"+
		"\7w\2\2\u0120\u0121\7v\2\2\u0121\u0122\7h\2\2\u0122,\3\2\2\2\u0123\u0124"+
		"\7q\2\2\u0124\u0125\7w\2\2\u0125\u0126\7v\2\2\u0126\u0127\7r\2\2\u0127"+
		"\u0128\7w\2\2\u0128\u0129\7v\2\2\u0129\u012a\7h\2\2\u012a.\3\2\2\2\u012b"+
		"\u012f\5\u0087D\2\u012c\u012e\5\u0083B\2\u012d\u012c\3\2\2\2\u012e\u0131"+
		"\3\2\2\2\u012f\u012d\3\2\2\2\u012f\u0130\3\2\2\2\u0130\60\3\2\2\2\u0131"+
		"\u012f\3\2\2\2\u0132\u0133\7*\2\2\u0133\62\3\2\2\2\u0134\u0135\7+\2\2"+
		"\u0135\64\3\2\2\2\u0136\u0137\7}\2\2\u0137\66\3\2\2\2\u0138\u0139\7\177"+
		"\2\2\u01398\3\2\2\2\u013a\u013b\7]\2\2\u013b:\3\2\2\2\u013c\u013d\7_\2"+
		"\2\u013d<\3\2\2\2\u013e\u013f\7=\2\2\u013f>\3\2\2\2\u0140\u0141\7.\2\2"+
		"\u0141@\3\2\2\2\u0142\u0143\7\60\2\2\u0143B\3\2\2\2\u0144\u0145\7?\2\2"+
		"\u0145D\3\2\2\2\u0146\u0147\7@\2\2\u0147F\3\2\2\2\u0148\u0149\7>\2\2\u0149"+
		"H\3\2\2\2\u014a\u014b\7#\2\2\u014bJ\3\2\2\2\u014c\u014d\7A\2\2\u014dL"+
		"\3\2\2\2\u014e\u014f\7<\2\2\u014fN\3\2\2\2\u0150\u0151\7?\2\2\u0151\u0152"+
		"\7?\2\2\u0152P\3\2\2\2\u0153\u0154\7@\2\2\u0154\u0155\7?\2\2\u0155R\3"+
		"\2\2\2\u0156\u0157\7>\2\2\u0157\u0158\7?\2\2\u0158T\3\2\2\2\u0159\u015a"+
		"\7#\2\2\u015a\u015b\7?\2\2\u015bV\3\2\2\2\u015c\u015d\7(\2\2\u015d\u015e"+
		"\7(\2\2\u015eX\3\2\2\2\u015f\u0160\7~\2\2\u0160\u0161\7~\2\2\u0161Z\3"+
		"\2\2\2\u0162\u0163\7-\2\2\u0163\u0164\7-\2\2\u0164\\\3\2\2\2\u0165\u0166"+
		"\7/\2\2\u0166\u0167\7/\2\2\u0167^\3\2\2\2\u0168\u0169\7-\2\2\u0169`\3"+
		"\2\2\2\u016a\u016b\7/\2\2\u016bb\3\2\2\2\u016c\u016d\7,\2\2\u016dd\3\2"+
		"\2\2\u016e\u016f\7\61\2\2\u016ff\3\2\2\2\u0170\u0171\7\'\2\2\u0171h\3"+
		"\2\2\2\u0172\u0173\7-\2\2\u0173\u0174\7?\2\2\u0174j\3\2\2\2\u0175\u0176"+
		"\7/\2\2\u0176\u0177\7?\2\2\u0177l\3\2\2\2\u0178\u0179\7,\2\2\u0179\u017a"+
		"\7?\2\2\u017an\3\2\2\2\u017b\u017c\7\61\2\2\u017c\u017d\7?\2\2\u017dp"+
		"\3\2\2\2\u017e\u017f\7\60\2\2\u017f\u0180\7\60\2\2\u0180\u0181\7\60\2"+
		"\2\u0181r\3\2\2\2\u0182\u0190\7\62\2\2\u0183\u018d\t\2\2\2\u0184\u0186"+
		"\5\u0085C\2\u0185\u0184\3\2\2\2\u0185\u0186\3\2\2\2\u0186\u018e\3\2\2"+
		"\2\u0187\u0189\7a\2\2\u0188\u0187\3\2\2\2\u0189\u018a\3\2\2\2\u018a\u0188"+
		"\3\2\2\2\u018a\u018b\3\2\2\2\u018b\u018c\3\2\2\2\u018c\u018e\5\u0085C"+
		"\2\u018d\u0185\3\2\2\2\u018d\u0188\3\2\2\2\u018e\u0190\3\2\2\2\u018f\u0182"+
		"\3\2\2\2\u018f\u0183\3\2\2\2\u0190\u0192\3\2\2\2\u0191\u0193\t\3\2\2\u0192"+
		"\u0191\3\2\2\2\u0192\u0193\3\2\2\2\u0193t\3\2\2\2\u0194\u0195\5\u0085"+
		"C\2\u0195\u0197\7\60\2\2\u0196\u0198\5\u0085C\2\u0197\u0196\3\2\2\2\u0197"+
		"\u0198\3\2\2\2\u0198\u019c\3\2\2\2\u0199\u019a\7\60\2\2\u019a\u019c\5"+
		"\u0085C\2\u019b\u0194\3\2\2\2\u019b\u0199\3\2\2\2\u019c\u019e\3\2\2\2"+
		"\u019d\u019f\5\u0081A\2\u019e\u019d\3\2\2\2\u019e\u019f\3\2\2\2\u019f"+
		"\u01a1\3\2\2\2\u01a0\u01a2\t\4\2\2\u01a1\u01a0\3\2\2\2\u01a1\u01a2\3\2"+
		"\2\2\u01a2\u01ac\3\2\2\2\u01a3\u01a9\5\u0085C\2\u01a4\u01a6\5\u0081A\2"+
		"\u01a5\u01a7\t\4\2\2\u01a6\u01a5\3\2\2\2\u01a6\u01a7\3\2\2\2\u01a7\u01aa"+
		"\3\2\2\2\u01a8\u01aa\t\4\2\2\u01a9\u01a4\3\2\2\2\u01a9\u01a8\3\2\2\2\u01aa"+
		"\u01ac\3\2\2\2\u01ab\u019b\3\2\2\2\u01ab\u01a3\3\2\2\2\u01acv\3\2\2\2"+
		"\u01ad\u01ae\7v\2\2\u01ae\u01af\7t\2\2\u01af\u01b0\7w\2\2\u01b0\u01b7"+
		"\7g\2\2\u01b1\u01b2\7h\2\2\u01b2\u01b3\7c\2\2\u01b3\u01b4\7n\2\2\u01b4"+
		"\u01b5\7u\2\2\u01b5\u01b7\7g\2\2\u01b6\u01ad\3\2\2\2\u01b6\u01b1\3\2\2"+
		"\2\u01b7x\3\2\2\2\u01b8\u01bb\7)\2\2\u01b9\u01bc\n\5\2\2\u01ba\u01bc\5"+
		"\177@\2\u01bb\u01b9\3\2\2\2\u01bb\u01ba\3\2\2\2\u01bc\u01bd\3\2\2\2\u01bd"+
		"\u01be\7)\2\2\u01bez\3\2\2\2\u01bf\u01c4\7$\2\2\u01c0\u01c3\n\6\2\2\u01c1"+
		"\u01c3\5\177@\2\u01c2\u01c0\3\2\2\2\u01c2\u01c1\3\2\2\2\u01c3\u01c6\3"+
		"\2\2\2\u01c4\u01c2\3\2\2\2\u01c4\u01c5\3\2\2\2\u01c5\u01c7\3\2\2\2\u01c6"+
		"\u01c4\3\2\2\2\u01c7\u01c8\7$\2\2\u01c8|\3\2\2\2\u01c9\u01ca\7p\2\2\u01ca"+
		"\u01cb\7w\2\2\u01cb\u01cc\7n\2\2\u01cc\u01cd\7n\2\2\u01cd~\3\2\2\2\u01ce"+
		"\u01cf\7^\2\2\u01cf\u01d9\t\7\2\2\u01d0\u01d5\7^\2\2\u01d1\u01d3\t\b\2"+
		"\2\u01d2\u01d1\3\2\2\2\u01d2\u01d3\3\2\2\2\u01d3\u01d4\3\2\2\2\u01d4\u01d6"+
		"\t\t\2\2\u01d5\u01d2\3\2\2\2\u01d5\u01d6\3\2\2\2\u01d6\u01d7\3\2\2\2\u01d7"+
		"\u01d9\t\t\2\2\u01d8\u01ce\3\2\2\2\u01d8\u01d0\3\2\2\2\u01d9\u0080\3\2"+
		"\2\2\u01da\u01dc\t\n\2\2\u01db\u01dd\t\13\2\2\u01dc\u01db\3\2\2\2\u01dc"+
		"\u01dd\3\2\2\2\u01dd\u01de\3\2\2\2\u01de\u01df\5\u0085C\2\u01df\u0082"+
		"\3\2\2\2\u01e0\u01e3\5\u0087D\2\u01e1\u01e3\t\f\2\2\u01e2\u01e0\3\2\2"+
		"\2\u01e2\u01e1\3\2\2\2\u01e3\u0084\3\2\2\2\u01e4\u01ec\t\f\2\2\u01e5\u01e7"+
		"\t\r\2\2\u01e6\u01e5\3\2\2\2\u01e7\u01ea\3\2\2\2\u01e8\u01e6\3\2\2\2\u01e8"+
		"\u01e9\3\2\2\2\u01e9\u01eb\3\2\2\2\u01ea\u01e8\3\2\2\2\u01eb\u01ed\t\f"+
		"\2\2\u01ec\u01e8\3\2\2\2\u01ec\u01ed\3\2\2\2\u01ed\u0086\3\2\2\2\u01ee"+
		"\u01ef\t\16\2\2\u01ef\u0088\3\2\2\2\u01f0\u01f2\t\17\2\2\u01f1\u01f0\3"+
		"\2\2\2\u01f2\u01f3\3\2\2\2\u01f3\u01f1\3\2\2\2\u01f3\u01f4\3\2\2\2\u01f4"+
		"\u01f5\3\2\2\2\u01f5\u01f6\bE\2\2\u01f6\u008a\3\2\2\2\u01f7\u01f8\7\61"+
		"\2\2\u01f8\u01f9\7,\2\2\u01f9\u01fd\3\2\2\2\u01fa\u01fc\13\2\2\2\u01fb"+
		"\u01fa\3\2\2\2\u01fc\u01ff\3\2\2\2\u01fd\u01fe\3\2\2\2\u01fd\u01fb\3\2"+
		"\2\2\u01fe\u0200\3\2\2\2\u01ff\u01fd\3\2\2\2\u0200\u0201\7,\2\2\u0201"+
		"\u020c\7\61\2\2\u0202\u0203\7\61\2\2\u0203\u0204\7\61\2\2\u0204\u0208"+
		"\3\2\2\2\u0205\u0207\n\20\2\2\u0206\u0205\3\2\2\2\u0207\u020a\3\2\2\2"+
		"\u0208\u0206\3\2\2\2\u0208\u0209\3\2\2\2\u0209\u020c\3\2\2\2\u020a\u0208"+
		"\3\2\2\2\u020b\u01f7\3\2\2\2\u020b\u0202\3\2\2\2\u020c\u020d\3\2\2\2\u020d"+
		"\u020e\bF\2\2\u020e\u008c\3\2\2\2\37\2\u012f\u0185\u018a\u018d\u018f\u0192"+
		"\u0197\u019b\u019e\u01a1\u01a6\u01a9\u01ab\u01b6\u01bb\u01c2\u01c4\u01d2"+
		"\u01d5\u01d8\u01dc\u01e2\u01e8\u01ec\u01f3\u01fd\u0208\u020b\3\2\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}