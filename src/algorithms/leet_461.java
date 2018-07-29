package algorithms;

/**
 * @author : tangtj
 * @date : 2018/7/26 21:02
 */
public class leet_461 {

    public int hammingDistance(int x, int y) {
        int time = 1;
        x = x^y;
        if (x == 0){
            return 0;
        }
        while ((x = x&(x-1)) != 0){
            time++;
        }
        return time;
    }
}
