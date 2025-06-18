package stringpractice;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class RemoveDuplicateCharacters {
    public static void main(String[] args) {
        String str = "lkjhghjasdfdsasdsasdsasdasdbhukokoklkjhjlkj";
        HashSet<Character> hs = new LinkedHashSet<>();
        for(Character ch: str.toCharArray()){
            hs.add(ch);
        }
        System.out.println(hs);
        String str1 = "";
        for(Character chh : hs){
            str1 = str1+chh;
        }
        System.out.print(str1);
    }
}
