package com.example.library.service;

import com.example.library.entity.Book;
import com.example.library.entity.Transaction;
import com.example.library.entity.Member;
import com.example.library.repository.TransactionRepository;
import com.example.library.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class TransactionService {

    @Autowired
    private TransactionRepository transactionRepository;

    @Autowired
    private BookRepository bookRepository;

    public List<Transaction> getAllTransactions() {
        return transactionRepository.findAll();
    }

    public Transaction getTransactionById(Long id) {
        return transactionRepository.findById(id).orElse(null);
    }

    public Transaction createTransaction(Transaction transaction) {
        Book book = bookRepository.findById(transaction.getBook().getId()).orElse(null);
        if (book == null) {
            throw new RuntimeException("Book not found");
        }

        return transactionRepository.save(transaction);
    }

    public Transaction returnTransaction(Long id) {
        Transaction transaction = transactionRepository.findById(id).orElse(null);
        if (transaction != null) {
            transaction.setReturnDate(LocalDate.now());
            transactionRepository.save(transaction);
        }
        return transaction;
    }

    public List<Transaction> getTransactionsByMember(Member member) {
        return transactionRepository.findByMember(member);
    }

    public void deleteTransaction(Long id) {
        transactionRepository.deleteById(id);
    }
}