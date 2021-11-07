package com.service;

import com.model.Car;
import com.model.TankFuel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by Егор on 07.11.2021.
 */
@Setter
@Getter
@AllArgsConstructor
public class CarServiceImpl implements CarService {
    private TankFuelService tankService;
    private EngineService engineService;


    @Override
    public void movingCar(Car car) {
        if (car.isEngineStarted()) {
            System.out.println("Машина поехала");
            car.setMileage(car.getMileage() + 100);
            tankService.calculateFuelConsumption(car.getTankFuel());
            if (car.getTankFuel().getAmountOfFuel() == 0) {
                System.out.println("Топливо закончилось, необходима дозаправка");
                stopCar(car);
            }
        } else {
            System.out.println("Машина не может двигаться т.к. двигатель не заведен");
        }
    }

    @Override
    public void startingCar(Car car) {
        if (car.getTankFuel().getAmountOfFuel() > 0) {
            engineService.startEngine();
            car.setEngineStarted(true);
        } else {
            System.out.println("В баке нет топлива, машина не заведется");
        }
    }

    @Override
    public void stopCar(Car car) {
        if (car.isEngineStarted()) {
            engineService.stopEngine();
            car.setEngineStarted(false);
        } else {
            System.out.println("Нельзя заглушить двигатель т.к. он не заведен");
        }
    }

    @Override
    public void refuelingOfTank(Car car) {
        tankService.doRefueling(car.getTankFuel());
    }
}
