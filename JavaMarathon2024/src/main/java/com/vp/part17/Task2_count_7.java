package com.vp.part17;

/**
 * Created by vladproduction on 22-Mar-24
 */

public class Task2_count_7 {
    public static void main(String[] args) {

        int number = 71727374;
        System.out.println(count_7(number));

    }

    private static int count_7(int number) {

        if(number == 0){
            return 0;
        }
        if(number % 10 == 7){
           return 1 + count_7(number / 10);
        } else {
            return count_7(number / 10);
        }

    }
}
