package com.vp.part11.task1;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by vladproduction on 21-Mar-24
 */

public class List_add_remove {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("one");
        list.add("two");
        list.add("three");
        list.add("four");
        list.add("five");

        System.out.println(list);

        list.add(3, "middle added".toUpperCase());
        System.out.println(list);

        //removing:
        list.remove(0);
        System.out.println(list);
    }
}
