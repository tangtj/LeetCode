package algorithms;

public class leet_1351 {

    public int countNegatives(int[][] grid) {
        int x = grid.length;
        int y = grid[0].length;

        int sum = 0;

        for (int i = y-1; i >= 0 ; i--) {
            for (int j = 0; j < x; j++) {
                int target = grid[j][i];
                if (target < 0){
                    sum += (x-j);
                    break;
                }
            }
        }
        return sum;
    }
}
