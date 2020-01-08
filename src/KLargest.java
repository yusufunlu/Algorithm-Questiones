import java.util.Arrays;

public class KLargest {

    public static int[] solution(Integer[] arr, int k) {
        int larges[]  = new int[k];
        Arrays.sort(arr);
        for(int i = 0; i<k;i++) {
            larges[i] = arr[arr.length-i-1];
        }
        return larges;
    }

    public static int[] solution2(int[] arr, int k) {
        int larges[]  = new int[k];
        int larges2[]  = new int[k];

        for(int i=0; i<k-1; i++) {
            for(int j= 0; j<arr.length-1; j++) {
                if(larges[i]<arr[j]) {
                    larges[i] = arr[j];
                }
            }
        }

        for(int i = 0; i<arr.length-1;i++) {
            int temp = 0;
            if(arr[i]> temp) {
                temp = arr[i];
            }

            for(int j = 0; j<k-1;j++) {
            }
        }
        return larges;
    }

    public static void klargest(int[] arr, int k) {
        int temp = 0;
        System.out.println("Started:" );
        System.out.println(Arrays.toString(arr));
        for(int i = 0; i<k; i++) {

            for(int j = i; j<arr.length-1; j++) {
                if( arr[j+1]> arr[i]) {

                    temp = arr[i];
                    arr[i] = arr[j+1];
                    arr[j+1] = temp;
                    System.out.println(Arrays.toString(arr));
                }
            }

        }
    }


    public static void select2(int[] arr, int k) {
        int temp = 0;
        System.out.println("Started:" + Arrays.toString(arr));
        int num = arr.length;
        for (int i = 0; i < ( num - 1 ); i++) {
            for (int j = 0; j < num - i - 1; j++) {
                if (arr[j] > arr[j+1])
                {
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    System.out.println(Arrays.toString(arr));
                }
            }
        }

    }

    public static void main(String[] args) {

        Integer arr[] = new Integer[] { 1, 23, 12, 9, 30, 2, 50 };
        int arr2[] = new int[] { 1, 23, 12, 9, 30, 2, 50 };
        int arr3[] = new int[] { 1, 23, 12, 9, 30, 2, 50 };
        int k = 6;

        //solution(arr,k);
        //solution2(arr2,k);
        klargest(arr2,k);
        //select2(arr3,k);
    }

}
