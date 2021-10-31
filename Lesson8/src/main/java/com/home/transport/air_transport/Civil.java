package com.home.transport.air_transport;


import lombok.experimental.SuperBuilder;

/**
 * Created by Егор on 30.10.2021.
 */
@SuperBuilder
public class Civil extends Air {
    private int passengersNumber;
    private boolean businessClass;

    public String toString() {
        return "Гражданский : " +
                "Мощность (в лошадиных силах) - " + getPower() +
                ", Максимальная скорость (км/ч) - " + getMaxSpeed() +
                ", Масса (тонн)- " + getWeight() +
                ", Марка - " + getBrand() +
                ", Размах крыльев (м) - " + getWingspan() +
                ", Минимальная длина взлётно-посадочной полосы для взлёта (м) - " + getMinRunwayength() +
                ", Количество пассажиров - " + passengersNumber +
                ", Наличие бизнес класса - " + checkAvailability(businessClass) +
                ", Мощность (киловатт) - " + powerKilowatt(getPower());
    }

    public void passengerCapacity(int passengers) {
        System.out.println(passengersNumber >= passengers ? "Самолет загружен." : "Нужен самолет побольше.");
    }
}
