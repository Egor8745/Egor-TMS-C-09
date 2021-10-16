package com.home.service;

import com.home.model.Computer;

/**
 * Created by Егор on 14.10.2021.
 */
public class Main {
    public static void main(String[] args) {
        Computer computer = new Computer(4, 8, 500, 5);
        System.out.println(computer);
        computer.computerOn();
    }
}
