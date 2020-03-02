package algorithms;

public class leet_1342 {

    public int numberOfSteps (int num) {
        if (num == 0){
            return 0;
        }
        int times = 0;
        while (num > 0){
            times++;
            if (num % 2 == 0){
                num = num/2;
            }else {
                num--;
            }
        }
        return times;
    }
}
