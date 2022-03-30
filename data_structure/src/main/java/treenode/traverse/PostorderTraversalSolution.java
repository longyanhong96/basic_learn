package treenode.traverse;

import treenode.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author longyh
 * @Description:
 * @analysis:
 * @date 2022/3/29 10:43 上午
 */
public class PostorderTraversalSolution {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> traversalList = new ArrayList<>();
        if (root != null) {
            traversal(traversalList, root);
        }
        return traversalList;
    }

    public void traversal(List<Integer> traversalList, TreeNode node) {
        if (node.left != null) {
            traversal(traversalList, node.left);
        }

        if (node.right != null) {
            traversal(traversalList, node.right);
        }

        traversalList.add(node.val);
    }
}
