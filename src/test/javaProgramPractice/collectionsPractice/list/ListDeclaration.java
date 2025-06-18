package collectionsPractice.list;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListDeclaration {
    public static void main(String[] args) {
        //1st way
        List<Integer> list1 = new ArrayList<>();// initial capacity = 10
        list1.add(0);
        list1.add(1);
        list1.add(20);// add method adds element at the end of the list
        list1.add(1, 10); // adds element(10) at the 2nd index shifting 20
        System.out.println("List1 :"+list1);
        List<Integer> list11 = new ArrayList<>(20);// initial capacity = 20

        //2nd way
        List<Integer> list2 = Arrays.asList(1,2,3); // asList returns a list of fixed size. We can't add or remove any element in this list after creation.
        // However, we can replace the value by using set method.
        System.out.println("List2 :"+list2);
        list2.set(2, 4);
        System.out.println("List2 modified :"+list2);

        //3rd way
        Integer[] arr = {11,22,33};
        List<Integer> list3 = Arrays.asList(arr);
        System.out.println("List3 :"+list3);

        //4th way : from java 9 onwards
        List<Integer> list4 = List.of(111,222,333); // returns unmodifiable list. We can't even replace the element like asList.
        System.out.println("List4 :"+list4);

        //5th way : creating arrayList from another collection
        List<String> anotherList = Arrays.asList("Sanjeev", "Neha", "Sonam");
        List<String> list5 = new ArrayList<>(anotherList);
        System.out.println("List5 :"+list5);
    }
}
