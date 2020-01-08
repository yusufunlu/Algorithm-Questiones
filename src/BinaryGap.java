

public class BinaryGap {

    static final char one = '1';
    public static int solution(int N) {
        int rightSideOneIndex = -1;
        int gap = 0;
        String binaryString = Integer.toBinaryString(N);
        for(int i = binaryString.length()-1 ; i>=0; i--) {

            if(binaryString.charAt(i) == one) {
                rightSideOneIndex = i;
            } else if(rightSideOneIndex >0){ // bit is 0 and 1 was on right side
                if(rightSideOneIndex - i>gap) {
                    gap = rightSideOneIndex - i;
                }
            }
        }
        System.out.println(gap);
        return gap;
    }

    public static void main(String[] args) {
        if (solution(9) != 2) {
            System.out.println("9 error");
        }
        if (solution(529) != 4) {
            System.out.println("529 error");
        }
        if (solution(20) != 1) {
            System.out.println("20 error");
        }
        if (solution(15) != 0) {
            System.out.println("15 error");
        }
        if (solution(1041) != 5) {
            System.out.println("1041 error");
        }
        if (solution(32) != 0) {
            System.out.println("32 error");
        }
    }



}
