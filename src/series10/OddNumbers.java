package series10;

import java.util.Scanner;

public class OddNumbers {
	public static void main(String[] args)
	{
		int n;
		int count = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of array : ");
		n = sc.nextInt();
		int[] array = new int[n];
		System.out.println("Enter the array elements : ");
		for (int i =0; i < n; i++) 
		{
		array[i] = sc.nextInt(); 
		}
		for(int i = 0; i < n; i++)
		{
			if((array[i]%2) == 1)
				count++;
		}
		System.out.print("The number odd numbers in an array is : " + count);
	}

}
