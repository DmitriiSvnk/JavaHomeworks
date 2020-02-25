package com.epam.javahomeworks.Homework8;

public class BookSupplier {
    public static Book create(){
        Book book;
        int id = (int) (Math.random() * 1000);
        int key = (int) (Math.random() * 10);
        switch (key) {
            default: book = new Book(id, "Harry Potter and the Philosopher's Stone", "J.K. Rowling",
                    "Bloomsbury", 2014, 254, 199 ); break;
            case 1: book = new Book(id, "The Girl in Room 105", "Chetan Bhagat",
                    "Westland", 2019, 296, 187); break;
            case 2: book = new Book(id, "1984", "George Orwell",
                    "Houghton Mifflin Harcourt", 2013, 237, 115); break;
            case 3: book = new Book(id, "The Great Gatsby", "Francis Scott Fitzgerald",
                    "Scribner", 2004, 200, 127); break;
            case 4: book = new Book(id, "The Hobbit, or There and Back Again", "J.R.R. Tolkien",
                    "Houghton Mifflin Harcourt", 2002, 366, 202); break;
            case 5: book = new Book(id, "The Diary of a Young Girl", "Anne Frank",
                    "Bantam", 1993, 283, 96); break;
            case 6: book = new Book(id, "The Little Prince", "Antoine de Saint-Exupéry",
                    "Houghton Mifflin Harcourt", 2000, 93, 48); break;
            case 7: book = new Book(id, "Fahrenheit 451", "Ray Bradbury",
                    "Simon & Schuster", 2011, 194, 132); break;
            case 8: book = new Book(id, "The Catcher in the Rye", "J.D. Salinger",
                    "Back Bay Books", 2013, 277, 172); break;
            case 9: book = new Book(id, "The Grapes of Wrath", "John Steinbeck",
                    "Viking", 2014, 479, 180); break;
            case 10: book = new Book(id, "Brave New World", "Aldous Huxley",
                    "HarperPerennial", 1998, 288, 163); break;
        }
        return book;
    }
}
