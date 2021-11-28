package com.home.streams.Task4Car;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

/**
 * Created by Егор on 28.11.2021.
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Car implements Serializable {

    private String brand;
    private int maxSpeed;
    private int price;

    @Override
    public String toString() {
        return "Автомобиль " +
                "марки " + brand + ". " +
                "Максимальная скорость: " + maxSpeed + " км/ч. " +
                "Цена " + price + " $.";
    }
}
