package com.example.FinancialRecords.entity;

import javax.persistence.*;

@Entity
@DiscriminatorValue("INCOME")
public class Income extends FinancialRecord {

    public Income() {
        super();
    }

    public Income(double amount, int day, int month, int year, String description) {
        super(amount, day, month, year, description);
    }
}
