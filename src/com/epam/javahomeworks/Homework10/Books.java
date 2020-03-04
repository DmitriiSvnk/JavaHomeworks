package com.epam.javahomeworks.Homework10;

import java.util.*;
import java.io.Serializable;

public class Books implements Serializable {
    Book[] books;
    private int possitionCounter = 0;
    private int size;
    private Scanner sc = new Scanner(System.in);
    private BooksSerializer booksSerializer = new BooksSerializer();


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
        Arrays.sort(sortedBooks, new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                String author1 = ((Book)o1).getAuthor();
                String author2 = ((Book)o2).getAuthor();
                if (author1 == null) {
                    return 1;
                }
                if (author2 == null) {
                    return -1;
                }
                return author1.compareTo(author2);
            }
        });
        viewAllBooks();
    }

    public void sortByPublicher() {
        Book[] sortedBooks = Arrays.copyOf(books, possitionCounter);
        Arrays.sort(sortedBooks, (Comparator<Book>) (o1, o2) -> {
            String publisher1 = ((Book)o1).getPublisher();
            String publisher2 = ((Book)o2).getPublisher();
            if (publisher1 == null) {
                return 1;
            }
            if (publisher2 == null) {
                return -1;
            }
            return publisher1.compareTo(publisher2);
        });
        viewAllBooks();
    }

    public void sortByPrice() {
        Book[] sortedBooks = Arrays.copyOf(books, possitionCounter);
        Arrays.sort(sortedBooks, new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                double price1 = ((Book)o1).getPrice();
                double price2 = ((Book)o2).getPrice();
                return Double.compare(price2, price1);
            }
        });
        viewAllBooks();
    }

    public void manageBooks() {
        System.out.println("Please, select one of the options:");
        System.out.println("If you want to serialize books, input 1");
        System.out.println("If you want to deserialize books, input 2");
        System.out.println("If you don't want to do anything, input 0");
        int option = sc.nextInt();
        String filename;
        switch (option) {
            case (1) :
                System.out.print("Enter file name in which to deserialize books -> ");
                filename = sc.nextLine();
                booksSerializer.deserializeBooks(filename);
            break;
            case (2) :
                System.out.print("Enter file name in which to serialize books -> ");
                filename = sc.nextLine();
                booksSerializer.serializeBooks(books, filename); break;
            default: break;
        }
    }
}