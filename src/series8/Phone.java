package series8;

import java.util.Scanner;

public class Phone {
	public static void main(String[] args) 
	{
		int phone_price_input;
		
		Scanner sc = new Scanner(System.in);
		
		phone_price_input = sc.nextInt();
		
		if(phone_price_input >= 80000)
		{
			System.out.println("phone is expensive");
		}
		else
		{
			System.out.println("phone is affordable");
		}
	}
	
}
