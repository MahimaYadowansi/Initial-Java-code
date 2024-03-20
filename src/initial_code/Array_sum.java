package initial_code;

import java.util.Arrays;

public class Array_sum {

	public static void main(String[] args) {
		int [] nums= {1,2,3,4,5};
		int[] sum=new int[nums.length];
		int k=0;
		sum[0]=nums[0];
		k++;
		for(int i=1;i<nums.length;i++)
		{
			sum[k]=sum[i-1]+nums[i];
			k++;
			
		}

	System.out.print(Arrays.toString(sum)+" ");
		
	}

}
