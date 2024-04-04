package shape;


public class Triangle implements Shape {
    private double base;
    private double height;
    private double side1;
    private double side2;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
        this.side1 = base;
        this.side2 = height;
    }

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
    }

    @Override
    public double getPerimeter() {
        return side1 + side2 + Math.sqrt(side1 * side1 + side2 * side2);
    }

    @Override
    public double getArea() {
        return 0.5 * base * height;
    }
}