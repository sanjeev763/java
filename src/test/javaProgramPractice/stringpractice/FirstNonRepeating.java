package stringpractice;

import java.util.LinkedHashSet;
import java.util.Set;

public class FirstNonRepeating {
   /* Write a method which return the first non-repeating character as string from the passed input.
   while calculating the repeatation case sensitivity should be ignored but while returning the string it should be
   as passed in original string.

   If no non-repeating character is found in string return "".

      Use case:
      1 passed "a", output = "a"
      2 passed "stress" output = "t"
      3 passed "sTreSs" output = "T" (Case sensitive)
    */
    public static String firstNonRepeating(String str){
        char identified='\0';
        String duplicate = str.toLowerCase();
        Set<Character> lhs = new LinkedHashSet<>();
        if(str.length()==1){
            return str;
        }

        for(Character ch: duplicate.toCharArray()){
            lhs.add(ch);
        }
        System.out.println(lhs);
        for(char c1:lhs){
            int count =0;
            for(char c2: duplicate.toCharArray()){
                if(c1==c2){
                    count = count+1;
                }
            }
            if(count==1){
                identified = c1;
                break;
            }
        }
        for(int i=0; i< duplicate.length();i++){
            if(identified == duplicate.charAt(i)){
                return String.valueOf(str.charAt(i));
            }
        }


        return "";
    }
    public static void main(String[] args){
        System.out.println(firstNonRepeating("a"));
        System.out.println(firstNonRepeating("stress"));
        System.out.println(firstNonRepeating("sTreSs"));

    }
}
