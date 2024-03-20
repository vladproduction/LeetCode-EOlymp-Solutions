package com.vp.part9.task1;

/**
 * Created by vladproduction on 21-Mar-24
 */

public class Teacher extends Human{

    private String subject;

    public Teacher(String name, String subject) {
        super(name);
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void printInfo(){
        super.printInfo();
        System.out.println("Teacher " + getName());
    }
}
