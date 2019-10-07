package com.week5;

public class Cylinder extends Circle{
    private double height = 1.0;
    public Cylinder(){
    }
    public Cylinder(double _radius) {
        super(_radius);
    }
    public Cylinder(double _radius, double _height) {
        super(_radius);
        this.height = _height;
    }
    public Cylinder(double _radius, double _height, String colour) {
        super(_radius, colour);
        this.height = _height;
    }

    public double getHeight() {
        return height;
    }
    public void setHeight (double _height){
        this.height = _height;
    }
    public double getVolume() {
        return super.getArea() * this.height;
    }
    public String toString() {
        return "Cylinder[" + super.toString() + ",height=" + this.height +"]";
    }
    public double getArea() {
        return super.getArea() * 2 + 2 * this.PI * super.getRadius() * this.height;
    }
}

