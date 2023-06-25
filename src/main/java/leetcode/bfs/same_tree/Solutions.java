package leetcode.bfs.same_tree;

import com.sun.source.tree.Tree;

import java.util.Deque;
import java.util.LinkedList;
import java.util.function.BiPredicate;

public class Solutions {
    public static boolean isSameTree(TreeNode p, TreeNode q) {
        Deque<TreeNode> pNeighbors = new LinkedList<>();
        Deque<TreeNode> qNeighbors = new LinkedList<>();

        pNeighbors.add(p);
        qNeighbors.add(q);
        boolean result = true;

        BiPredicate<TreeNode, TreeNode> valuesNotEqual = (a, b) -> a.val != b.val;
        BiPredicate<TreeNode, TreeNode> oneIsNull = (a, b) -> (a == null && b != null) || b == null && a != null;

        while (pNeighbors.size() > 0) {
            if (oneIsNull.test(pNeighbors.peek(), qNeighbors.peek()) || valuesNotEqual.test(pNeighbors.peek(), qNeighbors.peek())) {
                result = false;
                return result;
            } else {
                try {
                    pNeighbors.add(pNeighbors.pop().left);
                    qNeighbors.add(qNeighbors.pop().left);

                    pNeighbors.add(pNeighbors.pop().right);
                    qNeighbors.add(qNeighbors.pop().right);
                } catch (NullPointerException npe) {
                    return false;
                }
            }
        }

        return result;
    }
}
