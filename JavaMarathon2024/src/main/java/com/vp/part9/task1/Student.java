package com.vp.part9.task1;

/**
 * Created by vladproduction on 21-Mar-24
 */

public class Student extends Human{

    private String groupName;

    public Student(String name, String groupName) {
        super(name);
        this.groupName = groupName;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public void printInfo(){
        super.printInfo();
        System.out.println("Student " + getName());
    }
}
