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
        char[] temp = new char[3];
        StringBuilder result = new StringBuilder();

        int times = 0;
        for (char cc : c) {
            temp[times] = cc;
            if (times == 2 && cc == '#') {
                String key = "" + temp[0] + temp[1] + temp[2];
                result.append(map.get(key));
                times = 0;
                continue;
            } else if (times == 2) {
                result.append(map.get(""+temp[0]))
                        .append(map.get(""+temp[1]));

                temp[0] = temp[2];
                times=1;
                continue;
            }
            times++;
        }
        if (times != 0){
            for (int i = 0; i < times; i++) {
                result.append(map.get(""+temp[i]));
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        var a = new leet_1309();
        a.freqAlphabets("12345678910#11#12#13#14#15#16#17#18#19#20#21#22#23#24#25#26#");
    }
}
