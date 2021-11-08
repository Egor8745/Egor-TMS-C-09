package com.service;

import com.model.Car;
import com.model.TankFuel;
import lombok.AllArgsConstructor;

/**
 * Created by Егор on 07.11.2021.
 */
@AllArgsConstructor
public class TankFuelServiceImpl implements TankFuelService {
    @Override
    public void calculateFuelConsumption(TankFuel tankFuel) {
        tankFuel.setAmountOfFuel(tankFuel.getAmountOfFuel() - 5);
    }

    @Override
    public void doRefueling(TankFuel tankFuel) {
        tankFuel.setAmountOfFuel(tankFuel.getTotalVolume());
        System.out.println("Машина заправлена!");
    }
}
