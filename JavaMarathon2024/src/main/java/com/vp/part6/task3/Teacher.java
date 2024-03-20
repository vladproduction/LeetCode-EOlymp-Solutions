package com.vp.part6.task3;

import java.util.Random;

/**
 * Created by vladproduction on 20-Mar-24
 */

public class Teacher {

    private String name;
    private String subject;

    public Teacher(String name, String subject) {
        this.name = name;
        this.subject = subject;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", subject='" + subject + '\'' +
                '}';
    }

    public void rating(Student student){
        Random random = new Random();
        int valueRandom = random.nextInt(2, 6);

        String value = switchRandom(valueRandom);
        System.out.println("Teacher " + this.name.toUpperCase() + " rated student " + student.getName().toUpperCase()
        + " by subject " + this.subject + " with rating: "  + value.toUpperCase());
    }

    private static String switchRandom(int value){
        switch (value){
            case 2:
                return "two";
            case 3:
                return "three";
            case 4:
                return "four";
            case 5:
                return "five";
            default:
                throw new IllegalArgumentException();
        }
    }
}
