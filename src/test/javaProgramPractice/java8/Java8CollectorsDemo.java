package java8;

import java.util.*;
import java.util.stream.Collectors;

public class Java8CollectorsDemo {
    public static void main(String[] args) {
        //Collectors is a utility class
        //Provides a set of methods to create a common collectors

        //1. Collecting to a list
        List<String> list = Arrays.asList("Ram", "Shyam", "Raju","Kamal");
        List<String> res = list.stream()
                .filter(x -> x.startsWith("R"))
                .collect(Collectors.toList());
        System.out.println(res);

        //2. Collecting to a set
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 3,2);
        Set<Integer> set = numbers.stream().collect(Collectors.toSet());
        System.out.println(set);

        //3. Collecting to a specific collection
        ArrayList<String> collect = list.stream()
                .collect(Collectors.toCollection(() -> new ArrayList<>()));

        //4. Joining String
        //concatenates stream elements into a single string
        String concatenatedNames = list.stream().map(String :: toUpperCase).collect(Collectors.joining());
        String concatenatedNames1 = list.stream().map(String :: toUpperCase).collect(Collectors.joining(", "));
        System.out.println(concatenatedNames1);

        //5. Summarizing data
        //generates statical summary(count, sum, min, average, max)
        List<Integer> numList = Arrays.asList(2,3,5,7,11);
        IntSummaryStatistics stats = numList.stream().collect(Collectors.summarizingInt(x -> x));
        System.out.println(stats.getAverage());
        System.out.println(stats.getMax());
        System.out.println(stats.getCount());
        System.out.println(stats.getSum());

        //6. Calculating average
        Double avg = numList.stream().collect(Collectors.averagingInt(x -> x));
        System.out.println("Average : "+avg);

        //7. Counting Elements
        Long count = numList.stream().collect(Collectors.counting());
        System.out.println("Count : "+count);

        //8. Grouping elements
        List<String> words = Arrays.asList("hello","world","java","collector", "streams");
        System.out.println(words.stream().collect(Collectors.groupingBy(String::length)));
        System.out.println(words.stream().collect(Collectors.groupingBy(String::length, Collectors.joining(", "))));//joining after grouping
        System.out.println(words.stream().collect(Collectors.groupingBy(String::length, Collectors.counting()))); // counting length after grouping
        TreeMap<Integer, Long> treeMap = words.stream().collect(Collectors.groupingBy(String::length, TreeMap::new, Collectors.counting()));
        System.out.println(treeMap);

        //9. Partitioning elements
        //partition is done into 2 groups(true and false) based on predicate
        System.out.println(words.stream().collect(Collectors.partitioningBy(x -> x.length()>5)));

        //Mapping and collecting
        //Applies a mapping function before collecting
        System.out.println(words.stream().collect(Collectors.mapping(x -> x.toUpperCase(), Collectors.toList())));

        //Example:1 - Collecting names by length
        List<String> l1 = Arrays.asList("Anna", "Bob","Charlie", "David", "Alexander");
        System.out.println(list.stream().collect(Collectors.groupingBy(String::length)));

        //Example:2 - counting word occurrence
        String sentence = "hello world hello java world";
        System.out.println(Arrays.stream(sentence.split(" ")).collect(Collectors.groupingBy(x -> x, Collectors.counting())));

        //Example:3 - partitioning by even odd
        List<Integer> num = Arrays.asList(2,12,23,45,34,67,78);
        System.out.println(num.stream().collect(Collectors.partitioningBy(x -> x%2==0)));

        //Example:4 - summing values in a map
        Map<String,Integer> map = new HashMap<>();
        map.put("apple",1);
        map.put("orange",2);
        map.put("banana",3);
        map.put("guava",4);
        System.out.println(map.values().stream().reduce(Integer::sum).get());
        System.out.println(map.values().stream().collect(Collectors.summingInt(x->x)));

        //Example:5 - create a map from stream elements
        List<String> fruits = Arrays.asList("Apple", "banana", "cheery");
        System.out.println(fruits.stream().collect(Collectors.toMap(x -> x, String::length)));

    }
}
