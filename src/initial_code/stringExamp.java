package initial_code;

public class stringExamp {

	public static void main(String[] args) {
		// NUMBER1 To convert lower case
		String name="MAHIMA";
		System.out.println(name.toLowerCase());
		// NUMBER 2 replace space with underscore
		String name1="  mahima  ";
		System.out.println(name1.replace(" ", "_"));
		//NUMBER 3 
		String name2="Dear <|name|>, Thanks a lot!";
		System.out.println(name2.replace("<|name|>"," ruby"));
		//NUMBER 4 TO detect double and triple space in a string
		String name3= "This string contain double  and triple    space";
		System.out.println(name3.indexOf("  "));
		System.out.println(name.indexOf("    "));
		System.out.println(name3);
		
	}

}
