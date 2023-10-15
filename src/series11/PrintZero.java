package series11;

import java.util.Scanner;

public class PrintZero {
	public static void main(String[] args)
	{
		int[] array1 = new int[5];
		int[] array2 = new int[5];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array elements : ");
		for(int i = 0; i < 5; i++)
		{
			array1[i] = sc.nextInt();
			
		}
		for(int i = 0; i < 5; i++)
		{
		    if(array1[i] < 0)
			{
				array1[i] = 0;
				System.out.print(array1[i] + " ");
			}
		    else
		    {
		    	System.out.print(array1[i] + " " );
		    }
		}
	}
}
