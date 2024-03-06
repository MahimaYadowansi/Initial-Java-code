package initial_code;

public class ConstructorInheritance {
class Base1{
	Base1()
	{
		System.out.println("I am a constructor");
	}
	public int x;
	public void setX(int x)
	{
		this. x=x;
	}
	public int getX()
	{
		return this.x;
	}
}
class Derived extends Base1
{
	 Derived()
	 {
		 System.out.println("I am a  Derived class constructor"); 
	 }
	 public int y;
	public void setY(int y)
	{
		this.y=y;
	}
	public int getY()
	{
		return this.y;
	}
}
	public static void main(String[] args) {
		ConstructorInheritance abc=new ConstructorInheritance();
		Derived d=abc.new Derived();
		d.setX(10);
		d.setY(20);
		System.out.println(d.getX());
		System.out.println(d.getY());
	}

}
