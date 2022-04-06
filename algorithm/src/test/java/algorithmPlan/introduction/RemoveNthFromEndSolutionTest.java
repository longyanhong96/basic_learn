package algorithmPlan.introduction;

import algorithmPlan.ListNode;
import junit.framework.TestCase;

/**
 * @author longyh
 * @Description:
 * @analysis:
 * @date 2022/4/5 12:13 上午
 */
public class RemoveNthFromEndSolutionTest extends TestCase {

    ListNode head;

    @Override
    protected void setUp() throws Exception {
        ListNode node5 = new ListNode(5);
        ListNode node4 = new ListNode(4, node5);
        ListNode node3 = new ListNode(3,node4);
        ListNode node2 = new ListNode(2);
        head = new ListNode(1,node2);
    }

    public void testRemoveNthFromEnd() {
        RemoveNthFromEndSolution.removeNthFromEnd(head, 2);

    }
}