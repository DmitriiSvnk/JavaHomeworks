package com.epam.javahomeworks.Homework8;

import java.util.Comparator;

public class MyComparatorPublisher implements Comparator<Book> {
    @Override
    public int compare(Book o1, Book o2) {
        String publisher1 = ((Book)o1).getPublisher();
        String publisher2 = ((Book)o2).getPublisher();
        if (publisher1 == null) {
            return 1;
        }
        if (publisher2 == null) {
            return -1;
        }
        return publisher1.compareTo(publisher2);
    }
}