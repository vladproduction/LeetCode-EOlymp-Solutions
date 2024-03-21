package com.vp.part10;

/**
 * Created by vladproduction on 21-Mar-24
 */

public class Picker implements Worker{

    private int id;
    private double salary;

    private Warehouse warehouse;

    public Picker(int id, Warehouse warehouse) {
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
        salary += 80;
        warehouse.setCountOrder(warehouse.getCountOrder() + 1);
    }

    @Override
    public void bonus() {
        if(warehouse.getCountOrder() > 1500){
            salary *= 3;
        }
    }

    @Override
    public String toString() {
        return "Picker{" +
                "id=" + id +
                ", salary=" + salary + "}";
    }
}
