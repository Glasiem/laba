// Generated from F:/IdeaProjects/Lab1/src/main/java/com/glasiem/parser\Grammar.g4 by ANTLR 4.9.1
package com.glasiem.main;
import org.antlr.v4.runtime.tree.ParseTreeListener;


public interface GrammarListener extends ParseTreeListener {

	void enterMultiplicativeExpr(GrammarParser.MultiplicativeExprContext ctx);

	void exitMultiplicativeExpr(GrammarParser.MultiplicativeExprContext ctx);

	void enterExponentialExpr(GrammarParser.ExponentialExprContext ctx);

	void exitExponentialExpr(GrammarParser.ExponentialExprContext ctx);

	void enterAdditiveExpr(GrammarParser.AdditiveExprContext ctx);

	void exitAdditiveExpr(GrammarParser.AdditiveExprContext ctx);

	void enterNumberExpr(GrammarParser.NumberExprContext ctx);

	void exitNumberExpr(GrammarParser.NumberExprContext ctx);

	void enterIncreaseExpr(GrammarParser.IncreaseExprContext ctx);

	void exitIncreaseExpr(GrammarParser.IncreaseExprContext ctx);

	void enterParenthesizedExpr(GrammarParser.ParenthesizedExprContext ctx);

	void exitParenthesizedExpr(GrammarParser.ParenthesizedExprContext ctx);

	void enterComparativeExpr(GrammarParser.ComparativeExprContext ctx);

	void exitComparativeExpr(GrammarParser.ComparativeExprContext ctx);
}