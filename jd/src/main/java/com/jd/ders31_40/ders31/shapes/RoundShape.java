package com.jd.ders31_40.ders31.shapes;

public abstract class RoundShape extends Shape {
    private double radius;

    public RoundShape(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

}
