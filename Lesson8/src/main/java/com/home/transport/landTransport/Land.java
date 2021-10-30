package com.home.transport.landTransport;

import com.home.transport.Transport;
import lombok.experimental.SuperBuilder;

/**
 * Created by Егор on 28.10.2021.
 */
@SuperBuilder
public class Land extends Transport {
    private int numberWheels;
    private int consumptionFuel;

    protected int getNumberWheels() {
        return numberWheels;
    }

    protected int getConsumptionFuel() {
        return consumptionFuel;
    }
}
