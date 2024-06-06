package com.example.libraryweb.model;

public class Book {
    private String name;
    private String isbn;
    private String category;
    private String title;
    private String description;
    private int qty;

    // Konstruktor default
    public Book() {
    }

    // Konstruktor dengan parameter
    public Book(String name, String isbn, String category, String title, String description, int qty) {
        this.name = name;
        this.isbn = isbn;
        this.category = category;
        this.title = title;
        this.description = description;
        this.qty = qty;
    }

    // Getter dan Setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }
}