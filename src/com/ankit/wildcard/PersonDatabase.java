package com.ankit.wildcard;

import com.ankit.generics.Person;

import java.util.LinkedList;
import java.util.Queue;

public class PersonDatabase {
    private static final Queue<RawPerson> raw = new LinkedList<>();

    public static void save(Person person) {
        raw.add(new RawPerson(person.getClass(), person.getName(), person.getAge()));
    }

    public static RawPerson load() {
        return raw.poll();
    }

    static class RawPerson {
        Class<?> clazz;
        String name;
        int age;

        RawPerson(Class<?> clazz, String name, int age) {
            this.clazz = clazz;
            this.name = name;
            this.age = age;
        }
    }

}
