package algorithmPlan.introduction;

import algorithmPlan.ListNode;
import junit.framework.TestCase;

/**
 * @author longyh
 * @Description:
 * @analysis:
 * @date 2022/4/9 11:53
 */
public class ReverseListSolutionTest extends TestCase {

    ListNode list1;

    @Override
    protected void setUp() throws Exception {
//        list1 = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
        list1 = new ListNode(1);
    }

    public void testReverseList() {
        ListNode listNode = ReverseListSolution.reverseList(list1);
        while (listNode != null) {
            System.out.println(listNode.val);
            listNode = listNode.next;
        }
    }
}