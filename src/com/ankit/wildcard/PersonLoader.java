package com.ankit.wildcard;

import com.ankit.generics.Person;

import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.List;

public class PersonLoader {
    public static Person load() {
        try {
            PersonDatabase.RawPerson rawPerson = PersonDatabase.load();
            if(rawPerson == null)
                return null;
            Constructor<?> constructor = rawPerson.clazz.getConstructor(String.class, Integer.class);
            Person person = (Person) constructor.newInstance(rawPerson.name, rawPerson.age);
            return person;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static void loadAll(List<? super Person> people) {
        Person person;
        while((person = load()) != null) {
            people.add(person);
        }
    }
}
