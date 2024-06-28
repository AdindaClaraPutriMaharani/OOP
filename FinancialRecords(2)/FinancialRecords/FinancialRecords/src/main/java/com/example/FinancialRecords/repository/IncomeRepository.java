package com.example.FinancialRecords.repository;

import com.example.FinancialRecords.entity.Income;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IncomeRepository extends JpaRepository<Income, Long> {

    // Example of custom query method
    List<Income> findByMonth(int month);

    // You can add more custom query methods as needed
}
