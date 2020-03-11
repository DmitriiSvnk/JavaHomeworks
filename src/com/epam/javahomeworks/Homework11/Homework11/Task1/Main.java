package com.epam.javahomeworks.Homework11.Task1;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String parameters;
        Generator gen = new Generator();

        System.out.print("Enter list's elements quantity, lower border and upper border: ");
        parameters = sc.nextLine();
        List<Integer> list = gen.getList(parameters);
        gen.display(list);

        System.out.print("Enter set's elements quantity, lower border and upper border: ");
        parameters = sc.nextLine();
        Set<Integer> set = gen.getSet(parameters);
        gen.display(set);
    }
}