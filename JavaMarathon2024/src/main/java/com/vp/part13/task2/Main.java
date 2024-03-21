package com.vp.part13.task2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by vladproduction on 21-Mar-24
 */

public class Main {
    public static void main(String[] args) {
        List<String> list = parsFileToStringList();
        System.out.println(list);
    }

    private static List<String> parsFileToStringList() {
        File file = new File("people.txt");
        List<String> people = new ArrayList<>();

        try {
            Scanner scanner = new Scanner(file);

            while (scanner.hasNextLine()){
                String line = scanner.nextLine();

                String[] person = line.split(" ");
                if(Integer.parseInt(person[1]) < 0){
                    throw new IllegalArgumentException();
                }
                people.add(line);
            }
            return people;

        } catch (FileNotFoundException e) {
            System.out.println("FileNotFound");
        } catch (IllegalArgumentException e){
            System.out.println("Incorrect data");
        }
        return null;
    }

}
