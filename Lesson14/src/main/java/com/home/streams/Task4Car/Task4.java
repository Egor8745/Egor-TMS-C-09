package com.home.streams.Task4Car;

import java.io.*;

/**
 * Created by Егор on 28.11.2021.
 */
public class Task4 {
    private static String FILE = "Lesson14/src/main/java/com/home/streams/Task4Car/car.ser";

    public static void Car() {
        Car car = new Car("Opel", 180, 10000);
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(FILE))) {
            outputStream.writeObject(car);
        } catch (IOException e) {
            e.printStackTrace();
        }
        Car carFromFile = null;
        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(FILE))) {
            carFromFile = (Car) inputStream.readObject();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(carFromFile);
    }
}
