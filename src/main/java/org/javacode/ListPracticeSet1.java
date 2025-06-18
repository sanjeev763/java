package org.javacode;

import java.util.ArrayList;
import java.util.Collections;

//Find Min & Max number in a list
public class ListPracticeSet1 {
    public static void main(String[] args) {
        ArrayList<Integer> li = new ArrayList<Integer>();
        li.add(10);
        li.add(20);
        li.add(1);
        li.add(5);
        li.add(132);
        System.out.println(li);
        Collections.sort(li);
        System.out.println(li);
        System.out.println(li.get(0));
        System.out.println(li.get(li.size()-1));

    }

}
