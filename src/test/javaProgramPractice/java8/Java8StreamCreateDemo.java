package java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Java8StreamCreateDemo {
    public static void main(String[] args) {
        //Creating streams
        // 1. From Collection
        List<Integer> list = Arrays.asList(1,2,3,4,5);
        Stream<Integer> stream1 = list.stream();
        // 2. From Arrays
        String[] array = {"a", "b", "c"};
        Stream<String> stream2 = Arrays.stream(array);
        // 3. Using stream.of()
        Stream<String> stream3 = Stream.of("a","b","c");
        // 4. Infinite streams
        Stream<Integer> stream4 = Stream.generate(() -> 1);
        List<Integer> collect = Stream.iterate(1, x -> x+1).limit(100).collect(Collectors.toList());
        System.out.println(collect);
    }
}
