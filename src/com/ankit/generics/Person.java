package com.ankit.generics;

public class Person implements Comparable<Person> {
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return String.format("{name: '%s', age: %d}", name, age);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }


    @Override
    public int compareTo(Person otherPerson) {
        return new AgeComparator().compare(this, otherPerson);
    }
}
