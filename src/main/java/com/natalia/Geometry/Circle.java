package com.natalia.Geometry;

public class Circle {
    private double radius;
    private static double Pi = 3.141592;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Pi * radius * radius; 
    
    public double getPerimeter() {
        return 2 * Pi * radius;
}
    }
