public class Circle extends Shape {
    
    protected Point center;
    protected double radius;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    public Circle(Point point, double radius, String color, boolean filled) {
        super(color, filled);
        this.center = point;
        this.radius = radius;
    }

    public boolean equals(Object obj) {
        if (obj instanceof Circle) {
            Circle another = (Circle) obj;
            if (this.radius == another.radius) {
                    return true;
            }
        }
        return false;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    public String toString() {
        return "Circle[center=(" + Math.round(center.getPointX() * 10) / 10 + "," 
                + Math.round(center.getPointX() * 10) / 10 + "),radius=" 
                + Math.round(radius * 10) / 10 + ",color=" 
                + getColor() + ",filled=" + isFilled() + "]";
    }
}
