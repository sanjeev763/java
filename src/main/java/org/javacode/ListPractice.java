package org.javacode;

import java.util.*;

public class ListPractice {
    //collection (I) --> List (I), Set(I), Queue(I)
    //List (I) --> ArrayList(C), LinkedList(C) --> duplicates allowed, insertion order is preserved, based on index
    //Set(I) --> HashSet(C), LinkedHashSet(C) --> duplicates not allowed, insertion order is not preserved
    //Queue(I) --> PriorityQueue(C), Deque(I) --> if elements are prior to processing
    //Map(I) --> HashMap(C), LinkedHashMap(C), HashTable(C)

    //Methods from collection : add(Object o), addAll(Collection C), remove(Object o), removeAll(Collection C),
    // retainAll(Collection C), clear(), isEmpty(), size(), contains(), containsAll(Collection C), toArray(Collection C) == returns object[]

    // Methods from list : add(index, Object o), addAll(index, Collection c), remove(index), get(index), set(index)

    //ArrayList : From java.util package, growable, accepts Heterogeneous data, when search is frequent operation
    //elements of ArrayList in consecutive memory location

    public static void main(String[] args) {
        // declaration :
        List<Integer> al = new ArrayList<>();
        ArrayList<Integer> al2 = new ArrayList<>();
//         ArrayList<Integer> al = new ArrayList<Integer>();
        // List al = new ArrayList()
        al.add(10);
        al.add(5);
        al.add(23);
        al.add(123);
        al2.add(1);
        al2.add(56);
        System.out.println(al);
        System.out.println(al.size());
//        System.out.println(al.remove(2));
        System.out.println(al);
        al.addAll(3, al2);
        System.out.println(al.get(3));
        System.out.println(al);
        Collections.sort(al);
        System.out.println(al);
        Collections.sort(al, Collections.reverseOrder());
        System.out.println(al);
        // Read all the elements from list
        // for loop
        for(int i =0; i< al.size(); i++){
            System.out.println("===================");
            System.out.println(al.get(i));
        }
        // for each
        for (Object alele: al) {
            System.out.println("#############");
            System.out.println(alele);
        }
        // using iterator
        Iterator it = al.iterator();
        while (it.hasNext()){
            System.out.println("$$$$$$$$$$$$$");
            System.out.println(it.next());
        }

        //Array to arrayList
        String arr[] = {"dog", "cat", "ele"};
        ArrayList<String> al3 = new ArrayList<>(Arrays.asList(arr));
        System.out.println(al3);

        //ArrayList to array
        Object[] ar = al3.toArray();
        for ( Object arrr:ar) {
            System.out.println(arrr);
        }

    }


}
