package series10;

import java.util.Scanner;

public class NumberOfZeros {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of n : ");
		int n;
		n = sc.nextInt();
		int count = 0;
		int[] array = new int[n];
		System.out.println("Enter the array elements : ");
		for(int i =0; i <n; i++)
		{
			array[i] = sc.nextInt();
		}	
		for( int i =0; i < n; i++)
		{
			if(array[i] == 0)
			{
				count++;
			}
		}
		System.out.print("Numbers of Zeros : " + count);
	}
}
