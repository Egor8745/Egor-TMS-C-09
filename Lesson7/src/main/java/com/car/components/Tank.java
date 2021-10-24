package com.car.components;

/**
 * Created by Егор on 24.10.2021.
 */
public class Tank {
    private int totalVolumeTank;
    private int amountOfFuelAtTheMoment;

    public int getAmountOfFuelAtTheMoment() {
        return amountOfFuelAtTheMoment;
    }

    public void fuelConsumption() {
        amountOfFuelAtTheMoment -= 5;
    }

    public void refueling() {
        amountOfFuelAtTheMoment = totalVolumeTank;
        System.out.println("Машина заправлена!");
    }

    public Tank(int totalVolumeTank, int amountOfFuelAtTheMoment) {
        this.totalVolumeTank = totalVolumeTank;
        this.amountOfFuelAtTheMoment = amountOfFuelAtTheMoment;
    }

    @Override
    public String toString() {
        return "Tank{" +
                "totalVolumeTank=" + totalVolumeTank +
                ", amountOfFuelAtTheMoment=" + amountOfFuelAtTheMoment +
                '}';
    }
}
