package algorithms;

import java.util.Arrays;
import java.util.Set;

public class leet_1460 {

    public boolean canBeEqual(int[] target, int[] arr) {
        Arrays.sort(target);
        Arrays.sort(arr);
        for (int i = 0; i < target.length; i++) {
            if (target[i] != arr[i]){
                return false;
            }
        }
        return true;
    }
}
