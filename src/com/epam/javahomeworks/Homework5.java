package com.epam.javahomeworks;

import java.util.Scanner;

public class Homework5 {

    static double [] additionArrays(double[] array1, double[] array2, int a) {

        for (int i = 0; i < a; i++) {
            array1[i] = Math.random();
            array2[i] = Math.random();
        }

        System.out.print("\nЭлементы массива array1: ");
        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i] + ", ");
        }

        System.out.print("\nЭлементы массива array2: ");
        for (int i = 0; i < array2.length; i++) {
            System.out.print(array2[i] + ", ");
        }

        double [] result = new double[a];

        for (int i = 0; i < a; i++) {
            result[i] = array1[i] + array2[i];
        }
        return result;
    }

    static void sortArray(double[] original, int a) {

        for (int i = 0; i < a; i++) {
            if ((i % 3) == 0 ) {
                original[i] = -(Math.random());
            } else {
                original[i] = Math.random();
            }
        }

        System.out.print("\nЭлементы первичного массива: ");
        for (int i = 0; i < original.length; i++) {
            System.out.print(original[i] + ", ");
        }

        double [] postive = new double[original.length];
        double [] negative = new double[original.length];
        int positiveNumber = 0;
        int negativeNumber = 0;
        for (double value : original) {
            if (value >= 0) {
                postive [positiveNumber++] = value;
            } else {
                negative [negativeNumber++] = value;
            }
        }

        System.out.print("\nПоложительные элементы: ");
        for (int i = 0; i < postive.length; i++) {
            System.out.print(postive[i] + ", ");
        }
        System.out.print("\nОтрицательные элементы: ");
        for (int i = 0; i < negative.length; i++) {
            System.out.print(negative[i] + ", ");
        }
    }

    public static void main(String[] args) {
//        Task 1
        Scanner input = new Scanner(System.in);
        System.out.println("Введите колличество элементов массива: ");
        int elementsQuantity = input.nextInt();
        double [] array1 = new double[elementsQuantity];
        double [] array2 = new double[elementsQuantity];
        double [] array3 = additionArrays(array1, array2, elementsQuantity);
        System.out.print("\nЭлементы массива array3: ");
        for (int i = 0; i < array3.length; i++) {
            System.out.print(array3[i] + ", ");
        }
//        Task 2
        double [] randomArray = new double[elementsQuantity];
        sortArray(randomArray, elementsQuantity);
    }
}
