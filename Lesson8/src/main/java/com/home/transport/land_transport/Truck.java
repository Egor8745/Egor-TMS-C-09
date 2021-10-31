package com.home.transport.land_transport;

import lombok.experimental.SuperBuilder;

/**
 * Created by Егор on 28.10.2021.
 */
@SuperBuilder
public class Truck extends Land {
    private int liftingCapacity;

    public String toString() {
        return "Грузовой: " +
                "Мощность (в лошадиных силах) - " + getPower() +
                ", Максимальная скорость (км/ч) - " + getMaxSpeed() +
                ", Масса (тонн)- " + getWeight() +
                ", Марка - " + getBrand() +
                ", Количество колес - " + getNumberWheels() +
                ", Расход топлива (л/100км) - " + getConsumptionFuel() +
                ", Грузоподъёмность(т) - " + liftingCapacity +
                ", Мощность (киловатт) - " + powerKilowatt(getPower());
    }

    public void capacityTruck(int cargo) {
        System.out.println(liftingCapacity <= cargo ? "Грузовик загружен." : "Вам нужен грузовик побольше.");
    }
}
