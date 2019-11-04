public class Division extends BinaryExpression{
    private Expression left;
    private Expression right;
    public Division(Expression _left, Expression _right) {
        this.left = _left;
        this.right = _right;
    }

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

    public double evaluate (){
        try {
            return left.evaluate() / right.evaluate();
        } catch (ArithmeticException x){
            System.out.println("Lỗi chia cho 0");
            return -1000000;
        }
    }

    public Expression left() {
        return this.left;
    }
    public Expression right() {
        return this.right;
    }
    public String toString() {
        return left.toString() + " / " + right.toString() ;
    }
}
