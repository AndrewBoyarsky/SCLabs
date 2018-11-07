/*
 * Copyright © 2018 Apollo Foundation
 */

package com.hesky.labs.car;

public class Car implements Driver, Owner, Policeman{
    private int number;
    private long price;

    public Car(int number, long price) {
        this.number = number;
        this.price = price;
    }

    public void drive() {
        System.out.println("Drive");
    }

    @Override
    public long sell() {
        System.out.println("Sell");
        return price;
    }

    public void setId(int id) {
        this.number = id;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public long getId() {
        System.out.println("Get id");
        return number;
    }
}
