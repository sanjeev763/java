package arraypractice;

import java.util.Arrays;

public class RotateArray {
    public static int[] rotateArray(int[] arr, int step){
        int[] newArr = new int[arr.length];
        int k=0;
        for(int i=arr.length-step; i<= arr.length-1; i++){
            newArr[k] = arr[i];
            ++k;
        }
        for(int i=0; i< arr.length-step; i++){
            newArr[k] = arr[i];
            ++k;
        }
        return newArr;
    }
    //To the right by 4 steps
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16};
        int[] rotatedArr = rotateArray(arr, 6);
        System.out.println(Arrays.toString(rotatedArr));
    }
}
