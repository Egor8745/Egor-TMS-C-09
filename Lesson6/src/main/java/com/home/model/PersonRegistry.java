package com.home.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Егор on 17.10.2021.
 */
public class PersonRegistry {
    private List<Person> list;

    public List<Person> getList() {
        if (list == null) {
            list = new ArrayList<>();
        }
        return list;
    }
}