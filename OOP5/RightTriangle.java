/* Dynamic polymorphism using Overriding method, Run-time binding/late binding */
public class RightTriangle extends Triangle{
    private Double base;
    private Double height;

    public RightTriangle (String name, Double base, Double height) {
        super();
        this.name = name;
        this.base = base;
        this.height = height;
        this.calculateArea();
        super.side1 = base;
        super.side2 = height;
        super.side3 = this.getHyptenuse();
    }


    private double getHyptenuse() {
        return Math.sqrt((base * base) + (height * height));
    }

    @Override
    public void calculateArea() {
        super.area = (base * height) / 2;
    }

    public void hallo() {
        System.out.println("Hallo I'm RightTriangle");
    }

    public void getInfo() {
        System.out.print("RightTriangle "+name+" info");
        System.out.print(" area: " + super.area);
        System.out.print(" with base: " + base);
        System.out.print(" and height: "+ height);
        System.out.print(" and hypotenuse: " + this.getHyptenuse());
        System.out.println();
    }
    void specificMethod(){
        System.out.println("Specific method for RightTriangle");
    }
}