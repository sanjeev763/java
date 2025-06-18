package collectionsPractice.list;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindDuplicateInListUsingCollections {
    public static List<Integer> findDuplicate(List li){
        HashSet<Integer> seen = new HashSet<>();
        List<Integer> duplicate = new ArrayList<>();
        for(Object i:li){
            System.out.println(seen);
            System.out.println(duplicate);
            if(i!= null && !seen.add((Integer) i)){
                duplicate.add((Integer) i);
            }
        }
        return duplicate;
    }
    public static void main(String[] args) {
        List<Integer> li = new ArrayList<>();
        li.add(10);
        li.add(20);
        li.add(40);
        li.add(20);
        li.add(30);
        li.add(20);
        li.add(50);
        li.add(10);
        System.out.println(li);
        List<Integer> list = findDuplicate(li);
        System.out.println(list);
    }
}
