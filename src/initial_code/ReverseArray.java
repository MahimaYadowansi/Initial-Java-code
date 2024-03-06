package initial_code;

import java.util.Arrays;

public class ReverseArray {

	public static void main(String[] args) {
		int[] a= {2,5,7,3,6,4,9};
		Arrays.sort(a);
		for(int i=a.length-1;i>0;i--)
		{
			System.out.print(a[i] +" ");
		}

	}

}
