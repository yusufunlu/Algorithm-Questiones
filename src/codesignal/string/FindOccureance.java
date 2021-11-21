package codesignal.string;

/**
 * Created by yusufunlu on 19.04.2021
 */

public class FindOccureance {
    public static void main(String[] ars){

        //strstr("CodefightsIsAwesome","IsA");
        strstr("sst","st");

    }

    public static int strstr(String s, String x) {

        int sizeS =s.length();
        int sizeX = x.length();
        int i=0;

        while(i<sizeS){
            int j=0;
            boolean matched = true;
            while(matched){
                if(j<sizeX&&i<sizeS) {
                    if(s.charAt(i)==x.charAt(j)){
                        j++;
                        i++;
                    } else {
                        matched=false;
                        i++;
                    }
                } else {
                    return i-j;
                }
            }
        }

        return -1;
    }


    int strstr2(String s, String x) {

        // Variables
        String substring = "";

        // Check if it is possible for x to be in s
        if (s.length() < x.length()) return -1;

        for (int i = 0; i < s.length(); i++) {

            // Only check as long as it is possible for x to be in s
            if ((i + x.length() - 1) >= s.length()) return -1;

            // Only bother checking if the first and last letter match
            if (s.charAt(i) == x.charAt(0) && s.charAt(i+x.length()-1) == x.charAt(x.length()-1)) {

                substring = s.substring(i, i+x.length());
                if (substring.equals(x)) return i;


            } // end if statement

        } // end for loop

        return -1;
    }

}
