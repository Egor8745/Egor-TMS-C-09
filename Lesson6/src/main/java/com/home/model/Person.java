package com.home.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by Егор on 17.10.2021.
 */
@Getter
@Setter
@AllArgsConstructor
public class Person {
    private String name;
    private int age;
    private String sex;
    private String adress;

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                ", adress='" + adress + '\'' +
                '}';
    }
}
