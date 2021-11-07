package com.service;

import com.model.TankFuel;

/**
 * Created by Егор on 07.11.2021.
 */
public interface TankFuelService {
    void calculateFuelConsumption(TankFuel tankFuel);

    void doRefueling(TankFuel tankFuel);
}
