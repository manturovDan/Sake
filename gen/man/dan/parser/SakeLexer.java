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
		NAGASA=9, SHUSHI=10, KIDO=11, KANSU=12, SORENARA=13, SHUKI=14, ID=15, 
		NEWLINE=16, COMMENT=17, ENDEXPR=18, WS=19, END_BLOCK=20;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"INT_NON_NEG", "INT", "SEISU", "RONRI", "SHINRI", "OSU", "RIPPOTAI", 
			"HAIRETSU", "JIGEN", "NAGASA", "SHUSHI", "KIDO", "KANSU", "SORENARA", 
			"SHUKI", "ID", "NEWLINE", "COMMENT", "ENDEXPR", "WS", "END_BLOCK"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "'seisu'", "'ronri'", "'shinri'", "'osu'", "'rippotai'", 
			"'hairetsu'", "'jigen'", "'nagasa'", "'shushi'", "'kido'", "'kansu'", 
			"'sorenara'", "'shuki'", null, null, null, "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "INT", "SEISU", "RONRI", "SHINRI", "OSU", "RIPPOTAI", "HAIRETSU", 
			"JIGEN", "NAGASA", "SHUSHI", "KIDO", "KANSU", "SORENARA", "SHUKI", "ID", 
			"NEWLINE", "COMMENT", "ENDEXPR", "WS", "END_BLOCK"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\26\u00b7\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\3\2\6\2/\n\2\r\2\16\2\60"+
		"\3\2\3\2\6\2\65\n\2\r\2\16\2\66\5\29\n\2\3\3\5\3<\n\3\3\3\3\3\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3"+
		"\20\3\20\3\20\3\20\3\21\3\21\7\21\u0099\n\21\f\21\16\21\u009c\13\21\3"+
		"\22\5\22\u009f\n\22\3\22\3\22\3\22\3\22\3\23\3\23\7\23\u00a7\n\23\f\23"+
		"\16\23\u00aa\13\23\3\24\3\24\3\25\6\25\u00af\n\25\r\25\16\25\u00b0\3\25"+
		"\3\25\3\26\3\26\3\26\2\2\27\3\2\5\3\7\4\t\5\13\6\r\7\17\b\21\t\23\n\25"+
		"\13\27\f\31\r\33\16\35\17\37\20!\21#\22%\23\'\24)\25+\26\3\2\t\3\2\62"+
		";\4\2\62;CH\4\2--//\4\2C\\c|\5\2\62;C\\c|\4\2\f\f\17\17\4\2\13\13\"\""+
		"\2\u00bd\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2"+
		"\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31"+
		"\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2"+
		"\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\38\3\2\2\2\5;\3\2\2\2\7"+
		"?\3\2\2\2\tE\3\2\2\2\13K\3\2\2\2\rR\3\2\2\2\17V\3\2\2\2\21_\3\2\2\2\23"+
		"h\3\2\2\2\25n\3\2\2\2\27u\3\2\2\2\31|\3\2\2\2\33\u0081\3\2\2\2\35\u0087"+
		"\3\2\2\2\37\u0090\3\2\2\2!\u0096\3\2\2\2#\u009e\3\2\2\2%\u00a4\3\2\2\2"+
		"\'\u00ab\3\2\2\2)\u00ae\3\2\2\2+\u00b4\3\2\2\2-/\t\2\2\2.-\3\2\2\2/\60"+
		"\3\2\2\2\60.\3\2\2\2\60\61\3\2\2\2\619\3\2\2\2\62\64\7z\2\2\63\65\t\3"+
		"\2\2\64\63\3\2\2\2\65\66\3\2\2\2\66\64\3\2\2\2\66\67\3\2\2\2\679\3\2\2"+
		"\28.\3\2\2\28\62\3\2\2\29\4\3\2\2\2:<\t\4\2\2;:\3\2\2\2;<\3\2\2\2<=\3"+
		"\2\2\2=>\5\3\2\2>\6\3\2\2\2?@\7u\2\2@A\7g\2\2AB\7k\2\2BC\7u\2\2CD\7w\2"+
		"\2D\b\3\2\2\2EF\7t\2\2FG\7q\2\2GH\7p\2\2HI\7t\2\2IJ\7k\2\2J\n\3\2\2\2"+
		"KL\7u\2\2LM\7j\2\2MN\7k\2\2NO\7p\2\2OP\7t\2\2PQ\7k\2\2Q\f\3\2\2\2RS\7"+
		"q\2\2ST\7u\2\2TU\7w\2\2U\16\3\2\2\2VW\7t\2\2WX\7k\2\2XY\7r\2\2YZ\7r\2"+
		"\2Z[\7q\2\2[\\\7v\2\2\\]\7c\2\2]^\7k\2\2^\20\3\2\2\2_`\7j\2\2`a\7c\2\2"+
		"ab\7k\2\2bc\7t\2\2cd\7g\2\2de\7v\2\2ef\7u\2\2fg\7w\2\2g\22\3\2\2\2hi\7"+
		"l\2\2ij\7k\2\2jk\7i\2\2kl\7g\2\2lm\7p\2\2m\24\3\2\2\2no\7p\2\2op\7c\2"+
		"\2pq\7i\2\2qr\7c\2\2rs\7u\2\2st\7c\2\2t\26\3\2\2\2uv\7u\2\2vw\7j\2\2w"+
		"x\7w\2\2xy\7u\2\2yz\7j\2\2z{\7k\2\2{\30\3\2\2\2|}\7m\2\2}~\7k\2\2~\177"+
		"\7f\2\2\177\u0080\7q\2\2\u0080\32\3\2\2\2\u0081\u0082\7m\2\2\u0082\u0083"+
		"\7c\2\2\u0083\u0084\7p\2\2\u0084\u0085\7u\2\2\u0085\u0086\7w\2\2\u0086"+
		"\34\3\2\2\2\u0087\u0088\7u\2\2\u0088\u0089\7q\2\2\u0089\u008a\7t\2\2\u008a"+
		"\u008b\7g\2\2\u008b\u008c\7p\2\2\u008c\u008d\7c\2\2\u008d\u008e\7t\2\2"+
		"\u008e\u008f\7c\2\2\u008f\36\3\2\2\2\u0090\u0091\7u\2\2\u0091\u0092\7"+
		"j\2\2\u0092\u0093\7w\2\2\u0093\u0094\7m\2\2\u0094\u0095\7k\2\2\u0095 "+
		"\3\2\2\2\u0096\u009a\t\5\2\2\u0097\u0099\t\6\2\2\u0098\u0097\3\2\2\2\u0099"+
		"\u009c\3\2\2\2\u009a\u0098\3\2\2\2\u009a\u009b\3\2\2\2\u009b\"\3\2\2\2"+
		"\u009c\u009a\3\2\2\2\u009d\u009f\7\17\2\2\u009e\u009d\3\2\2\2\u009e\u009f"+
		"\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0\u00a1\7\f\2\2\u00a1\u00a2\3\2\2\2\u00a2"+
		"\u00a3\b\22\2\2\u00a3$\3\2\2\2\u00a4\u00a8\7%\2\2\u00a5\u00a7\n\7\2\2"+
		"\u00a6\u00a5\3\2\2\2\u00a7\u00aa\3\2\2\2\u00a8\u00a6\3\2\2\2\u00a8\u00a9"+
		"\3\2\2\2\u00a9&\3\2\2\2\u00aa\u00a8\3\2\2\2\u00ab\u00ac\7=\2\2\u00ac("+
		"\3\2\2\2\u00ad\u00af\t\b\2\2\u00ae\u00ad\3\2\2\2\u00af\u00b0\3\2\2\2\u00b0"+
		"\u00ae\3\2\2\2\u00b0\u00b1\3\2\2\2\u00b1\u00b2\3\2\2\2\u00b2\u00b3\b\25"+
		"\2\2\u00b3*\3\2\2\2\u00b4\u00b5\5\27\f\2\u00b5\u00b6\5\'\24\2\u00b6,\3"+
		"\2\2\2\13\2\60\668;\u009a\u009e\u00a8\u00b0\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}