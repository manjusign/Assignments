package series10;

import java.util.Scanner;

public class AverageOfNumbers {
	public static void main(String[] args)
	{
		int n;
		int sum = 0;
		int average;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of array : ");
		n = sc.nextInt();
		int[] array = new int[n];
		System.out.println("Enter the array elements");
		for(int i = 0; i< n; i++)
		{
			array[i] = sc.nextInt();
		}
		for(int i = 0; i< n; i++)
		{
			sum = sum+array[i];
		}
		average = (sum/n);
		System.out.println("The sum of all  numbers: " + sum);
		System.out.println("The average of numbers are : " + average);
	}

}
