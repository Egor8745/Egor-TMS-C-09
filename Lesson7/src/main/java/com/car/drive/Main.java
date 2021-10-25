package com.car.drive;

import com.car.components.Car;
import com.car.components.Engine;
import com.car.components.Tank;

import java.util.Scanner;

/**
 * Created by Егор on 24.10.2021.
 */
public class Main {
    public static void main(String[] args) {
        Car car = new Car(new Engine("Diesel", 1.7), new Tank(50, 15));
        Scanner scanner = new Scanner(System.in);
        int value;
        do {
            do {
                System.out.println("Для запуска двигателя нажмите 1, если вы хотите заглушить двигатель нажмите 2, для начала движения нажмите 3, " +
                        "для просмотра остатка топлива в баке нажмите 4, для просмотра пробега авто нажмите 5, для дозаправки топлива нажмите 6, если хотите выйти из машины нажмите 7");
                while (!scanner.hasNextInt()) {
                    System.out.println("Это не число!!!");
                    scanner.next();
                }
                value = scanner.nextInt();
            } while (value < 1 || value > 7);
            if (value == 1) {
                car.startingCar();
            } else if (value == 2) {
                car.stopCar();
            } else if (value == 3) {
                car.movingCar();
            } else if (value == 4) {
                System.out.println(car.getTank().getAmountOfFuel());
            } else if (value == 5) {
                System.out.println(car.getMileage());
            } else if (value == 6) {
                car.refuelingOfTank();
            } else if (value == 7) {
                break;
            }
        } while (value >= 1 || value <= 7);
    }
}

