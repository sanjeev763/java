package collectionsPractice.list;

import java.util.HashMap;
import java.util.Hashtable;
// Hashtable is synchronized, means thread safe
//no null key/value
//Legacy class, now replaced with ConcurrentHashMap
//Slower than HashMAp due to thread overhead
//Only uses linked list in case of collision (No RedBlack tree)
public class HashTableDemo {
    public static void main(String[] args) {
        Hashtable<String, Integer> hashtable = new Hashtable<>();
        hashtable.put("sanju",1);
        hashtable.put("nehu",2);
        hashtable.put("sonuu",3);
        hashtable.put("monu",4);
        System.out.println(hashtable);

        Hashtable<Integer, String> hasht = new Hashtable<>();
        hasht.put(1,"sanju");
        hasht.put(2,"nehu");
        hasht.put(33,"sonu");
        hasht.put(4,"monu");
        System.out.println(hasht);

        //HashMap<Integer, String> hashMap = new HashMap<>();
        Hashtable<Integer, String> hashtable1 = new Hashtable<>();

        Thread t1 = new Thread(() -> {
            for(int i=0; i < 1000; i++){
                //hashMap.put(i, "Thread1");
                hashtable1.put(i, "Thread1");
            }
        });
        Thread t2 = new Thread(() -> {
            for(int i=1000; i < 2000; i++){
                //hashMap.put(i, "Thread2");
                hashtable1.put(i, "Thread2");
            }
        });
        t1.start();
        t2.start();
        try{
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //System.out.println("size of the hashtable : "+hashMap.size());
        // When using hashmap we get diff value of hashMap size because there is a chance of collision
        //while putting the value in hashmap for both the threads.
        System.out.println("size of the hashtable : "+hashtable1.size());// O/P - 2000 everytime we get same size because of thread synchronization

    }
}
