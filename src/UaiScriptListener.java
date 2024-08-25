// Generated from UaiScript.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link UaiScriptParser}.
 */
public interface UaiScriptListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link UaiScriptParser#inicio}.
	 * @param ctx the parse tree
	 */
	void enterInicio(UaiScriptParser.InicioContext ctx);
	/**
	 * Exit a parse tree produced by {@link UaiScriptParser#inicio}.
	 * @param ctx the parse tree
	 */
	void exitInicio(UaiScriptParser.InicioContext ctx);
	/**
	 * Enter a parse tree produced by {@link UaiScriptParser#funcoes}.
	 * @param ctx the parse tree
	 */
	void enterFuncoes(UaiScriptParser.FuncoesContext ctx);
	/**
	 * Exit a parse tree produced by {@link UaiScriptParser#funcoes}.
	 * @param ctx the parse tree
	 */
	void exitFuncoes(UaiScriptParser.FuncoesContext ctx);
	/**
	 * Enter a parse tree produced by {@link UaiScriptParser#main}.
	 * @param ctx the parse tree
	 */
	void enterMain(UaiScriptParser.MainContext ctx);
	/**
	 * Exit a parse tree produced by {@link UaiScriptParser#main}.
	 * @param ctx the parse tree
	 */
	void exitMain(UaiScriptParser.MainContext ctx);
	/**
	 * Enter a parse tree produced by {@link UaiScriptParser#decl_func}.
	 * @param ctx the parse tree
	 */
	void enterDecl_func(UaiScriptParser.Decl_funcContext ctx);
	/**
	 * Exit a parse tree produced by {@link UaiScriptParser#decl_func}.
	 * @param ctx the parse tree
	 */
	void exitDecl_func(UaiScriptParser.Decl_funcContext ctx);
	/**
	 * Enter a parse tree produced by {@link UaiScriptParser#decl_var}.
	 * @param ctx the parse tree
	 */
	void enterDecl_var(UaiScriptParser.Decl_varContext ctx);
	/**
	 * Exit a parse tree produced by {@link UaiScriptParser#decl_var}.
	 * @param ctx the parse tree
	 */
	void exitDecl_var(UaiScriptParser.Decl_varContext ctx);
	/**
	 * Enter a parse tree produced by {@link UaiScriptParser#atrib}.
	 * @param ctx the parse tree
	 */
	void enterAtrib(UaiScriptParser.AtribContext ctx);
	/**
	 * Exit a parse tree produced by {@link UaiScriptParser#atrib}.
	 * @param ctx the parse tree
	 */
	void exitAtrib(UaiScriptParser.AtribContext ctx);
	/**
	 * Enter a parse tree produced by {@link UaiScriptParser#acao}.
	 * @param ctx the parse tree
	 */
	void enterAcao(UaiScriptParser.AcaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link UaiScriptParser#acao}.
	 * @param ctx the parse tree
	 */
	void exitAcao(UaiScriptParser.AcaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link UaiScriptParser#operacao}.
	 * @param ctx the parse tree
	 */
	void enterOperacao(UaiScriptParser.OperacaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link UaiScriptParser#operacao}.
	 * @param ctx the parse tree
	 */
	void exitOperacao(UaiScriptParser.OperacaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link UaiScriptParser#operando}.
	 * @param ctx the parse tree
	 */
	void enterOperando(UaiScriptParser.OperandoContext ctx);
	/**
	 * Exit a parse tree produced by {@link UaiScriptParser#operando}.
	 * @param ctx the parse tree
	 */
	void exitOperando(UaiScriptParser.OperandoContext ctx);
	/**
	 * Enter a parse tree produced by {@link UaiScriptParser#operando_cauda}.
	 * @param ctx the parse tree
	 */
	void enterOperando_cauda(UaiScriptParser.Operando_caudaContext ctx);
	/**
	 * Exit a parse tree produced by {@link UaiScriptParser#operando_cauda}.
	 * @param ctx the parse tree
	 */
	void exitOperando_cauda(UaiScriptParser.Operando_caudaContext ctx);
	/**
	 * Enter a parse tree produced by {@link UaiScriptParser#funcao}.
	 * @param ctx the parse tree
	 */
	void enterFuncao(UaiScriptParser.FuncaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link UaiScriptParser#funcao}.
	 * @param ctx the parse tree
	 */
	void exitFuncao(UaiScriptParser.FuncaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link UaiScriptParser#condicao}.
	 * @param ctx the parse tree
	 */
	void enterCondicao(UaiScriptParser.CondicaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link UaiScriptParser#condicao}.
	 * @param ctx the parse tree
	 */
	void exitCondicao(UaiScriptParser.CondicaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link UaiScriptParser#condicaoElse}.
	 * @param ctx the parse tree
	 */
	void enterCondicaoElse(UaiScriptParser.CondicaoElseContext ctx);
	/**
	 * Exit a parse tree produced by {@link UaiScriptParser#condicaoElse}.
	 * @param ctx the parse tree
	 */
	void exitCondicaoElse(UaiScriptParser.CondicaoElseContext ctx);
	/**
	 * Enter a parse tree produced by {@link UaiScriptParser#laco}.
	 * @param ctx the parse tree
	 */
	void enterLaco(UaiScriptParser.LacoContext ctx);
	/**
	 * Exit a parse tree produced by {@link UaiScriptParser#laco}.
	 * @param ctx the parse tree
	 */
	void exitLaco(UaiScriptParser.LacoContext ctx);
	/**
	 * Enter a parse tree produced by {@link UaiScriptParser#expressao}.
	 * @param ctx the parse tree
	 */
	void enterExpressao(UaiScriptParser.ExpressaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link UaiScriptParser#expressao}.
	 * @param ctx the parse tree
	 */
	void exitExpressao(UaiScriptParser.ExpressaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link UaiScriptParser#casting}.
	 * @param ctx the parse tree
	 */
	void enterCasting(UaiScriptParser.CastingContext ctx);
	/**
	 * Exit a parse tree produced by {@link UaiScriptParser#casting}.
	 * @param ctx the parse tree
	 */
	void exitCasting(UaiScriptParser.CastingContext ctx);
}