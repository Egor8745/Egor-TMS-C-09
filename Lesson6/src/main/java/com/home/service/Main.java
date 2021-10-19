package com.home.service;

import com.home.model.MilitaryOffice;
import com.home.model.Person;
import com.home.model.PersonRegistry;

import java.util.List;

/**
 * Created by Егор on 17.10.2021.
 */
public class Main {
    public static void main(String[] args) {
        PersonRegistry registry = new PersonRegistry();
        MilitaryOffice office = new MilitaryOffice(registry);
        Person person = new Person("Александр", 23, "Мужской", "Минск");
        Person person1 = new Person("Сергей", 25, "Мужской", "Брест");
        Person person2 = new Person("Антон", 27, "Мужской", "Минск");
        Person person3 = new Person("Андрей", 17, "Мужской", "Витебск");
        Person person4 = new Person("Виталий", 18, "Мужской", "Слоним");
        Person person5 = new Person("Александр", 19, "Мужской", "Минск");
        List<Person> personList = registry.getList();
        personList.add(person);
        personList.add(person1);
        personList.add(person2);
        personList.add(person3);
        personList.add(person4);
        personList.add(person5);
        System.out.println("Призывники годные к военной службе: " + office.searchFitForService());
        System.out.println("Призывники города Минска: " + office.searchСonscriptsCityOfMinsk());
        System.out.println("Призывники в возрасте от 25 до 27 лет: " + office.searchRecruitsByAge());
        System.out.println("Призывники с именем Александр: " + office.searchRecruitsByName());
    }
}
