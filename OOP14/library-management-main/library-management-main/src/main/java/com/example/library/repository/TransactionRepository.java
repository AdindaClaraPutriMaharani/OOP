package com.example.library.repository;

import com.example.library.entity.Transaction;
import com.example.library.entity.Member;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionRepository extends JpaRepository<Transaction, Long> {
    List<Transaction> findByMember(Member member);
}