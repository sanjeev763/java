package java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Java8LazyEvaluationDemo {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Anna", "Bob", "Charlie", "David");
        Stream<String> stream = names.stream()
                .filter(name -> {
                    System.out.println("Filtering : "+name);
                    return name.length() > 3;
                }); // nothing will be printed till here because we have not used any terminal operation
        System.out.println("Before terminal operation");
        List<String> result = stream.collect(Collectors.toList()); // Here terminal operation is used hence it will print all the values
        System.out.println("After terminal operation");
        System.out.println(result);

    }
}
