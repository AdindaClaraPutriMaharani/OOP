public abstract class FinancialRecord {
    protected double amount;
    protected int day;
    protected int month;
    protected int year;
    protected String description;

    public FinancialRecord(double amount, int day, int month, int year, String description) {
        this.amount = amount;
        this.day = day;
        this.month = month;
        this.year = year;
        this.description = description;
    }

    public abstract void details();
}