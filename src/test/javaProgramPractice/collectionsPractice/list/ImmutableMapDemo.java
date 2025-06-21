package collectionsPractice.list;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

//Immutable map means we can't modify the map once it is instantiated.
public class ImmutableMapDemo {
    public static void main(String[] args) {
        HashMap<String, Integer> map1 = new HashMap<>();
        map1.put("A", 1);
        map1.put("B", 2);
        Map<String, Integer> map2 = Collections.unmodifiableMap(map1);
        System.out.println(map2); //{A=1, B=2}
        //map2.put("c", 3); // UnsupportedOperationException
        map1.put("C", 3);
        System.out.println(map2); //{A=1, B=2, C=3} Here if map1 is modified then map2 will also change
        //And hence breaks the immutability
        // So, in Java 9 another method was introduced to create pure immutable map.
        Map<String, Integer> map3 = Map.of("Sanu",1,"bokan", 2, "minu", 3);
        //This creates an immutable map, but it is limited to 10 key-value pairs only
        System.out.println(map3);
        Map<String, Integer> map4 = Map.ofEntries(Map.entry("sanu",1),Map.entry("sinu",1));
        //It has no limit on the entries
        System.out.println(map4);


    }
}
