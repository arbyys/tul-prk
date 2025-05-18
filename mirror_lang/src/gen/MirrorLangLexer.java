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
		T__0=1, T__1=2, WS=3, VARIABLE=4, ARITHMETIC_OPERATOR=5, COMPARE_OPERATOR=6, 
		INT_VALUE=7, STRING_VALUE=8, SET_START=9, SET_END=10, LOOPIF_START=11, 
		LOOPIF_END=12, IF_START=13, IF_END=14, LOG_START=15, LOG_END=16, IGNORE_START=17, 
		IGNORE_END=18, SINGLE_LINE_COMMENT=19, EQUALS=20, NEWLINE=21;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "WS", "VARIABLE", "ARITHMETIC_OPERATOR", "COMPARE_OPERATOR", 
			"INT_VALUE", "STRING_VALUE", "SET_START", "SET_END", "LOOPIF_START", 
			"LOOPIF_END", "IF_START", "IF_END", "LOG_START", "LOG_END", "IGNORE_START", 
			"IGNORE_END", "SINGLE_LINE_COMMENT", "EQUALS", "NEWLINE"
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
		"1\b\u0002\u000b\u0002\f\u00022\u0001\u0002\u0001\u0002\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0005\u0003:\b\u0003\n\u0003\f\u0003=\t\u0003\u0001"+
		"\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003"+
		"\u0005K\b\u0005\u0001\u0006\u0004\u0006N\b\u0006\u000b\u0006\f\u0006O"+
		"\u0001\u0007\u0001\u0007\u0005\u0007T\b\u0007\n\u0007\f\u0007W\t\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0005\u0012\u009b\b\u0012\n"+
		"\u0012\f\u0012\u009e\t\u0012\u0001\u0012\u0003\u0012\u00a1\b\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001"+
		"\u0014\u0003\u0014\u00aa\b\u0014\u0001\u0014\u0001\u0014\u0002U\u009c"+
		"\u0000\u0015\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b"+
		"\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b"+
		"\u000e\u001d\u000f\u001f\u0010!\u0011#\u0012%\u0013\'\u0014)\u0015\u0001"+
		"\u0000\u0005\u0003\u0000\t\n\r\r  \u0001\u0000az\u0003\u000009__az\u0005"+
		"\u0000%%*+--//^^\u0001\u000009\u00b8\u0000\u0001\u0001\u0000\u0000\u0000"+
		"\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000"+
		"\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000"+
		"\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f"+
		"\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013"+
		"\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017"+
		"\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b"+
		"\u0001\u0000\u0000\u0000\u0000\u001d\u0001\u0000\u0000\u0000\u0000\u001f"+
		"\u0001\u0000\u0000\u0000\u0000!\u0001\u0000\u0000\u0000\u0000#\u0001\u0000"+
		"\u0000\u0000\u0000%\u0001\u0000\u0000\u0000\u0000\'\u0001\u0000\u0000"+
		"\u0000\u0000)\u0001\u0000\u0000\u0000\u0001+\u0001\u0000\u0000\u0000\u0003"+
		"-\u0001\u0000\u0000\u0000\u00050\u0001\u0000\u0000\u0000\u00076\u0001"+
		"\u0000\u0000\u0000\t>\u0001\u0000\u0000\u0000\u000bJ\u0001\u0000\u0000"+
		"\u0000\rM\u0001\u0000\u0000\u0000\u000fQ\u0001\u0000\u0000\u0000\u0011"+
		"Z\u0001\u0000\u0000\u0000\u0013_\u0001\u0000\u0000\u0000\u0015d\u0001"+
		"\u0000\u0000\u0000\u0017l\u0001\u0000\u0000\u0000\u0019t\u0001\u0000\u0000"+
		"\u0000\u001bx\u0001\u0000\u0000\u0000\u001d|\u0001\u0000\u0000\u0000\u001f"+
		"\u0081\u0001\u0000\u0000\u0000!\u0086\u0001\u0000\u0000\u0000#\u008e\u0001"+
		"\u0000\u0000\u0000%\u0096\u0001\u0000\u0000\u0000\'\u00a6\u0001\u0000"+
		"\u0000\u0000)\u00a9\u0001\u0000\u0000\u0000+,\u0005(\u0000\u0000,\u0002"+
		"\u0001\u0000\u0000\u0000-.\u0005)\u0000\u0000.\u0004\u0001\u0000\u0000"+
		"\u0000/1\u0007\u0000\u0000\u00000/\u0001\u0000\u0000\u000012\u0001\u0000"+
		"\u0000\u000020\u0001\u0000\u0000\u000023\u0001\u0000\u0000\u000034\u0001"+
		"\u0000\u0000\u000045\u0006\u0002\u0000\u00005\u0006\u0001\u0000\u0000"+
		"\u000067\u0005$\u0000\u00007;\u0007\u0001\u0000\u00008:\u0007\u0002\u0000"+
		"\u000098\u0001\u0000\u0000\u0000:=\u0001\u0000\u0000\u0000;9\u0001\u0000"+
		"\u0000\u0000;<\u0001\u0000\u0000\u0000<\b\u0001\u0000\u0000\u0000=;\u0001"+
		"\u0000\u0000\u0000>?\u0007\u0003\u0000\u0000?\n\u0001\u0000\u0000\u0000"+
		"@A\u0005=\u0000\u0000AK\u0005=\u0000\u0000BC\u0005>\u0000\u0000CK\u0005"+
		"=\u0000\u0000DK\u0005>\u0000\u0000EF\u0005<\u0000\u0000FK\u0005=\u0000"+
		"\u0000GK\u0005<\u0000\u0000HI\u0005!\u0000\u0000IK\u0005=\u0000\u0000"+
		"J@\u0001\u0000\u0000\u0000JB\u0001\u0000\u0000\u0000JD\u0001\u0000\u0000"+
		"\u0000JE\u0001\u0000\u0000\u0000JG\u0001\u0000\u0000\u0000JH\u0001\u0000"+
		"\u0000\u0000K\f\u0001\u0000\u0000\u0000LN\u0007\u0004\u0000\u0000ML\u0001"+
		"\u0000\u0000\u0000NO\u0001\u0000\u0000\u0000OM\u0001\u0000\u0000\u0000"+
		"OP\u0001\u0000\u0000\u0000P\u000e\u0001\u0000\u0000\u0000QU\u0005\"\u0000"+
		"\u0000RT\t\u0000\u0000\u0000SR\u0001\u0000\u0000\u0000TW\u0001\u0000\u0000"+
		"\u0000UV\u0001\u0000\u0000\u0000US\u0001\u0000\u0000\u0000VX\u0001\u0000"+
		"\u0000\u0000WU\u0001\u0000\u0000\u0000XY\u0005\"\u0000\u0000Y\u0010\u0001"+
		"\u0000\u0000\u0000Z[\u0005(\u0000\u0000[\\\u0005S\u0000\u0000\\]\u0005"+
		"E\u0000\u0000]^\u0005T\u0000\u0000^\u0012\u0001\u0000\u0000\u0000_`\u0005"+
		"T\u0000\u0000`a\u0005E\u0000\u0000ab\u0005S\u0000\u0000bc\u0005)\u0000"+
		"\u0000c\u0014\u0001\u0000\u0000\u0000de\u0005(\u0000\u0000ef\u0005L\u0000"+
		"\u0000fg\u0005O\u0000\u0000gh\u0005O\u0000\u0000hi\u0005P\u0000\u0000"+
		"ij\u0005I\u0000\u0000jk\u0005F\u0000\u0000k\u0016\u0001\u0000\u0000\u0000"+
		"lm\u0005F\u0000\u0000mn\u0005I\u0000\u0000no\u0005P\u0000\u0000op\u0005"+
		"O\u0000\u0000pq\u0005O\u0000\u0000qr\u0005L\u0000\u0000rs\u0005)\u0000"+
		"\u0000s\u0018\u0001\u0000\u0000\u0000tu\u0005(\u0000\u0000uv\u0005I\u0000"+
		"\u0000vw\u0005F\u0000\u0000w\u001a\u0001\u0000\u0000\u0000xy\u0005F\u0000"+
		"\u0000yz\u0005I\u0000\u0000z{\u0005)\u0000\u0000{\u001c\u0001\u0000\u0000"+
		"\u0000|}\u0005(\u0000\u0000}~\u0005L\u0000\u0000~\u007f\u0005O\u0000\u0000"+
		"\u007f\u0080\u0005G\u0000\u0000\u0080\u001e\u0001\u0000\u0000\u0000\u0081"+
		"\u0082\u0005G\u0000\u0000\u0082\u0083\u0005O\u0000\u0000\u0083\u0084\u0005"+
		"L\u0000\u0000\u0084\u0085\u0005)\u0000\u0000\u0085 \u0001\u0000\u0000"+
		"\u0000\u0086\u0087\u0005(\u0000\u0000\u0087\u0088\u0005I\u0000\u0000\u0088"+
		"\u0089\u0005G\u0000\u0000\u0089\u008a\u0005N\u0000\u0000\u008a\u008b\u0005"+
		"O\u0000\u0000\u008b\u008c\u0005R\u0000\u0000\u008c\u008d\u0005E\u0000"+
		"\u0000\u008d\"\u0001\u0000\u0000\u0000\u008e\u008f\u0005E\u0000\u0000"+
		"\u008f\u0090\u0005R\u0000\u0000\u0090\u0091\u0005O\u0000\u0000\u0091\u0092"+
		"\u0005N\u0000\u0000\u0092\u0093\u0005G\u0000\u0000\u0093\u0094\u0005I"+
		"\u0000\u0000\u0094\u0095\u0005)\u0000\u0000\u0095$\u0001\u0000\u0000\u0000"+
		"\u0096\u0097\u0005/\u0000\u0000\u0097\u0098\u0005/\u0000\u0000\u0098\u009c"+
		"\u0001\u0000\u0000\u0000\u0099\u009b\t\u0000\u0000\u0000\u009a\u0099\u0001"+
		"\u0000\u0000\u0000\u009b\u009e\u0001\u0000\u0000\u0000\u009c\u009d\u0001"+
		"\u0000\u0000\u0000\u009c\u009a\u0001\u0000\u0000\u0000\u009d\u00a0\u0001"+
		"\u0000\u0000\u0000\u009e\u009c\u0001\u0000\u0000\u0000\u009f\u00a1\u0005"+
		"\r\u0000\u0000\u00a0\u009f\u0001\u0000\u0000\u0000\u00a0\u00a1\u0001\u0000"+
		"\u0000\u0000\u00a1\u00a2\u0001\u0000\u0000\u0000\u00a2\u00a3\u0005\n\u0000"+
		"\u0000\u00a3\u00a4\u0001\u0000\u0000\u0000\u00a4\u00a5\u0006\u0012\u0000"+
		"\u0000\u00a5&\u0001\u0000\u0000\u0000\u00a6\u00a7\u0005=\u0000\u0000\u00a7"+
		"(\u0001\u0000\u0000\u0000\u00a8\u00aa\u0005\r\u0000\u0000\u00a9\u00a8"+
		"\u0001\u0000\u0000\u0000\u00a9\u00aa\u0001\u0000\u0000\u0000\u00aa\u00ab"+
		"\u0001\u0000\u0000\u0000\u00ab\u00ac\u0005\n\u0000\u0000\u00ac*\u0001"+
		"\u0000\u0000\u0000\t\u00002;JOU\u009c\u00a0\u00a9\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}