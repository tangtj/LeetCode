package algorithms;

public class leet_328 {

    public ListNode oddEvenList(ListNode head) {
        if (head == null){
            return null;
        }
        ListNode d = head,s = head.next,node = s;
        while (s != null && s.next != null){
            d.next = s.next;
            d =d.next;
            s.next = d.next;
            s = s.next;
        }
        d.next = node;
        return head;
    }
}
