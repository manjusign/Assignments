package series10;

import java.util.Scanner;

public class EvenNumbers {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of n");
		int n;
		n = sc.nextInt();
		int count = 0;
		int[] array = new int[n];
		System.out.println("Enter the array elemrnts : ");
		for(int i =0; i <n; i++)
		{
			array[i] = sc.nextInt();
		}	
		for( int i =0; i < n; i++)
		{
			if((array[i]%2) == 0 )
			{
				count++;
			}
		}
		System.out.print("Number of even numbers in array is : " + count);
	}
}
