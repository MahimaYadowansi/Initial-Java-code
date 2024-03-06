package initial_code;
import java.util.*;
public class SquareMethod {
	int side=4;
public void area()
{
	 int area=side*side;
	 System.out.println("The area is"+area);
}
public void perimeter()
{
 int perimeter=4*side;
	 System.out.println("The perimeter is"+ perimeter);
}
	public static void main(String[] args) {
		
	//Scanner sc=new Scanner(System.in);
	//System.out.println("Enter the value of side");
		//int side=sc.nextInt();	
		 SquareMethod square=new SquareMethod();
		
		square.area();
		square.perimeter();
	}

}
