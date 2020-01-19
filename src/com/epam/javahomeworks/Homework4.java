package com.epam.javahomeworks;

import java.util. Scanner;

public class Homework4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите текст: ");
        String text = input.nextLine();
        int quantitySymbols = (text.length() - 1);
        String uniqueSymbols = " ";
        int quantityUniqueSymbols = (uniqueSymbols.length() - 1);
        int symbolNumber;
        Character symbol;
        Character a;
        int counter = 0;
        while (counter <= quantitySymbols) {
            symbolNumber = 0;
            do {
                if (symbolNumber <= quantityUniqueSymbols) {
                    symbol = text.charAt(counter);
                    a = uniqueSymbols.charAt(symbolNumber);
                    if (symbol.equals(a)) {
                    } break;
                } else {
                    uniqueSymbols = uniqueSymbols + symbol + ", ";
                }
                symbolNumber++;
            } while (symbolNumber <= counter);
            counter++;
        }
        System.out.println("Символы из которых состоит текст:");
        System.out.print(uniqueSymbols);
    }
}