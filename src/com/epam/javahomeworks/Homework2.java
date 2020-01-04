package com.epam.javahomeworks;
import java.util.Scanner;
public class Homework2 {
    public static void main(String[] arg) {
// Task 1
        System.out.println("Задание 1");
        Scanner input = new Scanner(System.in);
        System.out.println("Введите целое трехзначное число: ");
        int number = input.nextInt();
        int a = number / 100;
        int b = number % 100 / 10;
        int c = number % 10;
        int result = (c * 100 + b * 10 + a) - number;
        System.out.println(result);
// Task 2
        System.out.println("Задание 2");
        System.out.println("Укажите вес в фунтах: ");
        double pounds = input.nextDouble();
        double d = pounds * 453.6;
        int kilo = (int)(d / 1000);
        int gramm = (int)(d % 1000);
        System.out.println(pounds + " фунтов = " + kilo + " килограмм " + gramm + " грамм.");
// Task 3
        System.out.println("Задание 3");
        System.out.println("Введите размер депозита: ");
        double deposit = input.nextDouble();
        System.out.println("Введите годовую процентную ставку: ");
        double percentPerMounth = (input.nextDouble()) / 100 / 12;
        System.out.println("Введите колличество месяцев: ");
        int mounth = input.nextInt();
        double profit = deposit * (percentPerMounth * mounth);
        System.out.printf("Ваша прибыль составит %1$.2f", profit);
    }
}