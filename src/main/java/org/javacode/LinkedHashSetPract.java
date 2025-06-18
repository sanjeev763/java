package org.javacode;

import java.util.LinkedHashSet;

// LinkedHashSet allows no duplicate but insertion order is preserved
// backed by DS - Hashtable & LinkedList
public class LinkedHashSetPract {
    public static void main(String[] args) {
        LinkedHashSet<Integer> lhs = new LinkedHashSet<Integer>();
        lhs.add(10);
        lhs.add(200);
        lhs.add(30);
        lhs.add(40);
        lhs.add(50);
        System.out.println(lhs);

    }
}
