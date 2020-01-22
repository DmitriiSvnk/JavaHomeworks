package com.epam.javahomeworks;

import java.util.Scanner;
import java.util.Arrays;

public class Homework5 {

    static int [] additionArrays(int[] array1, int[] array2, int a) {

        int[] result = new int[a];

        for (int i = 0; i < a; i++) {
            array1[i] = (int) (Math.random()*100-50);
            array2[i] = (int) (Math.random()*100-50);
        }

        System.out.print("\narray1: ");
        System.out.print(Arrays.toString(array1));

        System.out.print("\narray2: ");
        System.out.print(Arrays.toString(array2));

        for (int i = 0; i < a; i++) {
            result[i] = array1[i] + array2[i];
        }
        return result;
    }

    static void allocateArray(int[] original, int a) {

        for (int i = 0; i < a; i++) {
            original[i] = (int) (Math.random()*100-50);
        }

        System.out.print("\nЭлементы первичного массива: ");
        System.out.print(Arrays.toString(original));

        int [] postive = new int[original.length];
        int [] negative = new int[original.length];
        int positiveNumber = 0;
        int negativeNumber = 0;

        for (int value : original) {
            if (value >= 0) {
                postive [positiveNumber++] = value;
            } else {
                negative [negativeNumber++] = value;
            }
        }

        postive = Arrays.copyOf(postive, positiveNumber);
        negative = Arrays.copyOf(negative, negativeNumber);

        System.out.print("\nПоложительные элементы: ");
        System.out.print(Arrays.toString(postive));

        System.out.print("\nОтрицательные элементы: ");
        System.out.print(Arrays.toString(negative));
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите колличество элементов массива: ");
        int elementsQuantity = input.nextInt();

//        Task 1
        System.out.print("Task 1");
        int [] array1 = new int[elementsQuantity];
        int [] array2 = new int[elementsQuantity];
        int [] array3 = additionArrays(array1, array2, elementsQuantity);
        System.out.print("\narray3: ");
        System.out.println(Arrays.toString(array3));

//        Task 2
        System.out.print("Task 2");
        int [] randomArray = new int[elementsQuantity];
        allocateArray(randomArray, elementsQuantity);
    }
}