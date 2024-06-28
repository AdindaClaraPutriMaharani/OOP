package com.example.FinancialRecords.controller;

import com.example.FinancialRecords.entity.Income;
import com.example.FinancialRecords.service.IncomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/incomes")
public class IncomeController {

    private final IncomeService incomeService;

    @Autowired
    public IncomeController(IncomeService incomeService) {
        this.incomeService = incomeService;
    }

    // Retrieve all incomes
    @GetMapping
    public String getAllIncomes(Model model) {
        List<Income> incomes = incomeService.getAllIncomes();
        model.addAttribute("incomes", incomes);
        return "incomes"; // This will resolve to src/main/resources/templates/incomes.html
    }

    // Show form to add a new income
    @GetMapping("/new")
    public String showIncomeForm(Model model) {
        model.addAttribute("income", new Income());
        return "add-income"; // This will resolve to src/main/resources/templates/add-income.html
    }

    // Add a new income
    @PostMapping
    public String addIncome(@ModelAttribute("income") Income income) {
        incomeService.addIncome(income);
        return "redirect:/incomes";
    }

    // Save a new income (alternative method)
    @PostMapping("/save")
    public String saveIncome(@ModelAttribute("income") Income income) {
        incomeService.addIncome(income);
        return "redirect:/incomes";
    }

    // Show form to update an income
    @GetMapping("/{id}")
    public String showUpdateForm(@PathVariable("id") Long id, Model model) {
        Income income = incomeService.getIncomeById(id);
        model.addAttribute("income", income);
        return "update-income"; // This will resolve to src/main/resources/templates/update-income.html
    }

    // Update an income
    @PostMapping("/{id}")
    public String updateIncome(@PathVariable("id") Long id, @ModelAttribute("income") Income income) {
        income.setId(id); // Ensure the ID is set for update operation
        incomeService.updateIncome(income);
        return "redirect:/incomes";
    }

    // Delete an income
    @GetMapping("/{id}/delete")
    public String deleteIncome(@PathVariable("id") Long id) {
        incomeService.deleteIncome(id);
        return "redirect:/incomes";
    }

    @GetMapping("/total")
    public String getTotalIncomes(Model model) {
        double totalIncomes = incomeService.getTotalIncomes();
        model.addAttribute("totalIncomes", totalIncomes);
        return "total-incomes"; // This will resolve to src/main/resources/templates/total-incomes.html
    }
}