package initial_code;
class YoungeAgeException extends RuntimeException
{
	public  YoungeAgeException(String msg)
	{
		super(msg);
	}
}

public class Exception_throw {

	public static void main(String[] args) {
		int age =14;
		try
		{
		if(age<18)
		{
			throw new YoungeAgeException("you are not eligible");
		}
		}
		catch(Exception e)
		{
		System.out.println("age can't below 18");	
		}
		
			System.out.println("you can vote");
		
	
	}

}
