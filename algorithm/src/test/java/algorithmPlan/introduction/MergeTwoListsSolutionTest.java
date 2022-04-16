package algorithmPlan.introduction;

import algorithmPlan.ListNode;
import junit.framework.TestCase;

/**
 * @author longyh
 * @Description:
 * @analysis:
 * @date 2022/4/9 10:20
 */
public class MergeTwoListsSolutionTest extends TestCase {

    ListNode list1;
    ListNode list2;

    @Override
    protected void setUp() throws Exception {
        list1 = new ListNode(1, new ListNode(2, new ListNode(4)));
        list2 = new ListNode(1, new ListNode(3, new ListNode(4)));
    }

    public void testMergeTwoLists() {
        ListNode listNode = MergeTwoListsSolution.mergeTwoLists(list1, list2);
        while (listNode != null) {
            System.out.println(listNode.val);
            listNode = listNode.next;
        }
    }
}