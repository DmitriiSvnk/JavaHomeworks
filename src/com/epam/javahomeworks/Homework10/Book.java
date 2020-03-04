package com.epam.javahomeworks.Homework10;

import java.io.Serializable;

public class Book implements Serializable {
    private int ID;
    private String title;
    private String author;
    private String publisher;
    private int year;
    private int pages;
    private double price;

    public Book(int ID, String title, String author, String publisher, int year, int pages, double price) {
        this.ID = ID;
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.year = year;
        this.pages = pages;
        this.price = price;
    }

    public int getID() {
        return ID;
    }
    public void setID(int ID) {
        this.ID = ID;
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
    public String getPublisher() {
        return publisher;
    }
    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public int getPages() {
        return pages;
    }
    public void setPages(int pages) {
        this.pages = pages;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return  "Book: " + ID + ", title: " + title +
                ", author: " + author + ", publisher: " + publisher +
                ", year: " + year + ", pages: " + pages + ", price: " + price + ";";
    }
}