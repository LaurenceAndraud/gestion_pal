package com.example.app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.app.model.Book;
import com.example.app.repository.BookRepository;

@Service
public class BookService {

    @Autowired
    private BookRepository bookRepository;

    public Book addBook(Book book) {
        return bookRepository.save(book);
    }

    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }

    public Optional<Book> getBookById(Long id) {
        return bookRepository.findById(id);
    }

    public Book updateBook(Long id, Book updatedBook) {
        Optional<Book> existingBookOpt = bookRepository.findById(id);
        if (existingBookOpt.isPresent()) {
            Book existingBook = existingBookOpt.get();
            existingBook.setTitle(updatedBook.getTitle());
            existingBook.setAuthor(updatedBook.getAuthor());
            existingBook.setEditor(updatedBook.getEditor());
            existingBook.setNumberPages(updatedBook.getNumberPages());
            existingBook.setGenre(updatedBook.getGenre());
            existingBook.setPrice(updatedBook.getPrice());
            existingBook.setInStock(updatedBook.isInStock());
            return bookRepository.save(existingBook);
        } else {
            throw new RuntimeException("Book not found");
        }
    }

    public void deleteBook(Long id) {
        bookRepository.deleteById(id);
    }

}
