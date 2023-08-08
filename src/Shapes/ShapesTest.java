package Shapes;

public class ShapesTest {
    public static void main(String[] args) {
        Measurable myShape; // Declare a variable of type Measurable

        // Create instances of Rectangle and Square and assign them to myShape
        myShape = new Rectangle(5, 10);
        System.out.println("Rectangle Perimeter: " + myShape.getPerimeter());
        System.out.println("Rectangle Area: " + myShape.getArea());

        myShape = new Square(7);
        System.out.println("Square Perimeter: " + myShape.getPerimeter());
        System.out.println("Square Area: " + myShape.getArea());

    }
}
