package com.week5;

public class Circle {
    protected double radius = 1.8;
    protected String color = ”red”;
    public Circle(){
    }
    public Circle(double radilus){
        this.radius = radilus;
    }
    public Circle(double radilus, String colour){
        this.radius = radilus;
        this.color = colour;
    }
    public void setRadius (double radilus) {
        this.radius = radilus;
    }
    public double getRadius() {
        return radius;
    }
    public void setColor (String colour) {
        this.color = colour;
    }
    public String getColor() {
        return color;
    }
    public double getArea() {

    }
    public String toString()ơ{

    }
    public static void  main (String args[]){
    }
}
