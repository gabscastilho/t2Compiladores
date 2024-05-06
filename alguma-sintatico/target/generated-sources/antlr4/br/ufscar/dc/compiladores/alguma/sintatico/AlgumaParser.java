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
		RULE_endereco = 3, RULE_comandoAtribuicao = 4, RULE_declaracao_tipo = 5, 
		RULE_declaracao_registro = 6, RULE_op_bool = 7, RULE_programa = 8, RULE_declaracao = 9, 
		RULE_expressaoAritmetica = 10, RULE_fatorAritmetico = 11, RULE_expressaoRelacional = 12, 
		RULE_termoRelacional = 13, RULE_listaComandos = 14, RULE_comando = 15, 
		RULE_entrada = 16, RULE_comandoEntrada = 17, RULE_saida = 18, RULE_comandoSaida = 19, 
		RULE_comandoCondicao = 20, RULE_intervalo = 21, RULE_comandoCaso = 22, 
		RULE_comandoEnquanto = 23, RULE_comandoFaca = 24, RULE_comandoPara = 25, 
		RULE_subAlgoritmo = 26, RULE_parametros_chamada_funcao = 27, RULE_chamada_funcao = 28, 
		RULE_parametros_declaracao_funcao = 29, RULE_retorno_funcao = 30, RULE_declaracao_funcao = 31, 
		RULE_procedimento = 32, RULE_declaracao_constante = 33;
	private static String[] makeRuleNames() {
		return new String[] {
			"var_personalizada", "var_registro", "ponteiro", "endereco", "comandoAtribuicao", 
			"declaracao_tipo", "declaracao_registro", "op_bool", "programa", "declaracao", 
			"expressaoAritmetica", "fatorAritmetico", "expressaoRelacional", "termoRelacional", 
			"listaComandos", "comando", "entrada", "comandoEntrada", "saida", "comandoSaida", 
			"comandoCondicao", "intervalo", "comandoCaso", "comandoEnquanto", "comandoFaca", 
			"comandoPara", "subAlgoritmo", "parametros_chamada_funcao", "chamada_funcao", 
			"parametros_declaracao_funcao", "retorno_funcao", "declaracao_funcao", 
			"procedimento", "declaracao_constante"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'.'", "'^'", "'&'", "'<-'", "'tipo'", "':'", "'registro'", "','", 
			"'fim_registro'", "'e'", "'ou'", "'algoritmo'", "'fim_algoritmo'", "'declare'", 
			"'nao'", "'='", "'leia'", "'escreva'", "'se'", "'entao'", "'fim_se'", 
			"'senao'", "'..'", "'caso'", "'seja'", "'fim_caso'", "'enquanto'", "'faca'", 
			"'fim_enquanto'", "'ate'", "'para'", "'fim_para'", "'INICIO'", "'FIM'", 
			"'retorne'", "'funcao'", "'fim_funcao'", "'procedimento'", "'var'", "'fim_procedimento'", 
			"'constante'", null, null, null, null, null, null, null, "'%'", null, 
			null, null, null, null, null, "'('", "')'", "'['", "']'"
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
		enterRule(_localctx, 8, RULE_comandoAtribuicao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(79);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(78);
				ponteiro();
				}
			}

			setState(83);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				{
				setState(81);
				match(VARIAVEL);
				}
				break;
			case 2:
				{
				setState(82);
				var_registro();
				}
				break;
			}
			setState(85);
			match(T__3);
			setState(94);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(86);
				endereco();
				setState(89);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
				case 1:
					{
					setState(87);
					match(VARIAVEL);
					}
					break;
				case 2:
					{
					setState(88);
					var_registro();
					}
					break;
				}
				}
				break;
			case 2:
				{
				setState(91);
				expressaoRelacional();
				}
				break;
			case 3:
				{
				setState(92);
				expressaoAritmetica();
				}
				break;
			case 4:
				{
				setState(93);
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
		enterRule(_localctx, 10, RULE_declaracao_tipo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(96);
			match(T__4);
			setState(97);
			match(VARIAVEL);
			setState(98);
			match(T__5);
			setState(99);
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
		enterRule(_localctx, 12, RULE_declaracao_registro);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
			match(T__6);
			setState(114);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VARIAVEL) {
				{
				{
				setState(102);
				match(VARIAVEL);
				setState(107);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__7) {
					{
					{
					setState(103);
					match(T__7);
					setState(104);
					match(VARIAVEL);
					}
					}
					setState(109);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(110);
				match(T__5);
				setState(111);
				match(TIPO_VAR);
				}
				}
				setState(116);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(117);
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
		enterRule(_localctx, 14, RULE_op_bool);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			_la = _input.LA(1);
			if ( !(_la==T__9 || _la==T__10) ) {
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
		enterRule(_localctx, 16, RULE_programa);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(124);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__40) {
				{
				{
				setState(121);
				declaracao_constante();
				}
				}
				setState(126);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(130);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__4) {
				{
				{
				setState(127);
				declaracao_tipo();
				}
				}
				setState(132);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(136);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__13) {
				{
				{
				setState(133);
				declaracao();
				}
				}
				setState(138);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(142);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__37) {
				{
				{
				setState(139);
				procedimento();
				}
				}
				setState(144);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(148);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__35) {
				{
				{
				setState(145);
				declaracao_funcao();
				}
				}
				setState(150);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(151);
			match(T__11);
			setState(155);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__40) {
				{
				{
				setState(152);
				declaracao_constante();
				}
				}
				setState(157);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(161);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__13) {
				{
				{
				setState(158);
				declaracao();
				}
				}
				setState(163);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(165);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((_la) & ~0x3f) == 0 && ((1L << _la) & 70414261682180L) != 0) {
				{
				setState(164);
				listaComandos();
				}
			}

			setState(167);
			match(T__12);
			setState(168);
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
			setState(170);
			match(T__13);
			setState(171);
			match(VARIAVEL);
			setState(176);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__7) {
				{
				{
				setState(172);
				match(T__7);
				setState(173);
				match(VARIAVEL);
				}
				}
				setState(178);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(179);
			match(T__5);
			setState(181);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(180);
				ponteiro();
				}
			}

			setState(186);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TIPO_VAR:
				{
				setState(183);
				match(TIPO_VAR);
				}
				break;
			case T__6:
				{
				setState(184);
				declaracao_registro();
				}
				break;
			case VARIAVEL:
				{
				setState(185);
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
		enterRule(_localctx, 20, RULE_expressaoAritmetica);
		int _la;
		try {
			setState(193);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(188);
				fatorAritmetico();
				setState(189);
				_la = _input.LA(1);
				if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 985162418487296L) != 0) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(190);
				expressaoAritmetica();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(192);
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
		enterRule(_localctx, 22, RULE_fatorAritmetico);
		int _la;
		try {
			setState(210);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(195);
				match(NUMINT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(196);
				match(NUMREAL);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(197);
				chamada_funcao();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(199);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__1) {
					{
					setState(198);
					ponteiro();
					}
				}

				setState(203);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
				case 1:
					{
					setState(201);
					match(VARIAVEL);
					}
					break;
				case 2:
					{
					setState(202);
					var_registro();
					}
					break;
				}
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(205);
				match(ABRE_PAR);
				setState(206);
				expressaoAritmetica();
				setState(207);
				match(FECHA_PAR);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(209);
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
		enterRule(_localctx, 24, RULE_expressaoRelacional);
		try {
			setState(219);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(212);
				termoRelacional();
				setState(213);
				op_bool();
				setState(214);
				expressaoRelacional();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(216);
				match(T__14);
				}
				setState(217);
				expressaoRelacional();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(218);
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
		enterRule(_localctx, 26, RULE_termoRelacional);
		int _la;
		try {
			setState(234);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(221);
				expressaoAritmetica();
				setState(222);
				_la = _input.LA(1);
				if ( !(_la==T__15 || _la==OP_REL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(223);
				expressaoAritmetica();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(225);
				expressaoAritmetica();
				setState(228);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__15 || _la==OP_REL) {
					{
					setState(226);
					_la = _input.LA(1);
					if ( !(_la==T__15 || _la==OP_REL) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(227);
					expressaoAritmetica();
					}
				}

				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(230);
				match(ABRE_PAR);
				setState(231);
				expressaoRelacional();
				setState(232);
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
		enterRule(_localctx, 28, RULE_listaComandos);
		try {
			setState(240);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(236);
				comando();
				setState(237);
				listaComandos();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(239);
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
		enterRule(_localctx, 30, RULE_comando);
		try {
			setState(252);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
			case VARIAVEL:
				enterOuterAlt(_localctx, 1);
				{
				setState(242);
				comandoAtribuicao();
				}
				break;
			case T__16:
				enterOuterAlt(_localctx, 2);
				{
				setState(243);
				comandoEntrada();
				}
				break;
			case T__17:
				enterOuterAlt(_localctx, 3);
				{
				setState(244);
				comandoSaida();
				}
				break;
			case T__18:
				enterOuterAlt(_localctx, 4);
				{
				setState(245);
				comandoCondicao();
				}
				break;
			case T__32:
				enterOuterAlt(_localctx, 5);
				{
				setState(246);
				subAlgoritmo();
				}
				break;
			case T__23:
				enterOuterAlt(_localctx, 6);
				{
				setState(247);
				comandoCaso();
				}
				break;
			case T__30:
				enterOuterAlt(_localctx, 7);
				{
				setState(248);
				comandoPara();
				}
				break;
			case T__26:
				enterOuterAlt(_localctx, 8);
				{
				setState(249);
				comandoEnquanto();
				}
				break;
			case T__27:
				enterOuterAlt(_localctx, 9);
				{
				setState(250);
				comandoFaca();
				}
				break;
			case T__34:
				enterOuterAlt(_localctx, 10);
				{
				setState(251);
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
		enterRule(_localctx, 32, RULE_entrada);
		try {
			setState(264);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(256);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
				case 1:
					{
					setState(254);
					match(VARIAVEL);
					}
					break;
				case 2:
					{
					setState(255);
					var_registro();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(260);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
				case 1:
					{
					setState(258);
					match(VARIAVEL);
					}
					break;
				case 2:
					{
					setState(259);
					var_registro();
					}
					break;
				}
				setState(262);
				match(T__7);
				setState(263);
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
		enterRule(_localctx, 34, RULE_comandoEntrada);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(266);
			match(T__16);
			setState(267);
			match(ABRE_PAR);
			setState(268);
			entrada();
			setState(269);
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
		enterRule(_localctx, 36, RULE_saida);
		try {
			setState(286);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(273);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
				case 1:
					{
					setState(271);
					match(VARIAVEL);
					}
					break;
				case 2:
					{
					setState(272);
					var_registro();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(277);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
				case 1:
					{
					setState(275);
					match(VARIAVEL);
					}
					break;
				case 2:
					{
					setState(276);
					var_registro();
					}
					break;
				}
				setState(279);
				match(T__7);
				setState(280);
				saida();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(281);
				match(CADEIA);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(282);
				match(CADEIA);
				setState(283);
				match(T__7);
				setState(284);
				saida();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(285);
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
		enterRule(_localctx, 38, RULE_comandoSaida);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(288);
			match(T__17);
			setState(289);
			match(ABRE_PAR);
			setState(290);
			saida();
			setState(291);
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
		enterRule(_localctx, 40, RULE_comandoCondicao);
		int _la;
		try {
			setState(331);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(293);
				match(T__18);
				setState(294);
				expressaoRelacional();
				setState(295);
				match(T__19);
				setState(297);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
				case 1:
					{
					setState(296);
					comandoCondicao();
					}
					break;
				}
				setState(302);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((_la) & ~0x3f) == 0 && ((1L << _la) & 70414261682180L) != 0) {
					{
					{
					setState(299);
					comando();
					}
					}
					setState(304);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(305);
				match(T__20);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(307);
				match(T__18);
				setState(308);
				expressaoRelacional();
				setState(309);
				match(T__19);
				setState(311);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
				case 1:
					{
					setState(310);
					comandoCondicao();
					}
					break;
				}
				setState(316);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((_la) & ~0x3f) == 0 && ((1L << _la) & 70414261682180L) != 0) {
					{
					{
					setState(313);
					comando();
					}
					}
					setState(318);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(319);
				match(T__21);
				setState(321);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
				case 1:
					{
					setState(320);
					comandoCondicao();
					}
					break;
				}
				setState(326);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((_la) & ~0x3f) == 0 && ((1L << _la) & 70414261682180L) != 0) {
					{
					{
					setState(323);
					comando();
					}
					}
					setState(328);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(329);
				match(T__20);
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
		enterRule(_localctx, 42, RULE_intervalo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(333);
			match(NUMINT);
			setState(334);
			match(T__22);
			setState(335);
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
		enterRule(_localctx, 44, RULE_comandoCaso);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(337);
			match(T__23);
			setState(340);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				{
				setState(338);
				match(VARIAVEL);
				}
				break;
			case 2:
				{
				setState(339);
				var_registro();
				}
				break;
			}
			setState(342);
			match(T__24);
			setState(351);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NUMINT) {
				{
				{
				setState(345);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
				case 1:
					{
					setState(343);
					match(NUMINT);
					}
					break;
				case 2:
					{
					setState(344);
					intervalo();
					}
					break;
				}
				setState(347);
				match(T__5);
				setState(348);
				comando();
				}
				}
				setState(353);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(356);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__21) {
				{
				setState(354);
				match(T__21);
				setState(355);
				comando();
				}
			}

			setState(358);
			match(T__25);
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
		enterRule(_localctx, 46, RULE_comandoEnquanto);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(360);
			match(T__26);
			setState(361);
			expressaoRelacional();
			setState(362);
			match(T__27);
			setState(364);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				{
				setState(363);
				comandoEnquanto();
				}
				break;
			}
			setState(369);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((_la) & ~0x3f) == 0 && ((1L << _la) & 70414261682180L) != 0) {
				{
				{
				setState(366);
				comando();
				}
				}
				setState(371);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(372);
			match(T__28);
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
		enterRule(_localctx, 48, RULE_comandoFaca);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(374);
			match(T__27);
			setState(378);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((_la) & ~0x3f) == 0 && ((1L << _la) & 70414261682180L) != 0) {
				{
				{
				setState(375);
				comando();
				}
				}
				setState(380);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(381);
			match(T__29);
			setState(382);
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
		enterRule(_localctx, 50, RULE_comandoPara);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(384);
			match(T__30);
			setState(387);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
			case 1:
				{
				setState(385);
				match(VARIAVEL);
				}
				break;
			case 2:
				{
				setState(386);
				var_registro();
				}
				break;
			}
			setState(389);
			match(T__3);
			setState(390);
			match(NUMINT);
			setState(391);
			match(T__29);
			setState(397);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMINT:
				{
				setState(392);
				match(NUMINT);
				}
				break;
			case VARIAVEL:
				{
				setState(395);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
				case 1:
					{
					setState(393);
					match(VARIAVEL);
					}
					break;
				case 2:
					{
					setState(394);
					var_registro();
					}
					break;
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(399);
			match(T__27);
			setState(401);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
			case 1:
				{
				setState(400);
				comandoPara();
				}
				break;
			}
			setState(406);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((_la) & ~0x3f) == 0 && ((1L << _la) & 70414261682180L) != 0) {
				{
				{
				setState(403);
				comando();
				}
				}
				setState(408);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(409);
			match(T__31);
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
		enterRule(_localctx, 52, RULE_subAlgoritmo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(411);
			match(T__32);
			setState(412);
			listaComandos();
			setState(413);
			match(T__33);
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
		enterRule(_localctx, 54, RULE_parametros_chamada_funcao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(420);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
			case 1:
				{
				setState(415);
				match(VARIAVEL);
				}
				break;
			case 2:
				{
				setState(416);
				var_registro();
				}
				break;
			case 3:
				{
				setState(417);
				match(NUMINT);
				}
				break;
			case 4:
				{
				setState(418);
				match(NUMREAL);
				}
				break;
			case 5:
				{
				setState(419);
				expressaoAritmetica();
				}
				break;
			}
			setState(432);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__7) {
				{
				{
				setState(422);
				match(T__7);
				setState(428);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
				case 1:
					{
					setState(423);
					match(VARIAVEL);
					}
					break;
				case 2:
					{
					setState(424);
					var_registro();
					}
					break;
				case 3:
					{
					setState(425);
					match(NUMINT);
					}
					break;
				case 4:
					{
					setState(426);
					match(NUMREAL);
					}
					break;
				case 5:
					{
					setState(427);
					expressaoAritmetica();
					}
					break;
				}
				}
				}
				setState(434);
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
		enterRule(_localctx, 56, RULE_chamada_funcao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(435);
			match(VARIAVEL);
			setState(436);
			match(ABRE_PAR);
			setState(437);
			parametros_chamada_funcao();
			setState(438);
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
		enterRule(_localctx, 58, RULE_parametros_declaracao_funcao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(440);
			match(VARIAVEL);
			setState(441);
			match(T__5);
			setState(443);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(442);
				ponteiro();
				}
			}

			setState(448);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TIPO_VAR:
				{
				setState(445);
				match(TIPO_VAR);
				}
				break;
			case T__6:
				{
				setState(446);
				declaracao_registro();
				}
				break;
			case VARIAVEL:
				{
				setState(447);
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
		enterRule(_localctx, 60, RULE_retorno_funcao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(450);
			match(T__34);
			setState(453);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,56,_ctx) ) {
			case 1:
				{
				setState(451);
				expressaoAritmetica();
				}
				break;
			case 2:
				{
				setState(452);
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
			setState(455);
			match(T__35);
			setState(456);
			match(VARIAVEL);
			setState(457);
			match(ABRE_PAR);
			setState(459);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VARIAVEL) {
				{
				setState(458);
				parametros_declaracao_funcao();
				}
			}

			setState(465);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__7) {
				{
				{
				setState(461);
				match(T__7);
				setState(462);
				parametros_declaracao_funcao();
				}
				}
				setState(467);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(468);
			match(FECHA_PAR);
			setState(469);
			match(T__5);
			setState(472);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TIPO_VAR:
				{
				setState(470);
				match(TIPO_VAR);
				}
				break;
			case VARIAVEL:
				{
				setState(471);
				var_personalizada();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(477);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((_la) & ~0x3f) == 0 && ((1L << _la) & 70414261682180L) != 0) {
				{
				{
				setState(474);
				comando();
				}
				}
				setState(479);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(480);
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
		enterRule(_localctx, 64, RULE_procedimento);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(482);
			match(T__37);
			setState(483);
			match(VARIAVEL);
			setState(484);
			match(ABRE_PAR);
			setState(491);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__38) {
				{
				{
				setState(485);
				match(T__38);
				setState(486);
				match(VARIAVEL);
				setState(487);
				match(T__5);
				setState(488);
				var_personalizada();
				}
				}
				setState(493);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(494);
			match(FECHA_PAR);
			setState(496);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__13) {
				{
				setState(495);
				declaracao();
				}
			}

			setState(499);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((_la) & ~0x3f) == 0 && ((1L << _la) & 70414261682180L) != 0) {
				{
				setState(498);
				listaComandos();
				}
			}

			setState(501);
			match(T__39);
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
		enterRule(_localctx, 66, RULE_declaracao_constante);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(503);
			match(T__40);
			setState(504);
			match(VARIAVEL);
			setState(505);
			match(T__5);
			setState(506);
			match(TIPO_VAR);
			setState(507);
			match(T__15);
			setState(508);
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
		"\u0002\u0001\u0003\u0001\u0003\u0001\u0004\u0003\u0004P\b\u0004\u0001"+
		"\u0004\u0001\u0004\u0003\u0004T\b\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0003\u0004Z\b\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0003\u0004_\b\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0005"+
		"\u0006j\b\u0006\n\u0006\f\u0006m\t\u0006\u0001\u0006\u0001\u0006\u0005"+
		"\u0006q\b\u0006\n\u0006\f\u0006t\t\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0007\u0001\u0007\u0001\b\u0005\b{\b\b\n\b\f\b~\t\b\u0001\b\u0005\b\u0081"+
		"\b\b\n\b\f\b\u0084\t\b\u0001\b\u0005\b\u0087\b\b\n\b\f\b\u008a\t\b\u0001"+
		"\b\u0005\b\u008d\b\b\n\b\f\b\u0090\t\b\u0001\b\u0005\b\u0093\b\b\n\b\f"+
		"\b\u0096\t\b\u0001\b\u0001\b\u0005\b\u009a\b\b\n\b\f\b\u009d\t\b\u0001"+
		"\b\u0005\b\u00a0\b\b\n\b\f\b\u00a3\t\b\u0001\b\u0003\b\u00a6\b\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0005\t\u00af\b\t\n"+
		"\t\f\t\u00b2\t\t\u0001\t\u0001\t\u0003\t\u00b6\b\t\u0001\t\u0001\t\u0001"+
		"\t\u0003\t\u00bb\b\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0003\n\u00c2"+
		"\b\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u00c8"+
		"\b\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u00cc\b\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u00d3\b\u000b"+
		"\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0003\f\u00dc"+
		"\b\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0003\r\u00e5"+
		"\b\r\u0001\r\u0001\r\u0001\r\u0001\r\u0003\r\u00eb\b\r\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u00f1\b\u000e\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0003\u000f\u00fd\b\u000f\u0001\u0010\u0001"+
		"\u0010\u0003\u0010\u0101\b\u0010\u0001\u0010\u0001\u0010\u0003\u0010\u0105"+
		"\b\u0010\u0001\u0010\u0001\u0010\u0003\u0010\u0109\b\u0010\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012"+
		"\u0003\u0012\u0112\b\u0012\u0001\u0012\u0001\u0012\u0003\u0012\u0116\b"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0003\u0012\u011f\b\u0012\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0003\u0014\u012a\b\u0014\u0001\u0014\u0005\u0014\u012d\b\u0014"+
		"\n\u0014\f\u0014\u0130\t\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0003\u0014\u0138\b\u0014\u0001\u0014\u0005"+
		"\u0014\u013b\b\u0014\n\u0014\f\u0014\u013e\t\u0014\u0001\u0014\u0001\u0014"+
		"\u0003\u0014\u0142\b\u0014\u0001\u0014\u0005\u0014\u0145\b\u0014\n\u0014"+
		"\f\u0014\u0148\t\u0014\u0001\u0014\u0001\u0014\u0003\u0014\u014c\b\u0014"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0003\u0016\u0155\b\u0016\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0003\u0016\u015a\b\u0016\u0001\u0016\u0001\u0016\u0005\u0016\u015e\b"+
		"\u0016\n\u0016\f\u0016\u0161\t\u0016\u0001\u0016\u0001\u0016\u0003\u0016"+
		"\u0165\b\u0016\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0017"+
		"\u0001\u0017\u0003\u0017\u016d\b\u0017\u0001\u0017\u0005\u0017\u0170\b"+
		"\u0017\n\u0017\f\u0017\u0173\t\u0017\u0001\u0017\u0001\u0017\u0001\u0018"+
		"\u0001\u0018\u0005\u0018\u0179\b\u0018\n\u0018\f\u0018\u017c\t\u0018\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0003"+
		"\u0019\u0184\b\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0001\u0019\u0003\u0019\u018c\b\u0019\u0003\u0019\u018e\b\u0019"+
		"\u0001\u0019\u0001\u0019\u0003\u0019\u0192\b\u0019\u0001\u0019\u0005\u0019"+
		"\u0195\b\u0019\n\u0019\f\u0019\u0198\t\u0019\u0001\u0019\u0001\u0019\u0001"+
		"\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001b\u0001\u001b\u0001"+
		"\u001b\u0001\u001b\u0001\u001b\u0003\u001b\u01a5\b\u001b\u0001\u001b\u0001"+
		"\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0003\u001b\u01ad"+
		"\b\u001b\u0005\u001b\u01af\b\u001b\n\u001b\f\u001b\u01b2\t\u001b\u0001"+
		"\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001d\u0001"+
		"\u001d\u0001\u001d\u0003\u001d\u01bc\b\u001d\u0001\u001d\u0001\u001d\u0001"+
		"\u001d\u0003\u001d\u01c1\b\u001d\u0001\u001e\u0001\u001e\u0001\u001e\u0003"+
		"\u001e\u01c6\b\u001e\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0003"+
		"\u001f\u01cc\b\u001f\u0001\u001f\u0001\u001f\u0005\u001f\u01d0\b\u001f"+
		"\n\u001f\f\u001f\u01d3\t\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001"+
		"\u001f\u0003\u001f\u01d9\b\u001f\u0001\u001f\u0005\u001f\u01dc\b\u001f"+
		"\n\u001f\f\u001f\u01df\t\u001f\u0001\u001f\u0001\u001f\u0001 \u0001 \u0001"+
		" \u0001 \u0001 \u0001 \u0001 \u0005 \u01ea\b \n \f \u01ed\t \u0001 \u0001"+
		" \u0003 \u01f1\b \u0001 \u0003 \u01f4\b \u0001 \u0001 \u0001!\u0001!\u0001"+
		"!\u0001!\u0001!\u0001!\u0001!\u0001!\u0000\u0000\"\u0000\u0002\u0004\u0006"+
		"\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,."+
		"02468:<>@B\u0000\u0004\u0001\u0000\n\u000b\u0001\u0000/1\u0002\u0000\u0010"+
		"\u001022\u0001\u0000+-\u0238\u0000D\u0001\u0000\u0000\u0000\u0002F\u0001"+
		"\u0000\u0000\u0000\u0004J\u0001\u0000\u0000\u0000\u0006L\u0001\u0000\u0000"+
		"\u0000\bO\u0001\u0000\u0000\u0000\n`\u0001\u0000\u0000\u0000\fe\u0001"+
		"\u0000\u0000\u0000\u000ew\u0001\u0000\u0000\u0000\u0010|\u0001\u0000\u0000"+
		"\u0000\u0012\u00aa\u0001\u0000\u0000\u0000\u0014\u00c1\u0001\u0000\u0000"+
		"\u0000\u0016\u00d2\u0001\u0000\u0000\u0000\u0018\u00db\u0001\u0000\u0000"+
		"\u0000\u001a\u00ea\u0001\u0000\u0000\u0000\u001c\u00f0\u0001\u0000\u0000"+
		"\u0000\u001e\u00fc\u0001\u0000\u0000\u0000 \u0108\u0001\u0000\u0000\u0000"+
		"\"\u010a\u0001\u0000\u0000\u0000$\u011e\u0001\u0000\u0000\u0000&\u0120"+
		"\u0001\u0000\u0000\u0000(\u014b\u0001\u0000\u0000\u0000*\u014d\u0001\u0000"+
		"\u0000\u0000,\u0151\u0001\u0000\u0000\u0000.\u0168\u0001\u0000\u0000\u0000"+
		"0\u0176\u0001\u0000\u0000\u00002\u0180\u0001\u0000\u0000\u00004\u019b"+
		"\u0001\u0000\u0000\u00006\u01a4\u0001\u0000\u0000\u00008\u01b3\u0001\u0000"+
		"\u0000\u0000:\u01b8\u0001\u0000\u0000\u0000<\u01c2\u0001\u0000\u0000\u0000"+
		">\u01c7\u0001\u0000\u0000\u0000@\u01e2\u0001\u0000\u0000\u0000B\u01f7"+
		"\u0001\u0000\u0000\u0000DE\u0005.\u0000\u0000E\u0001\u0001\u0000\u0000"+
		"\u0000FG\u0005.\u0000\u0000GH\u0005\u0001\u0000\u0000HI\u0005.\u0000\u0000"+
		"I\u0003\u0001\u0000\u0000\u0000JK\u0005\u0002\u0000\u0000K\u0005\u0001"+
		"\u0000\u0000\u0000LM\u0005\u0003\u0000\u0000M\u0007\u0001\u0000\u0000"+
		"\u0000NP\u0003\u0004\u0002\u0000ON\u0001\u0000\u0000\u0000OP\u0001\u0000"+
		"\u0000\u0000PS\u0001\u0000\u0000\u0000QT\u0005.\u0000\u0000RT\u0003\u0002"+
		"\u0001\u0000SQ\u0001\u0000\u0000\u0000SR\u0001\u0000\u0000\u0000TU\u0001"+
		"\u0000\u0000\u0000U^\u0005\u0004\u0000\u0000VY\u0003\u0006\u0003\u0000"+
		"WZ\u0005.\u0000\u0000XZ\u0003\u0002\u0001\u0000YW\u0001\u0000\u0000\u0000"+
		"YX\u0001\u0000\u0000\u0000Z_\u0001\u0000\u0000\u0000[_\u0003\u0018\f\u0000"+
		"\\_\u0003\u0014\n\u0000]_\u00038\u001c\u0000^V\u0001\u0000\u0000\u0000"+
		"^[\u0001\u0000\u0000\u0000^\\\u0001\u0000\u0000\u0000^]\u0001\u0000\u0000"+
		"\u0000_\t\u0001\u0000\u0000\u0000`a\u0005\u0005\u0000\u0000ab\u0005.\u0000"+
		"\u0000bc\u0005\u0006\u0000\u0000cd\u0003\f\u0006\u0000d\u000b\u0001\u0000"+
		"\u0000\u0000er\u0005\u0007\u0000\u0000fk\u0005.\u0000\u0000gh\u0005\b"+
		"\u0000\u0000hj\u0005.\u0000\u0000ig\u0001\u0000\u0000\u0000jm\u0001\u0000"+
		"\u0000\u0000ki\u0001\u0000\u0000\u0000kl\u0001\u0000\u0000\u0000ln\u0001"+
		"\u0000\u0000\u0000mk\u0001\u0000\u0000\u0000no\u0005\u0006\u0000\u0000"+
		"oq\u0005*\u0000\u0000pf\u0001\u0000\u0000\u0000qt\u0001\u0000\u0000\u0000"+
		"rp\u0001\u0000\u0000\u0000rs\u0001\u0000\u0000\u0000su\u0001\u0000\u0000"+
		"\u0000tr\u0001\u0000\u0000\u0000uv\u0005\t\u0000\u0000v\r\u0001\u0000"+
		"\u0000\u0000wx\u0007\u0000\u0000\u0000x\u000f\u0001\u0000\u0000\u0000"+
		"y{\u0003B!\u0000zy\u0001\u0000\u0000\u0000{~\u0001\u0000\u0000\u0000|"+
		"z\u0001\u0000\u0000\u0000|}\u0001\u0000\u0000\u0000}\u0082\u0001\u0000"+
		"\u0000\u0000~|\u0001\u0000\u0000\u0000\u007f\u0081\u0003\n\u0005\u0000"+
		"\u0080\u007f\u0001\u0000\u0000\u0000\u0081\u0084\u0001\u0000\u0000\u0000"+
		"\u0082\u0080\u0001\u0000\u0000\u0000\u0082\u0083\u0001\u0000\u0000\u0000"+
		"\u0083\u0088\u0001\u0000\u0000\u0000\u0084\u0082\u0001\u0000\u0000\u0000"+
		"\u0085\u0087\u0003\u0012\t\u0000\u0086\u0085\u0001\u0000\u0000\u0000\u0087"+
		"\u008a\u0001\u0000\u0000\u0000\u0088\u0086\u0001\u0000\u0000\u0000\u0088"+
		"\u0089\u0001\u0000\u0000\u0000\u0089\u008e\u0001\u0000\u0000\u0000\u008a"+
		"\u0088\u0001\u0000\u0000\u0000\u008b\u008d\u0003@ \u0000\u008c\u008b\u0001"+
		"\u0000\u0000\u0000\u008d\u0090\u0001\u0000\u0000\u0000\u008e\u008c\u0001"+
		"\u0000\u0000\u0000\u008e\u008f\u0001\u0000\u0000\u0000\u008f\u0094\u0001"+
		"\u0000\u0000\u0000\u0090\u008e\u0001\u0000\u0000\u0000\u0091\u0093\u0003"+
		">\u001f\u0000\u0092\u0091\u0001\u0000\u0000\u0000\u0093\u0096\u0001\u0000"+
		"\u0000\u0000\u0094\u0092\u0001\u0000\u0000\u0000\u0094\u0095\u0001\u0000"+
		"\u0000\u0000\u0095\u0097\u0001\u0000\u0000\u0000\u0096\u0094\u0001\u0000"+
		"\u0000\u0000\u0097\u009b\u0005\f\u0000\u0000\u0098\u009a\u0003B!\u0000"+
		"\u0099\u0098\u0001\u0000\u0000\u0000\u009a\u009d\u0001\u0000\u0000\u0000"+
		"\u009b\u0099\u0001\u0000\u0000\u0000\u009b\u009c\u0001\u0000\u0000\u0000"+
		"\u009c\u00a1\u0001\u0000\u0000\u0000\u009d\u009b\u0001\u0000\u0000\u0000"+
		"\u009e\u00a0\u0003\u0012\t\u0000\u009f\u009e\u0001\u0000\u0000\u0000\u00a0"+
		"\u00a3\u0001\u0000\u0000\u0000\u00a1\u009f\u0001\u0000\u0000\u0000\u00a1"+
		"\u00a2\u0001\u0000\u0000\u0000\u00a2\u00a5\u0001\u0000\u0000\u0000\u00a3"+
		"\u00a1\u0001\u0000\u0000\u0000\u00a4\u00a6\u0003\u001c\u000e\u0000\u00a5"+
		"\u00a4\u0001\u0000\u0000\u0000\u00a5\u00a6\u0001\u0000\u0000\u0000\u00a6"+
		"\u00a7\u0001\u0000\u0000\u0000\u00a7\u00a8\u0005\r\u0000\u0000\u00a8\u00a9"+
		"\u0005\u0000\u0000\u0001\u00a9\u0011\u0001\u0000\u0000\u0000\u00aa\u00ab"+
		"\u0005\u000e\u0000\u0000\u00ab\u00b0\u0005.\u0000\u0000\u00ac\u00ad\u0005"+
		"\b\u0000\u0000\u00ad\u00af\u0005.\u0000\u0000\u00ae\u00ac\u0001\u0000"+
		"\u0000\u0000\u00af\u00b2\u0001\u0000\u0000\u0000\u00b0\u00ae\u0001\u0000"+
		"\u0000\u0000\u00b0\u00b1\u0001\u0000\u0000\u0000\u00b1\u00b3\u0001\u0000"+
		"\u0000\u0000\u00b2\u00b0\u0001\u0000\u0000\u0000\u00b3\u00b5\u0005\u0006"+
		"\u0000\u0000\u00b4\u00b6\u0003\u0004\u0002\u0000\u00b5\u00b4\u0001\u0000"+
		"\u0000\u0000\u00b5\u00b6\u0001\u0000\u0000\u0000\u00b6\u00ba\u0001\u0000"+
		"\u0000\u0000\u00b7\u00bb\u0005*\u0000\u0000\u00b8\u00bb\u0003\f\u0006"+
		"\u0000\u00b9\u00bb\u0003\u0000\u0000\u0000\u00ba\u00b7\u0001\u0000\u0000"+
		"\u0000\u00ba\u00b8\u0001\u0000\u0000\u0000\u00ba\u00b9\u0001\u0000\u0000"+
		"\u0000\u00bb\u0013\u0001\u0000\u0000\u0000\u00bc\u00bd\u0003\u0016\u000b"+
		"\u0000\u00bd\u00be\u0007\u0001\u0000\u0000\u00be\u00bf\u0003\u0014\n\u0000"+
		"\u00bf\u00c2\u0001\u0000\u0000\u0000\u00c0\u00c2\u0003\u0016\u000b\u0000"+
		"\u00c1\u00bc\u0001\u0000\u0000\u0000\u00c1\u00c0\u0001\u0000\u0000\u0000"+
		"\u00c2\u0015\u0001\u0000\u0000\u0000\u00c3\u00d3\u0005+\u0000\u0000\u00c4"+
		"\u00d3\u0005,\u0000\u0000\u00c5\u00d3\u00038\u001c\u0000\u00c6\u00c8\u0003"+
		"\u0004\u0002\u0000\u00c7\u00c6\u0001\u0000\u0000\u0000\u00c7\u00c8\u0001"+
		"\u0000\u0000\u0000\u00c8\u00cb\u0001\u0000\u0000\u0000\u00c9\u00cc\u0005"+
		".\u0000\u0000\u00ca\u00cc\u0003\u0002\u0001\u0000\u00cb\u00c9\u0001\u0000"+
		"\u0000\u0000\u00cb\u00ca\u0001\u0000\u0000\u0000\u00cc\u00d3\u0001\u0000"+
		"\u0000\u0000\u00cd\u00ce\u00058\u0000\u0000\u00ce\u00cf\u0003\u0014\n"+
		"\u0000\u00cf\u00d0\u00059\u0000\u0000\u00d0\u00d3\u0001\u0000\u0000\u0000"+
		"\u00d1\u00d3\u0005-\u0000\u0000\u00d2\u00c3\u0001\u0000\u0000\u0000\u00d2"+
		"\u00c4\u0001\u0000\u0000\u0000\u00d2\u00c5\u0001\u0000\u0000\u0000\u00d2"+
		"\u00c7\u0001\u0000\u0000\u0000\u00d2\u00cd\u0001\u0000\u0000\u0000\u00d2"+
		"\u00d1\u0001\u0000\u0000\u0000\u00d3\u0017\u0001\u0000\u0000\u0000\u00d4"+
		"\u00d5\u0003\u001a\r\u0000\u00d5\u00d6\u0003\u000e\u0007\u0000\u00d6\u00d7"+
		"\u0003\u0018\f\u0000\u00d7\u00dc\u0001\u0000\u0000\u0000\u00d8\u00d9\u0005"+
		"\u000f\u0000\u0000\u00d9\u00dc\u0003\u0018\f\u0000\u00da\u00dc\u0003\u001a"+
		"\r\u0000\u00db\u00d4\u0001\u0000\u0000\u0000\u00db\u00d8\u0001\u0000\u0000"+
		"\u0000\u00db\u00da\u0001\u0000\u0000\u0000\u00dc\u0019\u0001\u0000\u0000"+
		"\u0000\u00dd\u00de\u0003\u0014\n\u0000\u00de\u00df\u0007\u0002\u0000\u0000"+
		"\u00df\u00e0\u0003\u0014\n\u0000\u00e0\u00eb\u0001\u0000\u0000\u0000\u00e1"+
		"\u00e4\u0003\u0014\n\u0000\u00e2\u00e3\u0007\u0002\u0000\u0000\u00e3\u00e5"+
		"\u0003\u0014\n\u0000\u00e4\u00e2\u0001\u0000\u0000\u0000\u00e4\u00e5\u0001"+
		"\u0000\u0000\u0000\u00e5\u00eb\u0001\u0000\u0000\u0000\u00e6\u00e7\u0005"+
		"8\u0000\u0000\u00e7\u00e8\u0003\u0018\f\u0000\u00e8\u00e9\u00059\u0000"+
		"\u0000\u00e9\u00eb\u0001\u0000\u0000\u0000\u00ea\u00dd\u0001\u0000\u0000"+
		"\u0000\u00ea\u00e1\u0001\u0000\u0000\u0000\u00ea\u00e6\u0001\u0000\u0000"+
		"\u0000\u00eb\u001b\u0001\u0000\u0000\u0000\u00ec\u00ed\u0003\u001e\u000f"+
		"\u0000\u00ed\u00ee\u0003\u001c\u000e\u0000\u00ee\u00f1\u0001\u0000\u0000"+
		"\u0000\u00ef\u00f1\u0003\u001e\u000f\u0000\u00f0\u00ec\u0001\u0000\u0000"+
		"\u0000\u00f0\u00ef\u0001\u0000\u0000\u0000\u00f1\u001d\u0001\u0000\u0000"+
		"\u0000\u00f2\u00fd\u0003\b\u0004\u0000\u00f3\u00fd\u0003\"\u0011\u0000"+
		"\u00f4\u00fd\u0003&\u0013\u0000\u00f5\u00fd\u0003(\u0014\u0000\u00f6\u00fd"+
		"\u00034\u001a\u0000\u00f7\u00fd\u0003,\u0016\u0000\u00f8\u00fd\u00032"+
		"\u0019\u0000\u00f9\u00fd\u0003.\u0017\u0000\u00fa\u00fd\u00030\u0018\u0000"+
		"\u00fb\u00fd\u0003<\u001e\u0000\u00fc\u00f2\u0001\u0000\u0000\u0000\u00fc"+
		"\u00f3\u0001\u0000\u0000\u0000\u00fc\u00f4\u0001\u0000\u0000\u0000\u00fc"+
		"\u00f5\u0001\u0000\u0000\u0000\u00fc\u00f6\u0001\u0000\u0000\u0000\u00fc"+
		"\u00f7\u0001\u0000\u0000\u0000\u00fc\u00f8\u0001\u0000\u0000\u0000\u00fc"+
		"\u00f9\u0001\u0000\u0000\u0000\u00fc\u00fa\u0001\u0000\u0000\u0000\u00fc"+
		"\u00fb\u0001\u0000\u0000\u0000\u00fd\u001f\u0001\u0000\u0000\u0000\u00fe"+
		"\u0101\u0005.\u0000\u0000\u00ff\u0101\u0003\u0002\u0001\u0000\u0100\u00fe"+
		"\u0001\u0000\u0000\u0000\u0100\u00ff\u0001\u0000\u0000\u0000\u0101\u0109"+
		"\u0001\u0000\u0000\u0000\u0102\u0105\u0005.\u0000\u0000\u0103\u0105\u0003"+
		"\u0002\u0001\u0000\u0104\u0102\u0001\u0000\u0000\u0000\u0104\u0103\u0001"+
		"\u0000\u0000\u0000\u0105\u0106\u0001\u0000\u0000\u0000\u0106\u0107\u0005"+
		"\b\u0000\u0000\u0107\u0109\u0003 \u0010\u0000\u0108\u0100\u0001\u0000"+
		"\u0000\u0000\u0108\u0104\u0001\u0000\u0000\u0000\u0109!\u0001\u0000\u0000"+
		"\u0000\u010a\u010b\u0005\u0011\u0000\u0000\u010b\u010c\u00058\u0000\u0000"+
		"\u010c\u010d\u0003 \u0010\u0000\u010d\u010e\u00059\u0000\u0000\u010e#"+
		"\u0001\u0000\u0000\u0000\u010f\u0112\u0005.\u0000\u0000\u0110\u0112\u0003"+
		"\u0002\u0001\u0000\u0111\u010f\u0001\u0000\u0000\u0000\u0111\u0110\u0001"+
		"\u0000\u0000\u0000\u0112\u011f\u0001\u0000\u0000\u0000\u0113\u0116\u0005"+
		".\u0000\u0000\u0114\u0116\u0003\u0002\u0001\u0000\u0115\u0113\u0001\u0000"+
		"\u0000\u0000\u0115\u0114\u0001\u0000\u0000\u0000\u0116\u0117\u0001\u0000"+
		"\u0000\u0000\u0117\u0118\u0005\b\u0000\u0000\u0118\u011f\u0003$\u0012"+
		"\u0000\u0119\u011f\u0005-\u0000\u0000\u011a\u011b\u0005-\u0000\u0000\u011b"+
		"\u011c\u0005\b\u0000\u0000\u011c\u011f\u0003$\u0012\u0000\u011d\u011f"+
		"\u0003\u0018\f\u0000\u011e\u0111\u0001\u0000\u0000\u0000\u011e\u0115\u0001"+
		"\u0000\u0000\u0000\u011e\u0119\u0001\u0000\u0000\u0000\u011e\u011a\u0001"+
		"\u0000\u0000\u0000\u011e\u011d\u0001\u0000\u0000\u0000\u011f%\u0001\u0000"+
		"\u0000\u0000\u0120\u0121\u0005\u0012\u0000\u0000\u0121\u0122\u00058\u0000"+
		"\u0000\u0122\u0123\u0003$\u0012\u0000\u0123\u0124\u00059\u0000\u0000\u0124"+
		"\'\u0001\u0000\u0000\u0000\u0125\u0126\u0005\u0013\u0000\u0000\u0126\u0127"+
		"\u0003\u0018\f\u0000\u0127\u0129\u0005\u0014\u0000\u0000\u0128\u012a\u0003"+
		"(\u0014\u0000\u0129\u0128\u0001\u0000\u0000\u0000\u0129\u012a\u0001\u0000"+
		"\u0000\u0000\u012a\u012e\u0001\u0000\u0000\u0000\u012b\u012d\u0003\u001e"+
		"\u000f\u0000\u012c\u012b\u0001\u0000\u0000\u0000\u012d\u0130\u0001\u0000"+
		"\u0000\u0000\u012e\u012c\u0001\u0000\u0000\u0000\u012e\u012f\u0001\u0000"+
		"\u0000\u0000\u012f\u0131\u0001\u0000\u0000\u0000\u0130\u012e\u0001\u0000"+
		"\u0000\u0000\u0131\u0132\u0005\u0015\u0000\u0000\u0132\u014c\u0001\u0000"+
		"\u0000\u0000\u0133\u0134\u0005\u0013\u0000\u0000\u0134\u0135\u0003\u0018"+
		"\f\u0000\u0135\u0137\u0005\u0014\u0000\u0000\u0136\u0138\u0003(\u0014"+
		"\u0000\u0137\u0136\u0001\u0000\u0000\u0000\u0137\u0138\u0001\u0000\u0000"+
		"\u0000\u0138\u013c\u0001\u0000\u0000\u0000\u0139\u013b\u0003\u001e\u000f"+
		"\u0000\u013a\u0139\u0001\u0000\u0000\u0000\u013b\u013e\u0001\u0000\u0000"+
		"\u0000\u013c\u013a\u0001\u0000\u0000\u0000\u013c\u013d\u0001\u0000\u0000"+
		"\u0000\u013d\u013f\u0001\u0000\u0000\u0000\u013e\u013c\u0001\u0000\u0000"+
		"\u0000\u013f\u0141\u0005\u0016\u0000\u0000\u0140\u0142\u0003(\u0014\u0000"+
		"\u0141\u0140\u0001\u0000\u0000\u0000\u0141\u0142\u0001\u0000\u0000\u0000"+
		"\u0142\u0146\u0001\u0000\u0000\u0000\u0143\u0145\u0003\u001e\u000f\u0000"+
		"\u0144\u0143\u0001\u0000\u0000\u0000\u0145\u0148\u0001\u0000\u0000\u0000"+
		"\u0146\u0144\u0001\u0000\u0000\u0000\u0146\u0147\u0001\u0000\u0000\u0000"+
		"\u0147\u0149\u0001\u0000\u0000\u0000\u0148\u0146\u0001\u0000\u0000\u0000"+
		"\u0149\u014a\u0005\u0015\u0000\u0000\u014a\u014c\u0001\u0000\u0000\u0000"+
		"\u014b\u0125\u0001\u0000\u0000\u0000\u014b\u0133\u0001\u0000\u0000\u0000"+
		"\u014c)\u0001\u0000\u0000\u0000\u014d\u014e\u0005+\u0000\u0000\u014e\u014f"+
		"\u0005\u0017\u0000\u0000\u014f\u0150\u0005+\u0000\u0000\u0150+\u0001\u0000"+
		"\u0000\u0000\u0151\u0154\u0005\u0018\u0000\u0000\u0152\u0155\u0005.\u0000"+
		"\u0000\u0153\u0155\u0003\u0002\u0001\u0000\u0154\u0152\u0001\u0000\u0000"+
		"\u0000\u0154\u0153\u0001\u0000\u0000\u0000\u0155\u0156\u0001\u0000\u0000"+
		"\u0000\u0156\u015f\u0005\u0019\u0000\u0000\u0157\u015a\u0005+\u0000\u0000"+
		"\u0158\u015a\u0003*\u0015\u0000\u0159\u0157\u0001\u0000\u0000\u0000\u0159"+
		"\u0158\u0001\u0000\u0000\u0000\u015a\u015b\u0001\u0000\u0000\u0000\u015b"+
		"\u015c\u0005\u0006\u0000\u0000\u015c\u015e\u0003\u001e\u000f\u0000\u015d"+
		"\u0159\u0001\u0000\u0000\u0000\u015e\u0161\u0001\u0000\u0000\u0000\u015f"+
		"\u015d\u0001\u0000\u0000\u0000\u015f\u0160\u0001\u0000\u0000\u0000\u0160"+
		"\u0164\u0001\u0000\u0000\u0000\u0161\u015f\u0001\u0000\u0000\u0000\u0162"+
		"\u0163\u0005\u0016\u0000\u0000\u0163\u0165\u0003\u001e\u000f\u0000\u0164"+
		"\u0162\u0001\u0000\u0000\u0000\u0164\u0165\u0001\u0000\u0000\u0000\u0165"+
		"\u0166\u0001\u0000\u0000\u0000\u0166\u0167\u0005\u001a\u0000\u0000\u0167"+
		"-\u0001\u0000\u0000\u0000\u0168\u0169\u0005\u001b\u0000\u0000\u0169\u016a"+
		"\u0003\u0018\f\u0000\u016a\u016c\u0005\u001c\u0000\u0000\u016b\u016d\u0003"+
		".\u0017\u0000\u016c\u016b\u0001\u0000\u0000\u0000\u016c\u016d\u0001\u0000"+
		"\u0000\u0000\u016d\u0171\u0001\u0000\u0000\u0000\u016e\u0170\u0003\u001e"+
		"\u000f\u0000\u016f\u016e\u0001\u0000\u0000\u0000\u0170\u0173\u0001\u0000"+
		"\u0000\u0000\u0171\u016f\u0001\u0000\u0000\u0000\u0171\u0172\u0001\u0000"+
		"\u0000\u0000\u0172\u0174\u0001\u0000\u0000\u0000\u0173\u0171\u0001\u0000"+
		"\u0000\u0000\u0174\u0175\u0005\u001d\u0000\u0000\u0175/\u0001\u0000\u0000"+
		"\u0000\u0176\u017a\u0005\u001c\u0000\u0000\u0177\u0179\u0003\u001e\u000f"+
		"\u0000\u0178\u0177\u0001\u0000\u0000\u0000\u0179\u017c\u0001\u0000\u0000"+
		"\u0000\u017a\u0178\u0001\u0000\u0000\u0000\u017a\u017b\u0001\u0000\u0000"+
		"\u0000\u017b\u017d\u0001\u0000\u0000\u0000\u017c\u017a\u0001\u0000\u0000"+
		"\u0000\u017d\u017e\u0005\u001e\u0000\u0000\u017e\u017f\u0003\u0018\f\u0000"+
		"\u017f1\u0001\u0000\u0000\u0000\u0180\u0183\u0005\u001f\u0000\u0000\u0181"+
		"\u0184\u0005.\u0000\u0000\u0182\u0184\u0003\u0002\u0001\u0000\u0183\u0181"+
		"\u0001\u0000\u0000\u0000\u0183\u0182\u0001\u0000\u0000\u0000\u0184\u0185"+
		"\u0001\u0000\u0000\u0000\u0185\u0186\u0005\u0004\u0000\u0000\u0186\u0187"+
		"\u0005+\u0000\u0000\u0187\u018d\u0005\u001e\u0000\u0000\u0188\u018e\u0005"+
		"+\u0000\u0000\u0189\u018c\u0005.\u0000\u0000\u018a\u018c\u0003\u0002\u0001"+
		"\u0000\u018b\u0189\u0001\u0000\u0000\u0000\u018b\u018a\u0001\u0000\u0000"+
		"\u0000\u018c\u018e\u0001\u0000\u0000\u0000\u018d\u0188\u0001\u0000\u0000"+
		"\u0000\u018d\u018b\u0001\u0000\u0000\u0000\u018e\u018f\u0001\u0000\u0000"+
		"\u0000\u018f\u0191\u0005\u001c\u0000\u0000\u0190\u0192\u00032\u0019\u0000"+
		"\u0191\u0190\u0001\u0000\u0000\u0000\u0191\u0192\u0001\u0000\u0000\u0000"+
		"\u0192\u0196\u0001\u0000\u0000\u0000\u0193\u0195\u0003\u001e\u000f\u0000"+
		"\u0194\u0193\u0001\u0000\u0000\u0000\u0195\u0198\u0001\u0000\u0000\u0000"+
		"\u0196\u0194\u0001\u0000\u0000\u0000\u0196\u0197\u0001\u0000\u0000\u0000"+
		"\u0197\u0199\u0001\u0000\u0000\u0000\u0198\u0196\u0001\u0000\u0000\u0000"+
		"\u0199\u019a\u0005 \u0000\u0000\u019a3\u0001\u0000\u0000\u0000\u019b\u019c"+
		"\u0005!\u0000\u0000\u019c\u019d\u0003\u001c\u000e\u0000\u019d\u019e\u0005"+
		"\"\u0000\u0000\u019e5\u0001\u0000\u0000\u0000\u019f\u01a5\u0005.\u0000"+
		"\u0000\u01a0\u01a5\u0003\u0002\u0001\u0000\u01a1\u01a5\u0005+\u0000\u0000"+
		"\u01a2\u01a5\u0005,\u0000\u0000\u01a3\u01a5\u0003\u0014\n\u0000\u01a4"+
		"\u019f\u0001\u0000\u0000\u0000\u01a4\u01a0\u0001\u0000\u0000\u0000\u01a4"+
		"\u01a1\u0001\u0000\u0000\u0000\u01a4\u01a2\u0001\u0000\u0000\u0000\u01a4"+
		"\u01a3\u0001\u0000\u0000\u0000\u01a4\u01a5\u0001\u0000\u0000\u0000\u01a5"+
		"\u01b0\u0001\u0000\u0000\u0000\u01a6\u01ac\u0005\b\u0000\u0000\u01a7\u01ad"+
		"\u0005.\u0000\u0000\u01a8\u01ad\u0003\u0002\u0001\u0000\u01a9\u01ad\u0005"+
		"+\u0000\u0000\u01aa\u01ad\u0005,\u0000\u0000\u01ab\u01ad\u0003\u0014\n"+
		"\u0000\u01ac\u01a7\u0001\u0000\u0000\u0000\u01ac\u01a8\u0001\u0000\u0000"+
		"\u0000\u01ac\u01a9\u0001\u0000\u0000\u0000\u01ac\u01aa\u0001\u0000\u0000"+
		"\u0000\u01ac\u01ab\u0001\u0000\u0000\u0000\u01ad\u01af\u0001\u0000\u0000"+
		"\u0000\u01ae\u01a6\u0001\u0000\u0000\u0000\u01af\u01b2\u0001\u0000\u0000"+
		"\u0000\u01b0\u01ae\u0001\u0000\u0000\u0000\u01b0\u01b1\u0001\u0000\u0000"+
		"\u0000\u01b17\u0001\u0000\u0000\u0000\u01b2\u01b0\u0001\u0000\u0000\u0000"+
		"\u01b3\u01b4\u0005.\u0000\u0000\u01b4\u01b5\u00058\u0000\u0000\u01b5\u01b6"+
		"\u00036\u001b\u0000\u01b6\u01b7\u00059\u0000\u0000\u01b79\u0001\u0000"+
		"\u0000\u0000\u01b8\u01b9\u0005.\u0000\u0000\u01b9\u01bb\u0005\u0006\u0000"+
		"\u0000\u01ba\u01bc\u0003\u0004\u0002\u0000\u01bb\u01ba\u0001\u0000\u0000"+
		"\u0000\u01bb\u01bc\u0001\u0000\u0000\u0000\u01bc\u01c0\u0001\u0000\u0000"+
		"\u0000\u01bd\u01c1\u0005*\u0000\u0000\u01be\u01c1\u0003\f\u0006\u0000"+
		"\u01bf\u01c1\u0003\u0000\u0000\u0000\u01c0\u01bd\u0001\u0000\u0000\u0000"+
		"\u01c0\u01be\u0001\u0000\u0000\u0000\u01c0\u01bf\u0001\u0000\u0000\u0000"+
		"\u01c1;\u0001\u0000\u0000\u0000\u01c2\u01c5\u0005#\u0000\u0000\u01c3\u01c6"+
		"\u0003\u0014\n\u0000\u01c4\u01c6\u0003\u0018\f\u0000\u01c5\u01c3\u0001"+
		"\u0000\u0000\u0000\u01c5\u01c4\u0001\u0000\u0000\u0000\u01c6=\u0001\u0000"+
		"\u0000\u0000\u01c7\u01c8\u0005$\u0000\u0000\u01c8\u01c9\u0005.\u0000\u0000"+
		"\u01c9\u01cb\u00058\u0000\u0000\u01ca\u01cc\u0003:\u001d\u0000\u01cb\u01ca"+
		"\u0001\u0000\u0000\u0000\u01cb\u01cc\u0001\u0000\u0000\u0000\u01cc\u01d1"+
		"\u0001\u0000\u0000\u0000\u01cd\u01ce\u0005\b\u0000\u0000\u01ce\u01d0\u0003"+
		":\u001d\u0000\u01cf\u01cd\u0001\u0000\u0000\u0000\u01d0\u01d3\u0001\u0000"+
		"\u0000\u0000\u01d1\u01cf\u0001\u0000\u0000\u0000\u01d1\u01d2\u0001\u0000"+
		"\u0000\u0000\u01d2\u01d4\u0001\u0000\u0000\u0000\u01d3\u01d1\u0001\u0000"+
		"\u0000\u0000\u01d4\u01d5\u00059\u0000\u0000\u01d5\u01d8\u0005\u0006\u0000"+
		"\u0000\u01d6\u01d9\u0005*\u0000\u0000\u01d7\u01d9\u0003\u0000\u0000\u0000"+
		"\u01d8\u01d6\u0001\u0000\u0000\u0000\u01d8\u01d7\u0001\u0000\u0000\u0000"+
		"\u01d9\u01dd\u0001\u0000\u0000\u0000\u01da\u01dc\u0003\u001e\u000f\u0000"+
		"\u01db\u01da\u0001\u0000\u0000\u0000\u01dc\u01df\u0001\u0000\u0000\u0000"+
		"\u01dd\u01db\u0001\u0000\u0000\u0000\u01dd\u01de\u0001\u0000\u0000\u0000"+
		"\u01de\u01e0\u0001\u0000\u0000\u0000\u01df\u01dd\u0001\u0000\u0000\u0000"+
		"\u01e0\u01e1\u0005%\u0000\u0000\u01e1?\u0001\u0000\u0000\u0000\u01e2\u01e3"+
		"\u0005&\u0000\u0000\u01e3\u01e4\u0005.\u0000\u0000\u01e4\u01eb\u00058"+
		"\u0000\u0000\u01e5\u01e6\u0005\'\u0000\u0000\u01e6\u01e7\u0005.\u0000"+
		"\u0000\u01e7\u01e8\u0005\u0006\u0000\u0000\u01e8\u01ea\u0003\u0000\u0000"+
		"\u0000\u01e9\u01e5\u0001\u0000\u0000\u0000\u01ea\u01ed\u0001\u0000\u0000"+
		"\u0000\u01eb\u01e9\u0001\u0000\u0000\u0000\u01eb\u01ec\u0001\u0000\u0000"+
		"\u0000\u01ec\u01ee\u0001\u0000\u0000\u0000\u01ed\u01eb\u0001\u0000\u0000"+
		"\u0000\u01ee\u01f0\u00059\u0000\u0000\u01ef\u01f1\u0003\u0012\t\u0000"+
		"\u01f0\u01ef\u0001\u0000\u0000\u0000\u01f0\u01f1\u0001\u0000\u0000\u0000"+
		"\u01f1\u01f3\u0001\u0000\u0000\u0000\u01f2\u01f4\u0003\u001c\u000e\u0000"+
		"\u01f3\u01f2\u0001\u0000\u0000\u0000\u01f3\u01f4\u0001\u0000\u0000\u0000"+
		"\u01f4\u01f5\u0001\u0000\u0000\u0000\u01f5\u01f6\u0005(\u0000\u0000\u01f6"+
		"A\u0001\u0000\u0000\u0000\u01f7\u01f8\u0005)\u0000\u0000\u01f8\u01f9\u0005"+
		".\u0000\u0000\u01f9\u01fa\u0005\u0006\u0000\u0000\u01fa\u01fb\u0005*\u0000"+
		"\u0000\u01fb\u01fc\u0005\u0010\u0000\u0000\u01fc\u01fd\u0007\u0003\u0000"+
		"\u0000\u01fdC\u0001\u0000\u0000\u0000@OSY^kr|\u0082\u0088\u008e\u0094"+
		"\u009b\u00a1\u00a5\u00b0\u00b5\u00ba\u00c1\u00c7\u00cb\u00d2\u00db\u00e4"+
		"\u00ea\u00f0\u00fc\u0100\u0104\u0108\u0111\u0115\u011e\u0129\u012e\u0137"+
		"\u013c\u0141\u0146\u014b\u0154\u0159\u015f\u0164\u016c\u0171\u017a\u0183"+
		"\u018b\u018d\u0191\u0196\u01a4\u01ac\u01b0\u01bb\u01c0\u01c5\u01cb\u01d1"+
		"\u01d8\u01dd\u01eb\u01f0\u01f3";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}