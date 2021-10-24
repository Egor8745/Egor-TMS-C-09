package com.car.drive;

import com.car.components.Car;
import com.car.components.Engine;
import com.car.components.Tank;

/**
 * Created by Егор on 24.10.2021.
 */
public class Main {
    public static void main(String[] args) {
        Car car = new Car(new Engine("Diesel", 1.7), new Tank(50, 15));
        car.useCar();
    }
}
