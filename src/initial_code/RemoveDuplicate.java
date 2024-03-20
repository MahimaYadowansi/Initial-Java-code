package initial_code;

import java.util.HashSet;

public class RemoveDuplicate {

	public static void main(String[] args) {
		int [] arr= {0,0,0,1,1,2,2,3,4,4};
		HashSet<Integer> set=new HashSet<>();
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length;j++)
			{
				if(!set.contains(arr[j]))
				{
					set.add(arr[j]);
				}
				
			}
		}
		System.out.println(set);

	}

}
