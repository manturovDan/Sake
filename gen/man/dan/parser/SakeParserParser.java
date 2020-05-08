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
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, INT=17, 
		SEISU=18, RONRI=19, SHINRI=20, OSU=21, RIPPOTAI=22, HAIRETSU=23, JIGEN=24, 
		NAGASA=25, SHUSHI=26, KIDO=27, KANSU=28, SORENARA=29, MODURU=30, SHUKI=31, 
		ID=32, NEWLINE=33, COMMENT=34, ENDEXPR=35, WS=36, END_BLOCK=37;
	public static final int
		RULE_program = 0, RULE_statement = 1, RULE_constant = 2, RULE_expr = 3, 
		RULE_num_assign = 4, RULE_bool_assign = 5, RULE_rippotai_assign = 6, RULE_order = 7, 
		RULE_hairetsu_assign = 8, RULE_appeal = 9, RULE_assignment_stmt = 10, 
		RULE_type = 11, RULE_declaration_stmt = 12, RULE_def_stmt = 13, RULE_jigen_stmt = 14, 
		RULE_nagasa_stmt = 15, RULE_call_stmt = 16, RULE_return_stmt = 17, RULE_params = 18, 
		RULE_function = 19, RULE_arguments = 20, RULE_condition = 21, RULE_cycle = 22, 
		RULE_function_call = 23;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "statement", "constant", "expr", "num_assign", "bool_assign", 
			"rippotai_assign", "order", "hairetsu_assign", "appeal", "assignment_stmt", 
			"type", "declaration_stmt", "def_stmt", "jigen_stmt", "nagasa_stmt", 
			"call_stmt", "return_stmt", "params", "function", "arguments", "condition", 
			"cycle", "function_call"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'-'", "'~'", "'+'", "'<'", "'>'", "'^'", "'v'", "'('", "')'", 
			"'='", "','", "'{'", "'}'", "'['", "']'", "':'", null, "'seisu'", "'ronri'", 
			"'shinri'", "'osu'", "'rippotai'", "'hairetsu'", "'jigen'", "'nagasa'", 
			"'shushi'", "'kido'", "'kansu'", "'sorenara'", "'modoru'", "'shuki'", 
			null, null, null, "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, "INT", "SEISU", "RONRI", "SHINRI", "OSU", 
			"RIPPOTAI", "HAIRETSU", "JIGEN", "NAGASA", "SHUSHI", "KIDO", "KANSU", 
			"SORENARA", "MODURU", "SHUKI", "ID", "NEWLINE", "COMMENT", "ENDEXPR", 
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
			setState(49); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(48);
				statement();
				}
				}
				setState(51); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SEISU) | (1L << RONRI) | (1L << RIPPOTAI) | (1L << HAIRETSU) | (1L << JIGEN) | (1L << NAGASA) | (1L << SORENARA) | (1L << MODURU) | (1L << SHUKI) | (1L << ID) | (1L << NEWLINE) | (1L << COMMENT))) != 0) );
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
		public Def_stmtContext def_stmt() {
			return getRuleContext(Def_stmtContext.class,0);
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
			setState(65);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(53);
				assignment_stmt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(54);
				declaration_stmt();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(55);
				return_stmt();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(56);
				def_stmt();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(57);
				jigen_stmt();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(58);
				nagasa_stmt();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(59);
				call_stmt();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(60);
				function();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(61);
				condition();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(62);
				cycle();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(63);
				match(COMMENT);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(64);
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
			setState(67);
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
	public static class Plus_minContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public Plus_minContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SakeParserListener ) ((SakeParserListener)listener).enterPlus_min(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SakeParserListener ) ((SakeParserListener)listener).exitPlus_min(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SakeParserVisitor ) return ((SakeParserVisitor<? extends T>)visitor).visitPlus_min(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Fun_callContext extends ExprContext {
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
		}
		public Fun_callContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SakeParserListener ) ((SakeParserListener)listener).enterFun_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SakeParserListener ) ((SakeParserListener)listener).exitFun_call(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SakeParserVisitor ) return ((SakeParserVisitor<? extends T>)visitor).visitFun_call(this);
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
	public static class Gr_lessContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public Gr_lessContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SakeParserListener ) ((SakeParserListener)listener).enterGr_less(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SakeParserListener ) ((SakeParserListener)listener).exitGr_less(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SakeParserVisitor ) return ((SakeParserVisitor<? extends T>)visitor).visitGr_less(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Un_minContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Un_minContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SakeParserListener ) ((SakeParserListener)listener).enterUn_min(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SakeParserListener ) ((SakeParserListener)listener).exitUn_min(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SakeParserVisitor ) return ((SakeParserVisitor<? extends T>)visitor).visitUn_min(this);
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
			setState(81);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				_localctx = new Un_minContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(70);
				match(T__0);
				setState(71);
				expr(10);
				}
				break;
			case 2:
				{
				_localctx = new NotContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(72);
				match(T__1);
				setState(73);
				expr(9);
				}
				break;
			case 3:
				{
				_localctx = new ConstContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(74);
				constant();
				}
				break;
			case 4:
				{
				_localctx = new AppContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(75);
				appeal();
				}
				break;
			case 5:
				{
				_localctx = new Fun_callContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(76);
				function_call();
				}
				break;
			case 6:
				{
				_localctx = new BracketsContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(77);
				match(T__7);
				setState(78);
				expr(0);
				setState(79);
				match(T__8);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(97);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(95);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
					case 1:
						{
						_localctx = new Plus_minContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(83);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(84);
						_la = _input.LA(1);
						if ( !(_la==T__0 || _la==T__2) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(85);
						expr(9);
						}
						break;
					case 2:
						{
						_localctx = new Gr_lessContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(86);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(87);
						_la = _input.LA(1);
						if ( !(_la==T__3 || _la==T__4) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(88);
						expr(8);
						}
						break;
					case 3:
						{
						_localctx = new OrContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(89);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(90);
						match(T__5);
						setState(91);
						expr(7);
						}
						break;
					case 4:
						{
						_localctx = new AndContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(92);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(93);
						match(T__6);
						setState(94);
						expr(6);
						}
						break;
					}
					} 
				}
				setState(99);
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
			setState(100);
			match(SEISU);
			setState(101);
			match(ID);
			setState(102);
			match(T__9);
			setState(103);
			expr(0);
			setState(104);
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
			setState(106);
			match(RONRI);
			setState(107);
			match(ID);
			setState(108);
			match(T__9);
			setState(109);
			expr(0);
			setState(110);
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

	public static class Rippotai_assignContext extends ParserRuleContext {
		public TerminalNode RIPPOTAI() { return getToken(SakeParserParser.RIPPOTAI, 0); }
		public TerminalNode ID() { return getToken(SakeParserParser.ID, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode ENDEXPR() { return getToken(SakeParserParser.ENDEXPR, 0); }
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
		enterRule(_localctx, 12, RULE_rippotai_assign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
			match(RIPPOTAI);
			setState(113);
			match(ID);
			setState(114);
			match(T__9);
			setState(115);
			expr(0);
			setState(116);
			match(T__10);
			setState(117);
			expr(0);
			setState(118);
			match(T__10);
			setState(119);
			expr(0);
			setState(120);
			match(T__10);
			setState(121);
			expr(0);
			setState(122);
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
		enterRule(_localctx, 14, RULE_order);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(124);
			expr(0);
			setState(129);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__10) {
				{
				{
				setState(125);
				match(T__10);
				setState(126);
				expr(0);
				}
				}
				setState(131);
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

	public static class Hairetsu_assignContext extends ParserRuleContext {
		public TerminalNode HAIRETSU() { return getToken(SakeParserParser.HAIRETSU, 0); }
		public TerminalNode ID() { return getToken(SakeParserParser.ID, 0); }
		public OrderContext order() {
			return getRuleContext(OrderContext.class,0);
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
		enterRule(_localctx, 16, RULE_hairetsu_assign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(132);
			match(HAIRETSU);
			setState(133);
			match(ID);
			setState(134);
			match(T__9);
			setState(135);
			match(T__11);
			setState(136);
			order();
			setState(137);
			match(T__12);
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
		enterRule(_localctx, 18, RULE_appeal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(139);
			match(ID);
			setState(144);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(140);
				match(T__13);
				setState(141);
				order();
				setState(142);
				match(T__14);
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
		enterRule(_localctx, 20, RULE_assignment_stmt);
		try {
			setState(150);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SEISU:
				enterOuterAlt(_localctx, 1);
				{
				setState(146);
				num_assign();
				}
				break;
			case RONRI:
				enterOuterAlt(_localctx, 2);
				{
				setState(147);
				bool_assign();
				}
				break;
			case RIPPOTAI:
				enterOuterAlt(_localctx, 3);
				{
				setState(148);
				rippotai_assign();
				}
				break;
			case HAIRETSU:
				enterOuterAlt(_localctx, 4);
				{
				setState(149);
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
		enterRule(_localctx, 22, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(152);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SEISU) | (1L << RONRI) | (1L << RIPPOTAI) | (1L << HAIRETSU))) != 0)) ) {
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
		enterRule(_localctx, 24, RULE_declaration_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(154);
			type();
			setState(155);
			match(ID);
			setState(156);
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

	public static class Def_stmtContext extends ParserRuleContext {
		public AppealContext appeal() {
			return getRuleContext(AppealContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode ENDEXPR() { return getToken(SakeParserParser.ENDEXPR, 0); }
		public Def_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_def_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SakeParserListener ) ((SakeParserListener)listener).enterDef_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SakeParserListener ) ((SakeParserListener)listener).exitDef_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SakeParserVisitor ) return ((SakeParserVisitor<? extends T>)visitor).visitDef_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Def_stmtContext def_stmt() throws RecognitionException {
		Def_stmtContext _localctx = new Def_stmtContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_def_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(158);
			appeal();
			setState(159);
			match(T__9);
			setState(160);
			expr(0);
			setState(161);
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
		enterRule(_localctx, 28, RULE_jigen_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(163);
			match(JIGEN);
			setState(164);
			appeal();
			setState(165);
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
		enterRule(_localctx, 30, RULE_nagasa_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(167);
			match(NAGASA);
			setState(168);
			appeal();
			setState(169);
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
		enterRule(_localctx, 32, RULE_call_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(171);
			function_call();
			setState(172);
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
		public TerminalNode MODURU() { return getToken(SakeParserParser.MODURU, 0); }
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
		enterRule(_localctx, 34, RULE_return_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(174);
			match(MODURU);
			setState(175);
			expr(0);
			setState(176);
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

	public static class ParamsContext extends ParserRuleContext {
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<TerminalNode> ID() { return getTokens(SakeParserParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(SakeParserParser.ID, i);
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
		enterRule(_localctx, 36, RULE_params);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(189);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SEISU) | (1L << RONRI) | (1L << RIPPOTAI) | (1L << HAIRETSU))) != 0)) {
				{
				setState(178);
				type();
				setState(179);
				match(ID);
				setState(186);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__10) {
					{
					{
					setState(180);
					match(T__10);
					setState(181);
					type();
					setState(182);
					match(ID);
					}
					}
					setState(188);
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
		enterRule(_localctx, 38, RULE_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(191);
			type();
			setState(192);
			match(KANSU);
			setState(193);
			match(ID);
			setState(194);
			match(T__7);
			setState(195);
			params();
			setState(196);
			match(T__8);
			setState(197);
			match(KIDO);
			setState(199); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(198);
				statement();
				}
				}
				setState(201); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SEISU) | (1L << RONRI) | (1L << RIPPOTAI) | (1L << HAIRETSU) | (1L << JIGEN) | (1L << NAGASA) | (1L << SORENARA) | (1L << MODURU) | (1L << SHUKI) | (1L << ID) | (1L << NEWLINE) | (1L << COMMENT))) != 0) );
			setState(203);
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
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
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
		enterRule(_localctx, 40, RULE_arguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(213);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__7) | (1L << INT) | (1L << SHINRI) | (1L << OSU) | (1L << ID))) != 0)) {
				{
				setState(205);
				expr(0);
				setState(210);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__10) {
					{
					{
					setState(206);
					match(T__10);
					setState(207);
					expr(0);
					}
					}
					setState(212);
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
		enterRule(_localctx, 42, RULE_condition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(215);
			match(SORENARA);
			setState(216);
			expr(0);
			setState(217);
			match(KIDO);
			setState(219); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(218);
				statement();
				}
				}
				setState(221); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SEISU) | (1L << RONRI) | (1L << RIPPOTAI) | (1L << HAIRETSU) | (1L << JIGEN) | (1L << NAGASA) | (1L << SORENARA) | (1L << MODURU) | (1L << SHUKI) | (1L << ID) | (1L << NEWLINE) | (1L << COMMENT))) != 0) );
			setState(223);
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
		enterRule(_localctx, 44, RULE_cycle);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(225);
			match(SHUKI);
			setState(226);
			match(ID);
			setState(227);
			match(T__9);
			setState(228);
			expr(0);
			setState(229);
			match(T__15);
			setState(230);
			expr(0);
			setState(231);
			match(KIDO);
			setState(233); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(232);
				statement();
				}
				}
				setState(235); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SEISU) | (1L << RONRI) | (1L << RIPPOTAI) | (1L << HAIRETSU) | (1L << JIGEN) | (1L << NAGASA) | (1L << SORENARA) | (1L << MODURU) | (1L << SHUKI) | (1L << ID) | (1L << NEWLINE) | (1L << COMMENT))) != 0) );
			setState(237);
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
		enterRule(_localctx, 46, RULE_function_call);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(239);
			match(ID);
			setState(240);
			match(T__7);
			setState(241);
			arguments();
			setState(242);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\'\u00f7\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\3\2\6\2\64\n\2\r\2\16\2\65\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\5\3D\n\3\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\5\5T\n\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\7\5b\n\5\f"+
		"\5\16\5e\13\5\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\7\t\u0082\n\t\f\t"+
		"\16\t\u0085\13\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13"+
		"\5\13\u0093\n\13\3\f\3\f\3\f\3\f\5\f\u0099\n\f\3\r\3\r\3\16\3\16\3\16"+
		"\3\16\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21"+
		"\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\7\24"+
		"\u00bb\n\24\f\24\16\24\u00be\13\24\5\24\u00c0\n\24\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\6\25\u00ca\n\25\r\25\16\25\u00cb\3\25\3\25\3\26\3"+
		"\26\3\26\7\26\u00d3\n\26\f\26\16\26\u00d6\13\26\5\26\u00d8\n\26\3\27\3"+
		"\27\3\27\3\27\6\27\u00de\n\27\r\27\16\27\u00df\3\27\3\27\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\6\30\u00ec\n\30\r\30\16\30\u00ed\3\30\3\30\3"+
		"\31\3\31\3\31\3\31\3\31\3\31\2\3\b\32\2\4\6\b\n\f\16\20\22\24\26\30\32"+
		"\34\36 \"$&(*,.\60\2\6\4\2\23\23\26\27\4\2\3\3\5\5\3\2\6\7\4\2\24\25\30"+
		"\31\2\u00ff\2\63\3\2\2\2\4C\3\2\2\2\6E\3\2\2\2\bS\3\2\2\2\nf\3\2\2\2\f"+
		"l\3\2\2\2\16r\3\2\2\2\20~\3\2\2\2\22\u0086\3\2\2\2\24\u008d\3\2\2\2\26"+
		"\u0098\3\2\2\2\30\u009a\3\2\2\2\32\u009c\3\2\2\2\34\u00a0\3\2\2\2\36\u00a5"+
		"\3\2\2\2 \u00a9\3\2\2\2\"\u00ad\3\2\2\2$\u00b0\3\2\2\2&\u00bf\3\2\2\2"+
		"(\u00c1\3\2\2\2*\u00d7\3\2\2\2,\u00d9\3\2\2\2.\u00e3\3\2\2\2\60\u00f1"+
		"\3\2\2\2\62\64\5\4\3\2\63\62\3\2\2\2\64\65\3\2\2\2\65\63\3\2\2\2\65\66"+
		"\3\2\2\2\66\3\3\2\2\2\67D\5\26\f\28D\5\32\16\29D\5$\23\2:D\5\34\17\2;"+
		"D\5\36\20\2<D\5 \21\2=D\5\"\22\2>D\5(\25\2?D\5,\27\2@D\5.\30\2AD\7$\2"+
		"\2BD\7#\2\2C\67\3\2\2\2C8\3\2\2\2C9\3\2\2\2C:\3\2\2\2C;\3\2\2\2C<\3\2"+
		"\2\2C=\3\2\2\2C>\3\2\2\2C?\3\2\2\2C@\3\2\2\2CA\3\2\2\2CB\3\2\2\2D\5\3"+
		"\2\2\2EF\t\2\2\2F\7\3\2\2\2GH\b\5\1\2HI\7\3\2\2IT\5\b\5\fJK\7\4\2\2KT"+
		"\5\b\5\13LT\5\6\4\2MT\5\24\13\2NT\5\60\31\2OP\7\n\2\2PQ\5\b\5\2QR\7\13"+
		"\2\2RT\3\2\2\2SG\3\2\2\2SJ\3\2\2\2SL\3\2\2\2SM\3\2\2\2SN\3\2\2\2SO\3\2"+
		"\2\2Tc\3\2\2\2UV\f\n\2\2VW\t\3\2\2Wb\5\b\5\13XY\f\t\2\2YZ\t\4\2\2Zb\5"+
		"\b\5\n[\\\f\b\2\2\\]\7\b\2\2]b\5\b\5\t^_\f\7\2\2_`\7\t\2\2`b\5\b\5\ba"+
		"U\3\2\2\2aX\3\2\2\2a[\3\2\2\2a^\3\2\2\2be\3\2\2\2ca\3\2\2\2cd\3\2\2\2"+
		"d\t\3\2\2\2ec\3\2\2\2fg\7\24\2\2gh\7\"\2\2hi\7\f\2\2ij\5\b\5\2jk\7%\2"+
		"\2k\13\3\2\2\2lm\7\25\2\2mn\7\"\2\2no\7\f\2\2op\5\b\5\2pq\7%\2\2q\r\3"+
		"\2\2\2rs\7\30\2\2st\7\"\2\2tu\7\f\2\2uv\5\b\5\2vw\7\r\2\2wx\5\b\5\2xy"+
		"\7\r\2\2yz\5\b\5\2z{\7\r\2\2{|\5\b\5\2|}\7%\2\2}\17\3\2\2\2~\u0083\5\b"+
		"\5\2\177\u0080\7\r\2\2\u0080\u0082\5\b\5\2\u0081\177\3\2\2\2\u0082\u0085"+
		"\3\2\2\2\u0083\u0081\3\2\2\2\u0083\u0084\3\2\2\2\u0084\21\3\2\2\2\u0085"+
		"\u0083\3\2\2\2\u0086\u0087\7\31\2\2\u0087\u0088\7\"\2\2\u0088\u0089\7"+
		"\f\2\2\u0089\u008a\7\16\2\2\u008a\u008b\5\20\t\2\u008b\u008c\7\17\2\2"+
		"\u008c\23\3\2\2\2\u008d\u0092\7\"\2\2\u008e\u008f\7\20\2\2\u008f\u0090"+
		"\5\20\t\2\u0090\u0091\7\21\2\2\u0091\u0093\3\2\2\2\u0092\u008e\3\2\2\2"+
		"\u0092\u0093\3\2\2\2\u0093\25\3\2\2\2\u0094\u0099\5\n\6\2\u0095\u0099"+
		"\5\f\7\2\u0096\u0099\5\16\b\2\u0097\u0099\5\22\n\2\u0098\u0094\3\2\2\2"+
		"\u0098\u0095\3\2\2\2\u0098\u0096\3\2\2\2\u0098\u0097\3\2\2\2\u0099\27"+
		"\3\2\2\2\u009a\u009b\t\5\2\2\u009b\31\3\2\2\2\u009c\u009d\5\30\r\2\u009d"+
		"\u009e\7\"\2\2\u009e\u009f\7%\2\2\u009f\33\3\2\2\2\u00a0\u00a1\5\24\13"+
		"\2\u00a1\u00a2\7\f\2\2\u00a2\u00a3\5\b\5\2\u00a3\u00a4\7%\2\2\u00a4\35"+
		"\3\2\2\2\u00a5\u00a6\7\32\2\2\u00a6\u00a7\5\24\13\2\u00a7\u00a8\7%\2\2"+
		"\u00a8\37\3\2\2\2\u00a9\u00aa\7\33\2\2\u00aa\u00ab\5\24\13\2\u00ab\u00ac"+
		"\7%\2\2\u00ac!\3\2\2\2\u00ad\u00ae\5\60\31\2\u00ae\u00af\7%\2\2\u00af"+
		"#\3\2\2\2\u00b0\u00b1\7 \2\2\u00b1\u00b2\5\b\5\2\u00b2\u00b3\7%\2\2\u00b3"+
		"%\3\2\2\2\u00b4\u00b5\5\30\r\2\u00b5\u00bc\7\"\2\2\u00b6\u00b7\7\r\2\2"+
		"\u00b7\u00b8\5\30\r\2\u00b8\u00b9\7\"\2\2\u00b9\u00bb\3\2\2\2\u00ba\u00b6"+
		"\3\2\2\2\u00bb\u00be\3\2\2\2\u00bc\u00ba\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bd"+
		"\u00c0\3\2\2\2\u00be\u00bc\3\2\2\2\u00bf\u00b4\3\2\2\2\u00bf\u00c0\3\2"+
		"\2\2\u00c0\'\3\2\2\2\u00c1\u00c2\5\30\r\2\u00c2\u00c3\7\36\2\2\u00c3\u00c4"+
		"\7\"\2\2\u00c4\u00c5\7\n\2\2\u00c5\u00c6\5&\24\2\u00c6\u00c7\7\13\2\2"+
		"\u00c7\u00c9\7\35\2\2\u00c8\u00ca\5\4\3\2\u00c9\u00c8\3\2\2\2\u00ca\u00cb"+
		"\3\2\2\2\u00cb\u00c9\3\2\2\2\u00cb\u00cc\3\2\2\2\u00cc\u00cd\3\2\2\2\u00cd"+
		"\u00ce\7\'\2\2\u00ce)\3\2\2\2\u00cf\u00d4\5\b\5\2\u00d0\u00d1\7\r\2\2"+
		"\u00d1\u00d3\5\b\5\2\u00d2\u00d0\3\2\2\2\u00d3\u00d6\3\2\2\2\u00d4\u00d2"+
		"\3\2\2\2\u00d4\u00d5\3\2\2\2\u00d5\u00d8\3\2\2\2\u00d6\u00d4\3\2\2\2\u00d7"+
		"\u00cf\3\2\2\2\u00d7\u00d8\3\2\2\2\u00d8+\3\2\2\2\u00d9\u00da\7\37\2\2"+
		"\u00da\u00db\5\b\5\2\u00db\u00dd\7\35\2\2\u00dc\u00de\5\4\3\2\u00dd\u00dc"+
		"\3\2\2\2\u00de\u00df\3\2\2\2\u00df\u00dd\3\2\2\2\u00df\u00e0\3\2\2\2\u00e0"+
		"\u00e1\3\2\2\2\u00e1\u00e2\7\'\2\2\u00e2-\3\2\2\2\u00e3\u00e4\7!\2\2\u00e4"+
		"\u00e5\7\"\2\2\u00e5\u00e6\7\f\2\2\u00e6\u00e7\5\b\5\2\u00e7\u00e8\7\22"+
		"\2\2\u00e8\u00e9\5\b\5\2\u00e9\u00eb\7\35\2\2\u00ea\u00ec\5\4\3\2\u00eb"+
		"\u00ea\3\2\2\2\u00ec\u00ed\3\2\2\2\u00ed\u00eb\3\2\2\2\u00ed\u00ee\3\2"+
		"\2\2\u00ee\u00ef\3\2\2\2\u00ef\u00f0\7\'\2\2\u00f0/\3\2\2\2\u00f1\u00f2"+
		"\7\"\2\2\u00f2\u00f3\7\n\2\2\u00f3\u00f4\5*\26\2\u00f4\u00f5\7\13\2\2"+
		"\u00f5\61\3\2\2\2\21\65CSac\u0083\u0092\u0098\u00bc\u00bf\u00cb\u00d4"+
		"\u00d7\u00df\u00ed";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}