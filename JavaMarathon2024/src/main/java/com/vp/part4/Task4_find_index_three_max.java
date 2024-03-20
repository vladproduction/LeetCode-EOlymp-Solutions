package com.vp.part4;

/**
 * Created by vladproduction on 20-Mar-24
 */

import java.util.Random;

/**create new array by length = 100 randomly with range of 0 - 10000,
 * -find max among sum of three numbs,
 * -for found this three numbs with max sum print:
 * 1)value of this sum;
 * 2)index of first element of this three numbs */
public class Task4_find_index_three_max {
    public static void main(String[] args) {

        randomly_100_array();
        System.out.println("--------------");
        int [] arr = {1,230,50,8,10,20,2,35,200};
        handled_array(arr);
        System.out.println("--------------");
        handled_array2(arr);

    }

    private static void handled_array2(int[] arr) {
        int maxSumOfThree = 0;
        int indexOfMaxSum = 0;
        int currentSum = arr[0] + arr[1] + arr[2];  // first 3 elements

        for (int i = 3; i < arr.length; i++) {
            // Update currentSum by subtracting the element leaving the window and adding the new element entering
            currentSum = currentSum - arr[i - 3] + arr[i];

            if (currentSum > maxSumOfThree) {
                maxSumOfThree = currentSum;
                indexOfMaxSum = i - 2;  // Adjust index as we pre-calculated sum for first 3 elements
            }
        }

        System.out.println(maxSumOfThree);
        System.out.println(indexOfMaxSum);
    }

    private static void handled_array(int [] arr) {

        int maxSumOfThree = 0;
        int indexOfMaxSum = 0;
        for (int i = 0; i < arr.length - 2; i++) {
            int sum = 0;
            for (int j = i; j < i + 3; j++) {
                sum += arr[j];
            }

            if(sum > maxSumOfThree){
                maxSumOfThree = sum;
                indexOfMaxSum = i;
            }
        }

        System.out.println(maxSumOfThree);
        System.out.println(indexOfMaxSum);

    }

    private static void randomly_100_array() {
        int [] arr = new int[100];
        Random random = new Random();

        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(10000);
        }

        int maxSum = 0;
        int indexOfMaxSum = 0;
        for (int i = 0; i < arr.length - 2; i++) {
            int sum = 0;
            for (int j = i; j < i + 3; j++) {
                sum += arr[j];
            }

            if(sum > maxSum){
                maxSum = sum;
                indexOfMaxSum = i;
            }
        }

        System.out.println(maxSum);
        System.out.println(indexOfMaxSum);
    }
}
