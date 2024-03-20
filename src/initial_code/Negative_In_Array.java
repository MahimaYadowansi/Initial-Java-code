package initial_code;

public class Negative_In_Array {

	public static void main(String[] args) {
		int [][] grid= {{4,3,2,-1},{3,2,1,-1},{-1,1,-1,-2},{-1,-1,-2,-3}};
		int count=0;
		for(int i=0;i<grid.length;i++)
		{
			for(int j=0;j<grid.length;j++)
			{
				if(grid[i][j]<0)
				{
					count++;
				}
			}
		}
		System.out.println(count);

	}

}
