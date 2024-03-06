package initial_code;

public class Cellphone {
	public void ring()
	{
		System.out.println("Someone is calling");
	}
	public void vibrate()
	{
		System.out.println("Someone is messiging");
	}
	public static void main(String[] args) {
		Cellphone c=new Cellphone();
		c.ring();
		c.vibrate();
		
	}

}
