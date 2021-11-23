package com.home.streams;

import java.io.*;

public class Streams {


    public static void firstTask(String inputFile, String outputFile) throws IOException {
        FileWriter writer = new FileWriter(outputFile);
        writer.write(TextFormatter.getPalindromes(read(inputFile)));
        writer.close();
    }

    public static void secondTask(String inputFile, String outputFile) {
        write(outputFile, TextFormatter.formatText(read(inputFile)));
    }

    public static void thirdTask(String fileInputName, String fileOutputPath) throws IOException {
        TextFormatter.checkCensor(read(fileInputName), read(fileOutputPath));
    }

    private static String read(String fileInputName) {
        StringBuilder builder = new StringBuilder();
        char[] buff = new char[1024];
        int read;
        String text = null;
        try (FileReader reader = new FileReader(fileInputName)) {
            while ((read = reader.read(buff)) != -1) {
                builder.append(buff, 0, read);
            }
            text = builder.toString();
            return text;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return text;
    }

    private static void write(String fileOutputPath, String text) {
        try (FileWriter writer = new FileWriter(fileOutputPath)) {
            writer.write(text);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
