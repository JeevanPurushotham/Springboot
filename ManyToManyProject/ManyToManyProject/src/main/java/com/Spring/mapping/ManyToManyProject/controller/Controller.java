package com.Spring.mapping.ManyToManyProject.controller;

import com.Spring.mapping.ManyToManyProject.Repository.AuthorRepository;
import com.Spring.mapping.ManyToManyProject.Repository.BookRepository;
import com.Spring.mapping.ManyToManyProject.entity.Author;
import com.Spring.mapping.ManyToManyProject.entity.Books;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class Controller {
    @Autowired
    AuthorRepository authorRepository;
    @Autowired
    BookRepository bookRepository;

    @PostMapping("/save")
    public Author saveAuthor(@RequestBody Author author) {

        return authorRepository.save(author);
    }

    @PostMapping("/save1")
    public List<Books> saveBooks(@RequestBody List<Books> books) {

        return bookRepository.saveAll(books);
    }

    @GetMapping("/getAuthor")
    public List<Author> getAuthor() {

        return authorRepository.findAll();
    }

    @GetMapping("/getAuthor1")
    public List<Books> getBooks() {

        return bookRepository.findAll();
    }

    @DeleteMapping("/delete")
    public String deleteAuthor(Author author) {
        authorRepository.delete(author);
        return "Deleted successfully";
    }

    @DeleteMapping("/delete1")
    public String deleteBooks(Books books) {
        bookRepository.delete(books);
        return "Deleted successfully";
    }

    @GetMapping("/saveAuthor{authorId}")
    public Author getAuthor1(@PathVariable("authorId") int authorId) {
        return authorRepository.findById(authorId).get();
    }

    @GetMapping("/saveBook{bookId}")
    public Author getBook(@PathVariable("bookId") int bookId) {
        return authorRepository.findById(bookId).get();
    }

}
