/**
 * Created by CCNE on 04/11/2019.
 */
import java.awt.*;
import java.io.*;
import java.util.Scanner;
public class Week8_Task2 {
    public void NullPoiter () throws NullPointerException {
        //Null poiter
        String chuoi = null;
        System.out.println(chuoi.charAt(2));
    }
    public void ArrayIndexOfBound () throws ArrayIndexOutOfBoundsException {
        // Outofindex
        int mang [] = { 1, 5 , 6 };
        System.out.println(mang[5]);
    }
    public void ArithmeticErr () throws ArithmeticException {
        //divine by zero
        int a = 0;
        int b = 27;
        int divine = b/a;
        System.out.println(divine);
    }
    public void ClassCastErr () throws ClassCastException {
        Object x = new String("hi");
        System.out.println((Integer) x);
    }
    public void IOErr () throws IOException{
        File file = new File("Test.txt");
        FileWriter writer = new FileWriter(file);
        PrintWriter ghi = new PrintWriter(file);
        ghi.print("Hi!");
        ghi.close(); 
    }
    public void FileNotFound () throws FileNotFoundException {
        File file = new File("Test.txt");
        FileReader reader = new FileReader(file);
    }
    public static void main (String args[]){
        Week8_Task2 goiham = new Week8_Task2();
        // Null Pointer
        try {
            goiham.NullPoiter();
        } catch (NullPointerException x){
            System.out.println("Lỗi Null Pointer" + "\n");
        }
        // ArrayIndexOfBound
        try {
            goiham.ArrayIndexOfBound();
        } catch (ArrayIndexOutOfBoundsException x){
            System.out.println("Lỗi Array Index Out OF Bounds" + "\n");

        }
        // ArithmeticErr
        try {
            goiham.ArithmeticErr();
        } catch (ArithmeticException x) {
            System.out.println("Lỗi Arithmetic" + "\n");
        }
        /*//ClassCastErr
        try {
            goiham.ClassCastErr();
        } catch (ClassCastException x) {
            System.out.println("Having an exception : CLASS CAST EXCEPTION ! ");
            System.out.println(x.getMessage() + "\n");
        }*/
        //IO Exception
        try {
            goiham.IOErr();
        } catch (IOException x) {
            System.out.println("Lỗi IO");
            System.out.println(x.getMessage() + "\n");
        }
        // File not found exception
        try {
            goiham.FileNotFound();
        } catch (FileNotFoundException k) {
            System.out.println("Lỗi File Not Found");
            System.out.println(k.getMessage());
        }
    }
}
