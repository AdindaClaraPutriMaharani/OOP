package OOP2;

public class MainSquare {
    public static void  main(String[] args){
        Square mySquare = new Square(4,4);

        System.out.println("The area of the Square is: " + mySquare.getArea());
        System.out.println("The perimeter of the Square is: " + mySquare.getPerimeter());

        // Changing width and height using setWidth and setHeight
        mySquare.setWidth(7.0);
        mySquare.setHeight(7.0);

        System.out.println("Updated Area: " + mySquare.getArea());
        System.out.println("Updated Perimeter: " + mySquare.getPerimeter());
    }
}
