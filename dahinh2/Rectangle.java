public class Rectangle extends Shape {
    
    protected Point topLeft;
    protected double width;
    protected double length;

    public Rectangle() {
    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    /** 
     * ham khoi tao hinh chu nhat.
     */
    public Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public Rectangle(Point point, double width, double length, String color, boolean filled) {
        super(color, filled);
        this.topLeft = point;
        this.width = width;
        this.length = length;
    }

    public boolean equals(Object obj) {
        if (obj instanceof Rectangle) {
            Rectangle another = (Rectangle) obj;
            if (this.width == another.width && this.length == another.length) {
                    return true;
            }
        }
        return false;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getArea() {
        return width * length;
    }

    public double getPerimeter() {
        return 2 * (width + length);
    }

    public String toString() {
        return "Rectangle[topLeft=" + Math.round(topLeft.getPointX() * 10) / 10 + "," 
                    + Math.round(topLeft.getPointY() * 10) / 10 + "),width=" 
                    + Math.round(width * 10) / 10 + ",length=" + Math.round(length * 10) / 10 
                    + ",color=" + getColor() + ",filled=" + isFilled() + "]";
    }
}
