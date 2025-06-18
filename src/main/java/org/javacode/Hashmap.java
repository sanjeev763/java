package org.javacode;

// Underlying data structure is hashtable
// insertion order is not preserved
// null key is allowed only once
// searching is fast


import java.util.*;

public class Hashmap {
    public static void main(String[] args){
        HashMap<Integer, String> hs = new HashMap<Integer, String>();
        HashMap hs1 = new HashMap();
        hs.put(101,"sanju");
        hs.put(102,"neh");
        hs.put(103,"dolls");
        hs.put(104,"nayan");
        hs.put(105,"newnew");
        hs.put(106,"manju");
        hs.put(null,"aka");
        System.out.println(hs);
        System.out.println(hs.get(103));
        hs.remove(106);
        System.out.println(hs);
        System.out.println(hs.containsKey(103));
        System.out.println(hs.containsValue("neh"));
        System.out.println(hs.containsValue("neha"));

        System.out.println(hs1.containsKey(103));
        System.out.println(hs1.containsValue("neh"));
        Set m = hs.keySet(); // returns all the key values as set
        System.out.println(m);
        Collection s = hs.values(); // returns all the values as collection
        System.out.println(s);
        Set e = hs.entrySet(); // returns all the pairs as set
        System.out.println(e);
        for(Object i:m){
            System.out.println(i);
        }
        for (Object j: s){
            System.out.println(j);
        }
        for (Object k: m){
            System.out.println(k+"      "+hs.get(k));
        }
        // Entry methods
        for (Map.Entry<Integer, String> entry:hs.entrySet()){
            System.out.println(entry.getKey()+"  "+entry.getValue());
        }
        Iterator it = hs.entrySet().iterator();
        while (it.hasNext()){
            Map.Entry entry = (Map.Entry) it.next();
            System.out.println(entry.getKey()+"   "+entry.getValue());
        }

    }

}
