// Generated from MirrorLang.g4 by ANTLR 4.13.0
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class MirrorLangLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.0", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, WS=3, NEWLINE=4, VARIABLE=5, ARITHMETIC_OPERATOR=6, COMPARE_OPERATOR=7, 
		INT_VALUE=8, STRING_VALUE=9, SET_START=10, SET_END=11, LOOPIF_START=12, 
		LOOPIF_END=13, IF_START=14, IF_END=15, LOG_START=16, LOG_END=17, IGNORE_START=18, 
		IGNORE_END=19, SINGLE_LINE_COMMENT=20, EQUALS=21;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "WS", "NEWLINE", "VARIABLE", "ARITHMETIC_OPERATOR", "COMPARE_OPERATOR", 
			"INT_VALUE", "STRING_VALUE", "SET_START", "SET_END", "LOOPIF_START", 
			"LOOPIF_END", "IF_START", "IF_END", "LOG_START", "LOG_END", "IGNORE_START", 
			"IGNORE_END", "SINGLE_LINE_COMMENT", "EQUALS"
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


	public MirrorLangLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "MirrorLang.g4"; }

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
		"\u0004\u0000\u0015\u00ad\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014"+
		"\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0002\u0004\u0002"+
		"1\b\u0002\u000b\u0002\f\u00022\u0001\u0002\u0001\u0002\u0001\u0003\u0003"+
		"\u00038\b\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0005\u0004?\b\u0004\n\u0004\f\u0004B\t\u0004\u0001\u0005\u0001"+
		"\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006P\b"+
		"\u0006\u0001\u0007\u0004\u0007S\b\u0007\u000b\u0007\f\u0007T\u0001\b\u0001"+
		"\b\u0005\bY\b\b\n\b\f\b\\\t\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t"+
		"\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f"+
		"\u0001\r\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0005\u0013\u00a0\b\u0013\n\u0013\f\u0013\u00a3\t\u0013\u0001\u0013"+
		"\u0003\u0013\u00a6\b\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0014\u0001\u0014\u0001\u00a1\u0000\u0015\u0001\u0001\u0003\u0002"+
		"\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013"+
		"\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e\u001d\u000f\u001f\u0010!\u0011"+
		"#\u0012%\u0013\'\u0014)\u0015\u0001\u0000\u0006\u0002\u0000\t\t  \u0001"+
		"\u0000az\u0003\u000009__az\u0005\u0000%%*+--//^^\u0001\u000009\u0003\u0000"+
		"\n\n\r\r\"\"\u00b8\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001"+
		"\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001"+
		"\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000"+
		"\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000"+
		"\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000"+
		"\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000"+
		"\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000\u0000"+
		"\u0000\u0000\u001d\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000\u0000"+
		"\u0000\u0000!\u0001\u0000\u0000\u0000\u0000#\u0001\u0000\u0000\u0000\u0000"+
		"%\u0001\u0000\u0000\u0000\u0000\'\u0001\u0000\u0000\u0000\u0000)\u0001"+
		"\u0000\u0000\u0000\u0001+\u0001\u0000\u0000\u0000\u0003-\u0001\u0000\u0000"+
		"\u0000\u00050\u0001\u0000\u0000\u0000\u00077\u0001\u0000\u0000\u0000\t"+
		";\u0001\u0000\u0000\u0000\u000bC\u0001\u0000\u0000\u0000\rO\u0001\u0000"+
		"\u0000\u0000\u000fR\u0001\u0000\u0000\u0000\u0011V\u0001\u0000\u0000\u0000"+
		"\u0013_\u0001\u0000\u0000\u0000\u0015d\u0001\u0000\u0000\u0000\u0017i"+
		"\u0001\u0000\u0000\u0000\u0019q\u0001\u0000\u0000\u0000\u001by\u0001\u0000"+
		"\u0000\u0000\u001d}\u0001\u0000\u0000\u0000\u001f\u0081\u0001\u0000\u0000"+
		"\u0000!\u0086\u0001\u0000\u0000\u0000#\u008b\u0001\u0000\u0000\u0000%"+
		"\u0093\u0001\u0000\u0000\u0000\'\u009b\u0001\u0000\u0000\u0000)\u00ab"+
		"\u0001\u0000\u0000\u0000+,\u0005(\u0000\u0000,\u0002\u0001\u0000\u0000"+
		"\u0000-.\u0005)\u0000\u0000.\u0004\u0001\u0000\u0000\u0000/1\u0007\u0000"+
		"\u0000\u00000/\u0001\u0000\u0000\u000012\u0001\u0000\u0000\u000020\u0001"+
		"\u0000\u0000\u000023\u0001\u0000\u0000\u000034\u0001\u0000\u0000\u0000"+
		"45\u0006\u0002\u0000\u00005\u0006\u0001\u0000\u0000\u000068\u0005\r\u0000"+
		"\u000076\u0001\u0000\u0000\u000078\u0001\u0000\u0000\u000089\u0001\u0000"+
		"\u0000\u00009:\u0005\n\u0000\u0000:\b\u0001\u0000\u0000\u0000;<\u0005"+
		"$\u0000\u0000<@\u0007\u0001\u0000\u0000=?\u0007\u0002\u0000\u0000>=\u0001"+
		"\u0000\u0000\u0000?B\u0001\u0000\u0000\u0000@>\u0001\u0000\u0000\u0000"+
		"@A\u0001\u0000\u0000\u0000A\n\u0001\u0000\u0000\u0000B@\u0001\u0000\u0000"+
		"\u0000CD\u0007\u0003\u0000\u0000D\f\u0001\u0000\u0000\u0000EF\u0005=\u0000"+
		"\u0000FP\u0005=\u0000\u0000GH\u0005>\u0000\u0000HP\u0005=\u0000\u0000"+
		"IP\u0005>\u0000\u0000JK\u0005<\u0000\u0000KP\u0005=\u0000\u0000LP\u0005"+
		"<\u0000\u0000MN\u0005!\u0000\u0000NP\u0005=\u0000\u0000OE\u0001\u0000"+
		"\u0000\u0000OG\u0001\u0000\u0000\u0000OI\u0001\u0000\u0000\u0000OJ\u0001"+
		"\u0000\u0000\u0000OL\u0001\u0000\u0000\u0000OM\u0001\u0000\u0000\u0000"+
		"P\u000e\u0001\u0000\u0000\u0000QS\u0007\u0004\u0000\u0000RQ\u0001\u0000"+
		"\u0000\u0000ST\u0001\u0000\u0000\u0000TR\u0001\u0000\u0000\u0000TU\u0001"+
		"\u0000\u0000\u0000U\u0010\u0001\u0000\u0000\u0000VZ\u0005\"\u0000\u0000"+
		"WY\b\u0005\u0000\u0000XW\u0001\u0000\u0000\u0000Y\\\u0001\u0000\u0000"+
		"\u0000ZX\u0001\u0000\u0000\u0000Z[\u0001\u0000\u0000\u0000[]\u0001\u0000"+
		"\u0000\u0000\\Z\u0001\u0000\u0000\u0000]^\u0005\"\u0000\u0000^\u0012\u0001"+
		"\u0000\u0000\u0000_`\u0005(\u0000\u0000`a\u0005S\u0000\u0000ab\u0005E"+
		"\u0000\u0000bc\u0005T\u0000\u0000c\u0014\u0001\u0000\u0000\u0000de\u0005"+
		"T\u0000\u0000ef\u0005E\u0000\u0000fg\u0005S\u0000\u0000gh\u0005)\u0000"+
		"\u0000h\u0016\u0001\u0000\u0000\u0000ij\u0005(\u0000\u0000jk\u0005L\u0000"+
		"\u0000kl\u0005O\u0000\u0000lm\u0005O\u0000\u0000mn\u0005P\u0000\u0000"+
		"no\u0005I\u0000\u0000op\u0005F\u0000\u0000p\u0018\u0001\u0000\u0000\u0000"+
		"qr\u0005F\u0000\u0000rs\u0005I\u0000\u0000st\u0005P\u0000\u0000tu\u0005"+
		"O\u0000\u0000uv\u0005O\u0000\u0000vw\u0005L\u0000\u0000wx\u0005)\u0000"+
		"\u0000x\u001a\u0001\u0000\u0000\u0000yz\u0005(\u0000\u0000z{\u0005I\u0000"+
		"\u0000{|\u0005F\u0000\u0000|\u001c\u0001\u0000\u0000\u0000}~\u0005F\u0000"+
		"\u0000~\u007f\u0005I\u0000\u0000\u007f\u0080\u0005)\u0000\u0000\u0080"+
		"\u001e\u0001\u0000\u0000\u0000\u0081\u0082\u0005(\u0000\u0000\u0082\u0083"+
		"\u0005L\u0000\u0000\u0083\u0084\u0005O\u0000\u0000\u0084\u0085\u0005G"+
		"\u0000\u0000\u0085 \u0001\u0000\u0000\u0000\u0086\u0087\u0005G\u0000\u0000"+
		"\u0087\u0088\u0005O\u0000\u0000\u0088\u0089\u0005L\u0000\u0000\u0089\u008a"+
		"\u0005)\u0000\u0000\u008a\"\u0001\u0000\u0000\u0000\u008b\u008c\u0005"+
		"(\u0000\u0000\u008c\u008d\u0005I\u0000\u0000\u008d\u008e\u0005G\u0000"+
		"\u0000\u008e\u008f\u0005N\u0000\u0000\u008f\u0090\u0005O\u0000\u0000\u0090"+
		"\u0091\u0005R\u0000\u0000\u0091\u0092\u0005E\u0000\u0000\u0092$\u0001"+
		"\u0000\u0000\u0000\u0093\u0094\u0005E\u0000\u0000\u0094\u0095\u0005R\u0000"+
		"\u0000\u0095\u0096\u0005O\u0000\u0000\u0096\u0097\u0005N\u0000\u0000\u0097"+
		"\u0098\u0005G\u0000\u0000\u0098\u0099\u0005I\u0000\u0000\u0099\u009a\u0005"+
		")\u0000\u0000\u009a&\u0001\u0000\u0000\u0000\u009b\u009c\u0005/\u0000"+
		"\u0000\u009c\u009d\u0005/\u0000\u0000\u009d\u00a1\u0001\u0000\u0000\u0000"+
		"\u009e\u00a0\t\u0000\u0000\u0000\u009f\u009e\u0001\u0000\u0000\u0000\u00a0"+
		"\u00a3\u0001\u0000\u0000\u0000\u00a1\u00a2\u0001\u0000\u0000\u0000\u00a1"+
		"\u009f\u0001\u0000\u0000\u0000\u00a2\u00a5\u0001\u0000\u0000\u0000\u00a3"+
		"\u00a1\u0001\u0000\u0000\u0000\u00a4\u00a6\u0005\r\u0000\u0000\u00a5\u00a4"+
		"\u0001\u0000\u0000\u0000\u00a5\u00a6\u0001\u0000\u0000\u0000\u00a6\u00a7"+
		"\u0001\u0000\u0000\u0000\u00a7\u00a8\u0005\n\u0000\u0000\u00a8\u00a9\u0001"+
		"\u0000\u0000\u0000\u00a9\u00aa\u0006\u0013\u0000\u0000\u00aa(\u0001\u0000"+
		"\u0000\u0000\u00ab\u00ac\u0005=\u0000\u0000\u00ac*\u0001\u0000\u0000\u0000"+
		"\t\u000027@OTZ\u00a1\u00a5\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}