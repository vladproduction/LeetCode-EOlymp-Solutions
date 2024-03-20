package com.vp.part4;

/**
 * Created by vladproduction on 20-Mar-24
 */

import java.util.Arrays;
import java.util.Random;

/**create random array of 100 elements by values:0 - 10000,
 * for each print info: -min, -max, -end by '0', -sum elements end by '0',
 * no any sorting*/
public class Task2_array_100_info {
    public static void main(String[] args) {
        int [] numbers = new int[100];
        Random random = new Random();
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(10000);
        }
        System.out.println(Arrays.toString(numbers));

        int max = 0;
        for (int element : numbers) {
            if(element > max){
                max = element;
            }
        }
        System.out.println("MAX: " + max);

        int min = 10000;
        for (int element : numbers) {
            if (element < min){
                min = element;
            }
        }
        System.out.println("MIN: " + min);

        // (x % 10 == 0)
        int counter_0 = 0;
        for (int number : numbers) {
            if(number % 10 == 0){
                counter_0++;
            }
        }
        System.out.println("End by '0': " + counter_0);

        int sumCounter_0 = 0;
        for (int number : numbers) {
            if(number % 10 == 0){
                sumCounter_0 += number;
            }
        }
        System.out.println("Sum elements end by '0': " + sumCounter_0);


    }
}
