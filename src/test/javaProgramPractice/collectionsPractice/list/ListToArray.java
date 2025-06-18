package collectionsPractice.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListToArray {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        System.out.println(list1);
        // convert list to array
        Object[] arr1 = list1.toArray(); //here type of new array is unknown
        System.out.println(Arrays.toString(arr1));

        //Another way to convert list to array where we can pass type as well
        Integer[] arr2 = list1.toArray(new Integer[0]); // here we have passed the type of new array
        // (It could be integer, string, any other type like Student etc.)
        // we are passing the array size 0 as a convention just to tell that which type of array is required.
        System.out.println(Arrays.toString(arr2));


        List<String> list2 = new ArrayList<>();
        list2.add("Sanju1");
        list2.add("Sanju2");
        list2.add("Sanju3");
        list2.add("Sanju4");
        System.out.println(list2);
        // convert list to array
        Object[] arr3 = list2.toArray();
        System.out.println(Arrays.toString(arr3));
        String[] arr4 = list2.toArray(new String[0]);
        System.out.println(Arrays.toString(arr4));
    }
}
