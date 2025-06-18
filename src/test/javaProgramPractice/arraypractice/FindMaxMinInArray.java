package arraypractice;

import java.util.Arrays;

public class FindMaxMinInArray {
    public static void main(String[] args) {
        int[] arr = {21,43,23,52,12,1,45,23};
        int len = arr.length;
        Arrays.sort(arr);
//        Arrays.spliterator(arr);
        System.out.println("Min Val "+arr[0]);
        System.out.println("Max Val "+arr[len-1]);
    }
}
