package Shapes;
//
public class Square extends Quadrilateral {

    public Square(double side) {
        super(side, side); // Both length and width are set to the same value (the side length)
    }

    @Override
    public void setLength(double length) {
        this.length = length;
        this.width = length; // Update both length and width since it's a square
    }

    @Override
    public void setWidth(double width) {
        this.width = width;
        this.length = width; // Update both length and width since it's a square
    }

    @Override
    public double getPerimeter() {
        return 4 * length; // Perimeter of a square: 4 * side
    }

    @Override
    public double getArea() {
        return length * length; // Area of a square: side * side
    }
}
