package com.example.libraryweb.controller;

import com.example.libraryweb.model.Book;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/books")
public class BookController {

    private List<Book> bookList = new ArrayList<>();

    @GetMapping("/list")
    public String listBooks(Model model) {
        model.addAttribute("books", bookList);
        return "book-list";
    }

    // Dummy data for demonstration
    public BookController() {
        bookList.add(new Book("Book1", "123456789", "Fiction", "Title1", "Description1", 10));
        bookList.add(new Book("Book2", "987654321", "Non-Fiction", "Title2", "Description2", 5));
    }
}