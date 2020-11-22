package algorithms;

public class leet_1614 {

	public int maxDepth(String s) {
		int max =0;
		int target =0;

		char[] chs = s.toCharArray();
		for (int i = 0 ,j = chs.length; i < j; i++) {
			char c = chs[i];
			if (c == '('){
				target += 1;
				if (target > max){
					max = target;
				}
			}else if (c == ')'){
				target -= 1;
			}
		}
		return max;
	}
}
