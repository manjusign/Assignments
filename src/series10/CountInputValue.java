package series10;

import java.util.Scanner;

public class CountInputValue {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of n");
		int n;
		n = sc.nextInt();
		int count = 0;
		int[] array = new int[n];
		System.out.println("Enter the array elements : ");
		for(int i =0; i <n; i++)
		{
			array[i] = sc.nextInt();
			//inputValue = sc.nextInt();
		}	
		System.out.println("Enter the input value : ");
		int inputValue = sc.nextInt();
		for( int i =0; i < n; i++)
		{
			//inputValue = sc.nextInt();
			if(inputValue  == array[i])
			{
				count++;
			}
		}
		System.out.print("The count of input value is : " + count);
	}
}
