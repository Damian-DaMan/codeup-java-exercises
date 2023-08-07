package Shapes;

public class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getArea() {
//        actual formula for finding area of a circle
//        area = pi * (radius ^ 2)
        // one line: return Math.PI * this.radius * this.radius;
                return Math.PI * Math.pow(this.radius, 2);
    }

    public double getCircumference() {
        // circ = 2 * pi * radius
        return 2 * Math.PI * this.radius;
    }

}
