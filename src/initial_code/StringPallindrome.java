package initial_code;

public class StringPallindrome {

	public static void main(String[] args) {
		String s="nitin";
		StringBuilder sb=new StringBuilder(s);
		sb.reverse();
	String rev=sb.toString();
	if(s.equals(rev))
	{
		System.out.println("Pallindrome");
	}
	else
	{
		System.out.println("Not pallindrome");
	}
	
	  
	
	}

}
