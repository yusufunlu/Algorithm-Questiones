package codesignal.string;

import java.util.Arrays;

/**
 * Created by yusufunlu on 18.04.2021
 */

public class FindAnagram {

    static int makeAnagram(String a, String b) {

        int[] aCharMap = new int[26];
        int[] bCharMap = new int[26];
        int[] map = new int[26];
        int total2=0;
        int sizeA = a.length();
        int sizeB = b.length();
        int total = 0;
        for(int i=0;i<sizeA;i++){
            System.out.println("diff: "+(a.charAt(i)-'a')+" a: "+a.charAt(i));
            map[a.charAt(i)-'a']++;
        }

        for(int i=0;i<sizeB;i++){
            System.out.println("diff: "+(b.charAt(i)-'a')+" b: "+b.charAt(i));
            map[b.charAt(i)-'a']--;
        }

        for (int i=0;i<26;i++){
            //total+=Math.abs(aCharMap[i]-bCharMap[i]);
            total+=Math.abs(map[i]);
        }


        System.out.println("acharmap: "+ Arrays.toString(aCharMap));
        System.out.println("bcharmap: "+ Arrays.toString(bCharMap));
        System.out.println("total: "+ total);
        return total;

    }

    public static void main(String[] arg){
        String a= "cde";
        String b= "abc";
        makeAnagram(a,b);
    }
}
