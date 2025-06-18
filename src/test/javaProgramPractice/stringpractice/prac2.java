package stringpractice;

import java.util.Arrays;

//Rev string with space and double space intact
public class prac2 {
    public static void main(String[] args) {
        String original = "sanjeev ki  shadi neha ke  sang";
        StringBuilder reversed = new StringBuilder();
        String[] orgArr = original.split("  ");//[sanjeev, ki shadi neha ke, sang]
        for(int index = 0; index < orgArr.length; index++){
            StringBuilder sb = new StringBuilder(orgArr[index]);
            sb.reverse();
            if(index == 0) {
                reversed.append(sb);
            }else{
                reversed = new StringBuilder(reversed + "  " + sb);
            }
//            String[] var = varArr.split(" ");
        }
        System.out.println("Reversed string :: "+reversed);

    }
}
