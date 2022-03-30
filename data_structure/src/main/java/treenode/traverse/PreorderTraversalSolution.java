package treenode.traverse;

import treenode.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author longyh
 * @Description: 前序遍历首先访问根节点，然后遍历左子树，最后遍历右子树。
 * @analysis:
 * @date 2022/3/29 9:58 上午
 */
public class PreorderTraversalSolution {
    public static List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> traversalList = new ArrayList<>();
        if (root != null) {
            traversal(traversalList, root);
        }
        return traversalList;
    }

    public static void traversal(List<Integer> traversalList, TreeNode node) {
        traversalList.add(node.val);

        if (node.left != null) {
            traversal(traversalList, node.left);
        }

        if (node.right != null) {
            traversal(traversalList, node.right);
        }
    }
}
