package algorithms;

import java.util.Comparator;
import java.util.PriorityQueue;

public class leet_1046 {

    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> queue = new PriorityQueue<>((o1,o2)-> o2 - o1);

        for (int i = 0; i < stones.length; i++) {
            queue.add(stones[i]);
        }

        while (queue.size() > 1){
            Integer a = queue.poll();
            Integer b = queue.poll();
            int c = Math.abs(a-b);
            if (c != 0){
                queue.add(c);
            }
        }
        if (queue.isEmpty()){
            return 0;
        }else {
            return queue.poll();
        }
    }

    public static void main(String[] args) {
        leet_1046 l = new leet_1046();
        l.lastStoneWeight(new int[]{2,7,4,1,8,1});
    }
}
