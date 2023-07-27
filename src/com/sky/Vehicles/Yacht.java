package com.sky.Vehicles;

public class Yacht extends Boat {
    Yacht(){
        super();
    }

    public Yacht(int cost, String name, int size){
        super(cost, name, size);
    }

    @Override
    public String toString(){
        return  "Name: " + getName() + "Cost: " + getCost() + "Size: " + getSize();
    }
}
