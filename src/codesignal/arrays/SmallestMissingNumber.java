package codesignal.arrays;

/**
 * Created by yusufunlu on 18.04.2021
 */

public class SmallestMissingNumber {

    int findSmallestMissingNumber(int[] input){

        boolean[] flags = new boolean[input.length];
        for (int number : input) {
            if (number < flags.length) {
                flags[number] = true;
            }
        }

        for (int i = 0; i < flags.length; i++) {
            if (!flags[i]) {
                return i;
            }
        }
        return 0;
    }


}
