package com.vp.part1;

/**
 * Created by vladproduction on 19-Mar-24
 */

/**
 * 10 times "JAVA" in one string using for loop:
 * JAVA JAVA JAVA JAVA JAVA JAVA JAVA JAVA JAVA JAVA
 */
public class Task2_Java_10_times_for {
    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            StringBuilder sb = new StringBuilder();
            sb.append("JAVA ");
            System.out.print(sb);
        }
        System.out.println();
    }

}

