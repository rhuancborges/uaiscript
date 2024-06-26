// Generated from UaiScript.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;


@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class UaiScriptLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		TIPO=1, ATR=2, AP=3, FP=4, AC=5, FC=6, RETORNO=7, ID=8, NUM=9, OP_ARITM=10, 
		OP_LOG=11, COMP=12, WS=13, VOID=14, DELIM=15, EST_REPET=16, EST_COND=17;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"LETRA", "DIGITO", "TIPO", "ATR", "AP", "FP", "AC", "FC", "RETORNO", 
			"ID", "NUM", "OP_ARITM", "OP_LOG", "COMP", "WS", "VOID", "DELIM", "EST_REPET", 
			"EST_COND"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "'bota'", "'('", "')'", "'{'", "'}'", "'vorta'", null, null, 
			null, null, null, null, "'nadanao'", "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "TIPO", "ATR", "AP", "FP", "AC", "FC", "RETORNO", "ID", "NUM", 
			"OP_ARITM", "OP_LOG", "COMP", "WS", "VOID", "DELIM", "EST_REPET", "EST_COND"
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


	public UaiScriptLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "UaiScript.g4"; }

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
		"\u0004\u0000\u0011\u00b1\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0003\u0002L\b\u0002\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0005"+
		"\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0005\td\b"+
		"\t\n\t\f\tg\t\t\u0001\n\u0004\nj\b\n\u000b\n\f\nk\u0001\n\u0001\n\u0004"+
		"\np\b\n\u000b\n\f\nq\u0003\nt\b\n\u0001\u000b\u0001\u000b\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0003\f~\b\f\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0003\r\u0085\b\r\u0001\u000e\u0005\u000e\u0088\b\u000e"+
		"\n\u000e\f\u000e\u008b\t\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0003\u0011\u00a1"+
		"\b\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0003\u0012\u00b0\b\u0012\u0000\u0000\u0013\u0001\u0000"+
		"\u0003\u0000\u0005\u0001\u0007\u0002\t\u0003\u000b\u0004\r\u0005\u000f"+
		"\u0006\u0011\u0007\u0013\b\u0015\t\u0017\n\u0019\u000b\u001b\f\u001d\r"+
		"\u001f\u000e!\u000f#\u0010%\u0011\u0001\u0000\u0004\u0002\u0000AZaz\u0001"+
		"\u000009\u0004\u0000%%*+--//\u0003\u0000\t\n\r\r  \u00c0\u0000\u0005\u0001"+
		"\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000"+
		"\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000"+
		"\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000"+
		"\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000"+
		"\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000"+
		"\u0000\u0000\u001b\u0001\u0000\u0000\u0000\u0000\u001d\u0001\u0000\u0000"+
		"\u0000\u0000\u001f\u0001\u0000\u0000\u0000\u0000!\u0001\u0000\u0000\u0000"+
		"\u0000#\u0001\u0000\u0000\u0000\u0000%\u0001\u0000\u0000\u0000\u0001\'"+
		"\u0001\u0000\u0000\u0000\u0003)\u0001\u0000\u0000\u0000\u0005K\u0001\u0000"+
		"\u0000\u0000\u0007M\u0001\u0000\u0000\u0000\tR\u0001\u0000\u0000\u0000"+
		"\u000bT\u0001\u0000\u0000\u0000\rV\u0001\u0000\u0000\u0000\u000fX\u0001"+
		"\u0000\u0000\u0000\u0011Z\u0001\u0000\u0000\u0000\u0013`\u0001\u0000\u0000"+
		"\u0000\u0015i\u0001\u0000\u0000\u0000\u0017u\u0001\u0000\u0000\u0000\u0019"+
		"}\u0001\u0000\u0000\u0000\u001b\u0084\u0001\u0000\u0000\u0000\u001d\u0089"+
		"\u0001\u0000\u0000\u0000\u001f\u008e\u0001\u0000\u0000\u0000!\u0096\u0001"+
		"\u0000\u0000\u0000#\u00a0\u0001\u0000\u0000\u0000%\u00af\u0001\u0000\u0000"+
		"\u0000\'(\u0007\u0000\u0000\u0000(\u0002\u0001\u0000\u0000\u0000)*\u0007"+
		"\u0001\u0000\u0000*\u0004\u0001\u0000\u0000\u0000+,\u0005t\u0000\u0000"+
		",-\u0005e\u0000\u0000-.\u0005r\u0000\u0000.L\u0005o\u0000\u0000/0\u0005"+
		"f\u0000\u000001\u0005r\u0000\u000012\u0005o\u0000\u000023\u0005t\u0000"+
		"\u00003L\u0005i\u0000\u000045\u0005d\u0000\u000056\u0005u\u0000\u0000"+
		"67\u0005p\u0000\u000078\u0005r\u0000\u00008L\u0005o\u0000\u00009:\u0005"+
		"b\u0000\u0000:;\u0005u\u0000\u0000;<\u0005l\u0000\u0000<=\u0005e\u0000"+
		"\u0000=>\u0005a\u0000\u0000>?\u0005n\u0000\u0000?L\u0005o\u0000\u0000"+
		"@A\u0005t\u0000\u0000AB\u0005r\u0000\u0000BC\u0005e\u0000\u0000CL\u0005"+
		"m\u0000\u0000DE\u0005t\u0000\u0000EF\u0005r\u0000\u0000FG\u0005e\u0000"+
		"\u0000GH\u0005n\u0000\u0000HI\u0005z\u0000\u0000IJ\u0005i\u0000\u0000"+
		"JL\u0005m\u0000\u0000K+\u0001\u0000\u0000\u0000K/\u0001\u0000\u0000\u0000"+
		"K4\u0001\u0000\u0000\u0000K9\u0001\u0000\u0000\u0000K@\u0001\u0000\u0000"+
		"\u0000KD\u0001\u0000\u0000\u0000L\u0006\u0001\u0000\u0000\u0000MN\u0005"+
		"b\u0000\u0000NO\u0005o\u0000\u0000OP\u0005t\u0000\u0000PQ\u0005a\u0000"+
		"\u0000Q\b\u0001\u0000\u0000\u0000RS\u0005(\u0000\u0000S\n\u0001\u0000"+
		"\u0000\u0000TU\u0005)\u0000\u0000U\f\u0001\u0000\u0000\u0000VW\u0005{"+
		"\u0000\u0000W\u000e\u0001\u0000\u0000\u0000XY\u0005}\u0000\u0000Y\u0010"+
		"\u0001\u0000\u0000\u0000Z[\u0005v\u0000\u0000[\\\u0005o\u0000\u0000\\"+
		"]\u0005r\u0000\u0000]^\u0005t\u0000\u0000^_\u0005a\u0000\u0000_\u0012"+
		"\u0001\u0000\u0000\u0000`e\u0003\u0001\u0000\u0000ad\u0003\u0003\u0001"+
		"\u0000bd\u0003\u0001\u0000\u0000ca\u0001\u0000\u0000\u0000cb\u0001\u0000"+
		"\u0000\u0000dg\u0001\u0000\u0000\u0000ec\u0001\u0000\u0000\u0000ef\u0001"+
		"\u0000\u0000\u0000f\u0014\u0001\u0000\u0000\u0000ge\u0001\u0000\u0000"+
		"\u0000hj\u0003\u0003\u0001\u0000ih\u0001\u0000\u0000\u0000jk\u0001\u0000"+
		"\u0000\u0000ki\u0001\u0000\u0000\u0000kl\u0001\u0000\u0000\u0000ls\u0001"+
		"\u0000\u0000\u0000mo\u0005.\u0000\u0000np\u0003\u0003\u0001\u0000on\u0001"+
		"\u0000\u0000\u0000pq\u0001\u0000\u0000\u0000qo\u0001\u0000\u0000\u0000"+
		"qr\u0001\u0000\u0000\u0000rt\u0001\u0000\u0000\u0000sm\u0001\u0000\u0000"+
		"\u0000st\u0001\u0000\u0000\u0000t\u0016\u0001\u0000\u0000\u0000uv\u0007"+
		"\u0002\u0000\u0000v\u0018\u0001\u0000\u0000\u0000wx\u0005n\u0000\u0000"+
		"xy\u0005a\u0000\u0000y~\u0005o\u0000\u0000z{\u0005o\u0000\u0000{~\u0005"+
		"u\u0000\u0000|~\u0005e\u0000\u0000}w\u0001\u0000\u0000\u0000}z\u0001\u0000"+
		"\u0000\u0000}|\u0001\u0000\u0000\u0000~\u001a\u0001\u0000\u0000\u0000"+
		"\u007f\u0085\u0002<>\u0000\u0080\u0081\u0005>\u0000\u0000\u0081\u0085"+
		"\u0005=\u0000\u0000\u0082\u0083\u0005<\u0000\u0000\u0083\u0085\u0005="+
		"\u0000\u0000\u0084\u007f\u0001\u0000\u0000\u0000\u0084\u0080\u0001\u0000"+
		"\u0000\u0000\u0084\u0082\u0001\u0000\u0000\u0000\u0085\u001c\u0001\u0000"+
		"\u0000\u0000\u0086\u0088\u0007\u0003\u0000\u0000\u0087\u0086\u0001\u0000"+
		"\u0000\u0000\u0088\u008b\u0001\u0000\u0000\u0000\u0089\u0087\u0001\u0000"+
		"\u0000\u0000\u0089\u008a\u0001\u0000\u0000\u0000\u008a\u008c\u0001\u0000"+
		"\u0000\u0000\u008b\u0089\u0001\u0000\u0000\u0000\u008c\u008d\u0006\u000e"+
		"\u0000\u0000\u008d\u001e\u0001\u0000\u0000\u0000\u008e\u008f\u0005n\u0000"+
		"\u0000\u008f\u0090\u0005a\u0000\u0000\u0090\u0091\u0005d\u0000\u0000\u0091"+
		"\u0092\u0005a\u0000\u0000\u0092\u0093\u0005n\u0000\u0000\u0093\u0094\u0005"+
		"a\u0000\u0000\u0094\u0095\u0005o\u0000\u0000\u0095 \u0001\u0000\u0000"+
		"\u0000\u0096\u0097\u0005;\u0000\u0000\u0097\"\u0001\u0000\u0000\u0000"+
		"\u0098\u0099\u0005u\u0000\u0000\u0099\u009a\u0005a\u0000\u0000\u009a\u00a1"+
		"\u0005i\u0000\u0000\u009b\u009c\u0005s\u0000\u0000\u009c\u00a1\u0005o"+
		"\u0000\u0000\u009d\u009e\u0005p\u0000\u0000\u009e\u009f\u0005r\u0000\u0000"+
		"\u009f\u00a1\u0005a\u0000\u0000\u00a0\u0098\u0001\u0000\u0000\u0000\u00a0"+
		"\u009b\u0001\u0000\u0000\u0000\u00a0\u009d\u0001\u0000\u0000\u0000\u00a1"+
		"$\u0001\u0000\u0000\u0000\u00a2\u00a3\u0005s\u0000\u0000\u00a3\u00a4\u0005"+
		"e\u0000\u0000\u00a4\u00a5\u0005r\u0000\u0000\u00a5\u00a6\u0005a\u0000"+
		"\u0000\u00a6\u00a7\u0005s\u0000\u0000\u00a7\u00a8\u0005s\u0000\u0000\u00a8"+
		"\u00b0\u0005e\u0000\u0000\u00a9\u00aa\u0005n\u0000\u0000\u00aa\u00ab\u0005"+
		"e\u0000\u0000\u00ab\u00ac\u0005n\u0000\u0000\u00ac\u00ad\u0005a\u0000"+
		"\u0000\u00ad\u00ae\u0005d\u0000\u0000\u00ae\u00b0\u0005a\u0000\u0000\u00af"+
		"\u00a2\u0001\u0000\u0000\u0000\u00af\u00a9\u0001\u0000\u0000\u0000\u00b0"+
		"&\u0001\u0000\u0000\u0000\f\u0000Kcekqs}\u0084\u0089\u00a0\u00af\u0001"+
		"\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}