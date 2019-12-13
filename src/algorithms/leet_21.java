package algorithms;

/**
 * @author tang
 * @date 2019/7/4
 */
public class leet_21 {

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode a = l1;
        ListNode b = l2;

        ListNode head = new ListNode(-1);

        ListNode node = head;

        while (a != null && b != null){
            ListNode n;
            if (a.val <= b.val){
                n = new ListNode(a.val);
                a = a.next;
            }else{
                n = new ListNode(b.val);
                b = b.next;
            }
            node.next = n;
            node = n;
        }
        node.next = a == null ? b:a;
        return head.next;
    }
}
