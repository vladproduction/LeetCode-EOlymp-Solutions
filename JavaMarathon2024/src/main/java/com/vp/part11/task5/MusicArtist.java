package com.vp.part11.task5;

/**
 * Created by vladproduction on 21-Mar-24
 */

public class MusicArtist {

    private String name;
    private int age;

    public MusicArtist(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return name +", "+ age;
    }
}
