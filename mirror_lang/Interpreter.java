import org.antlr.v4.runtime.tree.ParseTree;
import java.util.HashMap;
import java.util.Map;

public class Interpreter extends MirrorLangBaseVisitor<Void> {

    private Map<String, Integer> variables = new HashMap<>();

    @Override
    public Void visitSetStatement(MirrorLangParser.SetStatementContext ctx) {
        String varName = ctx.VARIABLE().getText();
        int value = evaluateExpression(ctx.expression());
        variables.put(varName, value);
        System.out.println("Set " + varName + " = " + value);
        return null;
    }

    @Override
    public Void visitLogStatement(MirrorLangParser.LogStatementContext ctx) {
        if (ctx.expression() != null) {
            int value = evaluateExpression(ctx.expression());
            System.out.println("Log: " + value);
        } else if (ctx.STRING_VALUE() != null) {
            System.out.println("Log: " + ctx.STRING_VALUE().getText());
        }
        return null;
    }

    @Override
    public Void visitIfStatement(MirrorLangParser.IfStatementContext ctx) {
        boolean condition = evaluateCondition(ctx.condition());
        if (condition) {
            for (MirrorLangParser.InnerStatementContext innerStmt : ctx.innerStatement()) {
                visit(innerStmt);
            }
        }
        return null;
    }

    @Override
    public Void visitLoopIfStatement(MirrorLangParser.LoopIfStatementContext ctx) {
        while (evaluateCondition(ctx.condition())) {
            for (MirrorLangParser.InnerStatementContext innerStmt : ctx.innerStatement()) {
                visit(innerStmt);
            }
        }
        return null;
    }

    @Override
    public Void visitInnerStatement(MirrorLangParser.InnerStatementContext ctx) {
        if (ctx.statement() != null) {
            visit(ctx.statement());
        }
        return null;
    }

    private boolean evaluateCondition(MirrorLangParser.ConditionContext ctx) {
        int left = evaluateExpression(ctx.expression(0));
        int right = evaluateExpression(ctx.expression(1));
        String operator = ctx.COMPARE_OPERATOR().getText();

        switch (operator) {
            case "==":
                return left == right;
            case "!=":
                return left != right;
            case ">":
                return left > right;
            case "<":
                return left < right;
            case ">=":
                return left >= right;
            case "<=":
                return left <= right;
        }
        return false;
    }

    private int evaluateExpression(MirrorLangParser.ExpressionContext ctx) {
        int result = evaluateTerm(ctx.term(0));

        for (int i = 1; i < ctx.term().size(); i++) {
            String operator = ctx.ARITHMETIC_OPERATOR(i - 1).getText();
            int nextTerm = evaluateTerm(ctx.term(i));

            switch (operator) {
                case "+":
                    result += nextTerm;
                    break;
                case "-":
                    result -= nextTerm;
                    break;
                case "*":
                    result *= nextTerm;
                    break;
                case "/":
                    if (nextTerm == 0) {
                        System.err.println("Runtime Error: Division by zero");
                        result = 0;
                    } else {
                        result /= nextTerm;
                    }
                    break;
                case "%":
                    if (nextTerm == 0) {
                        System.err.println("Runtime Error: Modulo by zero");
                        result = 0;
                    } else {
                        result %= nextTerm;
                    }
                    break;
            }
        }

        return result;
    }

    private int evaluateTerm(MirrorLangParser.TermContext ctx) {
        if (ctx.VARIABLE() != null) {
            String varName = ctx.VARIABLE().getText();
            if (!variables.containsKey(varName)) {
                System.err.println("Runtime Error: Variable '" + varName + "' not defined");
                return 0;
            }
            return variables.get(varName);
        } else if (ctx.INT_VALUE() != null) {
            try {
                return Integer.parseInt(ctx.INT_VALUE().getText());
            } catch (NumberFormatException e) {
                System.err.println("Runtime Error: Invalid int value '" + ctx.INT_VALUE().getText() + "'");
                return 0;
            }
        } else if (ctx.expression() != null) {
            return evaluateExpression(ctx.expression());
        }
        return 0;
    }
}
