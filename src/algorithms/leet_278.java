package algorithms;

public class leet_278 {

    //二分
    public int firstBadVersion(int n) {
        int l = 1;
        int r = n;
        while (l < r){
            int mid = l + (r - l)/2;
            if (isBadVersion(mid)){
                r = mid;
            }else {
                l = mid + 1;
            }
        }
        return l;
    }

    public boolean isBadVersion(int n){
        return true;
    }
}
