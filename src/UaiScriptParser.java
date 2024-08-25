// Generated from UaiScript.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class UaiScriptParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, TIPO=5, VOID=6, ATR=7, WHILE=8, DO=9, 
		FOR=10, IF=11, ELSE=12, RETORNO=13, OP_LOG=14, AP=15, FP=16, AC=17, FC=18, 
		STR=19, ID=20, NUM=21, OP_ARITM=22, COMP=23, WS=24, DELIM=25, VIRG=26;
	public static final int
		RULE_inicio = 0, RULE_funcoes = 1, RULE_main = 2, RULE_decl_func = 3, 
		RULE_decl_var = 4, RULE_atrib = 5, RULE_acao = 6, RULE_operacao = 7, RULE_operando = 8, 
		RULE_operando_cauda = 9, RULE_funcao = 10, RULE_condicao = 11, RULE_condicaoElse = 12, 
		RULE_laco = 13, RULE_expressao = 14, RULE_casting = 15;
	private static String[] makeRuleNames() {
		return new String[] {
			"inicio", "funcoes", "main", "decl_func", "decl_var", "atrib", "acao", 
			"operacao", "operando", "operando_cauda", "funcao", "condicao", "condicaoElse", 
			"laco", "expressao", "casting"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'input'", "'print'", "'++'", "'--'", null, "'nadanao'", "'bota'", 
			"'uai'", "'so'", "'pra'", "'serasse'", "'nenada'", "'vorta'", null, "'('", 
			"')'", "'{'", "'}'", null, null, null, null, null, null, "';'", "','"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, "TIPO", "VOID", "ATR", "WHILE", "DO", "FOR", 
			"IF", "ELSE", "RETORNO", "OP_LOG", "AP", "FP", "AC", "FC", "STR", "ID", 
			"NUM", "OP_ARITM", "COMP", "WS", "DELIM", "VIRG"
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
	public String getGrammarFileName() { return "UaiScript.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public UaiScriptParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class InicioContext extends ParserRuleContext {
		public MainContext main() {
			return getRuleContext(MainContext.class,0);
		}
		public TerminalNode EOF() { return getToken(UaiScriptParser.EOF, 0); }
		public List<FuncoesContext> funcoes() {
			return getRuleContexts(FuncoesContext.class);
		}
		public FuncoesContext funcoes(int i) {
			return getRuleContext(FuncoesContext.class,i);
		}
		public InicioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inicio; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UaiScriptListener ) ((UaiScriptListener)listener).enterInicio(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UaiScriptListener ) ((UaiScriptListener)listener).exitInicio(this);
		}
	}

	public final InicioContext inicio() throws RecognitionException {
		InicioContext _localctx = new InicioContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_inicio);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(35);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(32);
					funcoes();
					}
					} 
				}
				setState(37);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			setState(38);
			main();
			setState(39);
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
	public static class FuncoesContext extends ParserRuleContext {
		public Decl_funcContext decl_func() {
			return getRuleContext(Decl_funcContext.class,0);
		}
		public TerminalNode AP() { return getToken(UaiScriptParser.AP, 0); }
		public TerminalNode FP() { return getToken(UaiScriptParser.FP, 0); }
		public TerminalNode AC() { return getToken(UaiScriptParser.AC, 0); }
		public MainContext main() {
			return getRuleContext(MainContext.class,0);
		}
		public TerminalNode FC() { return getToken(UaiScriptParser.FC, 0); }
		public List<Decl_varContext> decl_var() {
			return getRuleContexts(Decl_varContext.class);
		}
		public Decl_varContext decl_var(int i) {
			return getRuleContext(Decl_varContext.class,i);
		}
		public TerminalNode RETORNO() { return getToken(UaiScriptParser.RETORNO, 0); }
		public OperacaoContext operacao() {
			return getRuleContext(OperacaoContext.class,0);
		}
		public TerminalNode DELIM() { return getToken(UaiScriptParser.DELIM, 0); }
		public List<TerminalNode> VIRG() { return getTokens(UaiScriptParser.VIRG); }
		public TerminalNode VIRG(int i) {
			return getToken(UaiScriptParser.VIRG, i);
		}
		public FuncoesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcoes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UaiScriptListener ) ((UaiScriptListener)listener).enterFuncoes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UaiScriptListener ) ((UaiScriptListener)listener).exitFuncoes(this);
		}
	}

	public final FuncoesContext funcoes() throws RecognitionException {
		FuncoesContext _localctx = new FuncoesContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_funcoes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(41);
			decl_func();
			setState(42);
			match(AP);
			setState(49);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TIPO) {
				{
				setState(47);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
				case 1:
					{
					{
					setState(43);
					decl_var();
					setState(44);
					match(VIRG);
					}
					}
					break;
				case 2:
					{
					setState(46);
					decl_var();
					}
					break;
				}
				}
				setState(51);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(52);
			match(FP);
			setState(53);
			match(AC);
			setState(54);
			main();
			setState(59);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RETORNO) {
				{
				setState(55);
				match(RETORNO);
				setState(56);
				operacao();
				setState(57);
				match(DELIM);
				}
			}

			setState(61);
			match(FC);
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
	public static class MainContext extends ParserRuleContext {
		public List<TerminalNode> DELIM() { return getTokens(UaiScriptParser.DELIM); }
		public TerminalNode DELIM(int i) {
			return getToken(UaiScriptParser.DELIM, i);
		}
		public List<CondicaoContext> condicao() {
			return getRuleContexts(CondicaoContext.class);
		}
		public CondicaoContext condicao(int i) {
			return getRuleContext(CondicaoContext.class,i);
		}
		public List<LacoContext> laco() {
			return getRuleContexts(LacoContext.class);
		}
		public LacoContext laco(int i) {
			return getRuleContext(LacoContext.class,i);
		}
		public List<AtribContext> atrib() {
			return getRuleContexts(AtribContext.class);
		}
		public AtribContext atrib(int i) {
			return getRuleContext(AtribContext.class,i);
		}
		public List<AcaoContext> acao() {
			return getRuleContexts(AcaoContext.class);
		}
		public AcaoContext acao(int i) {
			return getRuleContext(AcaoContext.class,i);
		}
		public List<FuncaoContext> funcao() {
			return getRuleContexts(FuncaoContext.class);
		}
		public FuncaoContext funcao(int i) {
			return getRuleContext(FuncaoContext.class,i);
		}
		public MainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_main; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UaiScriptListener ) ((UaiScriptListener)listener).enterMain(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UaiScriptListener ) ((UaiScriptListener)listener).exitMain(this);
		}
	}

	public final MainContext main() throws RecognitionException {
		MainContext _localctx = new MainContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_main);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(72); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(72);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__0:
				case T__1:
				case TIPO:
				case ID:
					{
					setState(66);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
					case 1:
						{
						setState(63);
						atrib();
						}
						break;
					case 2:
						{
						setState(64);
						acao();
						}
						break;
					case 3:
						{
						setState(65);
						funcao();
						}
						break;
					}
					setState(68);
					match(DELIM);
					}
					break;
				case IF:
					{
					setState(70);
					condicao();
					}
					break;
				case WHILE:
				case DO:
				case FOR:
					{
					setState(71);
					laco();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(74); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 1052454L) != 0) );
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
	public static class Decl_funcContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(UaiScriptParser.ID, 0); }
		public TerminalNode TIPO() { return getToken(UaiScriptParser.TIPO, 0); }
		public TerminalNode VOID() { return getToken(UaiScriptParser.VOID, 0); }
		public Decl_funcContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decl_func; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UaiScriptListener ) ((UaiScriptListener)listener).enterDecl_func(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UaiScriptListener ) ((UaiScriptListener)listener).exitDecl_func(this);
		}
	}

	public final Decl_funcContext decl_func() throws RecognitionException {
		Decl_funcContext _localctx = new Decl_funcContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_decl_func);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			_la = _input.LA(1);
			if ( !(_la==TIPO || _la==VOID) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(77);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Decl_varContext extends ParserRuleContext {
		public TerminalNode TIPO() { return getToken(UaiScriptParser.TIPO, 0); }
		public TerminalNode ID() { return getToken(UaiScriptParser.ID, 0); }
		public Decl_varContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decl_var; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UaiScriptListener ) ((UaiScriptListener)listener).enterDecl_var(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UaiScriptListener ) ((UaiScriptListener)listener).exitDecl_var(this);
		}
	}

	public final Decl_varContext decl_var() throws RecognitionException {
		Decl_varContext _localctx = new Decl_varContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_decl_var);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(79);
			match(TIPO);
			setState(80);
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

	@SuppressWarnings("CheckReturnValue")
	public static class AtribContext extends ParserRuleContext {
		public Decl_varContext decl_var() {
			return getRuleContext(Decl_varContext.class,0);
		}
		public TerminalNode ATR() { return getToken(UaiScriptParser.ATR, 0); }
		public CastingContext casting() {
			return getRuleContext(CastingContext.class,0);
		}
		public OperacaoContext operacao() {
			return getRuleContext(OperacaoContext.class,0);
		}
		public TerminalNode STR() { return getToken(UaiScriptParser.STR, 0); }
		public TerminalNode ID() { return getToken(UaiScriptParser.ID, 0); }
		public AtribContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atrib; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UaiScriptListener ) ((UaiScriptListener)listener).enterAtrib(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UaiScriptListener ) ((UaiScriptListener)listener).exitAtrib(this);
		}
	}

	public final AtribContext atrib() throws RecognitionException {
		AtribContext _localctx = new AtribContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_atrib);
		int _la;
		try {
			setState(98);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TIPO:
				enterOuterAlt(_localctx, 1);
				{
				setState(82);
				decl_var();
				setState(89);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ATR) {
					{
					setState(83);
					match(ATR);
					setState(87);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case TIPO:
						{
						setState(84);
						casting();
						}
						break;
					case ID:
					case NUM:
						{
						setState(85);
						operacao();
						}
						break;
					case STR:
						{
						setState(86);
						match(STR);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
				}

				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(91);
				match(ID);
				setState(92);
				match(ATR);
				setState(96);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case TIPO:
					{
					setState(93);
					casting();
					}
					break;
				case STR:
					{
					setState(94);
					match(STR);
					}
					break;
				case ID:
				case NUM:
					{
					setState(95);
					operacao();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
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
	public static class AcaoContext extends ParserRuleContext {
		public TerminalNode AP() { return getToken(UaiScriptParser.AP, 0); }
		public TerminalNode FP() { return getToken(UaiScriptParser.FP, 0); }
		public TerminalNode STR() { return getToken(UaiScriptParser.STR, 0); }
		public OperacaoContext operacao() {
			return getRuleContext(OperacaoContext.class,0);
		}
		public AcaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_acao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UaiScriptListener ) ((UaiScriptListener)listener).enterAcao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UaiScriptListener ) ((UaiScriptListener)listener).exitAcao(this);
		}
	}

	public final AcaoContext acao() throws RecognitionException {
		AcaoContext _localctx = new AcaoContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_acao);
		int _la;
		try {
			setState(111);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				enterOuterAlt(_localctx, 1);
				{
				setState(100);
				match(T__0);
				setState(101);
				match(AP);
				setState(103);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==STR) {
					{
					setState(102);
					match(STR);
					}
				}

				setState(105);
				match(FP);
				}
				break;
			case T__1:
				enterOuterAlt(_localctx, 2);
				{
				setState(106);
				match(T__1);
				setState(107);
				match(AP);
				setState(108);
				operacao();
				setState(109);
				match(FP);
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
	public static class OperacaoContext extends ParserRuleContext {
		public OperandoContext operando() {
			return getRuleContext(OperandoContext.class,0);
		}
		public Operando_caudaContext operando_cauda() {
			return getRuleContext(Operando_caudaContext.class,0);
		}
		public OperacaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operacao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UaiScriptListener ) ((UaiScriptListener)listener).enterOperacao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UaiScriptListener ) ((UaiScriptListener)listener).exitOperacao(this);
		}
	}

	public final OperacaoContext operacao() throws RecognitionException {
		OperacaoContext _localctx = new OperacaoContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_operacao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(113);
			operando();
			setState(115);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OP_ARITM) {
				{
				setState(114);
				operando_cauda();
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

	@SuppressWarnings("CheckReturnValue")
	public static class OperandoContext extends ParserRuleContext {
		public TerminalNode NUM() { return getToken(UaiScriptParser.NUM, 0); }
		public TerminalNode ID() { return getToken(UaiScriptParser.ID, 0); }
		public OperandoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operando; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UaiScriptListener ) ((UaiScriptListener)listener).enterOperando(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UaiScriptListener ) ((UaiScriptListener)listener).exitOperando(this);
		}
	}

	public final OperandoContext operando() throws RecognitionException {
		OperandoContext _localctx = new OperandoContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_operando);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(117);
			_la = _input.LA(1);
			if ( !(_la==ID || _la==NUM) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class Operando_caudaContext extends ParserRuleContext {
		public TerminalNode OP_ARITM() { return getToken(UaiScriptParser.OP_ARITM, 0); }
		public OperandoContext operando() {
			return getRuleContext(OperandoContext.class,0);
		}
		public List<Operando_caudaContext> operando_cauda() {
			return getRuleContexts(Operando_caudaContext.class);
		}
		public Operando_caudaContext operando_cauda(int i) {
			return getRuleContext(Operando_caudaContext.class,i);
		}
		public Operando_caudaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operando_cauda; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UaiScriptListener ) ((UaiScriptListener)listener).enterOperando_cauda(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UaiScriptListener ) ((UaiScriptListener)listener).exitOperando_cauda(this);
		}
	}

	public final Operando_caudaContext operando_cauda() throws RecognitionException {
		Operando_caudaContext _localctx = new Operando_caudaContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_operando_cauda);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			match(OP_ARITM);
			setState(120);
			operando();
			setState(124);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(121);
					operando_cauda();
					}
					} 
				}
				setState(126);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
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
	public static class FuncaoContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(UaiScriptParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(UaiScriptParser.ID, i);
		}
		public TerminalNode AP() { return getToken(UaiScriptParser.AP, 0); }
		public TerminalNode FP() { return getToken(UaiScriptParser.FP, 0); }
		public TerminalNode ATR() { return getToken(UaiScriptParser.ATR, 0); }
		public List<OperacaoContext> operacao() {
			return getRuleContexts(OperacaoContext.class);
		}
		public OperacaoContext operacao(int i) {
			return getRuleContext(OperacaoContext.class,i);
		}
		public Decl_varContext decl_var() {
			return getRuleContext(Decl_varContext.class,0);
		}
		public List<TerminalNode> VIRG() { return getTokens(UaiScriptParser.VIRG); }
		public TerminalNode VIRG(int i) {
			return getToken(UaiScriptParser.VIRG, i);
		}
		public FuncaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UaiScriptListener ) ((UaiScriptListener)listener).enterFuncao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UaiScriptListener ) ((UaiScriptListener)listener).exitFuncao(this);
		}
	}

	public final FuncaoContext funcao() throws RecognitionException {
		FuncaoContext _localctx = new FuncaoContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_funcao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(132);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				{
				setState(129);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case TIPO:
					{
					setState(127);
					decl_var();
					}
					break;
				case ID:
					{
					setState(128);
					match(ID);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(131);
				match(ATR);
				}
				break;
			}
			setState(134);
			match(ID);
			setState(135);
			match(AP);
			setState(142);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID || _la==NUM) {
				{
				setState(140);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
				case 1:
					{
					{
					setState(136);
					operacao();
					setState(137);
					match(VIRG);
					}
					}
					break;
				case 2:
					{
					setState(139);
					operacao();
					}
					break;
				}
				}
				setState(144);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(145);
			match(FP);
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
	public static class CondicaoContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(UaiScriptParser.IF, 0); }
		public TerminalNode AP() { return getToken(UaiScriptParser.AP, 0); }
		public TerminalNode FP() { return getToken(UaiScriptParser.FP, 0); }
		public TerminalNode AC() { return getToken(UaiScriptParser.AC, 0); }
		public MainContext main() {
			return getRuleContext(MainContext.class,0);
		}
		public TerminalNode FC() { return getToken(UaiScriptParser.FC, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public CondicaoElseContext condicaoElse() {
			return getRuleContext(CondicaoElseContext.class,0);
		}
		public CondicaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condicao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UaiScriptListener ) ((UaiScriptListener)listener).enterCondicao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UaiScriptListener ) ((UaiScriptListener)listener).exitCondicao(this);
		}
	}

	public final CondicaoContext condicao() throws RecognitionException {
		CondicaoContext _localctx = new CondicaoContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_condicao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(147);
			match(IF);
			setState(148);
			match(AP);
			{
			setState(149);
			expressao();
			}
			setState(150);
			match(FP);
			setState(151);
			match(AC);
			setState(152);
			main();
			setState(153);
			match(FC);
			setState(155);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(154);
				condicaoElse();
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

	@SuppressWarnings("CheckReturnValue")
	public static class CondicaoElseContext extends ParserRuleContext {
		public TerminalNode ELSE() { return getToken(UaiScriptParser.ELSE, 0); }
		public TerminalNode AC() { return getToken(UaiScriptParser.AC, 0); }
		public MainContext main() {
			return getRuleContext(MainContext.class,0);
		}
		public TerminalNode FC() { return getToken(UaiScriptParser.FC, 0); }
		public CondicaoContext condicao() {
			return getRuleContext(CondicaoContext.class,0);
		}
		public CondicaoElseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condicaoElse; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UaiScriptListener ) ((UaiScriptListener)listener).enterCondicaoElse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UaiScriptListener ) ((UaiScriptListener)listener).exitCondicaoElse(this);
		}
	}

	public final CondicaoElseContext condicaoElse() throws RecognitionException {
		CondicaoElseContext _localctx = new CondicaoElseContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_condicaoElse);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(157);
			match(ELSE);
			setState(163);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AC:
				{
				setState(158);
				match(AC);
				setState(159);
				main();
				setState(160);
				match(FC);
				}
				break;
			case IF:
				{
				setState(162);
				condicao();
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

	@SuppressWarnings("CheckReturnValue")
	public static class LacoContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(UaiScriptParser.WHILE, 0); }
		public TerminalNode AC() { return getToken(UaiScriptParser.AC, 0); }
		public MainContext main() {
			return getRuleContext(MainContext.class,0);
		}
		public TerminalNode FC() { return getToken(UaiScriptParser.FC, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public TerminalNode DO() { return getToken(UaiScriptParser.DO, 0); }
		public TerminalNode AP() { return getToken(UaiScriptParser.AP, 0); }
		public TerminalNode FP() { return getToken(UaiScriptParser.FP, 0); }
		public List<TerminalNode> DELIM() { return getTokens(UaiScriptParser.DELIM); }
		public TerminalNode DELIM(int i) {
			return getToken(UaiScriptParser.DELIM, i);
		}
		public TerminalNode FOR() { return getToken(UaiScriptParser.FOR, 0); }
		public AtribContext atrib() {
			return getRuleContext(AtribContext.class,0);
		}
		public List<TerminalNode> ID() { return getTokens(UaiScriptParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(UaiScriptParser.ID, i);
		}
		public TerminalNode COMP() { return getToken(UaiScriptParser.COMP, 0); }
		public OperandoContext operando() {
			return getRuleContext(OperandoContext.class,0);
		}
		public LacoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_laco; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UaiScriptListener ) ((UaiScriptListener)listener).enterLaco(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UaiScriptListener ) ((UaiScriptListener)listener).exitLaco(this);
		}
	}

	public final LacoContext laco() throws RecognitionException {
		LacoContext _localctx = new LacoContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_laco);
		int _la;
		try {
			setState(197);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case WHILE:
				enterOuterAlt(_localctx, 1);
				{
				setState(165);
				match(WHILE);
				{
				setState(166);
				expressao();
				}
				setState(167);
				match(AC);
				setState(168);
				main();
				setState(169);
				match(FC);
				}
				break;
			case DO:
				enterOuterAlt(_localctx, 2);
				{
				setState(171);
				match(DO);
				setState(172);
				match(AC);
				setState(173);
				main();
				setState(174);
				match(FC);
				setState(175);
				match(WHILE);
				setState(176);
				match(AP);
				{
				setState(177);
				expressao();
				}
				setState(178);
				match(FP);
				setState(179);
				match(DELIM);
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 3);
				{
				setState(181);
				match(FOR);
				setState(182);
				match(AP);
				{
				setState(183);
				atrib();
				setState(184);
				match(DELIM);
				setState(185);
				match(ID);
				setState(186);
				match(COMP);
				setState(187);
				operando();
				setState(188);
				match(DELIM);
				setState(189);
				match(ID);
				setState(190);
				_la = _input.LA(1);
				if ( !(_la==T__2 || _la==T__3) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				setState(192);
				match(FP);
				setState(193);
				match(AC);
				setState(194);
				main();
				setState(195);
				match(FC);
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
	public static class ExpressaoContext extends ParserRuleContext {
		public OperacaoContext operacao() {
			return getRuleContext(OperacaoContext.class,0);
		}
		public TerminalNode COMP() { return getToken(UaiScriptParser.COMP, 0); }
		public TerminalNode NUM() { return getToken(UaiScriptParser.NUM, 0); }
		public TerminalNode ID() { return getToken(UaiScriptParser.ID, 0); }
		public FuncaoContext funcao() {
			return getRuleContext(FuncaoContext.class,0);
		}
		public List<TerminalNode> OP_LOG() { return getTokens(UaiScriptParser.OP_LOG); }
		public TerminalNode OP_LOG(int i) {
			return getToken(UaiScriptParser.OP_LOG, i);
		}
		public List<ExpressaoContext> expressao() {
			return getRuleContexts(ExpressaoContext.class);
		}
		public ExpressaoContext expressao(int i) {
			return getRuleContext(ExpressaoContext.class,i);
		}
		public ExpressaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UaiScriptListener ) ((UaiScriptListener)listener).enterExpressao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UaiScriptListener ) ((UaiScriptListener)listener).exitExpressao(this);
		}
	}

	public final ExpressaoContext expressao() throws RecognitionException {
		ExpressaoContext _localctx = new ExpressaoContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_expressao);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(199);
			operacao();
			setState(200);
			match(COMP);
			setState(204);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				{
				setState(201);
				match(NUM);
				}
				break;
			case 2:
				{
				setState(202);
				match(ID);
				}
				break;
			case 3:
				{
				setState(203);
				funcao();
				}
				break;
			}
			setState(210);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(206);
					match(OP_LOG);
					setState(207);
					expressao();
					}
					} 
				}
				setState(212);
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
	public static class CastingContext extends ParserRuleContext {
		public TerminalNode TIPO() { return getToken(UaiScriptParser.TIPO, 0); }
		public TerminalNode AP() { return getToken(UaiScriptParser.AP, 0); }
		public TerminalNode FP() { return getToken(UaiScriptParser.FP, 0); }
		public OperacaoContext operacao() {
			return getRuleContext(OperacaoContext.class,0);
		}
		public AcaoContext acao() {
			return getRuleContext(AcaoContext.class,0);
		}
		public CastingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_casting; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UaiScriptListener ) ((UaiScriptListener)listener).enterCasting(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UaiScriptListener ) ((UaiScriptListener)listener).exitCasting(this);
		}
	}

	public final CastingContext casting() throws RecognitionException {
		CastingContext _localctx = new CastingContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_casting);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(213);
			match(TIPO);
			setState(214);
			match(AP);
			setState(217);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
			case NUM:
				{
				setState(215);
				operacao();
				}
				break;
			case T__0:
			case T__1:
				{
				setState(216);
				acao();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(219);
			match(FP);
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
		"\u0004\u0001\u001a\u00de\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007"+
		"\u000f\u0001\u0000\u0005\u0000\"\b\u0000\n\u0000\f\u0000%\t\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0005\u00010\b\u0001\n\u0001\f\u00013\t"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0003\u0001<\b\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0003\u0002C\b\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0004\u0002I\b\u0002\u000b\u0002\f\u0002"+
		"J\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005"+
		"X\b\u0005\u0003\u0005Z\b\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0003\u0005a\b\u0005\u0003\u0005c\b\u0005\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0003\u0006h\b\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006p\b\u0006"+
		"\u0001\u0007\u0001\u0007\u0003\u0007t\b\u0007\u0001\b\u0001\b\u0001\t"+
		"\u0001\t\u0001\t\u0005\t{\b\t\n\t\f\t~\t\t\u0001\n\u0001\n\u0003\n\u0082"+
		"\b\n\u0001\n\u0003\n\u0085\b\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n"+
		"\u0001\n\u0005\n\u008d\b\n\n\n\f\n\u0090\t\n\u0001\n\u0001\n\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0003\u000b\u009c\b\u000b\u0001\f\u0001\f\u0001\f\u0001\f"+
		"\u0001\f\u0001\f\u0003\f\u00a4\b\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0003\r\u00c6\b\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0003\u000e\u00cd\b\u000e\u0001\u000e\u0001\u000e\u0005\u000e\u00d1"+
		"\b\u000e\n\u000e\f\u000e\u00d4\t\u000e\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0003\u000f\u00da\b\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0000\u0000\u0010\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014"+
		"\u0016\u0018\u001a\u001c\u001e\u0000\u0003\u0001\u0000\u0005\u0006\u0001"+
		"\u0000\u0014\u0015\u0001\u0000\u0003\u0004\u00ec\u0000#\u0001\u0000\u0000"+
		"\u0000\u0002)\u0001\u0000\u0000\u0000\u0004H\u0001\u0000\u0000\u0000\u0006"+
		"L\u0001\u0000\u0000\u0000\bO\u0001\u0000\u0000\u0000\nb\u0001\u0000\u0000"+
		"\u0000\fo\u0001\u0000\u0000\u0000\u000eq\u0001\u0000\u0000\u0000\u0010"+
		"u\u0001\u0000\u0000\u0000\u0012w\u0001\u0000\u0000\u0000\u0014\u0084\u0001"+
		"\u0000\u0000\u0000\u0016\u0093\u0001\u0000\u0000\u0000\u0018\u009d\u0001"+
		"\u0000\u0000\u0000\u001a\u00c5\u0001\u0000\u0000\u0000\u001c\u00c7\u0001"+
		"\u0000\u0000\u0000\u001e\u00d5\u0001\u0000\u0000\u0000 \"\u0003\u0002"+
		"\u0001\u0000! \u0001\u0000\u0000\u0000\"%\u0001\u0000\u0000\u0000#!\u0001"+
		"\u0000\u0000\u0000#$\u0001\u0000\u0000\u0000$&\u0001\u0000\u0000\u0000"+
		"%#\u0001\u0000\u0000\u0000&\'\u0003\u0004\u0002\u0000\'(\u0005\u0000\u0000"+
		"\u0001(\u0001\u0001\u0000\u0000\u0000)*\u0003\u0006\u0003\u0000*1\u0005"+
		"\u000f\u0000\u0000+,\u0003\b\u0004\u0000,-\u0005\u001a\u0000\u0000-0\u0001"+
		"\u0000\u0000\u0000.0\u0003\b\u0004\u0000/+\u0001\u0000\u0000\u0000/.\u0001"+
		"\u0000\u0000\u000003\u0001\u0000\u0000\u00001/\u0001\u0000\u0000\u0000"+
		"12\u0001\u0000\u0000\u000024\u0001\u0000\u0000\u000031\u0001\u0000\u0000"+
		"\u000045\u0005\u0010\u0000\u000056\u0005\u0011\u0000\u00006;\u0003\u0004"+
		"\u0002\u000078\u0005\r\u0000\u000089\u0003\u000e\u0007\u00009:\u0005\u0019"+
		"\u0000\u0000:<\u0001\u0000\u0000\u0000;7\u0001\u0000\u0000\u0000;<\u0001"+
		"\u0000\u0000\u0000<=\u0001\u0000\u0000\u0000=>\u0005\u0012\u0000\u0000"+
		">\u0003\u0001\u0000\u0000\u0000?C\u0003\n\u0005\u0000@C\u0003\f\u0006"+
		"\u0000AC\u0003\u0014\n\u0000B?\u0001\u0000\u0000\u0000B@\u0001\u0000\u0000"+
		"\u0000BA\u0001\u0000\u0000\u0000CD\u0001\u0000\u0000\u0000DE\u0005\u0019"+
		"\u0000\u0000EI\u0001\u0000\u0000\u0000FI\u0003\u0016\u000b\u0000GI\u0003"+
		"\u001a\r\u0000HB\u0001\u0000\u0000\u0000HF\u0001\u0000\u0000\u0000HG\u0001"+
		"\u0000\u0000\u0000IJ\u0001\u0000\u0000\u0000JH\u0001\u0000\u0000\u0000"+
		"JK\u0001\u0000\u0000\u0000K\u0005\u0001\u0000\u0000\u0000LM\u0007\u0000"+
		"\u0000\u0000MN\u0005\u0014\u0000\u0000N\u0007\u0001\u0000\u0000\u0000"+
		"OP\u0005\u0005\u0000\u0000PQ\u0005\u0014\u0000\u0000Q\t\u0001\u0000\u0000"+
		"\u0000RY\u0003\b\u0004\u0000SW\u0005\u0007\u0000\u0000TX\u0003\u001e\u000f"+
		"\u0000UX\u0003\u000e\u0007\u0000VX\u0005\u0013\u0000\u0000WT\u0001\u0000"+
		"\u0000\u0000WU\u0001\u0000\u0000\u0000WV\u0001\u0000\u0000\u0000XZ\u0001"+
		"\u0000\u0000\u0000YS\u0001\u0000\u0000\u0000YZ\u0001\u0000\u0000\u0000"+
		"Zc\u0001\u0000\u0000\u0000[\\\u0005\u0014\u0000\u0000\\`\u0005\u0007\u0000"+
		"\u0000]a\u0003\u001e\u000f\u0000^a\u0005\u0013\u0000\u0000_a\u0003\u000e"+
		"\u0007\u0000`]\u0001\u0000\u0000\u0000`^\u0001\u0000\u0000\u0000`_\u0001"+
		"\u0000\u0000\u0000ac\u0001\u0000\u0000\u0000bR\u0001\u0000\u0000\u0000"+
		"b[\u0001\u0000\u0000\u0000c\u000b\u0001\u0000\u0000\u0000de\u0005\u0001"+
		"\u0000\u0000eg\u0005\u000f\u0000\u0000fh\u0005\u0013\u0000\u0000gf\u0001"+
		"\u0000\u0000\u0000gh\u0001\u0000\u0000\u0000hi\u0001\u0000\u0000\u0000"+
		"ip\u0005\u0010\u0000\u0000jk\u0005\u0002\u0000\u0000kl\u0005\u000f\u0000"+
		"\u0000lm\u0003\u000e\u0007\u0000mn\u0005\u0010\u0000\u0000np\u0001\u0000"+
		"\u0000\u0000od\u0001\u0000\u0000\u0000oj\u0001\u0000\u0000\u0000p\r\u0001"+
		"\u0000\u0000\u0000qs\u0003\u0010\b\u0000rt\u0003\u0012\t\u0000sr\u0001"+
		"\u0000\u0000\u0000st\u0001\u0000\u0000\u0000t\u000f\u0001\u0000\u0000"+
		"\u0000uv\u0007\u0001\u0000\u0000v\u0011\u0001\u0000\u0000\u0000wx\u0005"+
		"\u0016\u0000\u0000x|\u0003\u0010\b\u0000y{\u0003\u0012\t\u0000zy\u0001"+
		"\u0000\u0000\u0000{~\u0001\u0000\u0000\u0000|z\u0001\u0000\u0000\u0000"+
		"|}\u0001\u0000\u0000\u0000}\u0013\u0001\u0000\u0000\u0000~|\u0001\u0000"+
		"\u0000\u0000\u007f\u0082\u0003\b\u0004\u0000\u0080\u0082\u0005\u0014\u0000"+
		"\u0000\u0081\u007f\u0001\u0000\u0000\u0000\u0081\u0080\u0001\u0000\u0000"+
		"\u0000\u0082\u0083\u0001\u0000\u0000\u0000\u0083\u0085\u0005\u0007\u0000"+
		"\u0000\u0084\u0081\u0001\u0000\u0000\u0000\u0084\u0085\u0001\u0000\u0000"+
		"\u0000\u0085\u0086\u0001\u0000\u0000\u0000\u0086\u0087\u0005\u0014\u0000"+
		"\u0000\u0087\u008e\u0005\u000f\u0000\u0000\u0088\u0089\u0003\u000e\u0007"+
		"\u0000\u0089\u008a\u0005\u001a\u0000\u0000\u008a\u008d\u0001\u0000\u0000"+
		"\u0000\u008b\u008d\u0003\u000e\u0007\u0000\u008c\u0088\u0001\u0000\u0000"+
		"\u0000\u008c\u008b\u0001\u0000\u0000\u0000\u008d\u0090\u0001\u0000\u0000"+
		"\u0000\u008e\u008c\u0001\u0000\u0000\u0000\u008e\u008f\u0001\u0000\u0000"+
		"\u0000\u008f\u0091\u0001\u0000\u0000\u0000\u0090\u008e\u0001\u0000\u0000"+
		"\u0000\u0091\u0092\u0005\u0010\u0000\u0000\u0092\u0015\u0001\u0000\u0000"+
		"\u0000\u0093\u0094\u0005\u000b\u0000\u0000\u0094\u0095\u0005\u000f\u0000"+
		"\u0000\u0095\u0096\u0003\u001c\u000e\u0000\u0096\u0097\u0005\u0010\u0000"+
		"\u0000\u0097\u0098\u0005\u0011\u0000\u0000\u0098\u0099\u0003\u0004\u0002"+
		"\u0000\u0099\u009b\u0005\u0012\u0000\u0000\u009a\u009c\u0003\u0018\f\u0000"+
		"\u009b\u009a\u0001\u0000\u0000\u0000\u009b\u009c\u0001\u0000\u0000\u0000"+
		"\u009c\u0017\u0001\u0000\u0000\u0000\u009d\u00a3\u0005\f\u0000\u0000\u009e"+
		"\u009f\u0005\u0011\u0000\u0000\u009f\u00a0\u0003\u0004\u0002\u0000\u00a0"+
		"\u00a1\u0005\u0012\u0000\u0000\u00a1\u00a4\u0001\u0000\u0000\u0000\u00a2"+
		"\u00a4\u0003\u0016\u000b\u0000\u00a3\u009e\u0001\u0000\u0000\u0000\u00a3"+
		"\u00a2\u0001\u0000\u0000\u0000\u00a4\u0019\u0001\u0000\u0000\u0000\u00a5"+
		"\u00a6\u0005\b\u0000\u0000\u00a6\u00a7\u0003\u001c\u000e\u0000\u00a7\u00a8"+
		"\u0005\u0011\u0000\u0000\u00a8\u00a9\u0003\u0004\u0002\u0000\u00a9\u00aa"+
		"\u0005\u0012\u0000\u0000\u00aa\u00c6\u0001\u0000\u0000\u0000\u00ab\u00ac"+
		"\u0005\t\u0000\u0000\u00ac\u00ad\u0005\u0011\u0000\u0000\u00ad\u00ae\u0003"+
		"\u0004\u0002\u0000\u00ae\u00af\u0005\u0012\u0000\u0000\u00af\u00b0\u0005"+
		"\b\u0000\u0000\u00b0\u00b1\u0005\u000f\u0000\u0000\u00b1\u00b2\u0003\u001c"+
		"\u000e\u0000\u00b2\u00b3\u0005\u0010\u0000\u0000\u00b3\u00b4\u0005\u0019"+
		"\u0000\u0000\u00b4\u00c6\u0001\u0000\u0000\u0000\u00b5\u00b6\u0005\n\u0000"+
		"\u0000\u00b6\u00b7\u0005\u000f\u0000\u0000\u00b7\u00b8\u0003\n\u0005\u0000"+
		"\u00b8\u00b9\u0005\u0019\u0000\u0000\u00b9\u00ba\u0005\u0014\u0000\u0000"+
		"\u00ba\u00bb\u0005\u0017\u0000\u0000\u00bb\u00bc\u0003\u0010\b\u0000\u00bc"+
		"\u00bd\u0005\u0019\u0000\u0000\u00bd\u00be\u0005\u0014\u0000\u0000\u00be"+
		"\u00bf\u0007\u0002\u0000\u0000\u00bf\u00c0\u0001\u0000\u0000\u0000\u00c0"+
		"\u00c1\u0005\u0010\u0000\u0000\u00c1\u00c2\u0005\u0011\u0000\u0000\u00c2"+
		"\u00c3\u0003\u0004\u0002\u0000\u00c3\u00c4\u0005\u0012\u0000\u0000\u00c4"+
		"\u00c6\u0001\u0000\u0000\u0000\u00c5\u00a5\u0001\u0000\u0000\u0000\u00c5"+
		"\u00ab\u0001\u0000\u0000\u0000\u00c5\u00b5\u0001\u0000\u0000\u0000\u00c6"+
		"\u001b\u0001\u0000\u0000\u0000\u00c7\u00c8\u0003\u000e\u0007\u0000\u00c8"+
		"\u00cc\u0005\u0017\u0000\u0000\u00c9\u00cd\u0005\u0015\u0000\u0000\u00ca"+
		"\u00cd\u0005\u0014\u0000\u0000\u00cb\u00cd\u0003\u0014\n\u0000\u00cc\u00c9"+
		"\u0001\u0000\u0000\u0000\u00cc\u00ca\u0001\u0000\u0000\u0000\u00cc\u00cb"+
		"\u0001\u0000\u0000\u0000\u00cd\u00d2\u0001\u0000\u0000\u0000\u00ce\u00cf"+
		"\u0005\u000e\u0000\u0000\u00cf\u00d1\u0003\u001c\u000e\u0000\u00d0\u00ce"+
		"\u0001\u0000\u0000\u0000\u00d1\u00d4\u0001\u0000\u0000\u0000\u00d2\u00d0"+
		"\u0001\u0000\u0000\u0000\u00d2\u00d3\u0001\u0000\u0000\u0000\u00d3\u001d"+
		"\u0001\u0000\u0000\u0000\u00d4\u00d2\u0001\u0000\u0000\u0000\u00d5\u00d6"+
		"\u0005\u0005\u0000\u0000\u00d6\u00d9\u0005\u000f\u0000\u0000\u00d7\u00da"+
		"\u0003\u000e\u0007\u0000\u00d8\u00da\u0003\f\u0006\u0000\u00d9\u00d7\u0001"+
		"\u0000\u0000\u0000\u00d9\u00d8\u0001\u0000\u0000\u0000\u00da\u00db\u0001"+
		"\u0000\u0000\u0000\u00db\u00dc\u0005\u0010\u0000\u0000\u00dc\u001f\u0001"+
		"\u0000\u0000\u0000\u0019#/1;BHJWY`bgos|\u0081\u0084\u008c\u008e\u009b"+
		"\u00a3\u00c5\u00cc\u00d2\u00d9";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}