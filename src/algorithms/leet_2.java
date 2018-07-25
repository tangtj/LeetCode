package algorithms;

/**
 * @author : tangtj
 * @date : 2018/7/25 20:34
 */
public class leet_2 {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = new ListNode(-1);
        ListNode head = result;
        int a,b,step = 0;
        while (l1 != null || l2 != null){
            a = l1 == null? 0:l1.val;
            b = l2 == null? 0:l2.val;
            int sum = a+b+step;
            step = sum >= 10?1:0;
            result.next = new ListNode(sum %10);
            result = result.next;
            l1 = l1!=null?l1.next:null;
            l2 = l2!=null?l2.next:null;
        }
        if (step == 1){
            result.next = new ListNode(1);
        }
        return head.next;
    }
}
