package algorithms;

public class leet_19 {

    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode slow = head;
        ListNode fast = head;
        ListNode pre = null;

        while (n-->1){
            fast = fast.next;
        }
        while (fast.next != null){
            pre = slow;
            slow = slow.next;
            fast = fast.next;
        }
        if (pre == null){
            return slow.next;
        }
        pre.next = slow.next;
        return head;
    }

    public static void main(String[] args) {
        ListNode node = new ListNode(1);
        ListNode n = node;
        int[] nodes = new int[]{2,3,4,5};
        for (int i = 0; i < nodes.length; i++) {
            n.next = new ListNode(nodes[i]);
            n = n.next;
        }
        leet_19 l = new leet_19();
        l.removeNthFromEnd(node,5);
    }
}
