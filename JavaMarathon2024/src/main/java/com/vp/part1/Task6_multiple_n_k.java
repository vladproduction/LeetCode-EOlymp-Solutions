package com.vp.part1;

/**
 * Created by vladproduction on 19-Mar-24
 */
/**int k = 1...9, (for, while), make multiple table:
 * 1 x k = ...
 * 2 x k = ...
 * 3 x k = ...*/
public class Task6_multiple_n_k {
    public static void main(String[] args) {
        int k = 7;
        for (int i = 1; i < 10; i++) {
            int result = i * k;
            System.out.println(i + " x " + k + " = " + result);
        }

    }
}
