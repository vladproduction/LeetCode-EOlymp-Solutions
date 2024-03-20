package com.vp.part6.task1;

/**
 * Created by vladproduction on 20-Mar-24
 */

public class Auto {
    private String model;
    private String color;
    private int year;

    public Auto(String model, String color, int year) {
        this.model = model;
        this.color = color;
        this.year = year;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Auto{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                '}';
    }

    public void info(){
        System.out.println("This is auto " + model);
    }

    public void yearDifference(int currentYear){
        System.out.println("Years this car: " + Math.abs(currentYear - year));
    }
}
