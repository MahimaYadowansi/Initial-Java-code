package initial_code;

public class Capitalize_each_char {

	public static void main(String[] args) {
		String str="this is javatpoint";
		String words[]=str.split("\\s");
		String capital="";
		for(String w: words)
		{
			String first=w.substring(0,1);
			String afterfirst=w.substring(1);
			capital+=first.toUpperCase()+afterfirst+" ";
		}
		System.out.println(capital);
	}

}
