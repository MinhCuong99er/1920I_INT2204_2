package com.lab03;

import java.lang.*;
import java.util.*;
public class Week3Task1 {
    public static int GCD (int a, int b){
        if (b==0) return a;
        else return GCD(b,a%b);
    }
    public static int Fibonacci (int n) {
        if (n==0) return 0;
        else if (n==1) return 1;
        else return Fibonacci(n-1) + Fibonacci(n-2);
    }
    public static void sieveEratosthenes(int n) {
        boolean[] isPrime = new boolean[500];
        int i, j;
        for (i = 2; i <= n; i++) {
            isPrime[i] = true;
        }
        for (i = 2; i*i <= n; i++) {
            if (isPrime[i] == true) {
                for (j = 2 * i; j <= n; j += i) {
                    isPrime[j] = false;
                }
            }
        }
        System.out.print("Prime number < " + n + " is: ");
        for(i = 2; i <= n; i++) {
            if (isPrime[i] == true) System.out.print(i + " ");
        }
        System.out.println(" ");
    }
    public static void main(String[] args) {
        Random rd = new Random();
        int x, y, z;
        x = rd.nextInt(10);
        y = rd.nextInt(200);
        z = rd.nextInt(200);
        System.out.println("Fibonacci of " + x + " = " + Fibonacci(x));
        System.out.println("GCD(" + y +", " + z + ") = " + GCD(y,z));
        sieveEratosthenes(x);
        sieveEratosthenes(y);
        sieveEratosthenes(z);
    }
}