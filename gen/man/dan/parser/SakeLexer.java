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
		SENDEN=16, PLUS=17, MINUS=18, GREATER=19, LESS=20, ID=21, NEWLINE=22, 
		COMMENT=23, ENDEXPR=24, WS=25, END_BLOCK=26;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"INT", "SEISU", "RONRI", "SHINRI", "OSU", "RIPPOTAI", "HAIRETSU", "JIGEN", 
			"NAGASA", "SHUSHI", "KIDO", "KANSU", "SORENARA", "MODURU", "SHUKI", "SENDEN", 
			"PLUS", "MINUS", "GREATER", "LESS", "ID", "NEWLINE", "COMMENT", "ENDEXPR", 
			"WS", "END_BLOCK"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "'seisu'", "'ronri'", "'shinri'", "'osu'", "'rippotai'", 
			"'hairetsu'", "'jigen'", "'nagasa'", "'shushi'", "'kido'", "'kansu'", 
			"'sorenara'", "'modoru'", "'shuki'", "'senden'", "'+'", "'-'", "'>'", 
			"'<'", null, null, null, "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "INT", "SEISU", "RONRI", "SHINRI", "OSU", "RIPPOTAI", "HAIRETSU", 
			"JIGEN", "NAGASA", "SHUSHI", "KIDO", "KANSU", "SORENARA", "MODURU", "SHUKI", 
			"SENDEN", "PLUS", "MINUS", "GREATER", "LESS", "ID", "NEWLINE", "COMMENT", 
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\34\u00d2\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\3\2\6\29\n\2\r\2\16\2:\3\2\3\2\6\2?\n\2\r\2"+
		"\16\2@\5\2C\n\2\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f"+
		"\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3"+
		"\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3"+
		"\25\3\25\3\26\3\26\7\26\u00b4\n\26\f\26\16\26\u00b7\13\26\3\27\5\27\u00ba"+
		"\n\27\3\27\3\27\3\27\3\27\3\30\3\30\7\30\u00c2\n\30\f\30\16\30\u00c5\13"+
		"\30\3\31\3\31\3\32\6\32\u00ca\n\32\r\32\16\32\u00cb\3\32\3\32\3\33\3\33"+
		"\3\33\2\2\34\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16"+
		"\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34"+
		"\3\2\b\3\2\62;\4\2\62;CH\5\2C\\aac|\6\2\62;C\\aac|\4\2\f\f\17\17\4\2\13"+
		"\13\"\"\2\u00d8\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3"+
		"\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2"+
		"\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3"+
		"\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2"+
		"\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\3B\3\2\2\2\5D\3"+
		"\2\2\2\7J\3\2\2\2\tP\3\2\2\2\13W\3\2\2\2\r[\3\2\2\2\17d\3\2\2\2\21m\3"+
		"\2\2\2\23s\3\2\2\2\25z\3\2\2\2\27\u0081\3\2\2\2\31\u0086\3\2\2\2\33\u008c"+
		"\3\2\2\2\35\u0095\3\2\2\2\37\u009c\3\2\2\2!\u00a2\3\2\2\2#\u00a9\3\2\2"+
		"\2%\u00ab\3\2\2\2\'\u00ad\3\2\2\2)\u00af\3\2\2\2+\u00b1\3\2\2\2-\u00b9"+
		"\3\2\2\2/\u00bf\3\2\2\2\61\u00c6\3\2\2\2\63\u00c9\3\2\2\2\65\u00cf\3\2"+
		"\2\2\679\t\2\2\28\67\3\2\2\29:\3\2\2\2:8\3\2\2\2:;\3\2\2\2;C\3\2\2\2<"+
		">\7z\2\2=?\t\3\2\2>=\3\2\2\2?@\3\2\2\2@>\3\2\2\2@A\3\2\2\2AC\3\2\2\2B"+
		"8\3\2\2\2B<\3\2\2\2C\4\3\2\2\2DE\7u\2\2EF\7g\2\2FG\7k\2\2GH\7u\2\2HI\7"+
		"w\2\2I\6\3\2\2\2JK\7t\2\2KL\7q\2\2LM\7p\2\2MN\7t\2\2NO\7k\2\2O\b\3\2\2"+
		"\2PQ\7u\2\2QR\7j\2\2RS\7k\2\2ST\7p\2\2TU\7t\2\2UV\7k\2\2V\n\3\2\2\2WX"+
		"\7q\2\2XY\7u\2\2YZ\7w\2\2Z\f\3\2\2\2[\\\7t\2\2\\]\7k\2\2]^\7r\2\2^_\7"+
		"r\2\2_`\7q\2\2`a\7v\2\2ab\7c\2\2bc\7k\2\2c\16\3\2\2\2de\7j\2\2ef\7c\2"+
		"\2fg\7k\2\2gh\7t\2\2hi\7g\2\2ij\7v\2\2jk\7u\2\2kl\7w\2\2l\20\3\2\2\2m"+
		"n\7l\2\2no\7k\2\2op\7i\2\2pq\7g\2\2qr\7p\2\2r\22\3\2\2\2st\7p\2\2tu\7"+
		"c\2\2uv\7i\2\2vw\7c\2\2wx\7u\2\2xy\7c\2\2y\24\3\2\2\2z{\7u\2\2{|\7j\2"+
		"\2|}\7w\2\2}~\7u\2\2~\177\7j\2\2\177\u0080\7k\2\2\u0080\26\3\2\2\2\u0081"+
		"\u0082\7m\2\2\u0082\u0083\7k\2\2\u0083\u0084\7f\2\2\u0084\u0085\7q\2\2"+
		"\u0085\30\3\2\2\2\u0086\u0087\7m\2\2\u0087\u0088\7c\2\2\u0088\u0089\7"+
		"p\2\2\u0089\u008a\7u\2\2\u008a\u008b\7w\2\2\u008b\32\3\2\2\2\u008c\u008d"+
		"\7u\2\2\u008d\u008e\7q\2\2\u008e\u008f\7t\2\2\u008f\u0090\7g\2\2\u0090"+
		"\u0091\7p\2\2\u0091\u0092\7c\2\2\u0092\u0093\7t\2\2\u0093\u0094\7c\2\2"+
		"\u0094\34\3\2\2\2\u0095\u0096\7o\2\2\u0096\u0097\7q\2\2\u0097\u0098\7"+
		"f\2\2\u0098\u0099\7q\2\2\u0099\u009a\7t\2\2\u009a\u009b\7w\2\2\u009b\36"+
		"\3\2\2\2\u009c\u009d\7u\2\2\u009d\u009e\7j\2\2\u009e\u009f\7w\2\2\u009f"+
		"\u00a0\7m\2\2\u00a0\u00a1\7k\2\2\u00a1 \3\2\2\2\u00a2\u00a3\7u\2\2\u00a3"+
		"\u00a4\7g\2\2\u00a4\u00a5\7p\2\2\u00a5\u00a6\7f\2\2\u00a6\u00a7\7g\2\2"+
		"\u00a7\u00a8\7p\2\2\u00a8\"\3\2\2\2\u00a9\u00aa\7-\2\2\u00aa$\3\2\2\2"+
		"\u00ab\u00ac\7/\2\2\u00ac&\3\2\2\2\u00ad\u00ae\7@\2\2\u00ae(\3\2\2\2\u00af"+
		"\u00b0\7>\2\2\u00b0*\3\2\2\2\u00b1\u00b5\t\4\2\2\u00b2\u00b4\t\5\2\2\u00b3"+
		"\u00b2\3\2\2\2\u00b4\u00b7\3\2\2\2\u00b5\u00b3\3\2\2\2\u00b5\u00b6\3\2"+
		"\2\2\u00b6,\3\2\2\2\u00b7\u00b5\3\2\2\2\u00b8\u00ba\7\17\2\2\u00b9\u00b8"+
		"\3\2\2\2\u00b9\u00ba\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb\u00bc\7\f\2\2\u00bc"+
		"\u00bd\3\2\2\2\u00bd\u00be\b\27\2\2\u00be.\3\2\2\2\u00bf\u00c3\7%\2\2"+
		"\u00c0\u00c2\n\6\2\2\u00c1\u00c0\3\2\2\2\u00c2\u00c5\3\2\2\2\u00c3\u00c1"+
		"\3\2\2\2\u00c3\u00c4\3\2\2\2\u00c4\60\3\2\2\2\u00c5\u00c3\3\2\2\2\u00c6"+
		"\u00c7\7=\2\2\u00c7\62\3\2\2\2\u00c8\u00ca\t\7\2\2\u00c9\u00c8\3\2\2\2"+
		"\u00ca\u00cb\3\2\2\2\u00cb\u00c9\3\2\2\2\u00cb\u00cc\3\2\2\2\u00cc\u00cd"+
		"\3\2\2\2\u00cd\u00ce\b\32\2\2\u00ce\64\3\2\2\2\u00cf\u00d0\5\25\13\2\u00d0"+
		"\u00d1\5\61\31\2\u00d1\66\3\2\2\2\n\2:@B\u00b5\u00b9\u00c3\u00cb\3\b\2"+
		"\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}