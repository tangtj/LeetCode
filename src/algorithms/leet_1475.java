package algorithms;

public class leet_1475 {

    public int[] finalPrices(int[] prices) {
        if (prices.length == 1){
            return prices;
        }
        for (int i = 0; i < prices.length - 1; i++) {
            for (int j = i+1; j < prices.length; j++) {
                if (prices[i] >= prices[j]){
                    prices[i] -= prices[j];
                    break;
                }
            }
        }
        return prices;
    }
}
