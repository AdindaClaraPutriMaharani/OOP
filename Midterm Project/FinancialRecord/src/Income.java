public class Income extends FinancialRecord {
    public Income(double amount, int day, int month, int year, String description) {
        super(amount, day, month, year, description);
        totalIncome += amount;
    }

    @Override
    public void details() {
        System.out.println("Income:");
        System.out.println("Amount: $" + amount);
        System.out.println("Date: " + day + "/" + month + "/" + year);
        System.out.println("Description: " + description);
    }
}
