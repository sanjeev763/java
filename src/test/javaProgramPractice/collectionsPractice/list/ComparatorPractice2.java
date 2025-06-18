package collectionsPractice.list;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ComparatorPractice2 {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Sanju", 3.5));
        students.add(new Student("Neha", 3.7));
        students.add(new Student("Golu", 3.2));
        students.add(new Student("Ankit", 3.5));
        // Method 1
        /*
        Comparator<Student>  comparator = Comparator.comparing(Student::getGpa); //comparing on the gpa in ascending order
        Comparator<Student>  comparator1 = Comparator.comparing(Student::getGpa).reversed(); //comparing on the gpa in descending order
        Comparator<Student>  comparator2 = Comparator.comparing(Student::getGpa).reversed().thenComparing(Student::getName); //comparing on the gpa in descending order and when equal gpa sort on the basis of alphabet
        students.sort(comparator);
        */

        // Method 2 : comparing on the gpa in descending order
         students.sort((o1,o2) -> {
            if(o2.getGpa() - o1.getGpa() > 0){
                return 1;
            }else if(o2.getGpa() - o1.getGpa() < 0){
                return -1;
            }else{
                return 0;
                //return o1.getName().compareTo(o2.getName()); // when equal gpa sort on the basis of alphabet
            }
        });

        for(Student s: students){
            System.out.println(s.getName() + "  "+s.getGpa());
        }
    }
}
