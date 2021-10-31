package com.home.transport.land_transport;

import com.home.transport.Transport;
import lombok.Getter;
import lombok.experimental.SuperBuilder;

/**
 * Created by Егор on 28.10.2021.
 */
@SuperBuilder
@Getter
public class Land extends Transport {
    private int numberWheels;
    private int consumptionFuel;
}
