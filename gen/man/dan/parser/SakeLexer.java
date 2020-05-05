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
		NAGASA=9, SHUSHI=10, KIDO=11, KANSU=12, ID=13, NEWLINE=14, COMMENT=15, 
		ENDEXPR=16, WS=17, END_BLOCK=18;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"INT_NON_NEG", "INT", "SEISU", "RONRI", "SHINRI", "OSU", "RIPPOTAI", 
			"HAIRETSU", "JIGEN", "NAGASA", "SHUSHI", "KIDO", "KANSU", "ID", "NEWLINE", 
			"COMMENT", "ENDEXPR", "WS", "END_BLOCK"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "'seisu'", "'ronri'", "'shinri'", "'osu'", "'rippotai'", 
			"'hairetsu'", "'jigen'", "'nagasa'", "'shushi'", "'kido'", "'kansu'", 
			null, null, null, "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "INT", "SEISU", "RONRI", "SHINRI", "OSU", "RIPPOTAI", "HAIRETSU", 
			"JIGEN", "NAGASA", "SHUSHI", "KIDO", "KANSU", "ID", "NEWLINE", "COMMENT", 
			"ENDEXPR", "WS", "END_BLOCK"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\24\u00a4\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\3\2\6\2+\n\2\r\2\16\2,\3\2\3\2\6\2\61\n\2\r"+
		"\2\16\2\62\5\2\65\n\2\3\3\5\38\n\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\17"+
		"\3\17\7\17\u0086\n\17\f\17\16\17\u0089\13\17\3\20\5\20\u008c\n\20\3\20"+
		"\3\20\3\20\3\20\3\21\3\21\7\21\u0094\n\21\f\21\16\21\u0097\13\21\3\22"+
		"\3\22\3\23\6\23\u009c\n\23\r\23\16\23\u009d\3\23\3\23\3\24\3\24\3\24\2"+
		"\2\25\3\2\5\3\7\4\t\5\13\6\r\7\17\b\21\t\23\n\25\13\27\f\31\r\33\16\35"+
		"\17\37\20!\21#\22%\23\'\24\3\2\t\3\2\62;\4\2\62;CH\4\2--//\4\2C\\c|\5"+
		"\2\62;C\\c|\4\2\f\f\17\17\4\2\13\13\"\"\2\u00aa\2\5\3\2\2\2\2\7\3\2\2"+
		"\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23"+
		"\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2"+
		"\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\3\64\3"+
		"\2\2\2\5\67\3\2\2\2\7;\3\2\2\2\tA\3\2\2\2\13G\3\2\2\2\rN\3\2\2\2\17R\3"+
		"\2\2\2\21[\3\2\2\2\23d\3\2\2\2\25j\3\2\2\2\27q\3\2\2\2\31x\3\2\2\2\33"+
		"}\3\2\2\2\35\u0083\3\2\2\2\37\u008b\3\2\2\2!\u0091\3\2\2\2#\u0098\3\2"+
		"\2\2%\u009b\3\2\2\2\'\u00a1\3\2\2\2)+\t\2\2\2*)\3\2\2\2+,\3\2\2\2,*\3"+
		"\2\2\2,-\3\2\2\2-\65\3\2\2\2.\60\7z\2\2/\61\t\3\2\2\60/\3\2\2\2\61\62"+
		"\3\2\2\2\62\60\3\2\2\2\62\63\3\2\2\2\63\65\3\2\2\2\64*\3\2\2\2\64.\3\2"+
		"\2\2\65\4\3\2\2\2\668\t\4\2\2\67\66\3\2\2\2\678\3\2\2\289\3\2\2\29:\5"+
		"\3\2\2:\6\3\2\2\2;<\7u\2\2<=\7g\2\2=>\7k\2\2>?\7u\2\2?@\7w\2\2@\b\3\2"+
		"\2\2AB\7t\2\2BC\7q\2\2CD\7p\2\2DE\7t\2\2EF\7k\2\2F\n\3\2\2\2GH\7u\2\2"+
		"HI\7j\2\2IJ\7k\2\2JK\7p\2\2KL\7t\2\2LM\7k\2\2M\f\3\2\2\2NO\7q\2\2OP\7"+
		"u\2\2PQ\7w\2\2Q\16\3\2\2\2RS\7t\2\2ST\7k\2\2TU\7r\2\2UV\7r\2\2VW\7q\2"+
		"\2WX\7v\2\2XY\7c\2\2YZ\7k\2\2Z\20\3\2\2\2[\\\7j\2\2\\]\7c\2\2]^\7k\2\2"+
		"^_\7t\2\2_`\7g\2\2`a\7v\2\2ab\7u\2\2bc\7w\2\2c\22\3\2\2\2de\7l\2\2ef\7"+
		"k\2\2fg\7i\2\2gh\7g\2\2hi\7p\2\2i\24\3\2\2\2jk\7p\2\2kl\7c\2\2lm\7i\2"+
		"\2mn\7c\2\2no\7u\2\2op\7c\2\2p\26\3\2\2\2qr\7u\2\2rs\7j\2\2st\7w\2\2t"+
		"u\7u\2\2uv\7j\2\2vw\7k\2\2w\30\3\2\2\2xy\7m\2\2yz\7k\2\2z{\7f\2\2{|\7"+
		"q\2\2|\32\3\2\2\2}~\7m\2\2~\177\7c\2\2\177\u0080\7p\2\2\u0080\u0081\7"+
		"u\2\2\u0081\u0082\7w\2\2\u0082\34\3\2\2\2\u0083\u0087\t\5\2\2\u0084\u0086"+
		"\t\6\2\2\u0085\u0084\3\2\2\2\u0086\u0089\3\2\2\2\u0087\u0085\3\2\2\2\u0087"+
		"\u0088\3\2\2\2\u0088\36\3\2\2\2\u0089\u0087\3\2\2\2\u008a\u008c\7\17\2"+
		"\2\u008b\u008a\3\2\2\2\u008b\u008c\3\2\2\2\u008c\u008d\3\2\2\2\u008d\u008e"+
		"\7\f\2\2\u008e\u008f\3\2\2\2\u008f\u0090\b\20\2\2\u0090 \3\2\2\2\u0091"+
		"\u0095\7%\2\2\u0092\u0094\n\7\2\2\u0093\u0092\3\2\2\2\u0094\u0097\3\2"+
		"\2\2\u0095\u0093\3\2\2\2\u0095\u0096\3\2\2\2\u0096\"\3\2\2\2\u0097\u0095"+
		"\3\2\2\2\u0098\u0099\7=\2\2\u0099$\3\2\2\2\u009a\u009c\t\b\2\2\u009b\u009a"+
		"\3\2\2\2\u009c\u009d\3\2\2\2\u009d\u009b\3\2\2\2\u009d\u009e\3\2\2\2\u009e"+
		"\u009f\3\2\2\2\u009f\u00a0\b\23\2\2\u00a0&\3\2\2\2\u00a1\u00a2\5\27\f"+
		"\2\u00a2\u00a3\5#\22\2\u00a3(\3\2\2\2\13\2,\62\64\67\u0087\u008b\u0095"+
		"\u009d\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}