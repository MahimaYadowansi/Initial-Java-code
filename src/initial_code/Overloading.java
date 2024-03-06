package initial_code;

public class Overloading {
public void test()
{
	System.out.println("This is the real method");
}
public void test(int a)
{
	System.out.println("This is method overloading"+a);
}
public void test(int c,int d)
{
	
	System.out.println("Sum is:"+" "+(c+d));
}
	public static void main(String[] args) {
		Overloading x=new Overloading();
		x.test();
		x.test(10);
		x.test(3,7);
	}

}
