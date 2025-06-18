package stringpractice;

import java.util.Arrays;

public class Prac1 {
    public static void main(String[] args) {
        //rev a string
        String str = " sanjeev kumar singh ";
        StringBuilder revstr = new StringBuilder();
        int len = str.length();
        for(int i=len-1; i >= 0; i--){
            revstr.append(str.charAt(i));
        }
//        System.out.println(revstr);

        // rev only character in string
        String str1 = str.trim();
        int spaceCount = 0;
        for(char ch:str1.toCharArray()){
            if(ch == ' '){
                spaceCount = spaceCount+1;
            }
        }
//        System.out.println("Space count is -"+spaceCount);
        String[] strArr = str1.split(" ");
//        System.out.println("Splited strings :: "+ Arrays.toString(strArr));
        StringBuilder result = new StringBuilder();

        for(int i=0; i< strArr.length; i++){
                if(i==0){
                    StringBuilder preResult = new StringBuilder(strArr[i]);
                    result = preResult.reverse();
//                    System.out.println("Result - "+result);
                }else{
//                    System.out.println("i = "+i);
                    StringBuilder sb = new StringBuilder(strArr[i]);
                    sb.reverse();
                    result = new StringBuilder(result + " " + sb);
//                    System.out.println(result);
                }
                spaceCount--;
//                System.out.println("spc - "+spaceCount);
        }
        System.out.println("Result is - :: "+result);
    }

}
