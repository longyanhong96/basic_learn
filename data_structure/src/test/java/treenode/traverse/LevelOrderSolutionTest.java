package treenode.traverse;

import junit.framework.TestCase;
import treenode.TreeNode;

import java.util.List;

/**
 * @author longyh
 * @Description:
 * @analysis:
 * @date 2022/3/30 4:15 下午
 */
public class LevelOrderSolutionTest extends TestCase {

    TreeNode root;

    @Override
    protected void setUp() throws Exception {
        TreeNode treeNode5 = new TreeNode(7, new TreeNode(11), new TreeNode(21));
        TreeNode treeNode4 = new TreeNode(15);
        TreeNode treeNode3 = new TreeNode(20, treeNode4, treeNode5);
        TreeNode treeNode2 = new TreeNode(9, new TreeNode(1), new TreeNode(2));
        root = new TreeNode(3, treeNode2, treeNode3);
    }

    public void testLevelOrder() {
        List<List<Integer>> levelOrder = LevelOrderSolution.levelOrder(null);

        for (int i = 0; i < levelOrder.size(); i++) {
            System.out.println("levelOrder = " + levelOrder.get(i));
        }
    }
}