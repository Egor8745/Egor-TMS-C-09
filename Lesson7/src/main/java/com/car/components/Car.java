package com.car.components;

/**
 * Created by Егор on 24.10.2021.
 */
public class Car {
    private int mileage;
    private Engine engine;
    private Tank tank;
    private boolean engineStartOrStop;

    public Tank getTank() {
        return tank;
    }

    public int getMileage() {
        return mileage;
    }

    public Car(Engine engine, Tank tank) {
        this.engine = engine;
        this.tank = tank;
    }

    public void movingCar() {
        if (engineStartOrStop) {
            System.out.println("Машина поехала");
            mileage += 100;
            tank.calculateFuelConsumption();
            if (tank.getAmountOfFuel() == 0) {
                System.out.println("Топливо закончилось, необходима дозаправка");
                stopCar();
            }
        } else {
            System.out.println("Машина не может двигаться т.к. двигатель не заведен");
        }
    }

    public void startingCar() {
        if (tank.getAmountOfFuel() > 0) {
            engine.startEngine();
            engineStartOrStop = true;
        } else {
            System.out.println("В баке нет топлива, машина не заведется");
        }
    }

    public void stopCar() {
        if (engineStartOrStop) {
            engine.stopEngine();
            engineStartOrStop = false;
        } else {
            System.out.println("Нельзя заглушить двигатель т.к. он не заведен");
        }
    }

    public void refuelingOfTank() {
        tank.doRefueling();
    }
}
