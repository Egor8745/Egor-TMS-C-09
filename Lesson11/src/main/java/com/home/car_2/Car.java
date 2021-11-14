package com.home.car_2;

import com.home.car_2.utils.CarIsNotStart;
import com.home.car_2.utils.CarStartService;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Random;

/**
 * Created by Егор on 09.11.2021.
 */
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Car implements CarStartService {
    private String brand;
    private int speed;
    private int price;

    @Override
    public void startCar() throws Exception {
        Random random = new Random();
        int nextInt = random.nextInt(21);
        if (brand != null || speed != 0 || price != 0) {
            if (price < 0 || speed < 0) {
                throw new Exception("данные не корректные price or speed <0");
            }
            if (nextInt % 2 == 0) {
                System.out.println("Машина " + brand + " завелась!");
            } else {
                throw new CarIsNotStart("Машина " + brand + " не завелась!");
            }
        } else {
            throw new IllegalArgumentException("данные не корректные");
        }
    }
}
