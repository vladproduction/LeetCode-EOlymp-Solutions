package com.vp.part4;

/**
 * Created by vladproduction on 20-Mar-24
 */

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**amount of elements in array, create this array [amount],
 * fill up it by numbs (0 - 10) randomly,
 * -1)print length, -2) amount of numbs '> 8', -3) amount numbs equal '1',
 * -4) amount of even, -5) amount of odd, -6) sum of elements;
 * */
public class Task1_random_array {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int amountElements = scanner.nextInt();
        int [] array = new int[amountElements];
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10);
        }

        System.out.println(Arrays.toString(array));
        System.out.println("1)length: " + amountElements);

        int counter_8 = 0;
        for (int i = 0; i < array.length; i++) {
            if(array[i] > 8){
                counter_8++;
            }
        }
        System.out.println("2)amount of numbers '> 8': " + counter_8);

        int counter_1 = 0;
        for (int i = 0; i < array.length; i++) {
            if(array[i] == 1){
                counter_1++;
            }
        }
        System.out.println("3)amount of numbers equal '1': " + counter_1);

        int evenNumbs = 0;
        for (int i = 0; i < array.length; i++) {
            if(array[i] % 2 == 0){
                evenNumbs++;
            }
        }
        System.out.println("4)amount of numbers even numbs: " + evenNumbs);

        int oddNumbs = 0;
        for (int i = 0; i < array.length; i++) {
            if(array[i] % 2 != 0){
                oddNumbs++;
            }
        }
        System.out.println("5)amount of numbers odd numbs: " + oddNumbs);

        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            int number = array[i];
            sum += number;
        }
        System.out.println("6)sum of numbers: " + sum);



    }
}
