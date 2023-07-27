package com.sky;

import com.sky.Vehicles.Airplane;
import com.sky.Vehicles.Car;
import com.sky.Vehicles.Ferrari;

import java.util.ArrayList;

public class Garage {
    private Vehicle[] vehiclesArr;
    private ArrayList<Vehicle> vehicles;
    private int spaceLeft = 5;
    public Garage(){
        vehicles = new ArrayList<>();
    }

    public Garage(ArrayList<Vehicle> vehicles){
        this.vehiclesArr = new Vehicle[5];
        this.vehicles = new ArrayList<>();
        this.vehicles.addAll(vehicles);
    }

    public int StoreVehicle(Vehicle v){
        if (v instanceof Airplane){
            System.out.println("We can currently not store any airplanes");
            return 0;
        }
        else {
            vehicles.add(v);
            System.out.println("Stored vehicle!");
            int openSlot = -1;
            for(int i =0; i < vehiclesArr.length; i++){
                if(vehiclesArr[i] == null){
                    openSlot = i;
                    break;
                }
            }
            if(openSlot == -1){
                System.out.println("There are no more slots left!");
                return 0;
            }else{
                vehiclesArr[openSlot] = v;
            }

        }
        return 1;
    }

    public boolean checkDuplicate(){
        for(int i =0; i < vehiclesArr.length; i++){
            for (int j =i+1; j< vehiclesArr.length; j++){
                if (vehiclesArr[i].equals(vehiclesArr[j])){
                    System.out.println("Duplicate found!");
                    return true;
                }
            }
        }
        return false;
    }

    public int totalCost(){
        int total =0;
        for (int i =0; i < vehicles.size(); i ++){
            total += vehicles.get(i).getCost();
        }

        return total;
    }

}
