package com.vp.part9.task2;

/**
 * Created by vladproduction on 21-Mar-24
 */

public class Main02Figure {
    public static void main(String[] args) {

        Figure [] figures = {
                new Circle("Red", 2),
                new Circle("Blue", 3),
                new Circle("Green", 4),
                new Rectangle("Red", 2.5, 2.5),
                new Rectangle("Blue", 3.5, 2.5),
                new Rectangle("Green", 4.5, 2.5),
                new Triangle("Red", 2.5, 3.5, 4.5),
                new Triangle("Blue", 2.5, 3.5, 4.5),
                new Triangle("Green", 2.5, 3.5, 4.5)
        };

        double redPerimeters = redPerimeters(figures);
        double redAreas = redAreas(figures);
        System.out.println("redPerimeters = " + redPerimeters);
        System.out.println("redAreas = " + redAreas);
    }

    public static double redPerimeters(Figure [] figures){
        double sum = 0;
        for (Figure figure : figures) {
            if(figure.getColor().equals("Red")){
                sum += figure.perimeter();
            }
        }
        return sum;
    }

    public static double redAreas(Figure [] figures){
        double sum = 0;
        for (Figure figure : figures) {
            if(figure.getColor().equals("Red")){
                sum += figure.area();
            }
        }
        return sum;
    }
}
