package org.javacode;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListPractice {

    public static void main(String[] args) {
    //Uses : Insertion and deletion is frequent operation, used to implement stack and queue
        // Not necessarily in consecutive memory
        // Methods : addFirst(), addLast(), removeFirst(), removeLast(), getFirst(), getLast()
        //Declare :
        LinkedList l = new LinkedList();
        LinkedList<Integer> ll = new LinkedList<Integer>();
        LinkedList<String> lll = new LinkedList<String>();
        l.add(100);
        l.add("welcome");
        l.add(15.63);
        l.add('A');
        l.add(true);
        l.add(null);

        System.out.println(l);
        System.out.println(l.size());
        System.out.println(l.remove(1));
        System.out.println(l);
        l.add(4,"bcd");
        System.out.println(l);
        System.out.println(l.get(5));
        System.out.println(l.set(5, "X"));
        System.out.println(l);

        //Iterate
        Iterator it = l.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
            System.out.println("-------------");
        }

        for(Object e: l)
            System.out.println(e);

        lll.add("a");
        lll.add("f");
        lll.add("c");
        lll.add("i");
        lll.add("r");
        lll.add("q");
        System.out.println(lll);
        l.addAll(1, lll);
        System.out.println(l);
        l.removeAll(lll);
        System.out.println(l);

        // sort, reverse sort, shuffle
        Collections.sort(lll);
        System.out.println(lll);
        Collections.sort(lll, Collections.reverseOrder());
        System.out.println(lll);
        Collections.shuffle(lll);
        System.out.println(lll);

        //Linked List specific
        l.addFirst(90);
        l.addLast(67);
        System.out.println(l);
        l.removeFirst();
        l.removeLast();
        System.out.println(l);




    }
}
