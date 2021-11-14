import java.io.*;

/**
 * yusufu 1/16/2020 .
 */


class Result {

    /*
     * Complete the 'fourthBit' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER number as parameter.
     */

    public static int fourthBit(int number) {
        // Write your code here
        int index = 1;

        int result = (number % 16) / 8;
        return result;
    }

}

public class Fourth {
    public static void main(String[] args) throws IOException {

        int result = Result.fourthBit(32);
        System.out.println(result);
    }
}