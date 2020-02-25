package com.epam.javahomeworks.Homework8;

import java.util.Comparator;

public class MyComparatorPrice implements Comparator<Book> {
    @Override
    public int compare(Book o1, Book o2) {
        double price1 = ((Book)o1).getPrice();
        double price2 = ((Book)o2).getPrice();
        return Double.compare(price2, price1);
}
}