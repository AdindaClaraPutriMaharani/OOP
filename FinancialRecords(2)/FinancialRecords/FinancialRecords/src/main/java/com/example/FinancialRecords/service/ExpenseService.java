package com.example.FinancialRecords.service;

import com.example.FinancialRecords.entity.Expense;
import com.example.FinancialRecords.repository.ExpenseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class ExpenseService {

    private final ExpenseRepository expenseRepository;

    @Autowired
    public ExpenseService(ExpenseRepository expenseRepository) {
        this.expenseRepository = expenseRepository;
    }

    public List<Expense> getAllExpenses() {
        return expenseRepository.findAll();
    }

    public Expense getExpenseById(Long id) {
        Optional<Expense> expense = expenseRepository.findById(id);
        return expense.orElse(null);
    }

    public void addExpense(Expense expense) {
        expenseRepository.save(expense);
    }

    public void updateExpense(Expense expense) {
        expenseRepository.save(expense); // This method can be used for both add and update
    }

    public void deleteExpense(Long id) {
        expenseRepository.deleteById(id);
    }

    // Example of custom business logic method
    public List<Expense> getExpensesByYear(int year) {
        return expenseRepository.findByYear(year);
    }

    public double getTotalExpenses() {
        List<Expense> expenses = expenseRepository.findAll();
        return expenses.stream().mapToDouble(Expense::getAmount).sum();
    }
}