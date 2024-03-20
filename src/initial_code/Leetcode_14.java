package initial_code;

import java.util.Arrays;

/*
 * Write a function to find the longest common prefix string amongst an array of strings.

If there is no common prefix, return an empty string "".

 

Example 1:

Input: strs = ["flower","flow","flight"]
Output: "fl"
Example 2:

Input: strs = ["dog","racecar","car"]
Output: ""
Explanation: There is no common prefix among the input strings.
 */
public class Leetcode_14 {

	public static void main(String[] args) {
		Leetcode_14 prefix=new Leetcode_14();
		 String[] strs1 = {"flower", "flow", "flight"};
	String ans=	prefix.longestCommonPrefix(strs1);
		System.out.print(ans);
}
	
	

	public String longestCommonPrefix(String[] strs) {
		
		 if (strs == null || strs.length == 0) {
	            return "";
	        }
		 //StringBuilder is a mutable sequence of characters that provides an efficient way to concatenate strings.
	       StringBuilder result=new StringBuilder();
	       Arrays.sort(strs);
	       //toCharArray() method to convert the string to an array of characters. This is done to allow for comparison of individual characters later.
	       char[] first=strs[0].toCharArray();
	        char[] last=strs[strs.length-1].toCharArray();
	        for(int i=0; i<first.length && i < last.length;i++)
	        {
	            if(first[i]!=last[i])
	            {
	                break;
	                
	            }
	            result.append(first[i]);
	        }
	        return result.toString();
	}
}