package algorithms;

/**
 * @author : tangtj
 * @date : 2018/7/26 20:33
 */
public class leet_657 {

    public boolean judgeCircle(String moves) {
        long sum =0;
        for (int i = 0; i < moves.length(); i++) {
            char p = moves.charAt(i);
            if (p == 'R'){
                sum += -1000000;
            }else if (p == 'L'){
                sum += 1000000;
            }else if (p == 'U'){
                sum +=1;
            }else {
                sum += -1;
            }
        }
        return sum == 0L;

    }
}
