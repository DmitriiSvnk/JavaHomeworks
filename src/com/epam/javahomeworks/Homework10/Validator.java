package com.epam.javahomeworks.Homework10;

import java.io.Serializable;

public class Validator implements Serializable {
    public static void verifyBooksSize(int size) throws CustomExeption {
        if (size <= 0) throw new CustomExeption("Bookshelf can't be less than zero!");
    }

    public static void verifyPossition(int possitionCounter, int size) throws CustomExeption {
        if (possitionCounter >= size) {
            throw new CustomExeption("The bookshelf is full!");
        }
    }

    public static void verifyOccupancyRate(int possitionCounter) throws CustomExeption {
        if (possitionCounter == 0) {
            throw new CustomExeption("There are no books!");
        }
    }

    public static void verifyPercent(double percent) throws CustomExeption {
        if (percent < 0) {
            throw new CustomExeption("Cannot execute the operation with the negative value!");
        }
    }

    public static void verifyAuthor(String searchAuthor) throws CustomExeption {
        if (searchAuthor.length() == 0) {
            throw new CustomExeption("Invalid name of Author!");
        }
    }

    public static void verifyYear(int year) throws CustomExeption {
        if (year <= 0) {
            throw new CustomExeption("Time can't have negative value!");
        }
    }

    static class CustomExeption extends Exception{
        public CustomExeption(String message) {
            super(message);
        }
    }
}