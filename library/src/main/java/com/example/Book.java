package com.example;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Book {
    @JsonProperty("idBook")
    private int idBook;
    @JsonProperty("title")
    private String title;
    @JsonProperty("author")
    private String author;
    @JsonProperty("description")
    private String description;
    @JsonProperty("categories")
    private String categories;
    @JsonProperty("qty")
    private int qty;
    @JsonProperty("booked")
    private boolean booked;

    public Book() {}

    public Book(int idBook, String title, String author, String description, String categories, int qty, boolean booked) {
        this.idBook = idBook;
        this.title = title;
        this.author = author;
        this.description = description;
        this.categories = categories;
        this.qty = qty;
        this.booked = booked;
    }

    // Getters and Setters

    @Override
    public String toString() {
        return "Book{" +
                "idBook=" + idBook +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", description='" + description + '\'' +
                ", categories='" + categories + '\'' +
                ", qty=" + qty +
                ", booked=" + booked +
                '}';
    }
}
