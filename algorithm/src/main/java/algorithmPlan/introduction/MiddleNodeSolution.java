package algorithmPlan.introduction;

import algorithmPlan.ListNode;


/**
 * @author longyh
 * @Description:
 * @analysis:
 * @date 2022/4/4 11:15 下午
 */

// todo: 现在用的双指针，但是有点low；可以通过拉开间距来实现
public class MiddleNodeSolution {
    public static ListNode middleNode(ListNode head) {
        if (head.next == null) {
            return head;
        }
        int maxLength = 1;
        int currentMidLength = 1;
        ListNode currentMidNode = head;

        while (head.next != null) {
            maxLength++;
            int mid = maxLength / 2;
            head = head.next;

            if (mid - currentMidLength == 1) {
                currentMidLength = mid;
                currentMidNode = currentMidNode.next;
            }
        }

        return currentMidNode.next;
    }
}
