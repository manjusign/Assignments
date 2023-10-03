package series8;

import java.util.Scanner;

public class Income {
	public static void main(String[] args)
	{
		int income_input;
		
		Scanner sc = new Scanner(System.in);
		
		income_input = sc.nextInt();
		
		if(income_input >= 100000)
		{	
			System.out.println("You have a high income. Congrajulations!");
		}
		else if(income_input >= 50000)
		{
			System.out.println("You have a moderate income");
		}
		else if(income_input >= 25000)
		{
			System.out.println("Your income is on the lower side");
		}
		else
		{
			System.out.println("Your income is below avearage. Consider exlopring oppurtunities for growth");
		}
	}
}
