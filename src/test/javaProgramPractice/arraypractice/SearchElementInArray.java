package arraypractice;

public class SearchElementInArray {
    //Search an element in array and return its index and if not found display a message

    public int returnIndex(int[] arr, int ele) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == ele) {
                return i;
            }
            }
        return -1;
    }

    public static void main(String[] args) {
        int searchEle = 67;
        int[] arr = {1,12,44,67,98,110};
        SearchElementInArray se = new SearchElementInArray();
        int val = se.returnIndex(arr, searchEle);
        System.out.println(val);
        if(val == -1)
            System.out.println("Search element is not found");

    }
}
