package com.epam.javahomeworks.Homework8;

import java.util.Arrays;

public class Books {
    Book[] books;
    private int possitionCounter = 0;
    private int size;

    public Books(int size) {
        try {
            Validator.verifyBooksSize(size);
        } catch (Validator.CustomExeption myExeption) {
            myExeption.printStackTrace();
        }
        this.size = size;
        books = new Book[size];
    }

    public Book[] getBooks() {
        return books;
    }
    public void setBooks(Book[] books) {
        this.books = books;
    }

    public void addBook(Book book) {
        try {
            Validator.verifyPossition(possitionCounter, size);
        } catch (Validator.CustomExeption myExeption) {
            myExeption.printStackTrace();
        }
        books[possitionCounter++] = book;
    }

    public void viewAllBooks() {
        try {
            Validator.verifyOccupancyRate(possitionCounter);
        } catch (Validator.CustomExeption myExeption) {
            myExeption.printStackTrace();
        }
        for (Book book : books) {
            if (!(book == null)) {
                System.out.println(book);;
            } else {
                break;
            }
        }
    }

    public void increasePrise(double percent) {
        try {
            Validator.verifyPercent(percent);
        } catch (Validator.CustomExeption myExeption) {
            myExeption.printStackTrace();
        }
        for (Book book : books) {
            if (!(book == null)) {
                double oldPrice = book.getPrice();
                double margin = (oldPrice / 100) * percent;
                double newPrice = oldPrice + margin;
                book.setPrice(newPrice);
            } else {
                break;
            }
        }
    }

    public void decreasePrise(int percent) {
        try {
            Validator.verifyPercent(percent);
        } catch (Validator.CustomExeption myExeption) {
            myExeption.printStackTrace();
        }
        for (Book book : books) {
            if (!(book == null)) {
                double oldPrice = book.getPrice();
                double margin = (oldPrice / 100) * percent;
                double newPrice = oldPrice - margin;
                book.setPrice(newPrice);
            } else {
                break;
            }
        }
    }

    public Books searchByAuthor(String author) {
        try {
            Validator.verifyAuthor(author);
        } catch (Validator.CustomExeption myExeption) {
            myExeption.printStackTrace();
        }
        Books selectedBooks = new Books(possitionCounter);
        for (Book book : books) {
            if (!(book == null)) {
                String bookAuthor = book.getAuthor();
                if (bookAuthor.equalsIgnoreCase(author)) {
                    selectedBooks.addBook(book);
                }
            } else {
                break;
            }
        }
        return selectedBooks;
    }
    
    public Books searchByYear(int year) {
        try {
            Validator.verifyYear(year);
        } catch (Validator.CustomExeption myExeption) {
            myExeption.printStackTrace();
        }
        Books selectedBooks = new Books(possitionCounter);
        for (Book book : books) {
            if (!(book == null)) {
                if (book.getYear() > year) {
                    selectedBooks.addBook(book);
                }
            } else {
                break;
            }
        }
        return selectedBooks;
    }

    public void sortByAuthor() {
        Book[] sortedBooks = Arrays.copyOf(books, possitionCounter);
        Arrays.sort(sortedBooks, new MyComparatorAuthor());
        viewAllBooks();
    }

    public void sortByPublicher() {
        Book[] sortedBooks = Arrays.copyOf(books, possitionCounter);
        Arrays.sort(sortedBooks, new MyComparatorPublisher());
        for (Book b : sortedBooks) {
            System.out.println(b);
        }
    }

    public void sortByPrice() {
        Book[] sortedBooks = Arrays.copyOf(books, possitionCounter);
        Arrays.sort(sortedBooks, new MyComparatorPrice());
        for (Book b : sortedBooks) {
            System.out.println(b);
        }
    }
}