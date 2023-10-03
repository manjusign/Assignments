package series9;

import java.util.Scanner;

public class Voidfunction {
	private static void printText(String text)
	{
		System.out.println(text);
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the text :");
		String text1 = sc.next();
		printText(text1);
		
	}

}
