// Generated from MirrorLang.g4 by ANTLR 4.13.0
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class MirrorLangParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.0", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, WS=3, VARIABLE=4, ARITHMETIC_OPERATOR=5, COMPARE_OPERATOR=6, 
		INT_VALUE=7, STRING_VALUE=8, SET_START=9, SET_END=10, LOOPIF_START=11, 
		LOOPIF_END=12, IF_START=13, IF_END=14, LOG_START=15, LOG_END=16, IGNORE_START=17, 
		IGNORE_END=18, SINGLE_LINE_COMMENT=19, EQUALS=20, NEWLINE=21;
	public static final int
		RULE_program = 0, RULE_statement = 1, RULE_setStatement = 2, RULE_loopIfStatement = 3, 
		RULE_ifStatement = 4, RULE_logStatement = 5, RULE_ignoreStatement = 6, 
		RULE_condition = 7, RULE_expression = 8, RULE_term = 9;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "statement", "setStatement", "loopIfStatement", "ifStatement", 
			"logStatement", "ignoreStatement", "condition", "expression", "term"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", null, null, null, null, null, null, "'(SET'", "'TES)'", 
			"'(LOOPIF'", "'FIPOOL)'", "'(IF'", "'FI)'", "'(LOG'", "'GOL)'", "'(IGNORE'", 
			"'ERONGI)'", null, "'='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, "WS", "VARIABLE", "ARITHMETIC_OPERATOR", "COMPARE_OPERATOR", 
			"INT_VALUE", "STRING_VALUE", "SET_START", "SET_END", "LOOPIF_START", 
			"LOOPIF_END", "IF_START", "IF_END", "LOG_START", "LOG_END", "IGNORE_START", 
			"IGNORE_END", "SINGLE_LINE_COMMENT", "EQUALS", "NEWLINE"
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
	public String getGrammarFileName() { return "MirrorLang.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public MirrorLangParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(MirrorLangParser.EOF, 0); }
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
			if ( listener instanceof MirrorLangListener ) ((MirrorLangListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MirrorLangListener ) ((MirrorLangListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MirrorLangVisitor ) return ((MirrorLangVisitor<? extends T>)visitor).visitProgram(this);
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
			setState(21); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(20);
				statement();
				}
				}
				setState(23); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 174592L) != 0) );
			setState(25);
			match(EOF);
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

	@SuppressWarnings("CheckReturnValue")
	public static class StatementContext extends ParserRuleContext {
		public SetStatementContext setStatement() {
			return getRuleContext(SetStatementContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(MirrorLangParser.NEWLINE, 0); }
		public LoopIfStatementContext loopIfStatement() {
			return getRuleContext(LoopIfStatementContext.class,0);
		}
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public LogStatementContext logStatement() {
			return getRuleContext(LogStatementContext.class,0);
		}
		public IgnoreStatementContext ignoreStatement() {
			return getRuleContext(IgnoreStatementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MirrorLangListener ) ((MirrorLangListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MirrorLangListener ) ((MirrorLangListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MirrorLangVisitor ) return ((MirrorLangVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		try {
			setState(42);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SET_START:
				enterOuterAlt(_localctx, 1);
				{
				setState(27);
				setStatement();
				setState(28);
				match(NEWLINE);
				}
				break;
			case LOOPIF_START:
				enterOuterAlt(_localctx, 2);
				{
				setState(30);
				loopIfStatement();
				setState(31);
				match(NEWLINE);
				}
				break;
			case IF_START:
				enterOuterAlt(_localctx, 3);
				{
				setState(33);
				ifStatement();
				setState(34);
				match(NEWLINE);
				}
				break;
			case LOG_START:
				enterOuterAlt(_localctx, 4);
				{
				setState(36);
				logStatement();
				setState(37);
				match(NEWLINE);
				}
				break;
			case IGNORE_START:
				enterOuterAlt(_localctx, 5);
				{
				setState(39);
				ignoreStatement();
				setState(40);
				match(NEWLINE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class SetStatementContext extends ParserRuleContext {
		public TerminalNode SET_START() { return getToken(MirrorLangParser.SET_START, 0); }
		public TerminalNode VARIABLE() { return getToken(MirrorLangParser.VARIABLE, 0); }
		public TerminalNode EQUALS() { return getToken(MirrorLangParser.EQUALS, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SET_END() { return getToken(MirrorLangParser.SET_END, 0); }
		public List<TerminalNode> WS() { return getTokens(MirrorLangParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(MirrorLangParser.WS, i);
		}
		public SetStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MirrorLangListener ) ((MirrorLangListener)listener).enterSetStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MirrorLangListener ) ((MirrorLangListener)listener).exitSetStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MirrorLangVisitor ) return ((MirrorLangVisitor<? extends T>)visitor).visitSetStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SetStatementContext setStatement() throws RecognitionException {
		SetStatementContext _localctx = new SetStatementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_setStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(44);
			match(SET_START);
			setState(46);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(45);
				match(WS);
				}
			}

			setState(48);
			match(VARIABLE);
			setState(50);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(49);
				match(WS);
				}
			}

			setState(52);
			match(EQUALS);
			setState(54);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(53);
				match(WS);
				}
			}

			setState(56);
			expression();
			setState(58);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(57);
				match(WS);
				}
			}

			setState(60);
			match(SET_END);
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

	@SuppressWarnings("CheckReturnValue")
	public static class LoopIfStatementContext extends ParserRuleContext {
		public TerminalNode LOOPIF_START() { return getToken(MirrorLangParser.LOOPIF_START, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(MirrorLangParser.NEWLINE, 0); }
		public ProgramContext program() {
			return getRuleContext(ProgramContext.class,0);
		}
		public TerminalNode LOOPIF_END() { return getToken(MirrorLangParser.LOOPIF_END, 0); }
		public List<TerminalNode> WS() { return getTokens(MirrorLangParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(MirrorLangParser.WS, i);
		}
		public LoopIfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loopIfStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MirrorLangListener ) ((MirrorLangListener)listener).enterLoopIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MirrorLangListener ) ((MirrorLangListener)listener).exitLoopIfStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MirrorLangVisitor ) return ((MirrorLangVisitor<? extends T>)visitor).visitLoopIfStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LoopIfStatementContext loopIfStatement() throws RecognitionException {
		LoopIfStatementContext _localctx = new LoopIfStatementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_loopIfStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(62);
			match(LOOPIF_START);
			setState(64);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(63);
				match(WS);
				}
			}

			setState(66);
			condition();
			setState(68);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(67);
				match(WS);
				}
			}

			setState(70);
			match(NEWLINE);
			setState(71);
			program();
			setState(72);
			match(LOOPIF_END);
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

	@SuppressWarnings("CheckReturnValue")
	public static class IfStatementContext extends ParserRuleContext {
		public TerminalNode IF_START() { return getToken(MirrorLangParser.IF_START, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(MirrorLangParser.NEWLINE, 0); }
		public ProgramContext program() {
			return getRuleContext(ProgramContext.class,0);
		}
		public TerminalNode IF_END() { return getToken(MirrorLangParser.IF_END, 0); }
		public List<TerminalNode> WS() { return getTokens(MirrorLangParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(MirrorLangParser.WS, i);
		}
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MirrorLangListener ) ((MirrorLangListener)listener).enterIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MirrorLangListener ) ((MirrorLangListener)listener).exitIfStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MirrorLangVisitor ) return ((MirrorLangVisitor<? extends T>)visitor).visitIfStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_ifStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(74);
			match(IF_START);
			setState(76);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(75);
				match(WS);
				}
			}

			setState(78);
			condition();
			setState(80);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(79);
				match(WS);
				}
			}

			setState(82);
			match(NEWLINE);
			setState(83);
			program();
			setState(84);
			match(IF_END);
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

	@SuppressWarnings("CheckReturnValue")
	public static class LogStatementContext extends ParserRuleContext {
		public TerminalNode LOG_START() { return getToken(MirrorLangParser.LOG_START, 0); }
		public TerminalNode LOG_END() { return getToken(MirrorLangParser.LOG_END, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode STRING_VALUE() { return getToken(MirrorLangParser.STRING_VALUE, 0); }
		public List<TerminalNode> WS() { return getTokens(MirrorLangParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(MirrorLangParser.WS, i);
		}
		public LogStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MirrorLangListener ) ((MirrorLangListener)listener).enterLogStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MirrorLangListener ) ((MirrorLangListener)listener).exitLogStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MirrorLangVisitor ) return ((MirrorLangVisitor<? extends T>)visitor).visitLogStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogStatementContext logStatement() throws RecognitionException {
		LogStatementContext _localctx = new LogStatementContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_logStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86);
			match(LOG_START);
			setState(88);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(87);
				match(WS);
				}
			}

			setState(92);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case VARIABLE:
			case INT_VALUE:
				{
				setState(90);
				expression();
				}
				break;
			case STRING_VALUE:
				{
				setState(91);
				match(STRING_VALUE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(95);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(94);
				match(WS);
				}
			}

			setState(97);
			match(LOG_END);
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

	@SuppressWarnings("CheckReturnValue")
	public static class IgnoreStatementContext extends ParserRuleContext {
		public TerminalNode IGNORE_START() { return getToken(MirrorLangParser.IGNORE_START, 0); }
		public ProgramContext program() {
			return getRuleContext(ProgramContext.class,0);
		}
		public TerminalNode IGNORE_END() { return getToken(MirrorLangParser.IGNORE_END, 0); }
		public List<TerminalNode> WS() { return getTokens(MirrorLangParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(MirrorLangParser.WS, i);
		}
		public IgnoreStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ignoreStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MirrorLangListener ) ((MirrorLangListener)listener).enterIgnoreStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MirrorLangListener ) ((MirrorLangListener)listener).exitIgnoreStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MirrorLangVisitor ) return ((MirrorLangVisitor<? extends T>)visitor).visitIgnoreStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IgnoreStatementContext ignoreStatement() throws RecognitionException {
		IgnoreStatementContext _localctx = new IgnoreStatementContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_ignoreStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(99);
			match(IGNORE_START);
			setState(101);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(100);
				match(WS);
				}
			}

			setState(103);
			program();
			setState(105);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(104);
				match(WS);
				}
			}

			setState(107);
			match(IGNORE_END);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ConditionContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode COMPARE_OPERATOR() { return getToken(MirrorLangParser.COMPARE_OPERATOR, 0); }
		public List<TerminalNode> WS() { return getTokens(MirrorLangParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(MirrorLangParser.WS, i);
		}
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MirrorLangListener ) ((MirrorLangListener)listener).enterCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MirrorLangListener ) ((MirrorLangListener)listener).exitCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MirrorLangVisitor ) return ((MirrorLangVisitor<? extends T>)visitor).visitCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_condition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(109);
			expression();
			setState(111);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(110);
				match(WS);
				}
			}

			setState(113);
			match(COMPARE_OPERATOR);
			setState(115);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(114);
				match(WS);
				}
			}

			setState(117);
			expression();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionContext extends ParserRuleContext {
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public List<TerminalNode> ARITHMETIC_OPERATOR() { return getTokens(MirrorLangParser.ARITHMETIC_OPERATOR); }
		public TerminalNode ARITHMETIC_OPERATOR(int i) {
			return getToken(MirrorLangParser.ARITHMETIC_OPERATOR, i);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MirrorLangListener ) ((MirrorLangListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MirrorLangListener ) ((MirrorLangListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MirrorLangVisitor ) return ((MirrorLangVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			term();
			setState(124);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ARITHMETIC_OPERATOR) {
				{
				{
				setState(120);
				match(ARITHMETIC_OPERATOR);
				setState(121);
				term();
				}
				}
				setState(126);
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

	@SuppressWarnings("CheckReturnValue")
	public static class TermContext extends ParserRuleContext {
		public TerminalNode VARIABLE() { return getToken(MirrorLangParser.VARIABLE, 0); }
		public TerminalNode INT_VALUE() { return getToken(MirrorLangParser.INT_VALUE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MirrorLangListener ) ((MirrorLangListener)listener).enterTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MirrorLangListener ) ((MirrorLangListener)listener).exitTerm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MirrorLangVisitor ) return ((MirrorLangVisitor<? extends T>)visitor).visitTerm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_term);
		try {
			setState(133);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VARIABLE:
				enterOuterAlt(_localctx, 1);
				{
				setState(127);
				match(VARIABLE);
				}
				break;
			case INT_VALUE:
				enterOuterAlt(_localctx, 2);
				{
				setState(128);
				match(INT_VALUE);
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 3);
				{
				setState(129);
				match(T__0);
				setState(130);
				expression();
				setState(131);
				match(T__1);
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

	public static final String _serializedATN =
		"\u0004\u0001\u0015\u0088\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0001\u0000\u0004\u0000\u0016\b\u0000"+
		"\u000b\u0000\f\u0000\u0017\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0003\u0001+\b\u0001\u0001\u0002\u0001\u0002\u0003\u0002"+
		"/\b\u0002\u0001\u0002\u0001\u0002\u0003\u00023\b\u0002\u0001\u0002\u0001"+
		"\u0002\u0003\u00027\b\u0002\u0001\u0002\u0001\u0002\u0003\u0002;\b\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0003\u0003A\b\u0003"+
		"\u0001\u0003\u0001\u0003\u0003\u0003E\b\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0003\u0004M\b\u0004"+
		"\u0001\u0004\u0001\u0004\u0003\u0004Q\b\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0003\u0005Y\b\u0005"+
		"\u0001\u0005\u0001\u0005\u0003\u0005]\b\u0005\u0001\u0005\u0003\u0005"+
		"`\b\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0003\u0006"+
		"f\b\u0006\u0001\u0006\u0001\u0006\u0003\u0006j\b\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0007\u0001\u0007\u0003\u0007p\b\u0007\u0001\u0007\u0001"+
		"\u0007\u0003\u0007t\b\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001"+
		"\b\u0005\b{\b\b\n\b\f\b~\t\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0003\t\u0086\b\t\u0001\t\u0000\u0000\n\u0000\u0002\u0004\u0006\b\n"+
		"\f\u000e\u0010\u0012\u0000\u0000\u0094\u0000\u0015\u0001\u0000\u0000\u0000"+
		"\u0002*\u0001\u0000\u0000\u0000\u0004,\u0001\u0000\u0000\u0000\u0006>"+
		"\u0001\u0000\u0000\u0000\bJ\u0001\u0000\u0000\u0000\nV\u0001\u0000\u0000"+
		"\u0000\fc\u0001\u0000\u0000\u0000\u000em\u0001\u0000\u0000\u0000\u0010"+
		"w\u0001\u0000\u0000\u0000\u0012\u0085\u0001\u0000\u0000\u0000\u0014\u0016"+
		"\u0003\u0002\u0001\u0000\u0015\u0014\u0001\u0000\u0000\u0000\u0016\u0017"+
		"\u0001\u0000\u0000\u0000\u0017\u0015\u0001\u0000\u0000\u0000\u0017\u0018"+
		"\u0001\u0000\u0000\u0000\u0018\u0019\u0001\u0000\u0000\u0000\u0019\u001a"+
		"\u0005\u0000\u0000\u0001\u001a\u0001\u0001\u0000\u0000\u0000\u001b\u001c"+
		"\u0003\u0004\u0002\u0000\u001c\u001d\u0005\u0015\u0000\u0000\u001d+\u0001"+
		"\u0000\u0000\u0000\u001e\u001f\u0003\u0006\u0003\u0000\u001f \u0005\u0015"+
		"\u0000\u0000 +\u0001\u0000\u0000\u0000!\"\u0003\b\u0004\u0000\"#\u0005"+
		"\u0015\u0000\u0000#+\u0001\u0000\u0000\u0000$%\u0003\n\u0005\u0000%&\u0005"+
		"\u0015\u0000\u0000&+\u0001\u0000\u0000\u0000\'(\u0003\f\u0006\u0000()"+
		"\u0005\u0015\u0000\u0000)+\u0001\u0000\u0000\u0000*\u001b\u0001\u0000"+
		"\u0000\u0000*\u001e\u0001\u0000\u0000\u0000*!\u0001\u0000\u0000\u0000"+
		"*$\u0001\u0000\u0000\u0000*\'\u0001\u0000\u0000\u0000+\u0003\u0001\u0000"+
		"\u0000\u0000,.\u0005\t\u0000\u0000-/\u0005\u0003\u0000\u0000.-\u0001\u0000"+
		"\u0000\u0000./\u0001\u0000\u0000\u0000/0\u0001\u0000\u0000\u000002\u0005"+
		"\u0004\u0000\u000013\u0005\u0003\u0000\u000021\u0001\u0000\u0000\u0000"+
		"23\u0001\u0000\u0000\u000034\u0001\u0000\u0000\u000046\u0005\u0014\u0000"+
		"\u000057\u0005\u0003\u0000\u000065\u0001\u0000\u0000\u000067\u0001\u0000"+
		"\u0000\u000078\u0001\u0000\u0000\u00008:\u0003\u0010\b\u00009;\u0005\u0003"+
		"\u0000\u0000:9\u0001\u0000\u0000\u0000:;\u0001\u0000\u0000\u0000;<\u0001"+
		"\u0000\u0000\u0000<=\u0005\n\u0000\u0000=\u0005\u0001\u0000\u0000\u0000"+
		">@\u0005\u000b\u0000\u0000?A\u0005\u0003\u0000\u0000@?\u0001\u0000\u0000"+
		"\u0000@A\u0001\u0000\u0000\u0000AB\u0001\u0000\u0000\u0000BD\u0003\u000e"+
		"\u0007\u0000CE\u0005\u0003\u0000\u0000DC\u0001\u0000\u0000\u0000DE\u0001"+
		"\u0000\u0000\u0000EF\u0001\u0000\u0000\u0000FG\u0005\u0015\u0000\u0000"+
		"GH\u0003\u0000\u0000\u0000HI\u0005\f\u0000\u0000I\u0007\u0001\u0000\u0000"+
		"\u0000JL\u0005\r\u0000\u0000KM\u0005\u0003\u0000\u0000LK\u0001\u0000\u0000"+
		"\u0000LM\u0001\u0000\u0000\u0000MN\u0001\u0000\u0000\u0000NP\u0003\u000e"+
		"\u0007\u0000OQ\u0005\u0003\u0000\u0000PO\u0001\u0000\u0000\u0000PQ\u0001"+
		"\u0000\u0000\u0000QR\u0001\u0000\u0000\u0000RS\u0005\u0015\u0000\u0000"+
		"ST\u0003\u0000\u0000\u0000TU\u0005\u000e\u0000\u0000U\t\u0001\u0000\u0000"+
		"\u0000VX\u0005\u000f\u0000\u0000WY\u0005\u0003\u0000\u0000XW\u0001\u0000"+
		"\u0000\u0000XY\u0001\u0000\u0000\u0000Y\\\u0001\u0000\u0000\u0000Z]\u0003"+
		"\u0010\b\u0000[]\u0005\b\u0000\u0000\\Z\u0001\u0000\u0000\u0000\\[\u0001"+
		"\u0000\u0000\u0000]_\u0001\u0000\u0000\u0000^`\u0005\u0003\u0000\u0000"+
		"_^\u0001\u0000\u0000\u0000_`\u0001\u0000\u0000\u0000`a\u0001\u0000\u0000"+
		"\u0000ab\u0005\u0010\u0000\u0000b\u000b\u0001\u0000\u0000\u0000ce\u0005"+
		"\u0011\u0000\u0000df\u0005\u0003\u0000\u0000ed\u0001\u0000\u0000\u0000"+
		"ef\u0001\u0000\u0000\u0000fg\u0001\u0000\u0000\u0000gi\u0003\u0000\u0000"+
		"\u0000hj\u0005\u0003\u0000\u0000ih\u0001\u0000\u0000\u0000ij\u0001\u0000"+
		"\u0000\u0000jk\u0001\u0000\u0000\u0000kl\u0005\u0012\u0000\u0000l\r\u0001"+
		"\u0000\u0000\u0000mo\u0003\u0010\b\u0000np\u0005\u0003\u0000\u0000on\u0001"+
		"\u0000\u0000\u0000op\u0001\u0000\u0000\u0000pq\u0001\u0000\u0000\u0000"+
		"qs\u0005\u0006\u0000\u0000rt\u0005\u0003\u0000\u0000sr\u0001\u0000\u0000"+
		"\u0000st\u0001\u0000\u0000\u0000tu\u0001\u0000\u0000\u0000uv\u0003\u0010"+
		"\b\u0000v\u000f\u0001\u0000\u0000\u0000w|\u0003\u0012\t\u0000xy\u0005"+
		"\u0005\u0000\u0000y{\u0003\u0012\t\u0000zx\u0001\u0000\u0000\u0000{~\u0001"+
		"\u0000\u0000\u0000|z\u0001\u0000\u0000\u0000|}\u0001\u0000\u0000\u0000"+
		"}\u0011\u0001\u0000\u0000\u0000~|\u0001\u0000\u0000\u0000\u007f\u0086"+
		"\u0005\u0004\u0000\u0000\u0080\u0086\u0005\u0007\u0000\u0000\u0081\u0082"+
		"\u0005\u0001\u0000\u0000\u0082\u0083\u0003\u0010\b\u0000\u0083\u0084\u0005"+
		"\u0002\u0000\u0000\u0084\u0086\u0001\u0000\u0000\u0000\u0085\u007f\u0001"+
		"\u0000\u0000\u0000\u0085\u0080\u0001\u0000\u0000\u0000\u0085\u0081\u0001"+
		"\u0000\u0000\u0000\u0086\u0013\u0001\u0000\u0000\u0000\u0013\u0017*.2"+
		"6:@DLPX\\_eios|\u0085";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}