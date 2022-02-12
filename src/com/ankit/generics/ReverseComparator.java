package com.ankit.generics;

import java.util.Comparator;

public class ReverseComparator<T> implements Comparator<T> {
    private Comparator<T> delegateComparator;

    public ReverseComparator(Comparator<T> delegateComparator) {
        this.delegateComparator = delegateComparator;
    }

    @Override
    public int compare(T t1, T t2) {
        return -1 * delegateComparator.compare(t1, t2);
    }
}
