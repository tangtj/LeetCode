package algorithms;

public class leet_1313 {
    public int[] decompressRLElist(int[] nums) {
        int len = 0;
        for (int i = 0; i < nums.length; i+=2) {
            len += nums[i];
        }
        int[] result = new int[len];
        int index = 0;
        for (int i = 1; i < nums.length; i+=2) {
            int times = nums[i-1];
            int target= nums[i];
            for (int j = 0; j < times; j++) {
                result[index++] = target;
            }
        }
        return result;
    }
}
