package algorithms;

/**
 * @author : tang
 * @date : 2018/9/16
 */
public class leet_258 {

    public int addDigits(int num) {
        int sum = num;
        while (sum > 10) {
            sum = 0;
            while (num != 0) {
                sum += (num % 10);
                num /= 10;
            }
            num = sum;
        }
        return sum;
    }
}
