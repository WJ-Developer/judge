// Generated from E:/gitee/myContainer/java/my_container/my_container/src/main/resources/ObjAssert.g4 by ANTLR 4.13.1

    package com.wj.judge.grammar.objassert;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNDeserializer;
import org.antlr.v4.runtime.atn.ParserATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class ObjAssertParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		EQ=1, NOT_EQ=2, GT=3, GT_EQ=4, LT=5, LT_EQ=6, CONTAIN=7, NOT_CONTAIN=8, 
		HAVE=9, NOT_HAVE=10, JUDGE=11, OR=12, AND=13, OPEN_PAR=14, CLOSE_PAR=15, 
		VALUE=16, PARAM=17, LINE_COMMENT=18, SINGLE_LINE_COMMENT=19, MULTILINE_COMMENT=20, 
		WS=21;
	public static final int
		RULE_parse = 0, RULE_expr = 1, RULE_exprSingle = 2, RULE_compare = 3, 
		RULE_logic = 4;
	private static String[] makeRuleNames() {
		return new String[] {
			"parse", "expr", "exprSingle", "compare", "logic"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "EQ", "NOT_EQ", "GT", "GT_EQ", "LT", "LT_EQ", "CONTAIN", "NOT_CONTAIN", 
			"HAVE", "NOT_HAVE", "JUDGE", "OR", "AND", "OPEN_PAR", "CLOSE_PAR", "VALUE", 
			"PARAM", "LINE_COMMENT", "SINGLE_LINE_COMMENT", "MULTILINE_COMMENT", 
			"WS"
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
	public String getGrammarFileName() { return "ObjAssert.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ObjAssertParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ParseContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode EOF() { return getToken(ObjAssertParser.EOF, 0); }
		public ParseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parse; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjAssertListener ) ((ObjAssertListener)listener).enterParse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjAssertListener ) ((ObjAssertListener)listener).exitParse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjAssertVisitor ) return ((ObjAssertVisitor<? extends T>)visitor).visitParse(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParseContext parse() throws RecognitionException {
		ParseContext _localctx = new ParseContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_parse);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(10);
			expr();
			setState(11);
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
	public static class ExprContext extends ParserRuleContext {
		public boolean exprValue;
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
			this.exprValue = ctx.exprValue;
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LableLogicConnectContext extends ExprContext {
		public List<ExprSingleContext> exprSingle() {
			return getRuleContexts(ExprSingleContext.class);
		}
		public ExprSingleContext exprSingle(int i) {
			return getRuleContext(ExprSingleContext.class,i);
		}
		public List<LogicContext> logic() {
			return getRuleContexts(LogicContext.class);
		}
		public LogicContext logic(int i) {
			return getRuleContext(LogicContext.class,i);
		}
		public LableLogicConnectContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjAssertListener ) ((ObjAssertListener)listener).enterLableLogicConnect(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjAssertListener ) ((ObjAssertListener)listener).exitLableLogicConnect(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjAssertVisitor ) return ((ObjAssertVisitor<? extends T>)visitor).visitLableLogicConnect(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_expr);
		int _la;
		try {
			_localctx = new LableLogicConnectContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(13);
			exprSingle();
			setState(19);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OR || _la==AND) {
				{
				{
				setState(14);
				logic();
				setState(15);
				exprSingle();
				}
				}
				setState(21);
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
	public static class ExprSingleContext extends ParserRuleContext {
		public boolean exprSingleValue;
		public ExprSingleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprSingle; }
	 
		public ExprSingleContext() { }
		public void copyFrom(ExprSingleContext ctx) {
			super.copyFrom(ctx);
			this.exprSingleValue = ctx.exprSingleValue;
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LableJudgeContext extends ExprSingleContext {
		public TerminalNode PARAM() { return getToken(ObjAssertParser.PARAM, 0); }
		public TerminalNode JUDGE() { return getToken(ObjAssertParser.JUDGE, 0); }
		public LableJudgeContext(ExprSingleContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjAssertListener ) ((ObjAssertListener)listener).enterLableJudge(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjAssertListener ) ((ObjAssertListener)listener).exitLableJudge(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjAssertVisitor ) return ((ObjAssertVisitor<? extends T>)visitor).visitLableJudge(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LableGroupContext extends ExprSingleContext {
		public TerminalNode OPEN_PAR() { return getToken(ObjAssertParser.OPEN_PAR, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode CLOSE_PAR() { return getToken(ObjAssertParser.CLOSE_PAR, 0); }
		public LableGroupContext(ExprSingleContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjAssertListener ) ((ObjAssertListener)listener).enterLableGroup(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjAssertListener ) ((ObjAssertListener)listener).exitLableGroup(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjAssertVisitor ) return ((ObjAssertVisitor<? extends T>)visitor).visitLableGroup(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LableSingleContext extends ExprSingleContext {
		public TerminalNode PARAM() { return getToken(ObjAssertParser.PARAM, 0); }
		public CompareContext compare() {
			return getRuleContext(CompareContext.class,0);
		}
		public TerminalNode VALUE() { return getToken(ObjAssertParser.VALUE, 0); }
		public LableSingleContext(ExprSingleContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjAssertListener ) ((ObjAssertListener)listener).enterLableSingle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjAssertListener ) ((ObjAssertListener)listener).exitLableSingle(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjAssertVisitor ) return ((ObjAssertVisitor<? extends T>)visitor).visitLableSingle(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprSingleContext exprSingle() throws RecognitionException {
		ExprSingleContext _localctx = new ExprSingleContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_exprSingle);
		try {
			setState(32);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				_localctx = new LableSingleContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(22);
				match(PARAM);
				setState(23);
				compare();
				setState(24);
				match(VALUE);
				}
				break;
			case 2:
				_localctx = new LableJudgeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(26);
				match(PARAM);
				setState(27);
				match(JUDGE);
				}
				break;
			case 3:
				_localctx = new LableGroupContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(28);
				match(OPEN_PAR);
				setState(29);
				expr();
				setState(30);
				match(CLOSE_PAR);
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

	@SuppressWarnings("CheckReturnValue")
	public static class CompareContext extends ParserRuleContext {
		public Token op;
		public TerminalNode EQ() { return getToken(ObjAssertParser.EQ, 0); }
		public TerminalNode GT() { return getToken(ObjAssertParser.GT, 0); }
		public TerminalNode GT_EQ() { return getToken(ObjAssertParser.GT_EQ, 0); }
		public TerminalNode LT() { return getToken(ObjAssertParser.LT, 0); }
		public TerminalNode LT_EQ() { return getToken(ObjAssertParser.LT_EQ, 0); }
		public TerminalNode CONTAIN() { return getToken(ObjAssertParser.CONTAIN, 0); }
		public TerminalNode NOT_CONTAIN() { return getToken(ObjAssertParser.NOT_CONTAIN, 0); }
		public TerminalNode HAVE() { return getToken(ObjAssertParser.HAVE, 0); }
		public TerminalNode NOT_HAVE() { return getToken(ObjAssertParser.NOT_HAVE, 0); }
		public CompareContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compare; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjAssertListener ) ((ObjAssertListener)listener).enterCompare(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjAssertListener ) ((ObjAssertListener)listener).exitCompare(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjAssertVisitor ) return ((ObjAssertVisitor<? extends T>)visitor).visitCompare(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompareContext compare() throws RecognitionException {
		CompareContext _localctx = new CompareContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_compare);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(34);
			((CompareContext)_localctx).op = _input.LT(1);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 2042L) != 0)) ) {
				((CompareContext)_localctx).op = (Token)_errHandler.recoverInline(this);
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

	@SuppressWarnings("CheckReturnValue")
	public static class LogicContext extends ParserRuleContext {
		public Token op;
		public TerminalNode AND() { return getToken(ObjAssertParser.AND, 0); }
		public TerminalNode OR() { return getToken(ObjAssertParser.OR, 0); }
		public LogicContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logic; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjAssertListener ) ((ObjAssertListener)listener).enterLogic(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjAssertListener ) ((ObjAssertListener)listener).exitLogic(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjAssertVisitor ) return ((ObjAssertVisitor<? extends T>)visitor).visitLogic(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogicContext logic() throws RecognitionException {
		LogicContext _localctx = new LogicContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_logic);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(36);
			((LogicContext)_localctx).op = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==OR || _la==AND) ) {
				((LogicContext)_localctx).op = (Token)_errHandler.recoverInline(this);
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

	public static final String _serializedATN =
		"\u0004\u0001\u0015\'\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0005\u0001\u0012\b\u0001\n\u0001\f\u0001\u0015\t\u0001\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002!\b\u0002\u0001\u0003"+
		"\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0000\u0000\u0005\u0000"+
		"\u0002\u0004\u0006\b\u0000\u0002\u0002\u0000\u0001\u0001\u0003\n\u0001"+
		"\u0000\f\r$\u0000\n\u0001\u0000\u0000\u0000\u0002\r\u0001\u0000\u0000"+
		"\u0000\u0004 \u0001\u0000\u0000\u0000\u0006\"\u0001\u0000\u0000\u0000"+
		"\b$\u0001\u0000\u0000\u0000\n\u000b\u0003\u0002\u0001\u0000\u000b\f\u0005"+
		"\u0000\u0000\u0001\f\u0001\u0001\u0000\u0000\u0000\r\u0013\u0003\u0004"+
		"\u0002\u0000\u000e\u000f\u0003\b\u0004\u0000\u000f\u0010\u0003\u0004\u0002"+
		"\u0000\u0010\u0012\u0001\u0000\u0000\u0000\u0011\u000e\u0001\u0000\u0000"+
		"\u0000\u0012\u0015\u0001\u0000\u0000\u0000\u0013\u0011\u0001\u0000\u0000"+
		"\u0000\u0013\u0014\u0001\u0000\u0000\u0000\u0014\u0003\u0001\u0000\u0000"+
		"\u0000\u0015\u0013\u0001\u0000\u0000\u0000\u0016\u0017\u0005\u0011\u0000"+
		"\u0000\u0017\u0018\u0003\u0006\u0003\u0000\u0018\u0019\u0005\u0010\u0000"+
		"\u0000\u0019!\u0001\u0000\u0000\u0000\u001a\u001b\u0005\u0011\u0000\u0000"+
		"\u001b!\u0005\u000b\u0000\u0000\u001c\u001d\u0005\u000e\u0000\u0000\u001d"+
		"\u001e\u0003\u0002\u0001\u0000\u001e\u001f\u0005\u000f\u0000\u0000\u001f"+
		"!\u0001\u0000\u0000\u0000 \u0016\u0001\u0000\u0000\u0000 \u001a\u0001"+
		"\u0000\u0000\u0000 \u001c\u0001\u0000\u0000\u0000!\u0005\u0001\u0000\u0000"+
		"\u0000\"#\u0007\u0000\u0000\u0000#\u0007\u0001\u0000\u0000\u0000$%\u0007"+
		"\u0001\u0000\u0000%\t\u0001\u0000\u0000\u0000\u0002\u0013 ";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}