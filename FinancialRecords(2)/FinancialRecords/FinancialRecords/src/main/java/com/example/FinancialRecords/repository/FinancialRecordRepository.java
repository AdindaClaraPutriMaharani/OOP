package com.example.FinancialRecords.repository;

import com.example.FinancialRecords.entity.FinancialRecord;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FinancialRecordRepository extends JpaRepository<FinancialRecord, Long> {

    // Example of custom query method
    List<FinancialRecord> findByDescriptionContainingIgnoreCase(String keyword);

    // You can add more custom query methods as needed
}
