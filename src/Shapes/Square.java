package Shapes;

public class Square extends Rectangle {
    public Square(double side) {
        super(side, side);
        this.side = side;
    }

    public double getArea() {
        return (int) (Math.pow(this.side, 2));
    }
    public double getPerimeter() {
        return (4 * this.side);
    }



}
