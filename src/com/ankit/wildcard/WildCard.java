package com.ankit.wildcard;

import com.ankit.generics.Person;

import java.util.ArrayList;
import java.util.List;

public class WildCard {
    static Person person1 = new Person("Raju", 24);
    static Partner person2 = new Partner("Mukesh", 29);
    static Employee person3 = new Employee("Rahul", 27);

    public static void main(String[] args) {
        PersonSaver.save(person1);
        PersonSaver.save(person2);

        System.out.println(PersonLoader.load());
        System.out.println(PersonLoader.load());

        List<Partner> personList = new ArrayList<>();
        personList.add(person2);

        PersonSaver.saveAll(personList);

        List<Object> personList2 = new ArrayList<>();
        PersonLoader.loadAll(personList2);
        System.out.println(personList2);
    }
}
