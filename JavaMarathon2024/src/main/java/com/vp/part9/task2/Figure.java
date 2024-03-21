package com.vp.part9.task2;

/**
 * Created by vladproduction on 21-Mar-24
 */

public abstract class Figure {

    private String color;

    public Figure(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public abstract double area();

    public abstract double perimeter();
}
