package geo;

import shape.Square;

public class Cube implements Geometry {
    private double side;

    public Cube(double side) {
        this.side = side;
    }

    public double getVolume() {
        return side * side * side;
    }

    public double getBaseArea() {
        return new Square(side).getArea();
    }
}