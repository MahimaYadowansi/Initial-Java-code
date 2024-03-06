package initial_code;

public class ExceptionHandling {

	public static void main(String[] args) {
		int a=100,b=0,c;
		try
		{
			c=a/b;
			System.out.println("The value is"+c);		
			}
		catch(Exception e)
		{
		System.out.println("Can't divide by zero");	
		}
		finally
		{
			System.out.println("Any how run finally block");
		}
	}

}
