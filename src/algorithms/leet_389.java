package algorithms;

public class leet_389 {
    public char findTheDifference(String s, String t) {
        char[] ss = s.toCharArray();
        char[] ts = t.toCharArray();
        if (ss.length == 0){
            return ts[0];
        }
        int target = ts[ts.length -1];
        for (int i = 0; i < ss.length; i++) {
            target = target ^ ss[i];
            target = target ^ ts[i];
        }
        return (char) target;
    }
}
