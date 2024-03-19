package com.vp.part3;

/**
 * Created by vladproduction on 19-Mar-24
 */

import java.util.Scanner;

/**5 time iteration, dividend and divisor as scanner input,
 * if '0' as divisor we count iteration, but msg is: "/ by 0",
 * forbidden to use 'else' */
public class Task3_while_with_condition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int counter = 0;

        while (counter < 5){
            double a = scanner.nextDouble();
            double b = scanner.nextDouble();

            counter++;

            if(b == 0){
                System.out.println("/ by 0");
                continue;
            }

            System.out.println(a / b);
        }
    }
}
