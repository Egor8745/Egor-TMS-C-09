package com.car.components;

/**
 * Created by Егор on 24.10.2021.
 */
public class Engine {
    private String type;
    private double volume;

    public Engine(String type, double volume) {
        this.type = type;
        this.volume = volume;
    }

    public void startEngine() {
        System.out.println("Двигатель запущен");
    }

    public void stopEngine() {
        System.out.println("Двигатель заглушен");
    }

    @Override
    public String toString() {
        return "Engine{" +
                "type='" + type + '\'' +
                ", volume=" + volume +
                '}';
    }
}

