package codesignal.string;

import java.util.ArrayList;

/**
 * Created by yusufunlu on 21.04.2021
 */

public class TextJustification {


    public static void main(String[] arsg) {

        String[] texts = new String[]{"This", "is", "an", "example", "of", "text", "justification."};

        textJustification(texts,16);
    }

    static String[] textJustification(String[] words, int l) {
        int wordsCount = words.length;

        ArrayList<String> lines = new ArrayList<String>();

        int wordIndex=0;
        int lineIndex =0;
        while(wordIndex<wordsCount){
            int j=0;
            String temp = words[wordIndex];
            //System.out.println("wordIndex: "+ wordIndex+ " j: "+j+" wordsCount: "+wordsCount);
            while(j+wordIndex+1<wordsCount){
                //System.out.println("temp: "+ temp +" word: "+words[wordIndex+j+1]+" j: "+j);
                if(words[wordIndex+j+1].length() + temp.length()<l){
                    j++;
                    temp= temp+" "+words[wordIndex+j];
                } else {
                    break;
                }
            }
            System.out.println("j: "+j+ "line: "+ temp);
            int empty = l-temp.length();
            int tempLength = temp.length();

            StringBuffer sb = new StringBuffer(temp);

            int i=0;

            while(empty>0){
                System.out.println("out i: "+i+ " sb: "+ sb.toString()+" empty: "+ empty);
                if(sb.length()>i){
                    i=0;
                }
                if(sb.charAt(i)==' '){
                    System.out.println("i: "+i+ " sb: "+ sb.toString()+" empty: "+ empty);
                    sb.insert(i+1," ");
                    i++;

                    empty--;
                }
                i++;
            }


            wordIndex+=j;
            lines.add(lineIndex,sb.toString());
            lineIndex++;
            wordIndex++;
        }
        String[] itemsArray = new String[lines.size()];
        itemsArray = lines.toArray(itemsArray);
        return itemsArray;


    }


}
