package algorithms;

public class leet_268 {

    public int missingNumber(int[] nums) {
        int res = 0;
        for (int i = 0,l = nums.length; i < l; i++) {
            res = res ^ nums[i];
            res = res ^ i;
        }
        return res ^ nums.length;
    }
}
