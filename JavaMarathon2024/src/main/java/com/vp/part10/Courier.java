package com.vp.part10;

/**
 * Created by vladproduction on 21-Mar-24
 */

public class Courier implements Worker {


    private int id;
    private double salary;
    private Warehouse warehouse;

    public Courier(int id, Warehouse warehouse) {
        this.id = id;
        this.warehouse = warehouse;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }


    @Override
    public void doWork() {
        salary += 100;
        warehouse.setBalance(warehouse.getBalance() + 1000);
    }

    @Override
    public void bonus() {
        if(warehouse.getBalance() > 1_000_000){
            salary *= 2;
        }
    }

    @Override
    public String toString() {
        return "Courier{" +
                "id=" + id +
                ", salary=" + salary +
                '}' + ";";
    }
}
