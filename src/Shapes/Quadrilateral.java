package Shapes;

public abstract class Quadrilateral implements Measurable {
    protected double length;

    protected double width;

//    =========================== Constructors ====================


    public Quadrilateral(double length, double width) {
        this.length = length;
        this.width = width;
    }

    //================= Getters =============
    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    //    ============================== Setters ===================
    public abstract void setLength(double length);

    public abstract void setWidth(double width);

    @Override
    public double getPerimeter() {
        return 0;
    }

    @Override
    public double getArea() {
        return 0;
    }
}
