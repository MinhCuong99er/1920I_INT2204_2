public class Square extends Expression {
    private Expression expression;

    public Square (Expression _expression){
        this.expression = _expression;
    }
    public Expression getExpression() {
        return expression;
    }
    public void setExpression(Expression _expression) {
        this.expression = _expression;
    }

    public double evaluate() {
        return expression.evaluate() * expression.evaluate();
    }

    public String toString() {
        if (expression instanceof Numeral) return expression.toString() + "^2";
        else return "(" + expression.toString() + ") ^ 2";
    }
}
