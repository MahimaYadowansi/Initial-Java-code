package initial_code;

import java.util.Arrays;

public class Median_of_sorted_array {

	public static void main(String[] args) {
		int[] nums1= {1,2};
		int [] nums2= {3,4};
		int i=0,j=0;
		
       int[] arr=new int[nums1.length+nums2.length] ;
       int k=0;
       while(i<nums1.length && j<nums2.length)
       {
            if(nums1[i]<nums2[j])
            {
                arr[k]=nums1[i];
                i++;
                k++;
            }
            else
            {
                arr[k]=nums2[j];
                j++;
                k++;
            }
        
       }
     while(i<nums1.length)
     {
    	 arr[k]=nums1[i];
    	k++; 
    	i++;
     }
     while(j<nums2.length)
     {
    	 arr[k]=nums2[j];
    	 k++;
    	 j++;
    	
     }
   System.out.print(Arrays.toString(arr));
  int n=arr.length;
  float median;
  if(n%2==0)
  { 
	median=(arr[n/2]+arr[n/2-1])/2; 
  }
  else
  {
	   median=arr[n/2];
	 
  }
  System.out.print(median);
	}

}
