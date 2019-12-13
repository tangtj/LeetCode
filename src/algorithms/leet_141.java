package algorithms;

/**
 * @author tang
 * @date 2019/7/4
 */
public class leet_141 {
    public boolean hasCycle(ListNode head) {
        if (head == null){
            return false;
        }

        ListNode n = head.next;

        while (n != null){
            if (n == head || n.next == head){
                return true;
            }
            ListNode h = n;
            n = n.next;
            h.next = head;
        }
        return false;
    }
}
