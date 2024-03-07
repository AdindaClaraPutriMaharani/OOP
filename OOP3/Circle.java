public class Circle extends Shape{
    public Circle(String name, double radius){
        setName(name);
        calculatePerimeter(radius);
        calculateArea(radius);
    }

    public void calculatePerimeter(double radius){
        perimeter = 2 * Math.PI * radius;
    }

    public void calculateArea(double radius){
        area = Math.PI * radius * radius;
    }
    
}
