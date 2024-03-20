package initial_code;

import java.util.Scanner;

public class ReverseInteger {

	public static void main(String[] args) {
		int rem,num,sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		num=sc.nextInt();
		while(num<0)
		{
			rem=num%10;
			sum=(sum*10)+rem;
			num=num/10;
		}
		System.out.println(sum);
				

	}

}
