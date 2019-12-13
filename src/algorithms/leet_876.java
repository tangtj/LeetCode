package algorithms;

/**
 * @author tang
 * @date 2019/7/4
 */
public class leet_876 {

    public ListNode middleNode(ListNode head) {

        ListNode one = head;
        ListNode two = head;

        while (two.next != null){
            two = two.next;
            if (two.next != null){
                two = two.next;
            }else {
                one = one.next;
                return one;
            }

            one = one.next;
        }
        return one;
    }
}
