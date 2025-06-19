package collectionsPractice.list;

import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Map;

public class IdentityHashMapClass {
    public static void main(String[] args) {
        String key1 = new String("key");
        String key2 = new String("key");
        Map<String, Integer> hashmap = new HashMap<>();
        hashmap.put(key1, 1);
        hashmap.put(key2, 2);
        System.out.println(key1.hashCode());
        System.out.println(key2.hashCode());
        System.out.println(hashmap);// We will get o/p {key=2} because for String class hashcode is generated on
        // the basis of string content. And, here string content is same so same hashcode and the value will
        // be replaced with the latest value.
        //Once we get the same hashcode then for the index .equals() is applied and hence value is replaced.

        String key3 = new String("newkey");
        String key4 = new String("newkey");
        IdentityHashMap<String, Integer> identityHashMap = new IdentityHashMap<>();
        identityHashMap.put(key1, 1);
        identityHashMap.put(key2, 2);
        System.out.println(System.identityHashCode(key3));
        System.out.println(System.identityHashCode(key4));
        System.out.println(identityHashMap); // o/p - {key=2, key=1}
        //Does not matter if hashcode is present inside class or not, it will use hashcode of object.
        //Here hashcode will be different as we have used new keyword. for 2 hashcode 2 indexes will be generated
        //so size of identity hashmap will be 2. Even if hashcode is same, here == operator is used instead of .equals()
        //if ans of == is false 2 diff element will be generated. If and of == is same means pointing to same
        //address reference then value will be replaced.
    }
}
