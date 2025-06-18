package stringpractice;

import java.util.Scanner;

public class PalindromeString {
    public static boolean checkpalindrome(String str){
        int len = str.length();
        int k = len-1;
        for(int i=0; i < len/2; i++){
            if(str.charAt(i) == str.charAt(k)){
                --k;
                return true;
            }
        }
        return false;
    }
    public static boolean isPalindrome(String str){
        StringBuffer sb = new StringBuffer(str);
        sb.reverse();
        if(str.equals(sb)){
            return true;
        }
        else{
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(checkpalindrome(s));
        System.out.println(isPalindrome(s));
    }
}
