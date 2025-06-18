package stringpractice;

import java.util.HashSet;
import java.util.Scanner;

public class CharacterFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        HashSet<Character> hs = new HashSet<>();
        for(char character : str.toCharArray()){
            hs.add(character);
        }
        for(char unique: hs){
            int count = 0;
            for (char chars: str.toCharArray()){
                if(unique == chars){
                    count = count+1;
                }
            }
            System.out.println("Character is :- "+unique+" And frequency is :- "+count);
        }

    }
}
