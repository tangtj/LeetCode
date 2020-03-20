package algorithms;

import java.util.ArrayList;

public class leet_234 {
    public boolean isPalindrome(ListNode head) {
        if (head==null){
            return true;
        }
        ArrayList<Integer> list = new ArrayList<>();
        while (head != null){
            list.add(head.val);
            head = head.next;
        }
        Integer[] nums = list.toArray(new Integer[0]);
        int mid = nums.length/2;
        for (int i = 0; i < mid; i++) {

            if (!nums[i].equals(nums[nums.length-1 - i])){
                return false;
            }
        }
        return true;
    }
}
