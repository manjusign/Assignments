package series8;

import java.util.Scanner;

public class Salary {
	public static void main(String[] args)
	{
		int salary_input;
		
		Scanner sc = new Scanner(System.in);
		
		salary_input = sc.nextInt();
		
		int new_salary = salary_input + 1000;
		
		if(new_salary >= 5000)
		{
			System.out.println("Congratulations! You've received a significant salary increase.");
		}
		else
		{
			System.out.println("Your salary has been adjusted. Keep up the good work!");
		}	
	}

}
