package treenode.recursive;

import treenode.TreeNode;

/**
 * @author longyh
 * @Description:
 * @analysis:
 * @date 2022/3/31 11:15 上午
 */
public class HasPathSumSolution {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null) {
            return false;
        }

        if (root.left == null && root.right == null) {
            return root.val == targetSum;
        }

        return hasPathSum(root.left, targetSum - root.val) || hasPathSum(root.right, targetSum - root.val);
    }
}


/**
 * public boolean hasPathSum(TreeNode root, int targetSum) {
 * if (root == null) {
 * return false;
 * }
 * <p>
 * if (root.left == null && root.right == null) {
 * return root.val == targetSum;
 * }
 * <p>
 * return recursive(root.val, targetSum, root.left) || recursive(root.val, targetSum, root.right);
 * }
 * <p>
 * public static boolean recursive(int sum, int targetSum, TreeNode treeNode) {
 * if (treeNode == null) {
 * return false;
 * }
 * <p>
 * sum += treeNode.val;
 * <p>
 * if (treeNode.left == null && treeNode.right == null) {
 * return sum == targetSum;
 * }
 * <p>
 * if (recursive(sum, targetSum, treeNode.left)) {
 * return true;
 * }
 * <p>
 * if (recursive(sum, targetSum, treeNode.right)) {
 * return true;
 * }
 * <p>
 * return false;
 * }
 */
