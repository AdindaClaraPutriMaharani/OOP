public class Rectangle extends Shape {
    protected double width;
    protected double height;

    public Rectangle(String name, double width, double height) {
        super(name);
        this.width = width;
        this.height = height;
        calculateArea();
        calculatePerimeter();
    }

    public void calculateArea() {
        area = width * height;
    }

    public void calculatePerimeter() {
        perimeter = 2 * (width + height);
    }
}
