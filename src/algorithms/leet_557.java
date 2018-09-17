package algorithms;

/**
 * @author : tang
 * @date : 2018/9/17
 */
public class leet_557 {

    public String reverseWords(String s) {
        String[] strs = s.split(" ");
        StringBuffer sb = new StringBuffer();
        for (int i = strs.length -1; i >= 0 ; i--) {
            sb.append(strs[i]);
            if (i != 0){
                sb.append(" ");
            }
        }
        return sb.reverse().toString();
    }
}
