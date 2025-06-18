package arraypractice;

public class CheckPalindromeArray {
    //if {1,2,3,2,1} --> true
    public static boolean checkPalindrome(int[] arr){
        int partition = arr.length/2;
        for(int i =0; i< partition; i++){
            if(arr[i] != arr[arr.length-1-i]){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,2,1};
        System.out.println(checkPalindrome(arr));
    }


}
