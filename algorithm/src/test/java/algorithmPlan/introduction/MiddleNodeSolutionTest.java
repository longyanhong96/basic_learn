package algorithmPlan.introduction;

import algorithmPlan.ListNode;
import junit.framework.TestCase;

/**
 * @author longyh
 * @Description:
 * @analysis:
 * @date 2022/4/4 11:50 下午
 */
public class MiddleNodeSolutionTest extends TestCase {

    ListNode head;

    @Override
    protected void setUp() throws Exception {
        ListNode node6 = new ListNode(6);
        ListNode node5 = new ListNode(5, node6);
        ListNode node4 = new ListNode(4, node5);
        ListNode node3 = new ListNode(3, node4);
        ListNode node2 = new ListNode(2, node3);
//        ListNode node2 = new ListNode(2);
        head = new ListNode(1, node2);
    }

    public void testMiddleNode() {
        ListNode listNode = MiddleNodeSolution.middleNode(head);
        System.out.println(listNode.val);
    }
}