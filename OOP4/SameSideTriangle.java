public class SameSideTriangle extends Triangle {
    private Double base;
    private Double height;
    
    public SameSideTriangle(String name, Double base, Double height) {
        super();
        this.name = name;
        this.base = base;
        this.height = height;
        this.calculateArea();
        super.side1 = base;
        super.side2 = height;
    }

    public void calculateArea() {
        super.area = (base * height) / 2;
    }

    public void getInfo() {
        System.out.print("SameSideTriangle " + name + " info");
        System.out.print(" area: " + super.area);
        System.out.print(" with sides: " + side1);
        System.out.print(", " + side2);
        System.out.print(", " + side3);
        System.out.println();
    }
}