package com.jd.ders31_40.ders31.shapes;

public abstract class Shape {
    private String color;

    public Shape(String color) {
        this.color = color;
    }

    // Kalıtım class'larda uygulama zorunluluğu var.
    public abstract double calculateArea();

    public void write() {
        System.out.println("Color: " + color + " | Area: " + calculateArea());
    }
}
