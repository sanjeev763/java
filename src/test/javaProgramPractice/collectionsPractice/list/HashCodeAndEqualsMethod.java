package collectionsPractice.list;

import java.util.HashMap;
import java.util.Map;

//Engineering Digest youtube channel
public class HashCodeAndEqualsMethod {
    public static void main(String[] args) {
        HashMap<Person, String> map = new HashMap<>();
        Person p1 = new Person("Alice", 1);
        Person p2 = new Person("Bob", 1);
        Person p3 = new Person("Alice", 1);
        //Here although p1 & p3 is created for same person, but it will be created on different memory locations.
        //because we are creating the objects using the keyword new.
        map.put(p1, "Engineer");// hashcode1 --> index1
        map.put(p2, "Designer");// hashcode2 --> index2
        map.put(p3, "Manager");// hashcode3 --> index3
        //index for p1 and p3 will be different because generated hashcode will be different.

        System.out.println("Hashmap size : "+map.size());
        System.out.println("value for p1 : "+map.get(p1));
        System.out.println("value for p3 : "+map.get(p3));

        // We want to let system understand that p1 and p3 are same person. how?
        // in the Persons class(Custom class), we will write the implementation of hashcode method and equals method.
        // Refer to **Engineering Digest youtube channel**


        /*
        Map<String, Integer> map2 = new HashMap<>();
        map2.put("sanju", 90);// hashcode1 --> index1
        map2.put("neha", 95);// hashcode2 --> index2
        map2.put("sanju", 99);// hashcode1 --> index1 --> equals --> replace
        //Here, hashcode for 1st and 3rd will be same. for the same hashcode index will be same.
        // Now it will be checked that element at index1 is same. If it is same value will be replaced.
        //Here, since string refers to same sanju so no new hashcode will be generated
        // but in the above example we are creating hashcode with new keyword hence it is not same.
        */

    }
}

class Person{
    private int id;
    private String name;

    public  Person(String name, int id){
        this.id = id;
        this.name = name;
    }
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

}
