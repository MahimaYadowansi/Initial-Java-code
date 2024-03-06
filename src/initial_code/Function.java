package initial_code;

public class Function {
	//multiplication of numbers
	public void multiplication(int n) 
	{
		for(int i=1;i<=10;i++)
		{
		System.out.println((n*i));
		}
			
	}
	//star pattern
	public void UpPattern(int n)
	{
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("*" +"");
			}
			System.out.println();
		}
	}
	//down star pattern
    public void DownPattern()
    {
    	for(int i=5;i>=1;i--)
    	{
    		for(int j=1;j<=i;j++)
    		{
    			System.out.print("*");	
    		}
    		System.out.println();
    	}
    }
    //fibonacci series
    public void fibonacci()
    {
    	int m1=0, m2=1,m3;
    	System.out.print(m1+" ");
    	System.out.print(m2+" ");
    	
    	for(int i=0;i<=8;i++)
    	{
    		m3=m1+m2;
    		System.out.print(m3+" ");
    	m1=m2;
    	m2=m3;
    	}
    }
    
    
    //Greatest among three number
    public void greatest()
    {
    	int a=5,b=9;int c = 4;
    	if(a>b&&a>c)
    	{
    		System.out.println("The greatest value is:"+a);
    	}
    	else if(b>a&&b>c)
    	{
    		System.out.println("The greatest is :"+b);
    	}
    	else
    	{
    		System.out.println("The greatest is :"+c);
    	}
    	if(a<b&&a<c)
    	{
    		System.out.println("The smallest value is:"+a);
    	}
    	else if(b<a&&b<c)
    	{
    		System.out.println("The smallest is :"+b);
    	}
    	else
    	{
    		System.out.println("The smallest is :"+c);
    	}
    }
    
	public static void main(String[] args) {
	Function f=new Function();
	//f.multiplication(2);
	//f.UpPattern(4);
	//f.DownPattern();
	//f.fibonacci();
	f.greatest();
	}

}
