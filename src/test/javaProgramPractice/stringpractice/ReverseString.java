package stringpractice;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
//        String str = "My name is Anthony";
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        //Method 1
        String Str2 = "";
        int len = str.length();
        for(int i=len-1; i >= 0; i--){
           Str2 =  Str2.concat(String.valueOf(str.charAt(i)));
        }
        System.out.println(Str2);

        // Method 2
        String Str3 = "";
        for(int i=0; i < len ; i++){
            Str3 = str.charAt(i) + Str3;
        }
        System.out.println(Str3);

        // Method 3
        String strb = "My name is Anthony";
//        StringBuilder sb = new StringBuilder(strb);
        StringBuffer sb = new StringBuffer(strb);
        sb.reverse();
        System.out.println(sb);
    }

}
