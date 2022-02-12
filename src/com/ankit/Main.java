package com.ankit;

import com.ankit.generics.AgeComparator;
import com.ankit.generics.Person;
import com.ankit.generics.ReverseComparator;
import com.ankit.generics.SortedPair;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Person person1 = new Person("Raju", 24);
        Person person2 = new Person("Mukesh", 29);
        Person person3 = new Person("Rahul", 27);
        AgeComparator ageComparator = new AgeComparator();

        List<Person> personList = new ArrayList<>();
        personList.add(person1);
        personList.add(person2);
        personList.add(person3);

        System.out.println(personList);

        Collections.sort(personList, ageComparator);
        System.out.println(personList);

        Collections.sort(personList, new ReverseComparator<>(ageComparator));
        System.out.println(personList);

        SortedPair<Integer> numbers = new SortedPair<>(1, 2);
        System.out.println(numbers.getFirst());
        System.out.println(numbers.getSecond());

        numbers = new SortedPair<>(2, 1);
        System.out.println(numbers.getFirst());
        System.out.println(numbers.getSecond());
    }

}
