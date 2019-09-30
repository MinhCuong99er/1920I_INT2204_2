package com.lab03;
public class Week4 {
    /**
     *
     * @param a
     * @param b
     * @return max of $a and $b
     */
    public static int max2Int(int a, int b) {
        return (a >= b) ? a : b;
    }

    /**
     *
     * @param arr
     * @return min of array $arr
     */
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    /**
     *
     * @param weight: in kg
     * @param height: in m
     * @return BMI index
     */
    public static int minArray(int[] arr) {
        for (int i=0;i < arr.length-1;i++) {
            for (int j=0;j < arr.length-1;j++){
                if (arr[j] > arr[j+1]) swap(arr, i,j+1);
            }
        }
        return arr[0];
    }
    public static String calculateBMI(double weight, double height) {
        double BMI = weight/(height*height);
        if (BMI < 18.5) return "Thiếu cân";
        else if (18.5 <= BMI && BMI <= 22.9) return "Bình thường";
        else if (23 <= BMI && BMI <= 24.9) return "Thừa cân";
        else return "Béo phì";
    }
    public static void main(String[] args) {
        System.out.println("Max(30, 10) = " + max2Int(30,10));
        System.out.println("BMI(50, 1.8) = " + calculateBMI(50,1.8));
        int [] arr = {4,9,0,1,3,-5,2,7};
        System.out.println("Min of Array is: " + minArray(arr));
    }
}
