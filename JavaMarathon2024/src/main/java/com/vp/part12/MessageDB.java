package com.vp.part12;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by vladproduction on 21-Mar-24
 */

public class MessageDB {

    private static List<Message> messages = new ArrayList<>();

    public static void addNewMsg(User sender, User receiver, String textMsg){
        messages.add(new Message(sender, receiver, textMsg));
    }

    public static void showDialog(User u1, User u2){
        for (Message message : messages) {
            if(message.getSender() == u1 && message.getReceiver() == u2
                    || message.getSender() == u2 && message.getReceiver() == u1){
                System.out.println(message.getSender() + " : " + message.getTextMsg());
            }
        }

    }
}
