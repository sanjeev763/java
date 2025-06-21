package collectionsPractice.list;
//multiple threads can access and modify the map concurrently
// Fail-safe iterator : Won't throw concurrentModificationException
//Java 7 --> segment based locking(not the entire map) --> 16 segments --> smaller hashmaps
// Only the segment being written to or Read from is locked
// read :- do not require locking unless there is a write operation happening on the same segment
// write :- lock

import java.util.concurrent.ConcurrentHashMap;

// Java 8 --> no segmentation
//        --> Compare and Swap(CAS) Approach --> no locking except resizing and collision
// Thread A last saw --> x = 45
// Thread A work --> x to 50
// If x is still 45, then change it to 50 else do not change and retry
// If still collision happens then thread halts and wait for some time and then again the process is repeated
public class ConcurrentHashMapDemo {
    public static void main(String[] args) {
        ConcurrentHashMap<Integer, String> concurrentHashMap = new ConcurrentHashMap<>();
        Thread t1 = new Thread(() -> {
            for(int i=0; i < 1000; i++){
                //hashMap.put(i, "Thread1");
                concurrentHashMap.put(i, "Thread1");
            }
        });
        Thread t2 = new Thread(() -> {
            for(int i=1000; i < 2000; i++){
                //hashMap.put(i, "Thread2");
                concurrentHashMap.put(i, "Thread2");
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
        System.out.println("Size of concurrent hash map : "+concurrentHashMap.size());
    }
}
