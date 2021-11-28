package com.home.streams.Task5;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

/**
 * Created by Егор on 28.11.2021.
 */
public class JsonInteract {
    private JsonInteract() {
    }

    public static <Car> Car readObjFormJson(File file, Class<Car> objClass) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        return objectMapper.readValue(file, objClass);
    }
}
