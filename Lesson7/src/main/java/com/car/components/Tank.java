package com.car.components;

/**
 * Created by Егор on 24.10.2021.
 */
public class Tank {
    private int totalVolume;
    private int amountOfFuel;

    public Tank(int totalVolumeTank, int amountOfFuelAtTheMoment) {
        this.totalVolume = totalVolumeTank;
        this.amountOfFuel = amountOfFuelAtTheMoment;
    }

    public int getAmountOfFuel() {
        return amountOfFuel;
    }

    public void calculateFuelConsumption() {
        amountOfFuel -= 5;
    }

    public void doRefueling() {
        amountOfFuel = totalVolume;
        System.out.println("Машина заправлена!");
    }

    @Override
    public String toString() {
        return "Tank{" +
                "totalVolumeTank=" + totalVolume +
                ", amountOfFuelAtTheMoment=" + amountOfFuel +
                '}';
    }
}
