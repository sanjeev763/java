package stringpractice;

import java.util.Scanner;

public class ValidateIpAddress {
    /*
    Validate if -
    it contains only digits - done
    it is in the range 0-255
    00,05,001 type is not present
    Number of dot delimiter is correct - done
    Use case -
        String ip1 = "128.0.0.1";
        String ip2 = "125.16.100.1";
        String ip3 = "125.512.100.1";
        String ip4 = "125.512.100.abc";
     */
    public static boolean validate(String input){
        int count_dot = 0;
        for(Character ch: input.toCharArray()){
            if(ch == '.'){
                count_dot+=1;
            }
        }
        if(count_dot != 3){
            return false;
        }

        String[] duplicate_input = input.split("\\.");
        for(String s: duplicate_input){
            for(int i = 0; i< s.length(); i++){
               if(!(s.charAt(i)-'0' >= 0 && s.charAt(i)-'0' <=9)){
                   // && (0<= Integer.parseInt(s) <= 255)
                  return false;
               }
            }
        }


        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

    }
}
