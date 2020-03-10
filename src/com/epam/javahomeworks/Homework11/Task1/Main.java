package com.epam.javahomeworks.Homework11.Task1;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String parametrs;
        Generator gen = new Generator();

        System.out.print("Enter list's elements quantity, lower border and upper border: ");
        parametrs = sc.nextLine();
        List<Integer> list = gen.getList(parametrs);

        System.out.print("Enter list's elements quantity, lower border and upper border: ");
        parametrs = sc.nextLine();
        Set<Integer> set = gen.getSet(parametrs);

        gen.displayList(list);
        gen.displaySet(set);
    }
}