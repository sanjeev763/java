package org.javacode;

//nulls are not accepted as key or value
// synchronized - one thread allowed at a time, hence thread safe and poor performance

import java.util.Hashtable;

public class HashTablePractice {
    public static void main(String[] args){
        Hashtable ht = new Hashtable(); // capacity is 11 and load factor is 0.75
        Hashtable ht1 = new Hashtable(20); // capacity is 20 and load factor is 0.75
        Hashtable ht2 = new Hashtable(20, 0.80F); // capacity is 20 and load factor is 0.75
        Hashtable<Integer, String> ht3 = new Hashtable<Integer, String>(); // capacity is 20 and load factor is 0.75

        ht.put(101, "sanj");
        ht.put(102, 'A');
        ht.put(103, 23);
        ht.put(104, 12.22);
        System.out.println(ht);
        System.out.println(ht.keySet());
        System.out.println(ht.values());
        for (Object hto:ht.keySet()){
            System.out.println(hto+"   "+ht.get(hto));
        }
    }
}
