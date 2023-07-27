package com.sky;

public abstract class Vehicle {
    private int cost;
    private String name;
    protected Vehicle(){
        cost = 0;
        name = "";
    }
    protected Vehicle(int cost, String name){
        this.cost = cost;
        this.name = name;
    }

    public int getCost(){
        return this.cost;
    }
    public String getName(){
        return this.name;
    }

    public void setCost(int cost){
        this.cost = cost;
    }

    public void setName(String name){
        this.name = name;
    }

    @Override
    public boolean equals(Object o){
        if (o == null){ return false;}
        if (this == o){return true;}
        return false;
    }
}
