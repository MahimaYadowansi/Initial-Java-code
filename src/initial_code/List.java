package initial_code;

import java.lang.reflect.Array;
import java.util.Arrays;
public class List {

	public static void main(String[] args) {
		int[] list1= {1,2,4};
		int[] list2= {1,3,4};
		int []list3=new int[list1.length+list2.length]  ;
		for(int i=0;i<list1.length;i++)
		{
		 list3[i]=list1[i];	
		}
		for(int j=0;j<list2.length;j++)
		{
			
			list3[list1.length +j]=list2[j];
		}
		Arrays.sort(list3);
		for(int element:list3)
		{
			
			System.out.print(element+" ");
		}
	}

}
