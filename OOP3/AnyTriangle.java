public class AnyTriangle extends Triangle {
    public AnyTriangle(String name, double side1, double side2, double side3) {
        super(name, side1, side2, side3);
    }

    public void calculateArea() {
        double s = (side1 + side2 + side3) / 2;
        area = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    public void calculatePerimeter() {
        perimeter = side1 + side2 + side3;
    }
}