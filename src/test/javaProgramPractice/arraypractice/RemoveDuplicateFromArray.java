package arraypractice;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class RemoveDuplicateFromArray {
    public static void main(String[] args) {
        int[] arr = {12,32,42,12,90,987,54,654,32,12};
        LinkedHashSet<Integer> hs = new LinkedHashSet<>();
        for(int a: arr){
            hs.add(a);
        }
        System.out.println(hs);
    }
}
