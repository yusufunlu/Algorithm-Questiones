package codesignal.tree;

import java.util.*;

/**
 * Created by yusufunlu on 18.04.2021
 */



 //Definition for binary tree:
class Tree<T> {
   Tree(T x) {
     value = x;
   }
   T value;
   Tree<T> left;
   Tree<T> right;
 }

public class TraverseTree {

    int[] traverseTree(Tree<Integer> t) {
        if (t == null) return new int[] {};

        List<Integer> result = new ArrayList<Integer>();
        Queue<Tree<Integer>> q = new LinkedList<Tree<Integer>>();
        q.add(t);

        while (!q.isEmpty()) {
            Tree<Integer> current = q.poll();
            result.add(current.value);

            if (current.left != null)
                q.add(current.left);
            if (current.right != null)
                q.add(current.right);
        }

        return result.stream().mapToInt(Integer::intValue).toArray();
    }


}
