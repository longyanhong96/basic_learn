package algorithmPlan.introduction;

import algorithmPlan.ListNode;

/**
 * @author longyh
 * @Description:
 * @analysis:
 * @date 2022/4/9 11:44
 */
public class ReverseListSolution {
    public static ListNode reverseList(ListNode head) {

        if (head == null) {
            return head;
        }

        ListNode prev = null;
        ListNode current = head;

        while (current != null) {

            ListNode next = current.next;

            current.next = prev;
            prev = current;
            current = next;
        }

        return prev;
    }
}
