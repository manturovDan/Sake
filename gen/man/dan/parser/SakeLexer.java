// Generated from /home/danila/source/Sake/src/man/dan/parser/SakeLexer.g4 by ANTLR 4.8
package man.dan.parser;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SakeLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		INT=1, SEISU=2, RONRI=3, SHINRI=4, OSU=5, RIPPOTAI=6, HAIRETSU=7, JIGEN=8, 
		NAGASA=9, SHUSHI=10, KIDO=11, KANSU=12, SORENARA=13, MODURU=14, SHUKI=15, 
		ID=16, NEWLINE=17, COMMENT=18, ENDEXPR=19, WS=20, END_BLOCK=21;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"INT", "SEISU", "RONRI", "SHINRI", "OSU", "RIPPOTAI", "HAIRETSU", "JIGEN", 
			"NAGASA", "SHUSHI", "KIDO", "KANSU", "SORENARA", "MODURU", "SHUKI", "ID", 
			"NEWLINE", "COMMENT", "ENDEXPR", "WS", "END_BLOCK"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "'seisu'", "'ronri'", "'shinri'", "'osu'", "'rippotai'", 
			"'hairetsu'", "'jigen'", "'nagasa'", "'shushi'", "'kido'", "'kansu'", 
			"'sorenara'", "'modoru'", "'shuki'", null, null, null, "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "INT", "SEISU", "RONRI", "SHINRI", "OSU", "RIPPOTAI", "HAIRETSU", 
			"JIGEN", "NAGASA", "SHUSHI", "KIDO", "KANSU", "SORENARA", "MODURU", "SHUKI", 
			"ID", "NEWLINE", "COMMENT", "ENDEXPR", "WS", "END_BLOCK"
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


	public SakeLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "SakeLexer.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\27\u00b9\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\3\2\6\2/\n\2\r\2\16\2\60"+
		"\3\2\3\2\6\2\65\n\2\r\2\16\2\66\5\29\n\2\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\21\3\21\7\21\u009b\n\21\f\21\16\21\u009e\13"+
		"\21\3\22\5\22\u00a1\n\22\3\22\3\22\3\22\3\22\3\23\3\23\7\23\u00a9\n\23"+
		"\f\23\16\23\u00ac\13\23\3\24\3\24\3\25\6\25\u00b1\n\25\r\25\16\25\u00b2"+
		"\3\25\3\25\3\26\3\26\3\26\2\2\27\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23"+
		"\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27\3\2\b\3"+
		"\2\62;\4\2\62;CH\4\2C\\c|\5\2\62;C\\c|\4\2\f\f\17\17\4\2\13\13\"\"\2\u00bf"+
		"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2"+
		"\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2"+
		"\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\38\3\2\2\2\5:\3\2\2"+
		"\2\7@\3\2\2\2\tF\3\2\2\2\13M\3\2\2\2\rQ\3\2\2\2\17Z\3\2\2\2\21c\3\2\2"+
		"\2\23i\3\2\2\2\25p\3\2\2\2\27w\3\2\2\2\31|\3\2\2\2\33\u0082\3\2\2\2\35"+
		"\u008b\3\2\2\2\37\u0092\3\2\2\2!\u0098\3\2\2\2#\u00a0\3\2\2\2%\u00a6\3"+
		"\2\2\2\'\u00ad\3\2\2\2)\u00b0\3\2\2\2+\u00b6\3\2\2\2-/\t\2\2\2.-\3\2\2"+
		"\2/\60\3\2\2\2\60.\3\2\2\2\60\61\3\2\2\2\619\3\2\2\2\62\64\7z\2\2\63\65"+
		"\t\3\2\2\64\63\3\2\2\2\65\66\3\2\2\2\66\64\3\2\2\2\66\67\3\2\2\2\679\3"+
		"\2\2\28.\3\2\2\28\62\3\2\2\29\4\3\2\2\2:;\7u\2\2;<\7g\2\2<=\7k\2\2=>\7"+
		"u\2\2>?\7w\2\2?\6\3\2\2\2@A\7t\2\2AB\7q\2\2BC\7p\2\2CD\7t\2\2DE\7k\2\2"+
		"E\b\3\2\2\2FG\7u\2\2GH\7j\2\2HI\7k\2\2IJ\7p\2\2JK\7t\2\2KL\7k\2\2L\n\3"+
		"\2\2\2MN\7q\2\2NO\7u\2\2OP\7w\2\2P\f\3\2\2\2QR\7t\2\2RS\7k\2\2ST\7r\2"+
		"\2TU\7r\2\2UV\7q\2\2VW\7v\2\2WX\7c\2\2XY\7k\2\2Y\16\3\2\2\2Z[\7j\2\2["+
		"\\\7c\2\2\\]\7k\2\2]^\7t\2\2^_\7g\2\2_`\7v\2\2`a\7u\2\2ab\7w\2\2b\20\3"+
		"\2\2\2cd\7l\2\2de\7k\2\2ef\7i\2\2fg\7g\2\2gh\7p\2\2h\22\3\2\2\2ij\7p\2"+
		"\2jk\7c\2\2kl\7i\2\2lm\7c\2\2mn\7u\2\2no\7c\2\2o\24\3\2\2\2pq\7u\2\2q"+
		"r\7j\2\2rs\7w\2\2st\7u\2\2tu\7j\2\2uv\7k\2\2v\26\3\2\2\2wx\7m\2\2xy\7"+
		"k\2\2yz\7f\2\2z{\7q\2\2{\30\3\2\2\2|}\7m\2\2}~\7c\2\2~\177\7p\2\2\177"+
		"\u0080\7u\2\2\u0080\u0081\7w\2\2\u0081\32\3\2\2\2\u0082\u0083\7u\2\2\u0083"+
		"\u0084\7q\2\2\u0084\u0085\7t\2\2\u0085\u0086\7g\2\2\u0086\u0087\7p\2\2"+
		"\u0087\u0088\7c\2\2\u0088\u0089\7t\2\2\u0089\u008a\7c\2\2\u008a\34\3\2"+
		"\2\2\u008b\u008c\7o\2\2\u008c\u008d\7q\2\2\u008d\u008e\7f\2\2\u008e\u008f"+
		"\7q\2\2\u008f\u0090\7t\2\2\u0090\u0091\7w\2\2\u0091\36\3\2\2\2\u0092\u0093"+
		"\7u\2\2\u0093\u0094\7j\2\2\u0094\u0095\7w\2\2\u0095\u0096\7m\2\2\u0096"+
		"\u0097\7k\2\2\u0097 \3\2\2\2\u0098\u009c\t\4\2\2\u0099\u009b\t\5\2\2\u009a"+
		"\u0099\3\2\2\2\u009b\u009e\3\2\2\2\u009c\u009a\3\2\2\2\u009c\u009d\3\2"+
		"\2\2\u009d\"\3\2\2\2\u009e\u009c\3\2\2\2\u009f\u00a1\7\17\2\2\u00a0\u009f"+
		"\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2\u00a3\7\f\2\2\u00a3"+
		"\u00a4\3\2\2\2\u00a4\u00a5\b\22\2\2\u00a5$\3\2\2\2\u00a6\u00aa\7%\2\2"+
		"\u00a7\u00a9\n\6\2\2\u00a8\u00a7\3\2\2\2\u00a9\u00ac\3\2\2\2\u00aa\u00a8"+
		"\3\2\2\2\u00aa\u00ab\3\2\2\2\u00ab&\3\2\2\2\u00ac\u00aa\3\2\2\2\u00ad"+
		"\u00ae\7=\2\2\u00ae(\3\2\2\2\u00af\u00b1\t\7\2\2\u00b0\u00af\3\2\2\2\u00b1"+
		"\u00b2\3\2\2\2\u00b2\u00b0\3\2\2\2\u00b2\u00b3\3\2\2\2\u00b3\u00b4\3\2"+
		"\2\2\u00b4\u00b5\b\25\2\2\u00b5*\3\2\2\2\u00b6\u00b7\5\25\13\2\u00b7\u00b8"+
		"\5\'\24\2\u00b8,\3\2\2\2\n\2\60\668\u009c\u00a0\u00aa\u00b2\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}