package com.epam.javahomeworks.Homework10;

import java.io.*;

public class BooksSerializer {
    public void serializeBooks(Book[] books, String filename) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename))) {
            oos.writeObject(books);
        } catch(IOException e) {
            e.printStackTrace();
        }
    }

    public Book[] deserializeBooks(String filename) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename)) ) {
            return (Book[])ois.readObject();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }
}