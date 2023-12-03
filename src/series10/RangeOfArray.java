package series10;

import java.util.Scanner;

public class RangeOfArray {
	public static void main(String[] args)
	{
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of array : ");
		n = sc.nextInt();
		int[] array = new int[n];
		System.out.println("Enter the array elements : ");
		for(int i =0; i < n; i++)
		{
			array[i] = sc.nextInt();
		}
		int minimum = array[0];
		int maximum = array[0];
		for(int i =0; i < n; i++)
		{
			if(minimum > array[i])
			{
				minimum = array[i] ;
			}
			if(maximum < array[i])
			{
				maximum = array[i];
			}
		}                            
		System.out.println("minimum value : " + minimum);
		System.out.println("maximum value : " + maximum);
		int range = maximum - minimum;
		System.out.println(range);
	}
}
