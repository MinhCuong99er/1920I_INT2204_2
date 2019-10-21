public class Rectangle extends Shape {
    protected double width;
    protected double length;
    protected Point topLeft;

    public Rectangle() {
        super();
        this.width = 0;
        this.length = 0;
        this.topLeft = new Point();
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
        this.topLeft = new Point();
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
        this.topLeft = new Point();
    }
    public Rectangle(Point other, double _width, double _length, String _color, boolean _filled) {
        super(_color, _filled);
        if(_width > 0 && _length > 0) {
            this.width = _width;
            this.length = _length;
        }
        else {
            this.width = 0;
            this.length = 0;
        }
        this.topLeft = other;
    }

    public Point getTopLeft() {
        return topLeft;
    }

    public void setTopLeft(Point _topLeft) {
        this.topLeft = _topLeft;
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
    public boolean equals(Object obj) {
        if (obj instanceof Rectangle) {
            Rectangle other = (Rectangle) obj;
            if(Math.abs(this.width - other.width) > 0.001) return false;
            if(Math.abs(this.length - other.length) > 0.001) return false;
            if(!this.topLeft.equals(other.topLeft)) return false;
            return true;
        }
