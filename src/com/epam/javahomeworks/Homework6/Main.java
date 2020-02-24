package com.epam.javahomeworks.Homework6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Books bookshelf;

        System.out.println("Enter size of bookshelf:");
        int bookshelfSize = input.nextInt();
        bookshelf = new Books(bookshelfSize);

        Book myBook1 = new Book(1, "Harry Potter and the Philosopher's Stone", "J.K. Rowling",
                "Bloomsbury", 2014, 254, 199);
        bookshelf.addBook(myBook1);
        bookshelf.addBook(new Book(2, "The Girl in Room 105", "Chetan Bhagat",
                "Westland", 2019, 296, 187));

        bookshelf.viewAllBooks();

        System.out.println("Enter percent to change the price:");
        int percent = input.nextInt();
        bookshelf.increasePrise(percent);
        bookshelf.viewAllBooks();

        System.out.println("Enter authors name to find books:");
        input.nextLine();
        Books bookshelf2 = bookshelf.searchByAuthor(input.nextLine());
        bookshelf2.viewAllBooks();

        System.out.println("Enter year to find books:");
        int year = input.nextInt();
        Books bookshelf3 = bookshelf.searchByYear(year);
        bookshelf3.viewAllBooks();
    }
}
