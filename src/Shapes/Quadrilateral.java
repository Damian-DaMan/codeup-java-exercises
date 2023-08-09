package Shapes;

public abstract class Quadrilateral extends Shape implements Measurable {
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
    // Abstract setters don't return a value as we set the data. We are telling the children later on in our exercise/application that they will NEED the setLength() and setWidth()
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
