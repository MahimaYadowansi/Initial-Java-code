package initial_code;

public class Overriding {
public void color()
{
	
	String color="black";
	System.out.println(color);
}

public class Overriding1 extends Overriding
{
	public void color()
	{
		String color="white";
		System.out.println(color);
	}
}
	public static void main(String[] args) {
		Overriding  o =new Overriding ();
		Overriding1 o1=o.new Overriding1();
		o1.color();
	}

}
