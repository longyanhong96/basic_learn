package algorithmPlan.introduction;

import algorithmPlan.ListNode;

import java.util.List;

/**
 * @author longyh
 * @Description:
 * @analysis:
 * @date 2022/4/9 10:12
 */
public class MergeTwoListsSolution {
    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null) {
            return list2;
        }

        if (list2 == null) {
            return list1;
        }

        ListNode listNode = new ListNode();
        listNode.val = Math.min(list1.val, list2.val);

        if (list1.val < list2.val) {
            listNode.next = mergeTwoLists(list1.next, list2);
        } else {
            listNode.next = mergeTwoLists(list1, list2.next);
        }

        return listNode;
    }

}
