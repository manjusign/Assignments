package series11;

import java.util.Scanner;

public class AscendingOrder {
	static boolean isArrayAscending(int[] array) 
	{
		int i;
		for(i =0; i < array.length - 1; i++)
		{
			if(array[i] > array[i+1])
			{
				break;
			}
		}
		return (i==(array.length-1));
	}
	public static void main(String[] args)
	{
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array : ");
		n = sc.nextInt();
		int[] originalArray = new int[n];
		System.out.println("Enter the array elements : ");
		for(int i = 0; i < n; i++)
		{
			originalArray[i] = sc.nextInt();
		}
		boolean result =isArrayAscending(originalArray);
		if(result)
		{
			System.out.println("The array is in ascending order");
		}
		else
		{
			System.out.println("The array is not in ascending order");
		}
		
	}
}
