package com.example.FinancialRecords.controller;

import com.example.FinancialRecords.entity.Expense;
import com.example.FinancialRecords.service.ExpenseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/expenses")
public class ExpenseController {

    private final ExpenseService expenseService;

    @Autowired
    public ExpenseController(ExpenseService expenseService) {
        this.expenseService = expenseService;
    }

    // Retrieve all expenses
    @GetMapping
    public String getAllExpenses(Model model) {
        List<Expense> expenses = expenseService.getAllExpenses();
        model.addAttribute("expenses", expenses);
        return "expenses"; // This will resolve to src/main/resources/templates/expenses.html
    }

    // Show form to add a new expense
    @GetMapping("/new")
    public String showExpenseForm(Model model) {
        model.addAttribute("expense", new Expense());
        return "add-expense"; // This will resolve to src/main/resources/templates/add-expense.html
    }

    // Add a new expense
    @PostMapping("/save")  // Explicitly map to handle POST requests at /expenses/save
    public String addExpense(@ModelAttribute("expense") Expense expense) {
        expenseService.addExpense(expense);
        return "redirect:/expenses";
    }

    // Show form to update an expense
    @GetMapping("/{id}")
    public String showUpdateForm(@PathVariable("id") Long id, Model model) {
        Expense expense = expenseService.getExpenseById(id);
        model.addAttribute("expense", expense);
        return "update-expense"; // This will resolve to src/main/resources/templates/update-expense.html
    }

    // Update an expense
    @PostMapping("/{id}")
    public String updateExpense(@PathVariable("id") Long id, @ModelAttribute("expense") Expense expense) {
        expense.setId(id); // Ensure the ID is set for update operation
        expenseService.updateExpense(expense);
        return "redirect:/expenses";
    }

    // Delete an expense
    @GetMapping("/{id}/delete")
    public String deleteExpense(@PathVariable("id") Long id) {
        expenseService.deleteExpense(id);
        return "redirect:/expenses";
    }

    @GetMapping("/total")
    public String getTotalExpenses(Model model) {
        double totalExpenses = expenseService.getTotalExpenses();
        model.addAttribute("totalExpenses", totalExpenses);
        return "total-expenses"; // This will resolve to src/main/resources/templates/total-expenses.html
    }
}