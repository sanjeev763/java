package arraypractice;

public class CountEvenOddinArray {
    public static void main(String[] args) {
        int[] arr = {10,2,21,0,98,384,234,134,244,53,33,31,53};
        int evenCount = 0;
        int oddCount = 0;
        for(int a : arr){
            if(a%2==0){
                ++evenCount;
            }else{
                ++oddCount;
            }
        }
        System.out.println(evenCount);
        System.out.println(oddCount);
    }
}
