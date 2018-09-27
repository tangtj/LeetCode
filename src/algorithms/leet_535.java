package algorithms;

import java.util.HashMap;
import java.util.Map;

/**
 * @author : tang
 * @date : 2018/9/19
 */
public class leet_535 {

    private Map<Integer,String> map = new HashMap<>();
    private Integer i = 1;


    // Encodes a URL to a shortened URL.
    public String encode(String longUrl) {
        map.put(i,longUrl);
        return "http://tinyurl.com/"+i++;
    }

    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {
        return map.get(Integer.parseInt(shortUrl.replace("http://tinyurl.com/", "")));
    }
}
