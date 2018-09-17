package algorithms;

import java.util.LinkedList;
import java.util.List;

/**
 * @author : tang
 * @date : 2018/9/17
 */
public class leet_500 {

    private static final String[] MATCHES = new String[]{
            "[qwertyuiop]+",
            "[asdfghjkl]+",
            "[zxcvbnm]+"
    };

    public String[] findWords(String[] words) {
        List<String> result = new LinkedList<>();
        for(String str:words){
            for (String pare: MATCHES) {
                 if (str.toLowerCase().matches(pare)){
                     result.add(str);
                     break;
                 }
            }
        }
        return result.toArray(new String[]{});
    }
}

