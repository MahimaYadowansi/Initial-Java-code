package initial_code;

public class Reverse_Each_Word {

	public static void main(String[] args) {
		String str="this is javatpoint";
		String words[]=str.split("\\s");  
		String rev="";
		for(String w:words)
		{
			StringBuilder sb=new StringBuilder(w);
			
			sb.reverse();
			rev+=sb.toString()+" ";
			
		}
		System.out.println(rev);
	}

}
