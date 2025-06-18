package arraypractice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindLargestWordInDictByDeleting {
    /*
    Giving a dictionary and a string ‘str’, find the longest
    string in dictionary which can be formed by deleting some characters of the given ‘str’.
    Input : dict = {"ale", "apple", "monkey", "plea"}
        str = "abpcplea"
    Output : apple

    Input  : dict = {"pintu", "geeksfor", "geeksgeeks",
                                        " forgeek"}
         str = "geeksforgeeks"
    Output : geeksgeeks
     */
    public static String largestWordInDict(String[] input, String dictWord) {
        List<String> validString = new ArrayList<>();
        String maxLengthString = "";
        boolean status = false;
        for(String s : input) {
            for (int i = 0; i < s.length(); i++) {
//                System.out.println(s.charAt(i));
                int index = 0;
                status = true;
                for(int j = index; j < dictWord.length(); j++){
                    if(dictWord.charAt(j) == s.charAt(i)){
//                        System.out.println("i : "+i+", j : "+j);
                        index = j+1;
//                        System.out.println("index : "+index);
                        break;
                    }else if(j==dictWord.length()-1){
                        System.out.println("String not found - "+s);
                        status = false;
                    }
                }
            }
            if(status)
                validString.add(s);
            System.out.println(validString);
            for(String st: validString){
                if(st.length() > maxLengthString.length()){
                    maxLengthString = st;
                }
            }

        }
        return maxLengthString;
    }

    public static void main(String[] args) {
        String[] input1 = {"ale", "apple", "plea"};
        String str1 = "abpcplea";
        String[] input2 = {"pintu", "geeksfor", "geeksgeeks", "forgeek"};
        String str2 = "geeksforgeeks";

        System.out.println(largestWordInDict(input1, str1));
        System.out.println(largestWordInDict(input2, str2));
    }
}
