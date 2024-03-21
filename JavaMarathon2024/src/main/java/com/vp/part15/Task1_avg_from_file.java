package com.vp.part15;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Created by vladproduction on 21-Mar-24
 */

public class Task1_avg_from_file {
    public static void main(String[] args) {

        File file = new File("input.txt");
        try {
            Scanner scanner = new Scanner(file);
            String line = scanner.nextLine();
            String[] numbs = line.split(" ");
            int sum = 0;
            for (String numb : numbs) {
                sum += Integer.parseInt(numb);
            }
            double resAvg = sum / (double)numbs.length;
            System.out.printf(resAvg + " --> %.3f", resAvg);


        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

    }
}
