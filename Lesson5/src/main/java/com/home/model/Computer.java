package com.home.model;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by Егор on 12.10.2021.
 */
public class Computer {
    private int CPU;
    private int RAM;
    private int HDD;
    private int resource;
    Random random = new Random();
    boolean burned;

    @Override
    public String toString() {
        return "Computer{" +
                "CPU=" + CPU +
                ", RAM=" + RAM +
                ", HDD=" + HDD +
                ", resource=" + resource +
                '}';
    }

    public void setCPU(int CPU) {
        this.CPU = CPU;
    }

    public void setRAM(int RAM) {
        this.RAM = RAM;
    }

    public void setHDD(int HDD) {
        this.HDD = HDD;
    }

    public void setResource(int resource) {
        this.resource = resource;
    }

    public void computerOn() {
        int a = random.nextInt(2);
        if (a == random()) {
            System.out.println("Компьютер включился!");
        } else {
            System.out.println("Компьютер сгорел!");
            burned = true;
        }
        computerOff();
    }

    public void computerOff() {
        this.resource -= 1;
        if (burned || this.resource == 0) {
            System.out.println("Компьютер не может включиться, т.к. он сгорел!");
        }
        int b = random.nextInt(2);
        if (b == random()) {
            System.out.println("Компьютер выключился!");
        } else {
            System.out.println("Компьютер сгорел!");
        }
        computerOn();
    }

    public int random() {
        Scanner scanner = new Scanner(System.in);
        int value;
        do {
            System.out.println("Внимание! Для включения (выключения) введите 0 или 1");
            while (!scanner.hasNextInt()) {
                System.out.println("Это не число!!!");
                scanner.next();
            }
            value = scanner.nextInt();
        }
        while (value != 0 && value != 1);
        return value;
    }
}
