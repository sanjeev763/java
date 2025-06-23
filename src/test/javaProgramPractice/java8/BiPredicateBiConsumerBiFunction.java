package java8;

import java.util.function.*;

public class BiPredicateBiConsumerBiFunction {
    public static void main(String[] args) {
        BiPredicate<Integer, Integer> isSumEven = (x, y) -> (x+y) % 2 == 0;
        System.out.println(isSumEven.test(10, 5));

        BiConsumer<Integer, String> biConsumer = (x, y) -> {
            System.out.println(x);
            System.out.println(y);
        };
        biConsumer.accept(3,"test");

        BiFunction<String, String, Integer> biFunction = (x,y) -> (x+y).length();
        System.out.println(biFunction.apply("sanju", "neh"));

        //UnaryOperator
        UnaryOperator<Integer> a = x -> 2 * x;
        BinaryOperator<Integer> b = (x,y) -> x + y;
        System.out.println(a.apply(5));
        System.out.println(b.apply(5,4));
    }
}
