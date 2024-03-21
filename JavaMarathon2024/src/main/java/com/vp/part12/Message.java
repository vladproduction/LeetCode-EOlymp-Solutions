package com.vp.part12;

import java.util.Date;

/**
 * Created by vladproduction on 21-Mar-24
 */

public class Message {

    private User sender;
    private User receiver;
    private String textMsg;
    private Date date;

    public Message(User sender, User receiver, String textMsg) {
        this.sender = sender;
        this.receiver = receiver;
        this.textMsg = textMsg;
        this.date = new Date();
    }

    public User getSender() {
        return sender;
    }

    public void setSender(User sender) {
        this.sender = sender;
    }

    public User getReceiver() {
        return receiver;
    }

    public void setReceiver(User receiver) {
        this.receiver = receiver;
    }

    public String getTextMsg() {
        return textMsg;
    }

    public void setTextMsg(String textMsg) {
        this.textMsg = textMsg;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "FROM: " + this.sender + "\n" + "TO: " + receiver + "\n" + "ON: " + date + "\n" + "MSG: " + textMsg + "\n";
    }
}
