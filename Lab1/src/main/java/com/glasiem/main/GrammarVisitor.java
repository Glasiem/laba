// Generated from F:/IdeaProjects/Lab1/src/main/java/com/glasiem/parser\Grammar.g4 by ANTLR 4.9.1
package com.glasiem.main;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;


public interface GrammarVisitor<T> extends ParseTreeVisitor<T> {

	T visitMultiplicativeExpr(GrammarParser.MultiplicativeExprContext ctx);

	T visitExponentialExpr(GrammarParser.ExponentialExprContext ctx);

	T visitAdditiveExpr(GrammarParser.AdditiveExprContext ctx);

	T visitNumberExpr(GrammarParser.NumberExprContext ctx);

	T visitIncreaseExpr(GrammarParser.IncreaseExprContext ctx);

	T visitParenthesizedExpr(GrammarParser.ParenthesizedExprContext ctx);

	T visitComparativeExpr(GrammarParser.ComparativeExprContext ctx);
}