package algorithms;

import java.util.Arrays;

public class leet_1365 {

    public int[] smallerNumbersThanCurrent(int[] nums) {

        int[] ns = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int target = nums[i];
            int mins = 0;
            for (int num : nums) {
                if (num < target) {
                    mins++;
                }
            }
            ns[i] = mins;
        }
        return ns;
    }
}
