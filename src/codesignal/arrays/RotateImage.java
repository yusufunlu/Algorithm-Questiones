package codesignal.arrays;

/**
 * Created by yusufunlu on 17.04.2021
 */

public class RotateImage {

    public static int[][] rotateImageClockwise(int[][] a) {

        int size = a.length;
        //int temp;
        int[][] newArray = new int[size][size];

        for (int i = 0; i < size / 2; i++)
        {
            System.out.println("i: "+i);
            for (int j = i; j < size - i - 1; j++)
            {
                System.out.println("j: "+j);
                // Swap elements of each cycle
                // in clockwise direction
                int temp = a[i][j];
                a[i][j] = a[size - 1 - j][i];
                a[size - 1 - j][i] = a[size - 1 - i][size - 1 - j];
                a[size - 1 - i][size - 1 - j] = a[j][size - 1 - i];
                a[j][size - 1 - i] = temp;
                printMatrix(a);
            }
        }

        System.out.println("rotate done");
        printMatrix(a);
        return newArray;
    }

    public static int[][] rotateImageAntiClockwise(int[][] a) {

        int size = a.length;
        //int temp;
        int[][] newArray = new int[size][size];

        for (int i = 0; i < size / 2; i++)
        {
            System.out.println("i: "+i);
            for (int j = i; j < size - i - 1; j++)
            {
                // Swap elements of each cycle
                // in anti clockwise direction
                int temp = a[i][j];
                a[i][j] = a[j][size - 1 - i];
                a[j][size - 1 - i] = a[size-1-i][size - 1 - j];
                a[size-1-i][size - 1 - j] = a[size-1-j][i];
                a[size-1-j][i] = temp;

                printMatrix(a);
            }
        }

        System.out.println("rotate done");
        printMatrix(a);
        return newArray;
    }

    public static void main(String[] args) {
        int[][] arr = new int[4][4];
        int counter = 1;
        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                arr[i][j] = counter;
                counter++;
            }
        }
        printMatrix(arr);
        //rotateImageClockwise(arr);
        rotateImageAntiClockwise(arr);
    }

    static void printMatrix(int arr[][])
    {
        System.out.println("***********");
        int n=arr.length;
        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < n; j++)
                System.out.print( arr[i][j] + " ");
            System.out.println();
        }
    }
}
