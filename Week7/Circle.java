package com.week5;

public class Circle extends Shape {
    protected final double PI = 3.14;
    protected double radius;
    protected Point center;

    public Circle(){
        super();
        this.radius = 0;
        this.center = new Point();
    }
    public Circle(double _radius) {
        super();
        this.radius = (_radius>0) ? _radius : 0;
        this.center = new Point();
    }
    public Circle(double _radius, String _colour, boolean _filled){
        super(_colour, _filled);
        this.radius = (_radius>0) ? _radius : 0;
        this.center = new Point();
    }
    public Circle(Point other, double _radius, String _colour, boolean _filled){
        super(_colour, _filled);
        this.radius = (_radius>0) ? _radius : 0;
        this.center = other;
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

    public Point getCenter() {
        return center;
    }
    public void setCenter(Point _center) {
        this.center = _center;
    }

    public double getArea() {
        return this.PI * this.radius * this.radius;
        // return Math.round(this.PI * this.radius * this.radius * 100.0) / 100.0;
    }
    public double getPerimeter() {
        return this.PI * this.radius * 2.0;
        // return Math.round(this.PI * this.radius * 2.0 * 100.0) / 100.0;
    }

    public boolean equals(Object obj) {
        if (obj instanceof Circle) {
            Circle other = (Circle) obj;
            if(Math.abs(this.radius - other.radius) > 0.001) return false;
            if(!this.center.equals(other.center)) return false;
            return true;
        }
        else return false;
    }
    public int hashCode() {
        int prime = 19;
        int resulter = 1;
        resulter = resulter * prime + Double.valueOf(this.radius).hashCode();
        return resulter * prime + this.center.hashCode();
    }
    public String toString() {
        return "Circle[center=" + this.center.toString() + ",radius=" + this.radius + ",color=" + this.getColor() + ",filled=" + this.isFilled() + "]";
    }

}
