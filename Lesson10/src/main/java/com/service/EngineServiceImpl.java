package com.service;

import lombok.AllArgsConstructor;

/**
 * Created by Егор on 07.11.2021.
 */
@AllArgsConstructor
public class EngineServiceImpl implements EngineService {
    public void startEngine() {
        System.out.println("Двигатель запущен");
    }

    public void stopEngine() {
        System.out.println("Двигатель заглушен");
    }
}
