/*Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.

Symbol       Value
I             1
V             5
X             10
L             50
C             100
D             500
M             1000
For example, 2 is written as II in Roman numeral, just two ones added together. 12 is written as XII, which is simply X + II. The number 27 is written as XXVII, which is XX + V + II.
 * 
 * Example 1:

Input: s = "III"
Output: 3
Explanation: III = 3.
Example 2:

Input: s = "LVIII"
Output: 58
Explanation: L = 50, V= 5, III = 3.
Example 3:

Input: s = "MCMXCIV"
Output: 1994
 */



package initial_code;

import java.util.HashMap;

public class Leetcode_13 {

	public static void main(String[] args) {
		String a="MCMXCIV";
		int result=0;
		HashMap<Character, Integer> map=new HashMap<>();
		
		map.put('I', 1);
		map.put('V', 5);
		map.put('X', 10);
		map.put('L', 50);
		map.put('C', 100);
		map.put('D', 500);
		map.put('M', 1000);
		for(int i=0;i<a.length();i++)
		{
			/*if(map.containsKey(a.charAt(i)))
			{
				result=result+map.get(a.charAt(i));
			}
			*/
			if (i < a.length() - 1 && map.get(a.charAt(i)) < map.get(a.charAt(i + 1)))
					{
				result=result-map.get(a.charAt(i));
					}
			else
			{
				result=result+map.get(a.charAt(i));
			}
		}
		System.out.println(result);
	}

}
