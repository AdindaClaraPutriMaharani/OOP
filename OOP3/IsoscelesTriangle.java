public class IsoscelesTriangle extends Triangle {
    public IsoscelesTriangle(String name, double base, double legs) {
        super(name, base, legs, legs);
    }

    public void calculateArea() {
        double a = (side1 + side2 + side3) / 2;
        area = Math.sqrt(a * (a - side1) * (a - side2) * (a - side3));
    }

    public void calculatePerimeter() {
        perimeter = side1 + side2 + side3;
    }
}
