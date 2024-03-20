package com.vp.part7.task2;

/**
 * Created by vladproduction on 20-Mar-24
 */

public class Player {

    private static final int MAX_STAMINA = 100;
    private static final int MIN_STAMINA = 0;
    private int stamina;
    private static int countPlayers;

    public Player(int stamina) {
        this.stamina = stamina;
        if(countPlayers < 6){
            countPlayers++;
        }
    }

    public void run(){
        if(stamina == 0){
            return;
        }
        stamina--;
        if(stamina == 0){
            countPlayers--;
        }
    }

    public static void info(){
        //this method static - because it attends to the game
        if(countPlayers < 6){
            System.out.println("Squad of the teams is not complete, we have place for " + (6 - countPlayers) + " player/s");
        }else {
            System.out.println("No place for players yet");
        }
    }
}
