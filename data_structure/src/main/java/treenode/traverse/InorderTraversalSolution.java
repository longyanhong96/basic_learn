package treenode.traverse;

import treenode.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author longyh
 * @Description: 中序遍历是先遍历左子树，然后访问根节点，然后遍历右子树。
 * @analysis:
 * @date 2022/3/29 10:37 上午
 */
public class InorderTraversalSolution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> traversalList = new ArrayList<>();
        if (root != null) {
            traversal(traversalList, root);
        }
        return traversalList;
    }

    public static void traversal(List<Integer> traversalList, TreeNode node) {
        if (node.left != null) {
            traversal(traversalList, node.left);
        }

        traversalList.add(node.val);

        if (node.right != null) {
            traversal(traversalList, node.right);
        }
    }
}
