package algorithmPlan.introduction;

import algorithmPlan.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author longyh
 * @Description:
 * @analysis:
 * @date 2022/4/7 4:59 下午
 */
public class MergeTreesSolution {
    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {

        if (root1 == null) {
            return root2;
        }

        if (root2 == null) {
            return root1;
        }
        TreeNode merged = new TreeNode(root1.val + root2.val);
        merged.left = mergeTrees(root1.left, root2.left);
        merged.right = mergeTrees(root1.right, root2.right);
        return merged;
    }

}
