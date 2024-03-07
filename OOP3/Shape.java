public class Shape {
    protected double area;
    protected double perimeter;
    protected String name;

    public void setName(String name){
        this.name = name;
    }
    
    public double getArea(){
        return area;
    }

    public double getPerimeter(){
        return perimeter;
    }

    public void getInfo(){
        System.out.println("Name: " + name);
        System.out.println("Area: " + area);
        System.out.println("Perimeter: " + perimeter);
    }
}