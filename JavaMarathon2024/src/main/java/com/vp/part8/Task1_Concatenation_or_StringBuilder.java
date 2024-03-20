package com.vp.part8;

/**
 * Created by vladproduction on 20-Mar-24
 */

public class Task1_Concatenation_or_StringBuilder {
    public static void main(String[] args) {

        concatenationVersion();
        stringBuilderVersion();
    }

    private static void stringBuilderVersion() {
        long tameStart = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i <= 50000; i++) {
            sb.append(i).append(" ");
        }
        System.out.println(sb);
        long tameFinish = System.currentTimeMillis();
        long time = tameFinish - tameStart;
        System.out.println("time StringBuilder: " + time);
    }

    private static void concatenationVersion() {
        long tameStart = System.currentTimeMillis();
        String numbers = "";
        for (int i = 0; i <= 50000; i++) {
            numbers  += i + " "; // string is immutable, environment say to us that we are
            //going to rewrite numbers 20000 times, and the previous one is removing;
            //concatenation is not for rewriting, it`s for creating new String (and creating costs lot!)
        }
        System.out.println(numbers);
        long tameFinish = System.currentTimeMillis();
        long time = tameFinish - tameStart;
        System.out.println("time concatenation: " + time);
    }
}
