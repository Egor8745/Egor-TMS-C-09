package com.home.model;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by Егор on 12.10.2021.
 */
public class Computer {
    int CPU;
    int RAM;
    int HDD;
    int resource;

    public Computer(int CPU, int RAM, int HDD, int resource) {
        this.CPU = CPU;
        this.RAM = RAM;
        this.HDD = HDD;
        this.resource = resource;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "CPU=" + CPU +
                ", RAM=" + RAM +
                ", HDD=" + HDD +
                ", resource=" + resource +
                '}';
    }

    public void computerOn() {
        Random random = new Random();
        int a = random.nextInt(2);
        Scanner scanner = new Scanner(System.in);
        int value;
        do {
            System.out.println("Внимание! Для включения введите 0 или 1");
            while (!scanner.hasNextInt()) {
                System.out.println("Это не число!!!");
                scanner.next();
            }
            value = scanner.nextInt();
        } while (value != 0 && value != 1);
        if (a == value) {
            System.out.println("Компьютер включился!");
            computerOff(0);
        } else {
            System.out.println("Компьютер сгорел!");
            computerOff(1);
        }
    }

    public void computerOff(int a) {
        this.resource -= 1;
        if (a > 0 || this.resource == 0) {
            System.out.println("Компьютер не может включиться, т.к. он сгорел!");
        } else {
            Random random = new Random();
            int b = random.nextInt(2);
            Scanner scanner = new Scanner(System.in);
            int value;
            do {
                System.out.println("Внимание! Для выключения введите 0 или 1");
                while (!scanner.hasNextInt()) {
                    System.out.println("Это не число!!!");
                    scanner.next();
                }
                value = scanner.nextInt();
            } while (value != 0 && value != 1);
            if (b == value) {
                System.out.println("Компьютер выключился!");
                computerOn();
            } else {
                System.out.println("Компьютер сгорел!");
                computerOn();
            }
        }
    }
}