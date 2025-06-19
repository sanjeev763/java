package collectionsPractice.list;

import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

// sortedmap is an interface which extends Map interface and its implementing class is TreeMap & NavigableMap
//It guarantees that the entries are sorted based on the keys, either in their natural ordering or by a comparator.
// sorting is done based on the keys. If the keys belong to a class which implements comparable(like String, Integer etc.)
// then we are good otherwise we need to implement comparable on the keys.

public class SortedMapDemo {
    public static void main(String[] args) {
        SortedMap<String, Integer> sortedMap = new TreeMap<>();
        sortedMap.put("Vivek", 92);
        sortedMap.put("Charles", 99);
        sortedMap.put("Sanju", 78);
        System.out.println(sortedMap); //{Charles=99, Sanju=78, Vivek=92} it is sorted as per the name

        SortedMap<Integer,String> sortedMap1 = new TreeMap<>();
        sortedMap1.put(92, "Vivek");
        sortedMap1.put(99, "Charles");
        sortedMap1.put(78, "Sanju");
        sortedMap1.put(74, "Sanju");
        sortedMap1.put(67, "Sanju");
        System.out.println(sortedMap1); //{67=Sanju, 74=Sanju, 78=Sanju, 92=Vivek, 99=Charles} it is sorted as per the number

        Map<Integer,String> map = new TreeMap<>();
        map.put(92, "Vivek");
        map.put(99, "Charles");
        map.put(78, "Sanju");
        System.out.println(map); // {78=Sanju, 92=Vivek, 99=Charles} Getting same result with Map reference as well
        //So, why do we need the SortedMap? Because sorted map has some useful and unique methods. like....
        System.out.println(sortedMap1.headMap(78));
        System.out.println(sortedMap1.tailMap(78));
        System.out.println(sortedMap1.subMap(74, 99));
        System.out.println(sortedMap1.firstKey());
        System.out.println(sortedMap1.lastKey());
    }
}
