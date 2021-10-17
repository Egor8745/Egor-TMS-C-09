package com.home.service;

import com.home.model.MilitaryOffice;
import com.home.model.Person;
import com.home.model.PersonRegistry;

/**
 * Created by Егор on 17.10.2021.
 */
public class Main {
    public static void main(String[] args) {
        PersonRegistry registry = new PersonRegistry();
        Person person = new Person("Александр", 23, "Мужской", "Минск");
        Person person1 = new Person("Сергей", 25, "Мужской", "Брест");
        Person person2 = new Person("Антон", 27, "Мужской", "Минск");
        Person person3 = new Person("Андрей", 17, "Мужской", "Витебск");
        Person person4 = new Person("Виталий", 18, "Мужской", "Слоним");
        Person person5 = new Person("Александр", 19, "Мужской", "Минск");
        registry.getList().add(person);
        registry.getList().add(person1);
        registry.getList().add(person2);
        registry.getList().add(person3);
        registry.getList().add(person4);
        registry.getList().add(person5);
        MilitaryOffice office = new MilitaryOffice(registry);
        office.fitForService();

    }
}
