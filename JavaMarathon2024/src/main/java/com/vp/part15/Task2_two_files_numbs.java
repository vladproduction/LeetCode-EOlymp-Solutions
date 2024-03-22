package com.vp.part15;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;

/**
 * Created by vladproduction on 22-Mar-24
 */

public class Task2_two_files_numbs {
    public static void main(String[] args) throws FileNotFoundException {

        Random random = new Random();

        File file1 = new File("file1.txt");
        PrintWriter pw1 = new PrintWriter(file1);
        for (int i = 0; i < 1000; i++) {
            pw1.println(random.nextInt(100));
        }
        pw1.close();

        Scanner scanner = new Scanner(file1);
        File file2 = new File("file2.txt");
        PrintWriter pw2 = new PrintWriter(file2);
        int counter = 0;
        int sum = 0;

        while (scanner.hasNextLine()){
            sum += Integer.parseInt(scanner.nextLine());
            counter++;
            if(counter == 20){
                pw2.println(sum / 20.0);

                counter = 0;
                sum = 0;
            }
        }
        pw2.close();

        Scanner scanner2 = new Scanner(file2);
        double res = 0.0;
        while (scanner2.hasNextLine()){
            res += Double.parseDouble(scanner2.nextLine());
        }
        System.out.println((int)res);


    }
}
