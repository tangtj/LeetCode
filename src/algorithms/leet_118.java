package algorithms;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class leet_118 {

    List<List<Integer>> rs = new ArrayList<>();

    public List<List<Integer>> generate(int numRows) {
        if (numRows <= 0){
            return rs;
        }
        rs.add(new ArrayList<>(){{
            add(1);
        }});

        for (int i = 1; i < numRows; i++) {
            List<Integer> ints = new ArrayList<>();
            List<Integer> prev = rs.get(i-1);

            ints.add(1);
            for (int j = 1; j < i; j++) {
                ints.add(prev.get(j-1) + prev.get(j));
            }
            ints.add(1);
            rs.add(ints);
        }
        return rs;
    }
}
