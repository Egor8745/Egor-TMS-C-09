package com.home.service;

import com.home.model.Computer;

/**
 * Created by Егор on 14.10.2021.
 */
public class Main {
    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.setCPU(6);
        computer.setRAM(8);
        computer.setHDD(500);
        computer.setResource(5);
        System.out.println(computer);
        computer.computerOn();
    }
}
