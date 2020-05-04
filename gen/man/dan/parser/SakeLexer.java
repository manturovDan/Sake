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
		NAGASA=9, ID=10, NEWLINE=11, ENDEXPR=12, WS=13, SHUSHI=14, END_BLOCK=15;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"INT_NON_NEG", "INT", "SEISU", "RONRI", "SHINRI", "OSU", "RIPPOTAI", 
			"HAIRETSU", "JIGEN", "NAGASA", "ID", "NEWLINE", "ENDEXPR", "WS", "SHUSHI", 
			"END_BLOCK"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "'seisu'", "'ronri'", "'shinri'", "'osu'", "'rippotai'", 
			"'hairetsu'", "'jigen'", "'nagasa'", null, null, "';'", null, "'SHUSHI'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "INT", "SEISU", "RONRI", "SHINRI", "OSU", "RIPPOTAI", "HAIRETSU", 
			"JIGEN", "NAGASA", "ID", "NEWLINE", "ENDEXPR", "WS", "SHUSHI", "END_BLOCK"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\21\u008c\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\3\2\6"+
		"\2%\n\2\r\2\16\2&\3\2\3\2\6\2+\n\2\r\2\16\2,\5\2/\n\2\3\3\5\3\62\n\3\3"+
		"\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\f\3\f\7\fn\n\f\f\f\16\fq\13\f\3\r\5\rt\n\r\3\r"+
		"\3\r\3\r\3\r\3\16\3\16\3\17\6\17}\n\17\r\17\16\17~\3\17\3\17\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\2\2\22\3\2\5\3\7\4\t\5\13\6\r"+
		"\7\17\b\21\t\23\n\25\13\27\f\31\r\33\16\35\17\37\20!\21\3\2\b\3\2\62;"+
		"\4\2\62;CH\4\2--//\4\2C\\c|\5\2\62;C\\c|\4\2\13\13\"\"\2\u0091\2\5\3\2"+
		"\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21"+
		"\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2"+
		"\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\3.\3\2\2\2\5\61\3\2\2\2\7\65"+
		"\3\2\2\2\t;\3\2\2\2\13A\3\2\2\2\rH\3\2\2\2\17L\3\2\2\2\21U\3\2\2\2\23"+
		"^\3\2\2\2\25d\3\2\2\2\27k\3\2\2\2\31s\3\2\2\2\33y\3\2\2\2\35|\3\2\2\2"+
		"\37\u0082\3\2\2\2!\u0089\3\2\2\2#%\t\2\2\2$#\3\2\2\2%&\3\2\2\2&$\3\2\2"+
		"\2&\'\3\2\2\2\'/\3\2\2\2(*\7z\2\2)+\t\3\2\2*)\3\2\2\2+,\3\2\2\2,*\3\2"+
		"\2\2,-\3\2\2\2-/\3\2\2\2.$\3\2\2\2.(\3\2\2\2/\4\3\2\2\2\60\62\t\4\2\2"+
		"\61\60\3\2\2\2\61\62\3\2\2\2\62\63\3\2\2\2\63\64\5\3\2\2\64\6\3\2\2\2"+
		"\65\66\7u\2\2\66\67\7g\2\2\678\7k\2\289\7u\2\29:\7w\2\2:\b\3\2\2\2;<\7"+
		"t\2\2<=\7q\2\2=>\7p\2\2>?\7t\2\2?@\7k\2\2@\n\3\2\2\2AB\7u\2\2BC\7j\2\2"+
		"CD\7k\2\2DE\7p\2\2EF\7t\2\2FG\7k\2\2G\f\3\2\2\2HI\7q\2\2IJ\7u\2\2JK\7"+
		"w\2\2K\16\3\2\2\2LM\7t\2\2MN\7k\2\2NO\7r\2\2OP\7r\2\2PQ\7q\2\2QR\7v\2"+
		"\2RS\7c\2\2ST\7k\2\2T\20\3\2\2\2UV\7j\2\2VW\7c\2\2WX\7k\2\2XY\7t\2\2Y"+
		"Z\7g\2\2Z[\7v\2\2[\\\7u\2\2\\]\7w\2\2]\22\3\2\2\2^_\7l\2\2_`\7k\2\2`a"+
		"\7i\2\2ab\7g\2\2bc\7p\2\2c\24\3\2\2\2de\7p\2\2ef\7c\2\2fg\7i\2\2gh\7c"+
		"\2\2hi\7u\2\2ij\7c\2\2j\26\3\2\2\2ko\t\5\2\2ln\t\6\2\2ml\3\2\2\2nq\3\2"+
		"\2\2om\3\2\2\2op\3\2\2\2p\30\3\2\2\2qo\3\2\2\2rt\7\17\2\2sr\3\2\2\2st"+
		"\3\2\2\2tu\3\2\2\2uv\7\f\2\2vw\3\2\2\2wx\b\r\2\2x\32\3\2\2\2yz\7=\2\2"+
		"z\34\3\2\2\2{}\t\7\2\2|{\3\2\2\2}~\3\2\2\2~|\3\2\2\2~\177\3\2\2\2\177"+
		"\u0080\3\2\2\2\u0080\u0081\b\17\2\2\u0081\36\3\2\2\2\u0082\u0083\7U\2"+
		"\2\u0083\u0084\7J\2\2\u0084\u0085\7W\2\2\u0085\u0086\7U\2\2\u0086\u0087"+
		"\7J\2\2\u0087\u0088\7K\2\2\u0088 \3\2\2\2\u0089\u008a\5\37\20\2\u008a"+
		"\u008b\5\33\16\2\u008b\"\3\2\2\2\n\2&,.\61os~\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}