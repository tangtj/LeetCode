package algorithms;

public class leet_1413 {

    public int minStartValue(int[] nums) {
        int start = 1;
        int sum = 0;

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if (start + sum <1){
                start = 1-sum;
            }
        }
        return start;
    }
}
