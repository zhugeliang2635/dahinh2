public class Point {
    
    private double pointX;
    private double pointY;
   
    public Point(double pointX_, double pointY_) {
        this.pointX = pointX_;
        this.pointY = pointY_;
    }

    public double getPointX() {
        return pointX;
    }

    public void setpointX(double pointX) {
        this.pointX = pointX;
    }

    public double getPointY() {
        return pointY;
    }

    public void setpointY(double pointY) {
        this.pointY = pointY;
    }

    public double distance(Point point) {
        return Math.sqrt((this.pointX-point.pointX) * (this.pointX-point.pointX) + (this.pointY-point.pointY) * (this.pointY-point.pointY));
    }
}
