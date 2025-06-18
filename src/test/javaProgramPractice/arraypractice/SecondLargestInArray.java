package arraypractice;

import java.util.Arrays;

public class SecondLargestInArray {
    public static void main(String[] args) {
        int[] arr = {10,5,10,12,32,432};
        int temp;
//        Arrays.sort(arr);
//        System.out.println("Second Largest Ele -: "+arr[arr.length-2]);
        for(int i=0; i< arr.length;i++){
            for(int j=i+1; j< arr.length; j++){
                if(arr[i] > arr[j]){
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        if(arr[arr.length-2] == arr[arr.length-1])
            System.out.println(arr[arr.length-3]);
        else
            System.out.println(arr[arr.length-2]);
    }
}
