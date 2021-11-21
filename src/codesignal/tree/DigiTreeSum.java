package codesignal.tree;

/**
 * Created by yusufunlu on 18.04.2021
 */

public class DigiTreeSum {

    long digitTreeSum(Tree<Integer> t) {
        return recursion(t, 0);
    }

    private long recursion(Tree<Integer> t, long result) {
        long total = 0;
        if (t.left == null && t.right == null) {
            total += (result * 10) + t.value;
        }
        if (t.left != null) {
            total += recursion(t.left, (result * 10) + t.value);
        }
        if (t.right != null) {
            total += recursion(t.right, (result * 10) + t.value);
        }
        return total;
    }


}
