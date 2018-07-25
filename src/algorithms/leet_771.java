package algorithms;

import java.util.HashMap;
import java.util.LinkedHashMap;

/**
 * @author : tangtj
 * @date : 2018/7/25 20:59
 */
public class leet_771 {

    public int numJewelsInStones(String J, String S) {
        int sum = 0;
        int[] size = new int[26 + 26];
        for (int i = 0; i < S.length(); i++) {
            char c = S.charAt(i);
            int target = c >'Z'? c - 'a' + 26 : c -'A';
            size[target] = size[target] + 1;
        }
        for (int i = 0; i < J.length(); i++) {
            char c = J.charAt(i);
            int target = c >'Z'? c - 'a' + 26 : c -'A';
            sum += size[target];
            size[target] = 0;
        }
        return sum;
    }
}
