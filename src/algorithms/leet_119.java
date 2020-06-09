package algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class leet_119 {

    public List<Integer> getRow(int rowIndex) {
        int[] curr = new int[rowIndex+1];
        int[] prev = new int[rowIndex+1];

        for (int i = 0; i <= rowIndex+1; i++) {
            curr[0]=1;
            for (int j = 1; j < i; j++) {
                curr[j] = prev[j-1] + prev[j];
            }
            System.arraycopy(curr,0,prev,0,i);
        }
        ArrayList<Integer> result = new ArrayList<>(curr.length+1);
        for (int i = 0; i < curr.length; i++) {
            result.add(curr[i]);
        }
        return result;
    }

    public static void main(String[] args) {
        leet_119 l = new leet_119();
        l.getRow(4);
    }
}
