// Generated from Clojure.g4 by ANTLR 4.9.3
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ClojureParser}.
 */
public interface ClojureListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ClojureParser#file_}.
	 * @param ctx the parse tree
	 */
	void enterFile_(ClojureParser.File_Context ctx);
	/**
	 * Exit a parse tree produced by {@link ClojureParser#file_}.
	 * @param ctx the parse tree
	 */
	void exitFile_(ClojureParser.File_Context ctx);
	/**
	 * Enter a parse tree produced by {@link ClojureParser#form}.
	 * @param ctx the parse tree
	 */
	void enterForm(ClojureParser.FormContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClojureParser#form}.
	 * @param ctx the parse tree
	 */
	void exitForm(ClojureParser.FormContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClojureParser#forms}.
	 * @param ctx the parse tree
	 */
	void enterForms(ClojureParser.FormsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClojureParser#forms}.
	 * @param ctx the parse tree
	 */
	void exitForms(ClojureParser.FormsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClojureParser#list_}.
	 * @param ctx the parse tree
	 */
	void enterList_(ClojureParser.List_Context ctx);
	/**
	 * Exit a parse tree produced by {@link ClojureParser#list_}.
	 * @param ctx the parse tree
	 */
	void exitList_(ClojureParser.List_Context ctx);
	/**
	 * Enter a parse tree produced by {@link ClojureParser#vector}.
	 * @param ctx the parse tree
	 */
	void enterVector(ClojureParser.VectorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClojureParser#vector}.
	 * @param ctx the parse tree
	 */
	void exitVector(ClojureParser.VectorContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClojureParser#map_}.
	 * @param ctx the parse tree
	 */
	void enterMap_(ClojureParser.Map_Context ctx);
	/**
	 * Exit a parse tree produced by {@link ClojureParser#map_}.
	 * @param ctx the parse tree
	 */
	void exitMap_(ClojureParser.Map_Context ctx);
	/**
	 * Enter a parse tree produced by {@link ClojureParser#set_}.
	 * @param ctx the parse tree
	 */
	void enterSet_(ClojureParser.Set_Context ctx);
	/**
	 * Exit a parse tree produced by {@link ClojureParser#set_}.
	 * @param ctx the parse tree
	 */
	void exitSet_(ClojureParser.Set_Context ctx);
	/**
	 * Enter a parse tree produced by {@link ClojureParser#reader_macro}.
	 * @param ctx the parse tree
	 */
	void enterReader_macro(ClojureParser.Reader_macroContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClojureParser#reader_macro}.
	 * @param ctx the parse tree
	 */
	void exitReader_macro(ClojureParser.Reader_macroContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClojureParser#quote}.
	 * @param ctx the parse tree
	 */
	void enterQuote(ClojureParser.QuoteContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClojureParser#quote}.
	 * @param ctx the parse tree
	 */
	void exitQuote(ClojureParser.QuoteContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClojureParser#backtick}.
	 * @param ctx the parse tree
	 */
	void enterBacktick(ClojureParser.BacktickContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClojureParser#backtick}.
	 * @param ctx the parse tree
	 */
	void exitBacktick(ClojureParser.BacktickContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClojureParser#unquote}.
	 * @param ctx the parse tree
	 */
	void enterUnquote(ClojureParser.UnquoteContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClojureParser#unquote}.
	 * @param ctx the parse tree
	 */
	void exitUnquote(ClojureParser.UnquoteContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClojureParser#unquote_splicing}.
	 * @param ctx the parse tree
	 */
	void enterUnquote_splicing(ClojureParser.Unquote_splicingContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClojureParser#unquote_splicing}.
	 * @param ctx the parse tree
	 */
	void exitUnquote_splicing(ClojureParser.Unquote_splicingContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClojureParser#tag}.
	 * @param ctx the parse tree
	 */
	void enterTag(ClojureParser.TagContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClojureParser#tag}.
	 * @param ctx the parse tree
	 */
	void exitTag(ClojureParser.TagContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClojureParser#deref}.
	 * @param ctx the parse tree
	 */
	void enterDeref(ClojureParser.DerefContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClojureParser#deref}.
	 * @param ctx the parse tree
	 */
	void exitDeref(ClojureParser.DerefContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClojureParser#gensym}.
	 * @param ctx the parse tree
	 */
	void enterGensym(ClojureParser.GensymContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClojureParser#gensym}.
	 * @param ctx the parse tree
	 */
	void exitGensym(ClojureParser.GensymContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClojureParser#lambda_}.
	 * @param ctx the parse tree
	 */
	void enterLambda_(ClojureParser.Lambda_Context ctx);
	/**
	 * Exit a parse tree produced by {@link ClojureParser#lambda_}.
	 * @param ctx the parse tree
	 */
	void exitLambda_(ClojureParser.Lambda_Context ctx);
	/**
	 * Enter a parse tree produced by {@link ClojureParser#meta_data}.
	 * @param ctx the parse tree
	 */
	void enterMeta_data(ClojureParser.Meta_dataContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClojureParser#meta_data}.
	 * @param ctx the parse tree
	 */
	void exitMeta_data(ClojureParser.Meta_dataContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClojureParser#var_quote}.
	 * @param ctx the parse tree
	 */
	void enterVar_quote(ClojureParser.Var_quoteContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClojureParser#var_quote}.
	 * @param ctx the parse tree
	 */
	void exitVar_quote(ClojureParser.Var_quoteContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClojureParser#host_expr}.
	 * @param ctx the parse tree
	 */
	void enterHost_expr(ClojureParser.Host_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClojureParser#host_expr}.
	 * @param ctx the parse tree
	 */
	void exitHost_expr(ClojureParser.Host_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClojureParser#discard}.
	 * @param ctx the parse tree
	 */
	void enterDiscard(ClojureParser.DiscardContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClojureParser#discard}.
	 * @param ctx the parse tree
	 */
	void exitDiscard(ClojureParser.DiscardContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClojureParser#dispatch}.
	 * @param ctx the parse tree
	 */
	void enterDispatch(ClojureParser.DispatchContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClojureParser#dispatch}.
	 * @param ctx the parse tree
	 */
	void exitDispatch(ClojureParser.DispatchContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClojureParser#regex}.
	 * @param ctx the parse tree
	 */
	void enterRegex(ClojureParser.RegexContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClojureParser#regex}.
	 * @param ctx the parse tree
	 */
	void exitRegex(ClojureParser.RegexContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClojureParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(ClojureParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClojureParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(ClojureParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClojureParser#string_}.
	 * @param ctx the parse tree
	 */
	void enterString_(ClojureParser.String_Context ctx);
	/**
	 * Exit a parse tree produced by {@link ClojureParser#string_}.
	 * @param ctx the parse tree
	 */
	void exitString_(ClojureParser.String_Context ctx);
	/**
	 * Enter a parse tree produced by {@link ClojureParser#hex_}.
	 * @param ctx the parse tree
	 */
	void enterHex_(ClojureParser.Hex_Context ctx);
	/**
	 * Exit a parse tree produced by {@link ClojureParser#hex_}.
	 * @param ctx the parse tree
	 */
	void exitHex_(ClojureParser.Hex_Context ctx);
	/**
	 * Enter a parse tree produced by {@link ClojureParser#bin_}.
	 * @param ctx the parse tree
	 */
	void enterBin_(ClojureParser.Bin_Context ctx);
	/**
	 * Exit a parse tree produced by {@link ClojureParser#bin_}.
	 * @param ctx the parse tree
	 */
	void exitBin_(ClojureParser.Bin_Context ctx);
	/**
	 * Enter a parse tree produced by {@link ClojureParser#bign}.
	 * @param ctx the parse tree
	 */
	void enterBign(ClojureParser.BignContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClojureParser#bign}.
	 * @param ctx the parse tree
	 */
	void exitBign(ClojureParser.BignContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClojureParser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumber(ClojureParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClojureParser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumber(ClojureParser.NumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClojureParser#character}.
	 * @param ctx the parse tree
	 */
	void enterCharacter(ClojureParser.CharacterContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClojureParser#character}.
	 * @param ctx the parse tree
	 */
	void exitCharacter(ClojureParser.CharacterContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClojureParser#named_char}.
	 * @param ctx the parse tree
	 */
	void enterNamed_char(ClojureParser.Named_charContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClojureParser#named_char}.
	 * @param ctx the parse tree
	 */
	void exitNamed_char(ClojureParser.Named_charContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClojureParser#any_char}.
	 * @param ctx the parse tree
	 */
	void enterAny_char(ClojureParser.Any_charContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClojureParser#any_char}.
	 * @param ctx the parse tree
	 */
	void exitAny_char(ClojureParser.Any_charContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClojureParser#u_hex_quad}.
	 * @param ctx the parse tree
	 */
	void enterU_hex_quad(ClojureParser.U_hex_quadContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClojureParser#u_hex_quad}.
	 * @param ctx the parse tree
	 */
	void exitU_hex_quad(ClojureParser.U_hex_quadContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClojureParser#nil_}.
	 * @param ctx the parse tree
	 */
	void enterNil_(ClojureParser.Nil_Context ctx);
	/**
	 * Exit a parse tree produced by {@link ClojureParser#nil_}.
	 * @param ctx the parse tree
	 */
	void exitNil_(ClojureParser.Nil_Context ctx);
	/**
	 * Enter a parse tree produced by {@link ClojureParser#keyword}.
	 * @param ctx the parse tree
	 */
	void enterKeyword(ClojureParser.KeywordContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClojureParser#keyword}.
	 * @param ctx the parse tree
	 */
	void exitKeyword(ClojureParser.KeywordContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClojureParser#simple_keyword}.
	 * @param ctx the parse tree
	 */
	void enterSimple_keyword(ClojureParser.Simple_keywordContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClojureParser#simple_keyword}.
	 * @param ctx the parse tree
	 */
	void exitSimple_keyword(ClojureParser.Simple_keywordContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClojureParser#macro_keyword}.
	 * @param ctx the parse tree
	 */
	void enterMacro_keyword(ClojureParser.Macro_keywordContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClojureParser#macro_keyword}.
	 * @param ctx the parse tree
	 */
	void exitMacro_keyword(ClojureParser.Macro_keywordContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClojureParser#symbol}.
	 * @param ctx the parse tree
	 */
	void enterSymbol(ClojureParser.SymbolContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClojureParser#symbol}.
	 * @param ctx the parse tree
	 */
	void exitSymbol(ClojureParser.SymbolContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClojureParser#simple_sym}.
	 * @param ctx the parse tree
	 */
	void enterSimple_sym(ClojureParser.Simple_symContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClojureParser#simple_sym}.
	 * @param ctx the parse tree
	 */
	void exitSimple_sym(ClojureParser.Simple_symContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClojureParser#ns_symbol}.
	 * @param ctx the parse tree
	 */
	void enterNs_symbol(ClojureParser.Ns_symbolContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClojureParser#ns_symbol}.
	 * @param ctx the parse tree
	 */
	void exitNs_symbol(ClojureParser.Ns_symbolContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClojureParser#param_name}.
	 * @param ctx the parse tree
	 */
	void enterParam_name(ClojureParser.Param_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClojureParser#param_name}.
	 * @param ctx the parse tree
	 */
	void exitParam_name(ClojureParser.Param_nameContext ctx);
}