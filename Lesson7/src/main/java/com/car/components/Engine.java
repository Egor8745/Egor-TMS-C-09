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

    public boolean engineOn() {
        System.out.println("Двигатель запущен");
        boolean flag = true;
        return flag;
    }

    public boolean engineOff() {
        System.out.println("Двигатель заглушен");
        boolean flag = false;
        return flag;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "type='" + type + '\'' +
                ", volume=" + volume +
                '}';
    }
}

