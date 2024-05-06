// Generated from java-escape by ANTLR 4.11.1
package br.ufscar.dc.compiladores.alguma.sintatico;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class AlgumaParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.11.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, T__40=41, TIPO_VAR=42, NUMINT=43, NUMREAL=44, CADEIA=45, 
		VARIAVEL=46, OP_ARIT1=47, OP_ARIT2=48, OP_ARIT3=49, OP_REL=50, ERRO_COMENTARIO=51, 
		COMENTARIO=52, WS=53, CADEIA_NAO_FECHADA=54, COMENTARIO_NAO_FECHADO=55, 
		ABRE_PAR=56, FECHA_PAR=57, ABRE_COL=58, FECHA_COL=59, ERRO=60;
	public static final int
		RULE_var_personalizada = 0, RULE_var_registro = 1, RULE_ponteiro = 2, 
		RULE_endereco = 3, RULE_op_bool = 4, RULE_programa = 5, RULE_listaComandos = 6, 
		RULE_comando = 7, RULE_comandoAtribuicao = 8, RULE_declaracao = 9, RULE_declaracao_tipo = 10, 
		RULE_declaracao_registro = 11, RULE_declaracao_constante = 12, RULE_expressaoAritmetica = 13, 
		RULE_fatorAritmetico = 14, RULE_expressaoRelacional = 15, RULE_termoRelacional = 16, 
		RULE_entrada = 17, RULE_comandoEntrada = 18, RULE_saida = 19, RULE_comandoSaida = 20, 
		RULE_comandoCondicao = 21, RULE_intervalo = 22, RULE_comandoCaso = 23, 
		RULE_comandoEnquanto = 24, RULE_comandoFaca = 25, RULE_comandoPara = 26, 
		RULE_subAlgoritmo = 27, RULE_parametros_chamada_funcao = 28, RULE_chamada_funcao = 29, 
		RULE_parametros_declaracao_funcao = 30, RULE_declaracao_funcao = 31, RULE_retorno_funcao = 32, 
		RULE_procedimento = 33;
	private static String[] makeRuleNames() {
		return new String[] {
			"var_personalizada", "var_registro", "ponteiro", "endereco", "op_bool", 
			"programa", "listaComandos", "comando", "comandoAtribuicao", "declaracao", 
			"declaracao_tipo", "declaracao_registro", "declaracao_constante", "expressaoAritmetica", 
			"fatorAritmetico", "expressaoRelacional", "termoRelacional", "entrada", 
			"comandoEntrada", "saida", "comandoSaida", "comandoCondicao", "intervalo", 
			"comandoCaso", "comandoEnquanto", "comandoFaca", "comandoPara", "subAlgoritmo", 
			"parametros_chamada_funcao", "chamada_funcao", "parametros_declaracao_funcao", 
			"declaracao_funcao", "retorno_funcao", "procedimento"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'.'", "'^'", "'&'", "'e'", "'ou'", "'algoritmo'", "'fim_algoritmo'", 
			"'<-'", "'declare'", "','", "':'", "'tipo'", "'registro'", "'fim_registro'", 
			"'constante'", "'='", "'nao'", "'leia'", "'escreva'", "'se'", "'entao'", 
			"'fim_se'", "'senao'", "'..'", "'caso'", "'seja'", "'fim_caso'", "'enquanto'", 
			"'faca'", "'fim_enquanto'", "'ate'", "'para'", "'fim_para'", "'INICIO'", 
			"'FIM'", "'funcao'", "'fim_funcao'", "'retorne'", "'procedimento'", "'var'", 
			"'fim_procedimento'", null, null, null, null, null, null, null, "'%'", 
			null, null, null, null, null, null, "'('", "')'", "'['", "']'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, "TIPO_VAR", "NUMINT", "NUMREAL", 
			"CADEIA", "VARIAVEL", "OP_ARIT1", "OP_ARIT2", "OP_ARIT3", "OP_REL", "ERRO_COMENTARIO", 
			"COMENTARIO", "WS", "CADEIA_NAO_FECHADA", "COMENTARIO_NAO_FECHADO", "ABRE_PAR", 
			"FECHA_PAR", "ABRE_COL", "FECHA_COL", "ERRO"
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
	public String getGrammarFileName() { return "java-escape"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public AlgumaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Var_personalizadaContext extends ParserRuleContext {
		public TerminalNode VARIAVEL() { return getToken(AlgumaParser.VARIAVEL, 0); }
		public Var_personalizadaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_personalizada; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).enterVar_personalizada(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).exitVar_personalizada(this);
		}
	}

	public final Var_personalizadaContext var_personalizada() throws RecognitionException {
		Var_personalizadaContext _localctx = new Var_personalizadaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_var_personalizada);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(68);
			match(VARIAVEL);
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
	public static class Var_registroContext extends ParserRuleContext {
		public List<TerminalNode> VARIAVEL() { return getTokens(AlgumaParser.VARIAVEL); }
		public TerminalNode VARIAVEL(int i) {
			return getToken(AlgumaParser.VARIAVEL, i);
		}
		public Var_registroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_registro; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).enterVar_registro(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).exitVar_registro(this);
		}
	}

	public final Var_registroContext var_registro() throws RecognitionException {
		Var_registroContext _localctx = new Var_registroContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_var_registro);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(70);
			match(VARIAVEL);
			setState(71);
			match(T__0);
			setState(72);
			match(VARIAVEL);
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
	public static class PonteiroContext extends ParserRuleContext {
		public PonteiroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ponteiro; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).enterPonteiro(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).exitPonteiro(this);
		}
	}

	public final PonteiroContext ponteiro() throws RecognitionException {
		PonteiroContext _localctx = new PonteiroContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_ponteiro);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(74);
			match(T__1);
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
	public static class EnderecoContext extends ParserRuleContext {
		public EnderecoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_endereco; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).enterEndereco(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).exitEndereco(this);
		}
	}

	public final EnderecoContext endereco() throws RecognitionException {
		EnderecoContext _localctx = new EnderecoContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_endereco);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			match(T__2);
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
	public static class Op_boolContext extends ParserRuleContext {
		public Op_boolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_bool; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).enterOp_bool(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).exitOp_bool(this);
		}
	}

	public final Op_boolContext op_bool() throws RecognitionException {
		Op_boolContext _localctx = new Op_boolContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_op_bool);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
			_la = _input.LA(1);
			if ( !(_la==T__3 || _la==T__4) ) {
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
	public static class ProgramaContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(AlgumaParser.EOF, 0); }
		public List<Declaracao_constanteContext> declaracao_constante() {
			return getRuleContexts(Declaracao_constanteContext.class);
		}
		public Declaracao_constanteContext declaracao_constante(int i) {
			return getRuleContext(Declaracao_constanteContext.class,i);
		}
		public List<Declaracao_tipoContext> declaracao_tipo() {
			return getRuleContexts(Declaracao_tipoContext.class);
		}
		public Declaracao_tipoContext declaracao_tipo(int i) {
			return getRuleContext(Declaracao_tipoContext.class,i);
		}
		public List<DeclaracaoContext> declaracao() {
			return getRuleContexts(DeclaracaoContext.class);
		}
		public DeclaracaoContext declaracao(int i) {
			return getRuleContext(DeclaracaoContext.class,i);
		}
		public List<ProcedimentoContext> procedimento() {
			return getRuleContexts(ProcedimentoContext.class);
		}
		public ProcedimentoContext procedimento(int i) {
			return getRuleContext(ProcedimentoContext.class,i);
		}
		public List<Declaracao_funcaoContext> declaracao_funcao() {
			return getRuleContexts(Declaracao_funcaoContext.class);
		}
		public Declaracao_funcaoContext declaracao_funcao(int i) {
			return getRuleContext(Declaracao_funcaoContext.class,i);
		}
		public ListaComandosContext listaComandos() {
			return getRuleContext(ListaComandosContext.class,0);
		}
		public ProgramaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programa; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).enterPrograma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).exitPrograma(this);
		}
	}

	public final ProgramaContext programa() throws RecognitionException {
		ProgramaContext _localctx = new ProgramaContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_programa);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(83);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__14) {
				{
				{
				setState(80);
				declaracao_constante();
				}
				}
				setState(85);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(89);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__11) {
				{
				{
				setState(86);
				declaracao_tipo();
				}
				}
				setState(91);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(95);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__8) {
				{
				{
				setState(92);
				declaracao();
				}
				}
				setState(97);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(101);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__38) {
				{
				{
				setState(98);
				procedimento();
				}
				}
				setState(103);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(107);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__35) {
				{
				{
				setState(104);
				declaracao_funcao();
				}
				}
				setState(109);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(110);
			match(T__5);
			setState(114);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__14) {
				{
				{
				setState(111);
				declaracao_constante();
				}
				}
				setState(116);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(120);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__8) {
				{
				{
				setState(117);
				declaracao();
				}
				}
				setState(122);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(124);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((_la) & ~0x3f) == 0 && ((1L << _la) & 70665937616900L) != 0) {
				{
				setState(123);
				listaComandos();
				}
			}

			setState(126);
			match(T__6);
			setState(127);
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
	public static class ListaComandosContext extends ParserRuleContext {
		public ComandoContext comando() {
			return getRuleContext(ComandoContext.class,0);
		}
		public ListaComandosContext listaComandos() {
			return getRuleContext(ListaComandosContext.class,0);
		}
		public ListaComandosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listaComandos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).enterListaComandos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).exitListaComandos(this);
		}
	}

	public final ListaComandosContext listaComandos() throws RecognitionException {
		ListaComandosContext _localctx = new ListaComandosContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_listaComandos);
		try {
			setState(133);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(129);
				comando();
				setState(130);
				listaComandos();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(132);
				comando();
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
	public static class ComandoContext extends ParserRuleContext {
		public ComandoAtribuicaoContext comandoAtribuicao() {
			return getRuleContext(ComandoAtribuicaoContext.class,0);
		}
		public ComandoEntradaContext comandoEntrada() {
			return getRuleContext(ComandoEntradaContext.class,0);
		}
		public ComandoSaidaContext comandoSaida() {
			return getRuleContext(ComandoSaidaContext.class,0);
		}
		public ComandoCondicaoContext comandoCondicao() {
			return getRuleContext(ComandoCondicaoContext.class,0);
		}
		public SubAlgoritmoContext subAlgoritmo() {
			return getRuleContext(SubAlgoritmoContext.class,0);
		}
		public ComandoCasoContext comandoCaso() {
			return getRuleContext(ComandoCasoContext.class,0);
		}
		public ComandoParaContext comandoPara() {
			return getRuleContext(ComandoParaContext.class,0);
		}
		public ComandoEnquantoContext comandoEnquanto() {
			return getRuleContext(ComandoEnquantoContext.class,0);
		}
		public ComandoFacaContext comandoFaca() {
			return getRuleContext(ComandoFacaContext.class,0);
		}
		public Retorno_funcaoContext retorno_funcao() {
			return getRuleContext(Retorno_funcaoContext.class,0);
		}
		public ComandoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comando; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).enterComando(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).exitComando(this);
		}
	}

	public final ComandoContext comando() throws RecognitionException {
		ComandoContext _localctx = new ComandoContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_comando);
		try {
			setState(145);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
			case VARIAVEL:
				enterOuterAlt(_localctx, 1);
				{
				setState(135);
				comandoAtribuicao();
				}
				break;
			case T__17:
				enterOuterAlt(_localctx, 2);
				{
				setState(136);
				comandoEntrada();
				}
				break;
			case T__18:
				enterOuterAlt(_localctx, 3);
				{
				setState(137);
				comandoSaida();
				}
				break;
			case T__19:
				enterOuterAlt(_localctx, 4);
				{
				setState(138);
				comandoCondicao();
				}
				break;
			case T__33:
				enterOuterAlt(_localctx, 5);
				{
				setState(139);
				subAlgoritmo();
				}
				break;
			case T__24:
				enterOuterAlt(_localctx, 6);
				{
				setState(140);
				comandoCaso();
				}
				break;
			case T__31:
				enterOuterAlt(_localctx, 7);
				{
				setState(141);
				comandoPara();
				}
				break;
			case T__27:
				enterOuterAlt(_localctx, 8);
				{
				setState(142);
				comandoEnquanto();
				}
				break;
			case T__28:
				enterOuterAlt(_localctx, 9);
				{
				setState(143);
				comandoFaca();
				}
				break;
			case T__37:
				enterOuterAlt(_localctx, 10);
				{
				setState(144);
				retorno_funcao();
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
	public static class ComandoAtribuicaoContext extends ParserRuleContext {
		public List<TerminalNode> VARIAVEL() { return getTokens(AlgumaParser.VARIAVEL); }
		public TerminalNode VARIAVEL(int i) {
			return getToken(AlgumaParser.VARIAVEL, i);
		}
		public List<Var_registroContext> var_registro() {
			return getRuleContexts(Var_registroContext.class);
		}
		public Var_registroContext var_registro(int i) {
			return getRuleContext(Var_registroContext.class,i);
		}
		public EnderecoContext endereco() {
			return getRuleContext(EnderecoContext.class,0);
		}
		public ExpressaoRelacionalContext expressaoRelacional() {
			return getRuleContext(ExpressaoRelacionalContext.class,0);
		}
		public ExpressaoAritmeticaContext expressaoAritmetica() {
			return getRuleContext(ExpressaoAritmeticaContext.class,0);
		}
		public Chamada_funcaoContext chamada_funcao() {
			return getRuleContext(Chamada_funcaoContext.class,0);
		}
		public PonteiroContext ponteiro() {
			return getRuleContext(PonteiroContext.class,0);
		}
		public ComandoAtribuicaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comandoAtribuicao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).enterComandoAtribuicao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).exitComandoAtribuicao(this);
		}
	}

	public final ComandoAtribuicaoContext comandoAtribuicao() throws RecognitionException {
		ComandoAtribuicaoContext _localctx = new ComandoAtribuicaoContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_comandoAtribuicao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(148);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(147);
				ponteiro();
				}
			}

			setState(152);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(150);
				match(VARIAVEL);
				}
				break;
			case 2:
				{
				setState(151);
				var_registro();
				}
				break;
			}
			setState(154);
			match(T__7);
			setState(163);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				setState(155);
				endereco();
				setState(158);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
				case 1:
					{
					setState(156);
					match(VARIAVEL);
					}
					break;
				case 2:
					{
					setState(157);
					var_registro();
					}
					break;
				}
				}
				break;
			case 2:
				{
				setState(160);
				expressaoRelacional();
				}
				break;
			case 3:
				{
				setState(161);
				expressaoAritmetica();
				}
				break;
			case 4:
				{
				setState(162);
				chamada_funcao();
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
	public static class DeclaracaoContext extends ParserRuleContext {
		public List<TerminalNode> VARIAVEL() { return getTokens(AlgumaParser.VARIAVEL); }
		public TerminalNode VARIAVEL(int i) {
			return getToken(AlgumaParser.VARIAVEL, i);
		}
		public TerminalNode TIPO_VAR() { return getToken(AlgumaParser.TIPO_VAR, 0); }
		public Declaracao_registroContext declaracao_registro() {
			return getRuleContext(Declaracao_registroContext.class,0);
		}
		public Var_personalizadaContext var_personalizada() {
			return getRuleContext(Var_personalizadaContext.class,0);
		}
		public PonteiroContext ponteiro() {
			return getRuleContext(PonteiroContext.class,0);
		}
		public DeclaracaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).enterDeclaracao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).exitDeclaracao(this);
		}
	}

	public final DeclaracaoContext declaracao() throws RecognitionException {
		DeclaracaoContext _localctx = new DeclaracaoContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_declaracao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(165);
			match(T__8);
			setState(166);
			match(VARIAVEL);
			setState(171);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__9) {
				{
				{
				setState(167);
				match(T__9);
				setState(168);
				match(VARIAVEL);
				}
				}
				setState(173);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(174);
			match(T__10);
			setState(176);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(175);
				ponteiro();
				}
			}

			setState(181);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TIPO_VAR:
				{
				setState(178);
				match(TIPO_VAR);
				}
				break;
			case T__12:
				{
				setState(179);
				declaracao_registro();
				}
				break;
			case VARIAVEL:
				{
				setState(180);
				var_personalizada();
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
	public static class Declaracao_tipoContext extends ParserRuleContext {
		public TerminalNode VARIAVEL() { return getToken(AlgumaParser.VARIAVEL, 0); }
		public Declaracao_registroContext declaracao_registro() {
			return getRuleContext(Declaracao_registroContext.class,0);
		}
		public Declaracao_tipoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracao_tipo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).enterDeclaracao_tipo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).exitDeclaracao_tipo(this);
		}
	}

	public final Declaracao_tipoContext declaracao_tipo() throws RecognitionException {
		Declaracao_tipoContext _localctx = new Declaracao_tipoContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_declaracao_tipo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(183);
			match(T__11);
			setState(184);
			match(VARIAVEL);
			setState(185);
			match(T__10);
			setState(186);
			declaracao_registro();
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
	public static class Declaracao_registroContext extends ParserRuleContext {
		public List<TerminalNode> VARIAVEL() { return getTokens(AlgumaParser.VARIAVEL); }
		public TerminalNode VARIAVEL(int i) {
			return getToken(AlgumaParser.VARIAVEL, i);
		}
		public List<TerminalNode> TIPO_VAR() { return getTokens(AlgumaParser.TIPO_VAR); }
		public TerminalNode TIPO_VAR(int i) {
			return getToken(AlgumaParser.TIPO_VAR, i);
		}
		public Declaracao_registroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracao_registro; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).enterDeclaracao_registro(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).exitDeclaracao_registro(this);
		}
	}

	public final Declaracao_registroContext declaracao_registro() throws RecognitionException {
		Declaracao_registroContext _localctx = new Declaracao_registroContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_declaracao_registro);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(188);
			match(T__12);
			setState(201);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VARIAVEL) {
				{
				{
				setState(189);
				match(VARIAVEL);
				setState(194);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__9) {
					{
					{
					setState(190);
					match(T__9);
					setState(191);
					match(VARIAVEL);
					}
					}
					setState(196);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(197);
				match(T__10);
				setState(198);
				match(TIPO_VAR);
				}
				}
				setState(203);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(204);
			match(T__13);
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
	public static class Declaracao_constanteContext extends ParserRuleContext {
		public TerminalNode VARIAVEL() { return getToken(AlgumaParser.VARIAVEL, 0); }
		public TerminalNode TIPO_VAR() { return getToken(AlgumaParser.TIPO_VAR, 0); }
		public TerminalNode CADEIA() { return getToken(AlgumaParser.CADEIA, 0); }
		public TerminalNode NUMINT() { return getToken(AlgumaParser.NUMINT, 0); }
		public TerminalNode NUMREAL() { return getToken(AlgumaParser.NUMREAL, 0); }
		public Declaracao_constanteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracao_constante; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).enterDeclaracao_constante(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).exitDeclaracao_constante(this);
		}
	}

	public final Declaracao_constanteContext declaracao_constante() throws RecognitionException {
		Declaracao_constanteContext _localctx = new Declaracao_constanteContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_declaracao_constante);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(206);
			match(T__14);
			setState(207);
			match(VARIAVEL);
			setState(208);
			match(T__10);
			setState(209);
			match(TIPO_VAR);
			setState(210);
			match(T__15);
			setState(211);
			_la = _input.LA(1);
			if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 61572651155456L) != 0) ) {
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
	public static class ExpressaoAritmeticaContext extends ParserRuleContext {
		public FatorAritmeticoContext fatorAritmetico() {
			return getRuleContext(FatorAritmeticoContext.class,0);
		}
		public ExpressaoAritmeticaContext expressaoAritmetica() {
			return getRuleContext(ExpressaoAritmeticaContext.class,0);
		}
		public TerminalNode OP_ARIT1() { return getToken(AlgumaParser.OP_ARIT1, 0); }
		public TerminalNode OP_ARIT2() { return getToken(AlgumaParser.OP_ARIT2, 0); }
		public TerminalNode OP_ARIT3() { return getToken(AlgumaParser.OP_ARIT3, 0); }
		public ExpressaoAritmeticaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressaoAritmetica; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).enterExpressaoAritmetica(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).exitExpressaoAritmetica(this);
		}
	}

	public final ExpressaoAritmeticaContext expressaoAritmetica() throws RecognitionException {
		ExpressaoAritmeticaContext _localctx = new ExpressaoAritmeticaContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_expressaoAritmetica);
		int _la;
		try {
			setState(218);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(213);
				fatorAritmetico();
				setState(214);
				_la = _input.LA(1);
				if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 985162418487296L) != 0) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(215);
				expressaoAritmetica();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(217);
				fatorAritmetico();
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
	public static class FatorAritmeticoContext extends ParserRuleContext {
		public TerminalNode NUMINT() { return getToken(AlgumaParser.NUMINT, 0); }
		public TerminalNode NUMREAL() { return getToken(AlgumaParser.NUMREAL, 0); }
		public Chamada_funcaoContext chamada_funcao() {
			return getRuleContext(Chamada_funcaoContext.class,0);
		}
		public TerminalNode VARIAVEL() { return getToken(AlgumaParser.VARIAVEL, 0); }
		public Var_registroContext var_registro() {
			return getRuleContext(Var_registroContext.class,0);
		}
		public PonteiroContext ponteiro() {
			return getRuleContext(PonteiroContext.class,0);
		}
		public TerminalNode ABRE_PAR() { return getToken(AlgumaParser.ABRE_PAR, 0); }
		public ExpressaoAritmeticaContext expressaoAritmetica() {
			return getRuleContext(ExpressaoAritmeticaContext.class,0);
		}
		public TerminalNode FECHA_PAR() { return getToken(AlgumaParser.FECHA_PAR, 0); }
		public TerminalNode CADEIA() { return getToken(AlgumaParser.CADEIA, 0); }
		public FatorAritmeticoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fatorAritmetico; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).enterFatorAritmetico(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).exitFatorAritmetico(this);
		}
	}

	public final FatorAritmeticoContext fatorAritmetico() throws RecognitionException {
		FatorAritmeticoContext _localctx = new FatorAritmeticoContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_fatorAritmetico);
		int _la;
		try {
			setState(235);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(220);
				match(NUMINT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(221);
				match(NUMREAL);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(222);
				chamada_funcao();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(224);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__1) {
					{
					setState(223);
					ponteiro();
					}
				}

				setState(228);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
				case 1:
					{
					setState(226);
					match(VARIAVEL);
					}
					break;
				case 2:
					{
					setState(227);
					var_registro();
					}
					break;
				}
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(230);
				match(ABRE_PAR);
				setState(231);
				expressaoAritmetica();
				setState(232);
				match(FECHA_PAR);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(234);
				match(CADEIA);
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
	public static class ExpressaoRelacionalContext extends ParserRuleContext {
		public TermoRelacionalContext termoRelacional() {
			return getRuleContext(TermoRelacionalContext.class,0);
		}
		public Op_boolContext op_bool() {
			return getRuleContext(Op_boolContext.class,0);
		}
		public ExpressaoRelacionalContext expressaoRelacional() {
			return getRuleContext(ExpressaoRelacionalContext.class,0);
		}
		public ExpressaoRelacionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressaoRelacional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).enterExpressaoRelacional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).exitExpressaoRelacional(this);
		}
	}

	public final ExpressaoRelacionalContext expressaoRelacional() throws RecognitionException {
		ExpressaoRelacionalContext _localctx = new ExpressaoRelacionalContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_expressaoRelacional);
		try {
			setState(244);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(237);
				termoRelacional();
				setState(238);
				op_bool();
				setState(239);
				expressaoRelacional();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(241);
				match(T__16);
				}
				setState(242);
				expressaoRelacional();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(243);
				termoRelacional();
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
	public static class TermoRelacionalContext extends ParserRuleContext {
		public List<ExpressaoAritmeticaContext> expressaoAritmetica() {
			return getRuleContexts(ExpressaoAritmeticaContext.class);
		}
		public ExpressaoAritmeticaContext expressaoAritmetica(int i) {
			return getRuleContext(ExpressaoAritmeticaContext.class,i);
		}
		public TerminalNode OP_REL() { return getToken(AlgumaParser.OP_REL, 0); }
		public TerminalNode ABRE_PAR() { return getToken(AlgumaParser.ABRE_PAR, 0); }
		public ExpressaoRelacionalContext expressaoRelacional() {
			return getRuleContext(ExpressaoRelacionalContext.class,0);
		}
		public TerminalNode FECHA_PAR() { return getToken(AlgumaParser.FECHA_PAR, 0); }
		public TermoRelacionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_termoRelacional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).enterTermoRelacional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).exitTermoRelacional(this);
		}
	}

	public final TermoRelacionalContext termoRelacional() throws RecognitionException {
		TermoRelacionalContext _localctx = new TermoRelacionalContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_termoRelacional);
		int _la;
		try {
			setState(259);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(246);
				expressaoAritmetica();
				setState(247);
				_la = _input.LA(1);
				if ( !(_la==T__15 || _la==OP_REL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(248);
				expressaoAritmetica();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(250);
				expressaoAritmetica();
				setState(253);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__15 || _la==OP_REL) {
					{
					setState(251);
					_la = _input.LA(1);
					if ( !(_la==T__15 || _la==OP_REL) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(252);
					expressaoAritmetica();
					}
				}

				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(255);
				match(ABRE_PAR);
				setState(256);
				expressaoRelacional();
				setState(257);
				match(FECHA_PAR);
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
	public static class EntradaContext extends ParserRuleContext {
		public TerminalNode VARIAVEL() { return getToken(AlgumaParser.VARIAVEL, 0); }
		public Var_registroContext var_registro() {
			return getRuleContext(Var_registroContext.class,0);
		}
		public EntradaContext entrada() {
			return getRuleContext(EntradaContext.class,0);
		}
		public EntradaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_entrada; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).enterEntrada(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).exitEntrada(this);
		}
	}

	public final EntradaContext entrada() throws RecognitionException {
		EntradaContext _localctx = new EntradaContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_entrada);
		try {
			setState(271);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(263);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
				case 1:
					{
					setState(261);
					match(VARIAVEL);
					}
					break;
				case 2:
					{
					setState(262);
					var_registro();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(267);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
				case 1:
					{
					setState(265);
					match(VARIAVEL);
					}
					break;
				case 2:
					{
					setState(266);
					var_registro();
					}
					break;
				}
				setState(269);
				match(T__9);
				setState(270);
				entrada();
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
	public static class ComandoEntradaContext extends ParserRuleContext {
		public TerminalNode ABRE_PAR() { return getToken(AlgumaParser.ABRE_PAR, 0); }
		public EntradaContext entrada() {
			return getRuleContext(EntradaContext.class,0);
		}
		public TerminalNode FECHA_PAR() { return getToken(AlgumaParser.FECHA_PAR, 0); }
		public ComandoEntradaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comandoEntrada; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).enterComandoEntrada(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).exitComandoEntrada(this);
		}
	}

	public final ComandoEntradaContext comandoEntrada() throws RecognitionException {
		ComandoEntradaContext _localctx = new ComandoEntradaContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_comandoEntrada);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(273);
			match(T__17);
			setState(274);
			match(ABRE_PAR);
			setState(275);
			entrada();
			setState(276);
			match(FECHA_PAR);
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
	public static class SaidaContext extends ParserRuleContext {
		public TerminalNode VARIAVEL() { return getToken(AlgumaParser.VARIAVEL, 0); }
		public Var_registroContext var_registro() {
			return getRuleContext(Var_registroContext.class,0);
		}
		public SaidaContext saida() {
			return getRuleContext(SaidaContext.class,0);
		}
		public TerminalNode CADEIA() { return getToken(AlgumaParser.CADEIA, 0); }
		public ExpressaoRelacionalContext expressaoRelacional() {
			return getRuleContext(ExpressaoRelacionalContext.class,0);
		}
		public SaidaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_saida; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).enterSaida(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).exitSaida(this);
		}
	}

	public final SaidaContext saida() throws RecognitionException {
		SaidaContext _localctx = new SaidaContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_saida);
		try {
			setState(293);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(280);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
				case 1:
					{
					setState(278);
					match(VARIAVEL);
					}
					break;
				case 2:
					{
					setState(279);
					var_registro();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(284);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
				case 1:
					{
					setState(282);
					match(VARIAVEL);
					}
					break;
				case 2:
					{
					setState(283);
					var_registro();
					}
					break;
				}
				setState(286);
				match(T__9);
				setState(287);
				saida();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(288);
				match(CADEIA);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(289);
				match(CADEIA);
				setState(290);
				match(T__9);
				setState(291);
				saida();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(292);
				expressaoRelacional();
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
	public static class ComandoSaidaContext extends ParserRuleContext {
		public TerminalNode ABRE_PAR() { return getToken(AlgumaParser.ABRE_PAR, 0); }
		public SaidaContext saida() {
			return getRuleContext(SaidaContext.class,0);
		}
		public TerminalNode FECHA_PAR() { return getToken(AlgumaParser.FECHA_PAR, 0); }
		public ComandoSaidaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comandoSaida; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).enterComandoSaida(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).exitComandoSaida(this);
		}
	}

	public final ComandoSaidaContext comandoSaida() throws RecognitionException {
		ComandoSaidaContext _localctx = new ComandoSaidaContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_comandoSaida);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(295);
			match(T__18);
			setState(296);
			match(ABRE_PAR);
			setState(297);
			saida();
			setState(298);
			match(FECHA_PAR);
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
	public static class ComandoCondicaoContext extends ParserRuleContext {
		public ExpressaoRelacionalContext expressaoRelacional() {
			return getRuleContext(ExpressaoRelacionalContext.class,0);
		}
		public List<ComandoCondicaoContext> comandoCondicao() {
			return getRuleContexts(ComandoCondicaoContext.class);
		}
		public ComandoCondicaoContext comandoCondicao(int i) {
			return getRuleContext(ComandoCondicaoContext.class,i);
		}
		public List<ComandoContext> comando() {
			return getRuleContexts(ComandoContext.class);
		}
		public ComandoContext comando(int i) {
			return getRuleContext(ComandoContext.class,i);
		}
		public ComandoCondicaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comandoCondicao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).enterComandoCondicao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).exitComandoCondicao(this);
		}
	}

	public final ComandoCondicaoContext comandoCondicao() throws RecognitionException {
		ComandoCondicaoContext _localctx = new ComandoCondicaoContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_comandoCondicao);
		int _la;
		try {
			setState(338);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(300);
				match(T__19);
				setState(301);
				expressaoRelacional();
				setState(302);
				match(T__20);
				setState(304);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
				case 1:
					{
					setState(303);
					comandoCondicao();
					}
					break;
				}
				setState(309);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((_la) & ~0x3f) == 0 && ((1L << _la) & 70665937616900L) != 0) {
					{
					{
					setState(306);
					comando();
					}
					}
					setState(311);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(312);
				match(T__21);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(314);
				match(T__19);
				setState(315);
				expressaoRelacional();
				setState(316);
				match(T__20);
				setState(318);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
				case 1:
					{
					setState(317);
					comandoCondicao();
					}
					break;
				}
				setState(323);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((_la) & ~0x3f) == 0 && ((1L << _la) & 70665937616900L) != 0) {
					{
					{
					setState(320);
					comando();
					}
					}
					setState(325);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(326);
				match(T__22);
				setState(328);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
				case 1:
					{
					setState(327);
					comandoCondicao();
					}
					break;
				}
				setState(333);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((_la) & ~0x3f) == 0 && ((1L << _la) & 70665937616900L) != 0) {
					{
					{
					setState(330);
					comando();
					}
					}
					setState(335);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(336);
				match(T__21);
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
	public static class IntervaloContext extends ParserRuleContext {
		public List<TerminalNode> NUMINT() { return getTokens(AlgumaParser.NUMINT); }
		public TerminalNode NUMINT(int i) {
			return getToken(AlgumaParser.NUMINT, i);
		}
		public IntervaloContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intervalo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).enterIntervalo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).exitIntervalo(this);
		}
	}

	public final IntervaloContext intervalo() throws RecognitionException {
		IntervaloContext _localctx = new IntervaloContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_intervalo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(340);
			match(NUMINT);
			setState(341);
			match(T__23);
			setState(342);
			match(NUMINT);
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
	public static class ComandoCasoContext extends ParserRuleContext {
		public TerminalNode VARIAVEL() { return getToken(AlgumaParser.VARIAVEL, 0); }
		public Var_registroContext var_registro() {
			return getRuleContext(Var_registroContext.class,0);
		}
		public List<ComandoContext> comando() {
			return getRuleContexts(ComandoContext.class);
		}
		public ComandoContext comando(int i) {
			return getRuleContext(ComandoContext.class,i);
		}
		public List<TerminalNode> NUMINT() { return getTokens(AlgumaParser.NUMINT); }
		public TerminalNode NUMINT(int i) {
			return getToken(AlgumaParser.NUMINT, i);
		}
		public List<IntervaloContext> intervalo() {
			return getRuleContexts(IntervaloContext.class);
		}
		public IntervaloContext intervalo(int i) {
			return getRuleContext(IntervaloContext.class,i);
		}
		public ComandoCasoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comandoCaso; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).enterComandoCaso(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).exitComandoCaso(this);
		}
	}

	public final ComandoCasoContext comandoCaso() throws RecognitionException {
		ComandoCasoContext _localctx = new ComandoCasoContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_comandoCaso);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(344);
			match(T__24);
			setState(347);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				{
				setState(345);
				match(VARIAVEL);
				}
				break;
			case 2:
				{
				setState(346);
				var_registro();
				}
				break;
			}
			setState(349);
			match(T__25);
			setState(358);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NUMINT) {
				{
				{
				setState(352);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
				case 1:
					{
					setState(350);
					match(NUMINT);
					}
					break;
				case 2:
					{
					setState(351);
					intervalo();
					}
					break;
				}
				setState(354);
				match(T__10);
				setState(355);
				comando();
				}
				}
				setState(360);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(363);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__22) {
				{
				setState(361);
				match(T__22);
				setState(362);
				comando();
				}
			}

			setState(365);
			match(T__26);
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
	public static class ComandoEnquantoContext extends ParserRuleContext {
		public ExpressaoRelacionalContext expressaoRelacional() {
			return getRuleContext(ExpressaoRelacionalContext.class,0);
		}
		public ComandoEnquantoContext comandoEnquanto() {
			return getRuleContext(ComandoEnquantoContext.class,0);
		}
		public List<ComandoContext> comando() {
			return getRuleContexts(ComandoContext.class);
		}
		public ComandoContext comando(int i) {
			return getRuleContext(ComandoContext.class,i);
		}
		public ComandoEnquantoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comandoEnquanto; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).enterComandoEnquanto(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).exitComandoEnquanto(this);
		}
	}

	public final ComandoEnquantoContext comandoEnquanto() throws RecognitionException {
		ComandoEnquantoContext _localctx = new ComandoEnquantoContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_comandoEnquanto);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(367);
			match(T__27);
			setState(368);
			expressaoRelacional();
			setState(369);
			match(T__28);
			setState(371);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				{
				setState(370);
				comandoEnquanto();
				}
				break;
			}
			setState(376);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((_la) & ~0x3f) == 0 && ((1L << _la) & 70665937616900L) != 0) {
				{
				{
				setState(373);
				comando();
				}
				}
				setState(378);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(379);
			match(T__29);
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
	public static class ComandoFacaContext extends ParserRuleContext {
		public ExpressaoRelacionalContext expressaoRelacional() {
			return getRuleContext(ExpressaoRelacionalContext.class,0);
		}
		public List<ComandoContext> comando() {
			return getRuleContexts(ComandoContext.class);
		}
		public ComandoContext comando(int i) {
			return getRuleContext(ComandoContext.class,i);
		}
		public ComandoFacaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comandoFaca; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).enterComandoFaca(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).exitComandoFaca(this);
		}
	}

	public final ComandoFacaContext comandoFaca() throws RecognitionException {
		ComandoFacaContext _localctx = new ComandoFacaContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_comandoFaca);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(381);
			match(T__28);
			setState(385);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((_la) & ~0x3f) == 0 && ((1L << _la) & 70665937616900L) != 0) {
				{
				{
				setState(382);
				comando();
				}
				}
				setState(387);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(388);
			match(T__30);
			setState(389);
			expressaoRelacional();
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
	public static class ComandoParaContext extends ParserRuleContext {
		public List<TerminalNode> NUMINT() { return getTokens(AlgumaParser.NUMINT); }
		public TerminalNode NUMINT(int i) {
			return getToken(AlgumaParser.NUMINT, i);
		}
		public List<TerminalNode> VARIAVEL() { return getTokens(AlgumaParser.VARIAVEL); }
		public TerminalNode VARIAVEL(int i) {
			return getToken(AlgumaParser.VARIAVEL, i);
		}
		public List<Var_registroContext> var_registro() {
			return getRuleContexts(Var_registroContext.class);
		}
		public Var_registroContext var_registro(int i) {
			return getRuleContext(Var_registroContext.class,i);
		}
		public ComandoParaContext comandoPara() {
			return getRuleContext(ComandoParaContext.class,0);
		}
		public List<ComandoContext> comando() {
			return getRuleContexts(ComandoContext.class);
		}
		public ComandoContext comando(int i) {
			return getRuleContext(ComandoContext.class,i);
		}
		public ComandoParaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comandoPara; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).enterComandoPara(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).exitComandoPara(this);
		}
	}

	public final ComandoParaContext comandoPara() throws RecognitionException {
		ComandoParaContext _localctx = new ComandoParaContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_comandoPara);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(391);
			match(T__31);
			setState(394);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
			case 1:
				{
				setState(392);
				match(VARIAVEL);
				}
				break;
			case 2:
				{
				setState(393);
				var_registro();
				}
				break;
			}
			setState(396);
			match(T__7);
			setState(397);
			match(NUMINT);
			setState(398);
			match(T__30);
			setState(404);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMINT:
				{
				setState(399);
				match(NUMINT);
				}
				break;
			case VARIAVEL:
				{
				setState(402);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
				case 1:
					{
					setState(400);
					match(VARIAVEL);
					}
					break;
				case 2:
					{
					setState(401);
					var_registro();
					}
					break;
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(406);
			match(T__28);
			setState(408);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
			case 1:
				{
				setState(407);
				comandoPara();
				}
				break;
			}
			setState(413);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((_la) & ~0x3f) == 0 && ((1L << _la) & 70665937616900L) != 0) {
				{
				{
				setState(410);
				comando();
				}
				}
				setState(415);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(416);
			match(T__32);
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
	public static class SubAlgoritmoContext extends ParserRuleContext {
		public ListaComandosContext listaComandos() {
			return getRuleContext(ListaComandosContext.class,0);
		}
		public SubAlgoritmoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subAlgoritmo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).enterSubAlgoritmo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).exitSubAlgoritmo(this);
		}
	}

	public final SubAlgoritmoContext subAlgoritmo() throws RecognitionException {
		SubAlgoritmoContext _localctx = new SubAlgoritmoContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_subAlgoritmo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(418);
			match(T__33);
			setState(419);
			listaComandos();
			setState(420);
			match(T__34);
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
	public static class Parametros_chamada_funcaoContext extends ParserRuleContext {
		public List<TerminalNode> VARIAVEL() { return getTokens(AlgumaParser.VARIAVEL); }
		public TerminalNode VARIAVEL(int i) {
			return getToken(AlgumaParser.VARIAVEL, i);
		}
		public List<Var_registroContext> var_registro() {
			return getRuleContexts(Var_registroContext.class);
		}
		public Var_registroContext var_registro(int i) {
			return getRuleContext(Var_registroContext.class,i);
		}
		public List<TerminalNode> NUMINT() { return getTokens(AlgumaParser.NUMINT); }
		public TerminalNode NUMINT(int i) {
			return getToken(AlgumaParser.NUMINT, i);
		}
		public List<TerminalNode> NUMREAL() { return getTokens(AlgumaParser.NUMREAL); }
		public TerminalNode NUMREAL(int i) {
			return getToken(AlgumaParser.NUMREAL, i);
		}
		public List<ExpressaoAritmeticaContext> expressaoAritmetica() {
			return getRuleContexts(ExpressaoAritmeticaContext.class);
		}
		public ExpressaoAritmeticaContext expressaoAritmetica(int i) {
			return getRuleContext(ExpressaoAritmeticaContext.class,i);
		}
		public Parametros_chamada_funcaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametros_chamada_funcao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).enterParametros_chamada_funcao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).exitParametros_chamada_funcao(this);
		}
	}

	public final Parametros_chamada_funcaoContext parametros_chamada_funcao() throws RecognitionException {
		Parametros_chamada_funcaoContext _localctx = new Parametros_chamada_funcaoContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_parametros_chamada_funcao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(427);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
			case 1:
				{
				setState(422);
				match(VARIAVEL);
				}
				break;
			case 2:
				{
				setState(423);
				var_registro();
				}
				break;
			case 3:
				{
				setState(424);
				match(NUMINT);
				}
				break;
			case 4:
				{
				setState(425);
				match(NUMREAL);
				}
				break;
			case 5:
				{
				setState(426);
				expressaoAritmetica();
				}
				break;
			}
			setState(439);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__9) {
				{
				{
				setState(429);
				match(T__9);
				setState(435);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
				case 1:
					{
					setState(430);
					match(VARIAVEL);
					}
					break;
				case 2:
					{
					setState(431);
					var_registro();
					}
					break;
				case 3:
					{
					setState(432);
					match(NUMINT);
					}
					break;
				case 4:
					{
					setState(433);
					match(NUMREAL);
					}
					break;
				case 5:
					{
					setState(434);
					expressaoAritmetica();
					}
					break;
				}
				}
				}
				setState(441);
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
	public static class Chamada_funcaoContext extends ParserRuleContext {
		public TerminalNode VARIAVEL() { return getToken(AlgumaParser.VARIAVEL, 0); }
		public TerminalNode ABRE_PAR() { return getToken(AlgumaParser.ABRE_PAR, 0); }
		public Parametros_chamada_funcaoContext parametros_chamada_funcao() {
			return getRuleContext(Parametros_chamada_funcaoContext.class,0);
		}
		public TerminalNode FECHA_PAR() { return getToken(AlgumaParser.FECHA_PAR, 0); }
		public Chamada_funcaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_chamada_funcao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).enterChamada_funcao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).exitChamada_funcao(this);
		}
	}

	public final Chamada_funcaoContext chamada_funcao() throws RecognitionException {
		Chamada_funcaoContext _localctx = new Chamada_funcaoContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_chamada_funcao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(442);
			match(VARIAVEL);
			setState(443);
			match(ABRE_PAR);
			setState(444);
			parametros_chamada_funcao();
			setState(445);
			match(FECHA_PAR);
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
	public static class Parametros_declaracao_funcaoContext extends ParserRuleContext {
		public TerminalNode VARIAVEL() { return getToken(AlgumaParser.VARIAVEL, 0); }
		public TerminalNode TIPO_VAR() { return getToken(AlgumaParser.TIPO_VAR, 0); }
		public Declaracao_registroContext declaracao_registro() {
			return getRuleContext(Declaracao_registroContext.class,0);
		}
		public Var_personalizadaContext var_personalizada() {
			return getRuleContext(Var_personalizadaContext.class,0);
		}
		public PonteiroContext ponteiro() {
			return getRuleContext(PonteiroContext.class,0);
		}
		public Parametros_declaracao_funcaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametros_declaracao_funcao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).enterParametros_declaracao_funcao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).exitParametros_declaracao_funcao(this);
		}
	}

	public final Parametros_declaracao_funcaoContext parametros_declaracao_funcao() throws RecognitionException {
		Parametros_declaracao_funcaoContext _localctx = new Parametros_declaracao_funcaoContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_parametros_declaracao_funcao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(447);
			match(VARIAVEL);
			setState(448);
			match(T__10);
			setState(450);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(449);
				ponteiro();
				}
			}

			setState(455);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TIPO_VAR:
				{
				setState(452);
				match(TIPO_VAR);
				}
				break;
			case T__12:
				{
				setState(453);
				declaracao_registro();
				}
				break;
			case VARIAVEL:
				{
				setState(454);
				var_personalizada();
				}
				break;
			default:
				throw new NoViableAltException(this);
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
	public static class Declaracao_funcaoContext extends ParserRuleContext {
		public TerminalNode VARIAVEL() { return getToken(AlgumaParser.VARIAVEL, 0); }
		public TerminalNode ABRE_PAR() { return getToken(AlgumaParser.ABRE_PAR, 0); }
		public TerminalNode FECHA_PAR() { return getToken(AlgumaParser.FECHA_PAR, 0); }
		public TerminalNode TIPO_VAR() { return getToken(AlgumaParser.TIPO_VAR, 0); }
		public Var_personalizadaContext var_personalizada() {
			return getRuleContext(Var_personalizadaContext.class,0);
		}
		public List<Parametros_declaracao_funcaoContext> parametros_declaracao_funcao() {
			return getRuleContexts(Parametros_declaracao_funcaoContext.class);
		}
		public Parametros_declaracao_funcaoContext parametros_declaracao_funcao(int i) {
			return getRuleContext(Parametros_declaracao_funcaoContext.class,i);
		}
		public List<ComandoContext> comando() {
			return getRuleContexts(ComandoContext.class);
		}
		public ComandoContext comando(int i) {
			return getRuleContext(ComandoContext.class,i);
		}
		public Declaracao_funcaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracao_funcao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).enterDeclaracao_funcao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).exitDeclaracao_funcao(this);
		}
	}

	public final Declaracao_funcaoContext declaracao_funcao() throws RecognitionException {
		Declaracao_funcaoContext _localctx = new Declaracao_funcaoContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_declaracao_funcao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(457);
			match(T__35);
			setState(458);
			match(VARIAVEL);
			setState(459);
			match(ABRE_PAR);
			setState(461);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VARIAVEL) {
				{
				setState(460);
				parametros_declaracao_funcao();
				}
			}

			setState(467);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__9) {
				{
				{
				setState(463);
				match(T__9);
				setState(464);
				parametros_declaracao_funcao();
				}
				}
				setState(469);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(470);
			match(FECHA_PAR);
			setState(471);
			match(T__10);
			setState(474);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TIPO_VAR:
				{
				setState(472);
				match(TIPO_VAR);
				}
				break;
			case VARIAVEL:
				{
				setState(473);
				var_personalizada();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(479);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((_la) & ~0x3f) == 0 && ((1L << _la) & 70665937616900L) != 0) {
				{
				{
				setState(476);
				comando();
				}
				}
				setState(481);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(482);
			match(T__36);
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
	public static class Retorno_funcaoContext extends ParserRuleContext {
		public ExpressaoAritmeticaContext expressaoAritmetica() {
			return getRuleContext(ExpressaoAritmeticaContext.class,0);
		}
		public ExpressaoRelacionalContext expressaoRelacional() {
			return getRuleContext(ExpressaoRelacionalContext.class,0);
		}
		public Retorno_funcaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_retorno_funcao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).enterRetorno_funcao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).exitRetorno_funcao(this);
		}
	}

	public final Retorno_funcaoContext retorno_funcao() throws RecognitionException {
		Retorno_funcaoContext _localctx = new Retorno_funcaoContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_retorno_funcao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(484);
			match(T__37);
			setState(487);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,60,_ctx) ) {
			case 1:
				{
				setState(485);
				expressaoAritmetica();
				}
				break;
			case 2:
				{
				setState(486);
				expressaoRelacional();
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
	public static class ProcedimentoContext extends ParserRuleContext {
		public List<TerminalNode> VARIAVEL() { return getTokens(AlgumaParser.VARIAVEL); }
		public TerminalNode VARIAVEL(int i) {
			return getToken(AlgumaParser.VARIAVEL, i);
		}
		public TerminalNode ABRE_PAR() { return getToken(AlgumaParser.ABRE_PAR, 0); }
		public TerminalNode FECHA_PAR() { return getToken(AlgumaParser.FECHA_PAR, 0); }
		public List<Var_personalizadaContext> var_personalizada() {
			return getRuleContexts(Var_personalizadaContext.class);
		}
		public Var_personalizadaContext var_personalizada(int i) {
			return getRuleContext(Var_personalizadaContext.class,i);
		}
		public DeclaracaoContext declaracao() {
			return getRuleContext(DeclaracaoContext.class,0);
		}
		public ListaComandosContext listaComandos() {
			return getRuleContext(ListaComandosContext.class,0);
		}
		public ProcedimentoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_procedimento; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).enterProcedimento(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).exitProcedimento(this);
		}
	}

	public final ProcedimentoContext procedimento() throws RecognitionException {
		ProcedimentoContext _localctx = new ProcedimentoContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_procedimento);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(489);
			match(T__38);
			setState(490);
			match(VARIAVEL);
			setState(491);
			match(ABRE_PAR);
			setState(498);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__39) {
				{
				{
				setState(492);
				match(T__39);
				setState(493);
				match(VARIAVEL);
				setState(494);
				match(T__10);
				setState(495);
				var_personalizada();
				}
				}
				setState(500);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(501);
			match(FECHA_PAR);
			setState(503);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__8) {
				{
				setState(502);
				declaracao();
				}
			}

			setState(506);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((_la) & ~0x3f) == 0 && ((1L << _la) & 70665937616900L) != 0) {
				{
				setState(505);
				listaComandos();
				}
			}

			setState(508);
			match(T__40);
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
		"\u0004\u0001<\u01ff\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0001\u0000\u0001"+
		"\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001"+
		"\u0002\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0005\u0005"+
		"\u0005R\b\u0005\n\u0005\f\u0005U\t\u0005\u0001\u0005\u0005\u0005X\b\u0005"+
		"\n\u0005\f\u0005[\t\u0005\u0001\u0005\u0005\u0005^\b\u0005\n\u0005\f\u0005"+
		"a\t\u0005\u0001\u0005\u0005\u0005d\b\u0005\n\u0005\f\u0005g\t\u0005\u0001"+
		"\u0005\u0005\u0005j\b\u0005\n\u0005\f\u0005m\t\u0005\u0001\u0005\u0001"+
		"\u0005\u0005\u0005q\b\u0005\n\u0005\f\u0005t\t\u0005\u0001\u0005\u0005"+
		"\u0005w\b\u0005\n\u0005\f\u0005z\t\u0005\u0001\u0005\u0003\u0005}\b\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0003\u0006\u0086\b\u0006\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0003\u0007\u0092\b\u0007\u0001\b\u0003\b\u0095\b\b\u0001"+
		"\b\u0001\b\u0003\b\u0099\b\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003\b\u009f"+
		"\b\b\u0001\b\u0001\b\u0001\b\u0003\b\u00a4\b\b\u0001\t\u0001\t\u0001\t"+
		"\u0001\t\u0005\t\u00aa\b\t\n\t\f\t\u00ad\t\t\u0001\t\u0001\t\u0003\t\u00b1"+
		"\b\t\u0001\t\u0001\t\u0001\t\u0003\t\u00b6\b\t\u0001\n\u0001\n\u0001\n"+
		"\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0005"+
		"\u000b\u00c1\b\u000b\n\u000b\f\u000b\u00c4\t\u000b\u0001\u000b\u0001\u000b"+
		"\u0005\u000b\u00c8\b\u000b\n\u000b\f\u000b\u00cb\t\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\r"+
		"\u0001\r\u0001\r\u0001\r\u0001\r\u0003\r\u00db\b\r\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0003\u000e\u00e1\b\u000e\u0001\u000e\u0001\u000e"+
		"\u0003\u000e\u00e5\b\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0003\u000e\u00ec\b\u000e\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0003\u000f\u00f5\b\u000f"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0003\u0010\u00fe\b\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0003\u0010\u0104\b\u0010\u0001\u0011\u0001\u0011\u0003\u0011"+
		"\u0108\b\u0011\u0001\u0011\u0001\u0011\u0003\u0011\u010c\b\u0011\u0001"+
		"\u0011\u0001\u0011\u0003\u0011\u0110\b\u0011\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0003\u0013\u0119"+
		"\b\u0013\u0001\u0013\u0001\u0013\u0003\u0013\u011d\b\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0003\u0013\u0126\b\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0003\u0015"+
		"\u0131\b\u0015\u0001\u0015\u0005\u0015\u0134\b\u0015\n\u0015\f\u0015\u0137"+
		"\t\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0003\u0015\u013f\b\u0015\u0001\u0015\u0005\u0015\u0142\b\u0015"+
		"\n\u0015\f\u0015\u0145\t\u0015\u0001\u0015\u0001\u0015\u0003\u0015\u0149"+
		"\b\u0015\u0001\u0015\u0005\u0015\u014c\b\u0015\n\u0015\f\u0015\u014f\t"+
		"\u0015\u0001\u0015\u0001\u0015\u0003\u0015\u0153\b\u0015\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0003"+
		"\u0017\u015c\b\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0003\u0017\u0161"+
		"\b\u0017\u0001\u0017\u0001\u0017\u0005\u0017\u0165\b\u0017\n\u0017\f\u0017"+
		"\u0168\t\u0017\u0001\u0017\u0001\u0017\u0003\u0017\u016c\b\u0017\u0001"+
		"\u0017\u0001\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0003"+
		"\u0018\u0174\b\u0018\u0001\u0018\u0005\u0018\u0177\b\u0018\n\u0018\f\u0018"+
		"\u017a\t\u0018\u0001\u0018\u0001\u0018\u0001\u0019\u0001\u0019\u0005\u0019"+
		"\u0180\b\u0019\n\u0019\f\u0019\u0183\t\u0019\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0003\u001a\u018b\b\u001a\u0001"+
		"\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0003"+
		"\u001a\u0193\b\u001a\u0003\u001a\u0195\b\u001a\u0001\u001a\u0001\u001a"+
		"\u0003\u001a\u0199\b\u001a\u0001\u001a\u0005\u001a\u019c\b\u001a\n\u001a"+
		"\f\u001a\u019f\t\u001a\u0001\u001a\u0001\u001a\u0001\u001b\u0001\u001b"+
		"\u0001\u001b\u0001\u001b\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0003\u001c\u01ac\b\u001c\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0003\u001c\u01b4\b\u001c\u0005\u001c"+
		"\u01b6\b\u001c\n\u001c\f\u001c\u01b9\t\u001c\u0001\u001d\u0001\u001d\u0001"+
		"\u001d\u0001\u001d\u0001\u001d\u0001\u001e\u0001\u001e\u0001\u001e\u0003"+
		"\u001e\u01c3\b\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0003\u001e\u01c8"+
		"\b\u001e\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0003\u001f\u01ce"+
		"\b\u001f\u0001\u001f\u0001\u001f\u0005\u001f\u01d2\b\u001f\n\u001f\f\u001f"+
		"\u01d5\t\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0003\u001f"+
		"\u01db\b\u001f\u0001\u001f\u0005\u001f\u01de\b\u001f\n\u001f\f\u001f\u01e1"+
		"\t\u001f\u0001\u001f\u0001\u001f\u0001 \u0001 \u0001 \u0003 \u01e8\b "+
		"\u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0005!\u01f1\b!\n!\f"+
		"!\u01f4\t!\u0001!\u0001!\u0003!\u01f8\b!\u0001!\u0003!\u01fb\b!\u0001"+
		"!\u0001!\u0001!\u0000\u0000\"\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010"+
		"\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.02468:<>@B\u0000\u0004"+
		"\u0001\u0000\u0004\u0005\u0001\u0000+-\u0001\u0000/1\u0002\u0000\u0010"+
		"\u001022\u0238\u0000D\u0001\u0000\u0000\u0000\u0002F\u0001\u0000\u0000"+
		"\u0000\u0004J\u0001\u0000\u0000\u0000\u0006L\u0001\u0000\u0000\u0000\b"+
		"N\u0001\u0000\u0000\u0000\nS\u0001\u0000\u0000\u0000\f\u0085\u0001\u0000"+
		"\u0000\u0000\u000e\u0091\u0001\u0000\u0000\u0000\u0010\u0094\u0001\u0000"+
		"\u0000\u0000\u0012\u00a5\u0001\u0000\u0000\u0000\u0014\u00b7\u0001\u0000"+
		"\u0000\u0000\u0016\u00bc\u0001\u0000\u0000\u0000\u0018\u00ce\u0001\u0000"+
		"\u0000\u0000\u001a\u00da\u0001\u0000\u0000\u0000\u001c\u00eb\u0001\u0000"+
		"\u0000\u0000\u001e\u00f4\u0001\u0000\u0000\u0000 \u0103\u0001\u0000\u0000"+
		"\u0000\"\u010f\u0001\u0000\u0000\u0000$\u0111\u0001\u0000\u0000\u0000"+
		"&\u0125\u0001\u0000\u0000\u0000(\u0127\u0001\u0000\u0000\u0000*\u0152"+
		"\u0001\u0000\u0000\u0000,\u0154\u0001\u0000\u0000\u0000.\u0158\u0001\u0000"+
		"\u0000\u00000\u016f\u0001\u0000\u0000\u00002\u017d\u0001\u0000\u0000\u0000"+
		"4\u0187\u0001\u0000\u0000\u00006\u01a2\u0001\u0000\u0000\u00008\u01ab"+
		"\u0001\u0000\u0000\u0000:\u01ba\u0001\u0000\u0000\u0000<\u01bf\u0001\u0000"+
		"\u0000\u0000>\u01c9\u0001\u0000\u0000\u0000@\u01e4\u0001\u0000\u0000\u0000"+
		"B\u01e9\u0001\u0000\u0000\u0000DE\u0005.\u0000\u0000E\u0001\u0001\u0000"+
		"\u0000\u0000FG\u0005.\u0000\u0000GH\u0005\u0001\u0000\u0000HI\u0005.\u0000"+
		"\u0000I\u0003\u0001\u0000\u0000\u0000JK\u0005\u0002\u0000\u0000K\u0005"+
		"\u0001\u0000\u0000\u0000LM\u0005\u0003\u0000\u0000M\u0007\u0001\u0000"+
		"\u0000\u0000NO\u0007\u0000\u0000\u0000O\t\u0001\u0000\u0000\u0000PR\u0003"+
		"\u0018\f\u0000QP\u0001\u0000\u0000\u0000RU\u0001\u0000\u0000\u0000SQ\u0001"+
		"\u0000\u0000\u0000ST\u0001\u0000\u0000\u0000TY\u0001\u0000\u0000\u0000"+
		"US\u0001\u0000\u0000\u0000VX\u0003\u0014\n\u0000WV\u0001\u0000\u0000\u0000"+
		"X[\u0001\u0000\u0000\u0000YW\u0001\u0000\u0000\u0000YZ\u0001\u0000\u0000"+
		"\u0000Z_\u0001\u0000\u0000\u0000[Y\u0001\u0000\u0000\u0000\\^\u0003\u0012"+
		"\t\u0000]\\\u0001\u0000\u0000\u0000^a\u0001\u0000\u0000\u0000_]\u0001"+
		"\u0000\u0000\u0000_`\u0001\u0000\u0000\u0000`e\u0001\u0000\u0000\u0000"+
		"a_\u0001\u0000\u0000\u0000bd\u0003B!\u0000cb\u0001\u0000\u0000\u0000d"+
		"g\u0001\u0000\u0000\u0000ec\u0001\u0000\u0000\u0000ef\u0001\u0000\u0000"+
		"\u0000fk\u0001\u0000\u0000\u0000ge\u0001\u0000\u0000\u0000hj\u0003>\u001f"+
		"\u0000ih\u0001\u0000\u0000\u0000jm\u0001\u0000\u0000\u0000ki\u0001\u0000"+
		"\u0000\u0000kl\u0001\u0000\u0000\u0000ln\u0001\u0000\u0000\u0000mk\u0001"+
		"\u0000\u0000\u0000nr\u0005\u0006\u0000\u0000oq\u0003\u0018\f\u0000po\u0001"+
		"\u0000\u0000\u0000qt\u0001\u0000\u0000\u0000rp\u0001\u0000\u0000\u0000"+
		"rs\u0001\u0000\u0000\u0000sx\u0001\u0000\u0000\u0000tr\u0001\u0000\u0000"+
		"\u0000uw\u0003\u0012\t\u0000vu\u0001\u0000\u0000\u0000wz\u0001\u0000\u0000"+
		"\u0000xv\u0001\u0000\u0000\u0000xy\u0001\u0000\u0000\u0000y|\u0001\u0000"+
		"\u0000\u0000zx\u0001\u0000\u0000\u0000{}\u0003\f\u0006\u0000|{\u0001\u0000"+
		"\u0000\u0000|}\u0001\u0000\u0000\u0000}~\u0001\u0000\u0000\u0000~\u007f"+
		"\u0005\u0007\u0000\u0000\u007f\u0080\u0005\u0000\u0000\u0001\u0080\u000b"+
		"\u0001\u0000\u0000\u0000\u0081\u0082\u0003\u000e\u0007\u0000\u0082\u0083"+
		"\u0003\f\u0006\u0000\u0083\u0086\u0001\u0000\u0000\u0000\u0084\u0086\u0003"+
		"\u000e\u0007\u0000\u0085\u0081\u0001\u0000\u0000\u0000\u0085\u0084\u0001"+
		"\u0000\u0000\u0000\u0086\r\u0001\u0000\u0000\u0000\u0087\u0092\u0003\u0010"+
		"\b\u0000\u0088\u0092\u0003$\u0012\u0000\u0089\u0092\u0003(\u0014\u0000"+
		"\u008a\u0092\u0003*\u0015\u0000\u008b\u0092\u00036\u001b\u0000\u008c\u0092"+
		"\u0003.\u0017\u0000\u008d\u0092\u00034\u001a\u0000\u008e\u0092\u00030"+
		"\u0018\u0000\u008f\u0092\u00032\u0019\u0000\u0090\u0092\u0003@ \u0000"+
		"\u0091\u0087\u0001\u0000\u0000\u0000\u0091\u0088\u0001\u0000\u0000\u0000"+
		"\u0091\u0089\u0001\u0000\u0000\u0000\u0091\u008a\u0001\u0000\u0000\u0000"+
		"\u0091\u008b\u0001\u0000\u0000\u0000\u0091\u008c\u0001\u0000\u0000\u0000"+
		"\u0091\u008d\u0001\u0000\u0000\u0000\u0091\u008e\u0001\u0000\u0000\u0000"+
		"\u0091\u008f\u0001\u0000\u0000\u0000\u0091\u0090\u0001\u0000\u0000\u0000"+
		"\u0092\u000f\u0001\u0000\u0000\u0000\u0093\u0095\u0003\u0004\u0002\u0000"+
		"\u0094\u0093\u0001\u0000\u0000\u0000\u0094\u0095\u0001\u0000\u0000\u0000"+
		"\u0095\u0098\u0001\u0000\u0000\u0000\u0096\u0099\u0005.\u0000\u0000\u0097"+
		"\u0099\u0003\u0002\u0001\u0000\u0098\u0096\u0001\u0000\u0000\u0000\u0098"+
		"\u0097\u0001\u0000\u0000\u0000\u0099\u009a\u0001\u0000\u0000\u0000\u009a"+
		"\u00a3\u0005\b\u0000\u0000\u009b\u009e\u0003\u0006\u0003\u0000\u009c\u009f"+
		"\u0005.\u0000\u0000\u009d\u009f\u0003\u0002\u0001\u0000\u009e\u009c\u0001"+
		"\u0000\u0000\u0000\u009e\u009d\u0001\u0000\u0000\u0000\u009f\u00a4\u0001"+
		"\u0000\u0000\u0000\u00a0\u00a4\u0003\u001e\u000f\u0000\u00a1\u00a4\u0003"+
		"\u001a\r\u0000\u00a2\u00a4\u0003:\u001d\u0000\u00a3\u009b\u0001\u0000"+
		"\u0000\u0000\u00a3\u00a0\u0001\u0000\u0000\u0000\u00a3\u00a1\u0001\u0000"+
		"\u0000\u0000\u00a3\u00a2\u0001\u0000\u0000\u0000\u00a4\u0011\u0001\u0000"+
		"\u0000\u0000\u00a5\u00a6\u0005\t\u0000\u0000\u00a6\u00ab\u0005.\u0000"+
		"\u0000\u00a7\u00a8\u0005\n\u0000\u0000\u00a8\u00aa\u0005.\u0000\u0000"+
		"\u00a9\u00a7\u0001\u0000\u0000\u0000\u00aa\u00ad\u0001\u0000\u0000\u0000"+
		"\u00ab\u00a9\u0001\u0000\u0000\u0000\u00ab\u00ac\u0001\u0000\u0000\u0000"+
		"\u00ac\u00ae\u0001\u0000\u0000\u0000\u00ad\u00ab\u0001\u0000\u0000\u0000"+
		"\u00ae\u00b0\u0005\u000b\u0000\u0000\u00af\u00b1\u0003\u0004\u0002\u0000"+
		"\u00b0\u00af\u0001\u0000\u0000\u0000\u00b0\u00b1\u0001\u0000\u0000\u0000"+
		"\u00b1\u00b5\u0001\u0000\u0000\u0000\u00b2\u00b6\u0005*\u0000\u0000\u00b3"+
		"\u00b6\u0003\u0016\u000b\u0000\u00b4\u00b6\u0003\u0000\u0000\u0000\u00b5"+
		"\u00b2\u0001\u0000\u0000\u0000\u00b5\u00b3\u0001\u0000\u0000\u0000\u00b5"+
		"\u00b4\u0001\u0000\u0000\u0000\u00b6\u0013\u0001\u0000\u0000\u0000\u00b7"+
		"\u00b8\u0005\f\u0000\u0000\u00b8\u00b9\u0005.\u0000\u0000\u00b9\u00ba"+
		"\u0005\u000b\u0000\u0000\u00ba\u00bb\u0003\u0016\u000b\u0000\u00bb\u0015"+
		"\u0001\u0000\u0000\u0000\u00bc\u00c9\u0005\r\u0000\u0000\u00bd\u00c2\u0005"+
		".\u0000\u0000\u00be\u00bf\u0005\n\u0000\u0000\u00bf\u00c1\u0005.\u0000"+
		"\u0000\u00c0\u00be\u0001\u0000\u0000\u0000\u00c1\u00c4\u0001\u0000\u0000"+
		"\u0000\u00c2\u00c0\u0001\u0000\u0000\u0000\u00c2\u00c3\u0001\u0000\u0000"+
		"\u0000\u00c3\u00c5\u0001\u0000\u0000\u0000\u00c4\u00c2\u0001\u0000\u0000"+
		"\u0000\u00c5\u00c6\u0005\u000b\u0000\u0000\u00c6\u00c8\u0005*\u0000\u0000"+
		"\u00c7\u00bd\u0001\u0000\u0000\u0000\u00c8\u00cb\u0001\u0000\u0000\u0000"+
		"\u00c9\u00c7\u0001\u0000\u0000\u0000\u00c9\u00ca\u0001\u0000\u0000\u0000"+
		"\u00ca\u00cc\u0001\u0000\u0000\u0000\u00cb\u00c9\u0001\u0000\u0000\u0000"+
		"\u00cc\u00cd\u0005\u000e\u0000\u0000\u00cd\u0017\u0001\u0000\u0000\u0000"+
		"\u00ce\u00cf\u0005\u000f\u0000\u0000\u00cf\u00d0\u0005.\u0000\u0000\u00d0"+
		"\u00d1\u0005\u000b\u0000\u0000\u00d1\u00d2\u0005*\u0000\u0000\u00d2\u00d3"+
		"\u0005\u0010\u0000\u0000\u00d3\u00d4\u0007\u0001\u0000\u0000\u00d4\u0019"+
		"\u0001\u0000\u0000\u0000\u00d5\u00d6\u0003\u001c\u000e\u0000\u00d6\u00d7"+
		"\u0007\u0002\u0000\u0000\u00d7\u00d8\u0003\u001a\r\u0000\u00d8\u00db\u0001"+
		"\u0000\u0000\u0000\u00d9\u00db\u0003\u001c\u000e\u0000\u00da\u00d5\u0001"+
		"\u0000\u0000\u0000\u00da\u00d9\u0001\u0000\u0000\u0000\u00db\u001b\u0001"+
		"\u0000\u0000\u0000\u00dc\u00ec\u0005+\u0000\u0000\u00dd\u00ec\u0005,\u0000"+
		"\u0000\u00de\u00ec\u0003:\u001d\u0000\u00df\u00e1\u0003\u0004\u0002\u0000"+
		"\u00e0\u00df\u0001\u0000\u0000\u0000\u00e0\u00e1\u0001\u0000\u0000\u0000"+
		"\u00e1\u00e4\u0001\u0000\u0000\u0000\u00e2\u00e5\u0005.\u0000\u0000\u00e3"+
		"\u00e5\u0003\u0002\u0001\u0000\u00e4\u00e2\u0001\u0000\u0000\u0000\u00e4"+
		"\u00e3\u0001\u0000\u0000\u0000\u00e5\u00ec\u0001\u0000\u0000\u0000\u00e6"+
		"\u00e7\u00058\u0000\u0000\u00e7\u00e8\u0003\u001a\r\u0000\u00e8\u00e9"+
		"\u00059\u0000\u0000\u00e9\u00ec\u0001\u0000\u0000\u0000\u00ea\u00ec\u0005"+
		"-\u0000\u0000\u00eb\u00dc\u0001\u0000\u0000\u0000\u00eb\u00dd\u0001\u0000"+
		"\u0000\u0000\u00eb\u00de\u0001\u0000\u0000\u0000\u00eb\u00e0\u0001\u0000"+
		"\u0000\u0000\u00eb\u00e6\u0001\u0000\u0000\u0000\u00eb\u00ea\u0001\u0000"+
		"\u0000\u0000\u00ec\u001d\u0001\u0000\u0000\u0000\u00ed\u00ee\u0003 \u0010"+
		"\u0000\u00ee\u00ef\u0003\b\u0004\u0000\u00ef\u00f0\u0003\u001e\u000f\u0000"+
		"\u00f0\u00f5\u0001\u0000\u0000\u0000\u00f1\u00f2\u0005\u0011\u0000\u0000"+
		"\u00f2\u00f5\u0003\u001e\u000f\u0000\u00f3\u00f5\u0003 \u0010\u0000\u00f4"+
		"\u00ed\u0001\u0000\u0000\u0000\u00f4\u00f1\u0001\u0000\u0000\u0000\u00f4"+
		"\u00f3\u0001\u0000\u0000\u0000\u00f5\u001f\u0001\u0000\u0000\u0000\u00f6"+
		"\u00f7\u0003\u001a\r\u0000\u00f7\u00f8\u0007\u0003\u0000\u0000\u00f8\u00f9"+
		"\u0003\u001a\r\u0000\u00f9\u0104\u0001\u0000\u0000\u0000\u00fa\u00fd\u0003"+
		"\u001a\r\u0000\u00fb\u00fc\u0007\u0003\u0000\u0000\u00fc\u00fe\u0003\u001a"+
		"\r\u0000\u00fd\u00fb\u0001\u0000\u0000\u0000\u00fd\u00fe\u0001\u0000\u0000"+
		"\u0000\u00fe\u0104\u0001\u0000\u0000\u0000\u00ff\u0100\u00058\u0000\u0000"+
		"\u0100\u0101\u0003\u001e\u000f\u0000\u0101\u0102\u00059\u0000\u0000\u0102"+
		"\u0104\u0001\u0000\u0000\u0000\u0103\u00f6\u0001\u0000\u0000\u0000\u0103"+
		"\u00fa\u0001\u0000\u0000\u0000\u0103\u00ff\u0001\u0000\u0000\u0000\u0104"+
		"!\u0001\u0000\u0000\u0000\u0105\u0108\u0005.\u0000\u0000\u0106\u0108\u0003"+
		"\u0002\u0001\u0000\u0107\u0105\u0001\u0000\u0000\u0000\u0107\u0106\u0001"+
		"\u0000\u0000\u0000\u0108\u0110\u0001\u0000\u0000\u0000\u0109\u010c\u0005"+
		".\u0000\u0000\u010a\u010c\u0003\u0002\u0001\u0000\u010b\u0109\u0001\u0000"+
		"\u0000\u0000\u010b\u010a\u0001\u0000\u0000\u0000\u010c\u010d\u0001\u0000"+
		"\u0000\u0000\u010d\u010e\u0005\n\u0000\u0000\u010e\u0110\u0003\"\u0011"+
		"\u0000\u010f\u0107\u0001\u0000\u0000\u0000\u010f\u010b\u0001\u0000\u0000"+
		"\u0000\u0110#\u0001\u0000\u0000\u0000\u0111\u0112\u0005\u0012\u0000\u0000"+
		"\u0112\u0113\u00058\u0000\u0000\u0113\u0114\u0003\"\u0011\u0000\u0114"+
		"\u0115\u00059\u0000\u0000\u0115%\u0001\u0000\u0000\u0000\u0116\u0119\u0005"+
		".\u0000\u0000\u0117\u0119\u0003\u0002\u0001\u0000\u0118\u0116\u0001\u0000"+
		"\u0000\u0000\u0118\u0117\u0001\u0000\u0000\u0000\u0119\u0126\u0001\u0000"+
		"\u0000\u0000\u011a\u011d\u0005.\u0000\u0000\u011b\u011d\u0003\u0002\u0001"+
		"\u0000\u011c\u011a\u0001\u0000\u0000\u0000\u011c\u011b\u0001\u0000\u0000"+
		"\u0000\u011d\u011e\u0001\u0000\u0000\u0000\u011e\u011f\u0005\n\u0000\u0000"+
		"\u011f\u0126\u0003&\u0013\u0000\u0120\u0126\u0005-\u0000\u0000\u0121\u0122"+
		"\u0005-\u0000\u0000\u0122\u0123\u0005\n\u0000\u0000\u0123\u0126\u0003"+
		"&\u0013\u0000\u0124\u0126\u0003\u001e\u000f\u0000\u0125\u0118\u0001\u0000"+
		"\u0000\u0000\u0125\u011c\u0001\u0000\u0000\u0000\u0125\u0120\u0001\u0000"+
		"\u0000\u0000\u0125\u0121\u0001\u0000\u0000\u0000\u0125\u0124\u0001\u0000"+
		"\u0000\u0000\u0126\'\u0001\u0000\u0000\u0000\u0127\u0128\u0005\u0013\u0000"+
		"\u0000\u0128\u0129\u00058\u0000\u0000\u0129\u012a\u0003&\u0013\u0000\u012a"+
		"\u012b\u00059\u0000\u0000\u012b)\u0001\u0000\u0000\u0000\u012c\u012d\u0005"+
		"\u0014\u0000\u0000\u012d\u012e\u0003\u001e\u000f\u0000\u012e\u0130\u0005"+
		"\u0015\u0000\u0000\u012f\u0131\u0003*\u0015\u0000\u0130\u012f\u0001\u0000"+
		"\u0000\u0000\u0130\u0131\u0001\u0000\u0000\u0000\u0131\u0135\u0001\u0000"+
		"\u0000\u0000\u0132\u0134\u0003\u000e\u0007\u0000\u0133\u0132\u0001\u0000"+
		"\u0000\u0000\u0134\u0137\u0001\u0000\u0000\u0000\u0135\u0133\u0001\u0000"+
		"\u0000\u0000\u0135\u0136\u0001\u0000\u0000\u0000\u0136\u0138\u0001\u0000"+
		"\u0000\u0000\u0137\u0135\u0001\u0000\u0000\u0000\u0138\u0139\u0005\u0016"+
		"\u0000\u0000\u0139\u0153\u0001\u0000\u0000\u0000\u013a\u013b\u0005\u0014"+
		"\u0000\u0000\u013b\u013c\u0003\u001e\u000f\u0000\u013c\u013e\u0005\u0015"+
		"\u0000\u0000\u013d\u013f\u0003*\u0015\u0000\u013e\u013d\u0001\u0000\u0000"+
		"\u0000\u013e\u013f\u0001\u0000\u0000\u0000\u013f\u0143\u0001\u0000\u0000"+
		"\u0000\u0140\u0142\u0003\u000e\u0007\u0000\u0141\u0140\u0001\u0000\u0000"+
		"\u0000\u0142\u0145\u0001\u0000\u0000\u0000\u0143\u0141\u0001\u0000\u0000"+
		"\u0000\u0143\u0144\u0001\u0000\u0000\u0000\u0144\u0146\u0001\u0000\u0000"+
		"\u0000\u0145\u0143\u0001\u0000\u0000\u0000\u0146\u0148\u0005\u0017\u0000"+
		"\u0000\u0147\u0149\u0003*\u0015\u0000\u0148\u0147\u0001\u0000\u0000\u0000"+
		"\u0148\u0149\u0001\u0000\u0000\u0000\u0149\u014d\u0001\u0000\u0000\u0000"+
		"\u014a\u014c\u0003\u000e\u0007\u0000\u014b\u014a\u0001\u0000\u0000\u0000"+
		"\u014c\u014f\u0001\u0000\u0000\u0000\u014d\u014b\u0001\u0000\u0000\u0000"+
		"\u014d\u014e\u0001\u0000\u0000\u0000\u014e\u0150\u0001\u0000\u0000\u0000"+
		"\u014f\u014d\u0001\u0000\u0000\u0000\u0150\u0151\u0005\u0016\u0000\u0000"+
		"\u0151\u0153\u0001\u0000\u0000\u0000\u0152\u012c\u0001\u0000\u0000\u0000"+
		"\u0152\u013a\u0001\u0000\u0000\u0000\u0153+\u0001\u0000\u0000\u0000\u0154"+
		"\u0155\u0005+\u0000\u0000\u0155\u0156\u0005\u0018\u0000\u0000\u0156\u0157"+
		"\u0005+\u0000\u0000\u0157-\u0001\u0000\u0000\u0000\u0158\u015b\u0005\u0019"+
		"\u0000\u0000\u0159\u015c\u0005.\u0000\u0000\u015a\u015c\u0003\u0002\u0001"+
		"\u0000\u015b\u0159\u0001\u0000\u0000\u0000\u015b\u015a\u0001\u0000\u0000"+
		"\u0000\u015c\u015d\u0001\u0000\u0000\u0000\u015d\u0166\u0005\u001a\u0000"+
		"\u0000\u015e\u0161\u0005+\u0000\u0000\u015f\u0161\u0003,\u0016\u0000\u0160"+
		"\u015e\u0001\u0000\u0000\u0000\u0160\u015f\u0001\u0000\u0000\u0000\u0161"+
		"\u0162\u0001\u0000\u0000\u0000\u0162\u0163\u0005\u000b\u0000\u0000\u0163"+
		"\u0165\u0003\u000e\u0007\u0000\u0164\u0160\u0001\u0000\u0000\u0000\u0165"+
		"\u0168\u0001\u0000\u0000\u0000\u0166\u0164\u0001\u0000\u0000\u0000\u0166"+
		"\u0167\u0001\u0000\u0000\u0000\u0167\u016b\u0001\u0000\u0000\u0000\u0168"+
		"\u0166\u0001\u0000\u0000\u0000\u0169\u016a\u0005\u0017\u0000\u0000\u016a"+
		"\u016c\u0003\u000e\u0007\u0000\u016b\u0169\u0001\u0000\u0000\u0000\u016b"+
		"\u016c\u0001\u0000\u0000\u0000\u016c\u016d\u0001\u0000\u0000\u0000\u016d"+
		"\u016e\u0005\u001b\u0000\u0000\u016e/\u0001\u0000\u0000\u0000\u016f\u0170"+
		"\u0005\u001c\u0000\u0000\u0170\u0171\u0003\u001e\u000f\u0000\u0171\u0173"+
		"\u0005\u001d\u0000\u0000\u0172\u0174\u00030\u0018\u0000\u0173\u0172\u0001"+
		"\u0000\u0000\u0000\u0173\u0174\u0001\u0000\u0000\u0000\u0174\u0178\u0001"+
		"\u0000\u0000\u0000\u0175\u0177\u0003\u000e\u0007\u0000\u0176\u0175\u0001"+
		"\u0000\u0000\u0000\u0177\u017a\u0001\u0000\u0000\u0000\u0178\u0176\u0001"+
		"\u0000\u0000\u0000\u0178\u0179\u0001\u0000\u0000\u0000\u0179\u017b\u0001"+
		"\u0000\u0000\u0000\u017a\u0178\u0001\u0000\u0000\u0000\u017b\u017c\u0005"+
		"\u001e\u0000\u0000\u017c1\u0001\u0000\u0000\u0000\u017d\u0181\u0005\u001d"+
		"\u0000\u0000\u017e\u0180\u0003\u000e\u0007\u0000\u017f\u017e\u0001\u0000"+
		"\u0000\u0000\u0180\u0183\u0001\u0000\u0000\u0000\u0181\u017f\u0001\u0000"+
		"\u0000\u0000\u0181\u0182\u0001\u0000\u0000\u0000\u0182\u0184\u0001\u0000"+
		"\u0000\u0000\u0183\u0181\u0001\u0000\u0000\u0000\u0184\u0185\u0005\u001f"+
		"\u0000\u0000\u0185\u0186\u0003\u001e\u000f\u0000\u01863\u0001\u0000\u0000"+
		"\u0000\u0187\u018a\u0005 \u0000\u0000\u0188\u018b\u0005.\u0000\u0000\u0189"+
		"\u018b\u0003\u0002\u0001\u0000\u018a\u0188\u0001\u0000\u0000\u0000\u018a"+
		"\u0189\u0001\u0000\u0000\u0000\u018b\u018c\u0001\u0000\u0000\u0000\u018c"+
		"\u018d\u0005\b\u0000\u0000\u018d\u018e\u0005+\u0000\u0000\u018e\u0194"+
		"\u0005\u001f\u0000\u0000\u018f\u0195\u0005+\u0000\u0000\u0190\u0193\u0005"+
		".\u0000\u0000\u0191\u0193\u0003\u0002\u0001\u0000\u0192\u0190\u0001\u0000"+
		"\u0000\u0000\u0192\u0191\u0001\u0000\u0000\u0000\u0193\u0195\u0001\u0000"+
		"\u0000\u0000\u0194\u018f\u0001\u0000\u0000\u0000\u0194\u0192\u0001\u0000"+
		"\u0000\u0000\u0195\u0196\u0001\u0000\u0000\u0000\u0196\u0198\u0005\u001d"+
		"\u0000\u0000\u0197\u0199\u00034\u001a\u0000\u0198\u0197\u0001\u0000\u0000"+
		"\u0000\u0198\u0199\u0001\u0000\u0000\u0000\u0199\u019d\u0001\u0000\u0000"+
		"\u0000\u019a\u019c\u0003\u000e\u0007\u0000\u019b\u019a\u0001\u0000\u0000"+
		"\u0000\u019c\u019f\u0001\u0000\u0000\u0000\u019d\u019b\u0001\u0000\u0000"+
		"\u0000\u019d\u019e\u0001\u0000\u0000\u0000\u019e\u01a0\u0001\u0000\u0000"+
		"\u0000\u019f\u019d\u0001\u0000\u0000\u0000\u01a0\u01a1\u0005!\u0000\u0000"+
		"\u01a15\u0001\u0000\u0000\u0000\u01a2\u01a3\u0005\"\u0000\u0000\u01a3"+
		"\u01a4\u0003\f\u0006\u0000\u01a4\u01a5\u0005#\u0000\u0000\u01a57\u0001"+
		"\u0000\u0000\u0000\u01a6\u01ac\u0005.\u0000\u0000\u01a7\u01ac\u0003\u0002"+
		"\u0001\u0000\u01a8\u01ac\u0005+\u0000\u0000\u01a9\u01ac\u0005,\u0000\u0000"+
		"\u01aa\u01ac\u0003\u001a\r\u0000\u01ab\u01a6\u0001\u0000\u0000\u0000\u01ab"+
		"\u01a7\u0001\u0000\u0000\u0000\u01ab\u01a8\u0001\u0000\u0000\u0000\u01ab"+
		"\u01a9\u0001\u0000\u0000\u0000\u01ab\u01aa\u0001\u0000\u0000\u0000\u01ab"+
		"\u01ac\u0001\u0000\u0000\u0000\u01ac\u01b7\u0001\u0000\u0000\u0000\u01ad"+
		"\u01b3\u0005\n\u0000\u0000\u01ae\u01b4\u0005.\u0000\u0000\u01af\u01b4"+
		"\u0003\u0002\u0001\u0000\u01b0\u01b4\u0005+\u0000\u0000\u01b1\u01b4\u0005"+
		",\u0000\u0000\u01b2\u01b4\u0003\u001a\r\u0000\u01b3\u01ae\u0001\u0000"+
		"\u0000\u0000\u01b3\u01af\u0001\u0000\u0000\u0000\u01b3\u01b0\u0001\u0000"+
		"\u0000\u0000\u01b3\u01b1\u0001\u0000\u0000\u0000\u01b3\u01b2\u0001\u0000"+
		"\u0000\u0000\u01b4\u01b6\u0001\u0000\u0000\u0000\u01b5\u01ad\u0001\u0000"+
		"\u0000\u0000\u01b6\u01b9\u0001\u0000\u0000\u0000\u01b7\u01b5\u0001\u0000"+
		"\u0000\u0000\u01b7\u01b8\u0001\u0000\u0000\u0000\u01b89\u0001\u0000\u0000"+
		"\u0000\u01b9\u01b7\u0001\u0000\u0000\u0000\u01ba\u01bb\u0005.\u0000\u0000"+
		"\u01bb\u01bc\u00058\u0000\u0000\u01bc\u01bd\u00038\u001c\u0000\u01bd\u01be"+
		"\u00059\u0000\u0000\u01be;\u0001\u0000\u0000\u0000\u01bf\u01c0\u0005."+
		"\u0000\u0000\u01c0\u01c2\u0005\u000b\u0000\u0000\u01c1\u01c3\u0003\u0004"+
		"\u0002\u0000\u01c2\u01c1\u0001\u0000\u0000\u0000\u01c2\u01c3\u0001\u0000"+
		"\u0000\u0000\u01c3\u01c7\u0001\u0000\u0000\u0000\u01c4\u01c8\u0005*\u0000"+
		"\u0000\u01c5\u01c8\u0003\u0016\u000b\u0000\u01c6\u01c8\u0003\u0000\u0000"+
		"\u0000\u01c7\u01c4\u0001\u0000\u0000\u0000\u01c7\u01c5\u0001\u0000\u0000"+
		"\u0000\u01c7\u01c6\u0001\u0000\u0000\u0000\u01c8=\u0001\u0000\u0000\u0000"+
		"\u01c9\u01ca\u0005$\u0000\u0000\u01ca\u01cb\u0005.\u0000\u0000\u01cb\u01cd"+
		"\u00058\u0000\u0000\u01cc\u01ce\u0003<\u001e\u0000\u01cd\u01cc\u0001\u0000"+
		"\u0000\u0000\u01cd\u01ce\u0001\u0000\u0000\u0000\u01ce\u01d3\u0001\u0000"+
		"\u0000\u0000\u01cf\u01d0\u0005\n\u0000\u0000\u01d0\u01d2\u0003<\u001e"+
		"\u0000\u01d1\u01cf\u0001\u0000\u0000\u0000\u01d2\u01d5\u0001\u0000\u0000"+
		"\u0000\u01d3\u01d1\u0001\u0000\u0000\u0000\u01d3\u01d4\u0001\u0000\u0000"+
		"\u0000\u01d4\u01d6\u0001\u0000\u0000\u0000\u01d5\u01d3\u0001\u0000\u0000"+
		"\u0000\u01d6\u01d7\u00059\u0000\u0000\u01d7\u01da\u0005\u000b\u0000\u0000"+
		"\u01d8\u01db\u0005*\u0000\u0000\u01d9\u01db\u0003\u0000\u0000\u0000\u01da"+
		"\u01d8\u0001\u0000\u0000\u0000\u01da\u01d9\u0001\u0000\u0000\u0000\u01db"+
		"\u01df\u0001\u0000\u0000\u0000\u01dc\u01de\u0003\u000e\u0007\u0000\u01dd"+
		"\u01dc\u0001\u0000\u0000\u0000\u01de\u01e1\u0001\u0000\u0000\u0000\u01df"+
		"\u01dd\u0001\u0000\u0000\u0000\u01df\u01e0\u0001\u0000\u0000\u0000\u01e0"+
		"\u01e2\u0001\u0000\u0000\u0000\u01e1\u01df\u0001\u0000\u0000\u0000\u01e2"+
		"\u01e3\u0005%\u0000\u0000\u01e3?\u0001\u0000\u0000\u0000\u01e4\u01e7\u0005"+
		"&\u0000\u0000\u01e5\u01e8\u0003\u001a\r\u0000\u01e6\u01e8\u0003\u001e"+
		"\u000f\u0000\u01e7\u01e5\u0001\u0000\u0000\u0000\u01e7\u01e6\u0001\u0000"+
		"\u0000\u0000\u01e8A\u0001\u0000\u0000\u0000\u01e9\u01ea\u0005\'\u0000"+
		"\u0000\u01ea\u01eb\u0005.\u0000\u0000\u01eb\u01f2\u00058\u0000\u0000\u01ec"+
		"\u01ed\u0005(\u0000\u0000\u01ed\u01ee\u0005.\u0000\u0000\u01ee\u01ef\u0005"+
		"\u000b\u0000\u0000\u01ef\u01f1\u0003\u0000\u0000\u0000\u01f0\u01ec\u0001"+
		"\u0000\u0000\u0000\u01f1\u01f4\u0001\u0000\u0000\u0000\u01f2\u01f0\u0001"+
		"\u0000\u0000\u0000\u01f2\u01f3\u0001\u0000\u0000\u0000\u01f3\u01f5\u0001"+
		"\u0000\u0000\u0000\u01f4\u01f2\u0001\u0000\u0000\u0000\u01f5\u01f7\u0005"+
		"9\u0000\u0000\u01f6\u01f8\u0003\u0012\t\u0000\u01f7\u01f6\u0001\u0000"+
		"\u0000\u0000\u01f7\u01f8\u0001\u0000\u0000\u0000\u01f8\u01fa\u0001\u0000"+
		"\u0000\u0000\u01f9\u01fb\u0003\f\u0006\u0000\u01fa\u01f9\u0001\u0000\u0000"+
		"\u0000\u01fa\u01fb\u0001\u0000\u0000\u0000\u01fb\u01fc\u0001\u0000\u0000"+
		"\u0000\u01fc\u01fd\u0005)\u0000\u0000\u01fdC\u0001\u0000\u0000\u0000@"+
		"SY_ekrx|\u0085\u0091\u0094\u0098\u009e\u00a3\u00ab\u00b0\u00b5\u00c2\u00c9"+
		"\u00da\u00e0\u00e4\u00eb\u00f4\u00fd\u0103\u0107\u010b\u010f\u0118\u011c"+
		"\u0125\u0130\u0135\u013e\u0143\u0148\u014d\u0152\u015b\u0160\u0166\u016b"+
		"\u0173\u0178\u0181\u018a\u0192\u0194\u0198\u019d\u01ab\u01b3\u01b7\u01c2"+
		"\u01c7\u01cd\u01d3\u01da\u01df\u01e7\u01f2\u01f7\u01fa";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}