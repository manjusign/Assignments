package series11;

import java.util.Scanner;

public class CopyArray {
	public static void main(String[] args)
	{
		int[] originalArray = new int[5];
		int[] copyArray = new int[5];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array elements : ");
		for(int i = 0; i < 5; i++)
		{
			originalArray[i] = sc.nextInt();
			
		}
		for(int i = 0; i < 5; i++)
		{
			copyArray[i] = originalArray[i];
			System.out.println(copyArray[i]);
		}
	}

}
