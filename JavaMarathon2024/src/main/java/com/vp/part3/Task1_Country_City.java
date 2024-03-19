package com.vp.part3;

import java.util.Scanner;

/**
 * Created by vladproduction on 19-Mar-24
 */

public class Task1_Country_City {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true){
            String city = scanner.nextLine();
            if(city.equals("stop")){
                break;
            }
            switch (city){
                case "Liverpool":
                case "Manchester":
                case "London":
                    System.out.println("England");
                    break;
                case "Stockholm":
                case "Uppsala":
                case "Malme":
                    System.out.println("Sweden");
                    break;
                case "Rome":
                case "Napoli":
                case "Milan":
                    System.out.println("Italy");
                    break;
                case "Kyiv":
                case "Odessa":
                case "Lviv":
                    System.out.println("Ukraine");
                    break;
                default:
                    System.out.println("No data");
            }

        }

    }
}

