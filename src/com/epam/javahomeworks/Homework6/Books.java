package com.epam.javahomeworks.Homework6;

import  java.util.Arrays;

public class Books {
    private Book[] books;

    public Books(int size) {
        if (size >= 0) {
            books = new Book[size];
        } else {
            System.err.println("Not found.");
        }
    }

    public Book[] getBooks() {
        return books;
    }
    public void setBooks(Book[] books) {
        this.books = books;
    }

    public void addBook(Book book) {
        int size = books.length + 1;
        books = Arrays.copyOf(books, size);
        books[--size] = book;
    }
    public void viewAllBooks() {
        if (books.length == 0) {
            System.out.println("Nothing found");
        } else {
            for (Book book : books) {
                book.viewBook();
            }
        }
    }
    public void increasePrise(int percent) {
        for (Book book : books) {
            int oldPrice = book.getPrice();
            int margin = (oldPrice / 100) * percent;
            int newPrice = oldPrice + margin;
            book.setPrice(newPrice);
        }
    }
    public void decreasePrise(int percent) {
        for (Book book : books) {
            int oldPrice = book.getPrice();
            int margin = (percent / 100) * oldPrice;
            int newPrice = oldPrice - margin;
            book.setPrice(newPrice);
        }
    }
    public Books searchByAuthor(String author) {
        Books selectedBooks = new Books(0);
        for (Book book : books) {
            if (book.getAuthor().equals(author)) {
                selectedBooks.addBook(book);
            }
        }
        return selectedBooks;
    }
    public Books searchByYear(int year) {
        Books selectedBooks = new Books(0);
        for (Book book : books) {
            if (book.getYear() > year) {
                selectedBooks.addBook(book);
            }
        }
        return selectedBooks;
    }
}