package codesignal.string;

import java.util.Locale;

/**
 * Created by yusufunlu on 19.04.2021
 */

public class AmendSentence {

    static String amendTheSentence(String s) {

        int size = s.length();
        char[] chars = new char[2*size];

        int j=0;
        for(int i=0;i<size;i++){
            if(s.charAt(i)>='A' && s.charAt(i)<='Z'){
                chars[i+j]=' ';
                chars[i+j+1]=Character.toLowerCase(s.charAt(i));
                j++;
            } else {
                chars[i+j]= s.charAt(i);
            }
        }

        String result =  String.copyValueOf(chars, 0, size+j);
        System.out.println("chars: "+ result);
        return result;
    }

    static String amendTheSentence2(String s) {
        String[] split = s.split("(?=[A-Z])");
        String result = String.join(" ", split).toLowerCase(Locale.ENGLISH);

        return result;
    }

    public static void main(String[] ars){

        //amendTheSentence("CodesignalIsAwesome");
        amendTheSentence2("CodesignalIsAwesome");
    }
}
