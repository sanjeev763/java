package java8;
//java 8 --> minimal code, functional programming(function is treated as variable),
// lambda, streams, Data and Time API
// Predicate holds a condition, here storing a condition in a variable(Functional programming)
import java.util.function.Predicate;

public class Java8DemoPredicate {
    public static void main(String[] args) {
        // Predicate --> Functional Interface (Boolean valued function)
        Predicate<Integer> isEven = x -> x % 2 ==0; // Predicate holds a condition, here storing a condition in a variable(Functional programming)
        System.out.println(isEven.test(4));
        Predicate<String> isWordStartsWithA = x -> x.toLowerCase().startsWith("a");
        Predicate<String> isWordEndsWithA = x -> x.toLowerCase().endsWith("t");
        System.out.println(isWordStartsWithA.test("Ankit"));
        System.out.println(isWordEndsWithA.test("Ankit"));
        Predicate<String> and = isWordStartsWithA.and(isWordEndsWithA);
        System.out.println(and.test("ankit"));
    }
}
