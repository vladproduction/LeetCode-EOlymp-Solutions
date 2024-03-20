package com.vp.part8;

/**
 * Created by vladproduction on 20-Mar-24
 */
/**why we override toString()*/
public class Task2_toString {
    public static void main(String[] args) {
        Airplane airplane = new Airplane("Boeing", 2024, 89, 40000);
        System.out.println(airplane);
        //before not overriding toString() --> com.vp.part8.Airplane@1b28cdfa
        //after
        //Airplane{production='Boeing', yearProduction=2024, length=89.0, weight=40000.0, tankValue=0.0}

    }


}
