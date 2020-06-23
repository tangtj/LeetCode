package algorithms;

import java.util.HashMap;

public class leet_1309 {

    HashMap<String, String> map = new HashMap<>() {{
        put("1", "a");
        put("2", "b");
        put("3", "c");
        put("4", "d");
        put("5", "e");
        put("6", "f");
        put("7", "g");
        put("8", "h");
        put("9", "i");
        put("10#", "j");
        put("11#", "k");
        put("12#", "l");
        put("13#", "m");
        put("14#", "n");
        put("15#", "o");
        put("16#", "p");
        put("17#", "q");
        put("18#", "r");
        put("19#", "s");
        put("20#", "t");
        put("21#", "u");
        put("22#", "v");
        put("23#", "w");
        put("24#", "x");
        put("25#", "y");
        put("26#", "z");
    }};

    public String freqAlphabets(String s) {
        char[] c = s.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < c.length; i++) {
            if (i + 2 < c.length && c[i+2] == '#'){

                char d = (char)((c[i]-'0')*10 + c[i+1]-'0'  - 1 +'a');
                i+=2;
                sb.append( d);
            }else {
                sb.append((char)(c[i] -'0' - 1 + 'a'));
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        var a = new leet_1309();
        a.freqAlphabets("10#11#12");
    }
}
