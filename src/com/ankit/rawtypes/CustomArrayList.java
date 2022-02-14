package com.ankit.rawtypes;

import java.util.AbstractList;

public class CustomArrayList<T> extends AbstractList<T> {
    private Object[] list;

    CustomArrayList() {
        list = new Object[0];
    }

    @Override
    public T get(int index) {
        return (T) list[index];
    }

    @Override
    public int size() {
        return list.length;
    }

    @Override
    public boolean add(T t) {
        Object[] newList = new Object[size() + 1];
        for(int i=0;i<size();i++) {
            newList[i] = list[i];
        }
        newList[size()] = t;
        list = newList;
        return true;
    }
}

