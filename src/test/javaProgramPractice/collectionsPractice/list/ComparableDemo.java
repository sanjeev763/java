package collectionsPractice.list;

import java.util.ArrayList;
import java.util.List;
// comparable is used when we want to tell the natural ordering for custom class.
public class ComparableDemo {
    public static void main(String[] args) {
        List<Student_comparable> list = new ArrayList<>();
        list.add(new Student_comparable("Alice",3.5));
        list.add(new Student_comparable("Bob",3.7));
        list.add(new Student_comparable("Charlie",3.3));
        list.add(new Student_comparable("Dona",3.5));
        //list.sort(null); // without implementing comparable we will get class cast exception because natural ordering is not defined here
        /*
        // If we will be applying sorting on number then it is fine because for integer natural ordering is known but not for Student_comparable objects
        List<Integer> li = new ArrayList<>();
        li.add(1);
        li.add(2);
        li.add(99);
        li.sort(null);
        System.out.println(li);
        */
        list.sort(null);
        System.out.println(list);// results will be printed in the descending order of gpa
    }
}
