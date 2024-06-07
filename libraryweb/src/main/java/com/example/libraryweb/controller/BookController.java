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
        bookList.add(new Book("To Kill a Mockingbird", "978-0-06-112008-4", "Classic, Fiction", "To Kill a Mockingbird", "A novel by Harper Lee published in 1960. It was immediately successful, winning the Pulitzer Prize, and has become a classic of modern American literature.", 10));
        bookList.add(new Book("1984", "978-0-452-28423-4", "Dystopian, Sci-Fi", "1984", "A novel by George Orwell published in 1949 as a warning against totalitarianism. The novel is set in a dystopian society characterized by government surveillance and control.", 8));
        bookList.add(new Book("Pride and Prejudice", "978-1-85326-000-1", "Romance, Classic", "Pride and Prejudice", "A romantic novel by Jane Austen, first published in 1813. The story charts the emotional development of the protagonist, Elizabeth Bennet, who learns the error of making hasty judgments.", 12));
        bookList.add(new Book("The Great Gatsby", "978-0-7432-7356-5", "Classic, Fiction", "The Great Gatsby", "A 1925 novel by American writer F. Scott Fitzgerald. The story is a cautionary tale about the American Dream, filled with themes of wealth, power, and social dynamics.", 9));
        bookList.add(new Book("The Catcher in the Rye", "978-0-316-76948-0", "Classic, Fiction", "The Catcher in the Rye", "A novel by J. D. Salinger, partly published in serial form in 1945-1946 and as a novel in 1951. It is about a young boy named Holden Caulfield and his experiences in New York City.", 10));
        bookList.add(new Book("The Hobbit", "978-0-618-00221-3", "Fantasy, Adventure", "The Hobbit", "A fantasy novel by J. R. R. Tolkien, serving as a prelude to his famous series, The Lord of the Rings. The story follows Bilbo Baggins, a hobbit who goes on an unexpected adventure.", 15));
        bookList.add(new Book("Harry Potter and the Sorcerer's Stone", "978-0-590-35340-3", "Fantasy, Young Adult", "Harry Potter and the Sorcerer's Stone", "The first novel in the Harry Potter series written by J.K. Rowling. It follows Harry Potter, a young wizard who discovers his magical heritage on his eleventh birthday.", 20));
        bookList.add(new Book("The Da Vinci Code", "978-0-385-50420-8", "Mystery, Thriller", "The Da Vinci Code", "A mystery thriller novel by Dan Brown. It follows Robert Langdon as he uncovers a conspiracy involving the Catholic Church and a secret society after a murder in the Louvre.", 11));
        bookList.add(new Book("The Alchemist", "978-0-06-112241-5", "Adventure, Fantasy", "The Alchemist", "A novel by Brazilian author Paulo Coelho. It follows a young shepherd named Santiago in his journey to Egypt, after having a recurring dream of finding treasure there.", 13));
        bookList.add(new Book("The Road", "978-0-307-38789-9", "Post-apocalyptic, Fiction", "The Road", "A novel by Cormac McCarthy. It details the grueling journey of a father and his young son across a post-apocalyptic America, highlighting their struggles for survival.", 7));
        bookList.add(new Book("The Girl with the Dragon Tattoo", "978-0-307-45454-5", "Mystery, Crime", "The Girl with the Dragon Tattoo", "A mystery novel by Stieg Larsson. It centers on journalist Mikael Blomkvist and hacker Lisbeth Salander as they investigate a wealthy family’s dark secrets.", 10));
        bookList.add(new Book("Life of Pi", "978-0-15-602732-8", "Adventure, Fiction", "Life of Pi", "A novel by Yann Martel. It tells the story of a young boy named Pi who survives a shipwreck and is left adrift in the Pacific Ocean on a lifeboat with a Bengal tiger.", 14));
    }
}
