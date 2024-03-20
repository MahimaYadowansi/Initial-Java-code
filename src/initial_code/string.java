package initial_code;

public class string {

	public static void main(String[] args) {
	String name ="Mahima";
	int a=name.length();
	System.out.println(a);
	String up=name.toUpperCase();
	System.out.println(up);
	String low=name.toLowerCase();
	System.out.println(low);
	String sentance="  My  name  is  mahima  ";
	System.out.println(sentance);
	String sen=sentance.trim(); //remove leading and trailing whitespaces from a string. 
	System.out.println(sen);
    System.out.println(name.substring(1));
    System.out.println(name.substring(1,4));
    System.out.println(name.replace('h','k'));
	}

}
