package com.home.model;

import java.util.ArrayList;

/**
 * Created by Егор on 17.10.2021.
 */
public class MilitaryOffice {
    private PersonRegistry registry;
    ArrayList<Person> fitForServiceMan = new ArrayList<>();

    public MilitaryOffice(PersonRegistry registry) {
        this.registry = registry;
    }

    public void fitForService() {
        for (Person num : registry.getList()) {
            if (num.getAge() >= 18 && num.getAge() <= 27) {
                fitForServiceMan.add(num);
            }
        }
        System.out.println("Призывники города Минска: ");
        for (Person num : fitForServiceMan) {
            if (num.getAdress().equals("Минск")) {
                System.out.println(num);
            }
        }
        System.out.println("Призывники от 25 до 27 лет: ");
        for (Person num : fitForServiceMan) {
            if (num.getAge() >= 25 && num.getAge() <= 27) {
                System.out.println(num);
            }
        }
        System.out.println("Призывники с именем Александр: ");
        for (Person num : fitForServiceMan) {
            if (num.getName().equals("Александр")) {
                System.out.println(num);
            }
        }
    }
}

