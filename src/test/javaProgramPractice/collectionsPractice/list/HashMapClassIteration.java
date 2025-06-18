package collectionsPractice.list;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapClassIteration {
    public static void main(String[] args) {
        HashMap<Integer, String> hmap = new HashMap<>();
        hmap.put(1,"Alice");
        hmap.put(2,"Sanju");
        hmap.put(3,"Neha");
        hmap.put(4,"Lolo");
        System.out.println(hmap);
        System.out.println(hmap.keySet());
        System.out.println(hmap.values());
        Set<Map.Entry<Integer,String>> entries = hmap.entrySet();
        System.out.println(entries);
        for(Map.Entry<Integer,String> entry : entries){
            System.out.println(entry.getKey()+"  "+entry.getValue());
        }

    }
}
