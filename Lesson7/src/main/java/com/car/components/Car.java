package com.car.components;

import java.util.Scanner;

/**
 * Created by Егор on 24.10.2021.
 */
public class Car {
    private int mileage;
    private Engine engine;
    private Tank tank;
    private boolean flag;


    public Car(Engine engine, Tank tank) {
        this.engine = engine;
        this.tank = tank;
    }

    public void useCar() {
        Scanner scanner = new Scanner(System.in);
        int value;
        do {
            System.out.println("Для запуска двигателя нажмите 1, если вы хотите заглушить двигатель нажмите 2, для начала движения нажмите 3, " +
                    "для просмотра остатка топлива в баке нажмите 4, для просмотра пробега авто нажмите 5, для дозаправки топлива нажмите 6");
            while (!scanner.hasNextInt()) {
                System.out.println("Это не число!!!");
                scanner.next();
            }
            value = scanner.nextInt();
        }
        while (value < 1 || value > 6);
        if (value == 1) {
            carOn();
        } else if (value == 2) {
            carOff();
        } else if (value == 3) {
            drive();
        } else if (value == 4) {
            System.out.println(tank.getAmountOfFuelAtTheMoment());
            useCar();
        } else if (value == 5) {
            System.out.println(mileage);
            useCar();
        } else if (value == 6) {
            refuelingOfTank();
        }
    }

    private void drive() {
        if (flag) {
            System.out.println("Машина поехала");
            mileage += 100;
            tank.fuelConsumption();
            if (tank.getAmountOfFuelAtTheMoment() == 0) {
                System.out.println("Топливо закончилось, необходима дозаправка");
                carOff();
            }
        } else {
            System.out.println("Машина не может двигаться т.к. двигатель не заведен");
        }
        useCar();
    }

    private void carOn() {
        if (tank.getAmountOfFuelAtTheMoment() <= 0) {
            System.out.println("В баке нет топлива, машина не заведется");
        } else {
            engine.engineOn();
            flag = true;
        }
        useCar();
    }

    public void carOff() {
        if (!flag) {
            System.out.println("Нельзя заглушить двигатель т.к. он не заведен");
        } else {
            engine.engineOff();
            flag = false;
        }
        useCar();
    }

    private void refuelingOfTank() {
        tank.refueling();
        useCar();
    }

}
