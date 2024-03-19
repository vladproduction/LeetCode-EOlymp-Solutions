package com.vp.part2;

/**
 * Created by vladproduction on 19-Mar-24
 */

import java.util.InputMismatchException;
import java.util.Scanner;

/**by scanner 'in' level of building,
 * if level is 1-4 'small building',
 * if level is 5-8 'middle building',
 * if level is 9 or more 'big building',
 * validate correct 'in'
 * by console we`re response info respectively */
public class Task1_Building_levels {
    public static void main(String[] args) {
//        solution1();
        solution2();
    }

    private static void solution2() {
        System.out.println("Enter floor:");
        Scanner scanner = new Scanner(System.in);
        int floorCount = scanner.nextInt();
        if(floorCount >=1 && floorCount <=4){
            System.out.println("small house");
        } else if (floorCount >=5 && floorCount <=8){
            System.out.println("middle house");
        } else if (floorCount >= 9) {
            System.out.println("big house");
        } else{
            System.out.println("Enter correct floor");
        }
    }

    private static void solution1() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter level of Building: ");
        int buildingLevel;

        try{
            buildingLevel = scanner.nextInt();
            if(buildingLevel < 1){
                throw new IllegalArgumentException("Level of the building can not be less than 1");
            }
        }catch (InputMismatchException e){
            System.out.println("Invalid input: Please enter a valid integer.");
            return;
        }catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
            return;
        }finally {
            scanner.close();
        }
        String classification;
        if(buildingLevel >= 1 && buildingLevel <= 4){
            classification = "small building";
        } else if (buildingLevel >= 5 && buildingLevel <= 8) {
            classification = "middle building";
        } else {
            classification = "big building";
        }
        System.out.println("This building is: " + classification + ".");

    }

}
