package com.home.transport;

import lombok.Getter;
import lombok.experimental.SuperBuilder;

/**
 * Created by Егор on 28.10.2021.
 */
@SuperBuilder
@Getter
public class Transport {
    private int power;
    private int maxSpeed;
    private int weight;
    private String brand;

    protected double powerKilowatt(int power) {
        return power * 0.74;
    }
}
