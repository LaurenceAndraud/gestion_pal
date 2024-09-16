package com.example.app.service;

import com.example.app.model.Book;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class BookService {
    private List<Book> books = new ArrayList<>();
    private Long currentId = 1L;

    public BookService() {
        // Ajouter des livres par défaut pour tester
        // books.add(new Book(1L, "Toto", "Auteur A", "Editor A", 100, "Fiction", 9.99, true));
        // books.add(new Book(2L, "Tata", "Auteur B", "Editor B", 200, "Non-Fiction", 19.99, true));
    }


    // // Ajouter un livre
    // public Book addBook(Book book) {
    //     book.setId(currentId++);
    //     books.add(book);
    //     return book;
    // }

    // Récupérer tous les livres
    public List<Book> getAllBooks() {
        return books;
    }

    // // Récupérer un livre par ID
    // public Optional<Book> getBookById(Long id) {
    //     return books.stream().filter(book -> book.getId().equals(id)).findFirst();
    // }

    // // Mettre à jour un livre
    // public Optional<Book> updateBook(Long id, Book updatedBook) {
    //     return getBookById(id).map(book -> {
    //         book.setTitle(updatedBook.getTitle());
    //         book.setAuthor(updatedBook.getAuthor());
    //         book.setEditor(updatedBook.getEditor());
    //         book.setNumberPages(updatedBook.getNumberPages());
    //         book.setGenre(updatedBook.getGenre());
    //         book.setPrice(updatedBook.getPrice());
    //         book.setInStock(updatedBook.isInStock());
    //         return book;
    //     });
    // }

    // // Supprimer un livre
    // public boolean deleteBook(Long id) {
    //     return books.removeIf(book -> book.getId().equals(id));
    // }
}