package com.jd.ders31_40.ders31.shapes;

public class Circle extends Shape {

    private double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * Math.sqrt(radius);
    }

}
