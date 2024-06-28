package com.example.FinancialRecords.repository;

import com.example.FinancialRecords.entity.Expense;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ExpenseRepository extends JpaRepository<Expense, Long> {

    // Example of custom query method
    List<Expense> findByYear(int year);

    // You can add more custom query methods as needed
}
