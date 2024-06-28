package com.example.FinancialRecords.service;

import com.example.FinancialRecords.entity.Income;
import com.example.FinancialRecords.repository.IncomeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class IncomeService {

    private final IncomeRepository incomeRepository;

    @Autowired
    public IncomeService(IncomeRepository incomeRepository) {
        this.incomeRepository = incomeRepository;
    }

    public List<Income> getAllIncomes() {
        return incomeRepository.findAll();
    }

    public Income getIncomeById(Long id) {
        Optional<Income> income = incomeRepository.findById(id);
        return income.orElse(null);
    }

    public void addIncome(Income income) {
        incomeRepository.save(income);
    }

    public void updateIncome(Income income) {
        incomeRepository.save(income); // This method can be used for both add and update
    }

    public void deleteIncome(Long id) {
        incomeRepository.deleteById(id);
    }

    // Example of custom business logic method
    public List<Income> getIncomesByMonth(int month) {
        return incomeRepository.findByMonth(month);
    }

    public double getTotalIncomes() {
        List<Income> incomes = incomeRepository.findAll();
        return incomes.stream().mapToDouble(Income::getAmount).sum();
    }
}
