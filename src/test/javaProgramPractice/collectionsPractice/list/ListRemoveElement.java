package collectionsPractice.list;

import java.util.ArrayList;
import java.util.List;

public class ListRemoveElement {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        List<String> list2 = new ArrayList<>();
        list1.add(0);
        list1.add(2);
        list1.add(1);
        list1.add(3);
        list1.add(40);
        System.out.println(list1);
        list1.remove(1); // here remove method will remove element from the index 1 that is element 2
        System.out.println(list1);
        // To remove directly element from the list use wrapper class
        list1.remove(Integer.valueOf(40)); // Here directly integer value which is to be removed, is passed.
        // If that particular integer is not present then no error
        System.out.println(list1);

        list2.add("Sanju1");
        list2.add("Sanju2");
        list2.add("Sanju3");
        list2.add("Sanju4");
        System.out.println(list2);
        list2.remove("Sanju4");
        System.out.println(list2);

    }
}
