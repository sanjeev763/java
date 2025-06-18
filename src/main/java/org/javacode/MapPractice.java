package org.javacode;

//Map(I) : HashMap(C), HashTable(C)
// When we have data in key value pair
// duplicate keys are not allowed while duplicate value is allowed
// null is allowed in value
// Entry --> combination of key and value

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapPractice {
    public static void main(String[] args){
        Map<String, String> map = new HashMap<>();
        map.put("name", "sanjeev");
        map.put("address", "kothiya");
        map.put("houseno", "radha");

        //using foreach
        for(Map.Entry<String, String> m: map.entrySet()){
            System.out.println(m.getKey() + ":");
            System.out.println(m.getValue());

        }
        //using Iterator
        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();
        while(iterator.hasNext()){
            Map.Entry<String,String> entry = iterator.next();
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }

    }

}
