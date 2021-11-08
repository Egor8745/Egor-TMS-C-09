package com.model;

import com.service.CarService;
import com.service.CarServiceImpl;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by Егор on 07.11.2021.
 */
@AllArgsConstructor
@Getter
@Setter
public class Car {
    private Type type;
    private final Engine engine;
    private TankFuel tankFuel;
    private int mileage;
    private boolean engineStarted;

    public enum Type {
        HB("хэчбек");

        String name;

        Type(String name) {
            this.name = name;
        }
    }
}

