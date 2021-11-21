package codesignal.arrays;

/**
 * Created by yusufunlu on 17.04.2021
 */

public class Sudoku {

    static boolean sudoku2(char[][] grid) {
        for(int i=0;i<9;i++){
            int[] countv = new int[9];
            int[] counth = new int[9];
            int[] countSq = new int[9];

            for(int j=0;j<9;j++){
                if(grid[i][j] !='.'){

                    System.out.printf("i: %d j:%d grid[i][j]: %d \n",i,j, Character.getNumericValue( grid[i][j]));
                    if(counth[Character.getNumericValue( grid[i][j])-1]>0){
                        return false;
                    } else {
                        counth[Character.getNumericValue( grid[i][j])-1] = Character.getNumericValue( grid[i][j]);
                    }

                }
            }

            for(int j=0;j<9;j++){
                if(grid[j][i] !='.'){

                    System.out.printf("i: %d j:%d grid[i][j]: %d \n",i,j, Character.getNumericValue( grid[j][i]));
                    if(countv[Character.getNumericValue( grid[j][i])-1]>0){
                        return false;
                    } else {
                        countv[Character.getNumericValue( grid[j][i])-1] = Character.getNumericValue( grid[j][i]);
                    }
                }
            }

            int firstRow = (i / 3) * 3;
            int firstColumn = (i % 3) * 3;
            System.out.println("firstRow: "+ firstRow+ "firstColumn:"+ firstColumn);

            for (int j = firstRow; j < firstRow + 3; j++) {
                for (int k = firstColumn; k < firstColumn + 3; k++) {
                    if(grid[j][k] != '.') {
                        System.out.printf("i: %d j:%d grid[i][j]: %d \n",i,j, Character.getNumericValue(grid[j][k]));
                        if(countSq[Character.getNumericValue( grid[j][k])-1]>0){
                            return false;
                        } else {
                            countSq[Character.getNumericValue( grid[j][k])-1] = Character.getNumericValue(grid[j][k]);
                        }
                    }
                }
            }


        }
        return true;
    }

    public static void main(){
        //sudoku2()
    }
}
