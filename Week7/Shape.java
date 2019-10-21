package com.week5;

public abstract class Shape {
    protected String color;
    protected boolean filled;
    public Shape() {
    }
    public Shape(String _color, boolean _filled) {
        this.color = _color;
        this.filled = _filled;
    }

    public String getColor() {
        return color;
    }
    public void setColor(String _color) {
        if(color != null)
            this.color = _color;
    }
    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean _filled) {
        this.filled = _filled;
    }

    public abstract double getArea();
    public abstract double getPerimeter();
    public String toString() {
        return "Shape[color=" + this.color + ",filled=" + this.filled + "]";
    }
}
