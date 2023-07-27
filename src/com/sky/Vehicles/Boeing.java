package com.sky.Vehicles;

public class Boeing extends Airplane{
    Boeing(){
        super();
    }

    public Boeing(int cost, String name, int wingspan){
        super(cost, name, wingspan);
    }

    @Override
    public String toString(){
        return  "Name: " + getName() + "Cost: " + getCost() + "Wingspan: " + getWingspan();
    }
}
