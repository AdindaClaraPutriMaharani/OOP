public class Circle extends Shape {
    protected double radius;

    public Circle(String name, double radius) {
        super(name);
        this.radius = radius;
        calculateArea();
        calculatePerimeter();
    }

    public void calculateArea() {
        area = Math.PI * radius * radius;
    }

    public void calculatePerimeter() {
        perimeter = 2 * Math.PI * radius;
    }
}
