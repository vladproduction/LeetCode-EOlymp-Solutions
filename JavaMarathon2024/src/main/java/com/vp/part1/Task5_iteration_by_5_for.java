package com.vp.part1;

/**
 * Created by vladproduction on 19-Mar-24
 */

/**
 * make iteration till int value <= 100, in each step increment by 5, start from any value
 * use for loop
 */
public class Task5_iteration_by_5_for {
    public static void main(String[] args) {
        System.out.println("/////////// variant-1 ///////////");
        int value = 12;
        for (int i = 1; value <= 100; i++) {
            System.out.println(i + " - value is: " + value);
            value += 5;
        }
        System.out.println();
        System.out.println("/////////// variant-2 ///////////");
        int val = 12;
        int counter = 1;
        for (int i = val; i <= 100 ; i += 5) {
            System.out.println(counter + " - value = " + i);
            counter++;
        }
    }
}

