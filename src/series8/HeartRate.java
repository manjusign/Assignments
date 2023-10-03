package series8;

import java.util.Scanner;

public class HeartRate {
	public static void main(String[] args)
	{
		int heart_beat_rate;
		
		Scanner sc = new Scanner(System.in);
		
		heart_beat_rate = sc.nextInt();
		
		if(heart_beat_rate < 30 || heart_beat_rate > 120)
		{
			System.out.println("Heart rate is abnormal");
		}
		else
		{
			System.out.println("Heart rate is normal");
		}
		System.out.println("Heart rate checked");
	}
}
