package org.javacode;

import java.util.HashSet;
// Duplicate is not allowed, insertion order is not preserved
// hashcode is the underlying data structure(searching would be faster)
// heterogeneous data is allowed, null is allowed

public class SetPractice {

    public static void main(String[] args){
        HashSet hs = new HashSet(); // default capacity 16 Load factor 0.75
        HashSet hs1 = new HashSet(); // default capacity 16 Load factor 0.75
//        HashSet hs100 = new HashSet(100); // initial capacity 100 Load factor 0.75
//        HashSet hs90 = new HashSet(100, (float)0.89); // initial capacity 100 Load factor 0.89
//        HashSet<Integer> hsnew = new HashSet<Integer>();
        hs.add(10);
        hs.add("welcome");
        hs.add(18.4);
        hs.add('A');
        hs.add(true);
        hs.add(null);
        System.out.println(hs);
        hs.remove(18.4);
        System.out.println(hs);
        hs1.add(1);
        hs1.add('a');
        hs1.add("sanju");

        hs.addAll(hs1);
        System.out.println(hs);
        hs.removeAll(hs1);
        System.out.println(hs);
        // union, intersection, difference

        HashSet<Integer> hsnew = new HashSet<Integer>();
        HashSet<Integer> hsnew2 = new HashSet<Integer>();
        HashSet<Integer> hsnew3 = new HashSet<Integer>();
        hsnew.add(10);
        hsnew.add(20);
        hsnew.add(30);
        hsnew.add(40);
        hsnew.add(50);
        hsnew.add(60);
        hsnew2.add(30);
        hsnew2.add(40);
        hsnew2.add(50);
        hsnew2.add(70);
        hsnew3.add(70);
        hsnew3.add(223);


    // union
        hsnew.addAll(hsnew2);
        System.out.println("union -"+hsnew);
    // intersection
        hsnew.retainAll(hsnew2);
        System.out.println("intersection -"+hsnew);
    // difference
        hsnew.removeAll(hsnew3);
        System.out.println("diff -"+hsnew);



    }
}
