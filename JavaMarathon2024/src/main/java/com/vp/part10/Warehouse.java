package com.vp.part10;

/**
 * Created by vladproduction on 21-Mar-24
 */

public class Warehouse {

    private int countOrder;
    private double balance;

    public Warehouse() {

    }

    public int getCountOrder() {
        return countOrder;
    }

    public void setCountOrder(int countOrder) {
        this.countOrder = countOrder;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Warehouse{" +
                "countOrder=" + countOrder +
                ", balance=" + balance +
                '}';
    }
}
