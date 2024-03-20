package com.vp.part4;

/**
 * Created by vladproduction on 20-Mar-24
 */

import java.util.Random;

/**fill up matrix randomly by values: 0 - 50, matrix is (m-row * n-column) where m = 12 n = 8,
 * -print index of row where sum of it`s numbs is max,
 * if such row is more than one, print the last*/
public class Task3_matrix_array {
    public static void main(String[] args) {
        
        int [][] matrix = new int[12][8];
        Random random = new Random();

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = random.nextInt(50);
            }
        }

        int maxSum = 0;
        int indexOfMaxSumRow = 0;
        for (int i = 0; i < matrix.length; i++) {
            int sum = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                sum += matrix[i][j];
            }

            if (sum >= maxSum){
                maxSum = sum;
                indexOfMaxSumRow = i;
            }
        }
        System.out.println(indexOfMaxSumRow);

    }
}
