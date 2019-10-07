public class Circle {
    private double radius = 1.0;
    private String color = "red";
    protected final double PI = 3.14;

    public Circle(){
    }
    public Circle(double _radius){
        this.radius = _radius;
    }
    public Circle(double _radius, String colour){
        this.radius = _radius;
        this.color = colour;
    }

    public void setRadius (double _radius) {
        this.radius = _radius;
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
        return this.PI * this.getRadius() * this.getRadius();
    }
    public String toString(){
        return "Circle[radius=" + this.getRadius() + ",color=" + this.getColor() + "]";
    }
}
