package com.vp.part9.task1;

/**
 * Created by vladproduction on 21-Mar-24
 */

public class Human {

    private String name;

    public Human(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void printInfo(){
        System.out.println("Human by name " + name);
    }
}
