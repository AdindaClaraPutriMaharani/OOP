package com.example.FinancialRecords.entity;

import javax.persistence.*;

@Entity
@DiscriminatorValue("EXPENSE")
public class Expense extends FinancialRecord {

    public Expense() {
        super();
    }

    public Expense(double amount, int day, int month, int year, String description) {
        super(amount, day, month, year, description);
    }
}