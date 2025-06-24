package java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Java8StreamIntermediateOperations {
    public static void main(String[] args) {
        //Intermediate operation coverts one stream into another stream
        //Lazy, means they don't execute until a terminal operation is invoked.

        //1. filter
        List<String> list = Arrays.asList("Ram", "shyam", "Raju", "Kamal", "shyam");
        Stream<String> filteredStream = list.stream().filter(x -> x.startsWith("A")); //It will generate another stream
        //Filter is doing intermediate operation
        //No filtering is done at this point, it will be done only when terminal operation is invoked.
        long res = list.stream().filter(x -> x.startsWith("R")).count();//count is a terminal operation it completes the process
        System.out.println(res);

        //2. map
        Stream<String> stringStream = list.stream().map(x -> x.toUpperCase());
        Stream<String> stringStream1 = list.stream().map(String::toUpperCase);// using method reference

        //3. sorted
        Stream<String> sortedStream = list.stream().sorted(); //in natural order
        Stream<String> customSortedStream = list.stream().sorted((a,b) -> b.length() - a.length()); //used with comparator

        //4. distinct
        System.out.println(list.stream().distinct().filter(x -> x.startsWith("s")).count());

        //5. limit
        Stream.iterate(1, x -> x+1).count(); //without limit infinite stream
        Stream.iterate(1, x -> x+1).limit(100); //limited stream

        //6. skip
        Stream.iterate(1, x -> x+1).skip(10).limit(100); //limited stream with first 10 skipped results



    }
}
