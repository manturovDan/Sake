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
		T__9=10, T__10=11, T__11=12, INT=13, SEISU=14, RONRI=15, SHINRI=16, OSU=17, 
		RIPPOTAI=18, HAIRETSU=19, JIGEN=20, NAGASA=21, SHUSHI=22, KIDO=23, KANSU=24, 
		SORENARA=25, MODORU=26, SHUKI=27, SENDEN=28, RUIKEI=29, UNDEFINED=30, 
		FIELD=31, TOX=32, TOY=33, TOZ=34, TOKABE=35, PLUS=36, MINUS=37, GREATER=38, 
		LESS=39, ID=40, NEWLINE=41, COMMENT=42, ENDEXPR=43, WS=44, END_BLOCK=45, 
		UP=46, DOWN=47, LEFTWARD=48, RIGHTWARD=49, FORWARD=50, BACK=51, BREAK=52, 
		LOOKUP=53, LOOKDOWN=54, LOOKLEFT=55, LOOKRIGHT=56, LOOKFW=57, LOOKBACK=58;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "INT", "SEISU", "RONRI", "SHINRI", "OSU", "RIPPOTAI", 
			"HAIRETSU", "JIGEN", "NAGASA", "SHUSHI", "KIDO", "KANSU", "SORENARA", 
			"MODORU", "SHUKI", "SENDEN", "RUIKEI", "UNDEFINED", "FIELD", "TOX", "TOY", 
			"TOZ", "TOKABE", "PLUS", "MINUS", "GREATER", "LESS", "ID", "NEWLINE", 
			"COMMENT", "ENDEXPR", "WS", "END_BLOCK", "UP", "DOWN", "LEFTWARD", "RIGHTWARD", 
			"FORWARD", "BACK", "BREAK", "LOOKUP", "LOOKDOWN", "LOOKLEFT", "LOOKRIGHT", 
			"LOOKFW", "LOOKBACK"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'~'", "'^'", "'v'", "'('", "')'", "'='", "'['", "','", "']'", 
			"'{'", "'}'", "':'", null, "'seisu'", "'ronri'", "'shinri'", "'osu'", 
			"'rippotai'", "'hairetsu'", "'jigen'", "'nagasa'", "'shushi'", "'kido'", 
			"'kansu'", "'sorenara'", "'modoru'", "'shuki'", "'senden'", "'ruikei'", 
			"'undefined'", "'=>'", "'X'", "'Y'", "'Z'", "'kabe'", "'+'", "'-'", "'>'", 
			"'<'", null, null, null, "';'", null, null, "'^-^'", "'v-v'", "'<-<'", 
			"'>->'", "'o-o'", "'~-~'", "'>-<'", "'^-0'", "'v-0'", "'<-0'", "'>-0'", 
			"'o-0'", "'~-0'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, "INT", "SEISU", "RONRI", "SHINRI", "OSU", "RIPPOTAI", "HAIRETSU", 
			"JIGEN", "NAGASA", "SHUSHI", "KIDO", "KANSU", "SORENARA", "MODORU", "SHUKI", 
			"SENDEN", "RUIKEI", "UNDEFINED", "FIELD", "TOX", "TOY", "TOZ", "TOKABE", 
			"PLUS", "MINUS", "GREATER", "LESS", "ID", "NEWLINE", "COMMENT", "ENDEXPR", 
			"WS", "END_BLOCK", "UP", "DOWN", "LEFTWARD", "RIGHTWARD", "FORWARD", 
			"BACK", "BREAK", "LOOKUP", "LOOKDOWN", "LOOKLEFT", "LOOKRIGHT", "LOOKFW", 
			"LOOKBACK"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2<\u017d\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\3\2\3\2\3\3"+
		"\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13"+
		"\3\f\3\f\3\r\3\r\3\16\6\16\u0091\n\16\r\16\16\16\u0092\3\16\3\16\6\16"+
		"\u0097\n\16\r\16\16\16\u0098\5\16\u009b\n\16\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\34"+
		"\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36"+
		"\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37"+
		"\3\37\3 \3 \3 \3!\3!\3\"\3\"\3#\3#\3$\3$\3$\3$\3$\3%\3%\3&\3&\3\'\3\'"+
		"\3(\3(\3)\3)\7)\u012b\n)\f)\16)\u012e\13)\3*\5*\u0131\n*\3*\3*\3*\3*\3"+
		"+\3+\7+\u0139\n+\f+\16+\u013c\13+\3,\3,\3-\6-\u0141\n-\r-\16-\u0142\3"+
		"-\3-\3.\3.\3.\3/\3/\3/\3/\3\60\3\60\3\60\3\60\3\61\3\61\3\61\3\61\3\62"+
		"\3\62\3\62\3\62\3\63\3\63\3\63\3\63\3\64\3\64\3\64\3\64\3\65\3\65\3\65"+
		"\3\65\3\66\3\66\3\66\3\66\3\67\3\67\3\67\3\67\38\38\38\38\39\39\39\39"+
		"\3:\3:\3:\3:\3;\3;\3;\3;\2\2<\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13"+
		"\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61"+
		"\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61"+
		"a\62c\63e\64g\65i\66k\67m8o9q:s;u<\3\2\b\3\2\62;\4\2\62;CH\5\2C\\aac|"+
		"\6\2\62;C\\aac|\4\2\f\f\17\17\4\2\13\13\"\"\2\u0183\2\3\3\2\2\2\2\5\3"+
		"\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2"+
		"\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3"+
		"\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'"+
		"\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63"+
		"\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2"+
		"?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3"+
		"\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2"+
		"\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2"+
		"e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3"+
		"\2\2\2\2s\3\2\2\2\2u\3\2\2\2\3w\3\2\2\2\5y\3\2\2\2\7{\3\2\2\2\t}\3\2\2"+
		"\2\13\177\3\2\2\2\r\u0081\3\2\2\2\17\u0083\3\2\2\2\21\u0085\3\2\2\2\23"+
		"\u0087\3\2\2\2\25\u0089\3\2\2\2\27\u008b\3\2\2\2\31\u008d\3\2\2\2\33\u009a"+
		"\3\2\2\2\35\u009c\3\2\2\2\37\u00a2\3\2\2\2!\u00a8\3\2\2\2#\u00af\3\2\2"+
		"\2%\u00b3\3\2\2\2\'\u00bc\3\2\2\2)\u00c5\3\2\2\2+\u00cb\3\2\2\2-\u00d2"+
		"\3\2\2\2/\u00d9\3\2\2\2\61\u00de\3\2\2\2\63\u00e4\3\2\2\2\65\u00ed\3\2"+
		"\2\2\67\u00f4\3\2\2\29\u00fa\3\2\2\2;\u0101\3\2\2\2=\u0108\3\2\2\2?\u0112"+
		"\3\2\2\2A\u0115\3\2\2\2C\u0117\3\2\2\2E\u0119\3\2\2\2G\u011b\3\2\2\2I"+
		"\u0120\3\2\2\2K\u0122\3\2\2\2M\u0124\3\2\2\2O\u0126\3\2\2\2Q\u0128\3\2"+
		"\2\2S\u0130\3\2\2\2U\u0136\3\2\2\2W\u013d\3\2\2\2Y\u0140\3\2\2\2[\u0146"+
		"\3\2\2\2]\u0149\3\2\2\2_\u014d\3\2\2\2a\u0151\3\2\2\2c\u0155\3\2\2\2e"+
		"\u0159\3\2\2\2g\u015d\3\2\2\2i\u0161\3\2\2\2k\u0165\3\2\2\2m\u0169\3\2"+
		"\2\2o\u016d\3\2\2\2q\u0171\3\2\2\2s\u0175\3\2\2\2u\u0179\3\2\2\2wx\7\u0080"+
		"\2\2x\4\3\2\2\2yz\7`\2\2z\6\3\2\2\2{|\7x\2\2|\b\3\2\2\2}~\7*\2\2~\n\3"+
		"\2\2\2\177\u0080\7+\2\2\u0080\f\3\2\2\2\u0081\u0082\7?\2\2\u0082\16\3"+
		"\2\2\2\u0083\u0084\7]\2\2\u0084\20\3\2\2\2\u0085\u0086\7.\2\2\u0086\22"+
		"\3\2\2\2\u0087\u0088\7_\2\2\u0088\24\3\2\2\2\u0089\u008a\7}\2\2\u008a"+
		"\26\3\2\2\2\u008b\u008c\7\177\2\2\u008c\30\3\2\2\2\u008d\u008e\7<\2\2"+
		"\u008e\32\3\2\2\2\u008f\u0091\t\2\2\2\u0090\u008f\3\2\2\2\u0091\u0092"+
		"\3\2\2\2\u0092\u0090\3\2\2\2\u0092\u0093\3\2\2\2\u0093\u009b\3\2\2\2\u0094"+
		"\u0096\7z\2\2\u0095\u0097\t\3\2\2\u0096\u0095\3\2\2\2\u0097\u0098\3\2"+
		"\2\2\u0098\u0096\3\2\2\2\u0098\u0099\3\2\2\2\u0099\u009b\3\2\2\2\u009a"+
		"\u0090\3\2\2\2\u009a\u0094\3\2\2\2\u009b\34\3\2\2\2\u009c\u009d\7u\2\2"+
		"\u009d\u009e\7g\2\2\u009e\u009f\7k\2\2\u009f\u00a0\7u\2\2\u00a0\u00a1"+
		"\7w\2\2\u00a1\36\3\2\2\2\u00a2\u00a3\7t\2\2\u00a3\u00a4\7q\2\2\u00a4\u00a5"+
		"\7p\2\2\u00a5\u00a6\7t\2\2\u00a6\u00a7\7k\2\2\u00a7 \3\2\2\2\u00a8\u00a9"+
		"\7u\2\2\u00a9\u00aa\7j\2\2\u00aa\u00ab\7k\2\2\u00ab\u00ac\7p\2\2\u00ac"+
		"\u00ad\7t\2\2\u00ad\u00ae\7k\2\2\u00ae\"\3\2\2\2\u00af\u00b0\7q\2\2\u00b0"+
		"\u00b1\7u\2\2\u00b1\u00b2\7w\2\2\u00b2$\3\2\2\2\u00b3\u00b4\7t\2\2\u00b4"+
		"\u00b5\7k\2\2\u00b5\u00b6\7r\2\2\u00b6\u00b7\7r\2\2\u00b7\u00b8\7q\2\2"+
		"\u00b8\u00b9\7v\2\2\u00b9\u00ba\7c\2\2\u00ba\u00bb\7k\2\2\u00bb&\3\2\2"+
		"\2\u00bc\u00bd\7j\2\2\u00bd\u00be\7c\2\2\u00be\u00bf\7k\2\2\u00bf\u00c0"+
		"\7t\2\2\u00c0\u00c1\7g\2\2\u00c1\u00c2\7v\2\2\u00c2\u00c3\7u\2\2\u00c3"+
		"\u00c4\7w\2\2\u00c4(\3\2\2\2\u00c5\u00c6\7l\2\2\u00c6\u00c7\7k\2\2\u00c7"+
		"\u00c8\7i\2\2\u00c8\u00c9\7g\2\2\u00c9\u00ca\7p\2\2\u00ca*\3\2\2\2\u00cb"+
		"\u00cc\7p\2\2\u00cc\u00cd\7c\2\2\u00cd\u00ce\7i\2\2\u00ce\u00cf\7c\2\2"+
		"\u00cf\u00d0\7u\2\2\u00d0\u00d1\7c\2\2\u00d1,\3\2\2\2\u00d2\u00d3\7u\2"+
		"\2\u00d3\u00d4\7j\2\2\u00d4\u00d5\7w\2\2\u00d5\u00d6\7u\2\2\u00d6\u00d7"+
		"\7j\2\2\u00d7\u00d8\7k\2\2\u00d8.\3\2\2\2\u00d9\u00da\7m\2\2\u00da\u00db"+
		"\7k\2\2\u00db\u00dc\7f\2\2\u00dc\u00dd\7q\2\2\u00dd\60\3\2\2\2\u00de\u00df"+
		"\7m\2\2\u00df\u00e0\7c\2\2\u00e0\u00e1\7p\2\2\u00e1\u00e2\7u\2\2\u00e2"+
		"\u00e3\7w\2\2\u00e3\62\3\2\2\2\u00e4\u00e5\7u\2\2\u00e5\u00e6\7q\2\2\u00e6"+
		"\u00e7\7t\2\2\u00e7\u00e8\7g\2\2\u00e8\u00e9\7p\2\2\u00e9\u00ea\7c\2\2"+
		"\u00ea\u00eb\7t\2\2\u00eb\u00ec\7c\2\2\u00ec\64\3\2\2\2\u00ed\u00ee\7"+
		"o\2\2\u00ee\u00ef\7q\2\2\u00ef\u00f0\7f\2\2\u00f0\u00f1\7q\2\2\u00f1\u00f2"+
		"\7t\2\2\u00f2\u00f3\7w\2\2\u00f3\66\3\2\2\2\u00f4\u00f5\7u\2\2\u00f5\u00f6"+
		"\7j\2\2\u00f6\u00f7\7w\2\2\u00f7\u00f8\7m\2\2\u00f8\u00f9\7k\2\2\u00f9"+
		"8\3\2\2\2\u00fa\u00fb\7u\2\2\u00fb\u00fc\7g\2\2\u00fc\u00fd\7p\2\2\u00fd"+
		"\u00fe\7f\2\2\u00fe\u00ff\7g\2\2\u00ff\u0100\7p\2\2\u0100:\3\2\2\2\u0101"+
		"\u0102\7t\2\2\u0102\u0103\7w\2\2\u0103\u0104\7k\2\2\u0104\u0105\7m\2\2"+
		"\u0105\u0106\7g\2\2\u0106\u0107\7k\2\2\u0107<\3\2\2\2\u0108\u0109\7w\2"+
		"\2\u0109\u010a\7p\2\2\u010a\u010b\7f\2\2\u010b\u010c\7g\2\2\u010c\u010d"+
		"\7h\2\2\u010d\u010e\7k\2\2\u010e\u010f\7p\2\2\u010f\u0110\7g\2\2\u0110"+
		"\u0111\7f\2\2\u0111>\3\2\2\2\u0112\u0113\7?\2\2\u0113\u0114\7@\2\2\u0114"+
		"@\3\2\2\2\u0115\u0116\7Z\2\2\u0116B\3\2\2\2\u0117\u0118\7[\2\2\u0118D"+
		"\3\2\2\2\u0119\u011a\7\\\2\2\u011aF\3\2\2\2\u011b\u011c\7m\2\2\u011c\u011d"+
		"\7c\2\2\u011d\u011e\7d\2\2\u011e\u011f\7g\2\2\u011fH\3\2\2\2\u0120\u0121"+
		"\7-\2\2\u0121J\3\2\2\2\u0122\u0123\7/\2\2\u0123L\3\2\2\2\u0124\u0125\7"+
		"@\2\2\u0125N\3\2\2\2\u0126\u0127\7>\2\2\u0127P\3\2\2\2\u0128\u012c\t\4"+
		"\2\2\u0129\u012b\t\5\2\2\u012a\u0129\3\2\2\2\u012b\u012e\3\2\2\2\u012c"+
		"\u012a\3\2\2\2\u012c\u012d\3\2\2\2\u012dR\3\2\2\2\u012e\u012c\3\2\2\2"+
		"\u012f\u0131\7\17\2\2\u0130\u012f\3\2\2\2\u0130\u0131\3\2\2\2\u0131\u0132"+
		"\3\2\2\2\u0132\u0133\7\f\2\2\u0133\u0134\3\2\2\2\u0134\u0135\b*\2\2\u0135"+
		"T\3\2\2\2\u0136\u013a\7%\2\2\u0137\u0139\n\6\2\2\u0138\u0137\3\2\2\2\u0139"+
		"\u013c\3\2\2\2\u013a\u0138\3\2\2\2\u013a\u013b\3\2\2\2\u013bV\3\2\2\2"+
		"\u013c\u013a\3\2\2\2\u013d\u013e\7=\2\2\u013eX\3\2\2\2\u013f\u0141\t\7"+
		"\2\2\u0140\u013f\3\2\2\2\u0141\u0142\3\2\2\2\u0142\u0140\3\2\2\2\u0142"+
		"\u0143\3\2\2\2\u0143\u0144\3\2\2\2\u0144\u0145\b-\2\2\u0145Z\3\2\2\2\u0146"+
		"\u0147\5-\27\2\u0147\u0148\5W,\2\u0148\\\3\2\2\2\u0149\u014a\7`\2\2\u014a"+
		"\u014b\7/\2\2\u014b\u014c\7`\2\2\u014c^\3\2\2\2\u014d\u014e\7x\2\2\u014e"+
		"\u014f\7/\2\2\u014f\u0150\7x\2\2\u0150`\3\2\2\2\u0151\u0152\7>\2\2\u0152"+
		"\u0153\7/\2\2\u0153\u0154\7>\2\2\u0154b\3\2\2\2\u0155\u0156\7@\2\2\u0156"+
		"\u0157\7/\2\2\u0157\u0158\7@\2\2\u0158d\3\2\2\2\u0159\u015a\7q\2\2\u015a"+
		"\u015b\7/\2\2\u015b\u015c\7q\2\2\u015cf\3\2\2\2\u015d\u015e\7\u0080\2"+
		"\2\u015e\u015f\7/\2\2\u015f\u0160\7\u0080\2\2\u0160h\3\2\2\2\u0161\u0162"+
		"\7@\2\2\u0162\u0163\7/\2\2\u0163\u0164\7>\2\2\u0164j\3\2\2\2\u0165\u0166"+
		"\7`\2\2\u0166\u0167\7/\2\2\u0167\u0168\7\62\2\2\u0168l\3\2\2\2\u0169\u016a"+
		"\7x\2\2\u016a\u016b\7/\2\2\u016b\u016c\7\62\2\2\u016cn\3\2\2\2\u016d\u016e"+
		"\7>\2\2\u016e\u016f\7/\2\2\u016f\u0170\7\62\2\2\u0170p\3\2\2\2\u0171\u0172"+
		"\7@\2\2\u0172\u0173\7/\2\2\u0173\u0174\7\62\2\2\u0174r\3\2\2\2\u0175\u0176"+
		"\7q\2\2\u0176\u0177\7/\2\2\u0177\u0178\7\62\2\2\u0178t\3\2\2\2\u0179\u017a"+
		"\7\u0080\2\2\u017a\u017b\7/\2\2\u017b\u017c\7\62\2\2\u017cv\3\2\2\2\n"+
		"\2\u0092\u0098\u009a\u012c\u0130\u013a\u0142\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}