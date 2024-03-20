package com.vp.part9.task1;

/**
 * Created by vladproduction on 20-Mar-24
 */

public class Main {
    public static void main(String[] args) {

        Student student = new Student("Bob", "505");
        Teacher teacher = new Teacher("John Dow", "Computer Science");

        System.out.println(student.getGroupName());
        System.out.println(teacher.getSubject());

        student.printInfo();
        teacher.printInfo();

        System.out.println(student.getName());
        System.out.println(teacher.getName());

    }
}
