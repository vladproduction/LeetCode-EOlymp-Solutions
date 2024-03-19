package com.vp.part2;

/**
 * Created by vladproduction on 19-Mar-24
 */

import java.util.Scanner;

/**2 numbers by scanner as diapason (int a, int b),
 * return all numbers between in condition:
 * divisible by 5 without a remainder and not divisible by 10 without a remainder,
 * a and b exclude of diapason*/
public class Task3_numbers_diapason_while {
    public static void main(String[] args) {

        diapason_while();
    }

    private static void diapason_while() {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int t = a + 1;
        while (t < b){
            if(t % 5 == 0 && t % 10 != 0){
                System.out.print(t + " ");
            }
            t++;
        }
        System.out.println();
    }

}
