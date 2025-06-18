package org.javacode;

import java.util.ArrayList;
import java.util.Arrays;

public class ConvertArrayListToArray {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<String>();

        al.add("ABC");
        al.add("ABCD");
        al.add("ABCDE");
        al.add("ABCDEF");
        al.add("ABCCDEFG");
        al.add("ABCCDEFGH");
        al.add("ABCCDEFGHI");
        al.add("ABCCDEFGHIJ");
        al.add("ABCCDEFGHIJK");
        System.out.println("raw list"+al);

        String[] arr = al.toArray(new String[al.size()]);
        for(String it:arr) {
            System.out.println(it);
        }

        ArrayList<String> newal = new ArrayList<String>(Arrays.asList(arr));
        System.out.println(newal);

    }

}
