package com.vp.part6.task3;

/**
 * Created by vladproduction on 20-Mar-24
 */

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Bob Stone");
        Teacher teacher = new Teacher("John Dow", "Java");
        teacher.rating(student);
    }
}
