package arraypractice;

import java.sql.Array;

public class MergeTwoArrays {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,5,6};
        int[] arr2 = {8,9,10,11,12};
        int k=0;
        int totalLen = arr1.length + arr2.length;
        int[] mergedArr = new int[totalLen];
        for(int i=0; i< arr1.length; i++){
            mergedArr[i] = arr1[i];
        }
        for(int i=arr1.length; i< totalLen; i++){
            mergedArr[i] = arr2[k];
            k++;
        }
        for(int j: mergedArr){
            System.out.println(j);
        }

        // 2nd Method
        System.arraycopy(arr1, 0, mergedArr, 0, arr1.length);
        System.arraycopy(arr2, 0, mergedArr, 5, arr2.length);
        for(int j: mergedArr){
            System.out.println(j);
        }


    }
}
