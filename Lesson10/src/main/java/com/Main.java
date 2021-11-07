package com;

import com.model.Car;
import com.model.Engine;
import com.model.TankFuel;
import com.service.*;

import java.util.Scanner;

/**
 * Created by Егор on 07.11.2021.
 */
public class Main {
    public static void main(String[] args) {
        Car car = new Car(Car.Type.HB, new Engine("Дизель", 1.7), new TankFuel(50, 20), 100, false);
        EngineService engineService = new EngineServiceImpl();
        TankFuelService tankFuelService = new TankFuelServiceImpl();
        CarService service = new CarServiceImpl(tankFuelService, engineService);
        Scanner scanner = new Scanner(System.in);
        int value;
        do {
            do {
                System.out.println("Для запуска двигателя нажмите 1, если вы хотите заглушить двигатель нажмите 2, для начала движения нажмите 3, " +
                        "для просмотра остатка топлива в баке нажмите 4, для просмотра пробега авто нажмите 5, для дозаправки топлива нажмите 6, если хотите выйти из машины нажмите 7");
                while (!scanner.hasNextInt()) {
                    System.out.println("Это не число!");
                    scanner.next();
                }
                value = scanner.nextInt();
            } while (value < 1 || value > 7);
            if (value == 1) {
                service.startingCar(car);
            } else if (value == 2) {
                service.stopCar(car);
            } else if (value == 3) {
                service.movingCar(car);
            } else if (value == 4) {
                System.out.println(car.getTankFuel().getAmountOfFuel());
            } else if (value == 5) {
                System.out.println(car.getMileage());
            } else if (value == 6) {
                service.refuelingOfTank(car);
            } else if (value == 7) {
                break;
            }
        } while (value >= 1 || value <= 7);
    }
}
