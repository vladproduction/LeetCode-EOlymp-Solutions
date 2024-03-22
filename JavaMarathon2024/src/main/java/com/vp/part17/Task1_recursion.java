package com.vp.part17;

/**
 * Created by vladproduction on 22-Mar-24
 */

public class Task1_recursion {
    public static void main(String[] args) {

        int [] numbers = {1, 10, 1241, 50402, -50, 249, 10215, 665, 2295, 7, 311};
//        int [] numbers = {1, 10, 1241};

        System.out.println(sum(numbers, 0));

    }

    public static int sum(int [] numbers, int i){

        if(i == numbers.length){
            return 0;
        }
        return numbers[i] + sum(numbers, i + 1);
    }
}
