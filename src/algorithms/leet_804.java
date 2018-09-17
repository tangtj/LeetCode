package algorithms;

import java.util.HashMap;

/**
 * @author : tang
 * @date : 2018/9/16
 */
public class leet_804 {

    private String[] code = new String[]{".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};

    public int uniqueMorseRepresentations(String[] words) {
        HashMap<String,String> map = new HashMap<>(12);
        for (String item:words){
            StringBuffer sb = new StringBuffer();
            for (int i = 0,j = item.length(); i < j; i++) {
                sb.append(code[item.charAt(i) - 'a']);
            }
            map.put(sb.toString(),"1");
        }
        return map.size();
    }

}
