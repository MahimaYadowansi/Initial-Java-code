package initial_code;

import java.util.Arrays;

public class MaxMinArray {

	public static void main(String[] args) {
		int[] a= {5,9,34,12,4};
	/*	Arrays.sort(a);
		System.out.println("The min value is:"+a[0]);
		System.out.println("The max value is:"+a[a.length-1]); */
		int max=a[0], min=a[0];
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
		}
		System.out.println(max);
		for(int i=0;i<a.length;i++)
		{
			if(a[i]<min)
			{
				min=a[i];
			}
		}
		System.out.println(min);
		
}
}