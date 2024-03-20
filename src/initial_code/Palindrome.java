package initial_code;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		int rem,div;
		int result=0;
		int temp=num;
		while(num>0)
		{
			rem=num%10;
			result=(result*10)+rem;
			num=num/10;
		}
		if(temp==result)
		{
			System.out.println("palindrome");
		}
		else
		{
			System.out.println(" not palindrome");
		}
		
	}

	

}
