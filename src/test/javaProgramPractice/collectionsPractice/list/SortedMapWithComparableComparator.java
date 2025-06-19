package collectionsPractice.list;

import java.util.SortedMap;
import java.util.TreeMap;
// Binary Search tree visualization - https://www.cs.usfca.edu/~galles/visualization/BST.html
//Red Black tree visualization - https://www.cs.usfca.edu/~galles/visualization/RedBlack.html
public class SortedMapWithComparableComparator {
    public static void main(String[] args) {
        SortedMap<Integer, String> smap1 = new TreeMap<>(); // natural sorting

        //If we are using any custom class as key then that class must implement comparable or
        // the comparator logic for the object class like below
        SortedMap<Student_comparable, String> smap2 = new TreeMap<>();
        Student_comparable key1 = new Student_comparable("Alice", 7.8);
        Student_comparable key2 = new Student_comparable("Bob", 8.9);
        Student_comparable key3 = new Student_comparable("Charlie", 6.7);
        smap2.put(key1, "manager");
        smap2.put(key2, "designer");
        smap2.put(key3, "QA");
        System.out.println(smap2);

        //Using comparator
        SortedMap<Integer, String> smap3 = new TreeMap<>((a,b) -> b - a); // custom sorting in descending order
        smap3.put(92, "Vivek");
        smap3.put(99, "Charles");
        smap3.put(78, "Sanju");
        smap3.put(74, "Sanju");
        smap3.put(67, "Sanju");
        System.out.println(smap3);

    }
}
