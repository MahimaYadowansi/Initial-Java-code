package initial_code;
/*Given two strings needle and haystack, return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.
 * 
 * Example 1:

Input: haystack = "sadbutsad", needle = "sad"
Output: 0
Explanation: "sad" occurs at index 0 and 6.
The first occurrence is at index 0, so we return 0.
Example 2:

Input: haystack = "leetcode", needle = "leeto"
Output: -1
Explanation: "leeto" did not occur in "leetcode", so we return -1.
 */
public class Leetcode__28 {

	public static void main(String[] args) {
		String haystack="sadbutsad";
		String needle="sad";
		String result="";
		int i,j = 0;
		for( i=0;i<haystack.length()-needle.length();i++)
		{
			for(j=0;j<needle.length();j++)
			{
				if(haystack.charAt(i)==needle.charAt(j))
				{
					 result=result+needle.charAt(j);
				}
			}
			
		}
		System.out.println(result);
		if(result.charAt(0)==needle.charAt(0))
		{
			System.out.print(haystack.indexOf(result));
		}
		else
		{
			System.out.println(-1);
		}
		
		

		

	}

	
	}


