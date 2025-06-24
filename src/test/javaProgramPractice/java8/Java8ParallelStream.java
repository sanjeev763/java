package java8;

import java.util.List;
import java.util.stream.Stream;

public class Java8ParallelStream {
    public static void main(String[] args) {
        //A type of stream which enables parallel processing of elements
        //Allowing multiple threads to process parts of the stream simultaneously
        //This can significantly improve performance for the large data sets
        // workload is distributed across multiple threads
        long startTime = System.currentTimeMillis();
        List<Integer> list = Stream.iterate(1, x -> x + 1).limit(20000).toList();
        List<Long> factorialsList = list.stream().map(Java8ParallelStream::factorial).toList();
        long endTime = System.currentTimeMillis();
        System.out.println("Time taken using stream : "+(endTime-startTime)+"ms");

        //Parallel streams are most effective for CPU-intensive or large datasets where tasks are independent
        //It may add overhead for small data set/simple tasks
        startTime = System.currentTimeMillis();
        factorialsList = list.parallelStream().map(Java8ParallelStream::factorial).toList();
        endTime = System.currentTimeMillis();
        System.out.println("Time taken using parallel stream : "+(endTime-startTime)+"ms");


    }
    public static long factorial(int n){
        long result = 1;
        for(int i = 2; i<= n; i++){
            result *=i;
        }
        return result;
    }
}
