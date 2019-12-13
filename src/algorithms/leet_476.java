package algorithms;

/**
 * @author : tang
 * @date : 2018/9/16
 */
public class leet_476 {

    //TODO:待做
    public int findComplement(int num) {
        StringBuilder nums = new StringBuilder();
        boolean flag = true;
        while (num > 0){
            nums.append(num%2 == 1?0:1);
            num = num>>1;
        }
        int result = 0;
        for (int i = nums.length() - 1; i >= 0 ; i--) {
            int t = (nums.charAt(i) -'0');
            if (flag && t == 0){
                continue;
            }else {
                flag = false;
            }
            result = (result << 1) + t;
        }
        return result;
    }
}
