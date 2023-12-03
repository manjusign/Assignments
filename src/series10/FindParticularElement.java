package series10;

import java.util.Scanner;

public class FindParticularElement {
	static String isParticularNumberPresnt(int[] number) 
	{
	
	for(int i = 0; i < number.length; i++)
	{
		if(number[i] == 10)
		{
			System.out.println("10 is present at the index : " + i);
		}
		else
		{
			System.out.println("10 is not present");
		}
	}
		return number.toString();
	}
	public static void main(String[] args)
	{
		int n;
		int sum = 0;
		int average;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of array : ");
		n = sc.nextInt();
		int[] array = new int[n];
		int i;
		System.out.println("Enter the array elements");
		for( i = 0; i< n; i++)
		{
			array[i] = sc.nextInt();
		}
		//boolean is10Present = true;
		isParticularNumberPresnt(array);
		
	}
}
