package com.jd.ders31_40.ders31.shapes;

public class Circle extends RoundShape {

    public Circle(String color, double radius) {
        super(color, radius);
    }

    @Override
    public double calculateArea() {
        return Math.PI * (this.getRadius() * this.getRadius());
    }

}
