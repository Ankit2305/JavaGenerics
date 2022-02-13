package com.ankit.wildcard;

import com.ankit.generics.Person;

public class Employee extends Person {
    public Employee(String name, Integer age) {
        super(name, age);
    }

    @Override
    public String toString() {
        return "Employee -> " + super.toString();
    }
}
