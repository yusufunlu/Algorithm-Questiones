package codesignal.string;

/**
 * Created by yusufunlu on 23.04.2021
 */

public class BeautifulBinaryString {

    static int min =100;
    // Complete the beautifulBinaryString function below.
    static int beautifulBinaryString(String b) {

        int index = b.indexOf("010");
        if(index ==-1){
            return 0;
        } else {
            classify(b,0);
        }
        return min;
    }


    static void classify(String b, int count){
        System.out.println("b: "+ b+ " count: "+ count);
        int index = b.indexOf("010");
        if(index ==-1){
            if(count<min){
                min=count;
            }
        } else {
            StringBuilder opt1 = new StringBuilder(b);
            StringBuilder opt2 = new StringBuilder(b);
            StringBuilder opt3 = new StringBuilder(b);
            opt1.setCharAt(index, '1');
            opt2.setCharAt(index+1, '0');
            opt3.setCharAt(index+2, '1');
            classify(opt1.toString(),count+1);
            classify(opt2.toString(),count+1);
            classify(opt3.toString(),count+1);
        }
    }

    public static void main(String[] arg){

        beautifulBinaryString("0101010");
    }
}
