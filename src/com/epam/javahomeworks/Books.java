package com.epam.javahomeworks.Homework6;

import  java.util.Arrays;

public class Books {
    private static Book[] bookshelf = new Book[] {
            new Book(1, "Harry Potter and the Philosopher's Stone", "J.K. Rowling", "Bloomsbury", 2014, 254, 199),
            new Book(2, "The Girl in Room 105", "Chetan Bhagat", "Westland", 2019, 296, 187),
            new Book(3, "The Mysterious Affair at Styles", "Agatha Christie", "Random House Trade", 2007, 224, 150)
    };

    public Books() {

    }

    public Book[] getBookshelf() {
        return bookshelf;
    }
    public void setBookshelf(Book[] bookshelf) {
        this.bookshelf = bookshelf;
    }

    public static void addBook(Books[] books) {
        int elem = books.length + 1;
        books = Arrays.copyOf(books, elem);
        books[elem] = new Books();
    }
    public static void addBook(Books[] books, int ID, String title, String author,
                               String publishingHouse, int year, int numPages, int price) {
        int elem = books.length;
        books = Arrays.copyOf(books, books.length + 1);
        books[elem] = new Books();
    }
    public static void viewAllBooks() {
        for (Book elem : bookshelf) {
            elem.viewBook();
        }
    }
    public static void increasePrise(int percent) {
        for (Book elem: bookshelf) {
            int price = elem.getPrice();
            price += (price * percent);
            elem.setPrice(price);
        }
    }
    public void reducePrise(int percent) {
        for (Book elem: bookshelf) {
            int price = elem.getPrice();
            price -= (price * percent);
            elem.setPrice(price);
        }
    }
    public static Book[] searchAuthorsBook(String author) {
        Book[] selectedBooks = new Book[bookshelf.length];
        int counter = 0;
        for (Book elem : bookshelf) {
            if (elem.getAuthor().equals(author)) {
                selectedBooks[counter++] = elem;
            }
        }
        selectedBooks = Arrays.copyOf(selectedBooks, counter);
        return selectedBooks;
    }
    public Book[] searchBooksAfterYear(int year) {
        Book[] selectedBooks = new Book[bookshelf.length];
        int counter = 0;
        for (Book elem : bookshelf) {
            if (elem.getYear() > year) {
                selectedBooks[counter++] = elem;
            }
        }
        selectedBooks = Arrays.copyOf(selectedBooks, counter);
        return selectedBooks;
    }
}
