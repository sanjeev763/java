package org.javacode;

import java.util.LinkedList;

public class LinkedListReverse {
    /**
    Input: Linked List = 1 -> 2 -> 3 -> 4 -> NULL
    Output: Reversed Linked List = 4 -> 3 -> 2 -> 1 -> NULL


    Input: Linked List = 1 -> 2 -> 3 -> 4 -> 5 -> NULL
    Output: Reversed Linked List = 5 -> 4 -> 3 -> 2 -> 1 -> NULL


    Input: Linked List = NULL
    Output: Reversed Linked List = NULL


    Input: Linked List = 1->NULL
    Output: Reversed Linked List = 1->NULL
    **/

    public static void main(String[] args) {
        LinkedList<Integer> ls = new LinkedList<Integer>();
//        ls.add(1);
//        ls.add(2);
//        ls.add(3);
//        ls.add(4);
//        ls.add(5);
        ls.add(null);
        int list_size = ls.size();
        System.out.println(list_size);
        if(list_size == 1 && ls.contains(null)){
            System.out.println(ls);
        } else if (list_size == 2 && ls.getLast() == null){
            System.out.println(ls);
        } else{
            LinkedList<Integer> lsnew = new LinkedList<Integer>();
            for(int i = list_size-2; i >= 0; i--){
                lsnew.add(ls.get(i));
            }
            lsnew.add(null);
            System.out.println(lsnew);
        }




    }
}
