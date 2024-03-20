package com.vp.part7.task1;

/**
 * Created by vladproduction on 20-Mar-24
 */

public class Main {
    public static void main(String[] args) {
        Airplane airplane1 = new Airplane("Steals", 2023, 23.8, 7.4);
        Airplane airplane2 = new Airplane("Steals", 2023, 23.8, 7.4);

        Airplane.compareAirplanes(airplane1, airplane2);
    }
}
