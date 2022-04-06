package treenode.recursive;

import junit.framework.TestCase;
import treenode.TreeNode;

/**
 * @author longyh
 * @Description:
 * @analysis:
 * @date 2022/3/31 10:07 上午
 */
public class MaxDepthSolutionTest extends TestCase {

    TreeNode root;

    @Override
    protected void setUp() throws Exception {
//        TreeNode treeNode5 = new TreeNode(7, new TreeNode(11), new TreeNode(21));
        TreeNode treeNode5 = new TreeNode(7);
        TreeNode treeNode4 = new TreeNode(15);
        TreeNode treeNode3 = new TreeNode(20, treeNode4, treeNode5);

        TreeNode treeNode2 = new TreeNode(9, new TreeNode(1, new TreeNode(12), new TreeNode(22)), new TreeNode(2));
        root = new TreeNode(3, treeNode2, treeNode3);
    }


    public void testMaxDepth() {
        int maxDepth = MaxDepthSolution.maxDepth(root);
        System.out.println("maxDepth = " + maxDepth);
    }
}