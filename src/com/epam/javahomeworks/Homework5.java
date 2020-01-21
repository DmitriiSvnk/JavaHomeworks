package com.epam.javahomeworks;

import java.util.Scanner;

public class Homework5 {
//    Task1
    static double [] additionArrays(double[] array1, double[] array2, int a){
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
    public static void main(String[] args) {
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
    }
}
