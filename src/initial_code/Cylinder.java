package initial_code;

public class Cylinder {
	private int radius;
	private int height;
public void setRadius(int radius)
{
	this.radius=radius;
}
public  int getRadius()
{
	return this.radius;
}
public void setHeight(int height)
{
	this.height=height;
}
public  int getHeight()
{
	return this.height;
}
public Cylinder(int radius,int height)
{
	this.radius=radius;
	this.height=height;
}

	public static void main(String[] args) {
		Cylinder c=new Cylinder(16, 13);
	//	c.setRadius(8);
		//c.setHeight(12);
System.out.println(c.getRadius());
System.out.println(c.getHeight());
	}


}