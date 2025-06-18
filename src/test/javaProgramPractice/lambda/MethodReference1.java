package lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class MethodReference1 {
    private static final List<String> list = new ArrayList<>();
    public static void main(String[] args) {
        //without method reference
       // StringOperation so = s -> System.out.println(s);
       // so.accept("sanju");

        //with method reference
       // StringOperation so1 = System.out::println;
       // so1.accept("neha");

//        StringOperation so2 = Objects::isNull;
//        System.out.println( so2.accept("sasa") );

        //(s) -> s.toUpperCase();
//        StringOperation so3 = String::toUpperCase;
//        System.out.println( so3.accept("jaja") );

//        StringOperation so3 = String::concat;
//        System.out.println(so3.accept("ab","cd"));

        StringOperation so4 = list::add;
        so4.accept("sanju");
        System.out.println(list);

    }
}
