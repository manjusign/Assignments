package series9;

import java.util.Scanner;

public class HeartRate {
	private static int heartRateTest(int heart_rate)
	{
		if(heart_rate < 30 || heart_rate > 120)
		{
			System.out.println("Abnormal heart rate");
		}
		else
		{
			System.out.println("Normal heart rate");
		}
		return heart_rate;
		
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the heart rate: ");
		int input_heart_rate = sc.nextInt();
		heartRateTest(input_heart_rate);
		}

}
