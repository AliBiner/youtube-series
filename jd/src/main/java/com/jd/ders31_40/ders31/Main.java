package com.jd.ders31_40.ders31;

import java.util.Random;

import com.jd.ders31_40.ders31.shapes.Circle;
import com.jd.ders31_40.ders31.shapes.Rectangle;
import com.jd.ders31_40.ders31.shapes.Shape;

public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            Shape shape = randomCreateShape();
            System.out.println("------------------------");
            System.out.println(shape.getClass().getName());
            shape.write();
        }
    }

    public static Shape randomCreateShape() {
        Random random = new Random();
        double rate = random.nextDouble();
        if (rate < 0.5) {
            return new Circle("Pink", 10);
        } else {
            return new Rectangle("Dark", 4, 4);
        }
    }
}
