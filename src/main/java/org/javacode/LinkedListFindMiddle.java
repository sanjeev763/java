package org.javacode;

import java.util.LinkedList;

public class LinkedListFindMiddle {

    public static void main(String[] args) {
        LinkedList<Integer> ls = new LinkedList<Integer>();
        ls.add(11);
        ls.add(22);
        ls.add(35);
        ls.add(47);
        ls.add(5);
        int list_size = ls.size();
        System.out.println(list_size);
        if (list_size == 0) {
            System.out.println("list is empty");
        }else if(list_size%2!=0) {
            int total = ls.size() - 1;
            System.out.println(ls.get(total / 2));
        } else if (list_size%2==0) {
            int total = ls.size()/2;
            System.out.println(ls.get(total-1)+ " and "+ls.get(total)+ " are 2 numbers in the middle");
        }

    }
}
