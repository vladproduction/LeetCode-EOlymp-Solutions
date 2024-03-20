package com.vp.part6.task2;

/**
 * Created by vladproduction on 20-Mar-24
 */

public class Main {
    public static void main(String[] args) {

        System.out.println("---init---");
        Airplane airplane = new Airplane("Steals", 2023, 23.8, 7.4);
        airplane.setTankValue(20);
        System.out.println(airplane.info());

        System.out.println("---year and tank values changed---");
        airplane.fillUp(60);
        airplane.setYearProduction(2024);
        System.out.println(airplane.info());

    }
}
