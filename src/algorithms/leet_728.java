package algorithms;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class leet_728 {
    public List<Integer> selfDividingNumbers(int left, int right) {
        return IntStream.rangeClosed(left,right)
                .filter(i->{
                   char[] iStr = (i+"").toCharArray();
                    for (char c : iStr) {
                        int size = (c - '0');
                        if (size == 0){
                            return false;
                        }
                        if (i % size != 0) {
                            return false;
                        }
                    }
                    return true;
                }).boxed().collect(Collectors.toList());

    }
}
