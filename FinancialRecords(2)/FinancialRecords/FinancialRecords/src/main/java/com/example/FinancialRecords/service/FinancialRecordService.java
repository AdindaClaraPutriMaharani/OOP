package com.example.FinancialRecords.service;

import com.example.FinancialRecords.entity.FinancialRecord;
import com.example.FinancialRecords.repository.FinancialRecordRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class FinancialRecordService {

    private final FinancialRecordRepository financialRecordRepository;

    @Autowired
    public FinancialRecordService(FinancialRecordRepository financialRecordRepository) {
        this.financialRecordRepository = financialRecordRepository;
    }

    public List<FinancialRecord> getAllFinancialRecords() {
        return financialRecordRepository.findAll();
    }

    public FinancialRecord getFinancialRecordById(Long id) {
        Optional<FinancialRecord> financialRecord = financialRecordRepository.findById(id);
        return financialRecord.orElse(null);
    }

    public void addFinancialRecord(FinancialRecord financialRecord) {
        financialRecordRepository.save(financialRecord);
    }

    public void updateFinancialRecord(FinancialRecord financialRecord) {
        financialRecordRepository.save(financialRecord); // This method can be used for both add and update
    }

    public void deleteFinancialRecord(Long id) {
        financialRecordRepository.deleteById(id);
    }

    // Example of custom business logic method
    public List<FinancialRecord> searchFinancialRecordsByDescription(String keyword) {
        return financialRecordRepository.findByDescriptionContainingIgnoreCase(keyword);
    }
}