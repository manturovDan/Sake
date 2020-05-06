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
		NAGASA=9, SHUSHI=10, KIDO=11, KANSU=12, SORENARA=13, ID=14, NEWLINE=15, 
		COMMENT=16, ENDEXPR=17, WS=18, END_BLOCK=19;
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
			"ID", "NEWLINE", "COMMENT", "ENDEXPR", "WS", "END_BLOCK"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "'seisu'", "'ronri'", "'shinri'", "'osu'", "'rippotai'", 
			"'hairetsu'", "'jigen'", "'nagasa'", "'shushi'", "'kido'", "'kansu'", 
			"'sorenara'", null, null, null, "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "INT", "SEISU", "RONRI", "SHINRI", "OSU", "RIPPOTAI", "HAIRETSU", 
			"JIGEN", "NAGASA", "SHUSHI", "KIDO", "KANSU", "SORENARA", "ID", "NEWLINE", 
			"COMMENT", "ENDEXPR", "WS", "END_BLOCK"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\25\u00af\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\3\2\6\2-\n\2\r\2\16\2.\3\2\3\2\6\2"+
		"\63\n\2\r\2\16\2\64\5\2\67\n\2\3\3\5\3:\n\3\3\3\3\3\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7"+
		"\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\7\20\u0091"+
		"\n\20\f\20\16\20\u0094\13\20\3\21\5\21\u0097\n\21\3\21\3\21\3\21\3\21"+
		"\3\22\3\22\7\22\u009f\n\22\f\22\16\22\u00a2\13\22\3\23\3\23\3\24\6\24"+
		"\u00a7\n\24\r\24\16\24\u00a8\3\24\3\24\3\25\3\25\3\25\2\2\26\3\2\5\3\7"+
		"\4\t\5\13\6\r\7\17\b\21\t\23\n\25\13\27\f\31\r\33\16\35\17\37\20!\21#"+
		"\22%\23\'\24)\25\3\2\t\3\2\62;\4\2\62;CH\4\2--//\4\2C\\c|\5\2\62;C\\c"+
		"|\4\2\f\f\17\17\4\2\13\13\"\"\2\u00b5\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2"+
		"\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2"+
		"\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3"+
		"\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\3\66\3"+
		"\2\2\2\59\3\2\2\2\7=\3\2\2\2\tC\3\2\2\2\13I\3\2\2\2\rP\3\2\2\2\17T\3\2"+
		"\2\2\21]\3\2\2\2\23f\3\2\2\2\25l\3\2\2\2\27s\3\2\2\2\31z\3\2\2\2\33\177"+
		"\3\2\2\2\35\u0085\3\2\2\2\37\u008e\3\2\2\2!\u0096\3\2\2\2#\u009c\3\2\2"+
		"\2%\u00a3\3\2\2\2\'\u00a6\3\2\2\2)\u00ac\3\2\2\2+-\t\2\2\2,+\3\2\2\2-"+
		".\3\2\2\2.,\3\2\2\2./\3\2\2\2/\67\3\2\2\2\60\62\7z\2\2\61\63\t\3\2\2\62"+
		"\61\3\2\2\2\63\64\3\2\2\2\64\62\3\2\2\2\64\65\3\2\2\2\65\67\3\2\2\2\66"+
		",\3\2\2\2\66\60\3\2\2\2\67\4\3\2\2\28:\t\4\2\298\3\2\2\29:\3\2\2\2:;\3"+
		"\2\2\2;<\5\3\2\2<\6\3\2\2\2=>\7u\2\2>?\7g\2\2?@\7k\2\2@A\7u\2\2AB\7w\2"+
		"\2B\b\3\2\2\2CD\7t\2\2DE\7q\2\2EF\7p\2\2FG\7t\2\2GH\7k\2\2H\n\3\2\2\2"+
		"IJ\7u\2\2JK\7j\2\2KL\7k\2\2LM\7p\2\2MN\7t\2\2NO\7k\2\2O\f\3\2\2\2PQ\7"+
		"q\2\2QR\7u\2\2RS\7w\2\2S\16\3\2\2\2TU\7t\2\2UV\7k\2\2VW\7r\2\2WX\7r\2"+
		"\2XY\7q\2\2YZ\7v\2\2Z[\7c\2\2[\\\7k\2\2\\\20\3\2\2\2]^\7j\2\2^_\7c\2\2"+
		"_`\7k\2\2`a\7t\2\2ab\7g\2\2bc\7v\2\2cd\7u\2\2de\7w\2\2e\22\3\2\2\2fg\7"+
		"l\2\2gh\7k\2\2hi\7i\2\2ij\7g\2\2jk\7p\2\2k\24\3\2\2\2lm\7p\2\2mn\7c\2"+
		"\2no\7i\2\2op\7c\2\2pq\7u\2\2qr\7c\2\2r\26\3\2\2\2st\7u\2\2tu\7j\2\2u"+
		"v\7w\2\2vw\7u\2\2wx\7j\2\2xy\7k\2\2y\30\3\2\2\2z{\7m\2\2{|\7k\2\2|}\7"+
		"f\2\2}~\7q\2\2~\32\3\2\2\2\177\u0080\7m\2\2\u0080\u0081\7c\2\2\u0081\u0082"+
		"\7p\2\2\u0082\u0083\7u\2\2\u0083\u0084\7w\2\2\u0084\34\3\2\2\2\u0085\u0086"+
		"\7u\2\2\u0086\u0087\7q\2\2\u0087\u0088\7t\2\2\u0088\u0089\7g\2\2\u0089"+
		"\u008a\7p\2\2\u008a\u008b\7c\2\2\u008b\u008c\7t\2\2\u008c\u008d\7c\2\2"+
		"\u008d\36\3\2\2\2\u008e\u0092\t\5\2\2\u008f\u0091\t\6\2\2\u0090\u008f"+
		"\3\2\2\2\u0091\u0094\3\2\2\2\u0092\u0090\3\2\2\2\u0092\u0093\3\2\2\2\u0093"+
		" \3\2\2\2\u0094\u0092\3\2\2\2\u0095\u0097\7\17\2\2\u0096\u0095\3\2\2\2"+
		"\u0096\u0097\3\2\2\2\u0097\u0098\3\2\2\2\u0098\u0099\7\f\2\2\u0099\u009a"+
		"\3\2\2\2\u009a\u009b\b\21\2\2\u009b\"\3\2\2\2\u009c\u00a0\7%\2\2\u009d"+
		"\u009f\n\7\2\2\u009e\u009d\3\2\2\2\u009f\u00a2\3\2\2\2\u00a0\u009e\3\2"+
		"\2\2\u00a0\u00a1\3\2\2\2\u00a1$\3\2\2\2\u00a2\u00a0\3\2\2\2\u00a3\u00a4"+
		"\7=\2\2\u00a4&\3\2\2\2\u00a5\u00a7\t\b\2\2\u00a6\u00a5\3\2\2\2\u00a7\u00a8"+
		"\3\2\2\2\u00a8\u00a6\3\2\2\2\u00a8\u00a9\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa"+
		"\u00ab\b\24\2\2\u00ab(\3\2\2\2\u00ac\u00ad\5\27\f\2\u00ad\u00ae\5%\23"+
		"\2\u00ae*\3\2\2\2\13\2.\64\669\u0092\u0096\u00a0\u00a8\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}