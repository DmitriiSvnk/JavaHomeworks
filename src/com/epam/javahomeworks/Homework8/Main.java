package com.epam.javahomeworks.Homework8;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Books bookshelf;

        System.out.println("Enter size of bookshelf:");
        int bookshelfSize = input.nextInt();
        bookshelf = new Books(bookshelfSize);

        Book myBook1 = BookSupplier.create();
        bookshelf.addBook(myBook1);
        bookshelf.addBook(BookSupplier.create());
        bookshelf.addBook(BookSupplier.create());
        bookshelf.addBook(BookSupplier.create());
        bookshelf.addBook(BookSupplier.create());
        bookshelf.addBook(BookSupplier.create());
        bookshelf.addBook(BookSupplier.create());

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
        System.out.println("*******************************************************************");
        bookshelf.sortByAuthor();
        System.out.println("*******************************************************************");
        bookshelf.sortByPublicher();
        System.out.println("*******************************************************************");
        bookshelf.sortByPrice();
    }
}