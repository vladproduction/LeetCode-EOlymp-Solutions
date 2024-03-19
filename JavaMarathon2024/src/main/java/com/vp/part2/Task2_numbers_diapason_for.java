package com.vp.part2;

/**
 * Created by vladproduction on 19-Mar-24
 */

import java.util.Scanner;

/**2 numbers by scanner as diapason (int a, int b),
 * return all numbers between in condition:
 * divisible by 5 without a remainder and not divisible by 10 without a remainder,
 * a and b exclude of diapason*/
public class Task2_numbers_diapason_for {
    public static void main(String[] args) {

//        diapason_solution1();
        diapason_solution2();
    }

    private static void diapason_solution2() {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        for (int i = a + 1; i < b; i++) {
             if(i % 5 == 0 && i % 10 != 0){
                 System.out.print(i + " ");
             }
        }
        System.out.println();
    }

    private static void diapason_solution1() { //7, 78 --> {15 25 35 45 55 65 75 }
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number (a): ");
        int a = scanner.nextInt();
        System.out.println("Enter first number (b): ");
        int b = scanner.nextInt();
        scanner.close();
        //is a < b ?
        if(a > b){
            int temp = a;
            a = b;
            b = temp;
        }
        System.out.println("Numbers between " + a + " and " + b + " (excluding " + a + " and " + b + ") divisible by 5 but not by 10:");
        for (int i = a + 1; i < b; i++) {
             if(i % 5 == 0 && i % 10 !=0){
                 System.out.print(i + " ");
             }
        }
        System.out.println();
    }



}
