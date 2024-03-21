package com.vp.part12;

/**
 * Created by vladproduction on 21-Mar-24
 */

public class Main12 {
    public static void main(String[] args) {

        User user1 = new User("John");
        User user2 = new User("Bob");
        User user3 = new User("Pol");

        user1.sendMsg(user2, "Hello!");
        user1.sendMsg(user2, "How are you Bob?");

        user2.sendMsg(user1, "Hi John.");
        user2.sendMsg(user1, "I`m ok!");
        user2.sendMsg(user1, "And you?");

        user3.sendMsg(user1, "Hey John! My name is Pol.");
        user3.sendMsg(user1, "Do you remember me?");
        user3.sendMsg(user1, "We play football together last month.");

        user1.sendMsg(user3, "Oh Pol, sure I remember you!");
        user1.sendMsg(user3, "Nice to see you again.");
        user1.sendMsg(user3, "Would you like to play again tomorrow at 11 AM?");

        user3.sendMsg(user1, "Yep, I`ll. Keep contact!");

        System.out.println("user1 - user3");
        MessageDB.showDialog(user1, user3);

        System.out.println("---------------------------");
        System.out.println("user1 - user2");
        MessageDB.showDialog(user1, user2);




    }
}
