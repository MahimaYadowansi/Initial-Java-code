package initial_code;

import java.util.Scanner;

public class Switch_Week {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value");
		int a=sc.nextInt();
		switch(a)
		{
		case 1:
			System.out.println("Sunday");
			break;
		case 2:
			System.out.println("Monday");
			break;
		case 3:
			System.out.println("tuesday");
			break;
		case 4:
			System.out.println("wednesday");
			break;
		case 5:
			System.out.println("Thursday");
			break;
		case 6:
			System.out.println("friday");
			break;
		case 7:
			System.out.println("Saturday");
			default:
				System.out.println("Wrong choice");
			
		}

	}

}
