package com.ankit.wildcard;

import com.ankit.generics.Person;

public class Partner extends Person {
    public Partner(String name, Integer age) {
        super(name, age);
    }

    @Override
    public String toString() {
        return "Partner -> " + super.toString();
    }
}
