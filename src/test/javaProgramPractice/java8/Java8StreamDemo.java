package java8;

import java.util.Arrays;
import java.util.List;

public class Java8StreamDemo {
    public static void main(String[] args) {
        //process collections of data in a functional & declarative manner
        //Simplify data process(reduces the lengthy loops and makes code more readable)
        //Embrace Functional Programming
        //Enable easy parallelism

        // what is stream?? --> a sequence of elements supporting functional & declarative programming
        //How to use streams??
        // Source, intermediate operations & terminal operation

        //Problem --> From a list of numbers find the count of even numbers
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6);
        //Traditional approach
        int count = 0;
        for(int i : numbers){
            if(i % 2 ==0){
                count++;
            }
        }
        System.out.println(count);

        // Stream approach
        System.out.println(numbers.stream().filter(x -> x%2==0).count());
    }
}
