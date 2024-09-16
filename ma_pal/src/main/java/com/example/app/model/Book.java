package com.example.app.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Setter
@Getter
@Entity
public class Book {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;

    @NotNull
    private String title;

    private String author;
    private String editor;

    @Positive
    private int numberPages;

    private String genre;

    @Positive
    private double price;

    private boolean inStock;

    public Book(String title, String author, String editor, int numberPages, String genre, Double price, boolean inStock) {
        this.title = title;
        this.author = author;
        this.editor = editor;
        this.numberPages = numberPages;
        this.genre = genre;
        this.price = price;
        this.inStock = inStock;
    }
}