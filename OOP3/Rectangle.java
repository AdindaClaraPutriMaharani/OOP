public class Rectangle extends Shape{
    public Rectangle(String name, double width, double height){
        setName(name);
        calculateArea(width, height);
        calculatePerimeter(width, height);
    }
    public void calculateArea(double width, double height){
        area = width * height;
    }

    public void calculatePerimeter(double width, double height){
        perimeter = 2 * (width + height);
    }

}
