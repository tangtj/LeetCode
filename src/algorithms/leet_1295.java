package algorithms;

import java.util.stream.IntStream;

public class leet_1295 {
    public int findNumbers(int[] nums) {
        if (nums == null || nums.length == 0){
            return 0;
        }
        return (int) IntStream.of(nums).parallel().filter(i-> (i+"").length() % 2 == 0).count();
    }
}
