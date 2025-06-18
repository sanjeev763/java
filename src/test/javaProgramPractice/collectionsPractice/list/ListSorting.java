package collectionsPractice.list;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ListSorting {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        list1.add(0);
        list1.add(2);
        list1.add(1);
        list1.add(3);
        list1.add(40);
        System.out.println(list1);
        Collections.sort(list1);
        System.out.println(list1);
        list1.add(5);
        System.out.println(list1);
        list1.sort(null);
        System.out.println(list1);

    }
}
