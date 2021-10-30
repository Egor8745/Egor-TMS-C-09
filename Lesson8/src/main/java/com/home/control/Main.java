package com.home.control;

import com.home.transport.airTransport.Civil;
import com.home.transport.airTransport.Military;
import com.home.transport.landTransport.Passenger;
import com.home.transport.landTransport.Truck;

/**
 * Created by Егор on 28.10.2021.
 */
public class Main {
    public static void main(String[] args) {

        Passenger passenger = Passenger.builder()
                .power(120)
                .maxSpeed(200)
                .weight(3)
                .brand("Opel")
                .numberWheels(4)
                .consumptionFuel(10)
                .bodyType("Sedan")
                .passengersNumber(5)
                .build();
        Truck truck = Truck.builder()
                .power(200)
                .maxSpeed(110)
                .weight(8)
                .brand("MAN")
                .numberWheels(6)
                .consumptionFuel(20)
                .liftingCapacity(15)
                .build();
        Civil civil = Civil.builder()
                .power(300)
                .maxSpeed(400)
                .weight(10)
                .brand("Boing")
                .wingspan(19)
                .minRunwayength(1000)
                .passengersNumber(50)
                .businessClass(true)
                .build();
        Military military = Military.builder()
                .power(400)
                .maxSpeed(700)
                .weight(7)
                .brand("Миг-25")
                .wingspan(12)
                .minRunwayength(500)
                .ejection(true)
                .missilesOnBoard(4)
                .build();

        System.out.println(passenger);
        System.out.println(truck);
        System.out.println(civil);
        System.out.println(military);
        System.out.println();

        passenger.calculationRoute(4);

        truck.capacityTruck(21);

        civil.passengerCapacity(50);

        military.attackMissiles();

        military.ejectionSystem();
    }
}
