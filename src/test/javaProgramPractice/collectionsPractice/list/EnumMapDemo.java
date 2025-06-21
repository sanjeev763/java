package collectionsPractice.list;

import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;
//Array of size same as enum is created
//["Walk", "Gym", --, --, --, --, "Eating"]
//No hashing
//Ordinal/index is used
//Faster than hashmap
//Memory efficient
public class EnumMapDemo {
    public static void main(String[] args) {
       // Map<Day, String> map1= new HashMap<>(); // recommended to use enummap
        Map<Day, String> map1= new EnumMap<>(Day.class);
        map1.put(Day.Tuesday, "Gym");
        map1.put(Day.Monday, "Walk");
        map1.put(Day.Sunday, "Eating");
        System.out.println(Day.Tuesday.ordinal());
        String s = map1.get(Day.Tuesday);
        System.out.println(s);
        System.out.println(map1); //{Monday=Walk, Tuesday=Gym} O/P will be printed in the same sequence as given in enum class
    }
}
enum Day {
        Monday, Tuesday, Wednesday, Thursday, Friday, Satturday, Sunday
}
