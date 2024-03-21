package com.vp.part12;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by vladproduction on 21-Mar-24
 */

public class User {

    private String userName;
    private List<User> subscription;

    public User(String userName) {
        this.userName = userName;
        this.subscription = new ArrayList<>();
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public List<User> getSubscription() {
        return subscription;
    }

    public void setSubscription(List<User> subscription) {
        this.subscription = subscription;
    }

    public void subscribe(User user){
        this.subscription.add(user);
    }

    private boolean isSubscribe(User user){
        for (User current : subscription) {
            if(current.getUserName().equals(user.getUserName())){
                return true;
            }
        }
        return false;
    }

    //subscribed each others
    private boolean isFriend(User user){
        return this.isSubscribe(user) && user.isSubscribe(this);
    }

    //send msg
    public void sendMsg(User user, String text){
        MessageDB.addNewMsg(this, user, text);
    }

    @Override
    public String toString() {
        return userName;
    }
}
