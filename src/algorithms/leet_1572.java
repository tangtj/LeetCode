package algorithms;

public class leet_1572 {
	public int diagonalSum(int[][] mat) {
		int x = mat.length;
		if (x == 1){
			return mat[0][0];
		}
		int sum = 0;
		for (int i = 0; i < x; i++) {
			sum += mat[i][i];
		}
		for (int i = 0; i < x; i++) {
			sum += mat[i][x - 1 - i];
		}
		if (x % 2 != 0){
			sum -= mat[x/2][x/2];
		}
		return sum;

	}
}
