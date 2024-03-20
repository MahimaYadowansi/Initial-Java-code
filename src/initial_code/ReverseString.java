package initial_code;

public class ReverseString {

	public static void main(String[] args) {
		String s="mahima";
		StringBuilder sb=new StringBuilder(s);
		sb.reverse();
		System.out.println(sb.toString());
		
		
		
		//Method 2
		char ch[]=s.toCharArray();
		String rev="";
		for(int i=ch.length-1;i>=0;i--)
		{
			rev+=ch[i];
		}
		System.out.println(rev);
	}

	

}
