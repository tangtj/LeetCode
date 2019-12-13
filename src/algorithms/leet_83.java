package algorithms;

/**
 * @author tang
 * @date 2019/7/4
 */
public class leet_83 {

    public ListNode deleteDuplicates(ListNode head) {

        if (head == null) {
            return null;
        }

        int target = head.val;

        ListNode result = new ListNode(target);

        ListNode node = result;

        while (head.next != null) {
            head = head.next;

            if (target == head.val) {
                continue;
            } else {
                target = head.val;
                node.next = new ListNode(target);
                node = node.next;
            }
        }
        return result;
    }
}
