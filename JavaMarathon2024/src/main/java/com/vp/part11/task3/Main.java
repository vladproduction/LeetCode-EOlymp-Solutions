package com.vp.part11.task3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * Created by vladproduction on 21-Mar-24
 */

public class Main {
    public static void main(String[] args) {

        List<MusicBand> bandList = new ArrayList<>();
        bandList.add(new MusicBand("The Beatles", 1960));
        bandList.add(new MusicBand("The Rolling Stones", 1962));
        bandList.add(new MusicBand("The Who", 1964));
        bandList.add(new MusicBand("Bob Dylan", 1960));
        bandList.add(new MusicBand("The Beach Boys", 1961));
        bandList.add(new MusicBand("Queen", 1970));
        bandList.add(new MusicBand("Led Zeppelin", 1968));
        bandList.add(new MusicBand("Nirvana", 1987));
        bandList.add(new MusicBand("The Eagles", 1971));
        bandList.add(new MusicBand("U2", 1976));

        System.out.println(bandList);

        //shuffle our list
        Collections.shuffle(bandList);
        System.out.println(bandList);

        //copy only founded after 1970:
        List<MusicBand> musicBands_after_1970 = new ArrayList<>();
        for (MusicBand band : bandList) {
            if(band.getYear() > 1970){
                musicBands_after_1970.add(band);
            }
        }
        System.out.println("Founded after 1970:");
        System.out.println(musicBands_after_1970);



    }
}
