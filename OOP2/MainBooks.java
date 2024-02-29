package OOP2;

public class MainBooks {
    public static void main(String[] args) {
        Books A = new Books ("Adinda Clara", "Lentera Kuning", 30000.0, 111);
        Books B = new Books("John Deep", "Pirates and Fairy", 50000.0, 222);
        Books C = new Books ("Tere Liye", "Negeri Para Bedebah", 80000.0, 333);

        double totalPrice = A.getPrice() + B.getPrice() + C.getPrice();

        System.out.println("Total Price of all books : Rp. " + totalPrice);
    }
}
