// Generated from /home/danila/source/Sake/src/man/dan/parser/SakeParser.g4 by ANTLR 4.8
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
public class SakeParserLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, SEISU=17, 
		RONRI=18, SHINRI=19, OSU=20, RIPPOTAI=21, HAIRETSU=22, JIGEN=23, NAGASA=24, 
		SHUSHI=25, KIDO=26, KANSU=27, SORENARA=28, SHUKI=29, ID=30, NEWLINE=31, 
		COMMENT=32, ENDEXPR=33, WS=34, END_BLOCK=35;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "INTEGER", 
			"SEISU", "RONRI", "SHINRI", "OSU", "RIPPOTAI", "HAIRETSU", "JIGEN", "NAGASA", 
			"SHUSHI", "KIDO", "KANSU", "SORENARA", "SHUKI", "ID", "NEWLINE", "COMMENT", 
			"ENDEXPR", "WS", "END_BLOCK"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'+'", "'-'", "'~'", "'<'", "'>'", "'^'", "'v'", "'('", "')'", 
			"'='", "','", "'{'", "'}'", "'['", "']'", "':'", "'seisu'", "'ronri'", 
			"'shinri'", "'osu'", "'rippotai'", "'hairetsu'", "'jigen'", "'nagasa'", 
			"'shushi'", "'kido'", "'kansu'", "'sorenara'", "'shuki'", null, null, 
			null, "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, "SEISU", "RONRI", "SHINRI", "OSU", "RIPPOTAI", 
			"HAIRETSU", "JIGEN", "NAGASA", "SHUSHI", "KIDO", "KANSU", "SORENARA", 
			"SHUKI", "ID", "NEWLINE", "COMMENT", "ENDEXPR", "WS", "END_BLOCK"
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


	public SakeParserLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "SakeParser.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2%\u00f0\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6"+
		"\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3"+
		"\17\3\17\3\20\3\20\3\21\3\21\3\22\6\22m\n\22\r\22\16\22n\3\22\3\22\6\22"+
		"s\n\22\r\22\16\22t\5\22w\n\22\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26"+
		"\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34"+
		"\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36"+
		"\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3 \3 \7 \u00d2\n \f \16"+
		" \u00d5\13 \3!\5!\u00d8\n!\3!\3!\3!\3!\3\"\3\"\7\"\u00e0\n\"\f\"\16\""+
		"\u00e3\13\"\3#\3#\3$\6$\u00e8\n$\r$\16$\u00e9\3$\3$\3%\3%\3%\2\2&\3\3"+
		"\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21"+
		"!\22#\2%\23\'\24)\25+\26-\27/\30\61\31\63\32\65\33\67\349\35;\36=\37?"+
		" A!C\"E#G$I%\3\2\b\3\2\62;\4\2\62;CH\4\2C\\c|\5\2\62;C\\c|\4\2\f\f\17"+
		"\17\4\2\13\13\"\"\2\u00f5\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2"+
		"\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2"+
		"\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3"+
		"\2\2\2\2!\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2"+
		"\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\2"+
		"9\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3"+
		"\2\2\2\2G\3\2\2\2\2I\3\2\2\2\3K\3\2\2\2\5M\3\2\2\2\7O\3\2\2\2\tQ\3\2\2"+
		"\2\13S\3\2\2\2\rU\3\2\2\2\17W\3\2\2\2\21Y\3\2\2\2\23[\3\2\2\2\25]\3\2"+
		"\2\2\27_\3\2\2\2\31a\3\2\2\2\33c\3\2\2\2\35e\3\2\2\2\37g\3\2\2\2!i\3\2"+
		"\2\2#v\3\2\2\2%x\3\2\2\2\'~\3\2\2\2)\u0084\3\2\2\2+\u008b\3\2\2\2-\u008f"+
		"\3\2\2\2/\u0098\3\2\2\2\61\u00a1\3\2\2\2\63\u00a7\3\2\2\2\65\u00ae\3\2"+
		"\2\2\67\u00b5\3\2\2\29\u00ba\3\2\2\2;\u00c0\3\2\2\2=\u00c9\3\2\2\2?\u00cf"+
		"\3\2\2\2A\u00d7\3\2\2\2C\u00dd\3\2\2\2E\u00e4\3\2\2\2G\u00e7\3\2\2\2I"+
		"\u00ed\3\2\2\2KL\7-\2\2L\4\3\2\2\2MN\7/\2\2N\6\3\2\2\2OP\7\u0080\2\2P"+
		"\b\3\2\2\2QR\7>\2\2R\n\3\2\2\2ST\7@\2\2T\f\3\2\2\2UV\7`\2\2V\16\3\2\2"+
		"\2WX\7x\2\2X\20\3\2\2\2YZ\7*\2\2Z\22\3\2\2\2[\\\7+\2\2\\\24\3\2\2\2]^"+
		"\7?\2\2^\26\3\2\2\2_`\7.\2\2`\30\3\2\2\2ab\7}\2\2b\32\3\2\2\2cd\7\177"+
		"\2\2d\34\3\2\2\2ef\7]\2\2f\36\3\2\2\2gh\7_\2\2h \3\2\2\2ij\7<\2\2j\"\3"+
		"\2\2\2km\t\2\2\2lk\3\2\2\2mn\3\2\2\2nl\3\2\2\2no\3\2\2\2ow\3\2\2\2pr\7"+
		"z\2\2qs\t\3\2\2rq\3\2\2\2st\3\2\2\2tr\3\2\2\2tu\3\2\2\2uw\3\2\2\2vl\3"+
		"\2\2\2vp\3\2\2\2w$\3\2\2\2xy\7u\2\2yz\7g\2\2z{\7k\2\2{|\7u\2\2|}\7w\2"+
		"\2}&\3\2\2\2~\177\7t\2\2\177\u0080\7q\2\2\u0080\u0081\7p\2\2\u0081\u0082"+
		"\7t\2\2\u0082\u0083\7k\2\2\u0083(\3\2\2\2\u0084\u0085\7u\2\2\u0085\u0086"+
		"\7j\2\2\u0086\u0087\7k\2\2\u0087\u0088\7p\2\2\u0088\u0089\7t\2\2\u0089"+
		"\u008a\7k\2\2\u008a*\3\2\2\2\u008b\u008c\7q\2\2\u008c\u008d\7u\2\2\u008d"+
		"\u008e\7w\2\2\u008e,\3\2\2\2\u008f\u0090\7t\2\2\u0090\u0091\7k\2\2\u0091"+
		"\u0092\7r\2\2\u0092\u0093\7r\2\2\u0093\u0094\7q\2\2\u0094\u0095\7v\2\2"+
		"\u0095\u0096\7c\2\2\u0096\u0097\7k\2\2\u0097.\3\2\2\2\u0098\u0099\7j\2"+
		"\2\u0099\u009a\7c\2\2\u009a\u009b\7k\2\2\u009b\u009c\7t\2\2\u009c\u009d"+
		"\7g\2\2\u009d\u009e\7v\2\2\u009e\u009f\7u\2\2\u009f\u00a0\7w\2\2\u00a0"+
		"\60\3\2\2\2\u00a1\u00a2\7l\2\2\u00a2\u00a3\7k\2\2\u00a3\u00a4\7i\2\2\u00a4"+
		"\u00a5\7g\2\2\u00a5\u00a6\7p\2\2\u00a6\62\3\2\2\2\u00a7\u00a8\7p\2\2\u00a8"+
		"\u00a9\7c\2\2\u00a9\u00aa\7i\2\2\u00aa\u00ab\7c\2\2\u00ab\u00ac\7u\2\2"+
		"\u00ac\u00ad\7c\2\2\u00ad\64\3\2\2\2\u00ae\u00af\7u\2\2\u00af\u00b0\7"+
		"j\2\2\u00b0\u00b1\7w\2\2\u00b1\u00b2\7u\2\2\u00b2\u00b3\7j\2\2\u00b3\u00b4"+
		"\7k\2\2\u00b4\66\3\2\2\2\u00b5\u00b6\7m\2\2\u00b6\u00b7\7k\2\2\u00b7\u00b8"+
		"\7f\2\2\u00b8\u00b9\7q\2\2\u00b98\3\2\2\2\u00ba\u00bb\7m\2\2\u00bb\u00bc"+
		"\7c\2\2\u00bc\u00bd\7p\2\2\u00bd\u00be\7u\2\2\u00be\u00bf\7w\2\2\u00bf"+
		":\3\2\2\2\u00c0\u00c1\7u\2\2\u00c1\u00c2\7q\2\2\u00c2\u00c3\7t\2\2\u00c3"+
		"\u00c4\7g\2\2\u00c4\u00c5\7p\2\2\u00c5\u00c6\7c\2\2\u00c6\u00c7\7t\2\2"+
		"\u00c7\u00c8\7c\2\2\u00c8<\3\2\2\2\u00c9\u00ca\7u\2\2\u00ca\u00cb\7j\2"+
		"\2\u00cb\u00cc\7w\2\2\u00cc\u00cd\7m\2\2\u00cd\u00ce\7k\2\2\u00ce>\3\2"+
		"\2\2\u00cf\u00d3\t\4\2\2\u00d0\u00d2\t\5\2\2\u00d1\u00d0\3\2\2\2\u00d2"+
		"\u00d5\3\2\2\2\u00d3\u00d1\3\2\2\2\u00d3\u00d4\3\2\2\2\u00d4@\3\2\2\2"+
		"\u00d5\u00d3\3\2\2\2\u00d6\u00d8\7\17\2\2\u00d7\u00d6\3\2\2\2\u00d7\u00d8"+
		"\3\2\2\2\u00d8\u00d9\3\2\2\2\u00d9\u00da\7\f\2\2\u00da\u00db\3\2\2\2\u00db"+
		"\u00dc\b!\2\2\u00dcB\3\2\2\2\u00dd\u00e1\7%\2\2\u00de\u00e0\n\6\2\2\u00df"+
		"\u00de\3\2\2\2\u00e0\u00e3\3\2\2\2\u00e1\u00df\3\2\2\2\u00e1\u00e2\3\2"+
		"\2\2\u00e2D\3\2\2\2\u00e3\u00e1\3\2\2\2\u00e4\u00e5\7=\2\2\u00e5F\3\2"+
		"\2\2\u00e6\u00e8\t\7\2\2\u00e7\u00e6\3\2\2\2\u00e8\u00e9\3\2\2\2\u00e9"+
		"\u00e7\3\2\2\2\u00e9\u00ea\3\2\2\2\u00ea\u00eb\3\2\2\2\u00eb\u00ec\b$"+
		"\2\2\u00ecH\3\2\2\2\u00ed\u00ee\5\65\33\2\u00ee\u00ef\5E#\2\u00efJ\3\2"+
		"\2\2\n\2ntv\u00d3\u00d7\u00e1\u00e9\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}