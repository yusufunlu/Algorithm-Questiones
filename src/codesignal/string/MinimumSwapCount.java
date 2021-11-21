package codesignal.string;

import java.util.Arrays;

/**
 * Created by yusufunlu on 18.04.2021
 */

public class MinimumSwapCount {

    static int minimumSwaps(int[] arr) {

        int i =0;
        int count=0;
        int temp;
        int  size = arr.length;
        while(i<size){
            if(arr[i] != i+1){
                temp = arr[i];
                System.out.printf("swap: %d-%d \n",i,temp-1);
                arr[i] = arr[temp-1];
                arr[temp-1]=temp;
                System.out.println("arr: "+ Arrays.toString(arr));

                count++;
            }
            else{
                i++;
            }
        }
        return count;
    }

    public static void main(String[] arg){
        int[] numbers = new int[] {2,3, 4, 1, 5};
        //int[] numbers = new int[] {1, 3, 5, 2, 4, 6, 7};
        minimumSwaps(numbers);
    }
}
