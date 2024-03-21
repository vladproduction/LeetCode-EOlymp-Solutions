package com.vp.part13.task3;

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

        List<Person> people = parsFileToObjectList();
        System.out.println(people);

    }

    private static List<Person> parsFileToObjectList() {

        File file = new File("people.txt");
        List<Person> people = new ArrayList<>();

        try {
            Scanner scanner = new Scanner(file);

            while (scanner.hasNextLine()){
                String line = scanner.nextLine();

                String[] person = line.split(" ");
                if(Integer.parseInt(person[1]) < 0){
                    throw new IllegalArgumentException();
                }
                Person currentPerson = new Person(person[0], Integer.parseInt(person[1]));
                people.add(currentPerson);
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
