package algorithms;

/**
 * @author tang
 * @date 2019/7/4
 */
public class leet_203 {

    public ListNode removeElements(ListNode head, int val) {

        ListNode result = new ListNode(-1);

        ListNode n = result;

        while (head != null){
            if (head.val == val){
                head = head.next;
            }else {
                n.next = new ListNode(head.val);
                n = n.next;
                head = head.next;
            }
        }
        return result.next;
    }
}
