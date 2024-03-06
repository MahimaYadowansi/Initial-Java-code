package initial_code;

public class ReverseArray2 {

	public static void main(String[] args) {
		int[] a= {3,7,4,5,3,9};
		int l=a.length;
		int n=Math.floorDiv(l, 2); //(3+7+4+5+3+9)/2
		int temp;
		for(int i=0;i<n;i++)
		{
			temp = a[i];
			a[i]=a[l-1-i];
			a[l-1-i]=temp;
		}
	for(int element:a)
	{
		System.out.print(element+" ");
	}
		
	}

}
