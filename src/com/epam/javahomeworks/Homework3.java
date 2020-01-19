package com.epam.javahomeworks;

import java.util.Scanner;

public class Homework3 {
    public static void main(String[] arg) {
        final String STAR = "* ";
        boolean repeat;
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("Укажите номер рисунка, который желаете увидеть (от 1 до 5) ");
            int number = sc.nextInt();
            switch (number) {
                case 1: {
                    int counter = 0;
                    int quantity = 0;
                    String a;
                    do {
                        counter++;
                        a = STAR.repeat(quantity);
                        if (counter <= 5) {
                            quantity++;
                            System.out.print(a);
                        } else {
                            quantity--;
                            System.out.print(a);
                        }
                        System.out.println();
                    }
                    while (counter <= 9);
                    break;
                }
                case 2: {
                    int counter = 0;
                    int quantity = 5;
                    String blankness = "  ";
                    String a, b;
                    do {
                        counter++;
                        a = STAR.repeat(quantity);
                        b = blankness.repeat(5 - quantity);
                        System.out.println(b + a);
                        quantity--;
                    }
                    while (counter <= 5);
                    break;
                }
                case 3: {
                    int counter = 1;
                    int quantity = 1;
                    String blankness = "  ";
                    String a, b;
                    do {
                        counter++;
                        a = STAR.repeat(quantity);
                        b = blankness.repeat(5 - quantity);
                        System.out.println(b + a);
                        quantity++;
                    }
                    while (counter <= 5);
                    break;
                }
                case 4: {
                    int counter = 0;
                    int quantity = 0;
                    String blankness = "  ";
                    String a, b;
                    do {
                        counter++;
                        a = STAR.repeat(quantity);
                        b = blankness.repeat(5 - quantity);
                        if (counter <= 5) {
                            quantity++;
                            System.out.print(b + a);
                        } else {
                            quantity--;
                            System.out.print(b + a);
                        }
                        System.out.println();
                    }
                    while (counter <= 9);
                    break;
                }
                case 5: {
                    int half = 1;
                    while (half < 3) {
                        int counter = 0;
                        int quantity = 0;
                        String blankness = "  ";
                        String a, b, c;
                        do {
                            counter++;
                            quantity++;
                            a = STAR.repeat(quantity);
                            c = STAR.repeat(quantity - 1);
                            b = blankness.repeat(6 - quantity);
                            System.out.print(b + a + c);
                            System.out.println();
                        }
                        while (counter <= 5);
                        half++;
                    }
                    break;
                }
                default:
                    System.err.println("Выбран не существующий вариант");
            }
            System.out.println("Желаете повторить?");
            String result = "да";
            String answer = sc.next();
            repeat = answer.equals(result);
        } while (repeat);

        System.out.println("До свидания!");
    }
}