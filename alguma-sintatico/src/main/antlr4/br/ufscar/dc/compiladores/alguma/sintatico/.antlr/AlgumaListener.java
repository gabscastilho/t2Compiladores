// Generated from /home/gabrielly/projetos/compiladores/alguma-lexico/alguma-sintatico/src/main/antlr4/br/ufscar/dc/compiladores/alguma/sintatico/Alguma.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link AlgumaParser}.
 */
public interface AlgumaListener extends ParseTreeListener {
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
	 * Enter a parse tree produced by {@link AlgumaParser#registro}.
	 * @param ctx the parse tree
	 */
	void enterRegistro(AlgumaParser.RegistroContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaParser#registro}.
	 * @param ctx the parse tree
	 */
	void exitRegistro(AlgumaParser.RegistroContext ctx);
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
	 * Enter a parse tree produced by {@link AlgumaParser#listaDeclaracoes}.
	 * @param ctx the parse tree
	 */
	void enterListaDeclaracoes(AlgumaParser.ListaDeclaracoesContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaParser#listaDeclaracoes}.
	 * @param ctx the parse tree
	 */
	void exitListaDeclaracoes(AlgumaParser.ListaDeclaracoesContext ctx);
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
	 * Enter a parse tree produced by {@link AlgumaParser#parametrosFuncao}.
	 * @param ctx the parse tree
	 */
	void enterParametrosFuncao(AlgumaParser.ParametrosFuncaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaParser#parametrosFuncao}.
	 * @param ctx the parse tree
	 */
	void exitParametrosFuncao(AlgumaParser.ParametrosFuncaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgumaParser#funcao}.
	 * @param ctx the parse tree
	 */
	void enterFuncao(AlgumaParser.FuncaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaParser#funcao}.
	 * @param ctx the parse tree
	 */
	void exitFuncao(AlgumaParser.FuncaoContext ctx);
}