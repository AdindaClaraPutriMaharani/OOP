package OOP2;

public class Books {
    private String author;
    private String title;
    private double price;
    private int publisher_number;

    public Books(String author, String title, double price, int publisher_number){
        this.author = author;
        this.title = title;
        this.price = price;
        this.publisher_number = publisher_number;
    }
    public double getPrice(){
        return price;
    }
}
