package collectionsPractice.list;

import java.util.Arrays;
import java.util.List;
import java.util.Comparator;



class stringLengthComparator implements Comparator<String> {


    @Override
    public int compare(String o1, String o2) {
        return o1.length() - o2.length();
    }
    // if int is -ve then o1 will come before o2.
    // if int is 0 then o1 & o2 are equal in ordering.
    // if int is +ve then o2 will come before o1.
}

public class ComparatorPractice<S> {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "tea", "banana", "lemon");
        words.sort(null); // here sorting uses comparator with default natural ascending order
        System.out.println(words);

        //Comparator is an interface which is used for customized sorting(not natural ordering).Also, when we want to sort along multiple fields.
        // It is a functional interface.
        // Means we can use lambda expression and need to implement the compare method from Comparator interface.
        words.sort((a,b) -> b.length() - a.length());
        System.out.println(words);

        words.sort(new stringLengthComparator());
        System.out.println(words);
    }
}
