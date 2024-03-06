package initial_code;

public class ArrayAddition {

	public static void main(String[] args) {
		int[] a= {2,4,3,5,6,7};
		 int add=10;
		 for(int i=0;i<a.length;i++)
		 {
			 for(int j=i+1;j<a.length;j++)
			 {
				 if(a[i]+a[j]==10)
				 {
					 System.out.println("The first value  is:  "+a[i] +" "+ "The second number is "+" " +a[j]);
				 }
			 }
		 }
		
	}

}
