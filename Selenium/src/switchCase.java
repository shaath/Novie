import java.util.Scanner;


public class switchCase {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter course value");
		String course=sc.next();
		
		switch (course) 
		{
		case "selenium":
			System.out.println("you are selected selenium");
			break;
		case "UFT":
			System.out.println("You are selenium UFT");
			break;
		case "Manual":
			System.out.println("You are selected Manual");
			break;
		default:
			System.out.println("Select a proper option");
			break;
		}

	}

}
