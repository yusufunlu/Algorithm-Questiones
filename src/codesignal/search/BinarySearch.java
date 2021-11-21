package codesignal.search;

/**
 * Created by yusufunlu on 25.05.2021
 */

public class BinarySearch {

    int binarySearch(int arr[], int x) {
        int startIndex = 0, length = arr.length - 1;

        int count =0;
        while (startIndex <= length) {
            System.out.println("count: "+ ++count);
            int mid = startIndex + (length - startIndex) / 2;

            if (arr[mid] == x) return mid;

            // x ortanca değerden büyükse, sol yarıyı görmezden gelir
            if (arr[mid] < x){
                startIndex = mid + 1;
            } else {
                length = mid - 1;
            }
        }

        return -1;
    }

    public static void main(String args[]) {
        BinarySearch search = new BinarySearch();
        int arr[] = { 1, 3, 5, 7, 9,11 };
        int n = arr.length;
        int x = 7;
        int result = search.binarySearch(arr, x);
        if (result == -1)
            System.out.println("Element not present");
        else
            System.out.println("Element found at "
                    + "index " + result);
    }

}
