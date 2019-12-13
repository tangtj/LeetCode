package algorithms;

import java.util.List;

/**
 * @author tang
 * @date 2019/7/4
 */
public class leet_206 {

    public ListNode reverseList(ListNode head) {
        if (head == null){
            return null;
        }
        ListNode newList = new ListNode(head.val);
        ListNode node = head;
        while (node.next != null){
            node = node.next;
            ListNode n =new ListNode(node.val);
            n.next = newList;
            newList = n;
        }
        return newList;
    }
}
