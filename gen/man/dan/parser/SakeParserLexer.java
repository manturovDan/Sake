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
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, INT=16, SEISU=17, 
		RONRI=18, SHINRI=19, OSU=20, RIPPOTAI=21, HAIRETSU=22, JIGEN=23, NAGASA=24, 
		ID=25, NEWLINE=26, ENDEXPR=27, WS=28, SHUSHI=29, END_BLOCK=30;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "INT_NON_NEG", "INT", 
			"SEISU", "RONRI", "SHINRI", "OSU", "RIPPOTAI", "HAIRETSU", "JIGEN", "NAGASA", 
			"ID", "NEWLINE", "ENDEXPR", "WS", "SHUSHI", "END_BLOCK"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'~'", "'+'", "'-'", "'<'", "'>'", "'^'", "'v'", "'('", "')'", 
			"'='", "','", "'{'", "'}'", "'['", "']'", null, "'seisu'", "'ronri'", 
			"'shinri'", "'osu'", "'rippotai'", "'hairetsu'", "'jigen'", "'nagasa'", 
			null, null, "';'", null, "'SHUSHI'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, "INT", "SEISU", "RONRI", "SHINRI", "OSU", "RIPPOTAI", 
			"HAIRETSU", "JIGEN", "NAGASA", "ID", "NEWLINE", "ENDEXPR", "WS", "SHUSHI", 
			"END_BLOCK"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2 \u00c8\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \3\2"+
		"\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3"+
		"\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\6\21a\n\21"+
		"\r\21\16\21b\3\21\3\21\6\21g\n\21\r\21\16\21h\5\21k\n\21\3\22\5\22n\n"+
		"\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3"+
		"\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\27\3\27\3"+
		"\27\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3"+
		"\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3"+
		"\32\3\33\3\33\7\33\u00aa\n\33\f\33\16\33\u00ad\13\33\3\34\5\34\u00b0\n"+
		"\34\3\34\3\34\3\34\3\34\3\35\3\35\3\36\6\36\u00b9\n\36\r\36\16\36\u00ba"+
		"\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \2\2!\3\3\5\4\7"+
		"\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\2#"+
		"\22%\23\'\24)\25+\26-\27/\30\61\31\63\32\65\33\67\349\35;\36=\37? \3\2"+
		"\b\3\2\62;\4\2\62;CH\4\2--//\4\2C\\c|\5\2\62;C\\c|\4\2\13\13\"\"\2\u00cd"+
		"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2"+
		"\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2#\3\2\2\2\2%\3\2"+
		"\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2"+
		"\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3"+
		"\2\2\2\2?\3\2\2\2\3A\3\2\2\2\5C\3\2\2\2\7E\3\2\2\2\tG\3\2\2\2\13I\3\2"+
		"\2\2\rK\3\2\2\2\17M\3\2\2\2\21O\3\2\2\2\23Q\3\2\2\2\25S\3\2\2\2\27U\3"+
		"\2\2\2\31W\3\2\2\2\33Y\3\2\2\2\35[\3\2\2\2\37]\3\2\2\2!j\3\2\2\2#m\3\2"+
		"\2\2%q\3\2\2\2\'w\3\2\2\2)}\3\2\2\2+\u0084\3\2\2\2-\u0088\3\2\2\2/\u0091"+
		"\3\2\2\2\61\u009a\3\2\2\2\63\u00a0\3\2\2\2\65\u00a7\3\2\2\2\67\u00af\3"+
		"\2\2\29\u00b5\3\2\2\2;\u00b8\3\2\2\2=\u00be\3\2\2\2?\u00c5\3\2\2\2AB\7"+
		"\u0080\2\2B\4\3\2\2\2CD\7-\2\2D\6\3\2\2\2EF\7/\2\2F\b\3\2\2\2GH\7>\2\2"+
		"H\n\3\2\2\2IJ\7@\2\2J\f\3\2\2\2KL\7`\2\2L\16\3\2\2\2MN\7x\2\2N\20\3\2"+
		"\2\2OP\7*\2\2P\22\3\2\2\2QR\7+\2\2R\24\3\2\2\2ST\7?\2\2T\26\3\2\2\2UV"+
		"\7.\2\2V\30\3\2\2\2WX\7}\2\2X\32\3\2\2\2YZ\7\177\2\2Z\34\3\2\2\2[\\\7"+
		"]\2\2\\\36\3\2\2\2]^\7_\2\2^ \3\2\2\2_a\t\2\2\2`_\3\2\2\2ab\3\2\2\2b`"+
		"\3\2\2\2bc\3\2\2\2ck\3\2\2\2df\7z\2\2eg\t\3\2\2fe\3\2\2\2gh\3\2\2\2hf"+
		"\3\2\2\2hi\3\2\2\2ik\3\2\2\2j`\3\2\2\2jd\3\2\2\2k\"\3\2\2\2ln\t\4\2\2"+
		"ml\3\2\2\2mn\3\2\2\2no\3\2\2\2op\5!\21\2p$\3\2\2\2qr\7u\2\2rs\7g\2\2s"+
		"t\7k\2\2tu\7u\2\2uv\7w\2\2v&\3\2\2\2wx\7t\2\2xy\7q\2\2yz\7p\2\2z{\7t\2"+
		"\2{|\7k\2\2|(\3\2\2\2}~\7u\2\2~\177\7j\2\2\177\u0080\7k\2\2\u0080\u0081"+
		"\7p\2\2\u0081\u0082\7t\2\2\u0082\u0083\7k\2\2\u0083*\3\2\2\2\u0084\u0085"+
		"\7q\2\2\u0085\u0086\7u\2\2\u0086\u0087\7w\2\2\u0087,\3\2\2\2\u0088\u0089"+
		"\7t\2\2\u0089\u008a\7k\2\2\u008a\u008b\7r\2\2\u008b\u008c\7r\2\2\u008c"+
		"\u008d\7q\2\2\u008d\u008e\7v\2\2\u008e\u008f\7c\2\2\u008f\u0090\7k\2\2"+
		"\u0090.\3\2\2\2\u0091\u0092\7j\2\2\u0092\u0093\7c\2\2\u0093\u0094\7k\2"+
		"\2\u0094\u0095\7t\2\2\u0095\u0096\7g\2\2\u0096\u0097\7v\2\2\u0097\u0098"+
		"\7u\2\2\u0098\u0099\7w\2\2\u0099\60\3\2\2\2\u009a\u009b\7l\2\2\u009b\u009c"+
		"\7k\2\2\u009c\u009d\7i\2\2\u009d\u009e\7g\2\2\u009e\u009f\7p\2\2\u009f"+
		"\62\3\2\2\2\u00a0\u00a1\7p\2\2\u00a1\u00a2\7c\2\2\u00a2\u00a3\7i\2\2\u00a3"+
		"\u00a4\7c\2\2\u00a4\u00a5\7u\2\2\u00a5\u00a6\7c\2\2\u00a6\64\3\2\2\2\u00a7"+
		"\u00ab\t\5\2\2\u00a8\u00aa\t\6\2\2\u00a9\u00a8\3\2\2\2\u00aa\u00ad\3\2"+
		"\2\2\u00ab\u00a9\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac\66\3\2\2\2\u00ad\u00ab"+
		"\3\2\2\2\u00ae\u00b0\7\17\2\2\u00af\u00ae\3\2\2\2\u00af\u00b0\3\2\2\2"+
		"\u00b0\u00b1\3\2\2\2\u00b1\u00b2\7\f\2\2\u00b2\u00b3\3\2\2\2\u00b3\u00b4"+
		"\b\34\2\2\u00b48\3\2\2\2\u00b5\u00b6\7=\2\2\u00b6:\3\2\2\2\u00b7\u00b9"+
		"\t\7\2\2\u00b8\u00b7\3\2\2\2\u00b9\u00ba\3\2\2\2\u00ba\u00b8\3\2\2\2\u00ba"+
		"\u00bb\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc\u00bd\b\36\2\2\u00bd<\3\2\2\2"+
		"\u00be\u00bf\7U\2\2\u00bf\u00c0\7J\2\2\u00c0\u00c1\7W\2\2\u00c1\u00c2"+
		"\7U\2\2\u00c2\u00c3\7J\2\2\u00c3\u00c4\7K\2\2\u00c4>\3\2\2\2\u00c5\u00c6"+
		"\5=\37\2\u00c6\u00c7\59\35\2\u00c7@\3\2\2\2\n\2bhjm\u00ab\u00af\u00ba"+
		"\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}