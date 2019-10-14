package com.week5;

public class Circle extends Shape {
    protected final double PI = 3.14;
    protected double radius;
    public Circle(){
        super();
        this.radius = 0;
    }
    public Circle(double _radius) {
        this.radius = (_radius>0) ? _radius : 0;
    }
    public Circle(double _radius, String _colour, boolean _filled){
        super(_colour, _filled);
        this.radius = (_radius>0) ? _radius : 0;
    }
    public void setRadius (double _radius) {
        this.radius = (_radius>0) ? _radius : 0;
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
        return this.PI * this.radius * this.radius;
        // return Math.round(this.PI * this.radius * this.radius * 100.0) / 100.0;
    }
    public double getPerimeter() {
        return this.PI * this.radius * 2.0;
        // return Math.round(this.PI * this.radius * 2.0 * 100.0) / 100.0;
    }
    public String toString() {
        return "Circle[radius=" + this.radius + ",color=" + this.getColor() + ",filled=" + this.isFilled() + "]";
    }

}
