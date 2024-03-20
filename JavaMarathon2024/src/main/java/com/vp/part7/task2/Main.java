package com.vp.part7.task2;

/**
 * Created by vladproduction on 20-Mar-24
 */

public class Main {
    public static void main(String[] args) {

        Player player1 = new Player(94);
        Player player2 = new Player(91);
        Player player3 = new Player(100);

        Player.info();

        Player player4 = new Player(92);
        Player player5 = new Player(98);
        Player player6 = new Player(90);

        Player.info();

        Player player7 = new Player(100);

        Player.info();

        for (int i = 0; i < 92; i++) {
            player4.run();
        }

        Player.info();

    }
}
