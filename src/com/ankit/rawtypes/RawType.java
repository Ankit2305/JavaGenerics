package com.ankit.rawtypes;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class RawType {
    public static void main(String[] args) {
        List list  = new ArrayList();
        list.add("Hello World");
        list.add(2);
        list.add(1.4f);
        Iterator iterator = list.iterator();
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        CustomArrayList<Integer> arrayList = new CustomArrayList<>();
        arrayList.add(1);
        arrayList.add(41);
        arrayList.add(16);
        System.out.println(arrayList);
    }
}
