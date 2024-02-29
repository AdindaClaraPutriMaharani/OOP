package OOP2;
public class Square {
    private double width;
    private double height;

    public Square (double width, double height) {
        this.width = width;
        this.height = height;
    }

    public void setWidth (double width) {
        this.width = width;
    }

    public void setHeight (double height){
        this.height = height;
    }

    public double getArea(){
        return width * height;
    }

    public double getPerimeter(){
        return 4 * width;
    }
}