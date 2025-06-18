package arraypractice;

import java.util.*;

public class CountFrequencyOfNumberInArray {
    public static void main(String[] args) {
        int[] num = {3,2,1,3,8,1,3,1};
        HashSet<Integer> hs = new HashSet<>();
        for(int i: num){
            hs.add(i);
        }
        System.out.println(hs);
        for(int unique: hs){
            int count = 0;
            for(int allnum : num){
                if(unique == allnum){
                    count = count+1;
                }
            }
            System.out.println("Total count of "+unique+" is - "+count);
        }

    }
}
