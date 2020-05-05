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
		NAGASA=9, SHUSHI=10, KIDO=11, KANSU=12, ID=13, NEWLINE=14, ENDEXPR=15, 
		WS=16, END_BLOCK=17;
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
			"ENDEXPR", "WS", "END_BLOCK"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "'seisu'", "'ronri'", "'shinri'", "'osu'", "'rippotai'", 
			"'hairetsu'", "'jigen'", "'nagasa'", "'shushi'", "'kido'", "'kansu'", 
			null, null, "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "INT", "SEISU", "RONRI", "SHINRI", "OSU", "RIPPOTAI", "HAIRETSU", 
			"JIGEN", "NAGASA", "SHUSHI", "KIDO", "KANSU", "ID", "NEWLINE", "ENDEXPR", 
			"WS", "END_BLOCK"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\23\u009b\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\3\2\6\2)\n\2\r\2\16\2*\3\2\3\2\6\2/\n\2\r\2\16\2\60\5"+
		"\2\63\n\2\3\3\5\3\66\n\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\7\17"+
		"\u0084\n\17\f\17\16\17\u0087\13\17\3\20\5\20\u008a\n\20\3\20\3\20\3\20"+
		"\3\20\3\21\3\21\3\22\6\22\u0093\n\22\r\22\16\22\u0094\3\22\3\22\3\23\3"+
		"\23\3\23\2\2\24\3\2\5\3\7\4\t\5\13\6\r\7\17\b\21\t\23\n\25\13\27\f\31"+
		"\r\33\16\35\17\37\20!\21#\22%\23\3\2\b\3\2\62;\4\2\62;CH\4\2--//\4\2C"+
		"\\c|\5\2\62;C\\c|\4\2\13\13\"\"\2\u00a0\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3"+
		"\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2"+
		"\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37"+
		"\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\3\62\3\2\2\2\5\65\3\2\2\2\7"+
		"9\3\2\2\2\t?\3\2\2\2\13E\3\2\2\2\rL\3\2\2\2\17P\3\2\2\2\21Y\3\2\2\2\23"+
		"b\3\2\2\2\25h\3\2\2\2\27o\3\2\2\2\31v\3\2\2\2\33{\3\2\2\2\35\u0081\3\2"+
		"\2\2\37\u0089\3\2\2\2!\u008f\3\2\2\2#\u0092\3\2\2\2%\u0098\3\2\2\2\')"+
		"\t\2\2\2(\'\3\2\2\2)*\3\2\2\2*(\3\2\2\2*+\3\2\2\2+\63\3\2\2\2,.\7z\2\2"+
		"-/\t\3\2\2.-\3\2\2\2/\60\3\2\2\2\60.\3\2\2\2\60\61\3\2\2\2\61\63\3\2\2"+
		"\2\62(\3\2\2\2\62,\3\2\2\2\63\4\3\2\2\2\64\66\t\4\2\2\65\64\3\2\2\2\65"+
		"\66\3\2\2\2\66\67\3\2\2\2\678\5\3\2\28\6\3\2\2\29:\7u\2\2:;\7g\2\2;<\7"+
		"k\2\2<=\7u\2\2=>\7w\2\2>\b\3\2\2\2?@\7t\2\2@A\7q\2\2AB\7p\2\2BC\7t\2\2"+
		"CD\7k\2\2D\n\3\2\2\2EF\7u\2\2FG\7j\2\2GH\7k\2\2HI\7p\2\2IJ\7t\2\2JK\7"+
		"k\2\2K\f\3\2\2\2LM\7q\2\2MN\7u\2\2NO\7w\2\2O\16\3\2\2\2PQ\7t\2\2QR\7k"+
		"\2\2RS\7r\2\2ST\7r\2\2TU\7q\2\2UV\7v\2\2VW\7c\2\2WX\7k\2\2X\20\3\2\2\2"+
		"YZ\7j\2\2Z[\7c\2\2[\\\7k\2\2\\]\7t\2\2]^\7g\2\2^_\7v\2\2_`\7u\2\2`a\7"+
		"w\2\2a\22\3\2\2\2bc\7l\2\2cd\7k\2\2de\7i\2\2ef\7g\2\2fg\7p\2\2g\24\3\2"+
		"\2\2hi\7p\2\2ij\7c\2\2jk\7i\2\2kl\7c\2\2lm\7u\2\2mn\7c\2\2n\26\3\2\2\2"+
		"op\7u\2\2pq\7j\2\2qr\7w\2\2rs\7u\2\2st\7j\2\2tu\7k\2\2u\30\3\2\2\2vw\7"+
		"m\2\2wx\7k\2\2xy\7f\2\2yz\7q\2\2z\32\3\2\2\2{|\7m\2\2|}\7c\2\2}~\7p\2"+
		"\2~\177\7u\2\2\177\u0080\7w\2\2\u0080\34\3\2\2\2\u0081\u0085\t\5\2\2\u0082"+
		"\u0084\t\6\2\2\u0083\u0082\3\2\2\2\u0084\u0087\3\2\2\2\u0085\u0083\3\2"+
		"\2\2\u0085\u0086\3\2\2\2\u0086\36\3\2\2\2\u0087\u0085\3\2\2\2\u0088\u008a"+
		"\7\17\2\2\u0089\u0088\3\2\2\2\u0089\u008a\3\2\2\2\u008a\u008b\3\2\2\2"+
		"\u008b\u008c\7\f\2\2\u008c\u008d\3\2\2\2\u008d\u008e\b\20\2\2\u008e \3"+
		"\2\2\2\u008f\u0090\7=\2\2\u0090\"\3\2\2\2\u0091\u0093\t\7\2\2\u0092\u0091"+
		"\3\2\2\2\u0093\u0094\3\2\2\2\u0094\u0092\3\2\2\2\u0094\u0095\3\2\2\2\u0095"+
		"\u0096\3\2\2\2\u0096\u0097\b\22\2\2\u0097$\3\2\2\2\u0098\u0099\5\27\f"+
		"\2\u0099\u009a\5!\21\2\u009a&\3\2\2\2\n\2*\60\62\65\u0085\u0089\u0094"+
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