package org.javacode;

// Queue(I) --> Deque(I), Blockingqueue(I), BlockingDque(I) & PriorityQueue(C), LinkedList(C)
// When we want to represent a group of element which are prior to processing
// EX - email/sms is sent to 100 people
//Both LinkedList and PriorityQueue is same - duplicates allowed, insertion order is preserved
// but LinkedList allows heterogeneous data while priority queue does not allow heterogeneous data.
// Implemented methods -
//      add() - if element addition is not successful. it returns exception
//      offer() - if element addition is not successful. it returns False
//      element() - it returns head element from queue, if element  is not present --> returns NoSuchElementException
//      peek() - it returns head element from queue, if element  is not present. it returns null
//      remove() - it returns head element from queue and then remove it from queue.if element is not present.returns exception
//      poll() - it returns head element from queue and then remove it from queue.if element is not present.returns null.

import java.util.Iterator;
import java.util.PriorityQueue;

public class QueuePractice {
    public static void  main(String[] args){
        PriorityQueue pq = new PriorityQueue();
        pq.add(1);
        pq.offer(23);
        pq.add(45);
        pq.add(45);
        System.out.println(pq);
        //get head element
        System.out.println(pq.peek());
        System.out.println(pq.element());
//        pq.removeAll(pq);
//        System.out.println(pq.peek());
//        System.out.println(pq.element());
        //get and remove head element
//        System.out.println(pq.remove());
//        System.out.println(pq.poll());
//        System.out.println(pq);
//        pq.removeAll(pq);
//        System.out.println(pq.poll());
//        System.out.println(pq.remove());

        Iterator<Integer> it = pq.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
        for(Object ob: pq){
            System.out.println(ob);
        }

    }

}
