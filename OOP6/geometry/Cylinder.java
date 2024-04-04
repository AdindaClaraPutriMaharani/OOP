package geo;

import shape.Circle;

public class Cylinder implements Geometry {
    private double radius;
    private double height;

    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    public double getVolume() {
        return Math.PI * radius * radius * height;
    }

    public double getBaseArea() {
        return new Circle(radius).getArea();
    }
}