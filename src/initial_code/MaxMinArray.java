package initial_code;

import java.util.Arrays;

public class MaxMinArray {

	public static void main(String[] args) {
		int[] a= {5,9,34,12,4};
	/*	Arrays.sort(a);
		System.out.println("The min value is:"+a[0]);
		System.out.println("The max value is:"+a[a.length-1]); */
		int max=0, min=0;
		int i=a[0];
		int j=a[1];
		for( i=0;i<a.length;i++)
		{
			if(a[i]>a[j])
			{
				max=a[i];
			}
		}
		System.out.println("The max value is:"+max);
		
		for( i=0;i<a.length;i++)
		{
			if(a[i]<a[j])
			{
				min=a[i];
			}
		}
		System.out.println("The max value is:"+min);
		
}
}