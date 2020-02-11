package com.epam.javahomeworks.Homework7;

public class Main {
    public static void main(String[] args) {
        double area;
        Shape[] shapes = {
                new Rectangle("red", 3, 7.2),
                new Rectangle("green", 7.1, 4.2),
                new Rectangle("blue", 4.5, 6.8),
                new Rectangle("yellow", 12.2, 6.3),
                new Circle("purple", 2.7),
                new Circle("orange", 9.4),
                new Circle("brown", 80.9),
                new Triangle("grey", 3.0, 4.0, 5.2),
                new Triangle("white", 2.3, 2.9, 4.6)
        };

        viewAll(shapes);

        area = calcTotalArea(shapes);
        System.out.println("Total area of all figures = " + area);

        System.out.println("Total area of all circles = " + calcTotalArea(shapes, "Circle"));

        System.out.println("Total area of all rectangles = " + calcTotalArea(shapes, "Rectangle"));

        System.out.println("Total area of all triangles = " + calcTotalArea(shapes, "Triangle"));
    }

    static void viewAll(Shape[] shapes) {
        for (Shape s : shapes) {
            System.out.print(s);
            System.out.println(" Area=" + s.calcArea());
        }
    }

    static double calcTotalArea(Shape[] shapes) {
        double totalArea = 0;
        for (Shape s : shapes) {
            totalArea += s.calcArea();
        }
        return totalArea;
    }

    static double calcTotalArea(Shape[] shapes, String shapeType) {
        double area = 0;
        for (Shape s : shapes) {
            if (s.getClass().getSimpleName().equals(shapeType)) {
                area += s.calcArea();
            }
        }
        return area;
    }
}
