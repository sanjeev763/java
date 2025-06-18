package stringpractice;
import java.util.Arrays;
import java.util.Scanner;

public class StringAnagram {
    public static void main(String[] args) {
        System.out.println("Check anagram");
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();

        if(str1.length() != str2.length()){
            System.out.println("Length is not equal, Not anagram");
        } else{
            char[] c1 = str1.toCharArray();
            char[] c2 = str2.toCharArray();
            Arrays.sort(c1);
            Arrays.sort(c2);
            System.out.println(Arrays.equals(c1, c2));
        }
    }
}
