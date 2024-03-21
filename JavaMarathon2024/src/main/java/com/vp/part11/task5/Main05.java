package com.vp.part11.task5;



import java.util.ArrayList;
import java.util.List;

/**
 * Created by vladproduction on 21-Mar-24
 */

public class Main05 {
    public static void main(String[] args) {

        List<MusicArtist> members1 = new ArrayList<>();
        members1.add(new MusicArtist("1-member1", 20));
        members1.add(new MusicArtist("1-member2", 21));
        members1.add(new MusicArtist("1-member3", 22));

        MusicBand band1 = new MusicBand("band1", 2001, members1);

        List<MusicArtist> members2 = new ArrayList<>();
        members2.add(new MusicArtist("2-member1", 31));
        members2.add(new MusicArtist("2-member2", 32));
        members2.add(new MusicArtist("2-member3", 33));

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
