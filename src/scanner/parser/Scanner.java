// Generated from C:/Users/Shan/Documents/GitHub/CMPILER-SCANNER/src\Scanner.g4 by ANTLR 4.7.2
package scanner.parser;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class Scanner extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		KEYWORD=1, IDENTIFIER=2, SEPARATOR=3, OPERATOR=4, DECIMAL_LITERAL=5, FLOAT_LITERAL=6, 
		BOOL_LITERAL=7, CHAR_LITERAL=8, STRING_LITERAL=9, NULL_LITERAL=10, LetterOrDigit=11, 
		EscapeSequence=12, ExponentPart=13, Digits=14, Letter=15, WS=16, COMMENT=17;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"KEYWORD", "IDENTIFIER", "SEPARATOR", "OPERATOR", "DECIMAL_LITERAL", 
			"FLOAT_LITERAL", "BOOL_LITERAL", "CHAR_LITERAL", "STRING_LITERAL", "NULL_LITERAL", 
			"LetterOrDigit", "EscapeSequence", "ExponentPart", "Digits", "Letter", 
			"WS", "COMMENT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, "'null'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "KEYWORD", "IDENTIFIER", "SEPARATOR", "OPERATOR", "DECIMAL_LITERAL", 
			"FLOAT_LITERAL", "BOOL_LITERAL", "CHAR_LITERAL", "STRING_LITERAL", "NULL_LITERAL", 
			"LetterOrDigit", "EscapeSequence", "ExponentPart", "Digits", "Letter", 
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


	public Scanner(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Scanner.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\23\u0158\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\5\2\u00a5\n\2\3\3\3\3\7\3\u00a9\n\3\f\3\16\3"+
		"\u00ac\13\3\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\u00ca\n\5\3"+
		"\6\3\6\3\6\5\6\u00cf\n\6\3\6\6\6\u00d2\n\6\r\6\16\6\u00d3\3\6\5\6\u00d7"+
		"\n\6\5\6\u00d9\n\6\3\6\5\6\u00dc\n\6\3\7\3\7\3\7\5\7\u00e1\n\7\3\7\3\7"+
		"\5\7\u00e5\n\7\3\7\5\7\u00e8\n\7\3\7\5\7\u00eb\n\7\3\7\3\7\3\7\5\7\u00f0"+
		"\n\7\3\7\5\7\u00f3\n\7\5\7\u00f5\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\5\b\u0100\n\b\3\t\3\t\3\t\5\t\u0105\n\t\3\t\3\t\3\n\3\n\3\n\7\n\u010c"+
		"\n\n\f\n\16\n\u010f\13\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\f\3\f\5\f"+
		"\u011a\n\f\3\r\3\r\3\r\3\r\5\r\u0120\n\r\3\r\5\r\u0123\n\r\3\r\5\r\u0126"+
		"\n\r\3\16\3\16\5\16\u012a\n\16\3\16\3\16\3\17\3\17\7\17\u0130\n\17\f\17"+
		"\16\17\u0133\13\17\3\17\5\17\u0136\n\17\3\20\3\20\3\21\6\21\u013b\n\21"+
		"\r\21\16\21\u013c\3\21\3\21\3\22\3\22\3\22\3\22\7\22\u0145\n\22\f\22\16"+
		"\22\u0148\13\22\3\22\3\22\3\22\3\22\3\22\3\22\7\22\u0150\n\22\f\22\16"+
		"\22\u0153\13\22\5\22\u0155\n\22\3\22\3\22\3\u0146\2\23\3\3\5\4\7\5\t\6"+
		"\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23\3"+
		"\2\24\n\2*+..\60\60==]]__}}\177\177\5\2##<<>@\6\2\'\',-//\61\61\3\2\63"+
		";\4\2NNnn\6\2FFHHffhh\6\2\f\f\17\17))^^\6\2\f\f\17\17$$^^\3\2\62;\n\2"+
		"$$))^^ddhhppttvv\3\2\62\65\3\2\629\4\2GGgg\4\2--//\4\2\62;aa\6\2&&C\\"+
		"aac|\5\2\13\f\16\17\"\"\4\2\f\f\17\17\2\u0193\2\3\3\2\2\2\2\5\3\2\2\2"+
		"\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3"+
		"\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2"+
		"\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\3\u00a4\3\2\2\2\5\u00a6"+
		"\3\2\2\2\7\u00ad\3\2\2\2\t\u00c9\3\2\2\2\13\u00d8\3\2\2\2\r\u00f4\3\2"+
		"\2\2\17\u00ff\3\2\2\2\21\u0101\3\2\2\2\23\u0108\3\2\2\2\25\u0112\3\2\2"+
		"\2\27\u0119\3\2\2\2\31\u0125\3\2\2\2\33\u0127\3\2\2\2\35\u012d\3\2\2\2"+
		"\37\u0137\3\2\2\2!\u013a\3\2\2\2#\u0154\3\2\2\2%&\7d\2\2&\'\7q\2\2\'("+
		"\7q\2\2()\7n\2\2)*\7k\2\2*\u00a5\7p\2\2+,\7e\2\2,-\7g\2\2-.\7c\2\2./\7"+
		"u\2\2/\u00a5\7g\2\2\60\61\7q\2\2\61\62\7r\2\2\62\63\7v\2\2\63\64\7k\2"+
		"\2\64\65\7q\2\2\65\u00a5\7p\2\2\66\67\7m\2\2\678\7c\2\289\7e\2\29:\7j"+
		"\2\2:;\7q\2\2;\u00a5\7y\2\2<=\7h\2\2=>\7k\2\2>?\7d\2\2?@\7g\2\2@\u00a5"+
		"\7t\2\2AB\7o\2\2BC\7g\2\2CD\7i\2\2DE\7c\2\2EF\7o\2\2FG\7c\2\2G\u00a5\7"+
		"p\2\2HI\7r\2\2IJ\7g\2\2JK\7t\2\2KL\7h\2\2LM\7q\2\2MN\7t\2\2N\u00a5\7o"+
		"\2\2OP\7q\2\2PQ\7v\2\2QR\7j\2\2RS\7g\2\2ST\7t\2\2TU\7y\2\2UV\7k\2\2VW"+
		"\7u\2\2W\u00a5\7g\2\2XY\7w\2\2YZ\7n\2\2Z[\7v\2\2[\\\7k\2\2\\]\7o\2\2]"+
		"^\7c\2\2^_\7v\2\2_\u00a5\7g\2\2`a\7e\2\2ab\7q\2\2bc\7m\2\2c\u00a5\7g\2"+
		"\2de\7t\2\2ef\7g\2\2fg\7r\2\2gh\7g\2\2hi\7c\2\2i\u00a5\7v\2\2jk\7w\2\2"+
		"kl\7r\2\2lm\7q\2\2m\u00a5\7p\2\2no\7v\2\2op\7g\2\2pq\7e\2\2qr\7j\2\2r"+
		"s\7k\2\2st\7g\2\2t\u00a5\7u\2\2uv\7t\2\2vw\7g\2\2wx\7u\2\2xy\7r\2\2yz"+
		"\7q\2\2z{\7p\2\2{\u00a5\7f\2\2|}\7e\2\2}~\7j\2\2~\177\7q\2\2\177\u0080"+
		"\7k\2\2\u0080\u0081\7e\2\2\u0081\u0082\7g\2\2\u0082\u00a5\7u\2\2\u0083"+
		"\u0084\7h\2\2\u0084\u0085\7c\2\2\u0085\u0086\7e\2\2\u0086\u0087\7g\2\2"+
		"\u0087\u0088\7n\2\2\u0088\u0089\7g\2\2\u0089\u008a\7u\2\2\u008a\u00a5"+
		"\7u\2\2\u008b\u008c\7f\2\2\u008c\u008d\7w\2\2\u008d\u008e\7t\2\2\u008e"+
		"\u008f\7k\2\2\u008f\u0090\7p\2\2\u0090\u00a5\7i\2\2\u0091\u0092\7U\2\2"+
		"\u0092\u0093\7v\2\2\u0093\u0094\7t\2\2\u0094\u0095\7k\2\2\u0095\u0096"+
		"\7p\2\2\u0096\u00a5\7i\2\2\u0097\u0098\7q\2\2\u0098\u0099\7w\2\2\u0099"+
		"\u009a\7v\2\2\u009a\u009b\7r\2\2\u009b\u009c\7w\2\2\u009c\u009d\7v\2\2"+
		"\u009d\u00a5\7h\2\2\u009e\u009f\7k\2\2\u009f\u00a0\7p\2\2\u00a0\u00a1"+
		"\7r\2\2\u00a1\u00a2\7w\2\2\u00a2\u00a3\7v\2\2\u00a3\u00a5\7h\2\2\u00a4"+
		"%\3\2\2\2\u00a4+\3\2\2\2\u00a4\60\3\2\2\2\u00a4\66\3\2\2\2\u00a4<\3\2"+
		"\2\2\u00a4A\3\2\2\2\u00a4H\3\2\2\2\u00a4O\3\2\2\2\u00a4X\3\2\2\2\u00a4"+
		"`\3\2\2\2\u00a4d\3\2\2\2\u00a4j\3\2\2\2\u00a4n\3\2\2\2\u00a4u\3\2\2\2"+
		"\u00a4|\3\2\2\2\u00a4\u0083\3\2\2\2\u00a4\u008b\3\2\2\2\u00a4\u0091\3"+
		"\2\2\2\u00a4\u0097\3\2\2\2\u00a4\u009e\3\2\2\2\u00a5\4\3\2\2\2\u00a6\u00aa"+
		"\5\37\20\2\u00a7\u00a9\5\27\f\2\u00a8\u00a7\3\2\2\2\u00a9\u00ac\3\2\2"+
		"\2\u00aa\u00a8\3\2\2\2\u00aa\u00ab\3\2\2\2\u00ab\6\3\2\2\2\u00ac\u00aa"+
		"\3\2\2\2\u00ad\u00ae\t\2\2\2\u00ae\b\3\2\2\2\u00af\u00ca\t\3\2\2\u00b0"+
		"\u00b1\7?\2\2\u00b1\u00ca\7?\2\2\u00b2\u00b3\7>\2\2\u00b3\u00ca\7?\2\2"+
		"\u00b4\u00b5\7@\2\2\u00b5\u00ca\7?\2\2\u00b6\u00b7\7#\2\2\u00b7\u00ca"+
		"\7?\2\2\u00b8\u00b9\7(\2\2\u00b9\u00ca\7(\2\2\u00ba\u00bb\7~\2\2\u00bb"+
		"\u00ca\7~\2\2\u00bc\u00bd\7-\2\2\u00bd\u00ca\7-\2\2\u00be\u00bf\7/\2\2"+
		"\u00bf\u00ca\7/\2\2\u00c0\u00ca\t\4\2\2\u00c1\u00c2\7-\2\2\u00c2\u00ca"+
		"\7?\2\2\u00c3\u00c4\7/\2\2\u00c4\u00ca\7?\2\2\u00c5\u00c6\7,\2\2\u00c6"+
		"\u00ca\7?\2\2\u00c7\u00c8\7\61\2\2\u00c8\u00ca\7?\2\2\u00c9\u00af\3\2"+
		"\2\2\u00c9\u00b0\3\2\2\2\u00c9\u00b2\3\2\2\2\u00c9\u00b4\3\2\2\2\u00c9"+
		"\u00b6\3\2\2\2\u00c9\u00b8\3\2\2\2\u00c9\u00ba\3\2\2\2\u00c9\u00bc\3\2"+
		"\2\2\u00c9\u00be\3\2\2\2\u00c9\u00c0\3\2\2\2\u00c9\u00c1\3\2\2\2\u00c9"+
		"\u00c3\3\2\2\2\u00c9\u00c5\3\2\2\2\u00c9\u00c7\3\2\2\2\u00ca\n\3\2\2\2"+
		"\u00cb\u00d9\7\62\2\2\u00cc\u00d6\t\5\2\2\u00cd\u00cf\5\35\17\2\u00ce"+
		"\u00cd\3\2\2\2\u00ce\u00cf\3\2\2\2\u00cf\u00d7\3\2\2\2\u00d0\u00d2\7a"+
		"\2\2\u00d1\u00d0\3\2\2\2\u00d2\u00d3\3\2\2\2\u00d3\u00d1\3\2\2\2\u00d3"+
		"\u00d4\3\2\2\2\u00d4\u00d5\3\2\2\2\u00d5\u00d7\5\35\17\2\u00d6\u00ce\3"+
		"\2\2\2\u00d6\u00d1\3\2\2\2\u00d7\u00d9\3\2\2\2\u00d8\u00cb\3\2\2\2\u00d8"+
		"\u00cc\3\2\2\2\u00d9\u00db\3\2\2\2\u00da\u00dc\t\6\2\2\u00db\u00da\3\2"+
		"\2\2\u00db\u00dc\3\2\2\2\u00dc\f\3\2\2\2\u00dd\u00de\5\35\17\2\u00de\u00e0"+
		"\7\60\2\2\u00df\u00e1\5\35\17\2\u00e0\u00df\3\2\2\2\u00e0\u00e1\3\2\2"+
		"\2\u00e1\u00e5\3\2\2\2\u00e2\u00e3\7\60\2\2\u00e3\u00e5\5\35\17\2\u00e4"+
		"\u00dd\3\2\2\2\u00e4\u00e2\3\2\2\2\u00e5\u00e7\3\2\2\2\u00e6\u00e8\5\33"+
		"\16\2\u00e7\u00e6\3\2\2\2\u00e7\u00e8\3\2\2\2\u00e8\u00ea\3\2\2\2\u00e9"+
		"\u00eb\t\7\2\2\u00ea\u00e9\3\2\2\2\u00ea\u00eb\3\2\2\2\u00eb\u00f5\3\2"+
		"\2\2\u00ec\u00f2\5\35\17\2\u00ed\u00ef\5\33\16\2\u00ee\u00f0\t\7\2\2\u00ef"+
		"\u00ee\3\2\2\2\u00ef\u00f0\3\2\2\2\u00f0\u00f3\3\2\2\2\u00f1\u00f3\t\7"+
		"\2\2\u00f2\u00ed\3\2\2\2\u00f2\u00f1\3\2\2\2\u00f3\u00f5\3\2\2\2\u00f4"+
		"\u00e4\3\2\2\2\u00f4\u00ec\3\2\2\2\u00f5\16\3\2\2\2\u00f6\u00f7\7v\2\2"+
		"\u00f7\u00f8\7t\2\2\u00f8\u00f9\7w\2\2\u00f9\u0100\7g\2\2\u00fa\u00fb"+
		"\7h\2\2\u00fb\u00fc\7c\2\2\u00fc\u00fd\7n\2\2\u00fd\u00fe\7u\2\2\u00fe"+
		"\u0100\7g\2\2\u00ff\u00f6\3\2\2\2\u00ff\u00fa\3\2\2\2\u0100\20\3\2\2\2"+
		"\u0101\u0104\7)\2\2\u0102\u0105\n\b\2\2\u0103\u0105\5\31\r\2\u0104\u0102"+
		"\3\2\2\2\u0104\u0103\3\2\2\2\u0105\u0106\3\2\2\2\u0106\u0107\7)\2\2\u0107"+
		"\22\3\2\2\2\u0108\u010d\7$\2\2\u0109\u010c\n\t\2\2\u010a\u010c\5\31\r"+
		"\2\u010b\u0109\3\2\2\2\u010b\u010a\3\2\2\2\u010c\u010f\3\2\2\2\u010d\u010b"+
		"\3\2\2\2\u010d\u010e\3\2\2\2\u010e\u0110\3\2\2\2\u010f\u010d\3\2\2\2\u0110"+
		"\u0111\7$\2\2\u0111\24\3\2\2\2\u0112\u0113\7p\2\2\u0113\u0114\7w\2\2\u0114"+
		"\u0115\7n\2\2\u0115\u0116\7n\2\2\u0116\26\3\2\2\2\u0117\u011a\5\37\20"+
		"\2\u0118\u011a\t\n\2\2\u0119\u0117\3\2\2\2\u0119\u0118\3\2\2\2\u011a\30"+
		"\3\2\2\2\u011b\u011c\7^\2\2\u011c\u0126\t\13\2\2\u011d\u0122\7^\2\2\u011e"+
		"\u0120\t\f\2\2\u011f\u011e\3\2\2\2\u011f\u0120\3\2\2\2\u0120\u0121\3\2"+
		"\2\2\u0121\u0123\t\r\2\2\u0122\u011f\3\2\2\2\u0122\u0123\3\2\2\2\u0123"+
		"\u0124\3\2\2\2\u0124\u0126\t\r\2\2\u0125\u011b\3\2\2\2\u0125\u011d\3\2"+
		"\2\2\u0126\32\3\2\2\2\u0127\u0129\t\16\2\2\u0128\u012a\t\17\2\2\u0129"+
		"\u0128\3\2\2\2\u0129\u012a\3\2\2\2\u012a\u012b\3\2\2\2\u012b\u012c\5\35"+
		"\17\2\u012c\34\3\2\2\2\u012d\u0135\t\n\2\2\u012e\u0130\t\20\2\2\u012f"+
		"\u012e\3\2\2\2\u0130\u0133\3\2\2\2\u0131\u012f\3\2\2\2\u0131\u0132\3\2"+
		"\2\2\u0132\u0134\3\2\2\2\u0133\u0131\3\2\2\2\u0134\u0136\t\n\2\2\u0135"+
		"\u0131\3\2\2\2\u0135\u0136\3\2\2\2\u0136\36\3\2\2\2\u0137\u0138\t\21\2"+
		"\2\u0138 \3\2\2\2\u0139\u013b\t\22\2\2\u013a\u0139\3\2\2\2\u013b\u013c"+
		"\3\2\2\2\u013c\u013a\3\2\2\2\u013c\u013d\3\2\2\2\u013d\u013e\3\2\2\2\u013e"+
		"\u013f\b\21\2\2\u013f\"\3\2\2\2\u0140\u0141\7\61\2\2\u0141\u0142\7,\2"+
		"\2\u0142\u0146\3\2\2\2\u0143\u0145\13\2\2\2\u0144\u0143\3\2\2\2\u0145"+
		"\u0148\3\2\2\2\u0146\u0147\3\2\2\2\u0146\u0144\3\2\2\2\u0147\u0149\3\2"+
		"\2\2\u0148\u0146\3\2\2\2\u0149\u014a\7,\2\2\u014a\u0155\7\61\2\2\u014b"+
		"\u014c\7\61\2\2\u014c\u014d\7\61\2\2\u014d\u0151\3\2\2\2\u014e\u0150\n"+
		"\23\2\2\u014f\u014e\3\2\2\2\u0150\u0153\3\2\2\2\u0151\u014f\3\2\2\2\u0151"+
		"\u0152\3\2\2\2\u0152\u0155\3\2\2\2\u0153\u0151\3\2\2\2\u0154\u0140\3\2"+
		"\2\2\u0154\u014b\3\2\2\2\u0155\u0156\3\2\2\2\u0156\u0157\b\22\2\2\u0157"+
		"$\3\2\2\2!\2\u00a4\u00aa\u00c9\u00ce\u00d3\u00d6\u00d8\u00db\u00e0\u00e4"+
		"\u00e7\u00ea\u00ef\u00f2\u00f4\u00ff\u0104\u010b\u010d\u0119\u011f\u0122"+
		"\u0125\u0129\u0131\u0135\u013c\u0146\u0151\u0154\3\2\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}