package org.nagoya_u.ertl.sa.parser;
// Generated from /Users/syu/workspace/MSCCD/modules/msccd_tokenizer/src/main/java/org/nagoya_u/ertl/sa/parser/zig.g4 by ANTLR 4.8
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link zigParser}.
 */
public interface zigListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link zigParser#root}.
	 * @param ctx the parse tree
	 */
	void enterRoot(zigParser.RootContext ctx);
	/**
	 * Exit a parse tree produced by {@link zigParser#root}.
	 * @param ctx the parse tree
	 */
	void exitRoot(zigParser.RootContext ctx);
	/**
	 * Enter a parse tree produced by {@link zigParser#containerMembers}.
	 * @param ctx the parse tree
	 */
	void enterContainerMembers(zigParser.ContainerMembersContext ctx);
	/**
	 * Exit a parse tree produced by {@link zigParser#containerMembers}.
	 * @param ctx the parse tree
	 */
	void exitContainerMembers(zigParser.ContainerMembersContext ctx);
	/**
	 * Enter a parse tree produced by {@link zigParser#containerDeclarations}.
	 * @param ctx the parse tree
	 */
	void enterContainerDeclarations(zigParser.ContainerDeclarationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link zigParser#containerDeclarations}.
	 * @param ctx the parse tree
	 */
	void exitContainerDeclarations(zigParser.ContainerDeclarationsContext ctx);
	/**
	 * Enter a parse tree produced by {@link zigParser#testDecl}.
	 * @param ctx the parse tree
	 */
	void enterTestDecl(zigParser.TestDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link zigParser#testDecl}.
	 * @param ctx the parse tree
	 */
	void exitTestDecl(zigParser.TestDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link zigParser#topLevelComptime}.
	 * @param ctx the parse tree
	 */
	void enterTopLevelComptime(zigParser.TopLevelComptimeContext ctx);
	/**
	 * Exit a parse tree produced by {@link zigParser#topLevelComptime}.
	 * @param ctx the parse tree
	 */
	void exitTopLevelComptime(zigParser.TopLevelComptimeContext ctx);
	/**
	 * Enter a parse tree produced by {@link zigParser#topLevelDecl}.
	 * @param ctx the parse tree
	 */
	void enterTopLevelDecl(zigParser.TopLevelDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link zigParser#topLevelDecl}.
	 * @param ctx the parse tree
	 */
	void exitTopLevelDecl(zigParser.TopLevelDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link zigParser#fnProto}.
	 * @param ctx the parse tree
	 */
	void enterFnProto(zigParser.FnProtoContext ctx);
	/**
	 * Exit a parse tree produced by {@link zigParser#fnProto}.
	 * @param ctx the parse tree
	 */
	void exitFnProto(zigParser.FnProtoContext ctx);
	/**
	 * Enter a parse tree produced by {@link zigParser#varDecl}.
	 * @param ctx the parse tree
	 */
	void enterVarDecl(zigParser.VarDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link zigParser#varDecl}.
	 * @param ctx the parse tree
	 */
	void exitVarDecl(zigParser.VarDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link zigParser#containerField}.
	 * @param ctx the parse tree
	 */
	void enterContainerField(zigParser.ContainerFieldContext ctx);
	/**
	 * Exit a parse tree produced by {@link zigParser#containerField}.
	 * @param ctx the parse tree
	 */
	void exitContainerField(zigParser.ContainerFieldContext ctx);
	/**
	 * Enter a parse tree produced by {@link zigParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(zigParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link zigParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(zigParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link zigParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(zigParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link zigParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(zigParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link zigParser#labeledStatement}.
	 * @param ctx the parse tree
	 */
	void enterLabeledStatement(zigParser.LabeledStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link zigParser#labeledStatement}.
	 * @param ctx the parse tree
	 */
	void exitLabeledStatement(zigParser.LabeledStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link zigParser#loopStatement}.
	 * @param ctx the parse tree
	 */
	void enterLoopStatement(zigParser.LoopStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link zigParser#loopStatement}.
	 * @param ctx the parse tree
	 */
	void exitLoopStatement(zigParser.LoopStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link zigParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void enterForStatement(zigParser.ForStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link zigParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void exitForStatement(zigParser.ForStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link zigParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatement(zigParser.WhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link zigParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatement(zigParser.WhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link zigParser#blockExprStatement}.
	 * @param ctx the parse tree
	 */
	void enterBlockExprStatement(zigParser.BlockExprStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link zigParser#blockExprStatement}.
	 * @param ctx the parse tree
	 */
	void exitBlockExprStatement(zigParser.BlockExprStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link zigParser#blockExpr}.
	 * @param ctx the parse tree
	 */
	void enterBlockExpr(zigParser.BlockExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link zigParser#blockExpr}.
	 * @param ctx the parse tree
	 */
	void exitBlockExpr(zigParser.BlockExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link zigParser#assignExpr}.
	 * @param ctx the parse tree
	 */
	void enterAssignExpr(zigParser.AssignExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link zigParser#assignExpr}.
	 * @param ctx the parse tree
	 */
	void exitAssignExpr(zigParser.AssignExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link zigParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(zigParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link zigParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(zigParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link zigParser#boolOrExpr}.
	 * @param ctx the parse tree
	 */
	void enterBoolOrExpr(zigParser.BoolOrExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link zigParser#boolOrExpr}.
	 * @param ctx the parse tree
	 */
	void exitBoolOrExpr(zigParser.BoolOrExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link zigParser#boolAndExpr}.
	 * @param ctx the parse tree
	 */
	void enterBoolAndExpr(zigParser.BoolAndExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link zigParser#boolAndExpr}.
	 * @param ctx the parse tree
	 */
	void exitBoolAndExpr(zigParser.BoolAndExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link zigParser#compareExpr}.
	 * @param ctx the parse tree
	 */
	void enterCompareExpr(zigParser.CompareExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link zigParser#compareExpr}.
	 * @param ctx the parse tree
	 */
	void exitCompareExpr(zigParser.CompareExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link zigParser#bitwiseExpr}.
	 * @param ctx the parse tree
	 */
	void enterBitwiseExpr(zigParser.BitwiseExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link zigParser#bitwiseExpr}.
	 * @param ctx the parse tree
	 */
	void exitBitwiseExpr(zigParser.BitwiseExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link zigParser#bitShiftExpr}.
	 * @param ctx the parse tree
	 */
	void enterBitShiftExpr(zigParser.BitShiftExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link zigParser#bitShiftExpr}.
	 * @param ctx the parse tree
	 */
	void exitBitShiftExpr(zigParser.BitShiftExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link zigParser#additionExpr}.
	 * @param ctx the parse tree
	 */
	void enterAdditionExpr(zigParser.AdditionExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link zigParser#additionExpr}.
	 * @param ctx the parse tree
	 */
	void exitAdditionExpr(zigParser.AdditionExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link zigParser#multiplyExpr}.
	 * @param ctx the parse tree
	 */
	void enterMultiplyExpr(zigParser.MultiplyExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link zigParser#multiplyExpr}.
	 * @param ctx the parse tree
	 */
	void exitMultiplyExpr(zigParser.MultiplyExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link zigParser#prefixExpr}.
	 * @param ctx the parse tree
	 */
	void enterPrefixExpr(zigParser.PrefixExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link zigParser#prefixExpr}.
	 * @param ctx the parse tree
	 */
	void exitPrefixExpr(zigParser.PrefixExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link zigParser#primaryExpr}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryExpr(zigParser.PrimaryExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link zigParser#primaryExpr}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryExpr(zigParser.PrimaryExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link zigParser#ifExpr}.
	 * @param ctx the parse tree
	 */
	void enterIfExpr(zigParser.IfExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link zigParser#ifExpr}.
	 * @param ctx the parse tree
	 */
	void exitIfExpr(zigParser.IfExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link zigParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(zigParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link zigParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(zigParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link zigParser#loopExpr}.
	 * @param ctx the parse tree
	 */
	void enterLoopExpr(zigParser.LoopExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link zigParser#loopExpr}.
	 * @param ctx the parse tree
	 */
	void exitLoopExpr(zigParser.LoopExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link zigParser#forExpr}.
	 * @param ctx the parse tree
	 */
	void enterForExpr(zigParser.ForExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link zigParser#forExpr}.
	 * @param ctx the parse tree
	 */
	void exitForExpr(zigParser.ForExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link zigParser#whileExpr}.
	 * @param ctx the parse tree
	 */
	void enterWhileExpr(zigParser.WhileExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link zigParser#whileExpr}.
	 * @param ctx the parse tree
	 */
	void exitWhileExpr(zigParser.WhileExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link zigParser#curlysuffixExpr}.
	 * @param ctx the parse tree
	 */
	void enterCurlysuffixExpr(zigParser.CurlysuffixExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link zigParser#curlysuffixExpr}.
	 * @param ctx the parse tree
	 */
	void exitCurlysuffixExpr(zigParser.CurlysuffixExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link zigParser#initList}.
	 * @param ctx the parse tree
	 */
	void enterInitList(zigParser.InitListContext ctx);
	/**
	 * Exit a parse tree produced by {@link zigParser#initList}.
	 * @param ctx the parse tree
	 */
	void exitInitList(zigParser.InitListContext ctx);
	/**
	 * Enter a parse tree produced by {@link zigParser#typeExpr}.
	 * @param ctx the parse tree
	 */
	void enterTypeExpr(zigParser.TypeExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link zigParser#typeExpr}.
	 * @param ctx the parse tree
	 */
	void exitTypeExpr(zigParser.TypeExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link zigParser#errorUnionExpr}.
	 * @param ctx the parse tree
	 */
	void enterErrorUnionExpr(zigParser.ErrorUnionExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link zigParser#errorUnionExpr}.
	 * @param ctx the parse tree
	 */
	void exitErrorUnionExpr(zigParser.ErrorUnionExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link zigParser#suffixExpr}.
	 * @param ctx the parse tree
	 */
	void enterSuffixExpr(zigParser.SuffixExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link zigParser#suffixExpr}.
	 * @param ctx the parse tree
	 */
	void exitSuffixExpr(zigParser.SuffixExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link zigParser#primaryTypeExpr}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryTypeExpr(zigParser.PrimaryTypeExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link zigParser#primaryTypeExpr}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryTypeExpr(zigParser.PrimaryTypeExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link zigParser#containerDecl}.
	 * @param ctx the parse tree
	 */
	void enterContainerDecl(zigParser.ContainerDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link zigParser#containerDecl}.
	 * @param ctx the parse tree
	 */
	void exitContainerDecl(zigParser.ContainerDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link zigParser#errorSetDecl}.
	 * @param ctx the parse tree
	 */
	void enterErrorSetDecl(zigParser.ErrorSetDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link zigParser#errorSetDecl}.
	 * @param ctx the parse tree
	 */
	void exitErrorSetDecl(zigParser.ErrorSetDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link zigParser#groupedExpr}.
	 * @param ctx the parse tree
	 */
	void enterGroupedExpr(zigParser.GroupedExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link zigParser#groupedExpr}.
	 * @param ctx the parse tree
	 */
	void exitGroupedExpr(zigParser.GroupedExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link zigParser#ifTypeExpr}.
	 * @param ctx the parse tree
	 */
	void enterIfTypeExpr(zigParser.IfTypeExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link zigParser#ifTypeExpr}.
	 * @param ctx the parse tree
	 */
	void exitIfTypeExpr(zigParser.IfTypeExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link zigParser#labeledTypeExpr}.
	 * @param ctx the parse tree
	 */
	void enterLabeledTypeExpr(zigParser.LabeledTypeExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link zigParser#labeledTypeExpr}.
	 * @param ctx the parse tree
	 */
	void exitLabeledTypeExpr(zigParser.LabeledTypeExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link zigParser#loopTypeExpr}.
	 * @param ctx the parse tree
	 */
	void enterLoopTypeExpr(zigParser.LoopTypeExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link zigParser#loopTypeExpr}.
	 * @param ctx the parse tree
	 */
	void exitLoopTypeExpr(zigParser.LoopTypeExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link zigParser#forTypeExpr}.
	 * @param ctx the parse tree
	 */
	void enterForTypeExpr(zigParser.ForTypeExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link zigParser#forTypeExpr}.
	 * @param ctx the parse tree
	 */
	void exitForTypeExpr(zigParser.ForTypeExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link zigParser#whileTypeExpr}.
	 * @param ctx the parse tree
	 */
	void enterWhileTypeExpr(zigParser.WhileTypeExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link zigParser#whileTypeExpr}.
	 * @param ctx the parse tree
	 */
	void exitWhileTypeExpr(zigParser.WhileTypeExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link zigParser#switchExpr}.
	 * @param ctx the parse tree
	 */
	void enterSwitchExpr(zigParser.SwitchExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link zigParser#switchExpr}.
	 * @param ctx the parse tree
	 */
	void exitSwitchExpr(zigParser.SwitchExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link zigParser#asmExpr}.
	 * @param ctx the parse tree
	 */
	void enterAsmExpr(zigParser.AsmExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link zigParser#asmExpr}.
	 * @param ctx the parse tree
	 */
	void exitAsmExpr(zigParser.AsmExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link zigParser#asmOutput}.
	 * @param ctx the parse tree
	 */
	void enterAsmOutput(zigParser.AsmOutputContext ctx);
	/**
	 * Exit a parse tree produced by {@link zigParser#asmOutput}.
	 * @param ctx the parse tree
	 */
	void exitAsmOutput(zigParser.AsmOutputContext ctx);
	/**
	 * Enter a parse tree produced by {@link zigParser#asmOutputItem}.
	 * @param ctx the parse tree
	 */
	void enterAsmOutputItem(zigParser.AsmOutputItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link zigParser#asmOutputItem}.
	 * @param ctx the parse tree
	 */
	void exitAsmOutputItem(zigParser.AsmOutputItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link zigParser#asmInput}.
	 * @param ctx the parse tree
	 */
	void enterAsmInput(zigParser.AsmInputContext ctx);
	/**
	 * Exit a parse tree produced by {@link zigParser#asmInput}.
	 * @param ctx the parse tree
	 */
	void exitAsmInput(zigParser.AsmInputContext ctx);
	/**
	 * Enter a parse tree produced by {@link zigParser#asmInputItem}.
	 * @param ctx the parse tree
	 */
	void enterAsmInputItem(zigParser.AsmInputItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link zigParser#asmInputItem}.
	 * @param ctx the parse tree
	 */
	void exitAsmInputItem(zigParser.AsmInputItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link zigParser#asmClobbers}.
	 * @param ctx the parse tree
	 */
	void enterAsmClobbers(zigParser.AsmClobbersContext ctx);
	/**
	 * Exit a parse tree produced by {@link zigParser#asmClobbers}.
	 * @param ctx the parse tree
	 */
	void exitAsmClobbers(zigParser.AsmClobbersContext ctx);
	/**
	 * Enter a parse tree produced by {@link zigParser#breakLabel}.
	 * @param ctx the parse tree
	 */
	void enterBreakLabel(zigParser.BreakLabelContext ctx);
	/**
	 * Exit a parse tree produced by {@link zigParser#breakLabel}.
	 * @param ctx the parse tree
	 */
	void exitBreakLabel(zigParser.BreakLabelContext ctx);
	/**
	 * Enter a parse tree produced by {@link zigParser#blockLabel}.
	 * @param ctx the parse tree
	 */
	void enterBlockLabel(zigParser.BlockLabelContext ctx);
	/**
	 * Exit a parse tree produced by {@link zigParser#blockLabel}.
	 * @param ctx the parse tree
	 */
	void exitBlockLabel(zigParser.BlockLabelContext ctx);
	/**
	 * Enter a parse tree produced by {@link zigParser#fieldInit}.
	 * @param ctx the parse tree
	 */
	void enterFieldInit(zigParser.FieldInitContext ctx);
	/**
	 * Exit a parse tree produced by {@link zigParser#fieldInit}.
	 * @param ctx the parse tree
	 */
	void exitFieldInit(zigParser.FieldInitContext ctx);
	/**
	 * Enter a parse tree produced by {@link zigParser#whileContinueExpr}.
	 * @param ctx the parse tree
	 */
	void enterWhileContinueExpr(zigParser.WhileContinueExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link zigParser#whileContinueExpr}.
	 * @param ctx the parse tree
	 */
	void exitWhileContinueExpr(zigParser.WhileContinueExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link zigParser#linkSection}.
	 * @param ctx the parse tree
	 */
	void enterLinkSection(zigParser.LinkSectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link zigParser#linkSection}.
	 * @param ctx the parse tree
	 */
	void exitLinkSection(zigParser.LinkSectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link zigParser#callConv}.
	 * @param ctx the parse tree
	 */
	void enterCallConv(zigParser.CallConvContext ctx);
	/**
	 * Exit a parse tree produced by {@link zigParser#callConv}.
	 * @param ctx the parse tree
	 */
	void exitCallConv(zigParser.CallConvContext ctx);
	/**
	 * Enter a parse tree produced by {@link zigParser#paramDecl}.
	 * @param ctx the parse tree
	 */
	void enterParamDecl(zigParser.ParamDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link zigParser#paramDecl}.
	 * @param ctx the parse tree
	 */
	void exitParamDecl(zigParser.ParamDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link zigParser#paramType}.
	 * @param ctx the parse tree
	 */
	void enterParamType(zigParser.ParamTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link zigParser#paramType}.
	 * @param ctx the parse tree
	 */
	void exitParamType(zigParser.ParamTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link zigParser#ifPrefix}.
	 * @param ctx the parse tree
	 */
	void enterIfPrefix(zigParser.IfPrefixContext ctx);
	/**
	 * Exit a parse tree produced by {@link zigParser#ifPrefix}.
	 * @param ctx the parse tree
	 */
	void exitIfPrefix(zigParser.IfPrefixContext ctx);
	/**
	 * Enter a parse tree produced by {@link zigParser#whilePrefix}.
	 * @param ctx the parse tree
	 */
	void enterWhilePrefix(zigParser.WhilePrefixContext ctx);
	/**
	 * Exit a parse tree produced by {@link zigParser#whilePrefix}.
	 * @param ctx the parse tree
	 */
	void exitWhilePrefix(zigParser.WhilePrefixContext ctx);
	/**
	 * Enter a parse tree produced by {@link zigParser#forPrefix}.
	 * @param ctx the parse tree
	 */
	void enterForPrefix(zigParser.ForPrefixContext ctx);
	/**
	 * Exit a parse tree produced by {@link zigParser#forPrefix}.
	 * @param ctx the parse tree
	 */
	void exitForPrefix(zigParser.ForPrefixContext ctx);
	/**
	 * Enter a parse tree produced by {@link zigParser#payload}.
	 * @param ctx the parse tree
	 */
	void enterPayload(zigParser.PayloadContext ctx);
	/**
	 * Exit a parse tree produced by {@link zigParser#payload}.
	 * @param ctx the parse tree
	 */
	void exitPayload(zigParser.PayloadContext ctx);
	/**
	 * Enter a parse tree produced by {@link zigParser#ptrpayload}.
	 * @param ctx the parse tree
	 */
	void enterPtrpayload(zigParser.PtrpayloadContext ctx);
	/**
	 * Exit a parse tree produced by {@link zigParser#ptrpayload}.
	 * @param ctx the parse tree
	 */
	void exitPtrpayload(zigParser.PtrpayloadContext ctx);
	/**
	 * Enter a parse tree produced by {@link zigParser#ptrIndexpayload}.
	 * @param ctx the parse tree
	 */
	void enterPtrIndexpayload(zigParser.PtrIndexpayloadContext ctx);
	/**
	 * Exit a parse tree produced by {@link zigParser#ptrIndexpayload}.
	 * @param ctx the parse tree
	 */
	void exitPtrIndexpayload(zigParser.PtrIndexpayloadContext ctx);
	/**
	 * Enter a parse tree produced by {@link zigParser#switchProng}.
	 * @param ctx the parse tree
	 */
	void enterSwitchProng(zigParser.SwitchProngContext ctx);
	/**
	 * Exit a parse tree produced by {@link zigParser#switchProng}.
	 * @param ctx the parse tree
	 */
	void exitSwitchProng(zigParser.SwitchProngContext ctx);
	/**
	 * Enter a parse tree produced by {@link zigParser#switchCase}.
	 * @param ctx the parse tree
	 */
	void enterSwitchCase(zigParser.SwitchCaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link zigParser#switchCase}.
	 * @param ctx the parse tree
	 */
	void exitSwitchCase(zigParser.SwitchCaseContext ctx);
	/**
	 * Enter a parse tree produced by {@link zigParser#switchItem}.
	 * @param ctx the parse tree
	 */
	void enterSwitchItem(zigParser.SwitchItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link zigParser#switchItem}.
	 * @param ctx the parse tree
	 */
	void exitSwitchItem(zigParser.SwitchItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link zigParser#assignOp}.
	 * @param ctx the parse tree
	 */
	void enterAssignOp(zigParser.AssignOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link zigParser#assignOp}.
	 * @param ctx the parse tree
	 */
	void exitAssignOp(zigParser.AssignOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link zigParser#compareOp}.
	 * @param ctx the parse tree
	 */
	void enterCompareOp(zigParser.CompareOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link zigParser#compareOp}.
	 * @param ctx the parse tree
	 */
	void exitCompareOp(zigParser.CompareOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link zigParser#bitwiseOp}.
	 * @param ctx the parse tree
	 */
	void enterBitwiseOp(zigParser.BitwiseOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link zigParser#bitwiseOp}.
	 * @param ctx the parse tree
	 */
	void exitBitwiseOp(zigParser.BitwiseOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link zigParser#bitShiftOp}.
	 * @param ctx the parse tree
	 */
	void enterBitShiftOp(zigParser.BitShiftOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link zigParser#bitShiftOp}.
	 * @param ctx the parse tree
	 */
	void exitBitShiftOp(zigParser.BitShiftOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link zigParser#additionOp}.
	 * @param ctx the parse tree
	 */
	void enterAdditionOp(zigParser.AdditionOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link zigParser#additionOp}.
	 * @param ctx the parse tree
	 */
	void exitAdditionOp(zigParser.AdditionOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link zigParser#multiplyOp}.
	 * @param ctx the parse tree
	 */
	void enterMultiplyOp(zigParser.MultiplyOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link zigParser#multiplyOp}.
	 * @param ctx the parse tree
	 */
	void exitMultiplyOp(zigParser.MultiplyOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link zigParser#prefixOp}.
	 * @param ctx the parse tree
	 */
	void enterPrefixOp(zigParser.PrefixOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link zigParser#prefixOp}.
	 * @param ctx the parse tree
	 */
	void exitPrefixOp(zigParser.PrefixOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link zigParser#prefixTypeOp}.
	 * @param ctx the parse tree
	 */
	void enterPrefixTypeOp(zigParser.PrefixTypeOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link zigParser#prefixTypeOp}.
	 * @param ctx the parse tree
	 */
	void exitPrefixTypeOp(zigParser.PrefixTypeOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link zigParser#suffixOp}.
	 * @param ctx the parse tree
	 */
	void enterSuffixOp(zigParser.SuffixOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link zigParser#suffixOp}.
	 * @param ctx the parse tree
	 */
	void exitSuffixOp(zigParser.SuffixOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link zigParser#fnCallArguments}.
	 * @param ctx the parse tree
	 */
	void enterFnCallArguments(zigParser.FnCallArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link zigParser#fnCallArguments}.
	 * @param ctx the parse tree
	 */
	void exitFnCallArguments(zigParser.FnCallArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link zigParser#sliceTypeStart}.
	 * @param ctx the parse tree
	 */
	void enterSliceTypeStart(zigParser.SliceTypeStartContext ctx);
	/**
	 * Exit a parse tree produced by {@link zigParser#sliceTypeStart}.
	 * @param ctx the parse tree
	 */
	void exitSliceTypeStart(zigParser.SliceTypeStartContext ctx);
	/**
	 * Enter a parse tree produced by {@link zigParser#ptrTypeStart}.
	 * @param ctx the parse tree
	 */
	void enterPtrTypeStart(zigParser.PtrTypeStartContext ctx);
	/**
	 * Exit a parse tree produced by {@link zigParser#ptrTypeStart}.
	 * @param ctx the parse tree
	 */
	void exitPtrTypeStart(zigParser.PtrTypeStartContext ctx);
	/**
	 * Enter a parse tree produced by {@link zigParser#arrayTypeStart}.
	 * @param ctx the parse tree
	 */
	void enterArrayTypeStart(zigParser.ArrayTypeStartContext ctx);
	/**
	 * Exit a parse tree produced by {@link zigParser#arrayTypeStart}.
	 * @param ctx the parse tree
	 */
	void exitArrayTypeStart(zigParser.ArrayTypeStartContext ctx);
	/**
	 * Enter a parse tree produced by {@link zigParser#containerDeclAuto}.
	 * @param ctx the parse tree
	 */
	void enterContainerDeclAuto(zigParser.ContainerDeclAutoContext ctx);
	/**
	 * Exit a parse tree produced by {@link zigParser#containerDeclAuto}.
	 * @param ctx the parse tree
	 */
	void exitContainerDeclAuto(zigParser.ContainerDeclAutoContext ctx);
	/**
	 * Enter a parse tree produced by {@link zigParser#containerDeclType}.
	 * @param ctx the parse tree
	 */
	void enterContainerDeclType(zigParser.ContainerDeclTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link zigParser#containerDeclType}.
	 * @param ctx the parse tree
	 */
	void exitContainerDeclType(zigParser.ContainerDeclTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link zigParser#byteAlign}.
	 * @param ctx the parse tree
	 */
	void enterByteAlign(zigParser.ByteAlignContext ctx);
	/**
	 * Exit a parse tree produced by {@link zigParser#byteAlign}.
	 * @param ctx the parse tree
	 */
	void exitByteAlign(zigParser.ByteAlignContext ctx);
	/**
	 * Enter a parse tree produced by {@link zigParser#identifierList}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierList(zigParser.IdentifierListContext ctx);
	/**
	 * Exit a parse tree produced by {@link zigParser#identifierList}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierList(zigParser.IdentifierListContext ctx);
	/**
	 * Enter a parse tree produced by {@link zigParser#switchProngList}.
	 * @param ctx the parse tree
	 */
	void enterSwitchProngList(zigParser.SwitchProngListContext ctx);
	/**
	 * Exit a parse tree produced by {@link zigParser#switchProngList}.
	 * @param ctx the parse tree
	 */
	void exitSwitchProngList(zigParser.SwitchProngListContext ctx);
	/**
	 * Enter a parse tree produced by {@link zigParser#asmOutputList}.
	 * @param ctx the parse tree
	 */
	void enterAsmOutputList(zigParser.AsmOutputListContext ctx);
	/**
	 * Exit a parse tree produced by {@link zigParser#asmOutputList}.
	 * @param ctx the parse tree
	 */
	void exitAsmOutputList(zigParser.AsmOutputListContext ctx);
	/**
	 * Enter a parse tree produced by {@link zigParser#asmInputList}.
	 * @param ctx the parse tree
	 */
	void enterAsmInputList(zigParser.AsmInputListContext ctx);
	/**
	 * Exit a parse tree produced by {@link zigParser#asmInputList}.
	 * @param ctx the parse tree
	 */
	void exitAsmInputList(zigParser.AsmInputListContext ctx);
	/**
	 * Enter a parse tree produced by {@link zigParser#stringList}.
	 * @param ctx the parse tree
	 */
	void enterStringList(zigParser.StringListContext ctx);
	/**
	 * Exit a parse tree produced by {@link zigParser#stringList}.
	 * @param ctx the parse tree
	 */
	void exitStringList(zigParser.StringListContext ctx);
	/**
	 * Enter a parse tree produced by {@link zigParser#paramDeclList}.
	 * @param ctx the parse tree
	 */
	void enterParamDeclList(zigParser.ParamDeclListContext ctx);
	/**
	 * Exit a parse tree produced by {@link zigParser#paramDeclList}.
	 * @param ctx the parse tree
	 */
	void exitParamDeclList(zigParser.ParamDeclListContext ctx);
	/**
	 * Enter a parse tree produced by {@link zigParser#exprList}.
	 * @param ctx the parse tree
	 */
	void enterExprList(zigParser.ExprListContext ctx);
	/**
	 * Exit a parse tree produced by {@link zigParser#exprList}.
	 * @param ctx the parse tree
	 */
	void exitExprList(zigParser.ExprListContext ctx);
}