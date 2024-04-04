import shape.*;
import geo.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Testing Shapes:");
        Shape rectangle = new Rectangle(5, 4);
        System.out.println("Rectangle Perimeter: " + rectangle.getPerimeter());
        System.out.println("Rectangle Area: " + rectangle.getArea());

        Shape square = new Square(5);
        System.out.println("Square Perimeter: " + square.getPerimeter());
        System.out.println("Square Area: " + square.getArea());

        Shape circle = new Circle(3);
        System.out.println("Circle Perimeter: " + circle.getPerimeter());
        System.out.println("Circle Area: " + circle.getArea());

        Shape triangle = new Triangle(5, 3);
        System.out.println("Triangle Area: " + triangle.getArea());
        System.out.println("Triangle Perimeter: " + triangle.getPerimeter());

        System.out.println("\nTesting Geometries:");
        Geometry cube = new Cube(5);
        System.out.println("Cube Volume: " + cube.getVolume());
        System.out.println("Cube Base Area: " + cube.getBaseArea());

        Geometry prism = new Prism(5, new Rectangle(3, 4));
        System.out.println("Prism Volume: " + prism.getVolume());
        System.out.println("Prism Base Area: " + prism.getBaseArea());

        Geometry cylinder = new Cylinder(3, 5);
        System.out.println("Cylinder Volume: " + cylinder.getVolume());
        System.out.println("Cylinder Base Area: " + cylinder.getBaseArea());

        Geometry block = new Block(3, 4, 5);
        System.out.println("Block Volume: " + block.getVolume());
        System.out.println("Block Base Area: " + block.getBaseArea());
    }
}