package codesignal.string;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by yusufunlu on 21.04.2021
 */

public class ClassifyStrings {

    public static void main(String[] args){

        String result = classifyStrings("typ?asdf?relkhfd");
        System.out.println(result);
    }

    static String classifyStrings(String s) {

        int size = s.length();
        int vowelSequenceCount = 0;
        int consonantSequenceCount = 0;
        int questionMarkCount =0;
        String result = "good";
        for(int i=0;i<size;i++){
            boolean isVowel = isVowel(s.charAt(i));
            if(isVowel){
                vowelSequenceCount++;
                consonantSequenceCount=0;
                System.out.println("vowelSequenceCount: "+ vowelSequenceCount);
                if(vowelSequenceCount>2){
                    return "bad";
                }else if(vowelSequenceCount+questionMarkCount>2){
                    result= "mixed";
                }

            } else {
                if(s.charAt(i)=='?'){
                    questionMarkCount++;

                    if(consonantSequenceCount>4){
                        System.out.println("questionMarkCount: "+ questionMarkCount);
                        return "bad";
                    } else if(vowelSequenceCount>2){
                        System.out.println("questionMarkCount: "+ questionMarkCount);
                        return "bad";
                    }  else if(consonantSequenceCount+questionMarkCount>4){
                        result= "mixed";
                    }  else if(vowelSequenceCount+questionMarkCount>2){
                        result= "mixed";
                    }
                } else {
                    //consonant broke the sequence of vowels
                    vowelSequenceCount=0;
                    consonantSequenceCount++;
                    if(consonantSequenceCount>4){
                        System.out.println("consonantSequenceCount: "+ consonantSequenceCount);
                        return "bad";
                    } else if(consonantSequenceCount+questionMarkCount>4){
                        result= "mixed";
                    }
                }

            }

        }
        return result;
    }


    static boolean isVowel(char c){
        char[] vowels = new char[]{'a', 'e', 'i', 'o', 'u'};
        for(int i=0;i<vowels.length;i++){
            if(vowels[i]==c) return true;
        }
        return false;
    }


    String classifyStrings2(String s) {
        if(s.indexOf('?') == -1) return classify(s);
        String con = classifyStrings(s.replaceFirst("\\?", "b"));
        String vow = classifyStrings(s.replaceFirst("\\?", "a"));
        if(con.equals(vow)){
            return con;
        }
        return "mixed";
    }

    String classify(String s){
        int vowelCount = 0;
        int conCount = 0;

        Set<Character> vowels = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u'));

        for(char c : s.toCharArray()){
            if(vowels.contains(c)){
                vowelCount ++;
                conCount = 0;
            }
            else{
                conCount++;
                vowelCount = 0;
            }

            if(vowelCount >= 3 || conCount >= 5){
                return "bad";
            }
        }

        return "good";
    }

}

