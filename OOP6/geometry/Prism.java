package geo;

import shape.Shape;
public class Prism implements Geometry {
    private double height;
    private Shape baseShape;

    public Prism(double height, Shape baseShape) {
        this.height = height;
        this.baseShape = baseShape;
    }

    public double getVolume() {
        return baseShape.getArea() * height;
    }

    public double getBaseArea() {
        return baseShape.getArea();
    }
}