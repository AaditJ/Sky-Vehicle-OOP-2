package com.sky.Vehicles;

import com.sky.Vehicle;

public abstract class Airplane extends Vehicle {
    private int wingspan;
    Airplane(){
        super();
    }

    Airplane(int cost, String name, int wingspan){
        super(cost, name);
        this.wingspan = wingspan;
    }

    public int getWingspan() {
        return wingspan;
    }

    public void setWingspan(int wingspan) {
        this.wingspan = wingspan;
    }
}
