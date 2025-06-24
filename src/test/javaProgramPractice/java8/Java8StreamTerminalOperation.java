package java8;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Java8StreamTerminalOperation {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3);

        //1. collect
        list.stream().skip(1).collect(Collectors.toList());
        list.stream().skip(1).toList();

        //2. forEach
        list.stream().forEach(x -> System.out.println(x));

        //3. reduce : combines elements to produce a single result
        Optional<Integer> optionalInteger = list.stream().reduce((x, y) -> x + y); // optional is a container which may or may not have a value
        System.out.println(optionalInteger.get());

        //4. count

        //min, max

        //toArray

        //----------- short circuit operation(As soon as it finds the matching result it stops processing further) ----------------------//
        //5. anyMatch, allMatch, noneMatch
        boolean b = list.stream().anyMatch(x -> x % 2 == 0);
        System.out.println(b); // true
        boolean c = list.stream().allMatch( x -> x>0);
        System.out.println(c); // true
        boolean d = list.stream().noneMatch(x -> x < 0);
        System.out.println(d); // true

        //6. findFirst, findAny
        System.out.println(list.stream().findFirst().get());
        System.out.println(list.stream().findAny().get()); // it will bring any value from the list

        //Example : Filtering and collecting names
        List<String> namelist = Arrays.asList("Anna", "Bob", "Charlie", "David");
        System.out.println(namelist.stream().filter(x -> x.length() > 3).toList());

        //Example : square and sort
        List<Integer> intList = Arrays.asList(4,9,1,6,2,5);
        System.out.println(intList.stream().map(x -> x*x).sorted().toList());

        //Example : Summing of numbers
        System.out.println(intList.stream().reduce((x,y) -> x+y).get()); //27

        //Example : count the number of occurrence for a character
        String s = "Hello world";
        char[] charArray = s.toCharArray();
        //Arrays.stream(charArray) --> Arrays has stream methods but not for char so this is incorrect to write
        System.out.println(s.chars().filter(x -> x == 'l').count()); // .chars() created stream of integers and we can play with the ASCII value of char here

        //Stateful & stateless
        //stateful - keeps other elements under consideration (like Filtering string on the basis of length)
        //stateless - Doesn't bother about the other elements (like doing square of numbers using map)

        //If any terminal operation is already used on any stream then it means that stream has been consumed
        //and we can't reuse the same stream further.
        Stream<String> stream = namelist.stream();
        stream.forEach(System.out::println);
        stream.map(String::toUpperCase); //illegalStateException : stream has already been operated upon or closed
    }
}
