package initial_code;

public class Palindrome_String {

	public static void main(String[] args) {
	String name="aabcbaa";
		name=name.toLowerCase();
		int i=0, j=name.length()-1;
		if(name.charAt(i)==name.charAt(j))
		{
			i++;
			j--;
			
			System.out.println("Palindrome string");
		}
		if(name.charAt(i)!=name.charAt(j))
		{
			System.out.println("not palindrome string");
		}
	}

}
