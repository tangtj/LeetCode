package algorithms;

import java.util.List;

public class leet_61 {

    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null || k == 0){
            return head;
        }
        int length = 1;

        ListNode pre = null;
        ListNode last = head;
        while (last.next != null){
            last = last.next;
            length++;
        }
        //需要走几步
        int step = k % length;
        if (step == 0){
            return head;
        }
        //变成环了
        last.next = head;
        pre = head;
        int t = 0;
        while (t<(length - step -1)){
            pre= pre.next;
            t++;
        }
        ListNode p = pre.next;
        pre.next = null;

        return p;
    }

    public static void main(String[] args) {
        ListNode node = new ListNode(1);
        ListNode n = node;
        int[] nodes = new int[]{2,3,4,5};
        for (int i = 0; i < nodes.length; i++) {
            n.next = new ListNode(nodes[i]);
            n = n.next;
        }
        leet_61 l = new leet_61();
        l.rotateRight(node,2);
    }
}
