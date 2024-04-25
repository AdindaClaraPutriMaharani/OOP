public class Expense extends FinancialRecord {
    public Expense(double amount, int day, int month, int year, String description) {
        super(amount, day, month, year, description);
    }

    @Override
    public void details() {
        System.out.println("Expense:");
        System.out.println("Amount: $" + amount);
        System.out.println("Date: " + day + "/" + month + "/" + year);
        System.out.println("Description: " + description);
    }
}