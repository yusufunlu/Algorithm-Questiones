package codesignal;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by yusufunlu on 14.04.2021
 */

public class RegexExample {

    /*
    (?!) - negative lookahead  /foo(?!bar)/
    (?=) - positive lookahead  /foo(?=bar)/
    (?<=) - positive lookbehind /(?<=foo)bar/
    (?<!) - negative lookbehind  /foo(?!bar)/
    (?>) - atomic group
    (?:regex) Non-capturing group
    */

    public static void main(String args[]) {
        String sentence = "CodeFight On";
        //String result = swapAdjacentWords(sentence);
        //System.out.println("result: "+ result);

        nthNumber("8one 003number 201numbers li-000233le number444",3);
    }


    public static String swapAdjacentWords(String s) {
        Pattern p = Pattern.compile("\\w+\\b");
        Matcher m = p.matcher(s);
        System.out.println(m.find());
        System.out.println(m.matches());
        return s.replaceAll("(\\w+\\b)\\s+(\\w+\\b)", "$2 $1");
    }

    public static String nthNumber(String s, int n) {
        //Pattern pattern = Pattern.compile(    "(\\w+\\s){"+n+"}.+0+([1-9]+)");
        Pattern pattern = Pattern.compile("(?:(?:\\D*)0*(\\d+)){"+(n)+"}.*");
        //pattern = Pattern.compile("(?:[^1-9]*([0-9]+)){3}");
        Matcher matcher = pattern.matcher(s);
        matcher.find();
        System.out.println("group1:"+matcher.group(1));

        Map<Character, Integer> countsMap = new HashMap<>();

        return "";
    }

    String mergeStrings(String s1, String s2) {
//find total repeated words count in s1 and s2 strings
        Map<Character, Integer> countsMap1 = new HashMap<>();
        Map<Character, Integer> countsMap2 = new HashMap<>();

        for (int i = 0; i < s1.length(); i++){
            char c = s1.charAt(i);
            if(countsMap1.containsKey(c)){
                countsMap1.put(c, (countsMap1.get(c)+1));
            } else {
                countsMap1.put(c, 1);
            }
        }

        for (int i = 0; i < s2.length(); i++){
            char c = s2.charAt(i);
            if(countsMap2.containsKey(c)){
                countsMap2.put(c, (countsMap2.get(c)+1));
            } else {
                countsMap2.put(c, 1);
            }
        }

        final int[] max1 = {0};
        countsMap1.entrySet().forEach(entry -> {
            if(max1[0] <entry.getValue()){
                max1[0] = entry.getValue();
            }
            System.out.println(entry.getKey() + " " + entry.getValue());
        });

        final int[] max2 = {0};
        countsMap2.entrySet().forEach(entry -> {
            if(max2[0] <entry.getValue()){
                max2[0] = entry.getValue();
            }
            System.out.println(entry.getKey() + " " + entry.getValue());
        });

        if(max1[0] > max2[0]){
            return s1+s2;
        } else {
            return s2+s1;
        }


    }
        //a: [4, 0, 1, -2, 3]

    int[] mutateTheArray(int n, int[] a) {
        int b[] = new int[n];

        for(int i=0;i<n;i++){
            int param1 = i>0?a[i - 1]:0;
            int param2 = (i+1)<n?a[i + 1]:0;
            b[i] =  param1 + a[i] + param2;
        }
        return b;
    }


}
