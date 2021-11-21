import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// @author yusufu
public class ShoppingListPrize {

    public static int foo(List<String> codeList, List<String> shoppingCart) {
        // Write your code here


        List<String> plaincodeList = new ArrayList<>();
        codeList.stream().forEach(fr->{
            plaincodeList.addAll(Arrays.asList(fr.split(" ")));
            System.out.println("code:"+ fr);

        });

        String shopString = "";
        for(String s: shoppingCart) {
            shopString+=s;
        }
        String codeString = "";
        for(String s: plaincodeList) {
            codeString+=s;
        }

        System.out.println("shop "+shopString);
        System.out.println("code "+codeString);

        int lenShop = shoppingCart.size();
        int lenCode = plaincodeList.size();
        int len;

        if(lenShop>=lenCode) {
            len = lenCode;
        } else {
            System.out.println("plaincodeList size: "+ lenCode+" shoppingCart: "+ lenShop);
            return 0;
        }
        int result = 1;
        for(int i=0;i<len;i++){
            System.out.println("shop:"+ shoppingCart.get(i));
            if(!plaincodeList.get(i).equals(shoppingCart.get(i)) ){
                if(!plaincodeList.get(i).equals("anything")){
                    result = 0;
                    System.out.println("no match code: "+ plaincodeList.get(i) + " shop: "+ shoppingCart.get(i));
                }
            }

        }

        return result;



    }
}
