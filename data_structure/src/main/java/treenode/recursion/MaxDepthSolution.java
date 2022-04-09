package treenode.recursion;

import treenode.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author longyh
 * @Description:
 * @analysis:
 * @date 2022/3/30 21:49
 */
public class MaxDepthSolution {
    public static int maxDepth(TreeNode root) {

        if (root == null) {
            return 0;
        }

        int dept = 0;

        recursion(dept, root);

        return 0;
    }

    // DSF
    public static int recursion(int dept, TreeNode treeNode) {
        if (treeNode == null) {
            return dept;
        }

        dept += 1;

        recursion(dept, treeNode.left);
        recursion(dept, treeNode.right);
        return dept;
    }


}

// BSF
/**
 * if (root == null) {
 * return 0;
 * }
 * Queue<TreeNode> treeNodes = new LinkedList<>();
 * treeNodes.offer(root);
 * <p>
 * int dept = 0;
 * <p>
 * int size = treeNodes.size();
 * while (!treeNodes.isEmpty()) {
 * <p>
 * dept += 1;
 * for (int i = 0; i < size; i++) {
 * TreeNode treeNode = treeNodes.poll();
 * <p>
 * if (treeNode.left != null) {
 * treeNodes.offer(treeNode.left);
 * }
 * <p>
 * if (treeNode.right != null) {
 * treeNodes.offer(treeNode.right);
 * }
 * }
 * <p>
 * size = treeNodes.size();
 * }
 * <p>
 * return dept;
 */
