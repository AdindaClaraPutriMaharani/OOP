package com.example;

import com.fasterxml.jackson.core.type.TypeReference;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class LibraryApp {

    private static final String BOOKS_FILE = "books.json";
    private static final String MEMBERS_FILE = "members.json";
    private static final String TRANSACTIONS_FILE = "transactions.json";

    public static void main(String[] args) {
        try {
            // Data contoh
            List<Book> books = new ArrayList<>();
            books.add(new Book(1, "Java Programming", "Author A", "Description A", "Programming", 5, false));
            books.add(new Book(2, "Python Programming", "Author B", "Description B", "Programming", 3, false));

            List<Member> members = new ArrayList<>();
            members.add(new Member(1, "John Doe", "1234567890", "john@example.com", "Address A"));
            members.add(new Member(2, "Jane Doe", "0987654321", "jane@example.com", "Address B"));

            List<Transaction> transactions = new ArrayList<>();
            transactions.add(new Transaction(1, new Date(), 1, 1, 1));
            transactions.add(new Transaction(2, new Date(), 2, 2, 1));

            // Tulis data contoh ke file JSON
            JsonUtil.writeJsonFile(BOOKS_FILE, books);
            JsonUtil.writeJsonFile(MEMBERS_FILE, members);
            JsonUtil.writeJsonFile(TRANSACTIONS_FILE, transactions);

            // Baca data dari file JSON
            List<Book> readBooks = JsonUtil.readJsonFile(BOOKS_FILE, new TypeReference<List<Book>>() {});
            List<Member> readMembers = JsonUtil.readJsonFile(MEMBERS_FILE, new TypeReference<List<Member>>() {});
            List<Transaction> readTransactions = JsonUtil.readJsonFile(TRANSACTIONS_FILE, new TypeReference<List<Transaction>>() {});

            // Cetak data
            System.out.println("Books: " + readBooks);
            System.out.println("Members: " + readMembers);
            System.out.println("Transactions: " + readTransactions);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
