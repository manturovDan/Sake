// Generated from /home/danila/source/Sake/src/man/dan/parser/SakeParser.g4 by ANTLR 4.8
package man.dan.parser;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SakeParserParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, INT=13, SEISU=14, RONRI=15, SHINRI=16, OSU=17, 
		RIPPOTAI=18, HAIRETSU=19, JIGEN=20, NAGASA=21, SHUSHI=22, KIDO=23, KANSU=24, 
		SORENARA=25, MODORU=26, SHUKI=27, SENDEN=28, FIELD=29, TOX=30, TOY=31, 
		TOZ=32, TOKABE=33, PLUS=34, MINUS=35, GREATER=36, LESS=37, ID=38, NEWLINE=39, 
		COMMENT=40, ENDEXPR=41, WS=42, END_BLOCK=43;
	public static final int
		RULE_program = 0, RULE_statement = 1, RULE_constant = 2, RULE_expr = 3, 
		RULE_num_assign = 4, RULE_bool_assign = 5, RULE_block_coub = 6, RULE_rippotai_assign = 7, 
		RULE_order = 8, RULE_array_vals = 9, RULE_hairetsu_assign = 10, RULE_cube_attr = 11, 
		RULE_appeal = 12, RULE_assignment_stmt = 13, RULE_type = 14, RULE_declaration_stmt = 15, 
		RULE_r_value = 16, RULE_def_simp_stmt = 17, RULE_jigen_stmt = 18, RULE_nagasa_stmt = 19, 
		RULE_senden_stmt = 20, RULE_call_stmt = 21, RULE_return_stmt = 22, RULE_one_param = 23, 
		RULE_params = 24, RULE_function = 25, RULE_arguments = 26, RULE_condition = 27, 
		RULE_cycle = 28, RULE_function_call = 29;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "statement", "constant", "expr", "num_assign", "bool_assign", 
			"block_coub", "rippotai_assign", "order", "array_vals", "hairetsu_assign", 
			"cube_attr", "appeal", "assignment_stmt", "type", "declaration_stmt", 
			"r_value", "def_simp_stmt", "jigen_stmt", "nagasa_stmt", "senden_stmt", 
			"call_stmt", "return_stmt", "one_param", "params", "function", "arguments", 
			"condition", "cycle", "function_call"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'~'", "'^'", "'v'", "'('", "')'", "'='", "'['", "','", "']'", 
			"'{'", "'}'", "':'", null, "'seisu'", "'ronri'", "'shinri'", "'osu'", 
			"'rippotai'", "'hairetsu'", "'jigen'", "'nagasa'", "'shushi'", "'kido'", 
			"'kansu'", "'sorenara'", "'modoru'", "'shuki'", "'senden'", "'=>'", "'X'", 
			"'Y'", "'Z'", "'kabe'", "'+'", "'-'", "'>'", "'<'", null, null, null, 
			"';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, "INT", "SEISU", "RONRI", "SHINRI", "OSU", "RIPPOTAI", "HAIRETSU", 
			"JIGEN", "NAGASA", "SHUSHI", "KIDO", "KANSU", "SORENARA", "MODORU", "SHUKI", 
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

	@Override
	public String getGrammarFileName() { return "SakeParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SakeParserParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SakeParserListener ) ((SakeParserListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SakeParserListener ) ((SakeParserListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SakeParserVisitor ) return ((SakeParserVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(61); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(60);
				statement();
				}
				}
				setState(63); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SEISU) | (1L << RONRI) | (1L << RIPPOTAI) | (1L << HAIRETSU) | (1L << JIGEN) | (1L << NAGASA) | (1L << SORENARA) | (1L << MODORU) | (1L << SHUKI) | (1L << SENDEN) | (1L << ID) | (1L << NEWLINE) | (1L << COMMENT))) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public Assignment_stmtContext assignment_stmt() {
			return getRuleContext(Assignment_stmtContext.class,0);
		}
		public Declaration_stmtContext declaration_stmt() {
			return getRuleContext(Declaration_stmtContext.class,0);
		}
		public Return_stmtContext return_stmt() {
			return getRuleContext(Return_stmtContext.class,0);
		}
		public Def_simp_stmtContext def_simp_stmt() {
			return getRuleContext(Def_simp_stmtContext.class,0);
		}
		public Jigen_stmtContext jigen_stmt() {
			return getRuleContext(Jigen_stmtContext.class,0);
		}
		public Nagasa_stmtContext nagasa_stmt() {
			return getRuleContext(Nagasa_stmtContext.class,0);
		}
		public Call_stmtContext call_stmt() {
			return getRuleContext(Call_stmtContext.class,0);
		}
		public Senden_stmtContext senden_stmt() {
			return getRuleContext(Senden_stmtContext.class,0);
		}
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public CycleContext cycle() {
			return getRuleContext(CycleContext.class,0);
		}
		public TerminalNode COMMENT() { return getToken(SakeParserParser.COMMENT, 0); }
		public TerminalNode NEWLINE() { return getToken(SakeParserParser.NEWLINE, 0); }
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SakeParserListener ) ((SakeParserListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SakeParserListener ) ((SakeParserListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SakeParserVisitor ) return ((SakeParserVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		try {
			setState(78);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(65);
				assignment_stmt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(66);
				declaration_stmt();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(67);
				return_stmt();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(68);
				def_simp_stmt();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(69);
				jigen_stmt();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(70);
				nagasa_stmt();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(71);
				call_stmt();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(72);
				senden_stmt();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(73);
				function();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(74);
				condition();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(75);
				cycle();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(76);
				match(COMMENT);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(77);
				match(NEWLINE);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstantContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(SakeParserParser.INT, 0); }
		public TerminalNode SHINRI() { return getToken(SakeParserParser.SHINRI, 0); }
		public TerminalNode OSU() { return getToken(SakeParserParser.OSU, 0); }
		public ConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SakeParserListener ) ((SakeParserListener)listener).enterConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SakeParserListener ) ((SakeParserListener)listener).exitConstant(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SakeParserVisitor ) return ((SakeParserVisitor<? extends T>)visitor).visitConstant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantContext constant() throws RecognitionException {
		ConstantContext _localctx = new ConstantContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_constant);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(80);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << SHINRI) | (1L << OSU))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprContext extends ParserRuleContext {
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AppContext extends ExprContext {
		public AppealContext appeal() {
			return getRuleContext(AppealContext.class,0);
		}
		public AppContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SakeParserListener ) ((SakeParserListener)listener).enterApp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SakeParserListener ) ((SakeParserListener)listener).exitApp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SakeParserVisitor ) return ((SakeParserVisitor<? extends T>)visitor).visitApp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NotContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public NotContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SakeParserListener ) ((SakeParserListener)listener).enterNot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SakeParserListener ) ((SakeParserListener)listener).exitNot(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SakeParserVisitor ) return ((SakeParserVisitor<? extends T>)visitor).visitNot(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PlusMinContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode PLUS() { return getToken(SakeParserParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(SakeParserParser.MINUS, 0); }
		public PlusMinContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SakeParserListener ) ((SakeParserListener)listener).enterPlusMin(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SakeParserListener ) ((SakeParserListener)listener).exitPlusMin(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SakeParserVisitor ) return ((SakeParserVisitor<? extends T>)visitor).visitPlusMin(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OrContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public OrContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SakeParserListener ) ((SakeParserListener)listener).enterOr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SakeParserListener ) ((SakeParserListener)listener).exitOr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SakeParserVisitor ) return ((SakeParserVisitor<? extends T>)visitor).visitOr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ConstContext extends ExprContext {
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public ConstContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SakeParserListener ) ((SakeParserListener)listener).enterConst(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SakeParserListener ) ((SakeParserListener)listener).exitConst(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SakeParserVisitor ) return ((SakeParserVisitor<? extends T>)visitor).visitConst(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AndContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public AndContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SakeParserListener ) ((SakeParserListener)listener).enterAnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SakeParserListener ) ((SakeParserListener)listener).exitAnd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SakeParserVisitor ) return ((SakeParserVisitor<? extends T>)visitor).visitAnd(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class GrLessContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode LESS() { return getToken(SakeParserParser.LESS, 0); }
		public TerminalNode GREATER() { return getToken(SakeParserParser.GREATER, 0); }
		public GrLessContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SakeParserListener ) ((SakeParserListener)listener).enterGrLess(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SakeParserListener ) ((SakeParserListener)listener).exitGrLess(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SakeParserVisitor ) return ((SakeParserVisitor<? extends T>)visitor).visitGrLess(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UnMinContext extends ExprContext {
		public TerminalNode MINUS() { return getToken(SakeParserParser.MINUS, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public UnMinContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SakeParserListener ) ((SakeParserListener)listener).enterUnMin(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SakeParserListener ) ((SakeParserListener)listener).exitUnMin(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SakeParserVisitor ) return ((SakeParserVisitor<? extends T>)visitor).visitUnMin(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FunCallContext extends ExprContext {
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
		}
		public FunCallContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SakeParserListener ) ((SakeParserListener)listener).enterFunCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SakeParserListener ) ((SakeParserListener)listener).exitFunCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SakeParserVisitor ) return ((SakeParserVisitor<? extends T>)visitor).visitFunCall(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BracketsContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public BracketsContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SakeParserListener ) ((SakeParserListener)listener).enterBrackets(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SakeParserListener ) ((SakeParserListener)listener).exitBrackets(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SakeParserVisitor ) return ((SakeParserVisitor<? extends T>)visitor).visitBrackets(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 6;
		enterRecursionRule(_localctx, 6, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(94);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				_localctx = new UnMinContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(83);
				match(MINUS);
				setState(84);
				expr(10);
				}
				break;
			case 2:
				{
				_localctx = new NotContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(85);
				match(T__0);
				setState(86);
				expr(9);
				}
				break;
			case 3:
				{
				_localctx = new ConstContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(87);
				constant();
				}
				break;
			case 4:
				{
				_localctx = new AppContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(88);
				appeal();
				}
				break;
			case 5:
				{
				_localctx = new FunCallContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(89);
				function_call();
				}
				break;
			case 6:
				{
				_localctx = new BracketsContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(90);
				match(T__3);
				setState(91);
				expr(0);
				setState(92);
				match(T__4);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(110);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(108);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
					case 1:
						{
						_localctx = new PlusMinContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(96);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(97);
						((PlusMinContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
							((PlusMinContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(98);
						expr(9);
						}
						break;
					case 2:
						{
						_localctx = new GrLessContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(99);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(100);
						((GrLessContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==GREATER || _la==LESS) ) {
							((GrLessContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(101);
						expr(8);
						}
						break;
					case 3:
						{
						_localctx = new OrContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(102);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(103);
						match(T__1);
						setState(104);
						expr(7);
						}
						break;
					case 4:
						{
						_localctx = new AndContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(105);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(106);
						match(T__2);
						setState(107);
						expr(6);
						}
						break;
					}
					} 
				}
				setState(112);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Num_assignContext extends ParserRuleContext {
		public TerminalNode SEISU() { return getToken(SakeParserParser.SEISU, 0); }
		public TerminalNode ID() { return getToken(SakeParserParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode ENDEXPR() { return getToken(SakeParserParser.ENDEXPR, 0); }
		public Num_assignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_num_assign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SakeParserListener ) ((SakeParserListener)listener).enterNum_assign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SakeParserListener ) ((SakeParserListener)listener).exitNum_assign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SakeParserVisitor ) return ((SakeParserVisitor<? extends T>)visitor).visitNum_assign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Num_assignContext num_assign() throws RecognitionException {
		Num_assignContext _localctx = new Num_assignContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_num_assign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(113);
			match(SEISU);
			setState(114);
			match(ID);
			setState(115);
			match(T__5);
			setState(116);
			expr(0);
			setState(117);
			match(ENDEXPR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Bool_assignContext extends ParserRuleContext {
		public TerminalNode RONRI() { return getToken(SakeParserParser.RONRI, 0); }
		public TerminalNode ID() { return getToken(SakeParserParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode ENDEXPR() { return getToken(SakeParserParser.ENDEXPR, 0); }
		public Bool_assignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool_assign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SakeParserListener ) ((SakeParserListener)listener).enterBool_assign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SakeParserListener ) ((SakeParserListener)listener).exitBool_assign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SakeParserVisitor ) return ((SakeParserVisitor<? extends T>)visitor).visitBool_assign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bool_assignContext bool_assign() throws RecognitionException {
		Bool_assignContext _localctx = new Bool_assignContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_bool_assign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			match(RONRI);
			setState(120);
			match(ID);
			setState(121);
			match(T__5);
			setState(122);
			expr(0);
			setState(123);
			match(ENDEXPR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Block_coubContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public Block_coubContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block_coub; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SakeParserListener ) ((SakeParserListener)listener).enterBlock_coub(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SakeParserListener ) ((SakeParserListener)listener).exitBlock_coub(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SakeParserVisitor ) return ((SakeParserVisitor<? extends T>)visitor).visitBlock_coub(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Block_coubContext block_coub() throws RecognitionException {
		Block_coubContext _localctx = new Block_coubContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_block_coub);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(125);
			match(T__6);
			setState(126);
			expr(0);
			setState(127);
			match(T__7);
			setState(128);
			expr(0);
			setState(129);
			match(T__7);
			setState(130);
			expr(0);
			setState(131);
			match(T__7);
			setState(132);
			expr(0);
			setState(133);
			match(T__8);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Rippotai_assignContext extends ParserRuleContext {
		public TerminalNode RIPPOTAI() { return getToken(SakeParserParser.RIPPOTAI, 0); }
		public TerminalNode ID() { return getToken(SakeParserParser.ID, 0); }
		public TerminalNode ENDEXPR() { return getToken(SakeParserParser.ENDEXPR, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Block_coubContext block_coub() {
			return getRuleContext(Block_coubContext.class,0);
		}
		public Rippotai_assignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rippotai_assign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SakeParserListener ) ((SakeParserListener)listener).enterRippotai_assign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SakeParserListener ) ((SakeParserListener)listener).exitRippotai_assign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SakeParserVisitor ) return ((SakeParserVisitor<? extends T>)visitor).visitRippotai_assign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Rippotai_assignContext rippotai_assign() throws RecognitionException {
		Rippotai_assignContext _localctx = new Rippotai_assignContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_rippotai_assign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(135);
			match(RIPPOTAI);
			setState(136);
			match(ID);
			setState(137);
			match(T__5);
			setState(140);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case T__3:
			case INT:
			case SHINRI:
			case OSU:
			case MINUS:
			case ID:
				{
				setState(138);
				expr(0);
				}
				break;
			case T__6:
				{
				setState(139);
				block_coub();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(142);
			match(ENDEXPR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OrderContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public OrderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_order; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SakeParserListener ) ((SakeParserListener)listener).enterOrder(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SakeParserListener ) ((SakeParserListener)listener).exitOrder(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SakeParserVisitor ) return ((SakeParserVisitor<? extends T>)visitor).visitOrder(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OrderContext order() throws RecognitionException {
		OrderContext _localctx = new OrderContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_order);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(144);
			expr(0);
			setState(149);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__7) {
				{
				{
				setState(145);
				match(T__7);
				setState(146);
				expr(0);
				}
				}
				setState(151);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Array_valsContext extends ParserRuleContext {
		public OrderContext order() {
			return getRuleContext(OrderContext.class,0);
		}
		public Array_valsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_vals; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SakeParserListener ) ((SakeParserListener)listener).enterArray_vals(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SakeParserListener ) ((SakeParserListener)listener).exitArray_vals(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SakeParserVisitor ) return ((SakeParserVisitor<? extends T>)visitor).visitArray_vals(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Array_valsContext array_vals() throws RecognitionException {
		Array_valsContext _localctx = new Array_valsContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_array_vals);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(152);
			match(T__9);
			setState(153);
			order();
			setState(154);
			match(T__10);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Hairetsu_assignContext extends ParserRuleContext {
		public TerminalNode HAIRETSU() { return getToken(SakeParserParser.HAIRETSU, 0); }
		public TerminalNode ID() { return getToken(SakeParserParser.ID, 0); }
		public TerminalNode ENDEXPR() { return getToken(SakeParserParser.ENDEXPR, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Array_valsContext array_vals() {
			return getRuleContext(Array_valsContext.class,0);
		}
		public Hairetsu_assignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hairetsu_assign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SakeParserListener ) ((SakeParserListener)listener).enterHairetsu_assign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SakeParserListener ) ((SakeParserListener)listener).exitHairetsu_assign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SakeParserVisitor ) return ((SakeParserVisitor<? extends T>)visitor).visitHairetsu_assign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Hairetsu_assignContext hairetsu_assign() throws RecognitionException {
		Hairetsu_assignContext _localctx = new Hairetsu_assignContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_hairetsu_assign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(156);
			match(HAIRETSU);
			setState(157);
			match(ID);
			setState(158);
			match(T__5);
			setState(161);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case T__3:
			case INT:
			case SHINRI:
			case OSU:
			case MINUS:
			case ID:
				{
				setState(159);
				expr(0);
				}
				break;
			case T__9:
				{
				setState(160);
				array_vals();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(163);
			match(ENDEXPR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Cube_attrContext extends ParserRuleContext {
		public Token hand;
		public TerminalNode FIELD() { return getToken(SakeParserParser.FIELD, 0); }
		public TerminalNode TOX() { return getToken(SakeParserParser.TOX, 0); }
		public TerminalNode TOY() { return getToken(SakeParserParser.TOY, 0); }
		public TerminalNode TOZ() { return getToken(SakeParserParser.TOZ, 0); }
		public TerminalNode TOKABE() { return getToken(SakeParserParser.TOKABE, 0); }
		public Cube_attrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cube_attr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SakeParserListener ) ((SakeParserListener)listener).enterCube_attr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SakeParserListener ) ((SakeParserListener)listener).exitCube_attr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SakeParserVisitor ) return ((SakeParserVisitor<? extends T>)visitor).visitCube_attr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Cube_attrContext cube_attr() throws RecognitionException {
		Cube_attrContext _localctx = new Cube_attrContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_cube_attr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(165);
			match(FIELD);
			setState(166);
			((Cube_attrContext)_localctx).hand = _input.LT(1);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TOX) | (1L << TOY) | (1L << TOZ) | (1L << TOKABE))) != 0)) ) {
				((Cube_attrContext)_localctx).hand = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AppealContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(SakeParserParser.ID, 0); }
		public OrderContext order() {
			return getRuleContext(OrderContext.class,0);
		}
		public Cube_attrContext cube_attr() {
			return getRuleContext(Cube_attrContext.class,0);
		}
		public AppealContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_appeal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SakeParserListener ) ((SakeParserListener)listener).enterAppeal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SakeParserListener ) ((SakeParserListener)listener).exitAppeal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SakeParserVisitor ) return ((SakeParserVisitor<? extends T>)visitor).visitAppeal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AppealContext appeal() throws RecognitionException {
		AppealContext _localctx = new AppealContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_appeal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(168);
			match(ID);
			setState(181);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(174);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__6:
					{
					setState(169);
					match(T__6);
					setState(170);
					order();
					setState(171);
					match(T__8);
					}
					break;
				case FIELD:
					{
					setState(173);
					cube_attr();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 2:
				{
				{
				setState(176);
				match(T__6);
				setState(177);
				order();
				setState(178);
				match(T__8);
				setState(179);
				cube_attr();
				}
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Assignment_stmtContext extends ParserRuleContext {
		public Num_assignContext num_assign() {
			return getRuleContext(Num_assignContext.class,0);
		}
		public Bool_assignContext bool_assign() {
			return getRuleContext(Bool_assignContext.class,0);
		}
		public Rippotai_assignContext rippotai_assign() {
			return getRuleContext(Rippotai_assignContext.class,0);
		}
		public Hairetsu_assignContext hairetsu_assign() {
			return getRuleContext(Hairetsu_assignContext.class,0);
		}
		public Assignment_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SakeParserListener ) ((SakeParserListener)listener).enterAssignment_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SakeParserListener ) ((SakeParserListener)listener).exitAssignment_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SakeParserVisitor ) return ((SakeParserVisitor<? extends T>)visitor).visitAssignment_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Assignment_stmtContext assignment_stmt() throws RecognitionException {
		Assignment_stmtContext _localctx = new Assignment_stmtContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_assignment_stmt);
		try {
			setState(187);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SEISU:
				enterOuterAlt(_localctx, 1);
				{
				setState(183);
				num_assign();
				}
				break;
			case RONRI:
				enterOuterAlt(_localctx, 2);
				{
				setState(184);
				bool_assign();
				}
				break;
			case RIPPOTAI:
				enterOuterAlt(_localctx, 3);
				{
				setState(185);
				rippotai_assign();
				}
				break;
			case HAIRETSU:
				enterOuterAlt(_localctx, 4);
				{
				setState(186);
				hairetsu_assign();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeContext extends ParserRuleContext {
		public Token t;
		public TerminalNode SEISU() { return getToken(SakeParserParser.SEISU, 0); }
		public TerminalNode RONRI() { return getToken(SakeParserParser.RONRI, 0); }
		public TerminalNode RIPPOTAI() { return getToken(SakeParserParser.RIPPOTAI, 0); }
		public TerminalNode HAIRETSU() { return getToken(SakeParserParser.HAIRETSU, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SakeParserListener ) ((SakeParserListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SakeParserListener ) ((SakeParserListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SakeParserVisitor ) return ((SakeParserVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(189);
			((TypeContext)_localctx).t = _input.LT(1);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SEISU) | (1L << RONRI) | (1L << RIPPOTAI) | (1L << HAIRETSU))) != 0)) ) {
				((TypeContext)_localctx).t = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Declaration_stmtContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(SakeParserParser.ID, 0); }
		public TerminalNode ENDEXPR() { return getToken(SakeParserParser.ENDEXPR, 0); }
		public Declaration_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SakeParserListener ) ((SakeParserListener)listener).enterDeclaration_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SakeParserListener ) ((SakeParserListener)listener).exitDeclaration_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SakeParserVisitor ) return ((SakeParserVisitor<? extends T>)visitor).visitDeclaration_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Declaration_stmtContext declaration_stmt() throws RecognitionException {
		Declaration_stmtContext _localctx = new Declaration_stmtContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_declaration_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(191);
			type();
			setState(192);
			match(ID);
			setState(193);
			match(ENDEXPR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class R_valueContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Array_valsContext array_vals() {
			return getRuleContext(Array_valsContext.class,0);
		}
		public Block_coubContext block_coub() {
			return getRuleContext(Block_coubContext.class,0);
		}
		public R_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_r_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SakeParserListener ) ((SakeParserListener)listener).enterR_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SakeParserListener ) ((SakeParserListener)listener).exitR_value(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SakeParserVisitor ) return ((SakeParserVisitor<? extends T>)visitor).visitR_value(this);
			else return visitor.visitChildren(this);
		}
	}

	public final R_valueContext r_value() throws RecognitionException {
		R_valueContext _localctx = new R_valueContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_r_value);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(198);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case T__3:
			case INT:
			case SHINRI:
			case OSU:
			case MINUS:
			case ID:
				{
				setState(195);
				expr(0);
				}
				break;
			case T__9:
				{
				setState(196);
				array_vals();
				}
				break;
			case T__6:
				{
				setState(197);
				block_coub();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Def_simp_stmtContext extends ParserRuleContext {
		public AppealContext appeal() {
			return getRuleContext(AppealContext.class,0);
		}
		public R_valueContext r_value() {
			return getRuleContext(R_valueContext.class,0);
		}
		public TerminalNode ENDEXPR() { return getToken(SakeParserParser.ENDEXPR, 0); }
		public Def_simp_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_def_simp_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SakeParserListener ) ((SakeParserListener)listener).enterDef_simp_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SakeParserListener ) ((SakeParserListener)listener).exitDef_simp_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SakeParserVisitor ) return ((SakeParserVisitor<? extends T>)visitor).visitDef_simp_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Def_simp_stmtContext def_simp_stmt() throws RecognitionException {
		Def_simp_stmtContext _localctx = new Def_simp_stmtContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_def_simp_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(200);
			appeal();
			setState(201);
			match(T__5);
			setState(202);
			r_value();
			setState(203);
			match(ENDEXPR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Jigen_stmtContext extends ParserRuleContext {
		public TerminalNode JIGEN() { return getToken(SakeParserParser.JIGEN, 0); }
		public AppealContext appeal() {
			return getRuleContext(AppealContext.class,0);
		}
		public TerminalNode ENDEXPR() { return getToken(SakeParserParser.ENDEXPR, 0); }
		public Jigen_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jigen_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SakeParserListener ) ((SakeParserListener)listener).enterJigen_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SakeParserListener ) ((SakeParserListener)listener).exitJigen_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SakeParserVisitor ) return ((SakeParserVisitor<? extends T>)visitor).visitJigen_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Jigen_stmtContext jigen_stmt() throws RecognitionException {
		Jigen_stmtContext _localctx = new Jigen_stmtContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_jigen_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(205);
			match(JIGEN);
			setState(206);
			appeal();
			setState(207);
			match(ENDEXPR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Nagasa_stmtContext extends ParserRuleContext {
		public TerminalNode NAGASA() { return getToken(SakeParserParser.NAGASA, 0); }
		public AppealContext appeal() {
			return getRuleContext(AppealContext.class,0);
		}
		public TerminalNode ENDEXPR() { return getToken(SakeParserParser.ENDEXPR, 0); }
		public Nagasa_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nagasa_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SakeParserListener ) ((SakeParserListener)listener).enterNagasa_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SakeParserListener ) ((SakeParserListener)listener).exitNagasa_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SakeParserVisitor ) return ((SakeParserVisitor<? extends T>)visitor).visitNagasa_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Nagasa_stmtContext nagasa_stmt() throws RecognitionException {
		Nagasa_stmtContext _localctx = new Nagasa_stmtContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_nagasa_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(209);
			match(NAGASA);
			setState(210);
			appeal();
			setState(211);
			match(ENDEXPR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Senden_stmtContext extends ParserRuleContext {
		public TerminalNode SENDEN() { return getToken(SakeParserParser.SENDEN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode ENDEXPR() { return getToken(SakeParserParser.ENDEXPR, 0); }
		public Senden_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_senden_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SakeParserListener ) ((SakeParserListener)listener).enterSenden_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SakeParserListener ) ((SakeParserListener)listener).exitSenden_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SakeParserVisitor ) return ((SakeParserVisitor<? extends T>)visitor).visitSenden_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Senden_stmtContext senden_stmt() throws RecognitionException {
		Senden_stmtContext _localctx = new Senden_stmtContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_senden_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(213);
			match(SENDEN);
			setState(214);
			expr(0);
			setState(215);
			match(ENDEXPR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Call_stmtContext extends ParserRuleContext {
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
		}
		public TerminalNode ENDEXPR() { return getToken(SakeParserParser.ENDEXPR, 0); }
		public Call_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_call_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SakeParserListener ) ((SakeParserListener)listener).enterCall_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SakeParserListener ) ((SakeParserListener)listener).exitCall_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SakeParserVisitor ) return ((SakeParserVisitor<? extends T>)visitor).visitCall_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Call_stmtContext call_stmt() throws RecognitionException {
		Call_stmtContext _localctx = new Call_stmtContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_call_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(217);
			function_call();
			setState(218);
			match(ENDEXPR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Return_stmtContext extends ParserRuleContext {
		public TerminalNode MODORU() { return getToken(SakeParserParser.MODORU, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode ENDEXPR() { return getToken(SakeParserParser.ENDEXPR, 0); }
		public Return_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SakeParserListener ) ((SakeParserListener)listener).enterReturn_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SakeParserListener ) ((SakeParserListener)listener).exitReturn_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SakeParserVisitor ) return ((SakeParserVisitor<? extends T>)visitor).visitReturn_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Return_stmtContext return_stmt() throws RecognitionException {
		Return_stmtContext _localctx = new Return_stmtContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_return_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(220);
			match(MODORU);
			setState(221);
			expr(0);
			setState(222);
			match(ENDEXPR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class One_paramContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(SakeParserParser.ID, 0); }
		public One_paramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_one_param; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SakeParserListener ) ((SakeParserListener)listener).enterOne_param(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SakeParserListener ) ((SakeParserListener)listener).exitOne_param(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SakeParserVisitor ) return ((SakeParserVisitor<? extends T>)visitor).visitOne_param(this);
			else return visitor.visitChildren(this);
		}
	}

	public final One_paramContext one_param() throws RecognitionException {
		One_paramContext _localctx = new One_paramContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_one_param);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(224);
			type();
			setState(225);
			match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParamsContext extends ParserRuleContext {
		public List<One_paramContext> one_param() {
			return getRuleContexts(One_paramContext.class);
		}
		public One_paramContext one_param(int i) {
			return getRuleContext(One_paramContext.class,i);
		}
		public ParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_params; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SakeParserListener ) ((SakeParserListener)listener).enterParams(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SakeParserListener ) ((SakeParserListener)listener).exitParams(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SakeParserVisitor ) return ((SakeParserVisitor<? extends T>)visitor).visitParams(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParamsContext params() throws RecognitionException {
		ParamsContext _localctx = new ParamsContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_params);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(235);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SEISU) | (1L << RONRI) | (1L << RIPPOTAI) | (1L << HAIRETSU))) != 0)) {
				{
				setState(227);
				one_param();
				setState(232);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__7) {
					{
					{
					setState(228);
					match(T__7);
					setState(229);
					one_param();
					}
					}
					setState(234);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode KANSU() { return getToken(SakeParserParser.KANSU, 0); }
		public TerminalNode ID() { return getToken(SakeParserParser.ID, 0); }
		public ParamsContext params() {
			return getRuleContext(ParamsContext.class,0);
		}
		public TerminalNode KIDO() { return getToken(SakeParserParser.KIDO, 0); }
		public TerminalNode END_BLOCK() { return getToken(SakeParserParser.END_BLOCK, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SakeParserListener ) ((SakeParserListener)listener).enterFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SakeParserListener ) ((SakeParserListener)listener).exitFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SakeParserVisitor ) return ((SakeParserVisitor<? extends T>)visitor).visitFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(237);
			type();
			setState(238);
			match(KANSU);
			setState(239);
			match(ID);
			setState(240);
			match(T__3);
			setState(241);
			params();
			setState(242);
			match(T__4);
			setState(243);
			match(KIDO);
			setState(245); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(244);
				statement();
				}
				}
				setState(247); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SEISU) | (1L << RONRI) | (1L << RIPPOTAI) | (1L << HAIRETSU) | (1L << JIGEN) | (1L << NAGASA) | (1L << SORENARA) | (1L << MODORU) | (1L << SHUKI) | (1L << SENDEN) | (1L << ID) | (1L << NEWLINE) | (1L << COMMENT))) != 0) );
			setState(249);
			match(END_BLOCK);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArgumentsContext extends ParserRuleContext {
		public List<R_valueContext> r_value() {
			return getRuleContexts(R_valueContext.class);
		}
		public R_valueContext r_value(int i) {
			return getRuleContext(R_valueContext.class,i);
		}
		public ArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SakeParserListener ) ((SakeParserListener)listener).enterArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SakeParserListener ) ((SakeParserListener)listener).exitArguments(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SakeParserVisitor ) return ((SakeParserVisitor<? extends T>)visitor).visitArguments(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentsContext arguments() throws RecognitionException {
		ArgumentsContext _localctx = new ArgumentsContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_arguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(259);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__3) | (1L << T__6) | (1L << T__9) | (1L << INT) | (1L << SHINRI) | (1L << OSU) | (1L << MINUS) | (1L << ID))) != 0)) {
				{
				setState(251);
				r_value();
				setState(256);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__7) {
					{
					{
					setState(252);
					match(T__7);
					setState(253);
					r_value();
					}
					}
					setState(258);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConditionContext extends ParserRuleContext {
		public TerminalNode SORENARA() { return getToken(SakeParserParser.SORENARA, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode KIDO() { return getToken(SakeParserParser.KIDO, 0); }
		public TerminalNode END_BLOCK() { return getToken(SakeParserParser.END_BLOCK, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SakeParserListener ) ((SakeParserListener)listener).enterCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SakeParserListener ) ((SakeParserListener)listener).exitCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SakeParserVisitor ) return ((SakeParserVisitor<? extends T>)visitor).visitCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_condition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(261);
			match(SORENARA);
			setState(262);
			expr(0);
			setState(263);
			match(KIDO);
			setState(265); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(264);
				statement();
				}
				}
				setState(267); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SEISU) | (1L << RONRI) | (1L << RIPPOTAI) | (1L << HAIRETSU) | (1L << JIGEN) | (1L << NAGASA) | (1L << SORENARA) | (1L << MODORU) | (1L << SHUKI) | (1L << SENDEN) | (1L << ID) | (1L << NEWLINE) | (1L << COMMENT))) != 0) );
			setState(269);
			match(END_BLOCK);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CycleContext extends ParserRuleContext {
		public TerminalNode SHUKI() { return getToken(SakeParserParser.SHUKI, 0); }
		public TerminalNode ID() { return getToken(SakeParserParser.ID, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode KIDO() { return getToken(SakeParserParser.KIDO, 0); }
		public TerminalNode END_BLOCK() { return getToken(SakeParserParser.END_BLOCK, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public CycleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cycle; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SakeParserListener ) ((SakeParserListener)listener).enterCycle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SakeParserListener ) ((SakeParserListener)listener).exitCycle(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SakeParserVisitor ) return ((SakeParserVisitor<? extends T>)visitor).visitCycle(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CycleContext cycle() throws RecognitionException {
		CycleContext _localctx = new CycleContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_cycle);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(271);
			match(SHUKI);
			setState(272);
			match(ID);
			setState(273);
			match(T__5);
			setState(274);
			expr(0);
			setState(275);
			match(T__11);
			setState(276);
			expr(0);
			setState(277);
			match(KIDO);
			setState(279); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(278);
				statement();
				}
				}
				setState(281); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SEISU) | (1L << RONRI) | (1L << RIPPOTAI) | (1L << HAIRETSU) | (1L << JIGEN) | (1L << NAGASA) | (1L << SORENARA) | (1L << MODORU) | (1L << SHUKI) | (1L << SENDEN) | (1L << ID) | (1L << NEWLINE) | (1L << COMMENT))) != 0) );
			setState(283);
			match(END_BLOCK);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Function_callContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(SakeParserParser.ID, 0); }
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public Function_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SakeParserListener ) ((SakeParserListener)listener).enterFunction_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SakeParserListener ) ((SakeParserListener)listener).exitFunction_call(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SakeParserVisitor ) return ((SakeParserVisitor<? extends T>)visitor).visitFunction_call(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_callContext function_call() throws RecognitionException {
		Function_callContext _localctx = new Function_callContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_function_call);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(285);
			match(ID);
			setState(286);
			match(T__3);
			setState(287);
			arguments();
			setState(288);
			match(T__4);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 3:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 8);
		case 1:
			return precpred(_ctx, 7);
		case 2:
			return precpred(_ctx, 6);
		case 3:
			return precpred(_ctx, 5);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3-\u0125\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\3\2\6\2@"+
		"\n\2\r\2\16\2A\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3"+
		"Q\n\3\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5a\n\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\7\5o\n\5\f\5\16\5r\13"+
		"\5\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\5\t\u008f\n\t\3\t\3\t\3\n\3\n"+
		"\3\n\7\n\u0096\n\n\f\n\16\n\u0099\13\n\3\13\3\13\3\13\3\13\3\f\3\f\3\f"+
		"\3\f\3\f\5\f\u00a4\n\f\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\5\16\u00b1\n\16\3\16\3\16\3\16\3\16\3\16\5\16\u00b8\n\16\3\17\3\17"+
		"\3\17\3\17\5\17\u00be\n\17\3\20\3\20\3\21\3\21\3\21\3\21\3\22\3\22\3\22"+
		"\5\22\u00c9\n\22\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\25\3\25"+
		"\3\25\3\25\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\31"+
		"\3\31\3\31\3\32\3\32\3\32\7\32\u00e9\n\32\f\32\16\32\u00ec\13\32\5\32"+
		"\u00ee\n\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\6\33\u00f8\n\33\r"+
		"\33\16\33\u00f9\3\33\3\33\3\34\3\34\3\34\7\34\u0101\n\34\f\34\16\34\u0104"+
		"\13\34\5\34\u0106\n\34\3\35\3\35\3\35\3\35\6\35\u010c\n\35\r\35\16\35"+
		"\u010d\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\6\36\u011a\n"+
		"\36\r\36\16\36\u011b\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\2\3\b \2"+
		"\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<\2\7\4\2"+
		"\17\17\22\23\3\2$%\3\2&\'\3\2 #\4\2\20\21\24\25\2\u012e\2?\3\2\2\2\4P"+
		"\3\2\2\2\6R\3\2\2\2\b`\3\2\2\2\ns\3\2\2\2\fy\3\2\2\2\16\177\3\2\2\2\20"+
		"\u0089\3\2\2\2\22\u0092\3\2\2\2\24\u009a\3\2\2\2\26\u009e\3\2\2\2\30\u00a7"+
		"\3\2\2\2\32\u00aa\3\2\2\2\34\u00bd\3\2\2\2\36\u00bf\3\2\2\2 \u00c1\3\2"+
		"\2\2\"\u00c8\3\2\2\2$\u00ca\3\2\2\2&\u00cf\3\2\2\2(\u00d3\3\2\2\2*\u00d7"+
		"\3\2\2\2,\u00db\3\2\2\2.\u00de\3\2\2\2\60\u00e2\3\2\2\2\62\u00ed\3\2\2"+
		"\2\64\u00ef\3\2\2\2\66\u0105\3\2\2\28\u0107\3\2\2\2:\u0111\3\2\2\2<\u011f"+
		"\3\2\2\2>@\5\4\3\2?>\3\2\2\2@A\3\2\2\2A?\3\2\2\2AB\3\2\2\2B\3\3\2\2\2"+
		"CQ\5\34\17\2DQ\5 \21\2EQ\5.\30\2FQ\5$\23\2GQ\5&\24\2HQ\5(\25\2IQ\5,\27"+
		"\2JQ\5*\26\2KQ\5\64\33\2LQ\58\35\2MQ\5:\36\2NQ\7*\2\2OQ\7)\2\2PC\3\2\2"+
		"\2PD\3\2\2\2PE\3\2\2\2PF\3\2\2\2PG\3\2\2\2PH\3\2\2\2PI\3\2\2\2PJ\3\2\2"+
		"\2PK\3\2\2\2PL\3\2\2\2PM\3\2\2\2PN\3\2\2\2PO\3\2\2\2Q\5\3\2\2\2RS\t\2"+
		"\2\2S\7\3\2\2\2TU\b\5\1\2UV\7%\2\2Va\5\b\5\fWX\7\3\2\2Xa\5\b\5\13Ya\5"+
		"\6\4\2Za\5\32\16\2[a\5<\37\2\\]\7\6\2\2]^\5\b\5\2^_\7\7\2\2_a\3\2\2\2"+
		"`T\3\2\2\2`W\3\2\2\2`Y\3\2\2\2`Z\3\2\2\2`[\3\2\2\2`\\\3\2\2\2ap\3\2\2"+
		"\2bc\f\n\2\2cd\t\3\2\2do\5\b\5\13ef\f\t\2\2fg\t\4\2\2go\5\b\5\nhi\f\b"+
		"\2\2ij\7\4\2\2jo\5\b\5\tkl\f\7\2\2lm\7\5\2\2mo\5\b\5\bnb\3\2\2\2ne\3\2"+
		"\2\2nh\3\2\2\2nk\3\2\2\2or\3\2\2\2pn\3\2\2\2pq\3\2\2\2q\t\3\2\2\2rp\3"+
		"\2\2\2st\7\20\2\2tu\7(\2\2uv\7\b\2\2vw\5\b\5\2wx\7+\2\2x\13\3\2\2\2yz"+
		"\7\21\2\2z{\7(\2\2{|\7\b\2\2|}\5\b\5\2}~\7+\2\2~\r\3\2\2\2\177\u0080\7"+
		"\t\2\2\u0080\u0081\5\b\5\2\u0081\u0082\7\n\2\2\u0082\u0083\5\b\5\2\u0083"+
		"\u0084\7\n\2\2\u0084\u0085\5\b\5\2\u0085\u0086\7\n\2\2\u0086\u0087\5\b"+
		"\5\2\u0087\u0088\7\13\2\2\u0088\17\3\2\2\2\u0089\u008a\7\24\2\2\u008a"+
		"\u008b\7(\2\2\u008b\u008e\7\b\2\2\u008c\u008f\5\b\5\2\u008d\u008f\5\16"+
		"\b\2\u008e\u008c\3\2\2\2\u008e\u008d\3\2\2\2\u008f\u0090\3\2\2\2\u0090"+
		"\u0091\7+\2\2\u0091\21\3\2\2\2\u0092\u0097\5\b\5\2\u0093\u0094\7\n\2\2"+
		"\u0094\u0096\5\b\5\2\u0095\u0093\3\2\2\2\u0096\u0099\3\2\2\2\u0097\u0095"+
		"\3\2\2\2\u0097\u0098\3\2\2\2\u0098\23\3\2\2\2\u0099\u0097\3\2\2\2\u009a"+
		"\u009b\7\f\2\2\u009b\u009c\5\22\n\2\u009c\u009d\7\r\2\2\u009d\25\3\2\2"+
		"\2\u009e\u009f\7\25\2\2\u009f\u00a0\7(\2\2\u00a0\u00a3\7\b\2\2\u00a1\u00a4"+
		"\5\b\5\2\u00a2\u00a4\5\24\13\2\u00a3\u00a1\3\2\2\2\u00a3\u00a2\3\2\2\2"+
		"\u00a4\u00a5\3\2\2\2\u00a5\u00a6\7+\2\2\u00a6\27\3\2\2\2\u00a7\u00a8\7"+
		"\37\2\2\u00a8\u00a9\t\5\2\2\u00a9\31\3\2\2\2\u00aa\u00b7\7(\2\2\u00ab"+
		"\u00ac\7\t\2\2\u00ac\u00ad\5\22\n\2\u00ad\u00ae\7\13\2\2\u00ae\u00b1\3"+
		"\2\2\2\u00af\u00b1\5\30\r\2\u00b0\u00ab\3\2\2\2\u00b0\u00af\3\2\2\2\u00b1"+
		"\u00b8\3\2\2\2\u00b2\u00b3\7\t\2\2\u00b3\u00b4\5\22\n\2\u00b4\u00b5\7"+
		"\13\2\2\u00b5\u00b6\5\30\r\2\u00b6\u00b8\3\2\2\2\u00b7\u00b0\3\2\2\2\u00b7"+
		"\u00b2\3\2\2\2\u00b7\u00b8\3\2\2\2\u00b8\33\3\2\2\2\u00b9\u00be\5\n\6"+
		"\2\u00ba\u00be\5\f\7\2\u00bb\u00be\5\20\t\2\u00bc\u00be\5\26\f\2\u00bd"+
		"\u00b9\3\2\2\2\u00bd\u00ba\3\2\2\2\u00bd\u00bb\3\2\2\2\u00bd\u00bc\3\2"+
		"\2\2\u00be\35\3\2\2\2\u00bf\u00c0\t\6\2\2\u00c0\37\3\2\2\2\u00c1\u00c2"+
		"\5\36\20\2\u00c2\u00c3\7(\2\2\u00c3\u00c4\7+\2\2\u00c4!\3\2\2\2\u00c5"+
		"\u00c9\5\b\5\2\u00c6\u00c9\5\24\13\2\u00c7\u00c9\5\16\b\2\u00c8\u00c5"+
		"\3\2\2\2\u00c8\u00c6\3\2\2\2\u00c8\u00c7\3\2\2\2\u00c9#\3\2\2\2\u00ca"+
		"\u00cb\5\32\16\2\u00cb\u00cc\7\b\2\2\u00cc\u00cd\5\"\22\2\u00cd\u00ce"+
		"\7+\2\2\u00ce%\3\2\2\2\u00cf\u00d0\7\26\2\2\u00d0\u00d1\5\32\16\2\u00d1"+
		"\u00d2\7+\2\2\u00d2\'\3\2\2\2\u00d3\u00d4\7\27\2\2\u00d4\u00d5\5\32\16"+
		"\2\u00d5\u00d6\7+\2\2\u00d6)\3\2\2\2\u00d7\u00d8\7\36\2\2\u00d8\u00d9"+
		"\5\b\5\2\u00d9\u00da\7+\2\2\u00da+\3\2\2\2\u00db\u00dc\5<\37\2\u00dc\u00dd"+
		"\7+\2\2\u00dd-\3\2\2\2\u00de\u00df\7\34\2\2\u00df\u00e0\5\b\5\2\u00e0"+
		"\u00e1\7+\2\2\u00e1/\3\2\2\2\u00e2\u00e3\5\36\20\2\u00e3\u00e4\7(\2\2"+
		"\u00e4\61\3\2\2\2\u00e5\u00ea\5\60\31\2\u00e6\u00e7\7\n\2\2\u00e7\u00e9"+
		"\5\60\31\2\u00e8\u00e6\3\2\2\2\u00e9\u00ec\3\2\2\2\u00ea\u00e8\3\2\2\2"+
		"\u00ea\u00eb\3\2\2\2\u00eb\u00ee\3\2\2\2\u00ec\u00ea\3\2\2\2\u00ed\u00e5"+
		"\3\2\2\2\u00ed\u00ee\3\2\2\2\u00ee\63\3\2\2\2\u00ef\u00f0\5\36\20\2\u00f0"+
		"\u00f1\7\32\2\2\u00f1\u00f2\7(\2\2\u00f2\u00f3\7\6\2\2\u00f3\u00f4\5\62"+
		"\32\2\u00f4\u00f5\7\7\2\2\u00f5\u00f7\7\31\2\2\u00f6\u00f8\5\4\3\2\u00f7"+
		"\u00f6\3\2\2\2\u00f8\u00f9\3\2\2\2\u00f9\u00f7\3\2\2\2\u00f9\u00fa\3\2"+
		"\2\2\u00fa\u00fb\3\2\2\2\u00fb\u00fc\7-\2\2\u00fc\65\3\2\2\2\u00fd\u0102"+
		"\5\"\22\2\u00fe\u00ff\7\n\2\2\u00ff\u0101\5\"\22\2\u0100\u00fe\3\2\2\2"+
		"\u0101\u0104\3\2\2\2\u0102\u0100\3\2\2\2\u0102\u0103\3\2\2\2\u0103\u0106"+
		"\3\2\2\2\u0104\u0102\3\2\2\2\u0105\u00fd\3\2\2\2\u0105\u0106\3\2\2\2\u0106"+
		"\67\3\2\2\2\u0107\u0108\7\33\2\2\u0108\u0109\5\b\5\2\u0109\u010b\7\31"+
		"\2\2\u010a\u010c\5\4\3\2\u010b\u010a\3\2\2\2\u010c\u010d\3\2\2\2\u010d"+
		"\u010b\3\2\2\2\u010d\u010e\3\2\2\2\u010e\u010f\3\2\2\2\u010f\u0110\7-"+
		"\2\2\u01109\3\2\2\2\u0111\u0112\7\35\2\2\u0112\u0113\7(\2\2\u0113\u0114"+
		"\7\b\2\2\u0114\u0115\5\b\5\2\u0115\u0116\7\16\2\2\u0116\u0117\5\b\5\2"+
		"\u0117\u0119\7\31\2\2\u0118\u011a\5\4\3\2\u0119\u0118\3\2\2\2\u011a\u011b"+
		"\3\2\2\2\u011b\u0119\3\2\2\2\u011b\u011c\3\2\2\2\u011c\u011d\3\2\2\2\u011d"+
		"\u011e\7-\2\2\u011e;\3\2\2\2\u011f\u0120\7(\2\2\u0120\u0121\7\6\2\2\u0121"+
		"\u0122\5\66\34\2\u0122\u0123\7\7\2\2\u0123=\3\2\2\2\25AP`np\u008e\u0097"+
		"\u00a3\u00b0\u00b7\u00bd\u00c8\u00ea\u00ed\u00f9\u0102\u0105\u010d\u011b";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}