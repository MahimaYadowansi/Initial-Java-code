package initial_code;

public class MatrixAdditio {

	public static void main(String[] args) {
		int[][] a={{1,2,4},{2,6,4}};
	int[][] b= {{2,4,2},{3,5,1}}; 
	int[][] c= {{0,0,0},{0,0,0}};
	for(int i=0;i<a.length;i++)    //takes row
	{
		for(int j=0;j<a[i].length;j++)  //takes column
		{
		c[i][j]=a[i][j]+b[i][j];
		System.out.print(c[i][j]);
		System.out.print(" ");
		}
		System.out.println(" ");
	}
	
	
	}
}
