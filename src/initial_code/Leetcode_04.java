package initial_code;

import java.util.Arrays;

public class Leetcode_04 {

	public static void main(String[] args) {
		int [] a= {1,2,4};
		int [] b= {1,3,4};
		int [] arr=new int[a.length + b.length] ;
		int i=0,j=0,k=0;
		while(i<a.length && j<b.length)
		{
			if(a[i]<b[j])
			{
				arr[k]=a[i];
				i++;
				
			}
			else
			{
				arr[k]=b[j];
				j++;
				
			}
			k++;
		}
		while(i<a.length)
		{
			arr[k++]=a[i++];
		}
		while(j<b.length)
		{
			arr[k++]=b[j++];
		}
		/*for(int element: arr)
		{
		System.out.print(element+" ");
		}*/
		System.out.print(Arrays.toString(arr));
}
}