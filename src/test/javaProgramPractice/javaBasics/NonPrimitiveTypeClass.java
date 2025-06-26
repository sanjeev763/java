package javaBasics;

import java.util.ArrayList;
//NonPrimitive Type = Reference Type
//Can be mutable and immutable both depending on design.
//Mutable - ArrayList, HashMap, custom classes with setter method
//Immutable - String, Integer, LocalDate
//Stored in heap and not in stack hence less efficient than primitive.

public class NonPrimitiveTypeClass {
    public static void addItems(ArrayList<String> arr){
        arr.add("C");
    }
    public static void modifyString(String s){
        System.out.println("just before modification : "+s);
        s = "test";
        System.out.println("modified : "+s);

    }
    public static void main(String[] args) {
        //Example of mutable non-primitive
        ArrayList<String> arrList = new ArrayList<String>();
        arrList.add("A");
        arrList.add("B");
        System.out.println("array list :- "+arrList);
        addItems(arrList);
        //Here reference of the object arrList was passed to method and now after
        // alteration new list is printed
        System.out.println("array list :- "+arrList);


        //Example of immutable non-primitive
        String s = "text";
        System.out.println(s);
        modifyString(s);
        System.out.println(s);

    }
}
