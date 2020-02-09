package com.epam.HW7;

public class Triangle extends Shape {
    private double a;
    private double b;
    private double c;

    public Triangle(String color, double a,
                   double b, double c) {
        super(color);
        this.a = a;
        this.b = b;
	this.c = c;
    }

    public double getA() {
        return a;
    }
    public void setA(double a) {
        this.a = a;
    }
    public double getB() {
        return b;
    }
    public void setB(double b) {
        this.b = b;
    }
    public double getC() {
        return c;
    }
    public void setC(double c) {
        this.c = c;
    }

    @Override
    public String toString() {
        return super.toString() + ", a=" + a + 
		", b=" + b + ", c=" + c + ".";
    }

    @Override
    public double calcArea(){
	double area;
	double halfPerimeter = (a + b + c) / 2;
	area = Math.sqrt(halfPerimeter * (halfPerimeter - a) * 
		(halfPerimeter - b) * (halfPerimeter - c));
	return area;
    }
}
