package arraypractice;

import java.util.Arrays;
import java.util.List;

public class ProductOfArrayExceptSelf {
    public static void main(String[] args) {
        int[] nums = {2,3,4,5,6,7,8};
        System.out.println(Arrays.toString(productOfArray(nums)));
        System.out.println(Arrays.toString(productOfArrayWithoutDiv(nums)));
    }
    public static int[] productOfArrayWithoutDiv(int[] nums){
        int k = 0;
        int[] tempArr = new int[nums.length];
        for(int i=0; i < nums.length; i++){
            int product = 1;
            if(i != 0) {
                //left side
                for (int j = i-1; j < i; j--) {
                    if(j < 0){
                        break;
                    }
                    product = product * nums[j];

                }
            }
            if(i != nums.length-1) {
                //right side
                for (int j = i+1; j < nums.length; j++) {
                    product = product * nums[j];

                }
            }
            tempArr[k] = product;
            ++k;
        }

        return tempArr;
    }
    public static int[] productOfArray(int[] nums){
        int[] tempArr = new int[nums.length];
        int product = 1;
        for(int num : nums){
            product = product*num;
        }
        for(int i = 0; i < nums.length; i++){
            tempArr[i] = product/nums[i];
        }
        return tempArr;
    }

}
