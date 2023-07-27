package com.sky.Vehicles;

import com.sky.Vehicle;

public abstract class Car extends Vehicle {
    private int maxMph;
    Car(){
        super();
    }
    Car(int cost, String name, int mph){
        super(cost, name);
        this.maxMph = mph;
    }

    Car(int mph){
        this(0, "", mph);
    }

    public int getMaxMph(){
        return this.maxMph;
    }

    public void setMaxMph(int mph){
        this.maxMph = mph;
    }

}
