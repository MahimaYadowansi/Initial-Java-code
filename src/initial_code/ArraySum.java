package initial_code;

public class ArraySum {

	public static void main(String[] args) {
		float[] marks= {23.6f,1.5f,6.3f,32.5f};
		float sum=0, avg = 0;
		for(int i=0;i<marks.length;i++)
		{
			sum=sum+i;
			// avg=sum/marks.length;
		}
		System.out.println(sum);
		
		//System.out.println(avg);
	}

}
