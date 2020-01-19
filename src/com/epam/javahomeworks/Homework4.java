package com.epam.javahomeworks;

import java.util. Scanner;

public class Homework4 {
//  Task 1
    static String getUniqueSymbols(String text) {
        String textWithoutSpaces = text.replaceAll(" ", "");
        String result = "";
        int quantitySymbols = textWithoutSpaces.length();
        int counter = 0;
        do {
            if (result.indexOf(textWithoutSpaces.charAt(counter)) == -1) {
                result += (textWithoutSpaces.charAt(counter) + ", ");
            }
            counter++;
        } while (counter < quantitySymbols);
        return result;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите текст: ");
        String text = input.nextLine();
        String uniqueSymbols = getUniqueSymbols(text);
        System.out.println("Символы из которых состоит текст: " + uniqueSymbols);

//  Task 2
        int number;
        System.out.println("Введите целое десятичное число: ");
        number = input.nextInt();
        String convert = Integer.toBinaryString(number);
        System.out.println("Ваше число в двоичной системе счисления: " + convert);
    }
}
