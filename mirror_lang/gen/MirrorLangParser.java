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
		T__0=1, T__1=2, WS=3, NEWLINE=4, VARIABLE=5, ARITHMETIC_OPERATOR=6, COMPARE_OPERATOR=7, 
		INT_VALUE=8, STRING_VALUE=9, SET_START=10, SET_END=11, LOOPIF_START=12, 
		LOOPIF_END=13, IF_START=14, IF_END=15, LOG_START=16, LOG_END=17, IGNORE_START=18, 
		IGNORE_END=19, SINGLE_LINE_COMMENT=20, EQUALS=21;
	public static final int
		RULE_program = 0, RULE_statement = 1, RULE_setStatement = 2, RULE_loopIfStatement = 3, 
		RULE_ifStatement = 4, RULE_logStatement = 5, RULE_ignoreStatement = 6, 
		RULE_innerStatement = 7, RULE_condition = 8, RULE_expression = 9, RULE_term = 10;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "statement", "setStatement", "loopIfStatement", "ifStatement", 
			"logStatement", "ignoreStatement", "innerStatement", "condition", "expression", 
			"term"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", null, null, null, null, null, null, null, "'(SET'", 
			"'TES)'", "'(LOOPIF'", "'FIPOOL)'", "'(IF'", "'FI)'", "'(LOG'", "'GOL)'", 
			"'(IGNORE'", "'ERONGI)'", null, "'='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, "WS", "NEWLINE", "VARIABLE", "ARITHMETIC_OPERATOR", 
			"COMPARE_OPERATOR", "INT_VALUE", "STRING_VALUE", "SET_START", "SET_END", 
			"LOOPIF_START", "LOOPIF_END", "IF_START", "IF_END", "LOG_START", "LOG_END", 
			"IGNORE_START", "IGNORE_END", "SINGLE_LINE_COMMENT", "EQUALS"
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
		public List<TerminalNode> EOF() { return getTokens(MirrorLangParser.EOF); }
		public TerminalNode EOF(int i) {
			return getToken(MirrorLangParser.EOF, i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(MirrorLangParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(MirrorLangParser.NEWLINE, i);
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
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(31); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(22);
				statement();
				setState(29);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case NEWLINE:
					{
					setState(24); 
					_errHandler.sync(this);
					_alt = 1;
					do {
						switch (_alt) {
						case 1:
							{
							{
							setState(23);
							match(NEWLINE);
							}
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(26); 
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
					} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
					}
					break;
				case EOF:
					{
					setState(28);
					match(EOF);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				setState(33); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 349200L) != 0) );
			setState(35);
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
		public TerminalNode NEWLINE() { return getToken(MirrorLangParser.NEWLINE, 0); }
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
			setState(43);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SET_START:
				enterOuterAlt(_localctx, 1);
				{
				setState(37);
				setStatement();
				}
				break;
			case LOOPIF_START:
				enterOuterAlt(_localctx, 2);
				{
				setState(38);
				loopIfStatement();
				}
				break;
			case IF_START:
				enterOuterAlt(_localctx, 3);
				{
				setState(39);
				ifStatement();
				}
				break;
			case LOG_START:
				enterOuterAlt(_localctx, 4);
				{
				setState(40);
				logStatement();
				}
				break;
			case IGNORE_START:
				enterOuterAlt(_localctx, 5);
				{
				setState(41);
				ignoreStatement();
				}
				break;
			case NEWLINE:
				enterOuterAlt(_localctx, 6);
				{
				setState(42);
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
			setState(45);
			match(SET_START);
			setState(47);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(46);
				match(WS);
				}
			}

			setState(49);
			match(VARIABLE);
			setState(51);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(50);
				match(WS);
				}
			}

			setState(53);
			match(EQUALS);
			setState(55);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(54);
				match(WS);
				}
			}

			setState(57);
			expression();
			setState(59);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(58);
				match(WS);
				}
			}

			setState(61);
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
		public TerminalNode LOOPIF_END() { return getToken(MirrorLangParser.LOOPIF_END, 0); }
		public TerminalNode WS() { return getToken(MirrorLangParser.WS, 0); }
		public TerminalNode NEWLINE() { return getToken(MirrorLangParser.NEWLINE, 0); }
		public List<InnerStatementContext> innerStatement() {
			return getRuleContexts(InnerStatementContext.class);
		}
		public InnerStatementContext innerStatement(int i) {
			return getRuleContext(InnerStatementContext.class,i);
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
			setState(63);
			match(LOOPIF_START);
			setState(65);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(64);
				match(WS);
				}
			}

			setState(67);
			condition();
			setState(69);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(68);
				match(NEWLINE);
				}
				break;
			}
			setState(72); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(71);
				innerStatement();
				}
				}
				setState(74); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 349208L) != 0) );
			setState(76);
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
		public TerminalNode IF_END() { return getToken(MirrorLangParser.IF_END, 0); }
		public TerminalNode WS() { return getToken(MirrorLangParser.WS, 0); }
		public TerminalNode NEWLINE() { return getToken(MirrorLangParser.NEWLINE, 0); }
		public List<InnerStatementContext> innerStatement() {
			return getRuleContexts(InnerStatementContext.class);
		}
		public InnerStatementContext innerStatement(int i) {
			return getRuleContext(InnerStatementContext.class,i);
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
			setState(78);
			match(IF_START);
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
			condition();
			setState(84);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(83);
				match(NEWLINE);
				}
				break;
			}
			setState(87); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(86);
				innerStatement();
				}
				}
				setState(89); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 349208L) != 0) );
			setState(91);
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
			setState(93);
			match(LOG_START);
			setState(95);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(94);
				match(WS);
				}
			}

			setState(99);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case VARIABLE:
			case INT_VALUE:
				{
				setState(97);
				expression();
				}
				break;
			case STRING_VALUE:
				{
				setState(98);
				match(STRING_VALUE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(102);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(101);
				match(WS);
				}
			}

			setState(104);
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(106);
			match(IGNORE_START);
			setState(107);
			program();
			setState(108);
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
	public static class InnerStatementContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode WS() { return getToken(MirrorLangParser.WS, 0); }
		public TerminalNode NEWLINE() { return getToken(MirrorLangParser.NEWLINE, 0); }
		public InnerStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_innerStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MirrorLangListener ) ((MirrorLangListener)listener).enterInnerStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MirrorLangListener ) ((MirrorLangListener)listener).exitInnerStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MirrorLangVisitor ) return ((MirrorLangVisitor<? extends T>)visitor).visitInnerStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InnerStatementContext innerStatement() throws RecognitionException {
		InnerStatementContext _localctx = new InnerStatementContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_innerStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
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
			statement();
			setState(115);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				{
				setState(114);
				match(NEWLINE);
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
		enterRule(_localctx, 16, RULE_condition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(117);
			expression();
			setState(119);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(118);
				match(WS);
				}
			}

			setState(121);
			match(COMPARE_OPERATOR);
			setState(123);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(122);
				match(WS);
				}
			}

			setState(125);
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
		public List<TerminalNode> WS() { return getTokens(MirrorLangParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(MirrorLangParser.WS, i);
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
		enterRule(_localctx, 18, RULE_expression);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
			term();
			setState(138);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(129);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==WS) {
						{
						setState(128);
						match(WS);
						}
					}

					setState(131);
					match(ARITHMETIC_OPERATOR);
					setState(133);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==WS) {
						{
						setState(132);
						match(WS);
						}
					}

					setState(135);
					term();
					}
					} 
				}
				setState(140);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
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
		enterRule(_localctx, 20, RULE_term);
		try {
			setState(147);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VARIABLE:
				enterOuterAlt(_localctx, 1);
				{
				setState(141);
				match(VARIABLE);
				}
				break;
			case INT_VALUE:
				enterOuterAlt(_localctx, 2);
				{
				setState(142);
				match(INT_VALUE);
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 3);
				{
				setState(143);
				match(T__0);
				setState(144);
				expression();
				setState(145);
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
		"\u0004\u0001\u0015\u0096\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0001\u0000\u0001\u0000"+
		"\u0004\u0000\u0019\b\u0000\u000b\u0000\f\u0000\u001a\u0001\u0000\u0003"+
		"\u0000\u001e\b\u0000\u0004\u0000 \b\u0000\u000b\u0000\f\u0000!\u0001\u0000"+
		"\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0003\u0001,\b\u0001\u0001\u0002\u0001\u0002\u0003\u0002"+
		"0\b\u0002\u0001\u0002\u0001\u0002\u0003\u00024\b\u0002\u0001\u0002\u0001"+
		"\u0002\u0003\u00028\b\u0002\u0001\u0002\u0001\u0002\u0003\u0002<\b\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0003\u0003B\b\u0003"+
		"\u0001\u0003\u0001\u0003\u0003\u0003F\b\u0003\u0001\u0003\u0004\u0003"+
		"I\b\u0003\u000b\u0003\f\u0003J\u0001\u0003\u0001\u0003\u0001\u0004\u0001"+
		"\u0004\u0003\u0004Q\b\u0004\u0001\u0004\u0001\u0004\u0003\u0004U\b\u0004"+
		"\u0001\u0004\u0004\u0004X\b\u0004\u000b\u0004\f\u0004Y\u0001\u0004\u0001"+
		"\u0004\u0001\u0005\u0001\u0005\u0003\u0005`\b\u0005\u0001\u0005\u0001"+
		"\u0005\u0003\u0005d\b\u0005\u0001\u0005\u0003\u0005g\b\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007"+
		"\u0003\u0007p\b\u0007\u0001\u0007\u0001\u0007\u0003\u0007t\b\u0007\u0001"+
		"\b\u0001\b\u0003\bx\b\b\u0001\b\u0001\b\u0003\b|\b\b\u0001\b\u0001\b\u0001"+
		"\t\u0001\t\u0003\t\u0082\b\t\u0001\t\u0001\t\u0003\t\u0086\b\t\u0001\t"+
		"\u0005\t\u0089\b\t\n\t\f\t\u008c\t\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0003\n\u0094\b\n\u0001\n\u0000\u0000\u000b\u0000\u0002\u0004"+
		"\u0006\b\n\f\u000e\u0010\u0012\u0014\u0000\u0000\u00a8\u0000\u001f\u0001"+
		"\u0000\u0000\u0000\u0002+\u0001\u0000\u0000\u0000\u0004-\u0001\u0000\u0000"+
		"\u0000\u0006?\u0001\u0000\u0000\u0000\bN\u0001\u0000\u0000\u0000\n]\u0001"+
		"\u0000\u0000\u0000\fj\u0001\u0000\u0000\u0000\u000eo\u0001\u0000\u0000"+
		"\u0000\u0010u\u0001\u0000\u0000\u0000\u0012\u007f\u0001\u0000\u0000\u0000"+
		"\u0014\u0093\u0001\u0000\u0000\u0000\u0016\u001d\u0003\u0002\u0001\u0000"+
		"\u0017\u0019\u0005\u0004\u0000\u0000\u0018\u0017\u0001\u0000\u0000\u0000"+
		"\u0019\u001a\u0001\u0000\u0000\u0000\u001a\u0018\u0001\u0000\u0000\u0000"+
		"\u001a\u001b\u0001\u0000\u0000\u0000\u001b\u001e\u0001\u0000\u0000\u0000"+
		"\u001c\u001e\u0005\u0000\u0000\u0001\u001d\u0018\u0001\u0000\u0000\u0000"+
		"\u001d\u001c\u0001\u0000\u0000\u0000\u001e \u0001\u0000\u0000\u0000\u001f"+
		"\u0016\u0001\u0000\u0000\u0000 !\u0001\u0000\u0000\u0000!\u001f\u0001"+
		"\u0000\u0000\u0000!\"\u0001\u0000\u0000\u0000\"#\u0001\u0000\u0000\u0000"+
		"#$\u0005\u0000\u0000\u0001$\u0001\u0001\u0000\u0000\u0000%,\u0003\u0004"+
		"\u0002\u0000&,\u0003\u0006\u0003\u0000\',\u0003\b\u0004\u0000(,\u0003"+
		"\n\u0005\u0000),\u0003\f\u0006\u0000*,\u0005\u0004\u0000\u0000+%\u0001"+
		"\u0000\u0000\u0000+&\u0001\u0000\u0000\u0000+\'\u0001\u0000\u0000\u0000"+
		"+(\u0001\u0000\u0000\u0000+)\u0001\u0000\u0000\u0000+*\u0001\u0000\u0000"+
		"\u0000,\u0003\u0001\u0000\u0000\u0000-/\u0005\n\u0000\u0000.0\u0005\u0003"+
		"\u0000\u0000/.\u0001\u0000\u0000\u0000/0\u0001\u0000\u0000\u000001\u0001"+
		"\u0000\u0000\u000013\u0005\u0005\u0000\u000024\u0005\u0003\u0000\u0000"+
		"32\u0001\u0000\u0000\u000034\u0001\u0000\u0000\u000045\u0001\u0000\u0000"+
		"\u000057\u0005\u0015\u0000\u000068\u0005\u0003\u0000\u000076\u0001\u0000"+
		"\u0000\u000078\u0001\u0000\u0000\u000089\u0001\u0000\u0000\u00009;\u0003"+
		"\u0012\t\u0000:<\u0005\u0003\u0000\u0000;:\u0001\u0000\u0000\u0000;<\u0001"+
		"\u0000\u0000\u0000<=\u0001\u0000\u0000\u0000=>\u0005\u000b\u0000\u0000"+
		">\u0005\u0001\u0000\u0000\u0000?A\u0005\f\u0000\u0000@B\u0005\u0003\u0000"+
		"\u0000A@\u0001\u0000\u0000\u0000AB\u0001\u0000\u0000\u0000BC\u0001\u0000"+
		"\u0000\u0000CE\u0003\u0010\b\u0000DF\u0005\u0004\u0000\u0000ED\u0001\u0000"+
		"\u0000\u0000EF\u0001\u0000\u0000\u0000FH\u0001\u0000\u0000\u0000GI\u0003"+
		"\u000e\u0007\u0000HG\u0001\u0000\u0000\u0000IJ\u0001\u0000\u0000\u0000"+
		"JH\u0001\u0000\u0000\u0000JK\u0001\u0000\u0000\u0000KL\u0001\u0000\u0000"+
		"\u0000LM\u0005\r\u0000\u0000M\u0007\u0001\u0000\u0000\u0000NP\u0005\u000e"+
		"\u0000\u0000OQ\u0005\u0003\u0000\u0000PO\u0001\u0000\u0000\u0000PQ\u0001"+
		"\u0000\u0000\u0000QR\u0001\u0000\u0000\u0000RT\u0003\u0010\b\u0000SU\u0005"+
		"\u0004\u0000\u0000TS\u0001\u0000\u0000\u0000TU\u0001\u0000\u0000\u0000"+
		"UW\u0001\u0000\u0000\u0000VX\u0003\u000e\u0007\u0000WV\u0001\u0000\u0000"+
		"\u0000XY\u0001\u0000\u0000\u0000YW\u0001\u0000\u0000\u0000YZ\u0001\u0000"+
		"\u0000\u0000Z[\u0001\u0000\u0000\u0000[\\\u0005\u000f\u0000\u0000\\\t"+
		"\u0001\u0000\u0000\u0000]_\u0005\u0010\u0000\u0000^`\u0005\u0003\u0000"+
		"\u0000_^\u0001\u0000\u0000\u0000_`\u0001\u0000\u0000\u0000`c\u0001\u0000"+
		"\u0000\u0000ad\u0003\u0012\t\u0000bd\u0005\t\u0000\u0000ca\u0001\u0000"+
		"\u0000\u0000cb\u0001\u0000\u0000\u0000df\u0001\u0000\u0000\u0000eg\u0005"+
		"\u0003\u0000\u0000fe\u0001\u0000\u0000\u0000fg\u0001\u0000\u0000\u0000"+
		"gh\u0001\u0000\u0000\u0000hi\u0005\u0011\u0000\u0000i\u000b\u0001\u0000"+
		"\u0000\u0000jk\u0005\u0012\u0000\u0000kl\u0003\u0000\u0000\u0000lm\u0005"+
		"\u0013\u0000\u0000m\r\u0001\u0000\u0000\u0000np\u0005\u0003\u0000\u0000"+
		"on\u0001\u0000\u0000\u0000op\u0001\u0000\u0000\u0000pq\u0001\u0000\u0000"+
		"\u0000qs\u0003\u0002\u0001\u0000rt\u0005\u0004\u0000\u0000sr\u0001\u0000"+
		"\u0000\u0000st\u0001\u0000\u0000\u0000t\u000f\u0001\u0000\u0000\u0000"+
		"uw\u0003\u0012\t\u0000vx\u0005\u0003\u0000\u0000wv\u0001\u0000\u0000\u0000"+
		"wx\u0001\u0000\u0000\u0000xy\u0001\u0000\u0000\u0000y{\u0005\u0007\u0000"+
		"\u0000z|\u0005\u0003\u0000\u0000{z\u0001\u0000\u0000\u0000{|\u0001\u0000"+
		"\u0000\u0000|}\u0001\u0000\u0000\u0000}~\u0003\u0012\t\u0000~\u0011\u0001"+
		"\u0000\u0000\u0000\u007f\u008a\u0003\u0014\n\u0000\u0080\u0082\u0005\u0003"+
		"\u0000\u0000\u0081\u0080\u0001\u0000\u0000\u0000\u0081\u0082\u0001\u0000"+
		"\u0000\u0000\u0082\u0083\u0001\u0000\u0000\u0000\u0083\u0085\u0005\u0006"+
		"\u0000\u0000\u0084\u0086\u0005\u0003\u0000\u0000\u0085\u0084\u0001\u0000"+
		"\u0000\u0000\u0085\u0086\u0001\u0000\u0000\u0000\u0086\u0087\u0001\u0000"+
		"\u0000\u0000\u0087\u0089\u0003\u0014\n\u0000\u0088\u0081\u0001\u0000\u0000"+
		"\u0000\u0089\u008c\u0001\u0000\u0000\u0000\u008a\u0088\u0001\u0000\u0000"+
		"\u0000\u008a\u008b\u0001\u0000\u0000\u0000\u008b\u0013\u0001\u0000\u0000"+
		"\u0000\u008c\u008a\u0001\u0000\u0000\u0000\u008d\u0094\u0005\u0005\u0000"+
		"\u0000\u008e\u0094\u0005\b\u0000\u0000\u008f\u0090\u0005\u0001\u0000\u0000"+
		"\u0090\u0091\u0003\u0012\t\u0000\u0091\u0092\u0005\u0002\u0000\u0000\u0092"+
		"\u0094\u0001\u0000\u0000\u0000\u0093\u008d\u0001\u0000\u0000\u0000\u0093"+
		"\u008e\u0001\u0000\u0000\u0000\u0093\u008f\u0001\u0000\u0000\u0000\u0094"+
		"\u0015\u0001\u0000\u0000\u0000\u0019\u001a\u001d!+/37;AEJPTY_cfosw{\u0081"+
		"\u0085\u008a\u0093";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}