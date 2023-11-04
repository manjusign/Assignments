package series8;

import java.util.Scanner;

public class PersonHeight {
	public static void main(String[] args)
	{
		int height_input;
		
		Scanner sc = new Scanner(System.in);
		
		height_input = sc.nextInt();
		
		if(height_input >= 200)
		{
			System.out.println("The person is very tall");
		}
		else if(height_input >= 180)
		{
			System.out.println("The person is tall");
		}
		
		else if(height_input >= 165)
		{
			System.out.println("The person has average height");
		}
		else
		{
			System.out.println("The person will be considered short");
		}
				
	}
	

}
