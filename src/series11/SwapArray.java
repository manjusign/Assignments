package series11;

import java.util.Scanner;

public class SwapArray {
 public static void main(String[] args)
 {
	 Scanner sc = new Scanner(System.in);
	 System.out.println("Enter the array size");
	 int n =sc.nextInt();
	 int[] array = new int[n];
	 System.out.println("Enter the array elements");
	 for(int i = 0; i < n; i++)
	 {
		 array[i] = sc.nextInt();
	 }
	 for(int i = 0; i < n; i++)
	 {
	 int temp = 0;
	 temp = array[0];
	 array[0] = array[n-1];
	 array[n-1] = temp;
	 System.out.print(array[i] + " ");
	 }
	 System.out.println();
	 System.out.print(array[0] + ","+ array[n-1]);
	 
 }
}
