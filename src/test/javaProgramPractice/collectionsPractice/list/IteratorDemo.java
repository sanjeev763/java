package collectionsPractice.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class IteratorDemo {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(7);
        list.add(9);
        list.add(11);
        /*
        //If we use remove method while iterating loop we will get exception
        for(int i : list){
            list.remove(i); //ConcurrentModificationException
            System.out.println(i);
        }
        */
        //But if instead of for loop we use iterator we will not get any such exception
        //because iterator provides capability of removing element while iterating
        Iterator<Integer> itr = list.iterator();
        while(itr.hasNext()){
            if(itr.next() % 2 == 0){
                itr.remove();
            }
        }
        System.out.println(list);
    }
}
