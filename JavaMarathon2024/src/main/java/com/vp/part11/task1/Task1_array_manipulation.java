package com.vp.part11.task1;

/**
 * Created by vladproduction on 21-Mar-24
 */

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**array of strings, add 5 objects, print it,
 * add in a middle 1 more object, remove the first one, print again*/
public class Task1_array_manipulation {
    public static void main(String[] args) {
        List<Auto> autoList = new ArrayList<>();
        Auto auto1 = new Auto("one");
        Auto auto2 = new Auto("two");
        Auto auto3 = new Auto("three");
        Auto auto4 = new Auto("four");
        Auto auto5 = new Auto("five");
        autoList.add(auto1);
        autoList.add(auto2);
        autoList.add(auto3);
        autoList.add(auto4);
        autoList.add(auto5);
        for (int i = 0; i < autoList.size(); i++) {
            System.out.print(autoList.get(i));
        }
        System.out.println();

        //add in a middle:
        autoList.add(3, new Auto("middle added".toUpperCase()));
        for (Auto auto : autoList) {
            System.out.print(auto);
        }
        System.out.println();

        // remove first element without using any loop:
        autoList.remove(0);
        System.out.println(autoList);


        /////////////////////removing through loops:////////////////////////////////
        /** 1) remove first element (ConcurrentModificationException):
        concurrentModificationException(autoList);*/

        /** 2) way to remove by index-based loop:
        index_based_loop(autoList);*/


        /** 3) way to use  iterator with remove():
        use_iterator(autoList);*/

    }

    private static void concurrentModificationException(List<Auto> autoList){
        for (Auto auto : autoList) {
            if(auto.equals(autoList.get(0))){
                autoList.remove(auto);
            }
            System.out.print(auto);
        }
        System.out.println();
    }

    private static void index_based_loop(List<Auto> autoList) {
        for (int i = 0; i < autoList.size(); i++) {
            Auto auto = autoList.get(i);
            if (auto.equals(autoList.get(0))) {
                autoList.remove(i);
            }
            System.out.print(auto);
        }
        System.out.println();
    }

    private static void use_iterator(List<Auto> autoList){
        Iterator<Auto> it = autoList.iterator();
        while (it.hasNext()) {
            Auto auto = it.next();
            if (auto.equals(autoList.get(0))) {
                it.remove();
            }
            System.out.print(auto);
        }
        System.out.println();
    }
}

class Auto {

    private String model;

    public Auto(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Auto:" + model + "; ";
    }
}
