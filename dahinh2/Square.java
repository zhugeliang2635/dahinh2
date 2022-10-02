public class Square extends Rectangle {

    public Square() {
    }

    public Square(double side) {
        super.width = side;
        super.length = side;
    }

    /**
     * ham khoi tao hinh vuong.
     */
    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    public Square(Point point, double side, String color, boolean filled) {
        super(side, side, color, filled);
        super.topLeft = point;
    }

    public boolean equals(Object obj) {
        if (obj instanceof Square) {
            Square another = (Square) obj;
            if (this.width == another.width && this.length == another.length) {
                    return true;
            }
        }
        return false;
    }

    /**
     * ham set canh cua hinh vuong.
     */
    public void setSide(double side) {
        super.width = side;
        super.length = side;
    }

    public void setWidth(double side) {
        super.width = side;
        super.length = side;
    }

    public void setLength(double side) {
        super.length = side;
        super.width = side;
    }

    public double getSide() {
        return super.width;
    }

    public String toString() {
        return "Rectangle[topLeft=" + Math.round(topLeft.getPointX() * 10) / 10 + "," 
                    + Math.round(topLeft.getPointY() * 10) / 10 + "),side=" + Math.round(width * 10) / 10
                    + ",color=" + getColor() + ",filled=" + isFilled() + "]";
    }
}