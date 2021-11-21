package codesignal.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Created by yusufunlu on 18.04.2021
 */

public class LargestValuesTree {

    public static void main(){

    }

    int[] largestValuesInTreeRows(Tree<Integer> t) {
        if (t == null) {
            return new int[0];
        }
        Queue<Tree<Integer>> queue = new LinkedList<>();
        queue.offer(t);
        List<Integer> levelMax = new ArrayList<>();

        while (!queue.isEmpty()) {
            int size = queue.size();
            int tmpMax = Integer.MIN_VALUE;
            for (int i = 0; i < size; i++) {
                Tree<Integer> cur = queue.poll();
                if (cur.value > tmpMax) {
                    tmpMax = cur.value;
                }
                if (cur.left != null) {
                    queue.offer(cur.left);
                }
                if (cur.right != null) {
                    queue.offer(cur.right);
                }
            }
            levelMax.add(tmpMax);
        }
        int[] result = new int[levelMax.size()];
        for (int i = 0; i < levelMax.size(); i++) {
            result[i] = levelMax.get(i);
        }
        return result;
    }
}
