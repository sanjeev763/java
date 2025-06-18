package org.javacode;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListMergeAlternatePosition {

    public static void main(String args[]){
        LinkedList<Integer> ls = new LinkedList<>();
        LinkedList<Integer> newls = new LinkedList<>();
        ls.add(3);
        ls.add(31);
        ls.add(33);
        ls.add(4);
        ls.add(35);
        ls.add(9);
        newls.add(5);
        newls.add(53);
        newls.add(55);
        newls.add(51);
        newls.add(6);
        int n = 0;
        ListIterator<Integer> firstItr = ls.listIterator();
        ListIterator<Integer> secondItr = newls.listIterator();
        while (firstItr.hasNext()&&secondItr.hasNext()){
//            firstItr.next();
            System.out.println(firstItr.next());
            firstItr.add(secondItr.next());
            System.out.println(ls);
        }

    }
}
