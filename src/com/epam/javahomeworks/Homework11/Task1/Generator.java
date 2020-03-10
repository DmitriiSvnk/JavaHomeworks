package com.epam.javahomeworks.Homework11.Task1;

import java.util.*;

public class Generator {
    private int quantity;
    private int lowerBorder;
    private int upperBorder;

    private void generateParameters(String str) {
        String[] parametrs = str.split(", ");
        this.quantity = Integer.parseInt(parametrs[0]);
        this.lowerBorder = Integer.parseInt(parametrs[1]);
        this.upperBorder = Integer.parseInt(parametrs[2]);
        try {
            verifyParameters();
        } catch (Generator.InvalidBordersException e) {
            e.printStackTrace();
        }
    }

    private void verifyParameters() throws InvalidBordersException {
        if ((upperBorder - lowerBorder) < quantity) throw new InvalidBordersException
                ("The number of elements exceeds the permissible range!");
    }

    private int generateValue() {
        return (int) (Math.random() * upperBorder - lowerBorder );
    }

    public List<Integer> getList(String str) {
        generateParameters(str);
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < quantity; i++) {
            list.add(generateValue());
        }
        return list;
    }

    public Set<Integer> getSet(String str) {
        generateParameters(str);
        Set<Integer> set = new LinkedHashSet<>();
        for (int i = 0; i < quantity; i++) {
            set.add(generateValue());
        }
        return set;
    }

    public void displayList(List<Integer> list) {
        System.out.println("List: " + list);
    }

    public void displaySet(Set<Integer> set) {
        System.out.println("Set: " + set);
    }

    private class InvalidBordersException extends Exception {
        public InvalidBordersException(String message) {
            super(message);
        }
    }
}