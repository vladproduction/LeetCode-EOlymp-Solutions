package com.vp.part10;

/**
 * Created by vladproduction on 21-Mar-24
 */

public class Main10_Internet_Shop {
    public static void main(String[] args) {

        System.out.println("Just before start: ");
        Warehouse warehouse = new Warehouse();
        Picker picker = new Picker(1, warehouse);
        Courier courier = new Courier(1, warehouse);
        System.out.println(warehouse + "; " + picker + "; " + courier);

        System.out.println("---do some work:---");
        picker.doWork();
        courier.doWork();
        System.out.println(warehouse + "; " + picker + "; " + courier);

        System.out.println("---------check bonus after first order----------");
        picker.bonus();
        courier.bonus();
        System.out.println(warehouse + "; " + picker + "; " + courier);

        System.out.println("=====imitate work (1500 orders)========");

        for (int i = 0; i < 1500; i++) {
            picker.doWork();
            courier.doWork();
        }
        System.out.println(warehouse + "; " + picker + "; " + courier);
        //Warehouse{countOrder=1501, balance=1501000.0}; Picker{id=1, salary=120080.0}; Courier{id=1, salary=150100.0};

        System.out.println("---> now bonus in play!!! --->");
        picker.bonus();
        courier.bonus();
        System.out.println(warehouse + "; " + picker + "; " + courier);
        //Warehouse{countOrder=1501, balance=1501000.0}; Picker{id=1, salary=360240.0}; Courier{id=1, salary=300200.0};






    }
}
