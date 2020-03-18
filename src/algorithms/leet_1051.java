package algorithms;

import java.util.Arrays;

public class leet_1051 {
    public int heightChecker(int[] heights) {
        if (heights.length == 1){
            return 0;
        }
        int[] a = heights.clone();
        Arrays.sort(heights);
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            if (heights[i] != a[i]){
                count++;
            }
        }
        return count;
    }
}
