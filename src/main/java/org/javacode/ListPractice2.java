package org.javacode;

import java.util.ArrayList;
import java.util.Objects;

//Find duplicate numbers, and it's count in a list and clear all the duplicate elements
public class ListPractice2 {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<Integer>();
        ArrayList<Integer> newal = new ArrayList<Integer>();
        al.add(12);
        al.add(1);
        al.add(112);
        al.add(12);
        al.add(12);
        al.add(1);
        al.add(17);
        al.add(12);
        System.out.println("raw list"+al);


        for(int i= 0; i<= al.size()-1; i++){
            int duplicateCount = 1;
            if(!newal.contains(al.get(i))) {
                for (int j = i + 1; j <= al.size() - 1; j++) {
                    if (Objects.equals(al.get(i), al.get(j))) {
                        duplicateCount = duplicateCount + 1;
                    }
                }
                newal.add(al.get(i));
            }

            if(duplicateCount>1){
                System.out.println(al.get(i)+" is duplicate and total count is - "+duplicateCount);
            }

        }
        System.out.println(newal);
    }

}
