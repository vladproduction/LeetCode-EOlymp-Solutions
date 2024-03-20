package com.vp.part5;

/**
 * Created by vladproduction on 20-Mar-24
 */

public class Automobile {

    private int yearProduced;
    private String color;
    private String model;

    public Automobile(int yearProduced, String color, String model) {
        this.yearProduced = yearProduced;
        this.color = color;
        this.model = model;
    }

    public Automobile() {
    }

    public int getYearProduced() {
        return yearProduced;
    }

    public void setYearProduced(int yearProduced) {
        this.yearProduced = yearProduced;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Automobile{" +
                "yearProduced=" + yearProduced +
                ", color='" + color + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
