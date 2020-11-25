package algorithms;

public class lcp_06 {
	public int minCount(int[] coins) {
		int sum = 0;
		for (int i = 0,j = coins.length; i < j; i++) {
			if (coins[i] == 1){
				sum += 1;
			}else {
				sum = sum + coins[i]/2 + coins[i]%2;
			}
		}
		return sum;
	}
}
