package com.vp.part1;

/**
 * Created by vladproduction on 19-Mar-24
 */

/**make iteration till int value = 100, in each step increment by 5, start from any value
 * use while loop*/
public class Task4_iteration_by_5_while {
    public static void main(String[] args) {
        int value = 12;
        int i = 1;
        while (value <= 100) {
            System.out.println(i + " - value is: " + value);
            value += 5;
            i++;
        }
    }

}

