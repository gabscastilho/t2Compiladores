// Generated from java-escape by ANTLR 4.11.1
package br.ufscar.dc.compiladores.alguma.sintatico;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link AlgumaParser}.
 */
public interface AlgumaListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link AlgumaParser#var_personalizada}.
	 * @param ctx the parse tree
	 */
	void enterVar_personalizada(AlgumaParser.Var_personalizadaContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaParser#var_personalizada}.
	 * @param ctx the parse tree
	 */
	void exitVar_personalizada(AlgumaParser.Var_personalizadaContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgumaParser#var_registro}.
	 * @param ctx the parse tree
	 */
	void enterVar_registro(AlgumaParser.Var_registroContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaParser#var_registro}.
	 * @param ctx the parse tree
	 */
	void exitVar_registro(AlgumaParser.Var_registroContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgumaParser#ponteiro}.
	 * @param ctx the parse tree
	 */
	void enterPonteiro(AlgumaParser.PonteiroContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaParser#ponteiro}.
	 * @param ctx the parse tree
	 */
	void exitPonteiro(AlgumaParser.PonteiroContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgumaParser#endereco}.
	 * @param ctx the parse tree
	 */
	void enterEndereco(AlgumaParser.EnderecoContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaParser#endereco}.
	 * @param ctx the parse tree
	 */
	void exitEndereco(AlgumaParser.EnderecoContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgumaParser#op_bool}.
	 * @param ctx the parse tree
	 */
	void enterOp_bool(AlgumaParser.Op_boolContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaParser#op_bool}.
	 * @param ctx the parse tree
	 */
	void exitOp_bool(AlgumaParser.Op_boolContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgumaParser#programa}.
	 * @param ctx the parse tree
	 */
	void enterPrograma(AlgumaParser.ProgramaContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaParser#programa}.
	 * @param ctx the parse tree
	 */
	void exitPrograma(AlgumaParser.ProgramaContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgumaParser#listaComandos}.
	 * @param ctx the parse tree
	 */
	void enterListaComandos(AlgumaParser.ListaComandosContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaParser#listaComandos}.
	 * @param ctx the parse tree
	 */
	void exitListaComandos(AlgumaParser.ListaComandosContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgumaParser#comando}.
	 * @param ctx the parse tree
	 */
	void enterComando(AlgumaParser.ComandoContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaParser#comando}.
	 * @param ctx the parse tree
	 */
	void exitComando(AlgumaParser.ComandoContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgumaParser#comandoAtribuicao}.
	 * @param ctx the parse tree
	 */
	void enterComandoAtribuicao(AlgumaParser.ComandoAtribuicaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaParser#comandoAtribuicao}.
	 * @param ctx the parse tree
	 */
	void exitComandoAtribuicao(AlgumaParser.ComandoAtribuicaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgumaParser#declaracao}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracao(AlgumaParser.DeclaracaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaParser#declaracao}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracao(AlgumaParser.DeclaracaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgumaParser#declaracao_tipo}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracao_tipo(AlgumaParser.Declaracao_tipoContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaParser#declaracao_tipo}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracao_tipo(AlgumaParser.Declaracao_tipoContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgumaParser#declaracao_registro}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracao_registro(AlgumaParser.Declaracao_registroContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaParser#declaracao_registro}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracao_registro(AlgumaParser.Declaracao_registroContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgumaParser#declaracao_constante}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracao_constante(AlgumaParser.Declaracao_constanteContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaParser#declaracao_constante}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracao_constante(AlgumaParser.Declaracao_constanteContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgumaParser#expressaoAritmetica}.
	 * @param ctx the parse tree
	 */
	void enterExpressaoAritmetica(AlgumaParser.ExpressaoAritmeticaContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaParser#expressaoAritmetica}.
	 * @param ctx the parse tree
	 */
	void exitExpressaoAritmetica(AlgumaParser.ExpressaoAritmeticaContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgumaParser#fatorAritmetico}.
	 * @param ctx the parse tree
	 */
	void enterFatorAritmetico(AlgumaParser.FatorAritmeticoContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaParser#fatorAritmetico}.
	 * @param ctx the parse tree
	 */
	void exitFatorAritmetico(AlgumaParser.FatorAritmeticoContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgumaParser#expressaoRelacional}.
	 * @param ctx the parse tree
	 */
	void enterExpressaoRelacional(AlgumaParser.ExpressaoRelacionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaParser#expressaoRelacional}.
	 * @param ctx the parse tree
	 */
	void exitExpressaoRelacional(AlgumaParser.ExpressaoRelacionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgumaParser#termoRelacional}.
	 * @param ctx the parse tree
	 */
	void enterTermoRelacional(AlgumaParser.TermoRelacionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaParser#termoRelacional}.
	 * @param ctx the parse tree
	 */
	void exitTermoRelacional(AlgumaParser.TermoRelacionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgumaParser#entrada}.
	 * @param ctx the parse tree
	 */
	void enterEntrada(AlgumaParser.EntradaContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaParser#entrada}.
	 * @param ctx the parse tree
	 */
	void exitEntrada(AlgumaParser.EntradaContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgumaParser#comandoEntrada}.
	 * @param ctx the parse tree
	 */
	void enterComandoEntrada(AlgumaParser.ComandoEntradaContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaParser#comandoEntrada}.
	 * @param ctx the parse tree
	 */
	void exitComandoEntrada(AlgumaParser.ComandoEntradaContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgumaParser#saida}.
	 * @param ctx the parse tree
	 */
	void enterSaida(AlgumaParser.SaidaContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaParser#saida}.
	 * @param ctx the parse tree
	 */
	void exitSaida(AlgumaParser.SaidaContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgumaParser#comandoSaida}.
	 * @param ctx the parse tree
	 */
	void enterComandoSaida(AlgumaParser.ComandoSaidaContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaParser#comandoSaida}.
	 * @param ctx the parse tree
	 */
	void exitComandoSaida(AlgumaParser.ComandoSaidaContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgumaParser#comandoCondicao}.
	 * @param ctx the parse tree
	 */
	void enterComandoCondicao(AlgumaParser.ComandoCondicaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaParser#comandoCondicao}.
	 * @param ctx the parse tree
	 */
	void exitComandoCondicao(AlgumaParser.ComandoCondicaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgumaParser#intervalo}.
	 * @param ctx the parse tree
	 */
	void enterIntervalo(AlgumaParser.IntervaloContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaParser#intervalo}.
	 * @param ctx the parse tree
	 */
	void exitIntervalo(AlgumaParser.IntervaloContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgumaParser#comandoCaso}.
	 * @param ctx the parse tree
	 */
	void enterComandoCaso(AlgumaParser.ComandoCasoContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaParser#comandoCaso}.
	 * @param ctx the parse tree
	 */
	void exitComandoCaso(AlgumaParser.ComandoCasoContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgumaParser#comandoEnquanto}.
	 * @param ctx the parse tree
	 */
	void enterComandoEnquanto(AlgumaParser.ComandoEnquantoContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaParser#comandoEnquanto}.
	 * @param ctx the parse tree
	 */
	void exitComandoEnquanto(AlgumaParser.ComandoEnquantoContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgumaParser#comandoFaca}.
	 * @param ctx the parse tree
	 */
	void enterComandoFaca(AlgumaParser.ComandoFacaContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaParser#comandoFaca}.
	 * @param ctx the parse tree
	 */
	void exitComandoFaca(AlgumaParser.ComandoFacaContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgumaParser#comandoPara}.
	 * @param ctx the parse tree
	 */
	void enterComandoPara(AlgumaParser.ComandoParaContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaParser#comandoPara}.
	 * @param ctx the parse tree
	 */
	void exitComandoPara(AlgumaParser.ComandoParaContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgumaParser#subAlgoritmo}.
	 * @param ctx the parse tree
	 */
	void enterSubAlgoritmo(AlgumaParser.SubAlgoritmoContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaParser#subAlgoritmo}.
	 * @param ctx the parse tree
	 */
	void exitSubAlgoritmo(AlgumaParser.SubAlgoritmoContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgumaParser#parametros_chamada_funcao}.
	 * @param ctx the parse tree
	 */
	void enterParametros_chamada_funcao(AlgumaParser.Parametros_chamada_funcaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaParser#parametros_chamada_funcao}.
	 * @param ctx the parse tree
	 */
	void exitParametros_chamada_funcao(AlgumaParser.Parametros_chamada_funcaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgumaParser#chamada_funcao}.
	 * @param ctx the parse tree
	 */
	void enterChamada_funcao(AlgumaParser.Chamada_funcaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaParser#chamada_funcao}.
	 * @param ctx the parse tree
	 */
	void exitChamada_funcao(AlgumaParser.Chamada_funcaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgumaParser#parametros_declaracao_funcao}.
	 * @param ctx the parse tree
	 */
	void enterParametros_declaracao_funcao(AlgumaParser.Parametros_declaracao_funcaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaParser#parametros_declaracao_funcao}.
	 * @param ctx the parse tree
	 */
	void exitParametros_declaracao_funcao(AlgumaParser.Parametros_declaracao_funcaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgumaParser#declaracao_funcao}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracao_funcao(AlgumaParser.Declaracao_funcaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaParser#declaracao_funcao}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracao_funcao(AlgumaParser.Declaracao_funcaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgumaParser#retorno_funcao}.
	 * @param ctx the parse tree
	 */
	void enterRetorno_funcao(AlgumaParser.Retorno_funcaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaParser#retorno_funcao}.
	 * @param ctx the parse tree
	 */
	void exitRetorno_funcao(AlgumaParser.Retorno_funcaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgumaParser#procedimento}.
	 * @param ctx the parse tree
	 */
	void enterProcedimento(AlgumaParser.ProcedimentoContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaParser#procedimento}.
	 * @param ctx the parse tree
	 */
	void exitProcedimento(AlgumaParser.ProcedimentoContext ctx);
}