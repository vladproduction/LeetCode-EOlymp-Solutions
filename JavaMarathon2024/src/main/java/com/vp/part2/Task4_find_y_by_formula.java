package com.vp.part2;

/**
 * Created by vladproduction on 19-Mar-24
 */

import java.util.Scanner;

/**calculation 'y' by formulas depends on 'x' range*/
public class Task4_find_y_by_formula {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble();
        double y;
        if(x >= 5){
            y = (Math.pow(x, 2) - 10) / (x + 7);
        } else if (x > -3 && x < 5 ) {
            y = (x + 3) * (Math.pow(x, 2) - 2);
        } else {
            y = 420;
        }
        System.out.println(y);
        scanner.close();
    }

}
