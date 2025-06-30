package stringpractice;

import java.util.HashMap;
import java.util.Map;

public class MostFrequentCharacters {
    public static void main(String[] args) {
        String s1 = "sanjeev";
        String s = "poiuytyuiooiuytyuiooiuytrewdfghjhgfdfghjhgfgbvcvby";
        char[] s1char = s1.toCharArray();
        Map<Character, Integer> map = new HashMap<>();
        for(char c : s1char){
            map.put(c, map.getOrDefault(c,0)+1);
        }
        System.out.println(map);
        int maxFrequency = 0;
        char charWithMaxFrequency = '\0';
        for(Map.Entry<Character, Integer> entry : map.entrySet()){
            char c = entry.getKey();
            int fre = entry.getValue();
            if(fre > maxFrequency || (maxFrequency == fre && c < charWithMaxFrequency)){
                charWithMaxFrequency = c;
                maxFrequency = fre;
            }
        }
        System.out.println(charWithMaxFrequency);

    }
}
