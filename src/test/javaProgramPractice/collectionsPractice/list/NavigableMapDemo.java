package collectionsPractice.list;

import java.sql.SQLOutput;
import java.util.NavigableMap;
import java.util.TreeMap;

public class NavigableMapDemo {
    public static void main(String[] args) {
        NavigableMap<Integer, String> nmap = new TreeMap<>();
        nmap.put(1,"One");
        nmap.put(5,"Five");
        nmap.put(3,"Three");
        System.out.println(nmap); // o/p - {1=One, 3=Three, 5=Five} sorted but then why Navigable Map
        //Because it has some extra methods like
        System.out.println(nmap.lowerKey(5));
        System.out.println(nmap.ceilingKey(4)); //If matches exactly then print otherwise the best suited nearby value
        System.out.println(nmap.ceilingKey(3));
        System.out.println(nmap.higherEntry(1)); // gives entry just above the key
        System.out.println(nmap.descendingMap()); // O/P - {5=Five, 3=Three, 1=One}


    }
}
