package initial_code;

import java.util.Scanner;

public class Switch_Arithmetic {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter 1st value");
		int a=sc.nextInt();
		System.out.println("Enter 2nd value");
		int b=sc.nextInt();
		System.out.println("Enter your choice(1-6)");
		int choice=sc.nextInt();
		switch(choice)
		{
		case 1:
			System.out.println(a+b);
			break;
		case 2:
			System.out.println(a+b+2);
			break;
		case 3:
			System.out.println(a-b);
			break;
		case 4:
			System.out.println(a*b);
			break;
		case 5:
			System.out.println(a/b);
			break;
		case 6:
			System.out.println(a%b);
			default:
				System.out.println("Wrong choice");
				
		}
		
		
	}

}
