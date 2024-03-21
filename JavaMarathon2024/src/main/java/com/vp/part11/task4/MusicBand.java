package com.vp.part11.task4;

import java.util.List;

/**
 * Created by vladproduction on 21-Mar-24
 */

public class MusicBand {

    private String name;
    private int year;
    private List<String> members;

    public MusicBand(String name, int year, List<String> members) {
        this.name = name;
        this.year = year;
        this.members = members;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public List<String> getMembers() {
        return members;
    }

    public void setMembers(List<String> members) {
        this.members = members;
    }

    //or static - for class
    public static void transferMembers(MusicBand a, MusicBand b){
        for (String member : a.getMembers()) {
            b.getMembers().add(member);
        }
        a.getMembers().clear();
    }

    //or not static - for object of class
    public void transfer(MusicBand b){
        for (String member : this.members) {
            b.getMembers().add(member);
        }
        this.members.clear();
    }

    //print info about group:
    public void printMembers(){
        System.out.println(this.members);
    }

    @Override
    public String toString() {
        return name +", year=" + year;
    }
}
