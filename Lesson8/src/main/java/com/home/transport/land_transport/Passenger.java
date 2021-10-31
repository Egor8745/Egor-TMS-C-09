package com.home.transport.land_transport;

import lombok.experimental.SuperBuilder;

/**
 * Created by Егор on 28.10.2021.
 */
@SuperBuilder
public class Passenger extends Land {
    private String bodyType;
    private int passengersNumber;

    @Override
    public String toString() {
        return "Легковой: " +
                "Мощность (в лошадиных силах) - " + getPower() +
                ", Максимальная скорость (км/ч) - " + getMaxSpeed() +
                ", Масса (тонн)- " + getWeight() +
                ", Марка - " + getBrand() +
                ", Количество колес - " + getNumberWheels() +
                ", Расход топлива (л/100км) - " + getConsumptionFuel() +
                ", Тип кузова - " + bodyType +
                ", Количество пассажиров - " + passengersNumber +
                ", Мощность (киловатт) - " + powerKilowatt(getPower());
    }

    public void calculationRoute(int time) {
        double rote = getMaxSpeed() * time;
        System.out.println("За время " + time + " ч, автомобиль " + getBrand() + " двигаясь с максимальной скоростью " + getMaxSpeed() +
                " км/ч проедет " + rote + " км " + " и израсходует " + calculationFuel(rote) + " литров топлива.");

    }

    private double calculationFuel(double rote) {
        return (rote / 100) * getConsumptionFuel();
    }
}
