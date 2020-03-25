package algorithms;

import java.util.HashSet;
import java.util.Set;

public class leet_349 {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> a = new HashSet<>();
        Set<Integer> b = new HashSet<>();
        for (int i = 0; i < nums1.length || i < nums2.length; i++) {
            if (i<nums1.length){
                a.add(nums1[i]);
            }
            if (i<nums2.length){
                b.add(nums2[i]);
            }
        }
        a.retainAll(b);
        return a.stream().mapToInt(Integer::intValue).toArray();
    }
}
