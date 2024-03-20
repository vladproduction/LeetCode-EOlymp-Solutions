package com.vp.part6.task2;

/**
 * Created by vladproduction on 20-Mar-24
 */

public class Airplane {

    private String production;
    private int yearProduction;
    private double length;
    private double weight;
    private double tankValue = 0;

    public Airplane(String production, int yearProduction, double length, double weight) {
        this.production = production;
        this.yearProduction = yearProduction;
        this.length = length;
        this.weight = weight;
    }

    public String getProduction() {
        return production;
    }

    public void setProduction(String production) {
        this.production = production;
    }

    public int getYearProduction() {
        return yearProduction;
    }

    public void setYearProduction(int yearProduction) {
        this.yearProduction = yearProduction;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getTankValue() {
        return tankValue;
    }

    public void setTankValue(double tankValue) {
        this.tankValue = tankValue;
    }

    public String info() {
        return "production: " + production +
                ", year production: " + yearProduction +
                ", length: " + length +
                ", weight: " + weight +
                ", tank value: " + tankValue;
    }

    public void fillUp(double value){
        System.out.println("Tank filled up on: " + value);
        System.out.println(tankValue + value);
    }
}
