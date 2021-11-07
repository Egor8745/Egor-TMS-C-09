package com.service;

import com.model.Car;

/**
 * Created by Егор on 07.11.2021.
 */
public interface CarService {
    void movingCar(Car car);

    void startingCar(Car car);

    void stopCar(Car car);

    void refuelingOfTank(Car car);
}
