package codesignal;

/**
 * Created by yusufunlu on 19.04.2021
 */

public class FindSteps {
    public static void main(String args[]) {
        FindSteps t = new FindSteps();
        System.out.println(t.solution("011100"));
    }

    int solution(String S) {
        int question = Integer.parseInt(S, 2);
        return countNumber(question, 0);
    }

    private int countNumber(int number, int times) {
        if (number == 0) {
            return times;
        }
        times++;

        return (number % 2 == 0) ? countNumber(number / 2, times) : countNumber(number - 1, times);
    }
}
