package treenode.recursive;

import treenode.TreeNode;

/**
 * @author longyh
 * @Description:
 * @analysis:
 * @date 2022/3/31 9:53 上午
 */
public class MaxDepthSolution {
    public static int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int recursive = recursive(0, root);

        return recursive;
    }

    public static int recursive(int dept, TreeNode treeNode) {
        if (treeNode == null) {
            return dept;
        }

        dept += 1;

        int leftDept = recursive(dept, treeNode.left);
        int rightDept = recursive(dept, treeNode.right);

        int max = Math.max(rightDept, Math.max(dept, leftDept));


        return max;
    }
}
