package algorithmPlan.introduction;

import algorithmPlan.ListNode;

/**
 * @author longyh
 * @Description:
 * @analysis:
 * @date 2022/4/5 12:09 上午
 */
public class RemoveNthFromEndSolution {
    public static ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode slow = head;
        ListNode fast = head;
        for (int i = 0; i < n; i++) {
            fast = fast.next;
        }

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next;
        }

        if (n == 1) {
            if (head.next == null) {
                return null;
            }
            slow.next = null;
        } else {
            slow.next = fast;
        }

        return head;
    }
}
