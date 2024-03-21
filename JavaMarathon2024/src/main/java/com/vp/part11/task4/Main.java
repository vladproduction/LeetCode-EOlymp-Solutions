package com.vp.part11.task4;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by vladproduction on 21-Mar-24
 */

public class Main {
    public static void main(String[] args) {

        List<String> members1 = new ArrayList<>();
        members1.add("1-member1");
        members1.add("1-member2");
        members1.add("1-member3");

        MusicBand band1 = new MusicBand("band1", 2001, members1);

        List<String> members2 = new ArrayList<>();
        members2.add("2-member1");
        members2.add("2-member2");
        members2.add("2-member3");

        MusicBand band2 = new MusicBand("band2", 2002, members2);

        band1.printMembers();
        band2.printMembers();

        System.out.println("------transfer - static---------");
        //check how work transfer
        MusicBand.transferMembers(band1, band2);

        band1.printMembers();
        band2.printMembers();
    }
}
