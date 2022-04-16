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
        ListNode prev = null;
        ListNode current = head;
        ListNode fast = head;
        for (int i = 0; i < n; i++) {
            fast = fast.next;
        }

        while (fast != null) {
            prev = current;
            current = current.next;
            fast = fast.next;
        }

        if (prev == null) {
            head = current.next;
        } else {
            prev.next = current.next;
        }

        return head;
    }
}
