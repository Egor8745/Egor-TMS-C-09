package com.home.streams;

import com.home.streams.Task4Car.Task4;
import com.home.streams.Task5.JsonInteract;
import com.home.streams.hw5.Car;

import java.io.File;
import java.io.IOException;

public class Main {
    private static final String RESOURCE = "Lesson14/src/main/java/com/home/streams";
    private static final String INPUT_1 = RESOURCE + "/hw1/input.txt";
    private static final String OUTPUT_1 = RESOURCE + "/hw1/output.txt";
    private static final String INPUT_2 = RESOURCE + "/hw2/input.txt";
    private static final String OUTPUT_2 = RESOURCE + "/hw2/output.txt";
    private static final String INPUT_3 = "Lesson14/src/main/java/com/home/streams/hw3/censorship.txt";
    private static final String CENSORSHIP_INPUT_3 = "Lesson14/src/main/java/com/home/streams/hw3/blackList.txt";
    private static final String FILE_NAME = "Lesson14/src/main/java/com/home/streams/hw5/car.json";

    public static void main(String[] args) throws IOException {
        Streams.firstTask(INPUT_1, OUTPUT_1);
        Streams.secondTask(INPUT_2, OUTPUT_2);
        Streams.thirdTask(INPUT_3, CENSORSHIP_INPUT_3);
        Task4.Car();
        File file = new File(FILE_NAME);
        Car carFromJson = JsonInteract.readObjFormJson(file, Car.class);
        System.out.println(carFromJson);
    }
}


