public class SingleNumber {

    public static int solution(int[] A) {
        // write your code in Java SE 8
        int single = 0;
        for(int n: A) {
            single^=n;
        }
        return single;
    }

    public static void main(String args[])
    {
        int arr[] = {3, 4, 5, 3, 4, 1};
        System.out.println("The element with single occurrence is " + solution(arr));
    }

}
