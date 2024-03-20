package com.vp.part5;

/**
 * Created by vladproduction on 20-Mar-24
 */

public class Main01 {
    public static void main(String[] args) {
        Automobile auto = new Automobile(2024, "Black", "BMW");
        System.out.println(auto.getYearProduced());
        System.out.println(auto.getColor());
        System.out.println(auto.getModel());
        System.out.println("-------------");
        System.out.println(auto);

        System.out.println("==================");
        Automobile auto2 = new Automobile();
        auto2.setYearProduced(2023);
        auto2.setColor("White");
        auto2.setModel("VW");
        System.out.println("Auto: " + auto2.getYearProduced() + ", " + auto2.getColor() + ", " + auto2.getModel());
    }
}
