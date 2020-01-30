package com.epam.javahomeworks.Homework6;

import  java.util.Arrays;

public class Books {
    private Book[] books;
    private int counter;
    public Books() {
        books = new Book[0];
    }

    public Book[] getBooks() {
        return books;
    }
    public void setBooks(Book[] books) {
        this.books = books;
    }

    public void addBook(Book book) {
        books = Arrays.copyOf(books, books.length + 1);
        books[counter++] = book;
    }
    public void viewAllBooks() {
        if (books.length == 0) {
            System.out.println("Not found");
        } else {
            for (Book book : books) {
                book.viewBook();
            }
        }
    }
    public void increasePrise(int percent) {
        for (Book book : books) {
            double oldPrice = book.getPrice();
            double margin = (oldPrice / 100) * percent;
            double newPrice = oldPrice + margin;
            book.setPrice(newPrice);
        }
    }
    public void decreasePrise(int percent) {
        for (Book book : books) {
            double oldPrice = book.getPrice();
            double margin = (oldPrice / 100) * percent;
            double newPrice = oldPrice - margin;
            book.setPrice(newPrice);
        }
    }
    public Books searchByAuthor(String author) {
        Books selectedBooks = new Books();
        for (Book book : books) {
            if (book.getAuthor().equalsIgnoreCase(author)) {
                selectedBooks.addBook(book);
            }
        }
        return selectedBooks;
    }
    public Books searchByYear(int year) {
        Books selectedBooks = new Books();
        for (Book book : books) {
            if (book.getYear() > year) {
                selectedBooks.addBook(book);
            }
        }
        return selectedBooks;
    }
}
