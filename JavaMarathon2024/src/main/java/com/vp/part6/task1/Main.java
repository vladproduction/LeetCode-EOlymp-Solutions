package com.vp.part6.task1;

/**
 * Created by vladproduction on 20-Mar-24
 */

public class Main {
    public static void main(String[] args) {
        System.out.println("-----auto-------");
        Auto auto = new Auto("BMW", "Black", 2020);
        System.out.println(auto);
        auto.info();
        auto.yearDifference(2024);
        System.out.println("-----motorbike-------");
        Motorbike motorbike = new Motorbike("Suzuki", "Red", 2018);
        System.out.println(motorbike);
        motorbike.info();
        motorbike.yearDifference(2024);

    }
}
