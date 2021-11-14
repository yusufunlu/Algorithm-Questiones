import java.io.IOException;

/**
 * yusufu 1/16/2020 .
 */
public class CountPalindrome {

    public static int countPalindromes(String s) {
        // Write your code here
        int count =0;
        int length = s.length();
        for(int i =0;i<length; i++) {
            for(int j=1; j<length-i+1;j++) {
                System.out.println("i: " + i + "- j: "+j);
                if(s.substring(i,i+j).equals(s.substring(length-i-j,length-i ))) {
                    count++;
                    System.out.println("first: "+ s.substring(i,i+j));
                } else {
                    //System.out.println("first: "+ s.substring(i,i+j));
                }
            }
        }
        return count;
    }
    public static void main(String[] args) throws IOException {

        int result = countPalindromes("abccba");
        System.out.println(result);
    }
}
