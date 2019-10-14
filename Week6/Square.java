package com.week5;

public class Square extends Rectangle{
    public Square() {
        super();
        this.width = 0;
        this.length = 0;
    }
    public Square(double _side) {
        super(_side, _side);
    }
    public Square(double _side, String _colour, boolean _filled) {
        super(_side, _side, _colour, _filled);
    }

    public double getSide() {
        return this.width;
    }
    public void setSide(double _side) {
        if(_side >= 0) {
            this.width = _side;
            this.length = _side;
        } else {
            this.width = 0;
            this.length = 0;
        }
    }
    public void setWidth(double _side) {
        if(_side > 0) {
            this.width = _side;
            this.length = _side;
        } else {
            this.width = 0;
            this.length = 0;
        }
    }
    public void setLength(double _side) {
        if(_side > 0) {
            this.width = _side;
            this.length = _side;
        } else {
            this.width = 0;
            this.length = 0;
        }
    }

    public double getArea() {
        return this.width * this.width;
        // return Math.round(this.width * this.width * 100.0) / 100.0;
    }
    public double getPerimeter() {
        return 4.0 * this.width;
        // return Math.round(4.0 * this.width * 100.0) / 100.0;
    }

    public String toString() {
        return "Square[side=" + this.width + ",color=" + this.getColor() + ",filled=" + this.isFilled() + "]";
    }
}
