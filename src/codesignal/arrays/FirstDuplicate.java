package codesignal.arrays;

/**
 * Created by yusufunlu on 17.04.2021
 */

public class FirstDuplicate {

    static int firstDuplicate(int[] a) {

        //eleman degerini index olarak kullan. array üstünde o indexdeki elemanı -/+ yapmak sonucu degistirmez
        //abs bizi kurtarır ama bu indexdeki eleman - ise o index yani onu gösteren value repeateddir.
        //elemanların degeri 1 den n yani size a kadar oldugundan bu deger max olursa array bound hatası verir
        //-1 yapıyoruz hepsine
        int size = a.length;
        int firstRepeated = -1;
        for (int i = 0; i < size; i++) {
            int pointed = Math.abs(a[i])-1; //a[0]-1 = > 2-1 => 1
            //System.out.println("pointed: "+ pointed);
            if(a[pointed] > 0)
                a[pointed] = -a[pointed];
            else {
                System.out.println("first repeat:"+ pointed + " i");
                firstRepeated = Math.abs(a[i]);
                break;
            }

        }
        System.out.println("result: "+ firstRepeated);
        return firstRepeated;
    }

    public static void main(String[] args) {

        int[] a = new int[]{2,1, 3, 5, 3, 2};
        firstDuplicate(a);
    }
}
