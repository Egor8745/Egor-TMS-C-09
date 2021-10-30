package com.home.transport.landTransport;

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
        if (cargo <= liftingCapacity) {
            System.out.println("Грузовик загружен.");
        } else {
            System.out.println("Вам нужен грузовик побольше.");
        }
    }
}
