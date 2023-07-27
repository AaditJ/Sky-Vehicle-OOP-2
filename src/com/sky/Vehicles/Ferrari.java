package com.sky.Vehicles;

public class Ferrari extends Car{
    public Ferrari(){
        super();
    }

    public Ferrari(int cost, String name, int mph){
        super(cost,name,mph);
    }

    @Override
    public String toString(){
        return  "Name: " + getName() + "Cost: " + getCost() + "Max MPH: " + getMaxMph();
    }
}
