package com.home.streams;

import java.io.IOException;

public class Main {
    private static final String RESOURCE = "Lesson14/src/main/java/com/home/streams";
    private static final String INPUT_1 = RESOURCE + "/hw1/input.txt";
    private static final String OUTPUT_1 = RESOURCE + "/hw1/output.txt";
    private static final String INPUT_2 = RESOURCE + "/hw2/input.txt";
    private static final String OUTPUT_2 = RESOURCE + "/hw2/output.txt";
    private static final String INPUT_3 = RESOURCE + "/hw3/censorship.txt";
    private static final String CENSORSHIP_INPUT_3 = RESOURCE + "/hw3/blackList.txt";

    public static void main(String[] args) {

        try {
            Streams.firstTask(INPUT_1, OUTPUT_1);
            Streams.secondTask(INPUT_2, OUTPUT_2);
            //  Streams.thirdTask(INPUT_3, CENSORSHIP_INPUT_3); Не успел разобраться, позже доделаю
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

