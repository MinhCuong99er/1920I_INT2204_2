package com.week5;

public class Rectangle extends Shape {
    protected double width;
    protected double length;

    public Rectangle() {
        super();
        this.width = 0;
        this.length = 0;
    }

    public Rectangle(double _width, double _length) {
        super();
        if(_width > 0 && _length > 0) {
            this.width = _width;
            this.length = _length;
        }
        else {
            this.width = 0;
            this.length = 0;
        }
    }

    public Rectangle(double _width, double _length, String _color, boolean _filled) {
        super(_color, _filled);
        if(_width > 0 && _length > 0) {
            this.width = _width;
            this.length = _length;
        }
        else {
            this.width = 0;
            this.length = 0;
        }
    }

    public double getWidth() {
        return width;
    }
    public void setWidth(double _width) {
        this.width = (_width > 0) ? _width : 0;
    }
    public double getLength() {
        return length;
    }
    public void setLength(double _length) {
        this.length = (_length > 0) ? _length : 0;
    }

    public static double getArea() {
        return this.width * this.length;
        // return Math.round(this.width * this.length * 100.0) / 100.0;
    }
    public static double getPerimeter() {
        return 2.0 * (this.width + this.length);
        // return Math.round( 2.0 * (this.width + this.length) * 100.0) / 100.0;
    }
    public static String toString() {
        return "Rectangle[width=" + this.width + ",length=" + this.length + ",color=" + this.getColor() + ",filled=" + this.isFilled() + "]";
    }

}
