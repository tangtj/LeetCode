package algorithms;

public class leet_121 {
    public int maxProfit(int[] prices) {

        int max = 0;
        int low = Integer.MAX_VALUE;
        for (int i : prices) {
            if( i<low){
                low = i;
            }
            max = Math.max(max,i-low);
        }
        return max;

    }
}
