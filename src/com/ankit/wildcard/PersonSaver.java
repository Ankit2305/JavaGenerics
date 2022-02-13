package com.ankit.wildcard;

import com.ankit.generics.Person;

import java.util.List;

public class PersonSaver {
    public static void save(Person person) {
        PersonDatabase.save(person);
    }

    public static void saveAll(List<? extends Person> persons) {
        for(Person person: persons) {
            save(person);
        }
    }
}
