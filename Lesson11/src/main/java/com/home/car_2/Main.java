package com.home.car_2;

import com.home.car_2.utils.CarIsNotStart;

/**
 * Created by Егор on 11.11.2021.
 */
public class Main {
    public static void main(String[] args) {
        Car car = new Car("BMW", 300, 10000);
        Car car1 = new Car("бмв", 220, 23000);
        Car car2 = new Car("мерс", 220, 23000);
        Car car3 = new Car("жигули", 120, 1500);
        Car car4 = new Car();
        car4.setPrice(-5);
        Car[] start = {car, car1, car2, car3, car4};

        try {
            method(start);
        } catch (Exception exception) {
            System.out.println(exception);
            System.out.println(exception.getCause() != null ? exception.getCause().getMessage() : "");
        }
    }

    static void method(Car[] start) throws Exception {
        for (Car startable : start) {
            try {
                startable.startCar();
            } catch (CarIsNotStart exception) {
                System.out.println(exception.getMessage());
            }
        }
    }
}
