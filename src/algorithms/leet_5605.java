package algorithms;

import java.util.Arrays;

public class leet_5605 {

	public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
		String a = "";
		if (word1 != null){
			StringBuffer sb = new StringBuffer();
			for (String s : word1) {
				sb.append(s);
			}
			a = sb.toString();
		}

		String b = "";
		if (word2 != null){
			StringBuffer sb = new StringBuffer();
			for (String s : word2) {
				sb.append(s);
			}
			b = sb.toString();
		}
		return a.equals(b);
	}
}
