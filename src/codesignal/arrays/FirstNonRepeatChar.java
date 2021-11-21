package codesignal.arrays; /**
 * Created by yusufunlu on 16.04.2021
 */

public class FirstNonRepeatChar {
    // Function to print elements with no duplicates
    static char findFirstNonRepeatingChar(String s){
        int i,j;
        int count;
        int size = s.length();
        char result = '_';

        boolean[] flag = new boolean[size];
        for(i=0; i<size; i++){
            if(!flag[i]){
                count  = 1;
                for(j=i+1; j<size;j++){
                    if(s.charAt(j) == s.charAt(i))
                    {
                        count++;
                        flag[j] = true;
                    }
                }
                if(count==1){
                    System.out.println("non repeated: "+s.charAt(i));
                    result = s.charAt(i);
                    break;
                }
            }
        }
        return result;
    }

    static char findFirstUniqChar(String s){

        int[] count = new int[26];
        int size = s.length();
        for(int i=0;i<size;i++){
            count[s.charAt(i)-'a']++;
        }
        for(int i=0;i<size;i++){
            int index = s.charAt(i)-'a';
            if(count[index]==1){
                return s.charAt(i);
            }
        }
        return '_';
    }


    // Function to read input
    public static void main(String[] args) {
        String s = "abacabad";
        System.out.println("The elements are ");
        char result = findFirstNonRepeatingChar(s);
        System.out.println("result: "+ result);
    }
}
