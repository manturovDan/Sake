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
		SENDEN=16, FIELD=17, TOX=18, TOY=19, TOZ=20, TOKABE=21, PLUS=22, MINUS=23, 
		GREATER=24, LESS=25, ID=26, NEWLINE=27, COMMENT=28, ENDEXPR=29, WS=30, 
		END_BLOCK=31;
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
			"FIELD", "TOX", "TOY", "TOZ", "TOKABE", "PLUS", "MINUS", "GREATER", "LESS", 
			"ID", "NEWLINE", "COMMENT", "ENDEXPR", "WS", "END_BLOCK"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "'seisu'", "'ronri'", "'shinri'", "'osu'", "'rippotai'", 
			"'hairetsu'", "'jigen'", "'nagasa'", "'shushi'", "'kido'", "'kansu'", 
			"'sorenara'", "'modoru'", "'shuki'", "'senden'", "'=>'", "'X'", "'Y'", 
			"'Z'", "'kabe'", "'+'", "'-'", "'>'", "'<'", null, null, null, "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "INT", "SEISU", "RONRI", "SHINRI", "OSU", "RIPPOTAI", "HAIRETSU", 
			"JIGEN", "NAGASA", "SHUSHI", "KIDO", "KANSU", "SORENARA", "MODURU", "SHUKI", 
			"SENDEN", "FIELD", "TOX", "TOY", "TOZ", "TOKABE", "PLUS", "MINUS", "GREATER", 
			"LESS", "ID", "NEWLINE", "COMMENT", "ENDEXPR", "WS", "END_BLOCK"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2!\u00ea\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \3\2"+
		"\6\2C\n\2\r\2\16\2D\3\2\3\2\6\2I\n\2\r\2\16\2J\5\2M\n\2\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6"+
		"\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3"+
		"\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3"+
		"\21\3\21\3\22\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\26\3"+
		"\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\7\33\u00cc"+
		"\n\33\f\33\16\33\u00cf\13\33\3\34\5\34\u00d2\n\34\3\34\3\34\3\34\3\34"+
		"\3\35\3\35\7\35\u00da\n\35\f\35\16\35\u00dd\13\35\3\36\3\36\3\37\6\37"+
		"\u00e2\n\37\r\37\16\37\u00e3\3\37\3\37\3 \3 \3 \2\2!\3\3\5\4\7\5\t\6\13"+
		"\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'"+
		"\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!\3\2\b\3\2\62;"+
		"\4\2\62;CH\5\2C\\aac|\6\2\62;C\\aac|\4\2\f\f\17\17\4\2\13\13\"\"\2\u00f0"+
		"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2"+
		"\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2"+
		"\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2"+
		"\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3"+
		"\2\2\2\2=\3\2\2\2\2?\3\2\2\2\3L\3\2\2\2\5N\3\2\2\2\7T\3\2\2\2\tZ\3\2\2"+
		"\2\13a\3\2\2\2\re\3\2\2\2\17n\3\2\2\2\21w\3\2\2\2\23}\3\2\2\2\25\u0084"+
		"\3\2\2\2\27\u008b\3\2\2\2\31\u0090\3\2\2\2\33\u0096\3\2\2\2\35\u009f\3"+
		"\2\2\2\37\u00a6\3\2\2\2!\u00ac\3\2\2\2#\u00b3\3\2\2\2%\u00b6\3\2\2\2\'"+
		"\u00b8\3\2\2\2)\u00ba\3\2\2\2+\u00bc\3\2\2\2-\u00c1\3\2\2\2/\u00c3\3\2"+
		"\2\2\61\u00c5\3\2\2\2\63\u00c7\3\2\2\2\65\u00c9\3\2\2\2\67\u00d1\3\2\2"+
		"\29\u00d7\3\2\2\2;\u00de\3\2\2\2=\u00e1\3\2\2\2?\u00e7\3\2\2\2AC\t\2\2"+
		"\2BA\3\2\2\2CD\3\2\2\2DB\3\2\2\2DE\3\2\2\2EM\3\2\2\2FH\7z\2\2GI\t\3\2"+
		"\2HG\3\2\2\2IJ\3\2\2\2JH\3\2\2\2JK\3\2\2\2KM\3\2\2\2LB\3\2\2\2LF\3\2\2"+
		"\2M\4\3\2\2\2NO\7u\2\2OP\7g\2\2PQ\7k\2\2QR\7u\2\2RS\7w\2\2S\6\3\2\2\2"+
		"TU\7t\2\2UV\7q\2\2VW\7p\2\2WX\7t\2\2XY\7k\2\2Y\b\3\2\2\2Z[\7u\2\2[\\\7"+
		"j\2\2\\]\7k\2\2]^\7p\2\2^_\7t\2\2_`\7k\2\2`\n\3\2\2\2ab\7q\2\2bc\7u\2"+
		"\2cd\7w\2\2d\f\3\2\2\2ef\7t\2\2fg\7k\2\2gh\7r\2\2hi\7r\2\2ij\7q\2\2jk"+
		"\7v\2\2kl\7c\2\2lm\7k\2\2m\16\3\2\2\2no\7j\2\2op\7c\2\2pq\7k\2\2qr\7t"+
		"\2\2rs\7g\2\2st\7v\2\2tu\7u\2\2uv\7w\2\2v\20\3\2\2\2wx\7l\2\2xy\7k\2\2"+
		"yz\7i\2\2z{\7g\2\2{|\7p\2\2|\22\3\2\2\2}~\7p\2\2~\177\7c\2\2\177\u0080"+
		"\7i\2\2\u0080\u0081\7c\2\2\u0081\u0082\7u\2\2\u0082\u0083\7c\2\2\u0083"+
		"\24\3\2\2\2\u0084\u0085\7u\2\2\u0085\u0086\7j\2\2\u0086\u0087\7w\2\2\u0087"+
		"\u0088\7u\2\2\u0088\u0089\7j\2\2\u0089\u008a\7k\2\2\u008a\26\3\2\2\2\u008b"+
		"\u008c\7m\2\2\u008c\u008d\7k\2\2\u008d\u008e\7f\2\2\u008e\u008f\7q\2\2"+
		"\u008f\30\3\2\2\2\u0090\u0091\7m\2\2\u0091\u0092\7c\2\2\u0092\u0093\7"+
		"p\2\2\u0093\u0094\7u\2\2\u0094\u0095\7w\2\2\u0095\32\3\2\2\2\u0096\u0097"+
		"\7u\2\2\u0097\u0098\7q\2\2\u0098\u0099\7t\2\2\u0099\u009a\7g\2\2\u009a"+
		"\u009b\7p\2\2\u009b\u009c\7c\2\2\u009c\u009d\7t\2\2\u009d\u009e\7c\2\2"+
		"\u009e\34\3\2\2\2\u009f\u00a0\7o\2\2\u00a0\u00a1\7q\2\2\u00a1\u00a2\7"+
		"f\2\2\u00a2\u00a3\7q\2\2\u00a3\u00a4\7t\2\2\u00a4\u00a5\7w\2\2\u00a5\36"+
		"\3\2\2\2\u00a6\u00a7\7u\2\2\u00a7\u00a8\7j\2\2\u00a8\u00a9\7w\2\2\u00a9"+
		"\u00aa\7m\2\2\u00aa\u00ab\7k\2\2\u00ab \3\2\2\2\u00ac\u00ad\7u\2\2\u00ad"+
		"\u00ae\7g\2\2\u00ae\u00af\7p\2\2\u00af\u00b0\7f\2\2\u00b0\u00b1\7g\2\2"+
		"\u00b1\u00b2\7p\2\2\u00b2\"\3\2\2\2\u00b3\u00b4\7?\2\2\u00b4\u00b5\7@"+
		"\2\2\u00b5$\3\2\2\2\u00b6\u00b7\7Z\2\2\u00b7&\3\2\2\2\u00b8\u00b9\7[\2"+
		"\2\u00b9(\3\2\2\2\u00ba\u00bb\7\\\2\2\u00bb*\3\2\2\2\u00bc\u00bd\7m\2"+
		"\2\u00bd\u00be\7c\2\2\u00be\u00bf\7d\2\2\u00bf\u00c0\7g\2\2\u00c0,\3\2"+
		"\2\2\u00c1\u00c2\7-\2\2\u00c2.\3\2\2\2\u00c3\u00c4\7/\2\2\u00c4\60\3\2"+
		"\2\2\u00c5\u00c6\7@\2\2\u00c6\62\3\2\2\2\u00c7\u00c8\7>\2\2\u00c8\64\3"+
		"\2\2\2\u00c9\u00cd\t\4\2\2\u00ca\u00cc\t\5\2\2\u00cb\u00ca\3\2\2\2\u00cc"+
		"\u00cf\3\2\2\2\u00cd\u00cb\3\2\2\2\u00cd\u00ce\3\2\2\2\u00ce\66\3\2\2"+
		"\2\u00cf\u00cd\3\2\2\2\u00d0\u00d2\7\17\2\2\u00d1\u00d0\3\2\2\2\u00d1"+
		"\u00d2\3\2\2\2\u00d2\u00d3\3\2\2\2\u00d3\u00d4\7\f\2\2\u00d4\u00d5\3\2"+
		"\2\2\u00d5\u00d6\b\34\2\2\u00d68\3\2\2\2\u00d7\u00db\7%\2\2\u00d8\u00da"+
		"\n\6\2\2\u00d9\u00d8\3\2\2\2\u00da\u00dd\3\2\2\2\u00db\u00d9\3\2\2\2\u00db"+
		"\u00dc\3\2\2\2\u00dc:\3\2\2\2\u00dd\u00db\3\2\2\2\u00de\u00df\7=\2\2\u00df"+
		"<\3\2\2\2\u00e0\u00e2\t\7\2\2\u00e1\u00e0\3\2\2\2\u00e2\u00e3\3\2\2\2"+
		"\u00e3\u00e1\3\2\2\2\u00e3\u00e4\3\2\2\2\u00e4\u00e5\3\2\2\2\u00e5\u00e6"+
		"\b\37\2\2\u00e6>\3\2\2\2\u00e7\u00e8\5\25\13\2\u00e8\u00e9\5;\36\2\u00e9"+
		"@\3\2\2\2\n\2DJL\u00cd\u00d1\u00db\u00e3\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}