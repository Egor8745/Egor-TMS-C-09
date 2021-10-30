package com.home.transport.airTransport;

import lombok.experimental.SuperBuilder;

/**
 * Created by Егор on 28.10.2021.
 */
@SuperBuilder
public class Military extends Air {
    private boolean ejection;
    private int missilesOnBoard;

    public String toString() {
        return "Военный: " +
                "Мощность (в лошадиных силах) - " + getPower() +
                ", Максимальная скорость (км/ч) - " + getMaxSpeed() +
                ", Масса (тонн)- " + getWeight() +
                ", Марка - " + getBrand() +
                ", Размах крыльев (м) - " + getWingspan() +
                ", Минимальная длина взлётно-посадочной полосы для взлёта (м) - " + getMinRunwayength() +
                ", Наличие системы катапультирования - " + checkAvailability(ejection) +
                ", Кол-во ракет на борту - " + missilesOnBoard +
                ", Мощность (киловатт) - " + powerKilowatt(getPower());
    }

    public void attackMissiles() {
        if (missilesOnBoard > 0) {
            System.out.println("Ракета пошла...");
        } else {
            System.out.println("Боеприпасы отсутствуют.");
        }
    }

    public void ejectionSystem() {
        if (ejection) {
            System.out.println("Катапультирование прошло успешно.");
        } else {
            System.out.println("У вас нет такой системы.");
        }
    }
}
