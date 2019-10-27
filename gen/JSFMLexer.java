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
		ELSE=9, FINAL=10, FLOAT=11, FOR=12, IF=13, INT=14, RETURN=15, STRING=16, 
		SWITCH=17, VOID=18, WHILE=19, INPUT=20, OUTPUT=21, IDENTIFIER=22, LPAREN=23, 
		RPAREN=24, LBRACE=25, RBRACE=26, LBRACK=27, RBRACK=28, SEMI=29, COMMA=30, 
		DOT=31, ASSIGN=32, GT=33, LT=34, BANG=35, QUESTION=36, COLON=37, EQUAL=38, 
		GEQ=39, LEQ=40, NEQ=41, AND=42, OR=43, INC=44, DEC=45, ADD=46, SUB=47, 
		MUL=48, DIV=49, MOD=50, ADD_ASSIGN=51, SUB_ASSIGN=52, MUL_ASSIGN=53, DIV_ASSIGN=54, 
		ELLIPSIS=55, DECIMAL_LITERAL=56, FLOAT_LITERAL=57, BOOL_LITERAL=58, CHAR_LITERAL=59, 
		STRING_LITERAL=60, NULL_LITERAL=61, EscapeSequence=62, ExponentPart=63, 
		LetterOrDigit=64, Digits=65, Letter=66, WS=67, COMMENT=68;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"BOOLEAN", "BREAK", "CASE", "CHAR", "CONST", "CONTINUE", "DEFAULT", "DO", 
			"ELSE", "FINAL", "FLOAT", "FOR", "IF", "INT", "RETURN", "STRING", "SWITCH", 
			"VOID", "WHILE", "INPUT", "OUTPUT", "IDENTIFIER", "LPAREN", "RPAREN", 
			"LBRACE", "RBRACE", "LBRACK", "RBRACK", "SEMI", "COMMA", "DOT", "ASSIGN", 
			"GT", "LT", "BANG", "QUESTION", "COLON", "EQUAL", "GEQ", "LEQ", "NEQ", 
			"AND", "OR", "INC", "DEC", "ADD", "SUB", "MUL", "DIV", "MOD", "ADD_ASSIGN", 
			"SUB_ASSIGN", "MUL_ASSIGN", "DIV_ASSIGN", "ELLIPSIS", "DECIMAL_LITERAL", 
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
			"'upon'", "'techies'", "'respond'", "'thread'", "'choices'", "'faceless'", 
			"'during'", "'inputf'", "'outputf'", null, "'('", "')'", "'{'", "'}'", 
			"'['", "']'", "';'", "','", "'.'", "'='", "'>'", "'<'", "'!'", "'?'", 
			"':'", "'=='", "'>='", "'<='", "'!='", "'&&'", "'||'", "'++'", "'--'", 
			"'+'", "'-'", "'*'", "'/'", "'%'", "'+='", "'-='", "'*='", "'/='", "'...'", 
			null, null, null, null, null, "'null'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "BOOLEAN", "BREAK", "CASE", "CHAR", "CONST", "CONTINUE", "DEFAULT", 
			"DO", "ELSE", "FINAL", "FLOAT", "FOR", "IF", "INT", "RETURN", "STRING", 
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2F\u0208\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16"+
		"\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\7\27\u0127\n\27\f\27\16"+
		"\27\u012a\13\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35"+
		"\3\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3$\3$\3%\3%\3&\3&"+
		"\3\'\3\'\3\'\3(\3(\3(\3)\3)\3)\3*\3*\3*\3+\3+\3+\3,\3,\3,\3-\3-\3-\3."+
		"\3.\3.\3/\3/\3\60\3\60\3\61\3\61\3\62\3\62\3\63\3\63\3\64\3\64\3\64\3"+
		"\65\3\65\3\65\3\66\3\66\3\66\3\67\3\67\3\67\38\38\38\38\39\39\39\59\u017f"+
		"\n9\39\69\u0182\n9\r9\169\u0183\39\59\u0187\n9\59\u0189\n9\39\59\u018c"+
		"\n9\3:\3:\3:\5:\u0191\n:\3:\3:\5:\u0195\n:\3:\5:\u0198\n:\3:\5:\u019b"+
		"\n:\3:\3:\3:\5:\u01a0\n:\3:\5:\u01a3\n:\5:\u01a5\n:\3;\3;\3;\3;\3;\3;"+
		"\3;\3;\3;\5;\u01b0\n;\3<\3<\3<\5<\u01b5\n<\3<\3<\3=\3=\3=\7=\u01bc\n="+
		"\f=\16=\u01bf\13=\3=\3=\3>\3>\3>\3>\3>\3?\3?\3?\3?\5?\u01cc\n?\3?\5?\u01cf"+
		"\n?\3?\5?\u01d2\n?\3@\3@\5@\u01d6\n@\3@\3@\3A\3A\5A\u01dc\nA\3B\3B\7B"+
		"\u01e0\nB\fB\16B\u01e3\13B\3B\5B\u01e6\nB\3C\3C\3D\6D\u01eb\nD\rD\16D"+
		"\u01ec\3D\3D\3E\3E\3E\3E\7E\u01f5\nE\fE\16E\u01f8\13E\3E\3E\3E\3E\3E\3"+
		"E\7E\u0200\nE\fE\16E\u0203\13E\5E\u0205\nE\3E\3E\3\u01f6\2F\3\3\5\4\7"+
		"\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22"+
		"#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C"+
		"#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65i\66k\67m8o9q:s;u<w"+
		"=y>{?}@\177A\u0081B\u0083C\u0085D\u0087E\u0089F\3\2\21\3\2\63;\4\2NNn"+
		"n\6\2FFHHffhh\6\2\f\f\17\17))^^\6\2\f\f\17\17$$^^\n\2$$))^^ddhhppttvv"+
		"\3\2\62\65\3\2\629\4\2GGgg\4\2--//\3\2\62;\4\2\62;aa\6\2&&C\\aac|\5\2"+
		"\13\f\16\17\"\"\4\2\f\f\17\17\2\u0223\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2"+
		"\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2"+
		"\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3"+
		"\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3"+
		"\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65"+
		"\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3"+
		"\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2"+
		"\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2"+
		"[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3"+
		"\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2"+
		"\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\2}\3\2\2\2\2\177\3\2\2"+
		"\2\2\u0081\3\2\2\2\2\u0083\3\2\2\2\2\u0085\3\2\2\2\2\u0087\3\2\2\2\2\u0089"+
		"\3\2\2\2\3\u008b\3\2\2\2\5\u0092\3\2\2\2\7\u0098\3\2\2\2\t\u009f\3\2\2"+
		"\2\13\u00a6\3\2\2\2\r\u00ac\3\2\2\2\17\u00b4\3\2\2\2\21\u00ba\3\2\2\2"+
		"\23\u00c2\3\2\2\2\25\u00cc\3\2\2\2\27\u00d5\3\2\2\2\31\u00da\3\2\2\2\33"+
		"\u00e1\3\2\2\2\35\u00e6\3\2\2\2\37\u00ee\3\2\2\2!\u00f6\3\2\2\2#\u00fd"+
		"\3\2\2\2%\u0105\3\2\2\2\'\u010e\3\2\2\2)\u0115\3\2\2\2+\u011c\3\2\2\2"+
		"-\u0124\3\2\2\2/\u012b\3\2\2\2\61\u012d\3\2\2\2\63\u012f\3\2\2\2\65\u0131"+
		"\3\2\2\2\67\u0133\3\2\2\29\u0135\3\2\2\2;\u0137\3\2\2\2=\u0139\3\2\2\2"+
		"?\u013b\3\2\2\2A\u013d\3\2\2\2C\u013f\3\2\2\2E\u0141\3\2\2\2G\u0143\3"+
		"\2\2\2I\u0145\3\2\2\2K\u0147\3\2\2\2M\u0149\3\2\2\2O\u014c\3\2\2\2Q\u014f"+
		"\3\2\2\2S\u0152\3\2\2\2U\u0155\3\2\2\2W\u0158\3\2\2\2Y\u015b\3\2\2\2["+
		"\u015e\3\2\2\2]\u0161\3\2\2\2_\u0163\3\2\2\2a\u0165\3\2\2\2c\u0167\3\2"+
		"\2\2e\u0169\3\2\2\2g\u016b\3\2\2\2i\u016e\3\2\2\2k\u0171\3\2\2\2m\u0174"+
		"\3\2\2\2o\u0177\3\2\2\2q\u0188\3\2\2\2s\u01a4\3\2\2\2u\u01af\3\2\2\2w"+
		"\u01b1\3\2\2\2y\u01b8\3\2\2\2{\u01c2\3\2\2\2}\u01d1\3\2\2\2\177\u01d3"+
		"\3\2\2\2\u0081\u01db\3\2\2\2\u0083\u01dd\3\2\2\2\u0085\u01e7\3\2\2\2\u0087"+
		"\u01ea\3\2\2\2\u0089\u0204\3\2\2\2\u008b\u008c\7d\2\2\u008c\u008d\7q\2"+
		"\2\u008d\u008e\7q\2\2\u008e\u008f\7n\2\2\u008f\u0090\7k\2\2\u0090\u0091"+
		"\7p\2\2\u0091\4\3\2\2\2\u0092\u0093\7e\2\2\u0093\u0094\7g\2\2\u0094\u0095"+
		"\7c\2\2\u0095\u0096\7u\2\2\u0096\u0097\7g\2\2\u0097\6\3\2\2\2\u0098\u0099"+
		"\7q\2\2\u0099\u009a\7r\2\2\u009a\u009b\7v\2\2\u009b\u009c\7k\2\2\u009c"+
		"\u009d\7q\2\2\u009d\u009e\7p\2\2\u009e\b\3\2\2\2\u009f\u00a0\7m\2\2\u00a0"+
		"\u00a1\7c\2\2\u00a1\u00a2\7e\2\2\u00a2\u00a3\7j\2\2\u00a3\u00a4\7q\2\2"+
		"\u00a4\u00a5\7y\2\2\u00a5\n\3\2\2\2\u00a6\u00a7\7h\2\2\u00a7\u00a8\7k"+
		"\2\2\u00a8\u00a9\7d\2\2\u00a9\u00aa\7g\2\2\u00aa\u00ab\7t\2\2\u00ab\f"+
		"\3\2\2\2\u00ac\u00ad\7o\2\2\u00ad\u00ae\7g\2\2\u00ae\u00af\7i\2\2\u00af"+
		"\u00b0\7c\2\2\u00b0\u00b1\7o\2\2\u00b1\u00b2\7c\2\2\u00b2\u00b3\7p\2\2"+
		"\u00b3\16\3\2\2\2\u00b4\u00b5\7d\2\2\u00b5\u00b6\7c\2\2\u00b6\u00b7\7"+
		"u\2\2\u00b7\u00b8\7k\2\2\u00b8\u00b9\7e\2\2\u00b9\20\3\2\2\2\u00ba\u00bb"+
		"\7r\2\2\u00bb\u00bc\7g\2\2\u00bc\u00bd\7t\2\2\u00bd\u00be\7h\2\2\u00be"+
		"\u00bf\7q\2\2\u00bf\u00c0\7t\2\2\u00c0\u00c1\7o\2\2\u00c1\22\3\2\2\2\u00c2"+
		"\u00c3\7q\2\2\u00c3\u00c4\7v\2\2\u00c4\u00c5\7j\2\2\u00c5\u00c6\7g\2\2"+
		"\u00c6\u00c7\7t\2\2\u00c7\u00c8\7y\2\2\u00c8\u00c9\7k\2\2\u00c9\u00ca"+
		"\7u\2\2\u00ca\u00cb\7g\2\2\u00cb\24\3\2\2\2\u00cc\u00cd\7w\2\2\u00cd\u00ce"+
		"\7n\2\2\u00ce\u00cf\7v\2\2\u00cf\u00d0\7k\2\2\u00d0\u00d1\7o\2\2\u00d1"+
		"\u00d2\7c\2\2\u00d2\u00d3\7v\2\2\u00d3\u00d4\7g\2\2\u00d4\26\3\2\2\2\u00d5"+
		"\u00d6\7e\2\2\u00d6\u00d7\7q\2\2\u00d7\u00d8\7m\2\2\u00d8\u00d9\7g\2\2"+
		"\u00d9\30\3\2\2\2\u00da\u00db\7t\2\2\u00db\u00dc\7g\2\2\u00dc\u00dd\7"+
		"r\2\2\u00dd\u00de\7g\2\2\u00de\u00df\7c\2\2\u00df\u00e0\7v\2\2\u00e0\32"+
		"\3\2\2\2\u00e1\u00e2\7w\2\2\u00e2\u00e3\7r\2\2\u00e3\u00e4\7q\2\2\u00e4"+
		"\u00e5\7p\2\2\u00e5\34\3\2\2\2\u00e6\u00e7\7v\2\2\u00e7\u00e8\7g\2\2\u00e8"+
		"\u00e9\7e\2\2\u00e9\u00ea\7j\2\2\u00ea\u00eb\7k\2\2\u00eb\u00ec\7g\2\2"+
		"\u00ec\u00ed\7u\2\2\u00ed\36\3\2\2\2\u00ee\u00ef\7t\2\2\u00ef\u00f0\7"+
		"g\2\2\u00f0\u00f1\7u\2\2\u00f1\u00f2\7r\2\2\u00f2\u00f3\7q\2\2\u00f3\u00f4"+
		"\7p\2\2\u00f4\u00f5\7f\2\2\u00f5 \3\2\2\2\u00f6\u00f7\7v\2\2\u00f7\u00f8"+
		"\7j\2\2\u00f8\u00f9\7t\2\2\u00f9\u00fa\7g\2\2\u00fa\u00fb\7c\2\2\u00fb"+
		"\u00fc\7f\2\2\u00fc\"\3\2\2\2\u00fd\u00fe\7e\2\2\u00fe\u00ff\7j\2\2\u00ff"+
		"\u0100\7q\2\2\u0100\u0101\7k\2\2\u0101\u0102\7e\2\2\u0102\u0103\7g\2\2"+
		"\u0103\u0104\7u\2\2\u0104$\3\2\2\2\u0105\u0106\7h\2\2\u0106\u0107\7c\2"+
		"\2\u0107\u0108\7e\2\2\u0108\u0109\7g\2\2\u0109\u010a\7n\2\2\u010a\u010b"+
		"\7g\2\2\u010b\u010c\7u\2\2\u010c\u010d\7u\2\2\u010d&\3\2\2\2\u010e\u010f"+
		"\7f\2\2\u010f\u0110\7w\2\2\u0110\u0111\7t\2\2\u0111\u0112\7k\2\2\u0112"+
		"\u0113\7p\2\2\u0113\u0114\7i\2\2\u0114(\3\2\2\2\u0115\u0116\7k\2\2\u0116"+
		"\u0117\7p\2\2\u0117\u0118\7r\2\2\u0118\u0119\7w\2\2\u0119\u011a\7v\2\2"+
		"\u011a\u011b\7h\2\2\u011b*\3\2\2\2\u011c\u011d\7q\2\2\u011d\u011e\7w\2"+
		"\2\u011e\u011f\7v\2\2\u011f\u0120\7r\2\2\u0120\u0121\7w\2\2\u0121\u0122"+
		"\7v\2\2\u0122\u0123\7h\2\2\u0123,\3\2\2\2\u0124\u0128\5\u0085C\2\u0125"+
		"\u0127\5\u0081A\2\u0126\u0125\3\2\2\2\u0127\u012a\3\2\2\2\u0128\u0126"+
		"\3\2\2\2\u0128\u0129\3\2\2\2\u0129.\3\2\2\2\u012a\u0128\3\2\2\2\u012b"+
		"\u012c\7*\2\2\u012c\60\3\2\2\2\u012d\u012e\7+\2\2\u012e\62\3\2\2\2\u012f"+
		"\u0130\7}\2\2\u0130\64\3\2\2\2\u0131\u0132\7\177\2\2\u0132\66\3\2\2\2"+
		"\u0133\u0134\7]\2\2\u01348\3\2\2\2\u0135\u0136\7_\2\2\u0136:\3\2\2\2\u0137"+
		"\u0138\7=\2\2\u0138<\3\2\2\2\u0139\u013a\7.\2\2\u013a>\3\2\2\2\u013b\u013c"+
		"\7\60\2\2\u013c@\3\2\2\2\u013d\u013e\7?\2\2\u013eB\3\2\2\2\u013f\u0140"+
		"\7@\2\2\u0140D\3\2\2\2\u0141\u0142\7>\2\2\u0142F\3\2\2\2\u0143\u0144\7"+
		"#\2\2\u0144H\3\2\2\2\u0145\u0146\7A\2\2\u0146J\3\2\2\2\u0147\u0148\7<"+
		"\2\2\u0148L\3\2\2\2\u0149\u014a\7?\2\2\u014a\u014b\7?\2\2\u014bN\3\2\2"+
		"\2\u014c\u014d\7@\2\2\u014d\u014e\7?\2\2\u014eP\3\2\2\2\u014f\u0150\7"+
		">\2\2\u0150\u0151\7?\2\2\u0151R\3\2\2\2\u0152\u0153\7#\2\2\u0153\u0154"+
		"\7?\2\2\u0154T\3\2\2\2\u0155\u0156\7(\2\2\u0156\u0157\7(\2\2\u0157V\3"+
		"\2\2\2\u0158\u0159\7~\2\2\u0159\u015a\7~\2\2\u015aX\3\2\2\2\u015b\u015c"+
		"\7-\2\2\u015c\u015d\7-\2\2\u015dZ\3\2\2\2\u015e\u015f\7/\2\2\u015f\u0160"+
		"\7/\2\2\u0160\\\3\2\2\2\u0161\u0162\7-\2\2\u0162^\3\2\2\2\u0163\u0164"+
		"\7/\2\2\u0164`\3\2\2\2\u0165\u0166\7,\2\2\u0166b\3\2\2\2\u0167\u0168\7"+
		"\61\2\2\u0168d\3\2\2\2\u0169\u016a\7\'\2\2\u016af\3\2\2\2\u016b\u016c"+
		"\7-\2\2\u016c\u016d\7?\2\2\u016dh\3\2\2\2\u016e\u016f\7/\2\2\u016f\u0170"+
		"\7?\2\2\u0170j\3\2\2\2\u0171\u0172\7,\2\2\u0172\u0173\7?\2\2\u0173l\3"+
		"\2\2\2\u0174\u0175\7\61\2\2\u0175\u0176\7?\2\2\u0176n\3\2\2\2\u0177\u0178"+
		"\7\60\2\2\u0178\u0179\7\60\2\2\u0179\u017a\7\60\2\2\u017ap\3\2\2\2\u017b"+
		"\u0189\7\62\2\2\u017c\u0186\t\2\2\2\u017d\u017f\5\u0083B\2\u017e\u017d"+
		"\3\2\2\2\u017e\u017f\3\2\2\2\u017f\u0187\3\2\2\2\u0180\u0182\7a\2\2\u0181"+
		"\u0180\3\2\2\2\u0182\u0183\3\2\2\2\u0183\u0181\3\2\2\2\u0183\u0184\3\2"+
		"\2\2\u0184\u0185\3\2\2\2\u0185\u0187\5\u0083B\2\u0186\u017e\3\2\2\2\u0186"+
		"\u0181\3\2\2\2\u0187\u0189\3\2\2\2\u0188\u017b\3\2\2\2\u0188\u017c\3\2"+
		"\2\2\u0189\u018b\3\2\2\2\u018a\u018c\t\3\2\2\u018b\u018a\3\2\2\2\u018b"+
		"\u018c\3\2\2\2\u018cr\3\2\2\2\u018d\u018e\5\u0083B\2\u018e\u0190\7\60"+
		"\2\2\u018f\u0191\5\u0083B\2\u0190\u018f\3\2\2\2\u0190\u0191\3\2\2\2\u0191"+
		"\u0195\3\2\2\2\u0192\u0193\7\60\2\2\u0193\u0195\5\u0083B\2\u0194\u018d"+
		"\3\2\2\2\u0194\u0192\3\2\2\2\u0195\u0197\3\2\2\2\u0196\u0198\5\177@\2"+
		"\u0197\u0196\3\2\2\2\u0197\u0198\3\2\2\2\u0198\u019a\3\2\2\2\u0199\u019b"+
		"\t\4\2\2\u019a\u0199\3\2\2\2\u019a\u019b\3\2\2\2\u019b\u01a5\3\2\2\2\u019c"+
		"\u01a2\5\u0083B\2\u019d\u019f\5\177@\2\u019e\u01a0\t\4\2\2\u019f\u019e"+
		"\3\2\2\2\u019f\u01a0\3\2\2\2\u01a0\u01a3\3\2\2\2\u01a1\u01a3\t\4\2\2\u01a2"+
		"\u019d\3\2\2\2\u01a2\u01a1\3\2\2\2\u01a3\u01a5\3\2\2\2\u01a4\u0194\3\2"+
		"\2\2\u01a4\u019c\3\2\2\2\u01a5t\3\2\2\2\u01a6\u01a7\7v\2\2\u01a7\u01a8"+
		"\7t\2\2\u01a8\u01a9\7w\2\2\u01a9\u01b0\7g\2\2\u01aa\u01ab\7h\2\2\u01ab"+
		"\u01ac\7c\2\2\u01ac\u01ad\7n\2\2\u01ad\u01ae\7u\2\2\u01ae\u01b0\7g\2\2"+
		"\u01af\u01a6\3\2\2\2\u01af\u01aa\3\2\2\2\u01b0v\3\2\2\2\u01b1\u01b4\7"+
		")\2\2\u01b2\u01b5\n\5\2\2\u01b3\u01b5\5}?\2\u01b4\u01b2\3\2\2\2\u01b4"+
		"\u01b3\3\2\2\2\u01b5\u01b6\3\2\2\2\u01b6\u01b7\7)\2\2\u01b7x\3\2\2\2\u01b8"+
		"\u01bd\7$\2\2\u01b9\u01bc\n\6\2\2\u01ba\u01bc\5}?\2\u01bb\u01b9\3\2\2"+
		"\2\u01bb\u01ba\3\2\2\2\u01bc\u01bf\3\2\2\2\u01bd\u01bb\3\2\2\2\u01bd\u01be"+
		"\3\2\2\2\u01be\u01c0\3\2\2\2\u01bf\u01bd\3\2\2\2\u01c0\u01c1\7$\2\2\u01c1"+
		"z\3\2\2\2\u01c2\u01c3\7p\2\2\u01c3\u01c4\7w\2\2\u01c4\u01c5\7n\2\2\u01c5"+
		"\u01c6\7n\2\2\u01c6|\3\2\2\2\u01c7\u01c8\7^\2\2\u01c8\u01d2\t\7\2\2\u01c9"+
		"\u01ce\7^\2\2\u01ca\u01cc\t\b\2\2\u01cb\u01ca\3\2\2\2\u01cb\u01cc\3\2"+
		"\2\2\u01cc\u01cd\3\2\2\2\u01cd\u01cf\t\t\2\2\u01ce\u01cb\3\2\2\2\u01ce"+
		"\u01cf\3\2\2\2\u01cf\u01d0\3\2\2\2\u01d0\u01d2\t\t\2\2\u01d1\u01c7\3\2"+
		"\2\2\u01d1\u01c9\3\2\2\2\u01d2~\3\2\2\2\u01d3\u01d5\t\n\2\2\u01d4\u01d6"+
		"\t\13\2\2\u01d5\u01d4\3\2\2\2\u01d5\u01d6\3\2\2\2\u01d6\u01d7\3\2\2\2"+
		"\u01d7\u01d8\5\u0083B\2\u01d8\u0080\3\2\2\2\u01d9\u01dc\5\u0085C\2\u01da"+
		"\u01dc\t\f\2\2\u01db\u01d9\3\2\2\2\u01db\u01da\3\2\2\2\u01dc\u0082\3\2"+
		"\2\2\u01dd\u01e5\t\f\2\2\u01de\u01e0\t\r\2\2\u01df\u01de\3\2\2\2\u01e0"+
		"\u01e3\3\2\2\2\u01e1\u01df\3\2\2\2\u01e1\u01e2\3\2\2\2\u01e2\u01e4\3\2"+
		"\2\2\u01e3\u01e1\3\2\2\2\u01e4\u01e6\t\f\2\2\u01e5\u01e1\3\2\2\2\u01e5"+
		"\u01e6\3\2\2\2\u01e6\u0084\3\2\2\2\u01e7\u01e8\t\16\2\2\u01e8\u0086\3"+
		"\2\2\2\u01e9\u01eb\t\17\2\2\u01ea\u01e9\3\2\2\2\u01eb\u01ec\3\2\2\2\u01ec"+
		"\u01ea\3\2\2\2\u01ec\u01ed\3\2\2\2\u01ed\u01ee\3\2\2\2\u01ee\u01ef\bD"+
		"\2\2\u01ef\u0088\3\2\2\2\u01f0\u01f1\7\61\2\2\u01f1\u01f2\7,\2\2\u01f2"+
		"\u01f6\3\2\2\2\u01f3\u01f5\13\2\2\2\u01f4\u01f3\3\2\2\2\u01f5\u01f8\3"+
		"\2\2\2\u01f6\u01f7\3\2\2\2\u01f6\u01f4\3\2\2\2\u01f7\u01f9\3\2\2\2\u01f8"+
		"\u01f6\3\2\2\2\u01f9\u01fa\7,\2\2\u01fa\u0205\7\61\2\2\u01fb\u01fc\7\61"+
		"\2\2\u01fc\u01fd\7\61\2\2\u01fd\u0201\3\2\2\2\u01fe\u0200\n\20\2\2\u01ff"+
		"\u01fe\3\2\2\2\u0200\u0203\3\2\2\2\u0201\u01ff\3\2\2\2\u0201\u0202\3\2"+
		"\2\2\u0202\u0205\3\2\2\2\u0203\u0201\3\2\2\2\u0204\u01f0\3\2\2\2\u0204"+
		"\u01fb\3\2\2\2\u0205\u0206\3\2\2\2\u0206\u0207\bE\2\2\u0207\u008a\3\2"+
		"\2\2\37\2\u0128\u017e\u0183\u0186\u0188\u018b\u0190\u0194\u0197\u019a"+
		"\u019f\u01a2\u01a4\u01af\u01b4\u01bb\u01bd\u01cb\u01ce\u01d1\u01d5\u01db"+
		"\u01e1\u01e5\u01ec\u01f6\u0201\u0204\3\2\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}