package com.epam.javahomeworks.Homework7;

public class Circle extends Shape {
    private double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", radius=" + radius + ".";
    }

    @Override
    public double calcArea(){
        double area;
        area = Math.PI * Math.pow(radius, 2);
        return area;
    }

}
