package initial_code;
import java.util.*;
public class MultipicationTable {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        System.out.print("Enter the value");
        int n=sc.nextInt();
        int sum=0,multi;
        // multiplication nd sum of multiplication
        for(int i=1;i<=10;i++)
        {
        	multi=n*i;
        	System.out.println(multi);
        	sum=sum+multi;
        }
        System.out.println("THE SUM OF MULTIPLICATION");
        System.out.println(sum);
        
     //Multiplication in reverse order
		/*for(int i=10;i>=1;i--)
        {
        	System.out.println(n*i);
        }*/
	}

}
