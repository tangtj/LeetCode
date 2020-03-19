package algorithms;

public class leet_463 {

    int[][] fx = new int[][]{
            {0,-1},{-1,0},{0,1},{-1,0}
    };

    public int islandPerimeter(int[][] grid) {
        int count = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {

                int target = grid[i][j];
                if (target == 0){
                    continue;
                }
                int iCount = 0;
                for (int k = 0; k < 4; k++) {

                    int ix = i+ fx[k][0];
                    int iy = j + fx[k][1];
                    if (ix < 0 || iy < 0 || ix >= grid.length || iy >=grid[0].length){
                        iCount++;
                        continue;
                    }
                    if (grid[ix][iy] == 0){
                        iCount++;
                    }
                }
                count += iCount;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[][] test = new int[][]{
                {0,1,0,0},{1,1,1,0},{0,1,0,0},{1,1,0,0}
        };
        leet_463 l = new leet_463();
        l.islandPerimeter(test);

    }
}
