package com.epam.javahomeworks.Homework6;

public class Books {
    Book[] books;
    private int counter = 0;
    private int size;

    public Books(int size) {
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
        if (counter >= size) {
            System.out.println("The bookshelf is full!");
        } else {
            books[counter++] = book;
        }
    }

    public void viewAllBooks() {
        if (books.length <= 0) {
            System.out.println("Books not found");
        } else {
            for (Book book : books) {
                if (!(book == null)) {
                    book.viewBook();
                } else {
                    break;
                }
            }
        }
    }

    public void increasePrise(int percent) {
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
        Books selectedBooks = new Books(counter);
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
        Books selectedBooks = new Books(counter);
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
}
