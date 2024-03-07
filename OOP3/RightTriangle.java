public class RightTriangle extends Triangle {
    public RightTriangle(String name, double base, double height) {
        super(name, base, height, Math.sqrt(base * base + height * height));
    }

    public void calculateArea() {
        area = 0.5 * side1 * side2;
    }

    public void calculatePerimeter() {
        perimeter = side1 + side2 + side3;
    }
}