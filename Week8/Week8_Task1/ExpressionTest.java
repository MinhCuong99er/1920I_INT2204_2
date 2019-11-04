import static org.junit.Assert.*;
import java.util.*;
public class ExpressionTest {
    public static void main (String arg[]){
        Expression x1 = new Numeral(10);
        Expression x2 = new Numeral(1);
        Expression x3 = new Numeral(2);
        Expression x4 = new Numeral(3);

        Expression bPhuong1 = new Square(x1);
        Expression hieu = new Subtraction(bPhuong1,x2);
        Expression tich = new Multiplication(x3,x4);
        Expression tong = new Addition(hieu,tich);
        Expression bPhuong2 = new Square(tong);
        double result = bPhuong2.evaluate();
        System.out.println(bPhuong2.toString() + " = " + result);
    }
}

