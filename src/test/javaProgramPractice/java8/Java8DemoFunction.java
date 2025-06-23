package java8;

import java.util.function.Function;

public class Java8DemoFunction {
    public static void main(String[] args) {
        //Function --> work for you
        //Only apply is abstract method rest methods are default
        //Function<Input, Output>
        Function<Integer,Integer> doubleIt = x -> x*2;
        System.out.println(doubleIt.apply(100)); //200
        Function<Integer,Integer> tripleIt = x -> x*3;
        System.out.println(tripleIt.apply(100)); //300
        System.out.println(doubleIt.andThen(tripleIt).apply(20)); //120 first double and then triple
        System.out.println(doubleIt.compose(tripleIt).apply(20)); //120 first triple and then double

        Function<Integer, Integer> identity = Function.identity();
        System.out.println(identity.apply(5)); // 5
    }
}
