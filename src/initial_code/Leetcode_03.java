package initial_code;

import java.util.HashSet;

public class Leetcode_03 {

	public static void main(String[] args) {
		String a = "abcabcabc";
		int count = 0;
		HashSet<Character> set = new HashSet<Character>(a.length());
		for (int i = 0; i < a.length(); i++) {
			for (int j = 0; j < a.length(); j++) {
				if (!set.contains(a.charAt(j))) {
					set.add(a.charAt(j));
				} else {
					break;
				}
			}

			count = Math.max(count, set.size());
		}

		System.out.println(count);
	}

}
