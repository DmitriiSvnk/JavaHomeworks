package com.epam.HW7;

public class Main {
    public static void main(String[] args) {
        Shape[] shapes = {
            new Rectangle("red", 2,0, 3,7),
            new Rectangle("green", 7,1, 4,2),
	    new Rectangle("blue", 4,5, 6,8),
	    new Rectangle("yellow", 12,2, 6,3),
	    new Circle("purple", 2,7),
	    new Circle("orange", 9,4),
	    new Circle("brown", 80,9),
	    new Triangle("grey", 3,0, 4,0, 5,2),
	    new Triangle("white", 2,3, 2,9, 4,6);
        };
    }

    public static void viewAll() {
        for (Shape s : shapes) {
            System.out.print(s);
	    System.out.println(" Area= " + s.calcArea());
        }
    }
}
