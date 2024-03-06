package initial_code;

public class Inheritance {
	public  class Base
	{
		public void sum()
		{
			int a=10;
			int b=3;
			System.out.println((a+b));
			
		}
	}
public class Child extends Base
{
	public void sub()
	{
		int c=10;
		int d=3;
		System.out.println((c-d));
	}
}
	public static void main(String[] args) {
		Inheritance inheritance=new Inheritance();
		
		Child z=inheritance.new Child();
		z.sum();
		z.sub();

	}

}
