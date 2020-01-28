package com.epam.javahomeworks.Homework6;

public class Book {
    private String title, author, publishingHouse;
    private int ID, year, numPages, price;

    public Book() {
    }

    public Book(int ID, String title, String author, String publishingHouse, int year, int numPages, int price) {
        this.ID = ID;
        this.title = title;
        this.author = author;
        this.publishingHouse = publishingHouse;
        this.year = year;
        this.numPages = numPages;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public String getPublishingHouse() {
        return publishingHouse;
    }
    public void setPublishingHouse(String publishingHouse) {
        this.publishingHouse = publishingHouse;
    }
    public int getID() {
        return ID;
    }
    public void setID(int ID) {
        this.ID = ID;
    }
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public int getNumPages() {
        return numPages;
    }
    public void setNumPages(int numPages) {
        this.numPages = numPages;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }

    public void viewBook() {
        System.out.println("ID: " + ID + ", title: " + title + ", author: " + author +
                ", published by: " + publishingHouse + ", year: " + year +
                ", pages: " + numPages + ", price: " + price);
    }
}
