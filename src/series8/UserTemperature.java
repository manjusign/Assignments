package series8;

import java.util.Scanner;

public class UserTemperature {
	public static void main(String[] args)
	{
		int user_temperature;
		
		Scanner sc = new Scanner(System.in);
		
		user_temperature = sc.nextInt();
		
		if(user_temperature >= 40 && user_temperature < 80)
		{
			System.out.println("Temperature is normal");
		}
		else
		{
			System.out.println("Abnormal temperature");
		}
	}

}
