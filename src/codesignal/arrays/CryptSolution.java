package codesignal.arrays;

/**
 * Created by yusufunlu on 19.04.2021
 */

public class CryptSolution {

    //crypt = ["SEND", "MORE", "MONEY"]
    /*solution = [['O', '0'],
            ['M', '1'],
            ['Y', '2'],
            ['E', '5'],
            ['N', '6'],
            ['D', '7'],
            ['R', '8'],
            ['S', '9']]*/
    boolean isCryptSolution(String[] crypt, char[][] solution) {

        int total =0;
        int totalRight =0;
        for(int i=0;i<crypt[0].length();i++){
            for(int j=0;j<solution.length;j++){
                if(solution[j][0]==crypt[0].charAt(i)){
                    if(i==0 && solution[j][1]=='0'&& crypt[0].length()!=1){
                        return false;
                    }

                    System.out.println("char: "+ crypt[0].charAt(i)+ " value: "+ (solution[j][1]-'0'));
                    System.out.println("product: "+(solution[j][1]-'0')+ " numberpow: "+ (crypt[0].length()-1));
                    total+=(solution[j][1]-'0') * Math.pow(10, crypt[0].length()-i-1);
                    System.out.println("total: "+ total);
                }
            }
        }
        System.out.println("total: "+ total);

        for(int i=0;i<crypt[1].length();i++){
            for(int j=0;j<solution.length;j++){
                if(solution[j][0]==crypt[1].charAt(i)){
                    if(i==0 && solution[j][1]=='0'&& crypt[1].length()!=1){
                        return false;
                    }
                    total+=(solution[j][1]-'0') * Math.pow(10, crypt[1].length()-i-1);
                }
            }
        }
        System.out.println("total: "+ total);

        for(int i=0;i<crypt[2].length();i++){
            for(int j=0;j<solution.length;j++){
                if(solution[j][0]==crypt[2].charAt(i)){
                    if(i==0 && solution[j][1]=='0'&& crypt[2].length()!=1){
                        return false;
                    }
                    totalRight+=(solution[j][1]-'0') * Math.pow(10, crypt[2].length()-i-1);
                }
            }
        }


        System.out.println("totalRight: "+ totalRight);
        if(total==totalRight){
            return true;
        } else {
            return false;
        }
    }

}
