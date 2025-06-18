package org.javacode;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Objects;

public class LinkedListRemoveDuplicate {
   /* Input:
    LinkedList: 2->2->4->5
    Output: 2 -> 4 -> 5

    Input:
    LinkedList: 2->2->2->2->2
    Output: 2
    */
    public static void main(String[] args) {
        LinkedList<Integer> ls = new LinkedList<Integer>();
        LinkedList<Integer> newls = new LinkedList<Integer>();
        ls.add(2);
        ls.add(2);
        ls.add(2);
        ls.add(2);
//        ls.add(13);
//        ls.add(35);
        Collections.sort(ls);
        System.out.println("Linked list :"+ls);
        int list_size = ls.size();
        for(int i = 0; i < list_size; i++){
            for(int j = i+1; j < list_size; j++) {
                if (Objects.equals(ls.get(i), ls.get(j))){
                    ls.set(j, null);
                }
            }
        }
        for(Integer s : ls){
            if(s != null){
                newls.add(s);
            }
        }
        System.out.println("Output :- "+newls);
    }
}
