package algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class leet_1431 {

    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {

        int max = candies[0];
        for (int i = 1; i < candies.length; i++) {
            max= Math.max(max,candies[i]);
        }

        List<Boolean> booleans = new ArrayList<>();
        for (int i = 0; i < candies.length; i++) {
            booleans.add(candies[i]+extraCandies>=max);
        }
        return booleans;
    }
}
