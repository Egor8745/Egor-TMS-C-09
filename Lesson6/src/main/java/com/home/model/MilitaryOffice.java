package com.home.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Егор on 17.10.2021.
 */
public class MilitaryOffice {
    private PersonRegistry registry;
    private ArrayList<Person> fitForServiceMan = new ArrayList<>();
    private ArrayList<Person> сonscriptsCityOfMinsk = new ArrayList<>();
    private ArrayList<Person> recruitsByAge = new ArrayList<>();
    private ArrayList<Person> recruitsByName = new ArrayList<>();

    public MilitaryOffice(PersonRegistry registry) {
        this.registry = registry;
    }

    public List searchFitForService() {
        for (Person num : registry.getList()) {
            if (num.getAge() >= 18 && num.getAge() <= 27) {
                fitForServiceMan.add(num);
            }
        }
        return fitForServiceMan;
    }

    public List searchСonscriptsCityOfMinsk() {
        for (Person num : registry.getList()) {
            if (num.getAdress().equals("Минск")) {
                сonscriptsCityOfMinsk.add(num);
            }
        }
        return сonscriptsCityOfMinsk;
    }

    public List searchRecruitsByAge() {
        for (Person num : registry.getList()) {
            if (num.getAge() >= 25 && num.getAge() <= 27) {
                recruitsByAge.add(num);
            }
        }
        return recruitsByAge;
    }

    public List searchRecruitsByName() {
        for (Person num : registry.getList()) {
            if (num.getName().equals("Александр")) {
                recruitsByName.add(num);
            }
        }
        return recruitsByName;
    }
}

