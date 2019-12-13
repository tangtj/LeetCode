package algorithms;

/**
 * @author tang
 * @date 2018/12/9
 */
public class leet_237 {
    public void deleteNode(ListNode node) {
            node.val = node.next.val;
            node.next = node.next.next;
    }
}
