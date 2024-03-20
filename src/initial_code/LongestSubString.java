package initial_code;

import java.util.HashSet;

public class LongestSubString {

	public static void main(String[] args) {
		String a = "abcabacabc";
		a.toLowerCase();
		HashSet<Character> set=new HashSet<>(a.length());
		int count=0;
		for(int i=0;i<a.length();i++)
		{
			if(!set.contains(a.charAt(i)))
			{
				set.add(a.charAt(i));
				count++;
				
			}
			else
			{
				break;
			}
		}
		System.out.println(count);
		
		
		
		

	}

}
