import java.io.*;
import java.util.*;

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
        File file = new File("C:\\Users\\FPT\\IdeaProjects\\lab08-OOP-1.1\\data.txt");
        FileWriter writer = new FileWriter(file);
        PrintWriter ghi = new PrintWriter(file);
        ghi.print("Hi!");
        ghi.close();
    }
    public void FileNotFound () throws FileNotFoundException {
        File file = new File("C:\\Users\\FPT\\IdeaProjects\\lab08-OOP-1.1\\data.txt\\hello.txt");
        FileReader reader = new FileReader(file);
    }
    public static void main (String args[]){
        Week8_Task2 goiham = new Week8_Task2();
        // Null Pointer
        try {
            goiham.NullPoiter();
        } catch (NullPointerException x){
            System.out.println("Having an exception : NULL POINTER EXCEPTION !" + "\n");
        }
        // ArrayIndexOfBound
        try {
            goiham.ArrayIndexOfBound();
        } catch (ArrayIndexOutOfBoundsException x){
            System.out.println("Having an exception : ARRAY INDEX OUT OF BOUNDS EXCEPTION ! " + "\n");

        }
        // ArithmeticErr
        try {
            goiham.ArithmeticErr();
        } catch (ArithmeticException x) {
            System.out.println("Having an exception : ARITHMETIC EXCEPTION ! " + "\n");
        }
        //ClassCastErr
        try {
            goiham.ClassCastErr();
        } catch (ClassCastException x) {
            System.out.println("Having an exception : CLASS CAST EXCEPTION ! ");
            System.out.println(x.getMessage() + "\n");
        }
        //IO Exception
        try {
            goiham.IOErr();
        } catch (IOException x) {
            System.out.println("Having an exception : IO EXCEPTION ! ");
            System.out.println(x.getMessage() + "\n");
        }
        // File not found exception
        try {
            goiham.FileNotFound();
        } catch (FileNotFoundException k) {
            System.out.println("Having an exception : FILE NOT FOUND EXCEPTION ! ");
            System.out.println(k.getMessage());
        }
    }
}
