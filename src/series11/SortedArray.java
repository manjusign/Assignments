package series11;

import java.util.Scanner;

public class SortedArray {
	static boolean isAscending(int[] array1)
	{
		int i;
		for(i = 0; i <array1.length - 1; i++)
		{
			if(array1[i] > array1[i+1])
				break;
		}
		return (i == (array1.length-1));
	}
	static boolean isDescending(int[] array2)
	{
		int i;
		for( i = 0; i < array2.length -1; i++)
		{
			if(array2[i] < array2[i+1])
				break;
		}
		return (i == (array2.length-1));
	}
	public static void main(String[] args)
	{
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array : ");
		n = sc.nextInt();
		System.out.println("Enter the array elements");
		int[] originalArray = new int[n];
		for(int i = 0; i < n; i++)
		{
			originalArray[i] = sc.nextInt();
		}
		boolean isArrayAscending = isAscending(originalArray);
		boolean isArrayDescending = isDescending(originalArray);
		if(isArrayAscending)
		{
			System.out.println("Array is in ascending order");
		}
		else 
		if(isArrayDescending)
		{
			System.out.println("Array is in descending order");
		}
		else
		{
			System.out.println("Array is neither in ascending nor descending order");
		}
		
	}

}
