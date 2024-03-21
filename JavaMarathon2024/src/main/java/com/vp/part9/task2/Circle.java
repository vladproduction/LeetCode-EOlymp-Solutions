package com.vp.part9.task2;

/**
 * Created by vladproduction on 21-Mar-24
 */

public class Circle extends Figure{

    private double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double area() {
        return radius * radius * Math.PI;
    }

    @Override
    public double perimeter() {
        return 2 * Math.PI * radius;
    }
}
