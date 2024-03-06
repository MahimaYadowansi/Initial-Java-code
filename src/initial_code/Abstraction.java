package initial_code;

public class Abstraction {
public abstract class Vehicle
{
	public abstract void start();
	public void run()
	{
		System.out.println("Vehicle run fast");
	}
}
public class Car extends Vehicle
{
	public void start()
	{
		System.out.println("This is a car");
	}
}
public class Scooter extends Vehicle
{
	public void start()
	{
		System.out.println("This is a scooter");
	}
}
	public static void main(String[] args) {
		Abstraction ab=new Abstraction();
     Scooter s=ab.new Scooter();
     Car c=ab.new Car() ;
     c.run();
     s.start();

	}

}
