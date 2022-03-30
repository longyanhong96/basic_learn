package treenode.traverse;

import junit.framework.TestCase;
import treenode.TreeNode;

import java.util.List;

/**
 * @author longyh
 * @Description:
 * @analysis:
 * @date 2022/3/29 10:18 上午
 */
public class PreorderTraversalSolutionTest extends TestCase {

    TreeNode root;

    @Override
    protected void setUp() throws Exception {
        TreeNode treeNode3 = new TreeNode(3);
        TreeNode treeNode2 = new TreeNode(2, treeNode3, null);
        root = new TreeNode(1, null, treeNode2);
    }

    public void testPreorderTraversal() {
        List<Integer> list = PreorderTraversalSolution.preorderTraversal(root);

        System.out.println("list = " + list);
    }
}