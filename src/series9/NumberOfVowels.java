package series9;

import java.util.Scanner;

public class NumberOfVowels {
	private static String vowels(String text)
	{
		int count = 0;
		for(int i = 0; i < text.length(); i++)
		{
			char ch = text.charAt(i);
			if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
			{
				count++;
			}
		}
		System.out.println("nNumber of vowels : " + count);
		return text;
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the text :");
		String textInput = sc.next();
		vowels(textInput);
	}
}
