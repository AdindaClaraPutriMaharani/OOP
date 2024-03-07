public class EquilateralTriangle extends Triangle {
    public EquilateralTriangle(String name, double side) {
        super(name, side, side, side);
    }

    public void calculateArea() {
        double a = (side1 + side2 + side3) / 2;
        area = Math.sqrt(a * (a - side1) * (a - side2) * (a - side3));
    }


    public void calculatePerimeter() {
        perimeter = side1 + side2 + side3;
    }
}