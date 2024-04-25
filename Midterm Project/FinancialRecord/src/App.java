public class App {
    public static void main(String[] args) {
        FinancialRecord[] records = new FinancialRecord[3];

        records[0] = new Expense(100.50, 10, 4, 2024, "Dinner with friends");
        records[1] = new Income(500.75, 12, 4, 2024, "Freelance payment");
        records[2] = new Expense(30.25, 15, 4, 2024, "Groceries");
        displayRecords(records);
    }

    private static void displayRecords(FinancialRecord[] records) {
        System.out.println("=== Financial Records ===");
        for (FinancialRecord record : records) {
            record.details();
            System.out.println("-------------------------");
        }
    }
}
