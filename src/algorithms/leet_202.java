package algorithms;

import java.util.HashSet;

public class leet_202 {

    private int[] sums = new int[]{
            0,1,4,9,16,25,36,49,64,81
    };

    private HashSet<Integer> set = new HashSet<>();

    public boolean isHappy(int n) {
        if (n == 1){
            return true;
        }
        int nums = n;
        while (true){
            if (set.contains(nums)){
                return false;
            }else {
                set.add(nums);
            }
            int sum = 0;
            char[] c = (nums+"").toCharArray();
            for (int i = 0; i < c.length; i++) {
                sum += sums[c[i]-'0'];
            }
            if (sum == 1){
                return true;
            }
            nums = sum;
        }
    }
}
