package collectionsPractice.list;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class LinkedHashMapClass {
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> lhm = new LinkedHashMap<>(); // This will give ordered results
        lhm.put("Sanju",1);
        lhm.put("neha",2);
        lhm.put("nehababy",3);
        Set<Map.Entry<String, Integer>> entries1 = lhm.entrySet();
        for(Map.Entry<String, Integer> entry : entries1){
            System.out.println(entry.getKey()+"  "+entry.getValue());
        }

        HashMap<String, Integer> hm = new HashMap<>(); // This will give unordered results
        hm.put("Sanju",1);
        hm.put("neha",2);
        hm.put("nehababy",3);
        Set<Map.Entry<String, Integer>> entries = hm.entrySet();
        for(Map.Entry<String, Integer> entry : entries){
            System.out.println(entry.getKey()+"  "+entry.getValue());
        }

    }
}
