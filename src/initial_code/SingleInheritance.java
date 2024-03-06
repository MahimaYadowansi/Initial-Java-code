package initial_code;

public class SingleInheritance {
 public class Animal
{
	public void eat()
	{
		System.out.println("Dog eat");
	}
	public void dance()
	{
		System.out.println("Dog can not dance");
	}
	
}
public class Dog extends Animal
{
	public void bark()
	{
		System.out.println("Dog barks");
	}
}
class Cat extends Animal
{
	public void jump()
	{
		System.out.println("Cat can jump");
	}
}
	public static void main(String[] args) {
		SingleInheritance abc=new SingleInheritance();
		Dog d=abc.new Dog();
		
		d.eat();
	    d.dance();
	    d.bark();
	    Cat c=abc.new Cat();
		c.eat();
		c.jump();
		
	}

}
