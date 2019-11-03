public class Multiplication extends BinaryExpression{
    private Expression left;
    private Expression right;

    public Expression getLeft() {
        return left;
    }
    public void setLeft(Expression _left) {
        this.left = _left;
    }
    public Expression getRight() {
        return right;
    }
    public void setRight(Expression _right) {
        this.right = _right;
    }

    public Multiplication (Expression _left, Expression _right) {
        this.left = _left;
        this.right = _right;
    }
    public double evaluate (){
        return left.evaluate() * right.evaluate();
    }

    public Expression left() {
        return this.left;
    }

    public Expression right() {
        return this.right;
    }
    public String toString() {
        return left.toString() + " * " + right.toString() ;
    }
}
