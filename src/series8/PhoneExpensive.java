package series8;

import java.util.Scanner;

public class PhoneExpensive {
	public static void main(String[] args) 
	{
		int phone_price_input;
		
		Scanner sc = new Scanner(System.in);
		
		phone_price_input = sc.nextInt();
		
		boolean isPhoneExpensive = phone_price_input >= 80000;
		
		if(isPhoneExpensive)
		{
			System.out.println("phone is too expensive");
		}
		else
		{
			System.out.println("phone is affordable");
		}
	}
}
