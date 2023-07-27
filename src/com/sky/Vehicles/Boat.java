package com.sky.Vehicles;

import com.sky.Vehicle;

public abstract class Boat extends Vehicle {
    private int size;
    Boat(){
        super();
    }

    Boat(int cost, String name, int size){
        super(cost, name);
        this.size =size;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
