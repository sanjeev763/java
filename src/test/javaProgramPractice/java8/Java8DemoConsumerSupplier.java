package java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Java8DemoConsumerSupplier {
    public static void main(String[] args) {
        //Consumer
        //It consumes but do not return anything
        Consumer<Integer> print = x -> System.out.println(x); // using lambda expression
        Consumer<Integer> print1 = System.out::println; // using Method reference
        print.accept(50);
        print1.accept(51);
        List<Integer> list = Arrays.asList(1,2,3,4);
        Consumer<List<Integer>> newList = x -> {
                for(int i : x){
                    System.out.println(i);
                }
        };
        newList.accept(list);


        //Supplier<ReturningType>
        //It does not take anything but return
        Supplier<String> helloworld = () -> "Hello World";
        System.out.println(helloworld.get());

        //Combined Example
        Predicate<Integer> predicate = x -> x % 2 == 0;
        Function<Integer, Integer> function = x -> x * x;
        Consumer<Integer> consumer = x -> System.out.println(x);
        Supplier<Integer> supplier = () -> 100;
        if(predicate.test(supplier.get())){
            consumer.accept(function.apply(supplier.get()));
        }

    }
}
