package com.home.transport;

import lombok.experimental.SuperBuilder;

/**
 * Created by Егор on 28.10.2021.
 */
@SuperBuilder
public class Transport {
    private int power;
    private int maxSpeed;
    private int weight;
    private String brand;

    protected int getPower() {
        return power;
    }

    protected int getMaxSpeed() {
        return maxSpeed;
    }

    protected int getWeight() {
        return weight;
    }

    protected String getBrand() {
        return brand;
    }

    protected double powerKilowatt(int power) {
        double countPower = power * 0.74;
        return countPower;
    }
}
