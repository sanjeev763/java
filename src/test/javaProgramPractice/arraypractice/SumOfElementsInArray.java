package arraypractice;

public class SumOfElementsInArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int sum = 0;
        for(int ele: arr){
            sum = sum+ele;
        }
        System.out.println(sum);
    }
}
