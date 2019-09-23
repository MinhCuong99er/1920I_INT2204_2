package com.lab03;

import java.util.*;
import java.lang.*;

public class Fraction {
    private int numerator, denominator;
    public int getNumerator() {
        return numerator;
    }
    public int getDenominator() {
        return (this.denominator!=0) ? denominator : 1;
    }
    public void setNumerator(int _numerator) {
        this.numerator = _numerator;
    }
    public void setDenominator(int _denominator) {
        if (denominator!=0) this.denominator = _denominator;
        else this.denominator = 1;
    }

    Fraction() {
        this.numerator = 1;
        this.denominator = 1;
    }
    Fraction(int _numerator) {
        this.numerator = _numerator;
        this.denominator = 1;
    }
    public Fraction (int _numerator, int _denominator){
        if (_denominator !=0) {
            this.numerator = _numerator;
            this.denominator = _denominator;
        }
        else {
            this.numerator = _numerator;
            this.denominator = 1;
        }
    }
    Fraction(Fraction other) {
        this.numerator = other.getNumerator();
        this.denominator = other.getDenominator();
    }

    public static String toStringFraction(Fraction other) {
        if (other.getNumerator()==0) return "0";
        else if (other.getNumerator() == other.getDenominator()) return "1";
        else if (other.getNumerator() == -other.getDenominator()) return "-1";
        else if (other.getDenominator()==1) return other.getNumerator() + " ";
        else if (other.getDenominator() == -1) return (other.getNumerator())*(-1) + " ";
        else if (other.getDenominator()<0) return (other.getNumerator())*(-1) + "/" + other.getDenominator();
        return other.getNumerator() + "/" + other.getDenominator();
    }
    public static int GCD (int a, int b){
        if (b==0) return a;
        else return GCD(b,a%b);
    }
    public Fraction reduce() {
        int gcd = Math.abs(GCD(this.getNumerator(), this.getDenominator()));
        this.numerator = this.getNumerator()/gcd;
        this.denominator = this.getDenominator()/gcd;
        return this;
    }

    public Fraction add(Fraction other) {
        int _numerator = this.getNumerator()*other.getDenominator() + other.getNumerator()*this.getDenominator();
        int _denominator = this.getDenominator()*other.getDenominator();
        Fraction ADD = new Fraction(_numerator,_denominator);
        return ADD.reduce();
    }
    public Fraction subtract(Fraction other) {
        int _numerator = this.getNumerator()*other.getDenominator() - other.getNumerator()*this.getDenominator();
        int _denominator = this.getDenominator()*other.getDenominator();
        Fraction SUB = new Fraction(_numerator,_denominator);
        return SUB.reduce();
    }

    public Fraction multiply(Fraction other) {
        int _numerator = this.getNumerator()*other.getNumerator();
        int _denominator = this.getDenominator()*other.getDenominator();
        Fraction MUL = new Fraction(_numerator,_denominator);
        return MUL.reduce();
    }
    public Fraction divide(Fraction other) {
        if (other.getNumerator()!=0 && this.getDenominator()!=0 && other.getDenominator()!=0) {
            int _numerator = this.getNumerator()*other.getDenominator();
            int _denominator = this.getDenominator()*other.getNumerator();
            Fraction DIV = new Fraction(_numerator,_denominator);
            return DIV.reduce();
        }
        else return this.reduce();
    }
    public boolean equals(Object obj) {
        if (obj instanceof Fraction) {
            Fraction other = (Fraction) obj;
            Fraction frac = new Fraction(this);
            Fraction diff = frac.subtract(other);
            return (diff.getNumerator() == 0);
        }
        else return false;
    }

    public static void main(String[] args) {
        Fraction Frac1 = new Fraction(7, 35);
        System.out.println("Frac1 before reduce is: " + toStringFraction(Frac1));
        Frac1.reduce();
        System.out.println("Frac1 after reduce is: " + toStringFraction(Frac1));

        Fraction Frac2 = new Fraction(55, 11);
        System.out.println("Frac2 before reduce is: " + toStringFraction(Frac2));
        Frac2.reduce();
        System.out.println("Frac2 after reduce is: " + toStringFraction(Frac2) + "\n");

        System.out.println("Sum of Frac1 & Frac2 is: " + toStringFraction(Frac1.add(Frac2)));
        System.out.println("Subtract of Frac1 & Frac2 is: " + toStringFraction(Frac1.subtract(Frac2)));
        System.out.println("Multiple of Frac1 & Frac2 is: " + toStringFraction(Frac1.multiply(Frac2)));
        System.out.println("Divide of Frac1 & Frac2 is: " + toStringFraction(Frac1.divide(Frac2)));
        System.out.println("Compare of Frac1 & Frac2 is: " + Frac1.equals(Frac2));
    }
}
