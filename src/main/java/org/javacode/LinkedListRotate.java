package org.javacode;

import java.util.LinkedList;

public class LinkedListRotate {
    /**
     Input: linked list = 10 -> 20 -> 30 -> 40 -> 50, k = 4
     Output: 50 -> 10 -> 20 -> 30 -> 40
     Explanation: After rotating the linked list to the left by 4 places, the 5th node, i.e node 50 becomes
     the head of the linked list and next pointer of node 50 points to node 10.

     Input: linked list = 10 -> 20 -> 30 -> 40, k = 6
     Output: 30 -> 40 -> 10 -> 20

    **/

    public void rotateLeft(LinkedList<Integer> ls, LinkedList<Integer> newls, int k){
        int list_size = ls.size();
        System.out.println(list_size);
        if(k > list_size){
            k = k % list_size;
        }
        System.out.println(k);
        if(k <= list_size){
            for(int j = k; j < list_size; j++){
                newls.add(ls.get(j));
            }
            for(int i=0; i<=k-1; i++){
                newls.add(ls.get(i));
            }
            System.out.println(newls);
        }
    }

    public static void main(String[] args) {
        LinkedList<Integer> ls = new LinkedList<Integer>();
        LinkedList<Integer> newls = new LinkedList<Integer>();
        ls.add(10);
        ls.add(20);
        ls.add(30);
        ls.add(40);
        ls.add(50);
//        ls.add(60);
//        ls.add(70);
        int k = 4;
        LinkedListRotate lsr = new LinkedListRotate();
        lsr.rotateLeft(ls, newls, k);
    }
}
