package com.vp.part14;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Created by vladproduction on 21-Mar-24
 */

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        File file = new File("shoes.csv");
        Scanner scanner = new Scanner(file);

        File fileOut = new File("result.txt");
        PrintWriter pw = new PrintWriter(fileOut);

        while (scanner.hasNextLine()){
            String [] arr = scanner.nextLine().split(";");
            if(Integer.parseInt(arr[3]) == 0){
                pw.println(arr[0] + ", " + arr[1] + ", " + arr[2] + ", " + arr[3]);
            }
        }
        pw.close();
        scanner.close();
    }
}
