import java.util.Scanner;

/**
 * Created by CCNE on 23/09/2019.
 */
public class Week4 {
    public static int max2Int(int a, int b) {
        return (a >= b) ? a : b;
    }

    /*public static int minArray(int[] arr) {
        for (int i=0;i<arr.length()-1;i++)
        {
            for (int j=0;j<arr.length()-1;j++)
            {
                if (arr[j] > arr[j+1]) swap(arr[j],arr[j+1]);
            }
        }
        return arr[0];
    }*/

    public static String calculateBMI(double weight, double height) {
        double BMI = weight/(height*height);
        if (BMI < 18.5) return "Thiếu cân";
        else if (18.5 <= BMI && BMI <= 22.9) return "Bình thường";
        else if (23 <= BMI && BMI <= 24.9) return "Thừa cân";
        else return "Béo phì";
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(max2Int(30,10));
    }
}
