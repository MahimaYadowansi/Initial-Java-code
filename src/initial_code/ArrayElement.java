package initial_code;

public class ArrayElement {

	String name;
	public ArrayElement(String name) {
		this.name="name";
	}
	 public void setName(String name)
	{
		 this.name="name";
	}
	public String getName()
	{
		return this.name;
	} 

	public static void main(String[] args) {
		ArrayElement[] a=new ArrayElement[5];
		a[0]=new ArrayElement("maths");
		a[1]=new ArrayElement("eng");
		a[2]=new ArrayElement("bio");
		a[3]=new ArrayElement("phy");
		a[4]=new ArrayElement("chem");
		boolean bookFound=false;
		for(int i=0;i<5;i++)
		{
			
			if(a[i].getName()=="eng")
			{
				bookFound=true;
				
				
				break;
			}
			
		}
		if(bookFound==true)
		{
			System.out.println("Book is present");
		}
		else
		{
			System.out.println("Book is not present");
		}
	}

}
