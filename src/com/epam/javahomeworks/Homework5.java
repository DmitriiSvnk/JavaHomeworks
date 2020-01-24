package com.epam.javahomeworks;

import java.util.Scanner;
import java.util.Arrays;

public class Homework5 {

    static int [] additionArrays(int[] array1, int[] array2) {
        int[] result = new int[array1.length];
        for (int i = 0; i < array1.length; i++) {
            result[i] = array1[i] + array2[i];
        }
        return result;
    }

    static int[][] allocateArray(int[] original) {
        int result[][] = new int[2][original.length];
        int positiveNumber = 0;
        int negativeNumber = 0;
        for (int value : original) {
            if (value >= 0) {
                result[0][positiveNumber++] = value;
            } else {
                result[1][negativeNumber++] = value;
            }
        }
        result[0] = Arrays.copyOf(result[0], positiveNumber);
        result[1] = Arrays.copyOf(result[1], negativeNumber);
        return result;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите колличество элементов массива: ");
        int elementsQuantity = input.nextInt();

//        Task 1
        System.out.print("Task 1");
        int [] array1 = new int[elementsQuantity];
        int [] array2 = new int[elementsQuantity];
        for (int i = 0; i < elementsQuantity; i++) {
            array1[i] = (int) (Math.random()*100-50);
            array2[i] = (int) (Math.random()*100-50);
        }

        System.out.print("\narray1: ");
        System.out.print(Arrays.toString(array1));

        System.out.print("\narray2: ");
        System.out.print(Arrays.toString(array2));

        int [] array3 = additionArrays(array1, array2);
        System.out.print("\narray3: ");
        System.out.println(Arrays.toString(array3));

//        Task 2
        System.out.print("Task 2");
        int [] randomArray = new int[elementsQuantity];
        for (int i = 0; i < elementsQuantity; i++) {
            randomArray[i] = (int) (Math.random()*100-50);
        }

        System.out.print("\nЭлементы первичного массива: ");
        System.out.print(Arrays.toString(randomArray));

        int result[][] = allocateArray(randomArray);
        System.out.print("\nПоложительные элементы: ");
        System.out.print(Arrays.toString(result[0]));

        System.out.print("\nОтрицательные элементы: ");
        System.out.print(Arrays.toString(result[1]));
    }
}