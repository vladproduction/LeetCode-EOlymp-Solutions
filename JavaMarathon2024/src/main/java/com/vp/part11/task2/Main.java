package com.vp.part11.task2;

/**
 * Created by vladproduction on 21-Mar-24
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**create array, fill up even numbs in range (0 - 30 and 300 - 350), print*/
public class Main {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i <= 30; i++) {
            if(i % 2 == 0){
                list.add(i);
            }
        }

        for (int i = 300; i <= 350; i++) {
            if(i % 2 == 0){
                list.add(i);
            }
        }

        System.out.println(list);


    }
}
