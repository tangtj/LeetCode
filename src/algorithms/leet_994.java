package algorithms;

import java.util.LinkedList;
import java.util.Queue;

public class leet_994 {

    int[][] fx = new int[][]{
            {0,-1},{0,1},{1,0},{-1,0}
    };

    static class Node{
        public int x;
        public int y;

        public Node(int x,int y){
            this.x = x;
            this.y = y;
        }
    }

    public int orangesRotting(int[][] grid) {

        Queue<Node> queue = new LinkedList<>();

        int sum = 0;

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 2){
                    queue.add(new Node(i,j));
                }else if (grid[i][j] == 1){
                    sum++;
                }
            }
        }
        if (queue.isEmpty() && sum == 0){
            return 0;
        }else if (queue.isEmpty() && sum > 0){
            return -1;
        }

        int min = -1;
        while (!queue.isEmpty()){
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                Node n = queue.poll();
                grid[n.x][n.y] = -1;
                for (int j = 0; j < 4; j++) {
                    int x = n.x + fx[j][0];
                    int y = n.y + fx[j][1];
                    if (x < 0 || y < 0 || x >= grid.length || y >= grid[0].length){
                        //超出地图
                        continue;
                    }
                    if (grid[x][y] == 1){
                        grid[x][y] = 2;
                        queue.add(new Node(x,y));
                    }
                }
            }
            min++;
        }

        for (int[] ints : grid) {
            for (int j = 0; j < grid[0].length; j++) {
                if (ints[j] == 1) {
                    return -1;
                }
            }
        }
        return min;
    }

    public static void main(String[] args) {
        var a = new leet_994();

        a.orangesRotting(new int[][]{
                {2,2},{1,1},{0,0},{2,0}
        });
    }
}
