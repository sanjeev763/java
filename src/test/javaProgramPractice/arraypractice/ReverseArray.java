package arraypractice;

public class ReverseArray {
    //Without using additional array
    public static void main(String[] args) {
        int[] arr = {21,12,20, 43,55,7654,34,2,10};
        int arrLen = arr.length;
        int x;
        for(int i=0; i < arrLen/2; i++){
            x = arr[i];
            arr[i] = arr[arrLen-1-i];
            arr[arrLen-1-i] = x;
        }

        for(int a : arr)
            System.out.println(a);


    }

}
