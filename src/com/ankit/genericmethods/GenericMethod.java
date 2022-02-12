package com.ankit.genericmethods;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class GenericMethod {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(4);
        list.add(3);
        list.add(7);

        System.out.println(min(list, Integer::compare));
    }

    private static <T> T min(List<T> list, Comparator<T> comparator) {
        T minValue = list.get(0);
        for(T value: list) {
            if(comparator.compare(value, minValue) < 0) {
                minValue = value;
            }
        }
        return minValue;
    }
}
