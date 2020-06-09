package algorithms;

import java.util.stream.IntStream;

public class leet_134 {

    public int canCompleteCircuit(int[] gas, int[] cost) {
        int n = gas.length;

        int total = 0;
        int curr = 0;

        int start = 0;

        for (int i = 0; i < n; i++) {
            total += gas[i]-cost[i];
            curr += gas[i]-cost[i];
            if (curr < 0){
                start = i+1;
                curr = 0;
            }
        }
        return total>=0?start:-1;
    }

    public static void main(String[] args) {
        leet_134 l = new leet_134();
        l.canCompleteCircuit(new int[]{1,2,3,4,5},new int[]{3,4,5,1,2});
    }
}
