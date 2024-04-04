package geo;

import shape.Rectangle;

public class Block implements Geometry {
    private double length;
    private double width;
    private double height;

    public Block(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public double getVolume() {
        return length * width * height;
    }

    public double getBaseArea() {
        return new Rectangle(length, width).getArea();
    }
}