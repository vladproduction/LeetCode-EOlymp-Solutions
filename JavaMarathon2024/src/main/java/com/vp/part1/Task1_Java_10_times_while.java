package com.vp.part1;

/**
 * Created by vladproduction on 19-Mar-24
 */
/**10 times "JAVA" in one string using while loop:
 * JAVA JAVA JAVA JAVA JAVA JAVA JAVA JAVA JAVA JAVA */
public class Task1_Java_10_times_while {
    public static void main(String[] args) {
        int i = 0;
        while (i < 10){
            StringBuilder sb = new StringBuilder();
            sb.append("JAVA ");
            System.out.print(sb);
            i++;
        }
        System.out.println();
    }
}
