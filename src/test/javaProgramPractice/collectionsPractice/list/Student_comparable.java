package collectionsPractice.list;

public class Student_comparable implements Comparable<Student_comparable>{
    private String name;
    private double gpa;

    public Student_comparable(String name, double gpa){
        this.name = name;
        this.gpa = gpa;
    }
    public String getName(){
        return name;
    }
    public double getGpa(){
        return gpa;
    }

    @Override
    public int compareTo(Student_comparable o) {
        /*
        return o.getGpa() - this.getGpa();
        // getting error because gpa is Double, and we need to write detailed logic as below
        if(o2.getGpa() - o1.getGpa() > 0){
            return 1;
        }else if(o2.getGpa() - o1.getGpa() < 0){
            return -1;
        }else{
            return 0;
        */
        //But if we use below code then we do not need to write extra logic as Double class takes care of it internally
        //go to Double class and cross check it. the above commented logic is already applied in the Double class.
        return Double.compare(o.getGpa(), this.getGpa());
    }
    @Override
    public String toString() {
        return "name "+name+" "+"gpa "+gpa;
    }
}
