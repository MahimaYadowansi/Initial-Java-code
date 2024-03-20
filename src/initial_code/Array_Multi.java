package initial_code;

import java.util.Arrays;

/*
 * Example 1:

Input: nums = [1,2,3,4]
Output: [24,12,8,6]
Example 2:

Input: nums = [-1,1,0,-3,3]
Output: [0,0,9,0,0]
 */
public class Array_Multi {

	public static void main(String[] args) {
		int[] nums= {1,2,3,4};
		int[] answer=new int[nums.length];
	     
	   
	    for(int i=0;i<nums.length;i++)
	      {
	    	 int mul=1;
	       for(int j=0;j<nums.length;j++)
	       {
	        if(i!=j)
	        {
	        	mul=mul*nums[j];
	        }
	        else
	        {
	        	continue;
	        }
	       }
	       answer[i]=mul;
	      }
	    
		System.out.print(Arrays.toString(answer));
	}

}
