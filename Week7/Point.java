package com.week5;
import java.lang.*;
public class Point {
    protected double x,y;
    public Point (double _x, double _y){
        this.x = _x;
        this.y = _y;
    }
    public void setX (double _x) {
        this.x = (_x>0) ? _x : 0;
    }
    public double getX() {
        return x;
    }
    public void setY (double _y) {
        this.y = (_y>0) ? _y : 0;
    }
    public double getY() {
        return y;
    }
    public double distance (Point other)
    {
        return Math.sqrt((this.x-other.x)*(this.x-other.x) + (this.y-other.y)*(this.y-other.y));
        //return Math.sqrt(Math.pow((other.x - this.x), 2) + Math.pow((other.y - this.y), 2));
    }
    public boolean equals(Object obj) {
        if (obj instanceof Point) {
            Point other = (Point) obj;
            if(Math.abs(this.x - other.x) > 0.001) return false;
            else if(Math.abs(this.y - other.y) > 0.001) return false;
            else return true;
        }
        else return false;
    }
    public int hashCode (){
        int prime = 5;
        int result = 1;
        result = prime * result + Double.valueOf(this.x).hashCode();
        return result * prime + Double.valueOf(this.y).hashCode();
    }
    public String toString() {
        return "(" + this.x + "," + this.y + ")";
    }
}
