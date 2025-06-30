package arraypractice;

import java.util.Arrays;
import java.util.List;

public class KadanesAlgorithmMaxSubArray {
    public static void main(String[] args) {
        int[] num = {-2,1,-3,5,-1,2,1,-5,4};
        //output : 6 with 4,-1,2,1
        System.out.println(findMaxSumSubArray(num));
        System.out.println(Arrays.toString(findSubArray(num)));
    }
    public static int findMaxSumSubArray(int[] array){
        int maxSum = array[0];
        int currentSum = array[0];
        for(int i=1; i< array.length; i++){
            currentSum = Math.max(array[i], currentSum+array[i]);
            maxSum = Math.max(maxSum, currentSum);
        }
        return maxSum;
    }
    public static int[] findSubArray(int[] nums){
        int maxSum = nums[0];
        int currentSum = nums[0];
        int start=0, end=0, tempStart = 0;

        for(int i=1; i< nums.length; i++){
            if(nums[i] > currentSum+nums[i]){
                currentSum = nums[i];
                tempStart = i;
            }else{
                currentSum = currentSum + nums[i];
            }
            if(currentSum > maxSum){
                maxSum = currentSum;
                start = tempStart;
                end = i;
            }
        }
        return Arrays.copyOfRange(nums, start, end+1);
    }
}
