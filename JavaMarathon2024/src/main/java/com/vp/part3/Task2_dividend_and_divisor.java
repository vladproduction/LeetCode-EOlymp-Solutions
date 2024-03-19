package com.vp.part3;

/**
 * Created by vladproduction on 19-Mar-24
 */

import java.util.Scanner;

/**while(true) loop till user enter '0' as a divisor*/
public class Task2_dividend_and_divisor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true){
            double a = scanner.nextDouble();
            double b = scanner.nextDouble();
            //1 2 --> 1 / 2 = 0.5
            if (b == 0){
                break;
            }
            System.out.println(a / b);

        }
    }
}
