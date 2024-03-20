package initial_code;

import java.util.HashSet;

public class RemoveDuplicateString {

	public static void main(String[] args) {
		String str="geEksforGEeks";
		HashSet<Character> set=new HashSet<>(str.length());
		 StringBuilder result = new StringBuilder();

	        for (int i = 0; i < str.length(); i++) {
	            char currentChar = str.charAt(i);

	            // Check if the character has not been added to the set before
	            if (set.add(currentChar)) {
	                result.append(currentChar);
	            }
	        }

	        System.out.println(result.toString());

	}

}
